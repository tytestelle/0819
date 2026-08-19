package androidx.media3.extractor.metadata.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.cache.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import com.google.common.collect.O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SlowMotionData implements Metadata.Entry {
    public final List<Segment> segments;

    public static final class Segment {
        public static final Comparator<Segment> BY_START_THEN_END_THEN_DIVISOR = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(2);
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        public Segment(long j, long j2, int i) {
            Assertions.checkArgument(j < j2);
            this.startTimeMs = j;
            this.endTimeMs = j2;
            this.speedDivisor = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(Segment segment, Segment segment2) {
            return O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3476O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(segment.startTimeMs, segment2.startTimeMs).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(segment.endTimeMs, segment2.endTimeMs).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(segment.speedDivisor, segment2.speedDivisor).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.startTimeMs == segment.startTimeMs && this.endTimeMs == segment.endTimeMs && this.speedDivisor == segment.speedDivisor;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }

        public String toString() {
            return Util.formatInvariant("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.segments = list;
        Assertions.checkArgument(!doSegmentsOverlap(list));
    }

    private static boolean doSegmentsOverlap(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).endTimeMs;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).startTimeMs < j) {
                return true;
            }
            j = list.get(i).endTimeMs;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.segments.equals(((SlowMotionData) obj).segments);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] getWrappedMetadataBytes() {
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ Format getWrappedMetadataFormat() {
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
    }

    public int hashCode() {
        return this.segments.hashCode();
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, builder);
    }

    public String toString() {
        return "SlowMotion: segments=" + this.segments;
    }
}
