package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O {
    final boolean supportsFastOffset;

    public O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O() {
        this(false);
    }

    public static O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O bigIntegers() {
        return O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.f3482O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public static O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O integers() {
        return O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.f3485O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public static O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O longs() {
        return O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo.f3486O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public abstract long distance(Comparable comparable, Comparable comparable2);

    @CanIgnoreReturnValue
    public Comparable maxValue() {
        throw new NoSuchElementException();
    }

    @CanIgnoreReturnValue
    public Comparable minValue() {
        throw new NoSuchElementException();
    }

    public abstract Comparable next(Comparable comparable);

    public abstract Comparable offset(Comparable comparable, long j);

    public abstract Comparable previous(Comparable comparable);

    public O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O(boolean z) {
        this.supportsFastOffset = z;
    }
}
