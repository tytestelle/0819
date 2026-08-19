package androidx.media3.exoplayer.source.preload;

import android.content.Context;
import androidx.media3.common.FlagSet;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements ListenerSet.IterationFinishedEvent, TrackSelector.InvalidationListener, TrackSelector.Factory {
    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.Factory
    public TrackSelector createTrackSelector(Context context) {
        return new DefaultTrackSelector(context);
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        BasePreloadManager.lambda$new$0((PreloadManagerListener) obj, flagSet);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public /* synthetic */ void onRendererCapabilitiesChanged(Renderer renderer) {
        androidx.media3.exoplayer.trackselection.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, renderer);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        DefaultPreloadManager.lambda$new$0();
    }
}
