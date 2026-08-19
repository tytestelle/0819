package androidx.media3.exoplayer.analytics;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2490O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2491O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ MediaMetadata f2492O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata, int i) {
        this.f2490O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2491O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2492O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = mediaMetadata;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2490O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onPlaylistMetadataChanged(this.f2491O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2492O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((AnalyticsListener) obj).onMediaMetadataChanged(this.f2491O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2492O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
