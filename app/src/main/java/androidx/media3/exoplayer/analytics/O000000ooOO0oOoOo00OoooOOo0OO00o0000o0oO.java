package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2448O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Exception f2450O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(AnalyticsListener.EventTime eventTime, Exception exc, int i) {
        this.f2448O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2450O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = exc;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2448O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onVideoCodecError(this.f2449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2450O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 1:
                ((AnalyticsListener) obj).onDrmSessionManagerError(this.f2449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2450O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 2:
                ((AnalyticsListener) obj).onAudioCodecError(this.f2449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2450O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((AnalyticsListener) obj).onAudioSinkError(this.f2449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2450O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
