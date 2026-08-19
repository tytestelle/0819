package androidx.media3.exoplayer;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ScrubbingModeParameters {
    public static final ScrubbingModeParameters DEFAULT = new Builder().build();
    public final boolean allowSkippingMediaCodecFlush;
    public final O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 disabledTrackTypes;

    @Nullable
    @FloatRange(from = 0.0d, to = 1.0d)
    public final Double fractionalSeekToleranceAfter;

    @Nullable
    @FloatRange(from = 0.0d, to = 1.0d)
    public final Double fractionalSeekToleranceBefore;

    @Deprecated
    public final boolean isMediaCodecFlushEnabled;
    public final boolean shouldEnableDynamicScheduling;
    public final boolean shouldIncreaseCodecOperatingRate;
    public final boolean useDecodeOnlyFlag;

    public static final class Builder {
        private boolean allowSkippingMediaCodecFlush;
        private O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 disabledTrackTypes;

        @Nullable
        private Double fractionalSeekToleranceAfter;

        @Nullable
        private Double fractionalSeekToleranceBefore;
        private boolean shouldEnableDynamicScheduling;
        private boolean shouldIncreaseCodecOperatingRate;
        private boolean useDecodeOnlyFlag;

        public ScrubbingModeParameters build() {
            return new ScrubbingModeParameters(this);
        }

        @CanIgnoreReturnValue
        public Builder setAllowSkippingMediaCodecFlush(boolean z) {
            this.allowSkippingMediaCodecFlush = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setDisabledTrackTypes(Set<Integer> set) {
            this.disabledTrackTypes = O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.copyOf((Collection) set);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setFractionalSeekTolerance(@Nullable @FloatRange(from = 0.0d, to = 1.0d) Double d, @Nullable @FloatRange(from = 0.0d, to = 1.0d) Double d2) {
            boolean z = false;
            Assertions.checkArgument((d == null) == (d2 == null));
            Assertions.checkArgument(d == null || (d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d));
            if (d2 == null || (d2.doubleValue() >= 0.0d && d2.doubleValue() <= 1.0d)) {
                z = true;
            }
            Assertions.checkArgument(z);
            this.fractionalSeekToleranceBefore = d;
            this.fractionalSeekToleranceAfter = d2;
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setIsMediaCodecFlushEnabled(boolean z) {
            this.allowSkippingMediaCodecFlush = !z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setShouldEnableDynamicScheduling(boolean z) {
            this.shouldEnableDynamicScheduling = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setShouldIncreaseCodecOperatingRate(boolean z) {
            this.shouldIncreaseCodecOperatingRate = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUseDecodeOnlyFlag(boolean z) {
            this.useDecodeOnlyFlag = z;
            return this;
        }

        public Builder() {
            this.disabledTrackTypes = O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of(1, 5);
            this.shouldIncreaseCodecOperatingRate = true;
            this.allowSkippingMediaCodecFlush = true;
            this.shouldEnableDynamicScheduling = true;
            this.useDecodeOnlyFlag = true;
        }

        private Builder(ScrubbingModeParameters scrubbingModeParameters) {
            this.disabledTrackTypes = scrubbingModeParameters.disabledTrackTypes;
            this.fractionalSeekToleranceBefore = scrubbingModeParameters.fractionalSeekToleranceBefore;
            this.fractionalSeekToleranceAfter = scrubbingModeParameters.fractionalSeekToleranceAfter;
            this.shouldIncreaseCodecOperatingRate = scrubbingModeParameters.shouldIncreaseCodecOperatingRate;
            this.allowSkippingMediaCodecFlush = scrubbingModeParameters.allowSkippingMediaCodecFlush;
            this.shouldEnableDynamicScheduling = scrubbingModeParameters.shouldEnableDynamicScheduling;
            this.useDecodeOnlyFlag = scrubbingModeParameters.useDecodeOnlyFlag;
        }
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ScrubbingModeParameters)) {
            return false;
        }
        ScrubbingModeParameters scrubbingModeParameters = (ScrubbingModeParameters) obj;
        return this.disabledTrackTypes.equals(scrubbingModeParameters.disabledTrackTypes) && this.allowSkippingMediaCodecFlush == scrubbingModeParameters.allowSkippingMediaCodecFlush && Objects.equals(this.fractionalSeekToleranceBefore, scrubbingModeParameters.fractionalSeekToleranceBefore) && Objects.equals(this.fractionalSeekToleranceAfter, scrubbingModeParameters.fractionalSeekToleranceAfter) && this.shouldIncreaseCodecOperatingRate == scrubbingModeParameters.shouldIncreaseCodecOperatingRate && this.shouldEnableDynamicScheduling == scrubbingModeParameters.shouldEnableDynamicScheduling && this.useDecodeOnlyFlag == scrubbingModeParameters.useDecodeOnlyFlag;
    }

    public int hashCode() {
        return Objects.hash(this.disabledTrackTypes, this.fractionalSeekToleranceBefore, this.fractionalSeekToleranceAfter, Boolean.valueOf(this.shouldIncreaseCodecOperatingRate), Boolean.valueOf(this.allowSkippingMediaCodecFlush), Boolean.valueOf(this.shouldEnableDynamicScheduling), Boolean.valueOf(this.useDecodeOnlyFlag));
    }

    private ScrubbingModeParameters(Builder builder) {
        this.disabledTrackTypes = builder.disabledTrackTypes;
        this.fractionalSeekToleranceBefore = builder.fractionalSeekToleranceBefore;
        this.fractionalSeekToleranceAfter = builder.fractionalSeekToleranceAfter;
        this.shouldIncreaseCodecOperatingRate = builder.shouldIncreaseCodecOperatingRate;
        this.isMediaCodecFlushEnabled = !builder.allowSkippingMediaCodecFlush;
        this.allowSkippingMediaCodecFlush = builder.allowSkippingMediaCodecFlush;
        this.shouldEnableDynamicScheduling = builder.shouldEnableDynamicScheduling;
        this.useDecodeOnlyFlag = builder.useDecodeOnlyFlag;
    }
}
