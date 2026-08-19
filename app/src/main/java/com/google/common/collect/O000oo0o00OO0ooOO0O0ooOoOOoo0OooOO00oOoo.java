package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oo0o00OO0ooOO0O0ooOoOOoo0OooOO00oOoo extends O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final transient Object[] f3659O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final transient int f3660O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final transient int f3661O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O000oo0o00OO0ooOO0O0ooOoOOoo0OooOO00oOoo(Object[] objArr, int i, int i2) {
        this.f3659O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = objArr;
        this.f3660O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i;
        this.f3661O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i2;
    }

    @Override // java.util.List
    public Object get(int i) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, this.f3661O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        Object obj = this.f3659O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[(i * 2) + this.f3660O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3661O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }
}
