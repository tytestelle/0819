package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO extends O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO f3480O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO("");
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f3480O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, java.lang.Comparable
    public int compareTo(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) {
        return o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo == this ? 0 : 1;
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public void describeAsLowerBound(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public void describeAsUpperBound(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public Comparable<?> endpoint() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public Comparable<?> greatestValueBelow(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        return o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.maxValue();
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public boolean isLessThan(Comparable<?> comparable) {
        return false;
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public Comparable<?> leastValueAbove(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        throw new AssertionError();
    }

    public String toString() {
        return "+∞";
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 typeAsLowerBound() {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 typeAsUpperBound() {
        throw new IllegalStateException();
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo withLowerBoundType(O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo withUpperBoundType(O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        throw new IllegalStateException();
    }
}
