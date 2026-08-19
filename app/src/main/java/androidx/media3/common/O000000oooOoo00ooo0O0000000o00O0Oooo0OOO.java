package androidx.media3.common;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2241O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ int f2242O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2243O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f2244O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        this.f2242O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
        this.f2243O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = positionInfo;
        this.f2244O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = positionInfo2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2241O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$33(this.f2242O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Player.PositionInfo) this.f2243O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Player.PositionInfo) this.f2244O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (Player.Listener) obj);
                break;
            default:
                ((AnalyticsListener) obj).onMediaItemTransition((AnalyticsListener.EventTime) this.f2243O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (MediaItem) this.f2244O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f2242O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
        }
    }

    public /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
        this.f2243O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = eventTime;
        this.f2244O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = mediaItem;
        this.f2242O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }
}
