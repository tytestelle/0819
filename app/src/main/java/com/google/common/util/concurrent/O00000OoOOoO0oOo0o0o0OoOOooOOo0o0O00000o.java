package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o extends O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    @Override // O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final int O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) {
        int i;
        synchronized (o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) {
            i = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3751O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 - 1;
            o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3751O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = i;
        }
        return i;
    }
}
