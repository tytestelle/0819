package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000ooOOooOoooO00oooO0OO00oo0oOoO0Oo0o0O extends O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 {
    static final O000ooOOooOoooO00oooO0OO00oo0oOoO0Oo0o0O EMPTY;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final Object[] f3666O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final transient int f3667O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final transient int f3668O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final transient int f3669O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    final transient Object[] elements;
    final transient Object[] table;

    static {
        Object[] objArr = new Object[0];
        f3666O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = objArr;
        EMPTY = new O000ooOOooOoooO00oooO0OO00oo0oOoO0Oo0o0O(objArr, 0, objArr, 0, 0);
    }

    public O000ooOOooOoooO00oooO0OO00oo0oOoO0Oo0o0O(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.elements = objArr;
        this.f3667O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        this.table = objArr2;
        this.f3668O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i2;
        this.f3669O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i3;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.table;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(obj);
        while (true) {
            int i = iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o & this.f3668O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = i + 1;
        }
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int copyIntoArray(Object[] objArr, int i) {
        Object[] objArr2 = this.elements;
        int i2 = this.f3669O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O createAsList() {
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.asImmutableList(this.elements, this.f3669O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f3667O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object[] internalArray() {
        return this.elements;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int internalArrayEnd() {
        return this.f3669O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0
    public boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f3669O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return asList().iterator();
    }
}
