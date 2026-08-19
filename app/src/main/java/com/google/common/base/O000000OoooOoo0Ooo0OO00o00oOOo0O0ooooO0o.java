package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements Iterator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f3349O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.NOT_READY;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Object f3350O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public abstract Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f3349O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.FAILED;
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2) {
            throw new IllegalStateException();
        }
        int iOrdinal = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        this.f3349O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
        this.f3350O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        if (this.f3349O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE) {
            return false;
        }
        this.f3349O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3349O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.NOT_READY;
        Object obj = this.f3350O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f3350O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
