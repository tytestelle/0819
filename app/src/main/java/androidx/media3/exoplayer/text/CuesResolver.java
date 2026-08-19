package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;

/* JADX INFO: loaded from: classes.dex */
interface CuesResolver {
    boolean addCues(CuesWithTiming cuesWithTiming, long j);

    void clear();

    void discardCuesBeforeTimeUs(long j);

    O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O getCuesAtTimeUs(long j);

    long getNextCueChangeTimeUs(long j);

    long getPreviousCueChangeTimeUs(long j);
}
