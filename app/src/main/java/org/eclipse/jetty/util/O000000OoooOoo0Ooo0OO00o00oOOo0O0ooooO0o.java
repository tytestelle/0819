package org.eclipse.jetty.util;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends AbstractSet implements Set {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ConcurrentHashMap f4448O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final transient Set f4449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f4448O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = concurrentHashMap;
        this.f4449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = concurrentHashMap.keySet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f4448O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.put(obj, Boolean.TRUE) == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4448O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4448O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f4449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return obj == this || this.f4449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4448O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f4449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f4448O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(obj) != null;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        return this.f4449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        return this.f4449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4448O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return this.f4449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.toArray();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.f4449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return this.f4449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.toArray(objArr);
    }
}
