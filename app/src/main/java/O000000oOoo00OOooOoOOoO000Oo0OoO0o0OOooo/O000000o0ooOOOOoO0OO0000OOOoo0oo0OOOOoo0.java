package O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

import android.os.Handler;
import android.os.Looper;
import kotlin.collections.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.text.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
import org.fourthline.cling.model.meta.Device;
import org.fourthline.cling.registry.DefaultRegistryListener;
import org.fourthline.cling.registry.Registry;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends DefaultRegistryListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f63O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f64O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Handler f65O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO deviceRegistryListener) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(deviceRegistryListener, "deviceRegistryListener");
        this.f63O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = deviceRegistryListener;
        this.f64O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("DeviceRegistry", 0);
        this.f65O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new Handler(Looper.getMainLooper());
    }

    public static String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Device device) {
        String type = device.getType().getType();
        String friendlyName = device.getDetails().getFriendlyName();
        String identifierString = device.getIdentity().getUdn().getIdentifierString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(identifierString, "getIdentifierString(...)");
        return "[" + type + "][" + friendlyName + "][" + O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(identifierString, new String[]{"-"})) + "]";
    }

    @Override // org.fourthline.cling.registry.DefaultRegistryListener
    public final void deviceAdded(Registry registry, Device device) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(registry, "registry");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(device, "device");
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f64O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("deviceAdded: ", O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(device)));
        this.f65O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.post(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, device, 0));
    }

    @Override // org.fourthline.cling.registry.DefaultRegistryListener
    public final void deviceRemoved(Registry registry, Device device) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(registry, "registry");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(device, "device");
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f64O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("deviceRemoved: ", O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(device)));
        this.f65O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.post(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, device, 1));
    }
}
