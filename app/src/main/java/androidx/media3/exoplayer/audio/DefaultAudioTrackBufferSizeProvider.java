package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorUtil;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultAudioTrackBufferSizeProvider implements DefaultAudioSink.AudioTrackBufferSizeProvider {
    private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
    private static final int DTSHD_BUFFER_MULTIPLICATION_FACTOR = 4;
    private static final int MAX_PCM_BUFFER_DURATION_US = 750000;
    private static final int MIN_PCM_BUFFER_DURATION_US = 250000;
    private static final int OFFLOAD_BUFFER_DURATION_US = 50000000;
    private static final int PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int PCM_BUFFER_MULTIPLICATION_FACTOR = 4;
    public final int ac3BufferMultiplicationFactor;
    public final int dtshdBufferMultiplicationFactor;
    protected final int maxPcmBufferDurationUs;
    protected final int minPcmBufferDurationUs;
    protected final int offloadBufferDurationUs;
    protected final int passthroughBufferDurationUs;
    protected final int pcmBufferMultiplicationFactor;

    public static class Builder {
        private int minPcmBufferDurationUs = 250000;
        private int maxPcmBufferDurationUs = DefaultAudioTrackBufferSizeProvider.MAX_PCM_BUFFER_DURATION_US;
        private int pcmBufferMultiplicationFactor = 4;
        private int passthroughBufferDurationUs = 250000;
        private int offloadBufferDurationUs = DefaultAudioTrackBufferSizeProvider.OFFLOAD_BUFFER_DURATION_US;
        private int ac3BufferMultiplicationFactor = 2;
        private int dtshdBufferMultiplicationFactor = 4;

        public DefaultAudioTrackBufferSizeProvider build() {
            return new DefaultAudioTrackBufferSizeProvider(this);
        }

        @CanIgnoreReturnValue
        public Builder setAc3BufferMultiplicationFactor(int i) {
            this.ac3BufferMultiplicationFactor = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setDtshdBufferMultiplicationFactor(int i) {
            this.dtshdBufferMultiplicationFactor = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMaxPcmBufferDurationUs(int i) {
            this.maxPcmBufferDurationUs = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMinPcmBufferDurationUs(int i) {
            this.minPcmBufferDurationUs = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setOffloadBufferDurationUs(int i) {
            this.offloadBufferDurationUs = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPassthroughBufferDurationUs(int i) {
            this.passthroughBufferDurationUs = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPcmBufferMultiplicationFactor(int i) {
            this.pcmBufferMultiplicationFactor = i;
            return this;
        }
    }

    public DefaultAudioTrackBufferSizeProvider(Builder builder) {
        this.minPcmBufferDurationUs = builder.minPcmBufferDurationUs;
        this.maxPcmBufferDurationUs = builder.maxPcmBufferDurationUs;
        this.pcmBufferMultiplicationFactor = builder.pcmBufferMultiplicationFactor;
        this.passthroughBufferDurationUs = builder.passthroughBufferDurationUs;
        this.offloadBufferDurationUs = builder.offloadBufferDurationUs;
        this.ac3BufferMultiplicationFactor = builder.ac3BufferMultiplicationFactor;
        this.dtshdBufferMultiplicationFactor = builder.dtshdBufferMultiplicationFactor;
    }

    public static int durationUsToBytes(int i, int i2, int i3) {
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    private static int getNonPcmMaximumEncodedRateBytesPerSecond(int i) {
        int maximumEncodedRateBytesPerSecond = ExtractorUtil.getMaximumEncodedRateBytesPerSecond(i);
        Assertions.checkState(maximumEncodedRateBytesPerSecond != -2147483647);
        return maximumEncodedRateBytesPerSecond;
    }

    public int get1xBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            return getPcmBufferSizeInBytes(i, i5, i4);
        }
        if (i3 == 1) {
            return getOffloadBufferSizeInBytes(i2);
        }
        if (i3 == 2) {
            return getPassthroughBufferSizeInBytes(i2, i6);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider
    public int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        return (((Math.max(i, (int) (((double) get1xBufferSizeInBytes(i, i2, i3, i4, i5, i6)) * d)) + i4) - 1) / i4) * i4;
    }

    public int getOffloadBufferSizeInBytes(int i) {
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((((long) this.offloadBufferDurationUs) * ((long) getNonPcmMaximumEncodedRateBytesPerSecond(i))) / 1000000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0022, please report this as an issue */
    public int getPassthroughBufferSizeInBytes(int i, int i2) {
        int i3;
        int nonPcmMaximumEncodedRateBytesPerSecond;
        RoundingMode roundingMode;
        int i4;
        int i5;
        int iAbs;
        boolean z;
        int i6 = this.passthroughBufferDurationUs;
        if (i != 5) {
            if (i == 8) {
                i3 = this.dtshdBufferMultiplicationFactor;
            }
            if (i2 != -1) {
                roundingMode = RoundingMode.CEILING;
                roundingMode.getClass();
                nonPcmMaximumEncodedRateBytesPerSecond = i2 / 8;
                i4 = i2 - (8 * nonPcmMaximumEncodedRateBytesPerSecond);
                if (i4 != 0) {
                    i5 = ((i2 ^ 8) >> 31) | 1;
                    switch (O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1597O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[roundingMode.ordinal()]) {
                        case 1:
                            O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i4 == 0);
                            break;
                        case 2:
                            break;
                        case 3:
                            if (i5 < 0) {
                                nonPcmMaximumEncodedRateBytesPerSecond += i5;
                            }
                            break;
                        case 4:
                            nonPcmMaximumEncodedRateBytesPerSecond += i5;
                            break;
                        case 5:
                            if (i5 > 0) {
                                nonPcmMaximumEncodedRateBytesPerSecond += i5;
                            }
                            break;
                        case 6:
                        case 7:
                        case 8:
                            int iAbs2 = Math.abs(i4);
                            iAbs = iAbs2 - (Math.abs(8) - iAbs2);
                            if (iAbs == 0) {
                                if (iAbs > 0) {
                                    nonPcmMaximumEncodedRateBytesPerSecond += i5;
                                }
                            } else if (roundingMode == RoundingMode.HALF_UP) {
                                if (roundingMode == RoundingMode.HALF_EVEN) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z & ((nonPcmMaximumEncodedRateBytesPerSecond & 1) != 0)) {
                                    nonPcmMaximumEncodedRateBytesPerSecond += i5;
                                }
                            } else {
                                nonPcmMaximumEncodedRateBytesPerSecond += i5;
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            } else {
                nonPcmMaximumEncodedRateBytesPerSecond = getNonPcmMaximumEncodedRateBytesPerSecond(i);
            }
            return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((((long) i6) * ((long) nonPcmMaximumEncodedRateBytesPerSecond)) / 1000000);
        }
        i3 = this.ac3BufferMultiplicationFactor;
        i6 *= i3;
        if (i2 != -1) {
            roundingMode = RoundingMode.CEILING;
            roundingMode.getClass();
            nonPcmMaximumEncodedRateBytesPerSecond = i2 / 8;
            i4 = i2 - (8 * nonPcmMaximumEncodedRateBytesPerSecond);
            if (i4 != 0) {
                i5 = ((i2 ^ 8) >> 31) | 1;
                switch (O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1597O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[roundingMode.ordinal()]) {
                    case 1:
                        O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i4 == 0);
                        break;
                    case 2:
                        break;
                    case 3:
                        if (i5 < 0) {
                            nonPcmMaximumEncodedRateBytesPerSecond += i5;
                        }
                        break;
                    case 4:
                        nonPcmMaximumEncodedRateBytesPerSecond += i5;
                        break;
                    case 5:
                        if (i5 > 0) {
                            nonPcmMaximumEncodedRateBytesPerSecond += i5;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int iAbs3 = Math.abs(i4);
                        iAbs = iAbs3 - (Math.abs(8) - iAbs3);
                        if (iAbs == 0) {
                            if (iAbs > 0) {
                                nonPcmMaximumEncodedRateBytesPerSecond += i5;
                            }
                        } else if (roundingMode == RoundingMode.HALF_UP) {
                            if (roundingMode == RoundingMode.HALF_EVEN) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z & ((nonPcmMaximumEncodedRateBytesPerSecond & 1) != 0)) {
                                nonPcmMaximumEncodedRateBytesPerSecond += i5;
                            }
                        } else {
                            nonPcmMaximumEncodedRateBytesPerSecond += i5;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        } else {
            nonPcmMaximumEncodedRateBytesPerSecond = getNonPcmMaximumEncodedRateBytesPerSecond(i);
        }
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((((long) i6) * ((long) nonPcmMaximumEncodedRateBytesPerSecond)) / 1000000);
    }

    public int getPcmBufferSizeInBytes(int i, int i2, int i3) {
        return Util.constrainValue(i * this.pcmBufferMultiplicationFactor, durationUsToBytes(this.minPcmBufferDurationUs, i2, i3), durationUsToBytes(this.maxPcmBufferDurationUs, i2, i3));
    }
}
