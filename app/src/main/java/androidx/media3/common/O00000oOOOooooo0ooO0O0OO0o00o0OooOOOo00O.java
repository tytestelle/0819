package androidx.media3.common;

import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O implements SimpleBasePlayer.PositionSupplier, SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ long f2290O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(long j) {
        this.f2290O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = j;
    }

    @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
    public long get() {
        return O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f2290O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(Deque deque) {
        return SlidingWeightedAverageBandwidthStatistic.lambda$getMaxCountEvictionFunction$0(this.f2290O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, deque);
    }
}
