package androidx.media3.common.util;

import androidx.annotation.GuardedBy;
import androidx.media3.common.C;
import java.util.concurrent.TimeoutException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;

    @GuardedBy("this")
    private long firstSampleTimestampUs;

    @GuardedBy("this")
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();

    @GuardedBy("this")
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    public static long ptsToUs(long j) {
        return Util.scaleLargeTimestamp(j, 1000000L, 90000L);
    }

    public static long usToNonWrappedPts(long j) {
        return Util.scaleLargeTimestamp(j, 90000L, 1000000L);
    }

    public static long usToWrappedPts(long j) {
        return usToNonWrappedPts(j) % 8589934592L;
    }

    public synchronized long adjustSampleTimestamp(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!isInitialized()) {
                long jLongValue = this.firstSampleTimestampUs;
                if (jLongValue == MODE_SHARED) {
                    jLongValue = ((Long) Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
                }
                this.timestampOffsetUs = jLongValue - j;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j;
            return j + this.timestampOffsetUs;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j2 = this.lastUnadjustedTimestampUs;
            if (j2 != C.TIME_UNSET) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j2);
                long j3 = (IjkMediaMeta.AV_CH_WIDE_RIGHT + jUsToNonWrappedPts) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - jUsToNonWrappedPts) < Math.abs(j5 - jUsToNonWrappedPts) ? j4 : j5;
            }
            return adjustSampleTimestamp(ptsToUs(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long adjustTsTimestampGreaterThanPreviousTimestamp(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j2 = this.lastUnadjustedTimestampUs;
        if (j2 != C.TIME_UNSET) {
            long jUsToNonWrappedPts = usToNonWrappedPts(j2);
            long j3 = jUsToNonWrappedPts / 8589934592L;
            Long.signum(j3);
            long j4 = (j3 * 8589934592L) + j;
            j = j4 >= jUsToNonWrappedPts ? j4 : ((j3 + 1) * 8589934592L) + j;
        }
        return adjustSampleTimestamp(ptsToUs(j));
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j;
        j = this.firstSampleTimestampUs;
        if (j == Long.MAX_VALUE || j == MODE_SHARED) {
            j = C.TIME_UNSET;
        }
        return j;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j;
        try {
            j = this.lastUnadjustedTimestampUs;
        } catch (Throwable th) {
            throw th;
        }
        return j != C.TIME_UNSET ? j + this.timestampOffsetUs : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized boolean isInitialized() {
        return this.timestampOffsetUs != C.TIME_UNSET;
    }

    public synchronized void reset(long j) {
        this.firstSampleTimestampUs = j;
        this.timestampOffsetUs = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = C.TIME_UNSET;
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j, long j2) {
        try {
            Assertions.checkState(this.firstSampleTimestampUs == MODE_SHARED);
            if (isInitialized()) {
                return;
            }
            if (z) {
                this.nextSampleTimestampUs.set(Long.valueOf(j));
            } else {
                long jElapsedRealtime = 0;
                long j3 = j2;
                while (!isInitialized()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        Assertions.checkState(j3 > 0);
                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                        wait(j3);
                        jElapsedRealtime += android.os.SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j2 && !isInitialized()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j2 + " milliseconds");
                        }
                        j3 = j2 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
