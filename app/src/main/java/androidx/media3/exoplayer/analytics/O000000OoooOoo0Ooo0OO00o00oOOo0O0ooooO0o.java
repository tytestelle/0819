package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2426O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2427O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f2428O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, int i) {
        this.f2426O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2427O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2428O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = decoderCounters;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2426O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onAudioEnabled(this.f2427O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2428O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 1:
                ((AnalyticsListener) obj).onAudioDisabled(this.f2427O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2428O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 2:
                ((AnalyticsListener) obj).onVideoDisabled(this.f2427O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2428O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((AnalyticsListener) obj).onVideoEnabled(this.f2427O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2428O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
