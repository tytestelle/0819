package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo extends O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 {
    private final O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 forward;

    public O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo(O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 o000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0) {
        super(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.from(o000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0.comparator()).reverse());
        this.forward = o000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0;
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    @CheckForNull
    public Object ceiling(Object obj) {
        return this.forward.floor(obj);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.forward.contains(obj);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 createDescendingSet() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    @CheckForNull
    public Object floor(Object obj) {
        return this.forward.ceiling(obj);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 headSetImpl(Object obj, boolean z) {
        return this.forward.tailSet(obj, z).descendingSet();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    @CheckForNull
    public Object higher(Object obj) {
        return this.forward.lower(obj);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public int indexOf(@CheckForNull Object obj) {
        int iIndexOf = this.forward.indexOf(obj);
        return iIndexOf == -1 ? iIndexOf : (size() - 1) - iIndexOf;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return this.forward.isPartialView();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    @CheckForNull
    public Object lower(Object obj) {
        return this.forward.higher(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.forward.size();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 subSetImpl(Object obj, boolean z, Object obj2, boolean z2) {
        return this.forward.subSet(obj2, z2, obj, z).descendingSet();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 tailSetImpl(Object obj, boolean z) {
        return this.forward.headSet(obj, z).descendingSet();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo descendingIterator() {
        return this.forward.iterator();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 descendingSet() {
        return this.forward;
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return this.forward.descendingIterator();
    }
}
