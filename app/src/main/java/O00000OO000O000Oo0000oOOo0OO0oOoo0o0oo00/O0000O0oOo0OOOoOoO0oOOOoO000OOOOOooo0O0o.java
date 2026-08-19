package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public boolean f392O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Handler f393O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new Handler(Looper.getMainLooper(), new O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo());

    public final synchronized void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, boolean z) {
        try {
            if (this.f392O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO || z) {
                this.f393O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.obtainMessage(1, o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o).sendToTarget();
            } else {
                this.f392O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = true;
                o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.recycle();
                this.f392O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
