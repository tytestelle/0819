package O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Object f798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj, "Argument must not be null");
        this.f798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(MessageDigest messageDigest) {
        messageDigest.update(this.f798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.toString().getBytes(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f184O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final boolean equals(Object obj) {
        if (obj instanceof O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            return this.f798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(((O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) obj).f798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
        return false;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final int hashCode() {
        return this.f798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + '}';
    }
}
