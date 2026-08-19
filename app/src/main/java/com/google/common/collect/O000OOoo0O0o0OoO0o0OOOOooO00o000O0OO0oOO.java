package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OOoo0O0o0OoO0o0OOOOooO00o000O0OO0oOO implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<Object> comparator;
    final Object[] elements;

    public O000OOoo0O0o0OoO0o0OOOOooO00o000O0OO0oOO(Comparator<Object> comparator, Object[] objArr) {
        this.comparator = comparator;
        this.elements = objArr;
    }

    public Object readResolve() {
        O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO o000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO = new O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO(this.comparator);
        o000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this.elements);
        return o000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    }
}
