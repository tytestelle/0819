package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.exoplayer.upstream.experimental.ExperimentalBandwidthMeter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements NetworkTypeObserver.Listener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2702O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2703O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj, int i) {
        this.f2702O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2703O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
    public final void onNetworkTypeChanged(int i) {
        switch (this.f2702O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((DefaultBandwidthMeter) this.f2703O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).onNetworkTypeChanged(i);
                break;
            default:
                ((ExperimentalBandwidthMeter) this.f2703O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).onNetworkTypeChanged(i);
                break;
        }
    }
}
