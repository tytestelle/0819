package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoSize;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2710O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2711O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2712O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj, Object obj2, int i) {
        this.f2710O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2712O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
        this.f2711O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2710O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((DefaultVideoSink.FrameRendererImpl) this.f2712O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$onVideoSizeChanged$0((VideoSize) this.f2711O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 1:
                ((VideoSink.Listener) this.f2712O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).onVideoSizeChanged((VideoSize) this.f2711O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 2:
                ((VideoRendererEventListener.EventDispatcher) this.f2712O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$videoSizeChanged$5((VideoSize) this.f2711O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 3:
                ((VideoRendererEventListener.EventDispatcher) this.f2712O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$videoCodecError$9((Exception) this.f2711O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.f2712O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$decoderReleased$7((String) this.f2711O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
        }
    }
}
