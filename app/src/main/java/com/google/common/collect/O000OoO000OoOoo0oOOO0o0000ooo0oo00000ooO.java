package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OoO000OoOoo0oOOO0o0000ooo0oo00000ooO extends O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<Object> elementOrder;

    public O000OoO000OoOoo0oOOO0o0000ooo0oo00000ooO(Comparator<Object> comparator) {
        this.elementOrder = comparator;
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O000OoO000OoOoo0oOOO0o0000ooo0oo00000ooO) {
            return this.elementOrder.equals(((O000OoO000OoOoo0oOOO0o0000ooo0oo00000ooO) obj).elementOrder);
        }
        return false;
    }

    public int hashCode() {
        return this.elementOrder.hashCode() ^ 2075626741;
    }

    public String toString() {
        return this.elementOrder + ".lexicographical()";
    }

    @Override // java.util.Comparator
    public int compare(Iterable<Object> iterable, Iterable<Object> iterable2) {
        Iterator<Object> it = iterable.iterator();
        Iterator<Object> it2 = iterable2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.elementOrder.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }
}
