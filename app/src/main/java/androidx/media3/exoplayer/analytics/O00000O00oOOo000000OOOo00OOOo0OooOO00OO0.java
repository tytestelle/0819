package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2466O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ long f2467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ int f2468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(AnalyticsListener.EventTime eventTime, int i, long j) {
        this.f2466O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i;
        this.f2467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onDroppedVideoFrames(this.f2466O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f2467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset(this.f2466O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
        }
    }

    public /* synthetic */ O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(AnalyticsListener.EventTime eventTime, long j, int i) {
        this.f2466O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = j;
        this.f2468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i;
    }
}
