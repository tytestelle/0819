package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.dash.DashMediaSource;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class VideoFrameReleaseControl {
    public static final int FRAME_RELEASE_DROP = 2;
    public static final int FRAME_RELEASE_IGNORE = 4;
    public static final int FRAME_RELEASE_IMMEDIATELY = 0;
    public static final int FRAME_RELEASE_SCHEDULED = 1;
    public static final int FRAME_RELEASE_SKIP = 3;
    public static final int FRAME_RELEASE_TRY_AGAIN_LATER = 5;
    private static final long MAX_EARLY_US_THRESHOLD = 50000;
    private final long allowedJoiningTimeMs;
    private boolean disableAdvancingTimestampChecks;
    private boolean frameReadyWithoutSurface;
    private final VideoFrameReleaseHelper frameReleaseHelper;
    private final FrameTimingEvaluator frameTimingEvaluator;
    private boolean hasOutputSurface;
    private boolean joiningRenderNextFrameImmediately;
    private long lastReleaseRealtimeUs;
    private boolean started;
    private int firstFrameState = 0;
    private long initialPositionUs = C.TIME_UNSET;
    private long lastPresentationTimeUs = C.TIME_UNSET;
    private long joiningDeadlineMs = C.TIME_UNSET;
    private float playbackSpeed = 1.0f;
    private Clock clock = Clock.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface FrameReleaseAction {
    }

    public static class FrameReleaseInfo {
        private long earlyUs = C.TIME_UNSET;
        private long releaseTimeNs = C.TIME_UNSET;

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.earlyUs = C.TIME_UNSET;
            this.releaseTimeNs = C.TIME_UNSET;
        }

        public long getEarlyUs() {
            return this.earlyUs;
        }

        public long getReleaseTimeNs() {
            return this.releaseTimeNs;
        }
    }

    public interface FrameTimingEvaluator {
        boolean shouldDropFrame(long j, long j2, boolean z);

        boolean shouldForceReleaseFrame(long j, long j2);

        boolean shouldIgnoreFrame(long j, long j2, long j3, boolean z, boolean z2);
    }

    public VideoFrameReleaseControl(Context context, FrameTimingEvaluator frameTimingEvaluator, long j) {
        this.frameTimingEvaluator = frameTimingEvaluator;
        this.allowedJoiningTimeMs = j;
        this.frameReleaseHelper = new VideoFrameReleaseHelper(context);
    }

    private long calculateEarlyTimeUs(long j, long j2, long j3) {
        long j4 = (long) ((j3 - j) / ((double) this.playbackSpeed));
        return this.started ? j4 - (Util.msToUs(this.clock.elapsedRealtime()) - j2) : j4;
    }

    private void lowerFirstFrameState(int i) {
        this.firstFrameState = Math.min(this.firstFrameState, i);
    }

    private boolean shouldForceRelease(long j, long j2, long j3) {
        if (this.joiningDeadlineMs != C.TIME_UNSET && !this.joiningRenderNextFrameImmediately) {
            return false;
        }
        int i = this.firstFrameState;
        if (i == 0) {
            return this.started;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return j >= j3;
        }
        if (i != 3) {
            throw new IllegalStateException();
        }
        long jMsToUs = Util.msToUs(this.clock.elapsedRealtime()) - this.lastReleaseRealtimeUs;
        if (!this.started) {
            return false;
        }
        if (!this.disableAdvancingTimestampChecks) {
            long j4 = this.initialPositionUs;
            if (j4 == C.TIME_UNSET || j4 == j) {
                return false;
            }
        }
        return this.frameTimingEvaluator.shouldForceReleaseFrame(j2, jMsToUs);
    }

    public void allowReleaseFirstFrameBeforeStarted() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    public void experimentalDisableAdvancingTimestampChecks() {
        this.disableAdvancingTimestampChecks = true;
    }

    public int getFrameReleaseAction(long j, long j2, long j3, long j4, boolean z, boolean z2, FrameReleaseInfo frameReleaseInfo) {
        frameReleaseInfo.reset();
        if (this.started && this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j2;
        }
        if (this.lastPresentationTimeUs != j) {
            this.frameReleaseHelper.onNextFrame(j);
            this.lastPresentationTimeUs = j;
        }
        frameReleaseInfo.earlyUs = calculateEarlyTimeUs(j2, j3, j);
        if (z && !z2) {
            return 3;
        }
        if (!this.hasOutputSurface) {
            this.frameReadyWithoutSurface = true;
            if (this.frameTimingEvaluator.shouldIgnoreFrame(frameReleaseInfo.earlyUs, j2, j3, z2, true)) {
                return 4;
            }
            return (!this.started || frameReleaseInfo.earlyUs >= DashMediaSource.DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS) ? 5 : 3;
        }
        if (shouldForceRelease(j2, frameReleaseInfo.earlyUs, j4)) {
            return 0;
        }
        if (!this.started || j2 == this.initialPositionUs) {
            return 5;
        }
        long jNanoTime = this.clock.nanoTime();
        frameReleaseInfo.releaseTimeNs = this.frameReleaseHelper.adjustReleaseTime((frameReleaseInfo.earlyUs * 1000) + jNanoTime);
        frameReleaseInfo.earlyUs = (frameReleaseInfo.releaseTimeNs - jNanoTime) / 1000;
        boolean z3 = (this.joiningDeadlineMs == C.TIME_UNSET || this.joiningRenderNextFrameImmediately) ? false : true;
        if (this.frameTimingEvaluator.shouldIgnoreFrame(frameReleaseInfo.earlyUs, j2, j3, z2, z3)) {
            return 4;
        }
        if (this.frameTimingEvaluator.shouldDropFrame(frameReleaseInfo.earlyUs, j3, z2)) {
            return z3 ? 3 : 2;
        }
        return frameReleaseInfo.earlyUs > MAX_EARLY_US_THRESHOLD ? 5 : 1;
    }

    public boolean isReady(boolean z) {
        if (z && (this.firstFrameState == 3 || (!this.hasOutputSurface && this.frameReadyWithoutSurface))) {
            this.joiningDeadlineMs = C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == C.TIME_UNSET) {
            return false;
        }
        if (this.clock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = C.TIME_UNSET;
        return false;
    }

    public void join(boolean z) {
        this.joiningRenderNextFrameImmediately = z;
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? this.clock.elapsedRealtime() + this.allowedJoiningTimeMs : C.TIME_UNSET;
    }

    public boolean onFrameReleasedIsFirstFrame() {
        boolean z = this.firstFrameState != 3;
        this.firstFrameState = 3;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        return z;
    }

    public void onStarted() {
        this.started = true;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        this.frameReleaseHelper.onStarted();
    }

    public void onStopped() {
        this.started = false;
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.frameReleaseHelper.onStopped();
    }

    public void onStreamChanged(int i) {
        if (i == 0) {
            this.firstFrameState = 1;
        } else if (i == 1) {
            this.firstFrameState = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            lowerFirstFrameState(2);
        }
    }

    public void reset() {
        this.frameReleaseHelper.onPositionReset();
        this.lastPresentationTimeUs = C.TIME_UNSET;
        this.initialPositionUs = C.TIME_UNSET;
        lowerFirstFrameState(1);
        this.joiningDeadlineMs = C.TIME_UNSET;
    }

    public void setChangeFrameRateStrategy(int i) {
        this.frameReleaseHelper.setChangeFrameRateStrategy(i);
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public void setFrameRate(float f) {
        this.frameReleaseHelper.onFormatChanged(f);
    }

    public void setOutputSurface(@Nullable Surface surface) {
        this.hasOutputSurface = surface != null;
        this.frameReadyWithoutSurface = false;
        this.frameReleaseHelper.onSurfaceChanged(surface);
        lowerFirstFrameState(1);
    }

    public void setPlaybackSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        Assertions.checkArgument(f > 0.0f);
        if (f == this.playbackSpeed) {
            return;
        }
        this.playbackSpeed = f;
        this.frameReleaseHelper.onPlaybackSpeed(f);
    }
}
