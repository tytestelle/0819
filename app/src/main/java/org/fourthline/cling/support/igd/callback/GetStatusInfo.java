package org.fourthline.cling.support.igd.callback;

import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;
import org.fourthline.cling.support.model.Connection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GetStatusInfo extends ActionCallback {
    public GetStatusInfo(Service service) {
        super(new ActionInvocation(service.getAction("GetStatusInfo")));
    }

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public void success(ActionInvocation actionInvocation) {
        try {
            success(new Connection.StatusInfo(Connection.Status.valueOf(actionInvocation.getOutput("NewConnectionStatus").getValue().toString()), (UnsignedIntegerFourBytes) actionInvocation.getOutput("NewUptime").getValue(), Connection.Error.valueOf(actionInvocation.getOutput("NewLastConnectionError").getValue().toString())));
        } catch (Exception e) {
            actionInvocation.setFailure(new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Invalid status or last error string: ", e), e));
            failure(actionInvocation, null);
        }
    }

    public abstract void success(Connection.StatusInfo statusInfo);
}
