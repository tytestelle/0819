package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O extends O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 implements NavigableSet {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 f3391O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, NavigableMap navigableMap) {
        super(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, navigableMap);
        this.f3391O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
    }

    @Override // com.google.common.collect.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: merged with bridge method [inline-methods] */
    public final NavigableMap O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return (NavigableMap) ((SortedMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this.f3391O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().floorKey(obj);
    }

    @Override // com.google.common.collect.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(descendingIterator());
    }

    @Override // com.google.common.collect.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.common.collect.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this.f3391O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this.f3391O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this.f3391O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().tailMap(obj, z));
    }
}
