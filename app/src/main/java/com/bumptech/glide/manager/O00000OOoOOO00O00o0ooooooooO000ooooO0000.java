package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OOoOOO00O00o0ooooooooO000ooooO0000 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f2918O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O00000OOoOOO00O00o0ooooooooO000ooooO0000(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        this.f2918O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO().post(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(0, this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO().post(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(0, this, false));
    }
}
