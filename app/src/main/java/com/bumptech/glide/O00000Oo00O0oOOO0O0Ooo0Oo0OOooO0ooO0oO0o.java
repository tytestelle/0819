package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.manager.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import com.bumptech.glide.manager.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o implements ComponentCallbacks2, com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public static final O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f2863O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f2864O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Context f2865O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final com.bumptech.glide.manager.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f2866O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f2867O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final com.bumptech.glide.manager.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f2868O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 f2869O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f2870O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final com.bumptech.glide.manager.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f2871O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final CopyOnWriteArrayList f2872O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f2873O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    static {
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) new O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO().O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(Bitmap.class);
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f729O00000OOoOOO00O00o0ooooooooO000ooooO0000 = true;
        f2863O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        ((O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) new O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO().O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class)).f729O00000OOoOOO00O00o0ooooooooO000ooooO0000 = true;
    }

    public O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, com.bumptech.glide.manager.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, com.bumptech.glide.manager.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, Context context) {
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
        com.bumptech.glide.manager.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2821O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        this.f2869O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0();
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 14);
        this.f2870O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3;
        this.f2864O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f2866O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        this.f2868O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f2867O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        this.f2865O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = context;
        Context applicationContext = context.getApplicationContext();
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this, o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.getClass();
        boolean z = ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        com.bumptech.glide.manager.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = z ? new com.bumptech.glide.manager.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(applicationContext, o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) : new com.bumptech.glide.manager.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        this.f2871O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        synchronized (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2822O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2822O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2822O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.add(this);
        }
        char[] cArr = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.f826O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
        } else {
            O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO().post(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3);
        }
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        this.f2872O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new CopyOnWriteArrayList(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2818O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2830O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2818O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
            return;
        }
        boolean zO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        if (zO00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
            return;
        }
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f2864O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        synchronized (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2822O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            try {
                Iterator it = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2822O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.iterator();
                while (it.hasNext()) {
                    if (((O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) it.next()).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo)) {
                    }
                }
                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null) {
                    o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(null);
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        try {
            Iterator it = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f2869O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f2934O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).iterator();
            while (it.hasNext()) {
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0((O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) it.next());
            }
            this.f2869O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f2934O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f2867O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f2931O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
        for (O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o : O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0((Set) o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f2932O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
            if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isRunning()) {
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.pause();
                ((HashSet) o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f2933O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).add(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            }
        }
    }

    public final synchronized void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f2867O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f2931O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;
        for (O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o : O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0((Set) o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f2932O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
            if (!o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() && !o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isRunning()) {
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
            }
        }
        ((HashSet) o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f2933O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).clear();
    }

    public final synchronized void O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = (O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.clone();
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f729O00000OOoOOO00O00o0ooooooooO000ooooO0000 && !o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f730O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f730O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = true;
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f729O00000OOoOOO00O00o0ooooooooO000ooooO0000 = true;
        this.f2873O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
    }

    public final synchronized boolean O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
            return true;
        }
        if (!this.f2867O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)) {
            return false;
        }
        this.f2869O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f2934O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final synchronized void onDestroy() {
        this.f2869O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.onDestroy();
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f2867O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        Iterator it = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0((Set) o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f2932O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).iterator();
        while (it.hasNext()) {
            o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) it.next());
        }
        ((HashSet) o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f2933O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).clear();
        this.f2866O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this);
        this.f2866O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f2871O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO().removeCallbacks(this.f2870O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        this.f2864O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final synchronized void onStart() {
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
        this.f2869O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.onStart();
    }

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final synchronized void onStop() {
        this.f2869O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.onStop();
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2867O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + ", treeNode=" + this.f2868O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + "}";
    }
}
