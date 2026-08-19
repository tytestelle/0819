package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO extends O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO f3525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f3526O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;

    public O000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO(int i) {
        this.f3525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO(i);
    }

    @Override // com.google.common.collect.O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo
    public final O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, obj);
        return this;
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i, Object obj) {
        Objects.requireNonNull(this.f3525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        if (i == 0) {
            return;
        }
        if (this.f3526O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = this.f3525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO2 = new O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO();
            o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO2.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            for (int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(); iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != -1; iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
                org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO2.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o), o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o]);
            }
            this.f3525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO2;
        }
        this.f3526O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;
        obj.getClass();
        O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO3 = this.f3525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO3.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO3.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(obj) + i, obj);
    }

    @Override // com.google.common.collect.O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo
    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: merged with bridge method [inline-methods] */
    public final O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        Objects.requireNonNull(this.f3525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        if (this.f3525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 0) {
            return O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0.of();
        }
        this.f3526O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
        return new O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0(this.f3525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }
}
