package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 extends O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo implements Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo function;
    final O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo ordering;

    public O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0(com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo) {
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        this.function = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.getClass();
        this.ordering = o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.ordering.compare(this.function.apply(obj), this.function.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0)) {
            return false;
        }
        O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 = (O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0) obj;
        return this.function.equals(o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0.function) && this.ordering.equals(o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0.ordering);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.function, this.ordering});
    }

    public String toString() {
        return this.ordering + ".onResultOf(" + this.function + ")";
    }
}
