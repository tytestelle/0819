package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2718O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ VideoSink.Listener f2719O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(VideoSink.Listener listener, int i) {
        this.f2718O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2719O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = listener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2718O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2719O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.onFrameDropped();
                break;
            case 1:
                this.f2719O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.onFirstFrameRendered();
                break;
            default:
                this.f2719O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.onFrameAvailableForRendering();
                break;
        }
    }
}
