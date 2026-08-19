package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 extends O000o0oOOoOoooo00oooOoOOOO0o0O0oOoOoOooO implements NavigableMap {
    public abstract Iterator O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return new O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this).navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        return (Map.Entry) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(), null);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        Map.Entry entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(floorEntry(obj));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(higherEntry(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return new O000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        return (Map.Entry) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(), null);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        Map.Entry entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return new O000o0oOoO00oO0oO00o000oO0000oOo0oo00oOO(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return (Map.Entry) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return (Map.Entry) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
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
