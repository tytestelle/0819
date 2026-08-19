package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.analytics.PlayerId;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OOoOOO00O00o0ooooooooO000ooooO0000 implements Consumer, ProgressiveMediaExtractor.Factory {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2639O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O00000OOoOOO00O00o0ooooooooO000ooooO0000(int i) {
        this.f2639O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        switch (this.f2639O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                SampleQueue.lambda$new$0((SampleQueue.SharedSampleMetadata) obj);
                break;
            default:
                SpannedData.lambda$new$0(obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return MediaParserExtractorAdapter.lambda$static$0(playerId);
    }
}
