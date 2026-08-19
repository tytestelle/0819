package O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

import android.os.Handler;
import android.os.Looper;
import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.model.meta.Device;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.support.avtransport.lastchange.AVTransportLastChangeParser;
import org.fourthline.cling.support.renderingcontrol.lastchange.RenderingControlLastChangeParser;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f80O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f81O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(ControlPoint controlPoint, Device device, O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 listener) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(device, "device");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(listener, "listener");
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(controlPoint, device.findService(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f48O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
        this.f80O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, listener, device);
        ((ControlPoint) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f72O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).execute(new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O((Service) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f73O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, new AVTransportLastChangeParser(), o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO));
        Service serviceFindService = device.findService(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f49O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        new Handler(Looper.getMainLooper());
        controlPoint.execute(new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(serviceFindService, new RenderingControlLastChangeParser(), new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(0)));
        Service serviceFindService2 = device.findService(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f50O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        new Handler(Looper.getMainLooper());
        controlPoint.execute(new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(serviceFindService2, new AVTransportLastChangeParser(), new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(1)));
    }

    @Override // O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String uri, String title, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(uri, "uri");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(title, "title");
        this.f80O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(uri, title, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
    }
}
