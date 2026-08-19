package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo extends O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<Object>[] comparators;

    public O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo(Comparator<Object> comparator, Comparator<Object> comparator2) {
        this.comparators = new Comparator[]{comparator, comparator2};
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator<Object>[] comparatorArr = this.comparators;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo) {
            return Arrays.equals(this.comparators, ((O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo) obj).comparators);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.comparators);
    }

    public String toString() {
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder("Ordering.compound("), Arrays.toString(this.comparators), ")");
    }

    public O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo(Iterable<? extends Comparator<Object>> iterable) {
        Collection collection;
        Comparator[] comparatorArr = new Comparator[0];
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Iterator<? extends Comparator<Object>> it = iterable.iterator();
            ArrayList arrayList = new ArrayList();
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList, it);
            collection = arrayList;
        }
        this.comparators = (Comparator[]) collection.toArray(comparatorArr);
    }
}
