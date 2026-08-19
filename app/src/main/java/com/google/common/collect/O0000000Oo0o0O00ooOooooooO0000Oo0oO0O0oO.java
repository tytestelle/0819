package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends O00O00o00OOOo0o00o0OOoOOooo00Oo0ooo000oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f3368O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f3369O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, int i2) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i2, i);
        this.f3368O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3369O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2;
    }

    public abstract Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f3369O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO < this.f3368O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3369O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f3369O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f3369O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i + 1;
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3369O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f3369O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO - 1;
        this.f3369O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3369O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO - 1;
    }
}
