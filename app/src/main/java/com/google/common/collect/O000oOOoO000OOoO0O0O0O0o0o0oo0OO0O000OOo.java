package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oOOoO000OOoO0O0O0O0o0o0oo0OO0O000OOo extends ClassCastException {
    private static final long serialVersionUID = 0;
    final Object value;

    public O000oOOoO000OOoO0O0O0O0o0o0oo0OO0O000OOo(Object obj) {
        super("Cannot compare value: " + obj);
        this.value = obj;
    }
}
