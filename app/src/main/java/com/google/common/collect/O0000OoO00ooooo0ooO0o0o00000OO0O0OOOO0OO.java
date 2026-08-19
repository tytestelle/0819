package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO extends O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO {
    public static O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(int i) {
        if (i < 0) {
            return O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3477O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        return i > 0 ? O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3478O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o : O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3476O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // com.google.common.collect.O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO
    public final O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, int i2) {
        return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Integer.compare(i, i2));
    }

    @Override // com.google.common.collect.O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO
    public final O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(long j, long j2) {
        return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Long.compare(j, j2));
    }

    @Override // com.google.common.collect.O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO
    public final O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Comparable comparable, Comparable comparable2) {
        return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(comparable.compareTo(comparable2));
    }

    @Override // com.google.common.collect.O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO
    public final O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Comparator comparator, Object obj, Object obj2) {
        return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(comparator.compare(obj, obj2));
    }

    @Override // com.google.common.collect.O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO
    public final O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(boolean z, boolean z2) {
        return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Boolean.compare(z, z2));
    }

    @Override // com.google.common.collect.O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO
    public final O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(boolean z, boolean z2) {
        return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Boolean.compare(z2, z));
    }

    @Override // com.google.common.collect.O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO
    public final int O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        return 0;
    }
}
