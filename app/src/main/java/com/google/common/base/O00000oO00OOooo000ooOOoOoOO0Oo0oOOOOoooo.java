package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final CharSequence f3355O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f3356O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public int f3357O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public int f3358O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final /* synthetic */ O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f3359O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    public O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O o00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O, CharSequence charSequence) {
        this.f3359O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        this.f3356O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.f3360O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f3358O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.f3362O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.f3355O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = charSequence;
    }

    @Override // com.google.common.base.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        int i = this.f3357O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        while (true) {
            int length = this.f3357O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            if (length == -1) {
                this.f3349O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                return null;
            }
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f3359O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            CharSequence charSequence = this.f3355O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            int length2 = charSequence.length();
            org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f3357O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = -1;
            } else {
                this.f3357O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = length + 1;
            }
            int i2 = this.f3357O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            if (i2 != i) {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f3356O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (i < length) {
                    charSequence.charAt(i);
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass();
                }
                if (length > i) {
                    charSequence.charAt(length - 1);
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass();
                }
                int i3 = this.f3358O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                if (i3 == 1) {
                    length = charSequence.length();
                    this.f3357O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = -1;
                    if (length > i) {
                        charSequence.charAt(length - 1);
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass();
                    }
                } else {
                    this.f3358O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = i3 - 1;
                }
                return charSequence.subSequence(i, length).toString();
            }
            int i4 = i2 + 1;
            this.f3357O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i4;
            if (i4 > charSequence.length()) {
                this.f3357O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = -1;
            }
        }
    }
}
