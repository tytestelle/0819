package org.fourthline.cling.support.messagebox;

import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.support.messagebox.model.Message;
import org.seamless.util.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AddMessage extends ActionCallback {
    protected final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO mimeType;

    public AddMessage(Service service, Message message) {
        super(new ActionInvocation(service.getAction("AddMessage")));
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("text/xml;charset=\"utf-8\"");
        this.mimeType = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        getActionInvocation().setInput("MessageID", Integer.toString(message.getId()));
        getActionInvocation().setInput("MessageType", o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.toString());
        getActionInvocation().setInput("Message", message.toString());
    }
}
