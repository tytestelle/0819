package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo extends O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements Serializable {
    static final O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo INSTANCE = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO
    public boolean doEquivalent(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO
    public int doHash(Object obj) {
        return obj.hashCode();
    }
}
