package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2438O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2439O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f2440O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(AnalyticsListener.EventTime eventTime, int i, int i2) {
        this.f2438O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f2439O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2440O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2438O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onTimelineChanged(this.f2439O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2440O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 1:
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(this.f2439O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2440O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 2:
                ((AnalyticsListener) obj).onPlaybackStateChanged(this.f2439O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2440O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 3:
                DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$64(this.f2439O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2440O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (AnalyticsListener) obj);
                break;
            case 4:
                ((AnalyticsListener) obj).onAudioSessionIdChanged(this.f2439O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2440O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((AnalyticsListener) obj).onRepeatModeChanged(this.f2439O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2440O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
