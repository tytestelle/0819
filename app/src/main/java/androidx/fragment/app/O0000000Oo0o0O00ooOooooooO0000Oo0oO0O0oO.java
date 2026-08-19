package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements SavedStateRegistry.SavedStateProvider {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2220O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2221O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, int i) {
        this.f2220O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2221O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        switch (this.f2220O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ((FragmentActivity) this.f2221O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$init$0();
            case 1:
                return ((FragmentManager) this.f2221O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$attachController$4();
            default:
                return SavedStateHandle.savedStateProvider$lambda$0((SavedStateHandle) this.f2221O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }
}
