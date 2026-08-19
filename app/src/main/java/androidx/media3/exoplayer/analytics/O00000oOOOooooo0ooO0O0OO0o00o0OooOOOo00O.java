package androidx.media3.exoplayer.analytics;

import android.media.AudioProfile;
import android.media.MediaDrm;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {
    public static /* bridge */ /* synthetic */ AudioProfile O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* synthetic */ NetworkEvent.Builder O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ PlaybackMetrics.Builder O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(int i) {
        return new TrackChangeEvent.Builder(i);
    }
}
