package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo extends O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<Object> comparator;

    public O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo(Comparator<Object> comparator) {
        comparator.getClass();
        this.comparator = comparator;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.comparator.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo) {
            return this.comparator.equals(((O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo) obj).comparator);
        }
        return false;
    }

    public int hashCode() {
        return this.comparator.hashCode();
    }

    public String toString() {
        return this.comparator.toString();
    }
}
