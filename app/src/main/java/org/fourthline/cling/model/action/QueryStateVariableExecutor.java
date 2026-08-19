package org.fourthline.cling.model.action;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.meta.QueryStateVariableAction;
import org.fourthline.cling.model.meta.StateVariable;
import org.fourthline.cling.model.state.StateVariableAccessor;
import org.fourthline.cling.model.types.ErrorCode;

/* JADX INFO: loaded from: classes2.dex */
public class QueryStateVariableExecutor extends AbstractActionExecutor {
    @Override // org.fourthline.cling.model.action.AbstractActionExecutor
    public void execute(ActionInvocation<LocalService> actionInvocation, Object obj) throws ActionException {
        if (!(actionInvocation.getAction() instanceof QueryStateVariableAction)) {
            throw new IllegalStateException("This class can only execute QueryStateVariableAction's, not: " + actionInvocation.getAction());
        }
        if (((LocalService) actionInvocation.getAction().getService()).isSupportsQueryStateVariables()) {
            executeQueryStateVariable(actionInvocation, obj);
        } else {
            actionInvocation.setFailure(new ActionException(ErrorCode.INVALID_ACTION, "This service does not support querying state variables"));
        }
    }

    public void executeQueryStateVariable(ActionInvocation<LocalService> actionInvocation, Object obj) throws ActionException {
        LocalService localService = (LocalService) actionInvocation.getAction().getService();
        String string = actionInvocation.getInput(QueryStateVariableAction.INPUT_ARG_VAR_NAME).toString();
        StateVariable<LocalService> stateVariable = localService.getStateVariable(string);
        if (stateVariable == null) {
            throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("No state variable found: ", string));
        }
        StateVariableAccessor accessor = localService.getAccessor(stateVariable.getName());
        if (accessor == null) {
            throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("No accessor for state variable, can't read state: ", string));
        }
        try {
            setOutputArgumentValue(actionInvocation, actionInvocation.getAction().getOutputArgument(QueryStateVariableAction.OUTPUT_ARG_RETURN), accessor.read(stateVariable, obj).toString());
        } catch (Exception e) {
            throw new ActionException(ErrorCode.ACTION_FAILED, e.getMessage());
        }
    }
}
