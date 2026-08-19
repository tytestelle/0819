package com.google.common.collect;

import javax.annotation.CheckForNull;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO extends O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) obj);
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public void describeAsLowerBound(StringBuilder sb) {
        sb.append('[');
        sb.append(this.endpoint);
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public void describeAsUpperBound(StringBuilder sb) {
        sb.append(this.endpoint);
        sb.append(')');
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    @CheckForNull
    public Comparable greatestValueBelow(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        return o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.previous(this.endpoint);
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public int hashCode() {
        return this.endpoint.hashCode();
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public boolean isLessThan(Comparable comparable) {
        return O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.compareOrThrow(this.endpoint, comparable) <= 0;
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public Comparable leastValueAbove(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        return this.endpoint;
    }

    public String toString() {
        return "\\" + this.endpoint + ServiceReference.DELIMITER;
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 typeAsLowerBound() {
        return O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.CLOSED;
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 typeAsUpperBound() {
        return O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.OPEN;
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo withLowerBoundType(O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        int i = O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.f3479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.ordinal()];
        if (i == 1) {
            return this;
        }
        if (i != 2) {
            throw new AssertionError();
        }
        Comparable comparablePrevious = o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.previous(this.endpoint);
        return comparablePrevious == null ? O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll() : new O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O(comparablePrevious);
    }

    @Override // com.google.common.collect.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo
    public O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo withUpperBoundType(O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        int i = O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.f3479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.ordinal()];
        if (i == 1) {
            Comparable comparablePrevious = o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.previous(this.endpoint);
            return comparablePrevious == null ? O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveAll() : new O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O(comparablePrevious);
        }
        if (i == 2) {
            return this;
        }
        throw new AssertionError();
    }
}
