package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f3677O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo f3678O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Object[] f3679O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public Object f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo, int i) {
        this.f3678O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo;
        this.f3677O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i, "k (%s) must be >= 0", i >= 0);
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i, "k (%s) must be <= Integer.MAX_VALUE / 2", i <= 1073741823);
        long j = ((long) i) * ((long) 2);
        int i2 = (int) j;
        O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, 2, "checkedMultiply", j == ((long) i2));
        this.f3679O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new Object[i2];
        this.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0;
        this.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
    }
}
