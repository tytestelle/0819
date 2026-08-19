package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oO0o00o0OOOoOOOooOOoO000oO0Oo0oOOOOO implements Iterator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo f3621O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Iterator f3622O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 f3623O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f3624O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public int f3625O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public boolean f3626O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O000oO0o00o0OOOoOOOooOOoO000oO0Oo0oOOOOO(O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, Iterator it) {
        this.f3621O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
        this.f3622O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3624O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo > 0 || this.f3622O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (this.f3624O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == 0) {
            O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 = (O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0) this.f3622O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.next();
            this.f3623O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0;
            int count = o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount();
            this.f3624O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = count;
            this.f3625O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = count;
        }
        this.f3624O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo--;
        this.f3626O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = true;
        O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo1 = this.f3623O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        Objects.requireNonNull(o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo1);
        return o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo1.getElement();
    }

    @Override // java.util.Iterator
    public final void remove() {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f3626O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        if (this.f3625O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == 1) {
            this.f3622O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove();
        } else {
            O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 = this.f3623O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            Objects.requireNonNull(o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0);
            this.f3621O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getElement());
        }
        this.f3625O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0--;
        this.f3626O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = false;
    }
}
