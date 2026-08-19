package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O implements ListenerSet.Event, Consumer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2493O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2494O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f2495O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f2496O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ Object f2497O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public /* synthetic */ O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        this.f2493O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        this.f2494O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2495O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        this.f2496O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = positionInfo;
        this.f2497O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = positionInfo2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaSourceEventListener.EventDispatcher) this.f2494O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$loadStarted$0((LoadEventInfo) this.f2496O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (MediaLoadData) this.f2497O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f2495O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (MediaSourceEventListener) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f2493O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                DefaultAnalyticsCollector.lambda$onPositionDiscontinuity$46((AnalyticsListener.EventTime) this.f2494O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2495O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Player.PositionInfo) this.f2496O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (Player.PositionInfo) this.f2497O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, (AnalyticsListener) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onLoadStarted$26((AnalyticsListener.EventTime) this.f2494O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (LoadEventInfo) this.f2496O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (MediaLoadData) this.f2497O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f2495O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (AnalyticsListener) obj);
                break;
        }
    }

    public /* synthetic */ O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(Object obj, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i, int i2) {
        this.f2493O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f2494O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2496O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = loadEventInfo;
        this.f2497O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = mediaLoadData;
        this.f2495O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
    }
}
