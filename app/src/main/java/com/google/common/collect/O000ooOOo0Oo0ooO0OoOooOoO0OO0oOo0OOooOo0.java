package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0 extends O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 {
    static final O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0 EMPTY;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final transient int f3664O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public transient O000ooOO00Oo0ooo000OOooo0000O0ooOO00oo0O f3665O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    final transient O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO contents;

    static {
        O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = new O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO();
        o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(3);
        EMPTY = new O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO);
    }

    public O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0(O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO) {
        this.contents = o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO;
        long jO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 0;
        for (int i = 0; i < o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o; i++) {
            jO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 += (long) o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i);
        }
        this.f3664O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(jO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
    }

    @Override // com.google.common.collect.O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0, com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public int count(@CheckForNull Object obj) {
        return this.contents.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(obj);
    }

    @Override // com.google.common.collect.O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0
    public O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 getEntry(int i) {
        O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = this.contents;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        return new O000oOO0oO0OOOOOoOOo000OooO000o00OoOo00O(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO, i);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f3664O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // com.google.common.collect.O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return new O000ooOO00oooOoO0oOOo00ooo0O0o00oOOOOoO0(this);
    }

    @Override // com.google.common.collect.O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0, com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 elementSet() {
        O000ooOO00Oo0ooo000OOooo0000O0ooOO00oo0O o000ooOO00Oo0ooo000OOooo0000O0ooOO00oo0O = this.f3665O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (o000ooOO00Oo0ooo000OOooo0000O0ooOO00oo0O != null) {
            return o000ooOO00Oo0ooo000OOooo0000O0ooOO00oo0O;
        }
        O000ooOO00Oo0ooo000OOooo0000O0ooOO00oo0O o000ooOO00Oo0ooo000OOooo0000O0ooOO00oo0O2 = new O000ooOO00Oo0ooo000OOooo0000O0ooOO00oo0O(this, null);
        this.f3665O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000ooOO00Oo0ooo000OOooo0000O0ooOO00oo0O2;
        return o000ooOO00Oo0ooo000OOooo0000O0ooOO00oo0O2;
    }
}
