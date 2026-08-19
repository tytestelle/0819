package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2720O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f2721O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ long f2722O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ int f2723O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.f2721O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventDispatcher;
        this.f2723O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i;
        this.f2722O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2720O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2721O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$droppedFrames$3(this.f2723O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f2722O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2721O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$reportVideoFrameProcessingOffset$4(this.f2722O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2723O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
        }
    }

    public /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(VideoRendererEventListener.EventDispatcher eventDispatcher, long j, int i) {
        this.f2721O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventDispatcher;
        this.f2722O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = j;
        this.f2723O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i;
    }
}
