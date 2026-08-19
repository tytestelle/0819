package com.bumptech.glide.manager;

import O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements Handler.Callback {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f2909O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public volatile com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o f2910O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f2911O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f2912O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f2913O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
        new ArrayMap();
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = f2909O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.f2911O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f2913O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        this.f2912O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f616O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO && O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f615O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) ? new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() : new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    public static Activity O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.f826O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f2910O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
            synchronized (this) {
                try {
                    if (this.f2910O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
                        com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(context.getApplicationContext());
                        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f2911O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                        Context applicationContext = context.getApplicationContext();
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                        this.f2910O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3, applicationContext);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f2910O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(FragmentActivity fragmentActivity) {
        char[] cArr = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.f826O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f2912O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(fragmentActivity);
        Activity activityO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(fragmentActivity);
        boolean z = activityO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null || !activityO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isFinishing();
        com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(fragmentActivity.getApplicationContext());
        Lifecycle lifecycle = fragmentActivity.getLifecycle();
        fragmentActivity.getSupportFragmentManager();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f2913O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass();
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        HashMap map = (HashMap) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) map.get(lifecycle);
        if (o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o != null) {
            return o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).getClass();
        com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2 = new com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2, lifecycleLifecycle, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, fragmentActivity);
        map.put(lifecycle, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2);
        lifecycleLifecycle.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, lifecycle));
        if (z) {
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.onStart();
        }
        return o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
