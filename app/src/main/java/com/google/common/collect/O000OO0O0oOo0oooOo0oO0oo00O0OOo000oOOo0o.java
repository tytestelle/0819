package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OO0O0oOo0oooOo0oO0oo00O0OOo000oOOo0o implements Serializable {
    final O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 multiset;

    public O000OO0O0oOo0oooOo0oO0oo00O0OOo000oOOo0o(O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 o000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0) {
        this.multiset = o000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0;
    }

    public Object readResolve() {
        return this.multiset.entrySet();
    }
}
