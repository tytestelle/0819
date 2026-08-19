package org.fourthline.cling.model.action;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import org.fourthline.cling.model.VariableValue;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.profile.RemoteClientInfo;
import org.fourthline.cling.model.state.StateVariableAccessor;
import org.fourthline.cling.model.types.ErrorCode;

/* JADX INFO: loaded from: classes2.dex */
public class MethodActionExecutor extends AbstractActionExecutor {
    private static Logger log = Logger.getLogger(MethodActionExecutor.class.getName());
    protected Method method;

    public MethodActionExecutor(Method method) {
        this.method = method;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0154  */
    public Object[] createInputArgumentValues(ActionInvocation<LocalService> actionInvocation, Method method) throws ActionException {
        LocalService localService = (LocalService) actionInvocation.getAction().getService();
        ArrayList arrayList = new ArrayList();
        ActionArgument[] inputArguments = actionInvocation.getAction().getInputArguments();
        int length = inputArguments.length;
        char c = 0;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            ActionArgument actionArgument = inputArguments[i];
            Class<?> cls = method.getParameterTypes()[i2];
            VariableValue input = actionInvocation.getInput(actionArgument);
            if (cls.isPrimitive() && (input == null || input.toString().length() == 0)) {
                throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Primitive action method argument '" + actionArgument.getName() + "' requires input value, can't be null or empty string");
            }
            if (input == null) {
                arrayList.add(i2, null);
                i2++;
            } else {
                String string = input.toString();
                if (string.length() <= 0 || !localService.isStringConvertibleType((Class) cls) || cls.isEnum()) {
                    arrayList.add(i2, input.getValue());
                    i2++;
                } else {
                    try {
                        Class<?>[] clsArr = new Class[1];
                        clsArr[c] = String.class;
                        Constructor<?> constructor = cls.getConstructor(clsArr);
                        log.finer("Creating new input argument value instance with String.class constructor of type: " + cls);
                        Object[] objArr = {string};
                        int i3 = i2 + 1;
                        arrayList.add(i2, constructor.newInstance(objArr));
                        i2 = i3;
                    } catch (Exception e) {
                        log.warning("Error preparing action method call: " + method);
                        log.warning("Can't convert input argument string to desired type of '" + actionArgument.getName() + "': " + e);
                        throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Can't convert input argument string to desired type of '" + actionArgument.getName() + "': " + e);
                    }
                }
            }
            i++;
            c = 0;
        }
        if (method.getParameterTypes().length > 0 && RemoteClientInfo.class.isAssignableFrom(method.getParameterTypes()[method.getParameterTypes().length - 1])) {
            if (actionInvocation instanceof RemoteActionInvocation) {
                RemoteActionInvocation remoteActionInvocation = (RemoteActionInvocation) actionInvocation;
                if (remoteActionInvocation.getRemoteClientInfo() != null) {
                    log.finer("Providing remote client info as last action method input argument: " + method);
                    arrayList.add(i2, remoteActionInvocation.getRemoteClientInfo());
                } else {
                    arrayList.add(i2, null);
                }
            } else {
                arrayList.add(i2, null);
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ca  */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x00ca, please report this as an issue */
    @Override // org.fourthline.cling.model.action.AbstractActionExecutor
    public void execute(ActionInvocation<LocalService> actionInvocation, Object obj) throws Exception {
        Object objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
        boolean z;
        ActionArgument<LocalService>[] outputArguments;
        Object[] objArrCreateInputArgumentValues = createInputArgumentValues(actionInvocation, this.method);
        if (!actionInvocation.getAction().hasOutputArguments()) {
            log.fine("Calling local service method with no output arguments: " + this.method);
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(obj, this.method, objArrCreateInputArgumentValues);
            return;
        }
        boolean zEquals = this.method.getReturnType().equals(Void.TYPE);
        log.fine("Calling local service method with output arguments: " + this.method);
        if (!zEquals) {
            if (isUseOutputArgumentAccessors(actionInvocation)) {
                log.fine("Action method is not void, calling declared accessor(s) on returned instance to retrieve ouput argument(s)");
                objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = readOutputArgumentValues(actionInvocation.getAction(), O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(obj, this.method, objArrCreateInputArgumentValues));
            } else {
                log.fine("Action method is not void, using returned value as (single) output argument");
                objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(obj, this.method, objArrCreateInputArgumentValues);
                z = false;
            }
            outputArguments = actionInvocation.getAction().getOutputArguments();
            if (z || !(objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo instanceof Object[])) {
                if (outputArguments.length == 1) {
                    setOutputArgumentValue(actionInvocation, outputArguments[0], objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo);
                    return;
                }
                throw new ActionException(ErrorCode.ACTION_FAILED, "Method return does not match required number of output arguments: " + outputArguments.length);
            }
            Object[] objArr = (Object[]) objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
            log.fine("Accessors returned Object[], setting output argument values: " + objArr.length);
            for (int i = 0; i < outputArguments.length; i++) {
                setOutputArgumentValue(actionInvocation, outputArguments[i], objArr[i]);
            }
            return;
        }
        log.fine("Action method is void, calling declared accessors(s) on service instance to retrieve ouput argument(s)");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(obj, this.method, objArrCreateInputArgumentValues);
        objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = readOutputArgumentValues(actionInvocation.getAction(), obj);
        z = true;
        outputArguments = actionInvocation.getAction().getOutputArguments();
        if (z) {
        }
        if (outputArguments.length == 1) {
            setOutputArgumentValue(actionInvocation, outputArguments[0], objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo);
            return;
        }
        throw new ActionException(ErrorCode.ACTION_FAILED, "Method return does not match required number of output arguments: " + outputArguments.length);
    }

    public Method getMethod() {
        return this.method;
    }

    public boolean isUseOutputArgumentAccessors(ActionInvocation<LocalService> actionInvocation) {
        for (ActionArgument actionArgument : actionInvocation.getAction().getOutputArguments()) {
            if (getOutputArgumentAccessors().get(actionArgument) != null) {
                return true;
            }
        }
        return false;
    }

    public MethodActionExecutor(Map<ActionArgument<LocalService>, StateVariableAccessor> map, Method method) {
        super(map);
        this.method = method;
    }
}
