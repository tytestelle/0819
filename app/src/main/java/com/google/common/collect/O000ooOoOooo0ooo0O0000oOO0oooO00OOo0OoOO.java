package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOO extends AbstractSet {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 f3670O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 f3671O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOO(O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO1) {
        this.f3670O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0;
        this.f3671O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f3670O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.contains(obj) && this.f3671O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f3670O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.containsAll(collection) && this.f3671O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f3671O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f3670O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f3670O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f3671O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
