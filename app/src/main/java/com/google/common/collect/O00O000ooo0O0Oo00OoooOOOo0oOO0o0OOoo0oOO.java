package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class O00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO extends O0000oOOoO0ooo0o0o0OO0oOoo0oO0o000OoOooO implements Set {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Collection f3688O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO(Collection collection) {
        this.f3688O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = collection;
    }

    @Override // com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o
    public final Object delegate() {
        return this.f3688O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this);
    }

    @Override // com.google.common.collect.O0000oOOoO0ooo0o0o0OO0oOoo0oO0o000OoOooO, com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o
    public final Collection delegate() {
        return this.f3688O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }
}
