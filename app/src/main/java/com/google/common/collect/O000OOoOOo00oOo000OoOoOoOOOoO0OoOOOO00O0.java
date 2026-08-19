package com.google.common.collect;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0 extends O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public transient Object[] f3549O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public transient Object[] f3550O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final Comparator f3551O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.f3551O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = comparator;
        this.f3549O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new Object[4];
        this.f3550O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new Object[4];
    }

    @Override // com.google.common.collect.O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O
    public final O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj, Object obj2) {
        int i = this.f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + 1;
        Object[] objArr = this.f3549O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (i > objArr.length) {
            int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objArr.length, i);
            this.f3549O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = Arrays.copyOf(this.f3549O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            this.f3550O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = Arrays.copyOf(this.f3550O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(obj, obj2);
        Object[] objArr2 = this.f3549O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        int i2 = this.f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        objArr2[i2] = obj;
        this.f3550O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[i2] = obj2;
        this.f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2 + 1;
        return this;
    }

    @Override // com.google.common.collect.O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O
    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: merged with bridge method [inline-methods] */
    public final O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        int i = this.f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Comparator comparator = this.f3551O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (i == 0) {
            return O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00.emptyMap(comparator);
        }
        if (i == 1) {
            Object obj = this.f3549O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[0];
            Objects.requireNonNull(obj);
            Object obj2 = this.f3550O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[0];
            Objects.requireNonNull(obj2);
            return O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(comparator, obj, obj2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f3549O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, i);
        Arrays.sort(objArrCopyOf, comparator);
        Object[] objArr = new Object[this.f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO];
        for (int i2 = 0; i2 < this.f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO; i2++) {
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (comparator.compare(objArrCopyOf[i3], objArrCopyOf[i2]) == 0) {
                    throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i3] + " and " + objArrCopyOf[i2]);
                }
            }
            Object obj3 = this.f3549O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i2];
            Objects.requireNonNull(obj3);
            int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, comparator);
            Object obj4 = this.f3550O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[i2];
            Objects.requireNonNull(obj4);
            objArr[iBinarySearch] = obj4;
        }
        return new O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00(new O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.asImmutableList(objArrCopyOf), comparator), O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.asImmutableList(objArr));
    }
}
