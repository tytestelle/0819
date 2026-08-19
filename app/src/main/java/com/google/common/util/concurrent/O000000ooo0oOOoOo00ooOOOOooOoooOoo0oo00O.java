package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O {
    public static /* synthetic */ boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Unsafe unsafe, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, long j, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2) {
        while (!unsafe.compareAndSwapObject(o00000OOoOOO00O00o0ooooooooO000ooooO0000, j, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2)) {
            if (unsafe.getObject(o00000OOoOOO00O00o0ooooooooO000ooooO0000, j) != o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                return false;
            }
        }
        return true;
    }
}
