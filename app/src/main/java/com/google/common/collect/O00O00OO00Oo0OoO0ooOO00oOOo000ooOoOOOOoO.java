package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class O00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO extends O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final NavigableMap f3699O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 f3700O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO(NavigableMap navigableMap) {
        this.f3699O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = navigableMap;
        this.f3700O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all();
    }

    @Override // com.google.common.collect.O000o0oOOoOoooo00oooOoOOOO0o0O0oOoOoOooO
    public final Iterator O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        Map.Entry entryLowerEntry;
        Iterator it;
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = this.f3700O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        boolean zHasLowerBound = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.hasLowerBound();
        NavigableMap navigableMap = this.f3699O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (zHasLowerBound && (entryLowerEntry = navigableMap.lowerEntry((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerEndpoint())) != null) {
            it = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound.isLessThan(((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) entryLowerEntry.getValue()).upperBound) ? navigableMap.tailMap((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) entryLowerEntry.getKey(), true).values().iterator() : navigableMap.tailMap((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerEndpoint(), true).values().iterator();
        } else {
            it = navigableMap.values().iterator();
        }
        return new O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00(this, it, 0);
    }

    @Override // com.google.common.collect.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final Iterator O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = this.f3700O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        boolean zHasUpperBound = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.hasUpperBound();
        NavigableMap navigableMap = this.f3699O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO((zHasUpperBound ? navigableMap.headMap((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperEndpoint(), false).descendingMap().values() : navigableMap.descendingMap().values()).iterator());
        if (o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.hasNext() && o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound.isLessThan(((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()).upperBound)) {
            o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.next();
        }
        return new O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00(this, o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: merged with bridge method [inline-methods] */
    public final O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 get(Object obj) {
        Map.Entry entryLowerEntry;
        if (obj instanceof O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) {
            try {
                O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = (O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) obj;
                if (this.f3700O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.contains(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) && (entryLowerEntry = this.f3699O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lowerEntry(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo)) != null && ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) entryLowerEntry.getValue()).upperBound.equals(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo)) {
                    return (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) entryLowerEntry.getValue();
                }
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final NavigableMap O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1 = this.f3700O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        return o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isConnected(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1) ? new O00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO(this.f3699O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.intersection(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1)) : O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00.of();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upTo((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) obj, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z)));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (this.f3700O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all())) {
            return this.f3699O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isEmpty();
        }
        return !((O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()).hasNext();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3700O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all()) ? this.f3699O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size() : O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00((O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.range((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) obj, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z), (O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) obj2, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z2)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.downTo((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) obj, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z)));
    }

    public O00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO(NavigableMap navigableMap, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        this.f3699O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = navigableMap;
        this.f3700O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;
    }
}
