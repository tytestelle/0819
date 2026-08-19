package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.Format;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O implements MediaCodecUtil.ScoreProvider {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2593O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Format f2594O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Format format, int i) {
        this.f2593O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2594O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = format;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public final int getScore(Object obj) {
        switch (this.f2593O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return MediaCodecUtil.lambda$getDecoderInfosSortedByFullFormatSupport$1(this.f2594O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (MediaCodecInfo) obj);
            default:
                return MediaCodecUtil.lambda$getDecoderInfosSortedByFormatSupport$0(this.f2594O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (MediaCodecInfo) obj);
        }
    }
}
