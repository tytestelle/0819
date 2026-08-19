package androidx.media3.extractor.text;

import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class CuesWithTimingSubtitle implements Subtitle {
    private static final O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo CUES_BY_START_TIME_ASCENDING = O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().onResultOf(new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(0));
    private static final String TAG = "CuesWithTimingSubtitle";
    private final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O eventCues;
    private final long[] eventTimesUs;

    /* JADX WARN: Code duplicated, block: B:22:0x00b3  */
    public CuesWithTimingSubtitle(List<CuesWithTiming> list) {
        if (list.size() == 1) {
            CuesWithTiming cuesWithTiming = (CuesWithTiming) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(list);
            long jNormalizeUnsetStartTimeToZero = normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs);
            if (cuesWithTiming.durationUs == C.TIME_UNSET) {
                this.eventCues = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(cuesWithTiming.cues);
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero};
                return;
            } else {
                this.eventCues = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(cuesWithTiming.cues, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero, cuesWithTiming.durationUs + jNormalizeUnsetStartTimeToZero};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.eventTimesUs = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OSortedCopyOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.sortedCopyOf(CUES_BY_START_TIME_ASCENDING, list);
        int i = 0;
        for (int i2 = 0; i2 < o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OSortedCopyOf.size(); i2++) {
            CuesWithTiming cuesWithTiming2 = (CuesWithTiming) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OSortedCopyOf.get(i2);
            long jNormalizeUnsetStartTimeToZero2 = normalizeUnsetStartTimeToZero(cuesWithTiming2.startTimeUs);
            long j = cuesWithTiming2.durationUs + jNormalizeUnsetStartTimeToZero2;
            if (i != 0) {
                int i3 = i - 1;
                long j2 = this.eventTimesUs[i3];
                if (j2 < jNormalizeUnsetStartTimeToZero2) {
                    this.eventTimesUs[i] = jNormalizeUnsetStartTimeToZero2;
                    arrayList.add(cuesWithTiming2.cues);
                    i++;
                } else if (j2 == jNormalizeUnsetStartTimeToZero2 && ((O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) arrayList.get(i3)).isEmpty()) {
                    arrayList.set(i3, cuesWithTiming2.cues);
                } else {
                    Log.w(TAG, "Truncating unsupported overlapping cues.");
                    this.eventTimesUs[i3] = jNormalizeUnsetStartTimeToZero2;
                    arrayList.set(i3, cuesWithTiming2.cues);
                }
            } else {
                this.eventTimesUs[i] = jNormalizeUnsetStartTimeToZero2;
                arrayList.add(cuesWithTiming2.cues);
                i++;
            }
            if (cuesWithTiming2.durationUs != C.TIME_UNSET) {
                this.eventTimesUs[i] = j;
                arrayList.add(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
                i++;
            }
        }
        this.eventCues = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable lambda$static$0(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs));
    }

    private static long normalizeUnsetStartTimeToZero(long j) {
        if (j == C.TIME_UNSET) {
            return 0L;
        }
        return j;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        Assertions.checkArgument(i < this.eventCues.size());
        return this.eventTimesUs[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventCues.size();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j, false, false);
        if (iBinarySearchCeil < this.eventCues.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O getCues(long j) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.eventTimesUs, j, true, false);
        return iBinarySearchFloor == -1 ? O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of() : (O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) this.eventCues.get(iBinarySearchFloor);
    }
}
