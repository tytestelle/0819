package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2758O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ PlayerControlViewLayoutManager f2759O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(PlayerControlViewLayoutManager playerControlViewLayoutManager, int i) {
        this.f2758O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2759O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = playerControlViewLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2758O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2759O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.updateLayoutForSizeChange();
                break;
            case 1:
                this.f2759O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.onLayoutWidthChanged();
                break;
            case 2:
                this.f2759O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.showAllBars();
                break;
            case 3:
                this.f2759O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hideAllBars();
                break;
            case 4:
                this.f2759O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hideProgressBar();
                break;
            case 5:
                this.f2759O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hideMainBar();
                break;
            default:
                this.f2759O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hideController();
                break;
        }
    }
}
