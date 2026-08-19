package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f224O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f225O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2) {
        this.f224O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        this.f225O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(MessageDigest messageDigest) {
        this.f224O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(messageDigest);
        this.f225O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(messageDigest);
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final boolean equals(Object obj) {
        if (!(obj instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
            return false;
        }
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) obj;
        return this.f224O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f224O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) && this.f225O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.equals(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f225O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final int hashCode() {
        return this.f225O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.hashCode() + (this.f224O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f224O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + ", signature=" + this.f225O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + '}';
    }
}
