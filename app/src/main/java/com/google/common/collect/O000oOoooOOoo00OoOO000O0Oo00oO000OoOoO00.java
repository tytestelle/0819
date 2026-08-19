package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oOoooOOoo00OoOO000O0Oo00oO000OoOoO00 implements Serializable {
    final O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O domain;
    final O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 range;

    public O000oOoooOOoo00OoOO000O0Oo00oO000OoOoO00(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0, O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O, O000oOo0oo0o0OO00o00ooo0OOo0Oo0O0O0O0o0O o000oOo0oo0o0OO00o00ooo0OOo0Oo0O0O0O0o0O) {
        this.range = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;
        this.domain = o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O;
    }

    private Object readResolve() {
        return new O000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0(this.range, this.domain);
    }
}
