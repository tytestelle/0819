package androidx.media3.ui;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2746O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ View f2747O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(View view, int i) {
        this.f2746O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2747O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2746O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((DefaultTimeBar) this.f2747O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$new$0();
                break;
            case 1:
                ((PlayerControlView) this.f2747O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).updateProgress();
                break;
            default:
                ((PlayerView) this.f2747O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).invalidate();
                break;
        }
    }
}
