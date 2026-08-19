package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2476O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2477O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f2478O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, int i) {
        this.f2476O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2477O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2478O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = mediaLoadData;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2476O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onDownstreamFormatChanged(this.f2477O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2478O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((AnalyticsListener) obj).onUpstreamDiscarded(this.f2477O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2478O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
