package com.google.common.collect;

import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO extends O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo implements NavigableSet, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public transient O000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO f3674O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    private final NavigableSet<Object> delegate;
    private final SortedSet<Object> unmodifiableDelegate;

    public O000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO(NavigableSet<Object> navigableSet) {
        navigableSet.getClass();
        this.delegate = navigableSet;
        this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public Object ceiling(Object obj) {
        return this.delegate.ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public Iterator<Object> descendingIterator() {
        Iterator<Object> itDescendingIterator = this.delegate.descendingIterator();
        itDescendingIterator.getClass();
        return itDescendingIterator instanceof O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo ? (O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) itDescendingIterator : new O000O0O00OO0oOo0O00o0ooO0OOOoO00Oo0OO0oo(itDescendingIterator, 2);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> descendingSet() {
        O000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO o000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO = this.f3674O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO != null) {
            return o000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO;
        }
        O000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO o000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO2 = new O000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO(this.delegate.descendingSet());
        this.f3674O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO2;
        o000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO2.f3674O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this;
        return o000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO2;
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public Object floor(Object obj) {
        return this.delegate.floor(obj);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> headSet(Object obj, boolean z) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(this.delegate.headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public Object higher(Object obj) {
        return this.delegate.higher(obj);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public Object lower(Object obj) {
        return this.delegate.lower(obj);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(this.delegate.subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> tailSet(Object obj, boolean z) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(this.delegate.tailSet(obj, z));
    }

    @Override // com.google.common.collect.O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o, com.google.common.collect.O0000oOOoO0ooo0o0o0OO0oOoo0oO0o000OoOooO, com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o
    public SortedSet<Object> delegate() {
        return this.unmodifiableDelegate;
    }
}
