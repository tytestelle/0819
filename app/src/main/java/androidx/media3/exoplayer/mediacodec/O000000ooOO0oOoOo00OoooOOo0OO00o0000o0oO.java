package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements MediaCodecUtil.ScoreProvider, LoudnessCodecController.LoudnessParameterUpdateListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2592O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(int i) {
        this.f2592O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public int getScore(Object obj) {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        switch (this.f2592O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return MediaCodecUtil.lambda$getDecoderInfosSortedBySoftwareOnly$2(mediaCodecInfo);
            default:
                return MediaCodecUtil.lambda$applyWorkarounds$3(mediaCodecInfo);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener
    public Bundle onLoudnessParameterUpdate(Bundle bundle) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(bundle);
    }
}
