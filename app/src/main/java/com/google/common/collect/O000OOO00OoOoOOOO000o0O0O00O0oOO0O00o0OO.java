package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OOO00OoOoOOOO000o0O0O00O0oOO0O00o0OO implements Serializable {
    private final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O ranges;

    public O000OOO00OoOoOOOO000o0O0O00O0oOO0O00o0OO(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) {
        this.ranges = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
    }

    public Object readResolve() {
        if (this.ranges.isEmpty()) {
            return O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o.of();
        }
        return this.ranges.equals(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all())) ? O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o.all() : new O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o(this.ranges);
    }
}
