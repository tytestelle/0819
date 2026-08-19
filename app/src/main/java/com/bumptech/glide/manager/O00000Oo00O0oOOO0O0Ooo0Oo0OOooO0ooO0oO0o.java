package com.bumptech.glide.manager;

import android.content.IntentFilter;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2920O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, int i) {
        this.f2920O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2920O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = this.f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.f2926O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                try {
                    O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2 = this.f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2.f2923O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.registerReceiver(o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2.f2928O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2927O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = true;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e);
                    }
                    this.f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2927O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = false;
                    return;
                }
                break;
            case 1:
                if (this.f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2927O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                    this.f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2927O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = false;
                    O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o3 = this.f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o3.f2923O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.unregisterReceiver(o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o3.f2928O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                    break;
                }
                break;
            default:
                boolean z = this.f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2926O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o4 = this.f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o4.f2926O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o4.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                if (z != this.f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2926O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + this.f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2926O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    }
                    O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o5 = this.f2921O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO().post(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(1, o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o5, o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o5.f2926O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo));
                }
                break;
        }
    }
}
