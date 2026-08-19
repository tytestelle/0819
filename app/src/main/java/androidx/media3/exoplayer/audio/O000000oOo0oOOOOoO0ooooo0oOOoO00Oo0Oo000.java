package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ String f2519O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ long f2520O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ long f2521O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ Object f2522O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Object obj, String str, long j, long j2, int i) {
        this.f2518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2522O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = obj;
        this.f2519O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str;
        this.f2520O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = j;
        this.f2521O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.f2522O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).lambda$decoderInitialized$1(this.f2519O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2520O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2521O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.f2522O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).lambda$decoderInitialized$1(this.f2519O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2520O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2521O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
        }
    }
}
