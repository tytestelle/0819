package androidx.media3.exoplayer;

import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.extractor.Extractor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 implements com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2403O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00(int i) {
        this.f2403O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final Object apply(Object obj) {
        switch (this.f2403O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return StreamVolumeManager.lambda$release$11((StreamVolumeManager.StreamVolumeState) obj);
            case 1:
                return StreamVolumeManager.lambda$increaseVolume$5((StreamVolumeManager.StreamVolumeState) obj);
            case 2:
                return StreamVolumeManager.lambda$decreaseVolume$7((StreamVolumeManager.StreamVolumeState) obj);
            case 3:
                return new DefaultAnalyticsCollector((Clock) obj);
            default:
                return MediaExtractorCompat.lambda$selectExtractor$0((Extractor) obj);
        }
    }
}
