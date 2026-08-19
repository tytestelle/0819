package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2456O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2457O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f2458O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ boolean f2459O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(AnalyticsListener.EventTime eventTime, int i, int i2, boolean z) {
        this.f2456O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f2457O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2459O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = z;
        this.f2458O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2456O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onPlayerStateChanged(this.f2457O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2459O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f2458O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 1:
                ((AnalyticsListener) obj).onDeviceVolumeChanged(this.f2457O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2458O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2459O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(this.f2457O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2459O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f2458O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }

    public /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(AnalyticsListener.EventTime eventTime, int i, boolean z) {
        this.f2456O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 1;
        this.f2457O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2458O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        this.f2459O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = z;
    }
}
