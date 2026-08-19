package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O implements Serializable {
    private static final long serialVersionUID = 0;
    final O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo collection;

    public O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O(O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo o0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) {
        this.collection = o0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo;
    }

    public Object readResolve() {
        return this.collection.asList();
    }
}
