package com.bumptech.glide.manager;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o implements O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final Executor f2922O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = AsyncTask.SERIAL_EXECUTOR;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Context f2923O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo f2924O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O f2925O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public volatile boolean f2926O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public volatile boolean f2927O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO f2928O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this);

    public O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(Context context, O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        this.f2923O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = context.getApplicationContext();
        this.f2925O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
        this.f2924O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
    }

    @Override // com.bumptech.glide.manager.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        f2922O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.execute(new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this, 0));
        return true;
    }

    @Override // com.bumptech.glide.manager.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        f2922O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.execute(new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this, 1));
    }

    public final boolean O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f2925O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get()).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }
}
