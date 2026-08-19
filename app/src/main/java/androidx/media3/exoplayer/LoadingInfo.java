package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class LoadingInfo {
    public final long lastRebufferRealtimeMs;
    public final long playbackPositionUs;
    public final float playbackSpeed;

    public static final class Builder {
        private long lastRebufferRealtimeMs;
        private long playbackPositionUs;
        private float playbackSpeed;

        public LoadingInfo build() {
            return new LoadingInfo(this);
        }

        @CanIgnoreReturnValue
        public Builder setLastRebufferRealtimeMs(long j) {
            Assertions.checkArgument(j >= 0 || j == C.TIME_UNSET);
            this.lastRebufferRealtimeMs = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPlaybackPositionUs(long j) {
            this.playbackPositionUs = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPlaybackSpeed(float f) {
            Assertions.checkArgument(f > 0.0f || f == -3.4028235E38f);
            this.playbackSpeed = f;
            return this;
        }

        public Builder() {
            this.playbackPositionUs = C.TIME_UNSET;
            this.playbackSpeed = -3.4028235E38f;
            this.lastRebufferRealtimeMs = C.TIME_UNSET;
        }

        private Builder(LoadingInfo loadingInfo) {
            this.playbackPositionUs = loadingInfo.playbackPositionUs;
            this.playbackSpeed = loadingInfo.playbackSpeed;
            this.lastRebufferRealtimeMs = loadingInfo.lastRebufferRealtimeMs;
        }
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingInfo)) {
            return false;
        }
        LoadingInfo loadingInfo = (LoadingInfo) obj;
        return this.playbackPositionUs == loadingInfo.playbackPositionUs && this.playbackSpeed == loadingInfo.playbackSpeed && this.lastRebufferRealtimeMs == loadingInfo.lastRebufferRealtimeMs;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.playbackPositionUs), Float.valueOf(this.playbackSpeed), Long.valueOf(this.lastRebufferRealtimeMs));
    }

    public boolean rebufferedSince(long j) {
        long j2 = this.lastRebufferRealtimeMs;
        return (j2 == C.TIME_UNSET || j == C.TIME_UNSET || j2 < j) ? false : true;
    }

    private LoadingInfo(Builder builder) {
        this.playbackPositionUs = builder.playbackPositionUs;
        this.playbackSpeed = builder.playbackSpeed;
        this.lastRebufferRealtimeMs = builder.lastRebufferRealtimeMs;
    }
}
