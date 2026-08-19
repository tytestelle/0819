package com.google.common.base;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O implements Serializable {
    private static final long serialVersionUID = 0;
    private final O000000oooOoo00ooo0O0000000o00O0Oooo0OOO equivalence;
    private final Object reference;

    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, Object obj, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.getClass();
        this.equivalence = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        this.reference = obj;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O)) {
            return false;
        }
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj;
        if (this.equivalence.equals(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.equivalence)) {
            return this.equivalence.equivalent(this.reference, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.reference);
        }
        return false;
    }

    public Object get() {
        return this.reference;
    }

    public int hashCode() {
        return this.equivalence.hash(this.reference);
    }

    public String toString() {
        return this.equivalence + ".wrap(" + this.reference + ")";
    }
}
