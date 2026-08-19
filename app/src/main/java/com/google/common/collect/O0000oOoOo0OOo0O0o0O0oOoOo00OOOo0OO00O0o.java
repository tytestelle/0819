package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o extends O0000oOOoO0ooo0o0o0OO0oOoo0oO0o000OoOooO implements Set {
    @Override // com.google.common.collect.O0000oOOoO0ooo0o0o0OO0oOoo0oO0o000OoOooO, com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o
    public abstract Set delegate();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean standardEquals(@CheckForNull Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this, obj);
    }

    public int standardHashCode() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this);
    }

    public boolean standardRemoveAll(Collection<?> collection) {
        collection.getClass();
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this, collection);
    }
}
