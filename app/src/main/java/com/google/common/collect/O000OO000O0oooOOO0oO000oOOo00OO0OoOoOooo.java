package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OO000O0oooOOO0oO000oOOo00OO0OoOoOooo extends O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f3522O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Object f3523O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo f3524O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000OO000O0oooOOO0oO000oOOo00OO0OoOoOooo(O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo o00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) {
        this.f3524O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3522O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO > 0 || this.f3524O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3522O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO <= 0) {
            O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 = (O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0) this.f3524O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.next();
            this.f3523O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getElement();
            this.f3522O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount();
        }
        this.f3522O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO--;
        Object obj = this.f3523O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Objects.requireNonNull(obj);
        return obj;
    }
}
