package androidx.core.view;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2200O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2201O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj, int i) {
        this.f2200O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2201O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2200O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                SoftwareKeyboardControllerCompat.Impl20.lambda$show$0((View) this.f2201O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                ((Function0) this.f2201O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).invoke();
                break;
        }
    }
}
