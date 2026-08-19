package androidx.media3.exoplayer.source.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2640O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AdsMediaSource f2641O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ AdsMediaSource.ComponentListener f2642O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(AdsMediaSource adsMediaSource, AdsMediaSource.ComponentListener componentListener, int i) {
        this.f2640O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2641O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = adsMediaSource;
        this.f2642O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = componentListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2640O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2641O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$prepareSourceInternal$0(this.f2642O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2641O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$releaseSourceInternal$1(this.f2642O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
