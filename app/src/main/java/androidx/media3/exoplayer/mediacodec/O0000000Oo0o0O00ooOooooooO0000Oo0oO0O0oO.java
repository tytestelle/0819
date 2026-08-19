package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2585O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener f2586O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ MediaCodecAdapter f2587O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(MediaCodecAdapter mediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, int i) {
        this.f2585O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2587O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = mediaCodecAdapter;
        this.f2586O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = onFrameRenderedListener;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.f2585O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AsynchronousMediaCodecAdapter) this.f2587O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$setOnFrameRenderedListener$0(this.f2586O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, mediaCodec, j, j2);
                break;
            default:
                ((SynchronousMediaCodecAdapter) this.f2587O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$setOnFrameRenderedListener$0(this.f2586O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, mediaCodec, j, j2);
                break;
        }
    }
}
