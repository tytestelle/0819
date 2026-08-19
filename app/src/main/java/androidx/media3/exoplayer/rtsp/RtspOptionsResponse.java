package androidx.media3.exoplayer.rtsp;

import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class RtspOptionsResponse {
    public final int status;
    public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O supportedMethods;

    public RtspOptionsResponse(int i, List<Integer> list) {
        this.status = i;
        this.supportedMethods = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list);
    }
}
