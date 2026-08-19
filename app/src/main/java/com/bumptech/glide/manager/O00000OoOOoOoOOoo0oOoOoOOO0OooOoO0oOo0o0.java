package com.bumptech.glide.manager;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
import android.content.Context;
import android.os.Build;
import androidx.tracing.Trace;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 implements O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static volatile O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f2929O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2930O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f2931O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Object f2932O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final AbstractCollection f2933O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() {
        this.f2930O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 2;
        this.f2932O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Collections.newSetFromMap(new WeakHashMap());
        this.f2933O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new HashSet();
    }

    public static O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Context context) {
        if (f2929O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
            synchronized (O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.class) {
                try {
                    if (f2929O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
                        f2929O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2929O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    public boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        boolean z = true;
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f2932O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).remove(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        if (!((HashSet) this.f2933O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).remove(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) && !zRemove) {
            z = false;
        }
        if (z) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.clear();
        }
        return z;
    }

    public void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        for (O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o : O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0((Set) this.f2932O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
            if (!o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() && !o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.clear();
                if (this.f2931O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                    ((HashSet) this.f2933O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).add(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                } else {
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                }
            }
        }
    }

    @Override // O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public Object get() {
        if (this.f2931O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.f2931O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
        try {
            return O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0((com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f2932O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (ArrayList) this.f2933O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        } finally {
            this.f2931O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.f2930O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 2:
                return super.toString() + "{numRequests=" + ((Set) this.f2932O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).size() + ", isPaused=" + this.f2931O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + "}";
            default:
                return super.toString();
        }
    }

    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(Context context) {
        Object o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
        this.f2930O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        this.f2933O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new HashSet();
        O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = new O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(context, 2));
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this);
        if (Build.VERSION.SDK_INT >= 24) {
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        } else {
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(context, o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        }
        this.f2932O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
    }

    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, ArrayList arrayList, com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        this.f2930O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 1;
        this.f2932O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f2933O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList;
    }
}
