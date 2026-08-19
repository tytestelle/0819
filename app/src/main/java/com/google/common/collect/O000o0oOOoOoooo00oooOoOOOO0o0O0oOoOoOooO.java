package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000o0oOOoOoooo00oooOoOOOO0o0O0oOoOoOooO extends AbstractMap {
    public abstract Iterator O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, 2);
    }
}
