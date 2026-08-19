package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oOO0o0oO0OO0O0o00oOOoo00oooO0o0OOO0O extends O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo implements Serializable {
    private static final long serialVersionUID = 0;
    final O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo ordering;

    public O000oOO0o0oO0OO0O0o00oOOoo00oooO0o0OOO0O(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo) {
        this.ordering = o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo;
    }

    @Override // java.util.Comparator
    public int compare(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return this.ordering.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O000oOO0o0oO0OO0O0o00oOOoo00oooO0o0OOO0O) {
            return this.ordering.equals(((O000oOO0o0oO0OO0O0o00oOOoo00oooO0o0OOO0O) obj).ordering);
        }
        return false;
    }

    public int hashCode() {
        return this.ordering.hashCode() ^ (-921210296);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <S> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo nullsFirst() {
        return this.ordering.nullsFirst();
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <S> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo nullsLast() {
        return this;
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <S> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo reverse() {
        return this.ordering.reverse().nullsFirst();
    }

    public String toString() {
        return this.ordering + ".nullsLast()";
    }
}
