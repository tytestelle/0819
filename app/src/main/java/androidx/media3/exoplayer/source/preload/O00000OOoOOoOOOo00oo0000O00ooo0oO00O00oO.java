package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2680O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ PreloadMediaSource f2681O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(PreloadMediaSource preloadMediaSource, int i) {
        this.f2680O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2681O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = preloadMediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2680O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2681O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$releasePreloadMediaSource$3();
                break;
            case 1:
                this.f2681O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$clear$1();
                break;
            default:
                this.f2681O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.checkForPreloadError();
                break;
        }
    }
}
