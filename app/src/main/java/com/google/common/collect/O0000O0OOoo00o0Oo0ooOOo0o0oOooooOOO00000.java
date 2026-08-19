package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 extends O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public Object f3429O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(Comparable comparable) {
        this.f3429O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = comparable;
    }

    public abstract Comparable O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3429O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f3429O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.f3429O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj);
        return obj;
    }
}
