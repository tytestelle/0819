package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OoOo0ooOoo0o0OO0oooooOOOO0OOoo0O0OOO extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final List<Object> fromList;
    final com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo function;

    public O000OoOo0ooOoo0o0OO0oooooOOOO0OOoo0O0OOO(List<Object> list, com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        list.getClass();
        this.fromList = list;
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        this.function = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.function.apply(this.fromList.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Object> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator(int i) {
        return new O000OoOo000OO000O0OOOOOOo0oO0O0oO00ooOOo(this, this.fromList.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        return this.function.apply(this.fromList.remove(i));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        this.fromList.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.fromList.size();
    }
}
