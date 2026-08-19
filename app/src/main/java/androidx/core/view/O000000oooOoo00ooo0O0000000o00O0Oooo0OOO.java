package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.core.util.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements Supplier {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2204O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f2205O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(ViewConfiguration viewConfiguration, int i) {
        this.f2204O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2205O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = viewConfiguration;
    }

    @Override // androidx.core.util.Supplier
    public final Object get() {
        switch (this.f2204O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return Integer.valueOf(this.f2205O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getScaledMaximumFlingVelocity());
            default:
                return Integer.valueOf(this.f2205O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getScaledMinimumFlingVelocity());
        }
    }
}
