package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 extends O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo implements NavigableMap {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public transient O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo f3425O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f3426O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public transient O000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO f3427O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00) {
        this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.floorEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.floorKey(obj);
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo = this.f3425O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo != null) {
            return o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo;
        }
        Comparator comparator = this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.comparator();
        if (comparator == null) {
            comparator = O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural();
        }
        O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0OoReverse = O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.from(comparator).reverse();
        this.f3425O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0OoReverse;
        return o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0OoReverse;
    }

    @Override // com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o
    public final Object delegate() {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.getClass();
        return new O000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO(o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // com.google.common.collect.O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo, java.util.Map
    public final Set entrySet() {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f3426O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
            return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        }
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, 1);
        this.f3426O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
        return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.lastEntry();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.lastKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.ceilingEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.tailMap(obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.lowerEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.lowerKey(obj);
    }

    @Override // com.google.common.collect.O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo, java.util.Map
    public final Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.firstEntry();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.firstKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.higherEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        O000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO o000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO = this.f3427O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO != null) {
            return o000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO;
        }
        O000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO o000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO2 = new O000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO(this);
        this.f3427O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO2;
        return o000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO2;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.subMap(obj2, z2, obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.headMap(obj, z).descendingMap();
    }

    @Override // com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o
    public final String toString() {
        return standardToString();
    }

    @Override // com.google.common.collect.O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo, java.util.Map, java.util.SortedMap
    public final Collection values() {
        return new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo(this);
    }

    @Override // com.google.common.collect.O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo, com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o
    public final Map delegate() {
        return this.f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
