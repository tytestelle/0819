package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
    public static /* synthetic */ boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Unsafe unsafe, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(o00000OOoOOO00O00o0ooooooooO000ooooO0000, j, obj, obj2)) {
            if (unsafe.getObject(o00000OOoOOO00O00o0ooooooooO000ooooO0000, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
