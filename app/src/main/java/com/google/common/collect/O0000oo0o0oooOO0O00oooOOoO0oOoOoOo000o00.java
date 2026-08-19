package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00 extends O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O implements Serializable {
    private static final long serialVersionUID = 0;
    final Object key;
    final Object value;

    public O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00(Object obj, Object obj2) {
        this.key = obj;
        this.value = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.value;
    }

    @Override // com.google.common.collect.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
