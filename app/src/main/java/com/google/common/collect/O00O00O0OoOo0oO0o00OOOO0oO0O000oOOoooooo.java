package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class O00O00O0OoOo0oO0o00OOOO0oO0O000oOOoooooo extends O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final NavigableMap f3693O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO f3694O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 f3695O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O00O00O0OoOo0oO0o00OOOO0oO0O000oOOoooooo(NavigableMap navigableMap, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        this.f3693O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = navigableMap;
        this.f3694O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO(navigableMap);
        this.f3695O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;
    }

    @Override // com.google.common.collect.O000o0oOOoOoooo00oooOoOOOO0o0O0oOoOoOooO
    public final Iterator O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        Collection collectionValues;
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoBelowAll;
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = this.f3695O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        boolean zHasLowerBound = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.hasLowerBound();
        O00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO o00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO = this.f3694O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (zHasLowerBound) {
            collectionValues = o00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO.tailMap((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerEndpoint(), o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBoundType() == O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.CLOSED).values();
        } else {
            collectionValues = o00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO.values();
        }
        O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(collectionValues.iterator());
        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.contains(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll()) && (!o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.hasNext() || ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()).lowerBound != O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll())) {
            o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoBelowAll = O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll();
        } else {
            if (!o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.hasNext()) {
                return O000Oo00OoOOooO000o0oOo00oOo0OOOo0OOOo0o.f3558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            }
            o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoBelowAll = ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.next()).upperBound;
        }
        return new O00O00O00ooO0oOOooO0oOOO00Oo0OO0Oo0O00o0(this, o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoBelowAll, o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, 0);
    }

    @Override // com.google.common.collect.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final Iterator O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo;
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = this.f3695O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(this.f3694O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.headMap(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.hasUpperBound() ? (O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperEndpoint() : O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveAll(), o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.hasUpperBound() && o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBoundType() == O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.CLOSED).descendingMap().values().iterator());
        boolean zHasNext = o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.hasNext();
        NavigableMap navigableMap = this.f3693O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (zHasNext) {
            o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()).upperBound == O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveAll() ? ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.next()).lowerBound : (O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) navigableMap.higherKey(((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()).upperBound);
        } else {
            if (!o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.contains(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll()) || navigableMap.containsKey(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll())) {
                return O000Oo00OoOOooO000o0oOo00oOo0OOOo0OOOo0o.f3558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            }
            o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = (O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) navigableMap.higherKey(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll());
        }
        return new O00O00O00ooO0oOOooO0oOOO00Oo0OO0Oo0O00o0(this, (O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveAll()), o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: merged with bridge method [inline-methods] */
    public final O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 get(Object obj) {
        if (obj instanceof O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) {
            try {
                O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = (O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) obj;
                Map.Entry entryFirstEntry = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.downTo(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(true))).firstEntry();
                if (entryFirstEntry != null && ((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) entryFirstEntry.getKey()).equals(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo)) {
                    return (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) entryFirstEntry.getValue();
                }
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final NavigableMap O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1 = this.f3695O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (!o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.isConnected(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0)) {
            return O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00.of();
        }
        return new O00O00O0OoOo0oO0o00OOOO0oO0O000oOOoooooo(this.f3693O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.intersection(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1));
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
    public final int size() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00((O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.range((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) obj, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z), (O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) obj2, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z2)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.downTo((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) obj, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z)));
    }
}
