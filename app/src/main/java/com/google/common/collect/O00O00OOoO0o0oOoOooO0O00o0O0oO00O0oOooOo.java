package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class O00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo extends O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 f3701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 f3702O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final NavigableMap f3703O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO f3704O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1, NavigableMap navigableMap) {
        o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.getClass();
        this.f3701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;
        o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.getClass();
        this.f3702O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1;
        navigableMap.getClass();
        this.f3703O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = navigableMap;
        this.f3704O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO(navigableMap);
    }

    @Override // com.google.common.collect.O000o0oOOoOoooo00oooOoOOOO0o0O0oOoOoOooO
    public final Iterator O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        Iterator it;
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = this.f3702O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isEmpty()) {
            return O000Oo00OoOOooO000o0oOo00oOo0OOOo0OOOo0o.f3558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        }
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1 = this.f3701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.upperBound.isLessThan(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound)) {
            return O000Oo00OoOOooO000o0oOo00oOo0OOOo0OOOo0o.f3558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        }
        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.lowerBound.isLessThan(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound)) {
            it = this.f3704O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.tailMap(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound, false).values().iterator();
        } else {
            it = this.f3703O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.tailMap((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.lowerBound.endpoint(), o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.lowerBoundType() == O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.CLOSED).values().iterator();
        }
        return new O000OO0o00oO00o0OOOooOOOOooo00OO00o00O00(this, it, (O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().min(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.upperBound, O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowValue(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound)));
    }

    @Override // com.google.common.collect.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final Iterator O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = this.f3702O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isEmpty()) {
            return O000Oo00OoOOooO000o0oOo00oOo0OOOo0OOOo0o.f3558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        }
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = (O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().min(this.f3701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.upperBound, O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowValue(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound));
        return new O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00(this, this.f3703O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.headMap((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.endpoint(), o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.typeAsUpperBound() == O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.CLOSED).descendingMap().values().iterator(), 2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: merged with bridge method [inline-methods] */
    public final O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 get(Object obj) {
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = this.f3702O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (obj instanceof O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) {
            try {
                O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = (O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) obj;
                if (this.f3701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.contains(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) && o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound) >= 0 && o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound) < 0) {
                    boolean zEquals = o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.equals(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound);
                    NavigableMap navigableMap = this.f3703O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    if (zEquals) {
                        Map.Entry entryFloorEntry = navigableMap.floorEntry(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo);
                        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) (entryFloorEntry == null ? null : entryFloorEntry.getValue());
                        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1 != null && o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.upperBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound) > 0) {
                            return o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.intersection(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
                        }
                    } else {
                        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo2 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) navigableMap.get(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo);
                        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo2 != null) {
                            return o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo2.intersection(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
                        }
                    }
                }
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final NavigableMap O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1 = this.f3701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return !o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isConnected(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1) ? O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00.of() : new O00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.intersection(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0), this.f3702O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f3703O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
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
