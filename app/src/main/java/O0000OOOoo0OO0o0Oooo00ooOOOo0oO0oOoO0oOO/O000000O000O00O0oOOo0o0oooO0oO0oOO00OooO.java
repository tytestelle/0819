package O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.forcetech.service.PxpUtil;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements ServiceConnection {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this.f978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((HashSet) this.f978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).add(PxpUtil.trans(componentName));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((HashSet) this.f978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).remove(PxpUtil.trans(componentName));
    }
}
