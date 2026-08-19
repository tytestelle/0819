package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo extends O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O implements Serializable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo f3486O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo();
    private static final long serialVersionUID = 0;

    public O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo() {
        super(true);
    }

    private Object readResolve() {
        return f3486O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public String toString() {
        return "DiscreteDomain.longs()";
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    public long distance(Long l, Long l2) {
        long jLongValue = l2.longValue() - l.longValue();
        if (l2.longValue() > l.longValue() && jLongValue < 0) {
            return Long.MAX_VALUE;
        }
        if (l2.longValue() >= l.longValue() || jLongValue <= 0) {
            return jLongValue;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    public Long maxValue() {
        return Long.MAX_VALUE;
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    public Long minValue() {
        return Long.MIN_VALUE;
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    @CheckForNull
    public Long next(Long l) {
        long jLongValue = l.longValue();
        if (jLongValue == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(jLongValue + 1);
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    public Long offset(Long l, long j) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(j);
        long jLongValue = l.longValue() + j;
        if (jLongValue < 0) {
            org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("overflow", l.longValue() < 0);
        }
        return Long.valueOf(jLongValue);
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    @CheckForNull
    public Long previous(Long l) {
        long jLongValue = l.longValue();
        if (jLongValue == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(jLongValue - 1);
    }
}
