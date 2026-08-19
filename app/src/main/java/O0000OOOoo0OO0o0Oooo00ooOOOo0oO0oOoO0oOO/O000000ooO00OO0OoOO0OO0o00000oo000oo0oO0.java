package O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;

import android.content.Context;
import xyz.doikki.videoplayer.player.AbstractPlayer;
import xyz.doikki.videoplayer.player.PlayerFactory;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 extends PlayerFactory {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f993O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i) {
        this.f993O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // xyz.doikki.videoplayer.player.PlayerFactory
    public final AbstractPlayer createPlayer(Context context) {
        switch (this.f993O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context);
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f975O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = "";
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f976O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = "";
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f977O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = "";
                return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            case 1:
                return new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(context);
            default:
                return new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(context);
        }
    }
}
