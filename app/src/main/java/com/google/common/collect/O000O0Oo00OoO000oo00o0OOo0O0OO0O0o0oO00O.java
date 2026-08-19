package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O0Oo00OoO000oo00o0OOo0O0OO0O0o0oO00O implements Serializable {
    private static final long serialVersionUID = 0;
    final O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o map;

    public O000O0Oo00OoO000oo00o0OOo0O0OO0O0o0oO00O(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o) {
        this.map = o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
    }

    public Object readResolve() {
        return this.map.keySet();
    }
}
