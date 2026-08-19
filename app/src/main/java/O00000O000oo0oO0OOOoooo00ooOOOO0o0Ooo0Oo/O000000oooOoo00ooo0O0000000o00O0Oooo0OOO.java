package O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f196O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(MessageDigest messageDigest) {
        for (int i = 0; i < this.f196O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size(); i++) {
            O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) this.f196O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.keyAt(i);
            Object objValueAt = this.f196O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.valueAt(i);
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f193O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f195O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
                o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f195O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f194O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getBytes(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f184O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            }
            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f195O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, objValueAt, messageDigest);
        }
    }

    public final Object O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f196O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        return o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.containsKey(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) ? o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) : o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f192O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final boolean equals(Object obj) {
        if (obj instanceof O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
            return this.f196O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(((O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) obj).f196O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
        return false;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final int hashCode() {
        return this.f196O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f196O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + '}';
    }
}
