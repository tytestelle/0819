package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O000Ooo0Oo00oOoo0000oOO00OoOoOO0OOOoO0O0 extends AbstractSequentialList implements Serializable {
    private static final long serialVersionUID = 0;
    final List<Object> fromList;
    final com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo function;

    public O000Ooo0Oo00oOoo0000oOO00OoOoOO0OOOoO0O0(List<Object> list, com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        list.getClass();
        this.fromList = list;
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        this.function = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator(int i) {
        return new O000OoOo000OO000O0OOOOOOo0oO0O0oO00ooOOo(this, this.fromList.listIterator(i), 1);
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
