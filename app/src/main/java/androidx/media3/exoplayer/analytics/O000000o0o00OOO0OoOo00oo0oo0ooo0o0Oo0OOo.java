package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements ListenerSet.Event, SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2429O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ long f2431O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(long j, Clock clock) {
        this.f2429O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 4;
        this.f2431O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = j;
        this.f2430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = clock;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f2429O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AnalyticsListener) obj).onSeekForwardIncrementChanged((AnalyticsListener.EventTime) this.f2430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2431O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 1:
                ((AnalyticsListener) obj).onAudioPositionAdvancing((AnalyticsListener.EventTime) this.f2430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2431O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 2:
                ((AnalyticsListener) obj).onSeekBackIncrementChanged((AnalyticsListener.EventTime) this.f2430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2431O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged((AnalyticsListener.EventTime) this.f2430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2431O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(Deque deque) {
        return SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(this.f2431O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Clock) this.f2430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, deque);
    }

    public /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(AnalyticsListener.EventTime eventTime, long j, int i) {
        this.f2429O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f2431O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = j;
    }
}
