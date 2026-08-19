package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oo0OO00OoO0o00o0oO00O00o0o0Oo0OO0o0O extends O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final transient O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o f3657O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final transient O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O f3658O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000oo0OO00OoO0o00o0oO00O00o0o0Oo0OO0o0O(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) {
        this.f3657O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
        this.f3658O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O asList() {
        return this.f3658O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.f3657O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get(obj) != null;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f3657O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.size();
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return asList().iterator();
    }
}
