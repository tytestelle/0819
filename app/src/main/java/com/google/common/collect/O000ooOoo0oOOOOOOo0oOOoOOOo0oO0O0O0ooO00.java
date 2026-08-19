package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class O000ooOoo0oOOOOOOo0oOOoOOOo0oO0O0O0ooO00 extends O000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        it.getClass();
        com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new O000ooOoo0oOOOOOOo0oOOoOOOo0oO0O0O0ooO00(((SortedSet) this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).headSet(obj), this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new O000ooOoo0oOOOOOOo0oOOoOOOo0oO0O0O0ooO00(((SortedSet) this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).subSet(obj, obj2), this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new O000ooOoo0oOOOOOOo0oOOoOOOo0oO0O0O0ooO00(((SortedSet) this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).tailSet(obj), this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }
}
