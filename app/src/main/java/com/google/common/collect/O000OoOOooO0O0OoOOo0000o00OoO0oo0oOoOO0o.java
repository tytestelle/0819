package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OoOOooO0O0OoOOo0000o00OoO0oo0oOoOO0o extends AbstractList implements Serializable, RandomAccess {
    private static final long serialVersionUID = 0;
    final Object first;
    final Object[] rest;

    public O000OoOOooO0O0OoOOo0000o00OoO0oo0oOoOO0o(Object obj, Object[] objArr) {
        this.first = obj;
        objArr.getClass();
        this.rest = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, size());
        return i == 0 ? this.first : this.rest[i - 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(((long) this.rest.length) + ((long) 1));
    }
}
