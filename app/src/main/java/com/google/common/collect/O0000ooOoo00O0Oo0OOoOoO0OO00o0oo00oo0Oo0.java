package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000ooOoo00O0Oo0OOoOoO0OO00o0oo00oo0Oo0 implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] elements;

    public O0000ooOoo00O0Oo0OOoOoO0OO00o0oo00oo0Oo0(Object[] objArr) {
        this.elements = objArr;
    }

    public Object readResolve() {
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf(this.elements);
    }
}
