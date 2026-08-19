package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable endpoint;

    public O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo(Comparable comparable) {
        this.endpoint = comparable;
    }

    public static <C extends Comparable> O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo aboveAll() {
        return O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO.f3480O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public static <C extends Comparable> O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo aboveValue(C c) {
        return new O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O(c);
    }

    public static <C extends Comparable> O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo belowAll() {
        return O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO.f3481O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public static <C extends Comparable> O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo belowValue(C c) {
        return new O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO(c);
    }

    public O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo canonical(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        return this;
    }

    public abstract void describeAsLowerBound(StringBuilder sb);

    public abstract void describeAsUpperBound(StringBuilder sb);

    public Comparable endpoint() {
        return this.endpoint;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo)) {
            return false;
        }
        try {
            return compareTo((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @CheckForNull
    public abstract Comparable greatestValueBelow(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);

    public abstract int hashCode();

    public abstract boolean isLessThan(Comparable comparable);

    @CheckForNull
    public abstract Comparable leastValueAbove(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);

    public abstract O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 typeAsLowerBound();

    public abstract O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 typeAsUpperBound();

    public abstract O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo withLowerBoundType(O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);

    public abstract O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo withUpperBoundType(O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);

    @Override // java.lang.Comparable
    public int compareTo(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) {
        if (o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo == belowAll()) {
            return 1;
        }
        if (o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo == aboveAll()) {
            return -1;
        }
        int iCompareOrThrow = O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.compareOrThrow(this.endpoint, o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.endpoint);
        return iCompareOrThrow != 0 ? iCompareOrThrow : Boolean.compare(this instanceof O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O, o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo instanceof O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O);
    }
}
