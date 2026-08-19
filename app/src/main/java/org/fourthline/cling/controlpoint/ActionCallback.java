package org.fourthline.cling.controlpoint;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.control.IncomingActionResponseMessage;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.meta.RemoteService;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.protocol.sync.SendingAction;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ActionCallback implements Runnable {
    protected final ActionInvocation actionInvocation;
    protected ControlPoint controlPoint;

    public static final class Default extends ActionCallback {
        public Default(ActionInvocation actionInvocation, ControlPoint controlPoint) {
            super(actionInvocation, controlPoint);
        }

        @Override // org.fourthline.cling.controlpoint.ActionCallback
        public void failure(ActionInvocation actionInvocation, UpnpResponse upnpResponse, String str) {
        }

        @Override // org.fourthline.cling.controlpoint.ActionCallback
        public void success(ActionInvocation actionInvocation) {
        }
    }

    public ActionCallback(ActionInvocation actionInvocation, ControlPoint controlPoint) {
        this.actionInvocation = actionInvocation;
        this.controlPoint = controlPoint;
    }

    public String createDefaultFailureMessage(ActionInvocation actionInvocation, UpnpResponse upnpResponse) {
        ActionException failure = actionInvocation.getFailure();
        String str = "Error: ";
        if (failure != null) {
            str = "Error: " + failure.getMessage();
        }
        if (upnpResponse == null) {
            return str;
        }
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(str, " (HTTP response was: ");
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(upnpResponse.getResponseDetails());
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(")");
        return sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
    }

    public void failure(ActionInvocation actionInvocation, UpnpResponse upnpResponse) {
        failure(actionInvocation, upnpResponse, createDefaultFailureMessage(actionInvocation, upnpResponse));
    }

    public abstract void failure(ActionInvocation actionInvocation, UpnpResponse upnpResponse, String str);

    public ActionInvocation getActionInvocation() {
        return this.actionInvocation;
    }

    public synchronized ControlPoint getControlPoint() {
        return this.controlPoint;
    }

    @Override // java.lang.Runnable
    public void run() {
        Service service = this.actionInvocation.getAction().getService();
        if (service instanceof LocalService) {
            ((LocalService) service).getExecutor(this.actionInvocation.getAction()).execute(this.actionInvocation);
            if (this.actionInvocation.getFailure() != null) {
                failure(this.actionInvocation, null);
                return;
            } else {
                success(this.actionInvocation);
                return;
            }
        }
        if (service instanceof RemoteService) {
            if (getControlPoint() == null) {
                throw new IllegalStateException("Callback must be executed through ControlPoint");
            }
            RemoteService remoteService = (RemoteService) service;
            try {
                SendingAction sendingActionCreateSendingAction = getControlPoint().getProtocolFactory().createSendingAction(this.actionInvocation, remoteService.getDevice().normalizeURI(remoteService.getControlURI()));
                sendingActionCreateSendingAction.run();
                IncomingActionResponseMessage outputMessage = sendingActionCreateSendingAction.getOutputMessage();
                if (outputMessage == null) {
                    failure(this.actionInvocation, null);
                } else if (outputMessage.getOperation().isFailed()) {
                    failure(this.actionInvocation, outputMessage.getOperation());
                } else {
                    success(this.actionInvocation);
                }
            } catch (IllegalArgumentException unused) {
                failure(this.actionInvocation, null, "bad control URL: " + remoteService.getControlURI());
            }
        }
    }

    public synchronized ActionCallback setControlPoint(ControlPoint controlPoint) {
        this.controlPoint = controlPoint;
        return this;
    }

    public abstract void success(ActionInvocation actionInvocation);

    public String toString() {
        return "(ActionCallback) " + this.actionInvocation;
    }

    public ActionCallback(ActionInvocation actionInvocation) {
        this.actionInvocation = actionInvocation;
    }
}
