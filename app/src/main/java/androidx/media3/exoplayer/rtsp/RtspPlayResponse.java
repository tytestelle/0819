package androidx.media3.exoplayer.rtsp;

import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class RtspPlayResponse {
    public final RtspSessionTiming sessionTiming;
    public final int status;
    public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O trackTimingList;

    public RtspPlayResponse(int i, RtspSessionTiming rtspSessionTiming, List<RtspTrackTiming> list) {
        this.status = i;
        this.sessionTiming = rtspSessionTiming;
        this.trackTimingList = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list);
    }
}
