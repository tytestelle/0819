package androidx.media3.exoplayer;

import androidx.media3.exoplayer.upstream.BandwidthMeter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO implements com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2335O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ BandwidthMeter f2336O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(BandwidthMeter bandwidthMeter, int i) {
        this.f2335O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2336O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = bandwidthMeter;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public final Object get() {
        switch (this.f2335O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ExoPlayer.Builder.lambda$setBandwidthMeter$20(this.f2336O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            default:
                return ExoPlayer.Builder.lambda$new$12(this.f2336O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }
}
