package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O0OOO0OooOOO0oOOOoOo00o0Oo00Oo0Oo00O implements Serializable {
    private static final long serialVersionUID = 0;
    final O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o map;

    public O000O0OOO0OooOOO0oOOOoOo00o0Oo00Oo0Oo00O(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o) {
        this.map = o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
    }

    public Object readResolve() {
        return this.map.entrySet();
    }
}
