package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2432O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2433O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f2434O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(AnalyticsListener.EventTime eventTime, int i, boolean z) {
        this.f2432O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2433O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2434O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2432O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                DefaultAnalyticsCollector.lambda$onIsLoadingChanged$35(this.f2433O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2434O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (AnalyticsListener) obj);
                break;
            case 1:
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(this.f2433O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2434O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 2:
                ((AnalyticsListener) obj).onIsPlayingChanged(this.f2433O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2434O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((AnalyticsListener) obj).onShuffleModeChanged(this.f2433O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2434O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
