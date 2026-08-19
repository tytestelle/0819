package androidx.media3.exoplayer.text;

import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import com.google.common.collect.O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class MergingCuesResolver implements CuesResolver {
    private static final O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo CUES_DISPLAY_PRIORITY_COMPARATOR;
    private final List<CuesWithTiming> cuesWithTimingList = new ArrayList();

    static {
        final int i = 0;
        final int i2 = 1;
        CUES_DISPLAY_PRIORITY_COMPARATOR = O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().onResultOf(new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() { // from class: androidx.media3.exoplayer.text.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
            @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
            public final Object apply(Object obj) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                switch (i) {
                    case 0:
                        return MergingCuesResolver.lambda$static$0(cuesWithTiming);
                    default:
                        return MergingCuesResolver.lambda$static$1(cuesWithTiming);
                }
            }
        }).compound(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().reverse().onResultOf(new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() { // from class: androidx.media3.exoplayer.text.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
            @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
            public final Object apply(Object obj) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                switch (i2) {
                    case 0:
                        return MergingCuesResolver.lambda$static$0(cuesWithTiming);
                    default:
                        return MergingCuesResolver.lambda$static$1(cuesWithTiming);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$0(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(cuesWithTiming.startTimeUs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$1(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(cuesWithTiming.durationUs);
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public boolean addCues(CuesWithTiming cuesWithTiming, long j) {
        Assertions.checkArgument(cuesWithTiming.startTimeUs != C.TIME_UNSET);
        Assertions.checkArgument(cuesWithTiming.durationUs != C.TIME_UNSET);
        boolean z = cuesWithTiming.startTimeUs <= j && j < cuesWithTiming.endTimeUs;
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j) {
        int i = 0;
        while (i < this.cuesWithTimingList.size()) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            if (j > j2 && j > this.cuesWithTimingList.get(i).endTimeUs) {
                this.cuesWithTimingList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O getCuesAtTimeUs(long j) {
        if (!this.cuesWithTimingList.isEmpty()) {
            if (j >= this.cuesWithTimingList.get(0).startTimeUs) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
                    CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i);
                    if (j >= cuesWithTiming.startTimeUs && j < cuesWithTiming.endTimeUs) {
                        arrayList.add(cuesWithTiming);
                    }
                    if (j < cuesWithTiming.startTimeUs) {
                        break;
                    }
                }
                O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OSortedCopyOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.sortedCopyOf(CUES_DISPLAY_PRIORITY_COMPARATOR, arrayList);
                O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builder();
                for (int i2 = 0; i2 < o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OSortedCopyOf.size(); i2++) {
                    o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(((CuesWithTiming) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OSortedCopyOf.get(i2)).cues);
                }
                return o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            }
        }
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        long jMin = -9223372036854775807L;
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            long j3 = this.cuesWithTimingList.get(i).endTimeUs;
            if (j < j2) {
                if (jMin != C.TIME_UNSET) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == C.TIME_UNSET ? j3 : Math.min(jMin, j3);
            }
        }
        if (jMin != C.TIME_UNSET) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (j < this.cuesWithTimingList.get(0).startTimeUs) {
            return C.TIME_UNSET;
        }
        long jMax = this.cuesWithTimingList.get(0).startTimeUs;
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            long j3 = this.cuesWithTimingList.get(i).endTimeUs;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }
}
