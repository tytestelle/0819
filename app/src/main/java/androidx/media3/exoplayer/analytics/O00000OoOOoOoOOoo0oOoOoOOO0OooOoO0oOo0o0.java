package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2487O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2488O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ AudioSink.AudioTrackConfig f2489O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.f2487O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2488O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2489O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = audioTrackConfig;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2487O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onAudioTrackInitialized(this.f2488O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2489O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((AnalyticsListener) obj).onAudioTrackReleased(this.f2488O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2489O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
