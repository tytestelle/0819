package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.TrackGroupArray;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo implements MetadataRetriever.MetadataRetrieverInternal.OnPreparedListener, MetadataRetriever.MetadataRetrieverInternal.OnFailureListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ MetadataRetriever f2402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(MetadataRetriever metadataRetriever) {
        this.f2402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = metadataRetriever;
    }

    @Override // androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.OnFailureListener
    public void onFailure(Exception exc) {
        this.f2402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$startPreparation$1(exc);
    }

    @Override // androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.OnPreparedListener
    public void onPrepared(TrackGroupArray trackGroupArray, Timeline timeline) {
        this.f2402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$startPreparation$0(trackGroupArray, timeline);
    }
}
