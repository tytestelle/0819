package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.DecoderCounters;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2727O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f2728O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f2729O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.f2727O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2728O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventDispatcher;
        this.f2729O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2727O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2728O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$enabled$0(this.f2729O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2728O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$disabled$8(this.f2729O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
