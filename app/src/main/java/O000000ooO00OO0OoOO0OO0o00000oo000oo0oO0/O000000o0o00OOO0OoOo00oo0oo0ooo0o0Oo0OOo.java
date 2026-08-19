package O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

import android.os.Handler;
import android.os.Looper;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.support.avtransport.callback.SetAVTransportURI;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends SetAVTransportURI {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f70O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f71O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(String str, String str2, O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, Service service) {
        super(service, str, str2);
        this.f70O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.f71O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
    }

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public final void failure(ActionInvocation actionInvocation, UpnpResponse upnpResponse, String str) {
        if (str == null) {
            str = "Error";
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f70O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f71O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, str, 2);
            if (kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Looper.myLooper(), Looper.getMainLooper())) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.run();
            } else {
                ((Handler) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f74O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).post(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            }
        }
    }

    @Override // org.fourthline.cling.support.avtransport.callback.SetAVTransportURI, org.fourthline.cling.controlpoint.ActionCallback
    public final void success(ActionInvocation actionInvocation) {
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f70O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f71O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, 0);
            if (kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Looper.myLooper(), Looper.getMainLooper())) {
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.run();
            } else {
                ((Handler) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f74O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).post(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            }
        }
    }
}
