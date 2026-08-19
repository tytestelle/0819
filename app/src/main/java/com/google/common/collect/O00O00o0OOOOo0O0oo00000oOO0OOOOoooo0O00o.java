package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O00O00o0OOOOo0O0oo00000oOO0OOOOoooo0O00o extends O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo implements Serializable {
    static final O00O00o0OOOOo0O0oo00000oOO0OOOOoooo0O00o INSTANCE = new O00O00o0OOOOo0O0oo00000oOO0OOOOoooo0O00o();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
