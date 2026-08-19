package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2424O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2425O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(AnalyticsListener.EventTime eventTime, int i) {
        this.f2424O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2425O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2424O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onPlayerReleased(this.f2425O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 1:
                ((AnalyticsListener) obj).onDrmKeysRemoved(this.f2425O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 2:
                ((AnalyticsListener) obj).onDrmKeysRestored(this.f2425O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 3:
                ((AnalyticsListener) obj).onSeekStarted(this.f2425O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 4:
                ((AnalyticsListener) obj).onDrmKeysLoaded(this.f2425O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                ((AnalyticsListener) obj).onDrmSessionReleased(this.f2425O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
        }
    }
}
