package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class O00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final TreeMap f3687O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new TreeMap();

    public final Map O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return new O00O0000oOooO0oOOOooo00o00O0O0o0OoOo0o00(this, this.f3687O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.values());
    }

    public final Map.Entry O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Long l) {
        Map.Entry entryFloorEntry = this.f3687O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.floorEntry(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowValue(l));
        if (entryFloorEntry == null || !((O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O) entryFloorEntry.getValue()).f3685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.contains(l)) {
            return null;
        }
        return (Map.Entry) entryFloorEntry.getValue();
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0, Object obj) {
        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isEmpty()) {
            return;
        }
        obj.getClass();
        boolean zIsEmpty = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isEmpty();
        TreeMap treeMap = this.f3687O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (!zIsEmpty) {
            Map.Entry entryLowerEntry = treeMap.lowerEntry(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound);
            if (entryLowerEntry != null) {
                O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O o00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O = (O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O) entryLowerEntry.getValue();
                if (o00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O.f3685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.upperBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound) > 0) {
                    O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1 = o00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O.f3685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.upperBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound) > 0) {
                        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound;
                        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2 = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.upperBound;
                        treeMap.put(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, new O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2), ((O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O) entryLowerEntry.getValue()).f3686O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
                    }
                    O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo3 = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.lowerBound;
                    O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo4 = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound;
                    treeMap.put(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo3, new O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo3, o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo4), ((O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O) entryLowerEntry.getValue()).f3686O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
                }
            }
            Map.Entry entryLowerEntry2 = treeMap.lowerEntry(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound);
            if (entryLowerEntry2 != null) {
                O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O o00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O2 = (O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O) entryLowerEntry2.getValue();
                if (o00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O2.f3685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.upperBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound) > 0) {
                    O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo5 = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound;
                    O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo6 = o00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O2.f3685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.upperBound;
                    treeMap.put(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo5, new O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo5, o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo6), ((O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O) entryLowerEntry2.getValue()).f3686O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
                }
            }
            treeMap.subMap(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound).clear();
        }
        treeMap.put(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound, new O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0, obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO)) {
            return false;
        }
        return ((AbstractMap) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()).equals(((O00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO) obj).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
    }

    public final int hashCode() {
        return ((AbstractMap) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()).hashCode();
    }

    public final String toString() {
        return this.f3687O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.values().toString();
    }
}
