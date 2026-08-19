package androidx.media3.exoplayer.video;

import androidx.media3.common.Format;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2714O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2715O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2716O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f2717O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Object obj, int i, Object obj2, Object obj3) {
        this.f2714O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2715O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2716O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
        this.f2717O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2714O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((PlaybackVideoGraphWrapper.InputVideoSink) this.f2715O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onError$1((VideoSink.Listener) this.f2716O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (VideoFrameProcessingException) this.f2717O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.f2715O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$inputFormatChanged$2((Format) this.f2716O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (DecoderReuseEvaluation) this.f2717O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
        }
    }
}
