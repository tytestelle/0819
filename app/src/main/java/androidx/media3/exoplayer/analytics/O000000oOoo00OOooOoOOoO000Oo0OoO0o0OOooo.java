package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2441O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2442O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f2443O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ long f2444O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ long f2445O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(AnalyticsListener.EventTime eventTime, int i, long j, long j2, int i2) {
        this.f2441O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f2442O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2443O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        this.f2444O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = j;
        this.f2445O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = j2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2441O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onBandwidthEstimate(this.f2442O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2443O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2444O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f2445O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                break;
            default:
                ((AnalyticsListener) obj).onAudioUnderrun(this.f2442O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2443O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2444O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f2445O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                break;
        }
    }
}
