package androidx.media3.exoplayer.offline;

import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.trackselection.TrackSelector;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements TrackSelector.InvalidationListener {
    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public final /* synthetic */ void onRendererCapabilitiesChanged(Renderer renderer) {
        androidx.media3.exoplayer.trackselection.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, renderer);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public final void onTrackSelectionsInvalidated() {
        DownloadHelper.lambda$new$0();
    }
}
