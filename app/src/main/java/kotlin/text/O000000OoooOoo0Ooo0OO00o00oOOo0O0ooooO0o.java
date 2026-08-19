package kotlin.text;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements kotlin.sequences.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final String f4036O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f4037O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final int f4038O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO f4039O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str, int i, int i2, O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
        this.f4036O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str;
        this.f4037O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
        this.f4038O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i2;
        this.f4039O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
    }

    @Override // kotlin.sequences.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final Iterator iterator() {
        return new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
    }
}
