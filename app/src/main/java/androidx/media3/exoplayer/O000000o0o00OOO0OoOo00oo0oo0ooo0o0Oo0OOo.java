package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2319O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Context f2320O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Context context, int i) {
        this.f2319O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2320O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = context;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public final Object get() {
        switch (this.f2319O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return AudioManagerCompat.getAudioManager(this.f2320O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 1:
                return ExoPlayer.Builder.lambda$new$0(this.f2320O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 2:
                return ExoPlayer.Builder.lambda$new$1(this.f2320O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 3:
                return ExoPlayer.Builder.lambda$new$3(this.f2320O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 4:
                return ExoPlayer.Builder.lambda$new$14(this.f2320O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 5:
                return DefaultBandwidthMeter.getSingletonInstance(this.f2320O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            default:
                return ExoPlayer.Builder.lambda$new$4(this.f2320O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }
}
