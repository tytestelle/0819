package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends AbstractList implements RandomAccess, Serializable {
    private final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo parent;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        this.parent = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            return this.parent.equals(((O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) obj).parent);
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (size() != list.size()) {
            return false;
        }
        int i = this.parent.f3711O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        for (Object obj2 : list) {
            if (obj2 instanceof Integer) {
                int i2 = i + 1;
                if (this.parent.array[i] == ((Integer) obj2).intValue()) {
                    i = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return this.parent.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(@CheckForNull Object obj) {
        if (obj instanceof Integer) {
            return this.parent.indexOf(((Integer) obj).intValue());
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(@CheckForNull Object obj) {
        if (obj instanceof Integer) {
            return this.parent.lastIndexOf(((Integer) obj).intValue());
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.parent.length();
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Integer> subList(int i, int i2) {
        return this.parent.subArray(i, i2).asList();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.parent.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i) {
        return Integer.valueOf(this.parent.get(i));
    }
}
