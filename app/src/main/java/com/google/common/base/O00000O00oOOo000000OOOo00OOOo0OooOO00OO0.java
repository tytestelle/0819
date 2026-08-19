package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public final class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 extends O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements Serializable {
    private static final long serialVersionUID = 0;
    private final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo function;
    private final O000000oooOoo00ooo0O0000000o00O0Oooo0OOO resultEquivalence;

    public O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        this.function = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.getClass();
        this.resultEquivalence = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
    }

    @Override // com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO
    public boolean doEquivalent(Object obj, Object obj2) {
        return this.resultEquivalence.equivalent(this.function.apply(obj), this.function.apply(obj2));
    }

    @Override // com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO
    public int doHash(Object obj) {
        return this.resultEquivalence.hash(this.function.apply(obj));
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O00000O00oOOo000000OOOo00OOOo0OooOO00OO0)) {
            return false;
        }
        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = (O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) obj;
        return this.function.equals(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.function) && this.resultEquivalence.equals(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.resultEquivalence);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.function, this.resultEquivalence});
    }

    public String toString() {
        return this.resultEquivalence + ".onResultOf(" + this.function + ")";
    }
}
