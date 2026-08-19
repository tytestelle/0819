package com.google.common.collect;

import java.util.AbstractMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oOOOo000O0OoOoo0000Oo000O0oOoo0o00Oo extends O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final AtomicInteger f3643O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new AtomicInteger(0);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final AbstractMap f3644O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000oOOOo000O0OoOoo0000Oo000O0oOoo0o00Oo() {
        AbstractMap abstractMapCreate;
        O000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo = new O000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo();
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO = O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO.WEAK;
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2 = o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3576O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("Key strength was already set to %s", o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2 == null, o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2);
        o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO.getClass();
        o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3576O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO;
        if (o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO != O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO.STRONG) {
            o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3573O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = true;
        }
        if (o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3573O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            abstractMapCreate = O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO.create(o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo);
        } else {
            int i = o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3574O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            i = i == -1 ? 16 : i;
            int i2 = o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3575O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            abstractMapCreate = new ConcurrentHashMap(i, 0.75f, i2 == -1 ? 4 : i2);
        }
        this.f3644O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = abstractMapCreate;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractMap, java.util.Map, java.util.concurrent.ConcurrentMap] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        int iIdentityHashCode = System.identityHashCode(obj);
        int iIdentityHashCode2 = System.identityHashCode(obj2);
        if (iIdentityHashCode != iIdentityHashCode2) {
            return iIdentityHashCode < iIdentityHashCode2 ? -1 : 1;
        }
        Object r0 = this.f3644O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Integer numValueOf = (Integer) r0.get(obj);
        AtomicInteger atomicInteger = this.f3643O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(atomicInteger.getAndIncrement());
            Integer num = (Integer) r0.putIfAbsent(obj, numValueOf);
            if (num != null) {
                numValueOf = num;
            }
        }
        Integer numValueOf2 = (Integer) r0.get(obj2);
        if (numValueOf2 == null) {
            numValueOf2 = Integer.valueOf(atomicInteger.getAndIncrement());
            Integer num2 = (Integer) r0.putIfAbsent(obj2, numValueOf2);
            if (num2 != null) {
                numValueOf2 = num2;
            }
        }
        int iCompareTo = numValueOf.compareTo(numValueOf2);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        throw new AssertionError();
    }

    public final String toString() {
        return "Ordering.arbitrary()";
    }
}
