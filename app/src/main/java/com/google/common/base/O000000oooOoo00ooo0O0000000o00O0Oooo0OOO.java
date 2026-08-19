package com.google.common.base;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
    public static O000000oooOoo00ooo0O0000000o00O0Oooo0OOO equals() {
        return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.INSTANCE;
    }

    public static O000000oooOoo00ooo0O0000000o00O0Oooo0OOO identity() {
        return O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.INSTANCE;
    }

    public abstract boolean doEquivalent(Object obj, Object obj2);

    public abstract int doHash(Object obj);

    public final boolean equivalent(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return doEquivalent(obj, obj2);
    }

    public final O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 equivalentTo(@CheckForNull Object obj) {
        return new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, obj);
    }

    public final int hash(@CheckForNull Object obj) {
        if (obj == null) {
            return 0;
        }
        return doHash(obj);
    }

    public final <F> O000000oooOoo00ooo0O0000000o00O0Oooo0OOO onResultOf(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        return new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, this);
    }

    public final <S> O000000oooOoo00ooo0O0000000o00O0Oooo0OOO pairwise() {
        return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(this);
    }

    public final <S> O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O wrap(S s) {
        return new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, s, null);
    }
}
