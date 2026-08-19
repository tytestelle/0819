package O00000OOoOOO00O00o0ooooooooO000ooooO0000;

import O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O implements O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f428O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f429O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Bitmap.Config f430O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        this.f428O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        this.f428O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O)) {
            return false;
        }
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj;
        return this.f429O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f429O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO && O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f430O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f430O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    public final int hashCode() {
        int i = this.f429O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO * 31;
        Bitmap.Config config = this.f430O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f429O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f430O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }
}
