package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oo00OO0Oo0oOOo0O00000O0oO0o0oOo0o00o extends O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O {
    static final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O EMPTY = new O000oo00OO0Oo0oOOo0O00000O0oO0o0oOo0o00o(new Object[0], 0);

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final transient int f3652O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    final transient Object[] array;

    public O000oo00OO0Oo0oOOo0O00000O0oO0o0oOo0o00o(Object[] objArr, int i) {
        this.array = objArr;
        this.f3652O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int copyIntoArray(Object[] objArr, int i) {
        Object[] objArr2 = this.array;
        int i2 = this.f3652O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public Object get(int i) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, this.f3652O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        Object obj = this.array[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object[] internalArray() {
        return this.array;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int internalArrayEnd() {
        return this.f3652O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3652O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }
}
