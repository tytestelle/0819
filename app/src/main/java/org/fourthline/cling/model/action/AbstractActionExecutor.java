package org.fourthline.cling.model.action;

import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.Command;
import org.fourthline.cling.model.ServiceManager;
import org.fourthline.cling.model.meta.Action;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.state.StateVariableAccessor;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractActionExecutor implements ActionExecutor {
    private static Logger log = Logger.getLogger(AbstractActionExecutor.class.getName());
    protected Map<ActionArgument<LocalService>, StateVariableAccessor> outputArgumentAccessors;

    public AbstractActionExecutor() {
        this.outputArgumentAccessors = new HashMap();
    }

    @Override // org.fourthline.cling.model.action.ActionExecutor
    public void execute(final ActionInvocation<LocalService> actionInvocation) {
        log.fine("Invoking on local service: " + actionInvocation);
        LocalService localService = (LocalService) actionInvocation.getAction().getService();
        try {
            if (localService.getManager() == null) {
                throw new IllegalStateException("Service has no implementation factory, can't get service instance");
            }
            localService.getManager().execute(new Command() { // from class: org.fourthline.cling.model.action.AbstractActionExecutor.1
                @Override // org.fourthline.cling.model.Command
                public void execute(ServiceManager serviceManager) {
                    AbstractActionExecutor.this.execute(actionInvocation, serviceManager.getImplementation());
                }

                public String toString() {
                    return "Action invocation: " + actionInvocation.getAction();
                }
            });
        } catch (InterruptedException e) {
            Logger logger = log;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                log.fine("InterruptedException thrown by service, wrapping in invocation and returning: " + e);
                log.log(level, "Exception root cause: ", O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(e));
            }
            actionInvocation.setFailure(new ActionCancelledException(e));
        } catch (ActionException e2) {
            Logger logger2 = log;
            Level level2 = Level.FINE;
            if (logger2.isLoggable(level2)) {
                log.fine("ActionException thrown by service, wrapping in invocation and returning: " + e2);
                log.log(level2, "Exception root cause: ", O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(e2));
            }
            actionInvocation.setFailure(e2);
        } catch (Throwable th) {
            Throwable thO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(th);
            Logger logger3 = log;
            Level level3 = Level.FINE;
            if (logger3.isLoggable(level3)) {
                log.fine("Execution has thrown, wrapping root cause in ActionException and returning: " + th);
                log.log(level3, "Exception root cause: ", thO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o);
            }
            actionInvocation.setFailure(new ActionException(ErrorCode.ACTION_FAILED, thO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.getMessage() != null ? thO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.getMessage() : thO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.toString(), thO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o));
        }
    }

    public abstract void execute(ActionInvocation<LocalService> actionInvocation, Object obj);

    public Map<ActionArgument<LocalService>, StateVariableAccessor> getOutputArgumentAccessors() {
        return this.outputArgumentAccessors;
    }

    public Object readOutputArgumentValues(Action<LocalService> action, Object obj) {
        int length = action.getOutputArguments().length;
        Object[] objArr = new Object[length];
        log.fine("Attempting to retrieve output argument values using accessor: " + length);
        Object[] outputArguments = action.getOutputArguments();
        int length2 = outputArguments.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            Object obj2 = outputArguments[i];
            log.finer("Calling acccessor method for: " + obj2);
            StateVariableAccessor stateVariableAccessor = getOutputArgumentAccessors().get(obj2);
            if (stateVariableAccessor == null) {
                throw new IllegalStateException("No accessor bound for: " + obj2);
            }
            log.fine("Calling accessor to read output argument value: " + stateVariableAccessor);
            objArr[i2] = stateVariableAccessor.read(obj);
            i++;
            i2++;
        }
        if (length == 1) {
            return objArr[0];
        }
        if (length > 0) {
            return objArr;
        }
        return null;
    }

    public void setOutputArgumentValue(ActionInvocation<LocalService> actionInvocation, ActionArgument<LocalService> actionArgument, Object obj) {
        LocalService localService = (LocalService) actionInvocation.getAction().getService();
        if (obj == null) {
            log.fine("Result of invocation is null, not setting any output argument value(s)");
            return;
        }
        try {
            if (localService.isStringConvertibleType(obj)) {
                log.fine("Result of invocation matches convertible type, setting toString() single output argument value");
                actionInvocation.setOutput(new ActionArgumentValue<>(actionArgument, obj.toString()));
            } else {
                log.fine("Result of invocation is Object, setting single output argument value");
                actionInvocation.setOutput(new ActionArgumentValue<>(actionArgument, obj));
            }
        } catch (InvalidValueException e) {
            throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Wrong type or invalid value for '" + actionArgument.getName() + "': " + e.getMessage(), e);
        }
    }

    public AbstractActionExecutor(Map<ActionArgument<LocalService>, StateVariableAccessor> map) {
        new HashMap();
        this.outputArgumentAccessors = map;
    }
}
