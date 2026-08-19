package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OOOOO00000o0oOOOOOOO0o00O0OoOooO00oo implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] elements;

    public O000OOOOO00000o0oOOOOOOO0o00O0OoOooO00oo(Object[] objArr) {
        this.elements = objArr;
    }

    public Object readResolve() {
        return O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.copyOf(this.elements);
    }
}
