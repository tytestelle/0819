package com.google.common.util.concurrent;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 extends O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public static final O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f3748O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public static final O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o f3749O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.class);

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public volatile Set f3750O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public volatile int f3751O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    static {
        Throwable th;
        O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
        try {
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(AtomicReferenceFieldUpdater.newUpdater(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.class, Set.class, "O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo"), AtomicIntegerFieldUpdater.newUpdater(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.class, "O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o();
        }
        f3748O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
        if (th != null) {
            f3749O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
