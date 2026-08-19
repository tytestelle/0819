package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oO0ooOooo00OOoOOoOOoOoO00Ooo00Oo0Oo0 extends O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo implements Serializable {
    static final O000oO0ooOooo00OOoOOoOOoOoO00Ooo00Oo0Oo0 INSTANCE = new O000oO0ooOooo00OOoOOoOOoOoO00Ooo00Oo0Oo0();
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public transient O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo f3627O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo f3628O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <S extends Comparable<?>> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo nullsFirst() {
        O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo = this.f3627O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo != null) {
            return o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo;
        }
        O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0OoNullsFirst = super.nullsFirst();
        this.f3627O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0OoNullsFirst;
        return o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0OoNullsFirst;
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <S extends Comparable<?>> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo nullsLast() {
        O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo = this.f3628O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo != null) {
            return o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo;
        }
        O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0OoNullsLast = super.nullsLast();
        this.f3628O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0OoNullsLast;
        return o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0OoNullsLast;
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <S extends Comparable<?>> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo reverse() {
        return O000ooOo0oo0O0o00o0o0ooO00O0Oooo0OOo0ooo.INSTANCE;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    @Override // java.util.Comparator
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }
}
