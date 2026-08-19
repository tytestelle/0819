package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2346O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f2347O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(boolean z, int i) {
        this.f2346O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2347O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2346O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((Player.Listener) obj).onSkipSilenceEnabledChanged(this.f2347O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 1:
                ((Player.Listener) obj).onShuffleModeEnabledChanged(this.f2347O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                ((Player.Listener) obj).onSkipSilenceEnabledChanged(this.f2347O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
        }
    }
}
