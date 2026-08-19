package com.google.common.primitives;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Serializable {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f3710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new int[0], 0, 0);

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final transient int f3711O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    private final int[] array;
    private final int end;

    public static O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o builder(int i) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i, "Invalid initialCapacity: %s", i >= 0);
        return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i);
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo copyOf(int[] iArr) {
        return iArr.length == 0 ? f3710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO : new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Arrays.copyOf(iArr, iArr.length));
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo of() {
        return f3710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public List<Integer> asList() {
        return new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, null);
    }

    public boolean contains(int i) {
        return indexOf(i) >= 0;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) {
            return false;
        }
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) obj;
        if (length() != o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, length());
        return this.array[this.f3711O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.f3711O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO; i2 < this.end; i2++) {
            i = (i * 31) + this.array[i2];
        }
        return i;
    }

    public int indexOf(int i) {
        int i2 = this.f3711O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        for (int i3 = i2; i3 < this.end; i3++) {
            if (this.array[i3] == i) {
                return i3 - i2;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.f3711O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public int lastIndexOf(int i) {
        int i2;
        int i3 = this.end;
        do {
            i3--;
            i2 = this.f3711O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (i3 < i2) {
                return -1;
            }
        } while (this.array[i3] != i);
        return i3 - i2;
    }

    public int length() {
        return this.end - this.f3711O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public Object readResolve() {
        return isEmpty() ? f3710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO : this;
    }

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo subArray(int i, int i2) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(i, i2, length());
        if (i == i2) {
            return f3710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        int[] iArr = this.array;
        int i3 = this.f3711O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iArr, i + i3, i3 + i2);
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.array, this.f3711O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append('[');
        int[] iArr = this.array;
        int i = this.f3711O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        sb.append(iArr[i]);
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

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo trimmed() {
        return (this.f3711O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO > 0 || this.end < this.array.length) ? new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo copyOf(Collection<Integer> collection) {
        return collection.isEmpty() ? f3710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO : new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(collection));
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo of(int i) {
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new int[]{i}, 0, 1);
    }

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int[] iArr, int i, int i2) {
        this.array = iArr;
        this.f3711O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.end = i2;
    }

    public static O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o builder() {
        return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(10);
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo copyOf(Iterable<Integer> iterable) {
        boolean z = iterable instanceof Collection;
        if (z) {
            return copyOf((Collection<Integer>) iterable);
        }
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oBuilder = builder();
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oBuilder.getClass();
        if (z) {
            Collection<Integer> collection = (Collection) iterable;
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oBuilder.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(collection.size());
            for (Integer num : collection) {
                int[] iArr = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oBuilder.f3708O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                int i = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oBuilder.f3709O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oBuilder.f3709O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i + 1;
                iArr[i] = num.intValue();
            }
        } else {
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oBuilder.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(1);
                int[] iArr2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oBuilder.f3708O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                int i2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oBuilder.f3709O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                iArr2[i2] = iIntValue;
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oBuilder.f3709O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2 + 1;
            }
        }
        int i3 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oBuilder.f3709O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        return i3 == 0 ? f3710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO : new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oBuilder.f3708O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 0, i3);
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo of(int i, int i2) {
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new int[]{i, i2}, 0, 2);
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo of(int i, int i2, int i3) {
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new int[]{i, i2, i3}, 0, 3);
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo of(int i, int i2, int i3, int i4) {
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new int[]{i, i2, i3, i4}, 0, 4);
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo of(int i, int i2, int i3, int i4, int i5) {
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new int[]{i, i2, i3, i4, i5}, 0, 5);
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo of(int i, int i2, int i3, int i4, int i5, int i6) {
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new int[]{i, i2, i3, i4, i5, i6}, 0, 6);
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo of(int i, int... iArr) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("the total number of elements must fit in an int", iArr.length <= 2147483646);
        int length = iArr.length + 1;
        int[] iArr2 = new int[length];
        iArr2[0] = i;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iArr2, 0, length);
    }
}
