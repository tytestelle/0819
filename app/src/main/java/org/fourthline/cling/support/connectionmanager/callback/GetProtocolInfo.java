package org.fourthline.cling.support.connectionmanager.callback;

import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.model.action.ActionArgumentValue;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.support.model.ProtocolInfos;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GetProtocolInfo extends ActionCallback {
    public GetProtocolInfo(Service service) {
        this(service, null);
    }

    public abstract void received(ActionInvocation actionInvocation, ProtocolInfos protocolInfos, ProtocolInfos protocolInfos2);

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public void success(ActionInvocation actionInvocation) {
        try {
            ActionArgumentValue output = actionInvocation.getOutput("Sink");
            ActionArgumentValue output2 = actionInvocation.getOutput("Source");
            received(actionInvocation, output != null ? new ProtocolInfos(output.toString()) : null, output2 != null ? new ProtocolInfos(output2.toString()) : null);
        } catch (Exception e) {
            actionInvocation.setFailure(new ActionException(ErrorCode.ACTION_FAILED, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Can't parse ProtocolInfo response: ", e), e));
            failure(actionInvocation, null);
        }
    }

    public GetProtocolInfo(Service service, ControlPoint controlPoint) {
        super(new ActionInvocation(service.getAction("GetProtocolInfo")), controlPoint);
    }
}
