package androidx.media3.extractor.text;

import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class CuesWithTiming {
    public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O cues;
    public final long durationUs;
    public final long endTimeUs;
    public final long startTimeUs;

    public CuesWithTiming(List<Cue> list, long j, long j2) {
        this.cues = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list);
        this.startTimeUs = j;
        this.durationUs = j2;
        long j3 = C.TIME_UNSET;
        if (j != C.TIME_UNSET && j2 != C.TIME_UNSET) {
            j3 = j + j2;
        }
        this.endTimeUs = j3;
    }
}
