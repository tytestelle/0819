package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2210O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ ContentLoadingProgressBar f2211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ContentLoadingProgressBar contentLoadingProgressBar, int i) {
        this.f2210O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2210O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$new$0();
                break;
            case 1:
                this.f2211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$new$1();
                break;
            case 2:
                this.f2211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.showOnUiThread();
                break;
            default:
                this.f2211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hideOnUiThread();
                break;
        }
    }
}
