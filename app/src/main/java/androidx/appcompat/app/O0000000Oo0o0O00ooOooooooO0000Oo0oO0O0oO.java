package androidx.appcompat.app;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2130O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Context f2131O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Context context, int i) {
        this.f2130O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2131O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2130O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1(this.f2131O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                AppCompatDelegate.syncRequestedAndStoredLocales(this.f2131O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
        }
    }
}
