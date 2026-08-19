package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000Oo0OOoOo00oo0OoooO0o0O0OOoOOooOOO0o0 extends O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f3568O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f3569O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000Oo0OOoOo00oo0OoooO0o0O0OOoOOooOOO0o0(Object obj) {
        this.f3568O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f3569O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3569O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            throw new NoSuchElementException();
        }
        this.f3569O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
        return this.f3568O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }
}
