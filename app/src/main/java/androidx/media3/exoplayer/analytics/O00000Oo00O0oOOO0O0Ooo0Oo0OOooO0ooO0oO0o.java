package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2480O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f2481O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f2482O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f2479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2480O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2481O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = loadEventInfo;
        this.f2482O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = mediaLoadData;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onLoadCanceled(this.f2480O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2481O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2482O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                ((AnalyticsListener) obj).onLoadCompleted(this.f2480O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2481O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2482O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
        }
    }
}
