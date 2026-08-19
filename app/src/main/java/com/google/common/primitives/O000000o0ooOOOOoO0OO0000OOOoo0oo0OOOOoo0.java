package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final int[] array;
    final int end;
    final int start;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@CheckForNull Object obj) {
        return (obj instanceof Integer) && com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this.array, ((Integer) obj).intValue(), this.start, this.end) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)) {
            return super.equals(obj);
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) obj;
        int size = size();
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.array[this.start + i] != o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.array[o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.start + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 31) + this.array[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(@CheckForNull Object obj) {
        int iO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        if (!(obj instanceof Integer) || (iO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
            return -1;
        }
        return iO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O - this.start;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(@CheckForNull Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.array;
            int iIntValue = ((Integer) obj).intValue();
            int i = this.start;
            int i2 = this.end - 1;
            while (i2 >= i) {
                if (iArr[i2] != iIntValue) {
                    i2--;
                } else if (i2 >= 0) {
                    return i2 - this.start;
                }
            }
            i2 = -1;
            if (i2 >= 0) {
                return i2 - this.start;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.end - this.start;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Integer> subList(int i, int i2) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.array;
        int i3 = this.start;
        return new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iArr, i + i3, i3 + i2);
    }

    public int[] toIntArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        sb.append(this.array[this.start]);
        int i = this.start;
        while (true) {
            i++;
            if (i >= this.end) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.array[i]);
        }
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int[] iArr, int i, int i2) {
        this.array = iArr;
        this.start = i;
        this.end = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, size());
        return Integer.valueOf(this.array[this.start + i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer set(int i, Integer num) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, size());
        int[] iArr = this.array;
        int i2 = this.start + i;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }
}
