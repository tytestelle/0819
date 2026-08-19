package com.google.common.collect;

import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO extends O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O implements Serializable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO f3482O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final BigInteger f3483O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final BigInteger f3484O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = BigInteger.valueOf(Long.MAX_VALUE);
    private static final long serialVersionUID = 0;

    public O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO() {
        super(true);
    }

    private Object readResolve() {
        return f3482O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public String toString() {
        return "DiscreteDomain.bigIntegers()";
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger2.subtract(bigInteger).max(f3483O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).min(f3484O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).longValue();
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    public BigInteger next(BigInteger bigInteger) {
        return bigInteger.add(BigInteger.ONE);
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    public BigInteger offset(BigInteger bigInteger, long j) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(j);
        return bigInteger.add(BigInteger.valueOf(j));
    }

    @Override // com.google.common.collect.O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O
    public BigInteger previous(BigInteger bigInteger) {
        return bigInteger.subtract(BigInteger.ONE);
    }
}
