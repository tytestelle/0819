package androidx.media3.exoplayer;

import androidx.media3.common.util.BackgroundThreadStateHandler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements BackgroundThreadStateHandler.StateChangeListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2321O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ SuitableOutputChecker.Callback f2322O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(SuitableOutputChecker.Callback callback, int i) {
        this.f2321O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2322O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = callback;
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public final void onStateChanged(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f2321O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                DefaultSuitableOutputChecker.ImplApi23.lambda$enable$0(this.f2322O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, bool, bool2);
                break;
            default:
                DefaultSuitableOutputChecker.ImplApi35.lambda$enable$0(this.f2322O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, bool, bool2);
                break;
        }
    }
}
