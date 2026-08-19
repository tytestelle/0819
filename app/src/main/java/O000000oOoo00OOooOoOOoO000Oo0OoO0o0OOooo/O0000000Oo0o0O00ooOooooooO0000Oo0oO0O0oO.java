package O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import org.fourthline.cling.android.AndroidUpnpService;
import org.fourthline.cling.registry.Registry;
import org.fourthline.cling.registry.RegistryListener;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        Registry registry;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(componentName, "componentName");
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f52O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, String.format("[%s] onBindingDied", Arrays.copyOf(new Object[]{componentName.getShortClassName()}, 1)));
        AndroidUpnpService androidUpnpService = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f55O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        if (androidUpnpService != null && (registry = androidUpnpService.getRegistry()) != null) {
            registry.removeListener(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f53O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f55O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(componentName, "componentName");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iBinder, "iBinder");
        AndroidUpnpService androidUpnpService = (AndroidUpnpService) iBinder;
        if (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f55O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != androidUpnpService) {
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f55O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = androidUpnpService;
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f52O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, String.format("onServiceConnected: [%s]", Arrays.copyOf(new Object[]{componentName.getShortClassName()}, 1)));
            Registry registry = androidUpnpService.getRegistry();
            Collection<RegistryListener> listeners = registry.getListeners();
            if (listeners == null || !listeners.contains(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f53O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)) {
                registry.addListener(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f53O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            }
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f47O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Registry registry;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(componentName, "componentName");
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f52O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, String.format("[%s] onServiceDisconnected", Arrays.copyOf(new Object[]{componentName.getShortClassName()}, 1)));
        AndroidUpnpService androidUpnpService = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f55O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        if (androidUpnpService != null && (registry = androidUpnpService.getRegistry()) != null) {
            registry.removeListener(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f53O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f55O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
    }
}
