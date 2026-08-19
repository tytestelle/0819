package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o extends O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements Serializable {
    private static final long serialVersionUID = 1;
    final O000000oooOoo00ooo0O0000000o00O0Oooo0OOO elementEquivalence;

    public O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.getClass();
        this.elementEquivalence = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) {
            return this.elementEquivalence.equals(((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).elementEquivalence);
        }
        return false;
    }

    public int hashCode() {
        return this.elementEquivalence.hashCode() ^ 1185147655;
    }

    public String toString() {
        return this.elementEquivalence + ".pairwise()";
    }

    @Override // com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO
    public boolean doEquivalent(Iterable<Object> iterable, Iterable<Object> iterable2) {
        Iterator<Object> it = iterable.iterator();
        Iterator<Object> it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.elementEquivalence.equivalent(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO
    public int doHash(Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        int iHash = 78721;
        while (it.hasNext()) {
            iHash = (iHash * 24943) + this.elementEquivalence.hash(it.next());
        }
        return iHash;
    }
}
