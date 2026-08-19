package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {
    public static /* synthetic */ boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Unsafe unsafe, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, long j, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01) {
        while (!unsafe.compareAndSwapObject(o00000OOoOOO00O00o0ooooooooO000ooooO0000, j, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01)) {
            if (unsafe.getObject(o00000OOoOOO00O00o0ooooooooO000ooooO0000, j) != o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
                return false;
            }
        }
        return true;
    }
}
