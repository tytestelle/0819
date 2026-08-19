package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.DecoderCounters;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2502O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f2503O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f2504O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.f2502O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2503O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventDispatcher;
        this.f2504O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2502O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2503O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$enabled$0(this.f2504O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2503O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$disabled$6(this.f2504O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
