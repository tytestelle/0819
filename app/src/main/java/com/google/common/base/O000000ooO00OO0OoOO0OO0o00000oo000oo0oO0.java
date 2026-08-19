package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 implements O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, Serializable {
    private static final long serialVersionUID = 0;
    private final O000000oooOoo00ooo0O0000000o00O0Oooo0OOO equivalence;

    @CheckForNull
    private final Object target;

    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, @CheckForNull Object obj) {
        o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.getClass();
        this.equivalence = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        this.target = obj;
    }

    @Override // com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public boolean apply(@CheckForNull Object obj) {
        return this.equivalence.equivalent(obj, this.target);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0)) {
            return false;
        }
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) obj;
        return this.equivalence.equals(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.equivalence) && com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.target, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.target);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.equivalence, this.target});
    }

    public String toString() {
        return this.equivalence + ".equivalentTo(" + this.target + ")";
    }
}
