package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Comparator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2686O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        this.f2686O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2686O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return DefaultTrackSelector.ImageTrackInfo.compareSelections((List) obj, (List) obj2);
            case 1:
                return DefaultTrackSelector.VideoTrackInfo.compareSelections((List) obj, (List) obj2);
            case 2:
                return DefaultTrackSelector.AudioTrackInfo.compareSelections((List) obj, (List) obj2);
            case 3:
                return DefaultTrackSelector.TextTrackInfo.compareSelections((List) obj, (List) obj2);
            case 4:
                return DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
            case 5:
                return DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
            case 6:
                return BaseTrackSelection.lambda$new$0((Format) obj, (Format) obj2);
            default:
                return DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
        }
    }
}
