package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo extends O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o implements SortedSet {
    @Override // java.util.SortedSet
    @CheckForNull
    public Comparator<Object> comparator() {
        return delegate().comparator();
    }

    @Override // com.google.common.collect.O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o, com.google.common.collect.O0000oOOoO0ooo0o0o0OO0oOoo0oO0o000OoOooO, com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o
    public abstract SortedSet delegate();

    @Override // java.util.SortedSet
    public Object first() {
        return delegate().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> headSet(Object obj) {
        return delegate().headSet(obj);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return delegate().last();
    }

    public boolean standardContains(@CheckForNull Object obj) {
        try {
            Object objFirst = tailSet(obj).first();
            Comparator<Object> comparator = comparator();
            return (comparator == null ? ((Comparable) objFirst).compareTo(obj) : comparator.compare(objFirst, obj)) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    public boolean standardRemove(@CheckForNull Object obj) {
        try {
            Iterator<Object> it = tailSet(obj).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                Comparator<Object> comparator = comparator();
                if ((comparator == null ? ((Comparable) next).compareTo(obj) : comparator.compare(next, obj)) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public SortedSet<Object> standardSubSet(Object obj, Object obj2) {
        return tailSet(obj).headSet(obj2);
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> subSet(Object obj, Object obj2) {
        return delegate().subSet(obj, obj2);
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> tailSet(Object obj) {
        return delegate().tailSet(obj);
    }
}
