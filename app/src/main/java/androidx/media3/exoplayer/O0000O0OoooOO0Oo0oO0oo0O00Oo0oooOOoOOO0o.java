package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o {
    public static long O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(LoadControl loadControl) {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    public static long O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(LoadControl loadControl, PlayerId playerId) {
        return loadControl.getBackBufferDurationUs();
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(LoadControl loadControl) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(LoadControl loadControl, PlayerId playerId) {
        loadControl.onPrepared();
    }

    public static void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(LoadControl loadControl) {
        throw new IllegalStateException("onReleased not implemented");
    }

    public static void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(LoadControl loadControl, PlayerId playerId) {
        loadControl.onReleased();
    }

    public static void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(LoadControl loadControl) {
        throw new IllegalStateException("onStopped not implemented");
    }

    public static void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(LoadControl loadControl, PlayerId playerId) {
        loadControl.onStopped();
    }

    public static void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(LoadControl loadControl, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        loadControl.onTracksSelected(rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    public static void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(LoadControl loadControl, LoadControl.Parameters parameters, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    public static void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(LoadControl loadControl, PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        loadControl.onTracksSelected(timeline, mediaPeriodId, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    public static void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(LoadControl loadControl, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    public static boolean O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(LoadControl loadControl) {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    public static boolean O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(LoadControl loadControl, PlayerId playerId) {
        return loadControl.retainBackBufferFromKeyframe();
    }

    public static boolean O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(LoadControl loadControl, long j, long j2, float f) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    public static boolean O00000OOoOOO00O00o0ooooooooO000ooooO0000(LoadControl loadControl, LoadControl.Parameters parameters) {
        return loadControl.shouldContinueLoading(parameters.playbackPositionUs, parameters.bufferedDurationUs, parameters.playbackSpeed);
    }

    public static boolean O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(LoadControl loadControl, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j) {
        Log.w("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    public static boolean O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(LoadControl loadControl, long j, float f, boolean z, long j2) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    public static boolean O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(LoadControl loadControl, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, float f, boolean z, long j2) {
        return loadControl.shouldStartPlayback(j, f, z, j2);
    }

    public static boolean O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(LoadControl loadControl, LoadControl.Parameters parameters) {
        return loadControl.shouldStartPlayback(parameters.timeline, parameters.mediaPeriodId, parameters.bufferedDurationUs, parameters.playbackSpeed, parameters.rebuffering, parameters.targetLiveOffsetUs);
    }
}
