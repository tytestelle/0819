package androidx.media3.exoplayer.source;

import android.os.Bundle;
import androidx.media3.common.TrackGroup;
import androidx.media3.extractor.Extractor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O implements com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2629O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(int i) {
        this.f2629O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final Object apply(Object obj) {
        switch (this.f2629O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return MergingMediaPeriod.lambda$selectTracks$0((MediaPeriod) obj);
            case 1:
                return BundledExtractorsAdapter.lambda$init$0((Extractor) obj);
            case 2:
                return TrackGroupArray.lambda$getTrackTypes$0((TrackGroup) obj);
            case 3:
                return ((TrackGroup) obj).toBundle();
            default:
                return TrackGroup.fromBundle((Bundle) obj);
        }
    }
}
