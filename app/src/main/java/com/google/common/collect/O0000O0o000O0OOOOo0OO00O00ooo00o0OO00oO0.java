package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 extends O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo implements Serializable {
    static final O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 INSTANCE = new O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // java.util.Comparator
    public int compare(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return 0;
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O immutableSortedCopy(Iterable<E> iterable) {
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf(iterable);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <S> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo reverse() {
        return this;
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E> List<E> sortedCopy(Iterable<E> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        Iterator<E> it = iterable.iterator();
        ArrayList arrayList = new ArrayList();
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList, it);
        return arrayList;
    }

    public String toString() {
        return "Ordering.allEqual()";
    }
}
