package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2353O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ int f2354O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(int i, int i2) {
        this.f2353O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f2354O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2353O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((Player.Listener) obj).onRepeatModeChanged(this.f2354O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                ((Player.Listener) obj).onAudioSessionIdChanged(this.f2354O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
        }
    }
}
