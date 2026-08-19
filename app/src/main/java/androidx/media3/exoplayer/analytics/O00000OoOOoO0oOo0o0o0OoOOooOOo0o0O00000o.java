package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Format;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2483O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f2484O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Format f2485O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ DecoderReuseEvaluation f2486O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, int i) {
        this.f2483O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2484O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2485O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = format;
        this.f2486O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = decoderReuseEvaluation;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2483O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onVideoInputFormatChanged(this.f2484O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2485O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2486O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                ((AnalyticsListener) obj).onAudioInputFormatChanged(this.f2484O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2485O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2486O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
        }
    }
}
