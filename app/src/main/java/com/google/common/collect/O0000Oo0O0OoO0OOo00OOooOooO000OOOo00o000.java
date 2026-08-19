package com.google.common.collect;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 implements Iterator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f3461O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f3462O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f3463O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = -1;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 f3464O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000(O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0) {
        this.f3464O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
        this.f3461O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.f3462O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.firstEntryIndex();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3462O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 = this.f3464O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != this.f3461O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f3462O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f3463O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        Object objAccess$100 = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.access$100(o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, i);
        this.f3462O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.getSuccessor(this.f3462O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        return objAccess$100;
    }

    @Override // java.util.Iterator
    public final void remove() {
        O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 = this.f3464O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != this.f3461O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            throw new ConcurrentModificationException();
        }
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f3463O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o >= 0);
        this.f3461O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO += 32;
        o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.remove(O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.access$100(o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, this.f3463O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o));
        this.f3462O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.adjustAfterRemove(this.f3462O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f3463O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        this.f3463O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = -1;
    }
}
