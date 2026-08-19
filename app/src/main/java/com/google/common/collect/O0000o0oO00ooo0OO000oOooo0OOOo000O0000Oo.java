package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo extends O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o {
    public O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        super(o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O asList() {
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return false;
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o, com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 createDescendingSet() {
        return O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0.emptySet(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().reverse());
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o, com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o headSetImpl(Comparable comparable, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public int indexOf(@CheckForNull Object obj) {
        return -1;
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o intersection(O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o) {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0
    public boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o
    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 range() {
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o, com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o subSetImpl(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o, com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o tailSetImpl(Comparable comparable, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o, java.util.AbstractCollection
    public String toString() {
        return "[]";
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o, com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return new O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO(this.domain, null);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo descendingIterator() {
        return O000Oo00OoOOooO000o0oOo00oOo0OOOo0OOOo0o.f3558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.SortedSet
    public Comparable first() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return O000Oo00OoOOooO000o0oOo00oOo0OOOo0OOOo0o.f3558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.SortedSet
    public Comparable last() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o
    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 range(O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1) {
        throw new NoSuchElementException();
    }
}
