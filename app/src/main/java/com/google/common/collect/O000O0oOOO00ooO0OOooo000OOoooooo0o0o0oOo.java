package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O0oOOO00ooO0OOooo000OOoooooo0o0o0oOo implements Serializable {
    final O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo multimap;

    public O000O0oOOO00ooO0OOooo000OOoooooo0o0o0oOo(O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo) {
        this.multimap = o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo;
    }

    public Object readResolve() {
        return this.multimap.keys();
    }
}
