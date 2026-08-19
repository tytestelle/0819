package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO implements Serializable {
    private static final long serialVersionUID = 0;
    private final O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O domain;

    public O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O, O0000o0O0OOoooOOOo0oOoOOO0oOO0O0oO0o000o o0000o0O0OOoooOOOo0oOoOOO0oOO0O0oO0o000o) {
        this.domain = o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O;
    }

    private Object readResolve() {
        return new O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo(this.domain);
    }
}
