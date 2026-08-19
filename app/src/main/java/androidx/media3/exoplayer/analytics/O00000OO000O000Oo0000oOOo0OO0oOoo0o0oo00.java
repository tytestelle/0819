package androidx.media3.exoplayer.analytics;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2470O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ PlaybackException f2471O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(AnalyticsListener.EventTime eventTime, PlaybackException playbackException, int i) {
        this.f2469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2470O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2471O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = playbackException;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onPlayerErrorChanged(this.f2470O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2471O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((AnalyticsListener) obj).onPlayerError(this.f2470O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2471O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
