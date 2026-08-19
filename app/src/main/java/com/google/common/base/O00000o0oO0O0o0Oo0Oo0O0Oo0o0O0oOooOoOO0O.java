package com.google.common.base;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public final class O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O implements O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, Serializable {
    private static final long serialVersionUID = 0;
    private final List<? extends O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0> components;

    public O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(List list, O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) {
        this.components = list;
    }

    @Override // com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public boolean apply(Object obj) {
        for (int i = 0; i < this.components.size(); i++) {
            if (!this.components.get(i).apply(obj)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) {
            return this.components.equals(((O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) obj).components);
        }
        return false;
    }

    public int hashCode() {
        return this.components.hashCode() + 306654252;
    }

    public String toString() {
        List<? extends O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0> list = this.components;
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
