package com.google.common.util.concurrent;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 extends O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final Unsafe f3730O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final long f3731O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final long f3732O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final long f3733O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final long f3734O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final long f3735O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo());
            }
            try {
                f3732O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = unsafe.objectFieldOffset(O00000OOoOOO00O00o0ooooooooO000ooooO0000.class.getDeclaredField("O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o"));
                f3731O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = unsafe.objectFieldOffset(O00000OOoOOO00O00o0ooooooooO000ooooO0000.class.getDeclaredField("O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO"));
                f3733O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = unsafe.objectFieldOffset(O00000OOoOOO00O00o0ooooooooO000ooooO0000.class.getDeclaredField("O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO"));
                f3734O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = unsafe.objectFieldOffset(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.class.getDeclaredField("O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO"));
                f3735O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = unsafe.objectFieldOffset(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.class.getDeclaredField("O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO"));
                f3730O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = unsafe;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2) {
        return O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(f3730O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o00000OOoOOO00O00o0ooooooooO000ooooO0000, f3731O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2);
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final boolean O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, Object obj, Object obj2) {
        return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(f3730O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o00000OOoOOO00O00o0ooooooooO000ooooO0000, f3733O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, obj, obj2);
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final boolean O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01) {
        return O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(f3730O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o00000OOoOOO00O00o0ooooooooO000ooooO0000, f3732O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01);
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f3719O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        do {
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OOoOOO00O00o0ooooooooO000ooooO0000.f3744O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 == o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                return o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            }
        } while (!O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o00000OOoOOO00O00o0ooooooooO000ooooO0000, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2));
        return o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3736O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        do {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OOoOOO00O00o0ooooooooO000ooooO0000.f3745O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 == o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
                return o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
            }
        } while (!O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o00000OOoOOO00O00o0ooooooooO000ooooO0000, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01));
        return o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final void O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01) {
        f3730O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.putObject(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, f3735O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01);
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, Thread thread) {
        f3730O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.putObject(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, f3734O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, thread);
    }
}
