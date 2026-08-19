package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultLoadControl implements LoadControl {
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 2000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 1000;
    public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final int DEFAULT_IMAGE_BUFFER_SIZE = 26214400;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MIN_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_MUXED_BUFFER_SIZE = 144310272;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = false;
    public static final boolean DEFAULT_RETAIN_BACK_BUFFER_FROM_KEYFRAME = false;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    public static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE = 131072000;
    private final DefaultAllocator allocator;
    private final long backBufferDurationUs;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackUs;
    private final HashMap<PlayerId, PlayerLoadingState> loadingStates;
    private final long maxBufferUs;
    private final long minBufferUs;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final boolean retainBackBufferFromKeyframe;
    private final int targetBufferBytesOverwrite;
    private long threadId;

    public static final class Builder {

        @Nullable
        private DefaultAllocator allocator;
        private boolean buildCalled;
        private int minBufferMs = 50000;
        private int maxBufferMs = 50000;
        private int bufferForPlaybackMs = 1000;
        private int bufferForPlaybackAfterRebufferMs = 2000;
        private int targetBufferBytes = -1;
        private boolean prioritizeTimeOverSizeThresholds = false;
        private int backBufferDurationMs = 0;
        private boolean retainBackBufferFromKeyframe = false;

        public DefaultLoadControl build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            if (this.allocator == null) {
                this.allocator = new DefaultAllocator(true, 65536);
            }
            return new DefaultLoadControl(this.allocator, this.minBufferMs, this.maxBufferMs, this.bufferForPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.targetBufferBytes, this.prioritizeTimeOverSizeThresholds, this.backBufferDurationMs, this.retainBackBufferFromKeyframe);
        }

        @CanIgnoreReturnValue
        public Builder setAllocator(DefaultAllocator defaultAllocator) {
            Assertions.checkState(!this.buildCalled);
            this.allocator = defaultAllocator;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBackBuffer(int i, boolean z) {
            Assertions.checkState(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i, 0, "backBufferDurationMs", SessionDescription.SUPPORTED_SDP_VERSION);
            this.backBufferDurationMs = i;
            this.retainBackBufferFromKeyframe = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBufferDurationsMs(int i, int i2, int i3, int i4) {
            Assertions.checkState(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i3, 0, "bufferForPlaybackMs", SessionDescription.SUPPORTED_SDP_VERSION);
            DefaultLoadControl.assertGreaterOrEqual(i4, 0, "bufferForPlaybackAfterRebufferMs", SessionDescription.SUPPORTED_SDP_VERSION);
            DefaultLoadControl.assertGreaterOrEqual(i, i3, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i2, i, "maxBufferMs", "minBufferMs");
            this.minBufferMs = i;
            this.maxBufferMs = i2;
            this.bufferForPlaybackMs = i3;
            this.bufferForPlaybackAfterRebufferMs = i4;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrioritizeTimeOverSizeThresholds(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholds = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTargetBufferBytes(int i) {
            Assertions.checkState(!this.buildCalled);
            this.targetBufferBytes = i;
            return this;
        }
    }

    public static class PlayerLoadingState {
        public boolean isLoading;
        public int targetBufferBytes;

        private PlayerLoadingState() {
        }
    }

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, 65536), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertGreaterOrEqual(int i, int i2, String str, String str2) {
        Assertions.checkArgument(i >= i2, str + " cannot be less than " + str2);
    }

    private static int getDefaultBufferSize(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return DEFAULT_MUXED_BUFFER_SIZE;
            case 1:
                return 13107200;
            case 2:
                return DEFAULT_VIDEO_BUFFER_SIZE;
            case 3:
                return 131072;
            case 4:
                return DEFAULT_IMAGE_BUFFER_SIZE;
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void removePlayer(PlayerId playerId) {
        if (this.loadingStates.remove(playerId) != null) {
            updateAllocator();
        }
    }

    private void resetPlayerLoadingState(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) Assertions.checkNotNull(this.loadingStates.get(playerId));
        int i = this.targetBufferBytesOverwrite;
        if (i == -1) {
            i = 13107200;
        }
        playerLoadingState.targetBufferBytes = i;
        playerLoadingState.isLoading = false;
    }

    private void updateAllocator() {
        if (this.loadingStates.isEmpty()) {
            this.allocator.reset();
        } else {
            this.allocator.setTargetBufferSize(calculateTotalTargetBufferBytes());
        }
    }

    public int calculateTargetBufferBytes(ExoTrackSelection[] exoTrackSelectionArr) {
        int defaultBufferSize = 0;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                defaultBufferSize += getDefaultBufferSize(exoTrackSelection.getTrackGroup().type);
            }
        }
        return Math.max(13107200, defaultBufferSize);
    }

    @VisibleForTesting
    public int calculateTotalTargetBufferBytes() {
        Iterator<PlayerLoadingState> it = this.loadingStates.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().targetBufferBytes;
        }
        return i;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public Allocator getAllocator() {
        return this.allocator;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ long getBackBufferDurationUs() {
        return O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ void onPrepared() {
        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ void onReleased() {
        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ void onStopped() {
        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ void onTracksSelected(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, timeline, mediaPeriodId, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ boolean retainBackBufferFromKeyframe() {
        return O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ boolean shouldContinueLoading(long j, long j2, float f) {
        return O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this, j, j2, f);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldContinuePreloading(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j) {
        Iterator<PlayerLoadingState> it = this.loadingStates.values().iterator();
        while (it.hasNext()) {
            if (it.next().isLoading) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ boolean shouldStartPlayback(long j, float f, boolean z, long j2) {
        return O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this, j, f, z, j2);
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        assertGreaterOrEqual(i3, 0, "bufferForPlaybackMs", SessionDescription.SUPPORTED_SDP_VERSION);
        assertGreaterOrEqual(i4, 0, "bufferForPlaybackAfterRebufferMs", SessionDescription.SUPPORTED_SDP_VERSION);
        assertGreaterOrEqual(i, i3, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i2, i, "maxBufferMs", "minBufferMs");
        assertGreaterOrEqual(i6, 0, "backBufferDurationMs", SessionDescription.SUPPORTED_SDP_VERSION);
        this.allocator = defaultAllocator;
        this.minBufferUs = Util.msToUs(i);
        this.maxBufferUs = Util.msToUs(i2);
        this.bufferForPlaybackUs = Util.msToUs(i3);
        this.bufferForPlaybackAfterRebufferUs = Util.msToUs(i4);
        this.targetBufferBytesOverwrite = i5;
        this.prioritizeTimeOverSizeThresholds = z;
        this.backBufferDurationUs = Util.msToUs(i6);
        this.retainBackBufferFromKeyframe = z2;
        this.loadingStates = new HashMap<>();
        this.threadId = -1L;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public long getBackBufferDurationUs(PlayerId playerId) {
        return this.backBufferDurationUs;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onPrepared(PlayerId playerId) {
        long id = Thread.currentThread().getId();
        long j = this.threadId;
        Assertions.checkState(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.threadId = id;
        if (!this.loadingStates.containsKey(playerId)) {
            this.loadingStates.put(playerId, new PlayerLoadingState());
        }
        resetPlayerLoadingState(playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onReleased(PlayerId playerId) {
        removePlayer(playerId);
        if (this.loadingStates.isEmpty()) {
            this.threadId = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onStopped(PlayerId playerId) {
        removePlayer(playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ void onTracksSelected(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, playerId, timeline, mediaPeriodId, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean retainBackBufferFromKeyframe(PlayerId playerId) {
        return this.retainBackBufferFromKeyframe;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldContinueLoading(LoadControl.Parameters parameters) {
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) Assertions.checkNotNull(this.loadingStates.get(parameters.playerId));
        boolean z = true;
        boolean z2 = this.allocator.getTotalBytesAllocated() >= calculateTotalTargetBufferBytes();
        long jMin = this.minBufferUs;
        float f = parameters.playbackSpeed;
        if (f > 1.0f) {
            jMin = Math.min(Util.getMediaDurationForPlayoutDuration(jMin, f), this.maxBufferUs);
        }
        long jMax = Math.max(jMin, 500000L);
        long j = parameters.bufferedDurationUs;
        if (j < jMax) {
            if (!this.prioritizeTimeOverSizeThresholds && z2) {
                z = false;
            }
            playerLoadingState.isLoading = z;
            if (!z && j < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.maxBufferUs || z2) {
            playerLoadingState.isLoading = false;
        }
        return playerLoadingState.isLoading;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ boolean shouldStartPlayback(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, float f, boolean z, long j2) {
        return O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(this, timeline, mediaPeriodId, j, f, z, j2);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldStartPlayback(LoadControl.Parameters parameters) {
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(parameters.bufferedDurationUs, parameters.playbackSpeed);
        long jMin = parameters.rebuffering ? this.bufferForPlaybackAfterRebufferUs : this.bufferForPlaybackUs;
        long j = parameters.targetLiveOffsetUs;
        if (j != C.TIME_UNSET) {
            jMin = Math.min(j / 2, jMin);
        }
        return jMin <= 0 || playoutDurationForMediaDuration >= jMin || (!this.prioritizeTimeOverSizeThresholds && this.allocator.getTotalBytesAllocated() >= calculateTotalTargetBufferBytes());
    }

    @InlineMe(replacement = "this.calculateTargetBufferBytes(trackSelectionArray)")
    @Deprecated
    public final int calculateTargetBufferBytes(Renderer[] rendererArr, ExoTrackSelection[] exoTrackSelectionArr) {
        return calculateTargetBufferBytes(exoTrackSelectionArr);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onTracksSelected(LoadControl.Parameters parameters, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) Assertions.checkNotNull(this.loadingStates.get(parameters.playerId));
        int iCalculateTargetBufferBytes = this.targetBufferBytesOverwrite;
        if (iCalculateTargetBufferBytes == -1) {
            iCalculateTargetBufferBytes = calculateTargetBufferBytes(exoTrackSelectionArr);
        }
        playerLoadingState.targetBufferBytes = iCalculateTargetBufferBytes;
        updateAllocator();
    }
}
