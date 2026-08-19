package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import android.os.Handler;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import com.quickjs.JSArray;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.WebSocket;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O implements com.quickjs.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ListenerSet.Event, ListenerSet.IterationFinishedEvent, O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(Object obj, Object obj2, int i) {
        this.f1513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
    }

    @Override // O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        com.github.tvbox.osc.ui.dialog.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = (com.github.tvbox.osc.ui.dialog.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.notifyItemChanged(0);
        if (i != -1) {
            o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.notifyItemChanged(i);
        }
        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.dismiss();
    }

    @Override // com.quickjs.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O
    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(JSArray jSArray) {
        switch (this.f1513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = (O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getClass();
                int iO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = jSArray.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(0);
                String strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = jSArray.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(1);
                ConcurrentHashMap concurrentHashMap = o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f1535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                WebSocket webSocket = (WebSocket) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                concurrentHashMap.remove(webSocket.request().url().toString());
                webSocket.close(iO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                break;
            default:
                O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2 = (O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2.getClass();
                String str = ((O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f1533O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + "-" + jSArray.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(0);
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2.f1537O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                Runnable runnable = (Runnable) ((HashMap) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).remove(str);
                if (runnable != null) {
                    ((Handler) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).removeCallbacks(runnable);
                }
                break;
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f1513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 2:
                ((AnalyticsListener) obj).onPlaybackParametersChanged((AnalyticsListener.EventTime) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (PlaybackParameters) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 3:
                ((AnalyticsListener) obj).onTrackSelectionParametersChanged((AnalyticsListener.EventTime) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (TrackSelectionParameters) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 4:
                ((AnalyticsListener) obj).onAvailableCommandsChanged((AnalyticsListener.EventTime) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Player.Commands) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 5:
            default:
                ((AnalyticsListener) obj).onCues((AnalyticsListener.EventTime) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (CueGroup) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 6:
                ((AnalyticsListener) obj).onAudioAttributesChanged((AnalyticsListener.EventTime) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (AudioAttributes) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 7:
                ((AnalyticsListener) obj).onMetadata((AnalyticsListener.EventTime) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Metadata) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 8:
                ((AnalyticsListener) obj).onTracksChanged((AnalyticsListener.EventTime) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Tracks) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 9:
                ((AnalyticsListener) obj).onCues((AnalyticsListener.EventTime) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (List<Cue>) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 10:
                ((AnalyticsListener) obj).onDeviceInfoChanged((AnalyticsListener.EventTime) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (DeviceInfo) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 11:
                DefaultAnalyticsCollector.lambda$onVideoSizeChanged$59((AnalyticsListener.EventTime) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (VideoSize) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (AnalyticsListener) obj);
                break;
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((DefaultAnalyticsCollector) this.f1514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$setPlayer$1((Player) this.f1515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (AnalyticsListener) obj, flagSet);
    }
}
