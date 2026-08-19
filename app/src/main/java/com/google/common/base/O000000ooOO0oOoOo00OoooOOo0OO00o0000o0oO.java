package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO extends O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements Serializable {
    static final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO INSTANCE = new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO
    public boolean doEquivalent(Object obj, Object obj2) {
        return false;
    }

    @Override // com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO
    public int doHash(Object obj) {
        return System.identityHashCode(obj);
    }
}
