package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OO0oOOoOO0OooOoOo00OoOOoOOoOOo0o00OO implements Serializable {
    private final O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O domain;
    private final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O ranges;

    public O000OO0oOOoOO0OooOoOo00OoOOoOOoOOo0o00OO(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        this.ranges = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
        this.domain = o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O;
    }

    public Object readResolve() {
        return new O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o(this.ranges).asSet(this.domain);
    }
}
