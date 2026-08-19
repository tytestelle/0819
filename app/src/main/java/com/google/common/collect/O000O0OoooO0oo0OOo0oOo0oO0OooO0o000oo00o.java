package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O0OoooO0oo0OOo0oOo0oO0OooO0o000oo00o extends O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo {
    private final O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o map;

    public O000O0OoooO0oo0OOo0oOo0oO0OooO0o000oo00o(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o) {
        this.map = o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O asList() {
        return new O000O0OooOOoo0000o00OOOooooooOo0OO0OOOoO(this, this.map.entrySet().asList());
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return obj != null && O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(iterator(), obj);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.map.size();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return new O000O0OooOoOoOoO0oo00O0OO0ooOo00oOOOo00O(this.map);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return new O000O0O00OO0oOo0O00o0ooO0OOOoO00Oo0OO0oo(this);
    }
}
