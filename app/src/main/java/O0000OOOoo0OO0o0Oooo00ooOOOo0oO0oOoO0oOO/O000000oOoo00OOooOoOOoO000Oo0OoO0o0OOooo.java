package O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;

import android.content.Context;
import xyz.doikki.videoplayer.player.AbstractPlayer;
import xyz.doikki.videoplayer.player.PlayerFactory;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo extends PlayerFactory {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f991O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ String f992O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(String str, int i) {
        this.f991O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f992O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str;
    }

    @Override // xyz.doikki.videoplayer.player.PlayerFactory
    public final AbstractPlayer createPlayer(Context context) {
        switch (this.f991O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(context, 1, this.f992O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            default:
                return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(context, 0, this.f992O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }
}
