package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 extends O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {
    public final boolean O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.getClass();
        Object obj = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (obj == null) {
            if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.isDone()) {
                if (!O00000OOoOOO00O00o0ooooooooO000ooooO0000.f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, null, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000))) {
                    return false;
                }
                O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, false);
            } else {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000);
                if (O00000OOoOOO00O00o0ooooooooO000ooooO0000.f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, null, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
                    try {
                        o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.addListener(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.INSTANCE);
                    } catch (Throwable th) {
                        try {
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(th);
                        } catch (Error | Exception unused) {
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f3717O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        }
                        O00000OOoOOO00O00o0ooooooooO000ooooO0000.f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    }
                } else {
                    obj = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                }
            }
            return true;
        }
        if (!(obj instanceof O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
            return false;
        }
        o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.cancel(((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj).f3715O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        return false;
    }
}
