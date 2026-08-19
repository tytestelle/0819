package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2435O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2436O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ String f2437O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(AnalyticsListener.EventTime eventTime, String str, int i) {
        this.f2435O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2436O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2437O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = str;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2435O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onAudioDecoderReleased(this.f2436O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2437O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((AnalyticsListener) obj).onVideoDecoderReleased(this.f2436O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2437O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
