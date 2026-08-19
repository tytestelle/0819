package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2460O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2461O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ String f2462O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ long f2463O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ long f2464O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public /* synthetic */ O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(AnalyticsListener.EventTime eventTime, String str, long j, long j2, int i) {
        this.f2460O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2461O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2462O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = str;
        this.f2463O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = j;
        this.f2464O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = j2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2460O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                DefaultAnalyticsCollector.lambda$onAudioDecoderInitialized$5(this.f2461O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2462O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2463O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f2464O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, (AnalyticsListener) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onVideoDecoderInitialized$17(this.f2461O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2462O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2463O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f2464O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, (AnalyticsListener) obj);
                break;
        }
    }
}
