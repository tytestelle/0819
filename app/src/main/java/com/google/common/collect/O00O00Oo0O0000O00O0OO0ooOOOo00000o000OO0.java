package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public class O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 extends O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o implements Serializable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public transient O00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO f3705O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient O00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO f3706O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public transient O00O00O0000OoOOoO000o0oooOo0o0O0ooOO0o00 f3707O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    final NavigableMap<O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> rangesByLowerBound;

    public static O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 access$600(O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0.getClass();
        o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.getClass();
        Map.Entry<O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> entryFloorEntry = o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0.rangesByLowerBound.floorEntry(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound);
        if (entryFloorEntry == null || !entryFloorEntry.getValue().encloses(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    public static <C extends Comparable<?>> O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 create() {
        return new O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0(new TreeMap());
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isEmpty()) {
            this.rangesByLowerBound.remove(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound);
        } else {
            this.rangesByLowerBound.put(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
        }
    }

    public void add(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.getClass();
        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isEmpty()) {
            return;
        }
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound;
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2 = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound;
        Map.Entry<O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> entryLowerEntry = this.rangesByLowerBound.lowerEntry(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo);
        if (entryLowerEntry != null) {
            O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) >= 0) {
                if (value.upperBound.compareTo(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2) >= 0) {
                    o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2 = value.upperBound;
                }
                o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = value.lowerBound;
            }
        }
        Map.Entry<O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> entryFloorEntry = this.rangesByLowerBound.floorEntry(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2);
        if (entryFloorEntry != null) {
            O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 value2 = entryFloorEntry.getValue();
            if (value2.upperBound.compareTo(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2) >= 0) {
                o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2 = value2.upperBound;
            }
        }
        this.rangesByLowerBound.subMap(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2).clear();
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2));
    }

    public void addAll(O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0) {
        addAll(o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0.asRanges());
    }

    public Set<O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> asDescendingSetOfRanges() {
        O00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO o00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO = this.f3706O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO != null) {
            return o00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO;
        }
        O00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO o00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO2 = new O00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO(this.rangesByLowerBound.descendingMap().values());
        this.f3706O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO2;
        return o00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO2;
    }

    @Override // com.google.common.collect.O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0
    public Set<O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> asRanges() {
        O00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO o00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO = this.f3705O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO != null) {
            return o00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO;
        }
        O00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO o00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO2 = new O00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO(this.rangesByLowerBound.values());
        this.f3705O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO2;
        return o00O000ooo0O0Oo00OoooOOOo0oOO0o0OOoo0oOO2;
    }

    public void clear() {
        remove(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all());
    }

    @Override // com.google.common.collect.O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0
    public O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 complement() {
        O00O00O0000OoOOoO000o0oooOo0o0O0ooOO0o00 o00O00O0000OoOOoO000o0oooOo0o0O0ooOO0o00 = this.f3707O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o00O00O0000OoOOoO000o0oooOo0o0O0ooOO0o00 != null) {
            return o00O00O0000OoOOoO000o0oooOo0o0O0ooOO0o00;
        }
        O00O00O0000OoOOoO000o0oooOo0o0O0ooOO0o00 o00O00O0000OoOOoO000o0oooOo0o0O0ooOO0o01 = new O00O00O0000OoOOoO000o0oooOo0o0O0ooOO0o00(this);
        this.f3707O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00O00O0000OoOOoO000o0oooOo0o0O0ooOO0o01;
        return o00O00O0000OoOOoO000o0oooOo0o0O0ooOO0o01;
    }

    public boolean contains(Comparable comparable) {
        return rangeContaining(comparable) != null;
    }

    @Override // com.google.common.collect.O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0
    public boolean encloses(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.getClass();
        Map.Entry<O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> entryFloorEntry = this.rangesByLowerBound.floorEntry(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound);
        return entryFloorEntry != null && entryFloorEntry.getValue().encloses(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
    }

    public boolean enclosesAll(O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0) {
        return enclosesAll(o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0.asRanges());
    }

    @Override // com.google.common.collect.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    public boolean intersects(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.getClass();
        Map.Entry<O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> entryCeilingEntry = this.rangesByLowerBound.ceilingEntry(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound);
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().isConnected(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) && !entryCeilingEntry.getValue().intersection(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0).isEmpty()) {
            return true;
        }
        Map.Entry<O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> entryLowerEntry = this.rangesByLowerBound.lowerEntry(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound);
        return (entryLowerEntry == null || !entryLowerEntry.getValue().isConnected(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) || entryLowerEntry.getValue().intersection(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0).isEmpty()) ? false : true;
    }

    @Override // com.google.common.collect.O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    @CheckForNull
    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 rangeContaining(Comparable<?> comparable) {
        comparable.getClass();
        Map.Entry<O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> entryFloorEntry = this.rangesByLowerBound.floorEntry(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowValue(comparable));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().contains(comparable)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    public void remove(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.getClass();
        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isEmpty()) {
            return;
        }
        Map.Entry<O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> entryLowerEntry = this.rangesByLowerBound.lowerEntry(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound);
        if (entryLowerEntry != null) {
            O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound) >= 0) {
                if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.hasUpperBound() && value.upperBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound) >= 0) {
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound, value.upperBound));
                }
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(value.lowerBound, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound));
            }
        }
        Map.Entry<O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> entryFloorEntry = this.rangesByLowerBound.floorEntry(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound);
        if (entryFloorEntry != null) {
            O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 value2 = entryFloorEntry.getValue();
            if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.hasUpperBound() && value2.upperBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound) >= 0) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound, value2.upperBound));
            }
        }
        this.rangesByLowerBound.subMap(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound).clear();
    }

    public void removeAll(O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0) {
        removeAll(o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0.asRanges());
    }

    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 span() {
        Map.Entry<O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> entryFirstEntry = this.rangesByLowerBound.firstEntry();
        Map.Entry<O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> entryLastEntry = this.rangesByLowerBound.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(entryFirstEntry.getValue().lowerBound, entryLastEntry.getValue().upperBound);
    }

    public O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 subRangeSet(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        return o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.equals(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all()) ? this : new O00O00OOoO00oo0ooO000OoOOO0oO0o00oOoOOOo(this, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
    }

    public O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0(NavigableMap navigableMap) {
        this.rangesByLowerBound = navigableMap;
    }

    public static <C extends Comparable<?>> O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 create(O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0) {
        O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0Create = create();
        o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0Create.addAll(o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0);
        return o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0Create;
    }

    public void addAll(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            add((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) it.next());
        }
    }

    public boolean enclosesAll(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!encloses((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) it.next())) {
                return false;
            }
        }
        return true;
    }

    public void removeAll(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            remove((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) it.next());
        }
    }

    public static <C extends Comparable<?>> O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 create(Iterable<O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> iterable) {
        O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0Create = create();
        o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0Create.addAll(iterable);
        return o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0Create;
    }
}
