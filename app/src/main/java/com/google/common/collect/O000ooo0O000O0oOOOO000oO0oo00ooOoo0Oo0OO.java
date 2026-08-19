package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000ooo0O000O0oOOOO000oO0oo00ooOoo0Oo0OO extends O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 {
    final transient Object element;

    public O000ooo0O000O0oOOOO000oO0oo00ooOoo0Oo0OO(Object obj) {
        obj.getClass();
        this.element = obj;
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O asList() {
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(this.element);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.element.equals(obj);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int copyIntoArray(Object[] objArr, int i) {
        objArr[i] = this.element;
        return i + 1;
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.element.hashCode();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "[" + this.element.toString() + ']';
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return new O000Oo0OOoOo00oo0OoooO0o0O0OOoOOooOOO0o0(this.element);
    }
}
