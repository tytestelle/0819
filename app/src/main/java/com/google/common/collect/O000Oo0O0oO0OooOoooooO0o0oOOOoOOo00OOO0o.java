package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o implements Iterator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Iterator f3565O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f3566O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Object f3567O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o(Iterator it) {
        it.getClass();
        this.f3565O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = it;
    }

    public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        if (!this.f3566O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            this.f3567O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f3565O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.next();
            this.f3566O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
        }
        return this.f3567O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3566O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO || this.f3565O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f3566O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            return this.f3565O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.next();
        }
        Object obj = this.f3567O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.f3566O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;
        this.f3567O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(!this.f3566O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "Can't remove after you've peeked at next");
        this.f3565O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove();
    }
}
