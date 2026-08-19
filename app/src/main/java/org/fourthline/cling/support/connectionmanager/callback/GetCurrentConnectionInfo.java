package org.fourthline.cling.support.connectionmanager.callback;

import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.model.ServiceReference;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.support.model.ConnectionInfo;
import org.fourthline.cling.support.model.ProtocolInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GetCurrentConnectionInfo extends ActionCallback {
    public GetCurrentConnectionInfo(Service service, int i) {
        this(service, null, i);
    }

    public abstract void received(ActionInvocation actionInvocation, ConnectionInfo connectionInfo);

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public void success(ActionInvocation actionInvocation) {
        try {
            received(actionInvocation, new ConnectionInfo(((Integer) actionInvocation.getInput("ConnectionID").getValue()).intValue(), ((Integer) actionInvocation.getOutput("RcsID").getValue()).intValue(), ((Integer) actionInvocation.getOutput("AVTransportID").getValue()).intValue(), new ProtocolInfo(actionInvocation.getOutput("ProtocolInfo").toString()), new ServiceReference(actionInvocation.getOutput("PeerConnectionManager").toString()), ((Integer) actionInvocation.getOutput("PeerConnectionID").getValue()).intValue(), ConnectionInfo.Direction.valueOf(actionInvocation.getOutput("Direction").toString()), ConnectionInfo.Status.valueOf(actionInvocation.getOutput("Status").toString())));
        } catch (Exception e) {
            actionInvocation.setFailure(new ActionException(ErrorCode.ACTION_FAILED, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Can't parse ConnectionInfo response: ", e), e));
            failure(actionInvocation, null);
        }
    }

    public GetCurrentConnectionInfo(Service service, ControlPoint controlPoint, int i) {
        super(new ActionInvocation(service.getAction("GetCurrentConnectionInfo")), controlPoint);
        getActionInvocation().setInput("ConnectionID", Integer.valueOf(i));
    }
}
