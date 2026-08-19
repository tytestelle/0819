package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO extends O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O implements Serializable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO f3485O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO();
    private static final long serialVersionUID = 0;

    public O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO() {
        super(true);
    }

    private Object readResolve() {
        return f3485O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public String toString() {
        return "DiscreteDomain.integers()";
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    public long distance(Integer num, Integer num2) {
        return ((long) num2.intValue()) - ((long) num.intValue());
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    public Integer maxValue() {
        return Integer.MAX_VALUE;
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    public Integer minValue() {
        return Integer.MIN_VALUE;
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    @CheckForNull
    public Integer next(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(iIntValue + 1);
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    public Integer offset(Integer num, long j) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(j);
        return Integer.valueOf(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(num.longValue() + j));
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    @CheckForNull
    public Integer previous(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(iIntValue - 1);
    }
}
