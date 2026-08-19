package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class O000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO extends O000o0oOo0o00o00oOOOO00O0OO0OooO0OO00o00 implements NavigableSet, SortedSet {
    @Override // com.google.common.collect.O000o0oOo0o00o00oOOOO00O0OO0OooO0OO00o00
    public final Map O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return (NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).ceilingKey(obj);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).comparator();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return ((NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).descendingKeySet();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return ((NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).firstKey();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return ((NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).headMap(obj, z).navigableKeySet();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).higherKey(obj);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return ((NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).lastKey();
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(((NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).pollFirstEntry());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(((NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).pollLastEntry());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return ((NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).subMap(obj, z, obj2, z2).navigableKeySet();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return ((NavigableMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).tailMap(obj, z).navigableKeySet();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
