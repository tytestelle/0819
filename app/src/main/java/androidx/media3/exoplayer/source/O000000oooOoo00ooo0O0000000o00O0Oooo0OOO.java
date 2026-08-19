package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2630O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ ProgressiveMediaPeriod f2631O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(ProgressiveMediaPeriod progressiveMediaPeriod, int i) {
        this.f2630O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2631O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = progressiveMediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2630O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2631O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onLengthKnown$2();
                break;
            case 1:
                this.f2631O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.maybeFinishPrepare();
                break;
            default:
                this.f2631O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$new$0();
                break;
        }
    }
}
