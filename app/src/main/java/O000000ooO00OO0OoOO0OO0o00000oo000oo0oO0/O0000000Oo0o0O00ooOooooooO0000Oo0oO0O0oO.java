package O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

import java.util.Map;
import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.meta.Action;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends ActionCallback {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f66O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final boolean f67O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, boolean z) {
        super(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getActionInvocation());
        this.f66O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.f67O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z;
    }

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public final void failure(ActionInvocation actionInvocation, UpnpResponse upnpResponse, String str) {
        Action action;
        if (this.f67O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OOoOOO00O00o0ooooooooO000ooooO0000.f93O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, ((actionInvocation == null || (action = actionInvocation.getAction()) == null) ? null : action.getName()) + " [failure] " + str);
        }
        this.f66O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.failure(actionInvocation, upnpResponse, str);
    }

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public final void success(ActionInvocation actionInvocation) {
        Map outputMap;
        Action action;
        if (this.f67O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            String string = null;
            String name = (actionInvocation == null || (action = actionInvocation.getAction()) == null) ? null : action.getName();
            if (actionInvocation != null && (outputMap = actionInvocation.getOutputMap()) != null) {
                string = outputMap.toString();
            }
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O00000OOoOOO00O00o0ooooooooO000ooooO0000.f93O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, name + " [success] " + string);
        }
        this.f66O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.success(actionInvocation);
    }
}
