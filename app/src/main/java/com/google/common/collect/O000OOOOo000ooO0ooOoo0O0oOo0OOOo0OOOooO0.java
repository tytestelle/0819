package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 extends O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo implements Set {
    static final int MAX_TABLE_SIZE = 1073741824;
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O f3542O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public static O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, Object... objArr) {
        if (i == 0) {
            return of();
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return of(obj);
        }
        int iChooseTableSize = chooseTableSize(i);
        Object[] objArr2 = new Object[iChooseTableSize];
        int i2 = iChooseTableSize - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(iHashCode);
            while (true) {
                int i6 = iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new O000ooo0O000O0oOOOO000oO0oo00ooOoo0Oo0OO(obj4);
        }
        if (chooseTableSize(i4) < iChooseTableSize / 2) {
            return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new O000ooOOooOoooO00oooO0OO00oo0oOoO0Oo0o0O(objArr, i3, objArr2, i2, i4);
    }

    public static boolean access$000(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static <E> O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO builder() {
        return new O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO(4);
    }

    public static <E> O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO builderWithExpectedSize(int i) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "expectedSize");
        O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO = new O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO(i);
        o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.f3540O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new Object[chooseTableSize(i)];
        return o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO;
    }

    public static int chooseTableSize(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 copyOf(Collection<? extends E> collection) {
        if ((collection instanceof O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0) && !(collection instanceof SortedSet)) {
            O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 = (O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0) collection;
            if (!o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.isPartialView()) {
                return o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0;
            }
        }
        Object[] array = collection.toArray();
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(array.length, array);
    }

    public static <E> O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 of() {
        return O000ooOOooOoooO00oooO0OO00oo0oOoO0Oo0o0O.EMPTY;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> Collector<E, ?, O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0> toImmutableSet() {
        return O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f3443O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O asList() {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = this.f3542O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O != null) {
            return o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
        }
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCreateAsList = createAsList();
        this.f3542O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCreateAsList;
        return o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCreateAsList;
    }

    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O createAsList() {
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.asImmutableList(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0) && isHashCodeFast() && ((O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public abstract O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator();

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return new O000OOOOO00000o0oOOOOOOO0o00O0OoOooO00oo(toArray());
    }

    public static <E> O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 of(E e) {
        return new O000ooo0O000O0oOOOO000oO0oo00ooOoo0Oo0OO(e);
    }

    public static <E> O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 of(E e, E e2) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(2, e, e2);
    }

    public static <E> O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 of(E e, E e2, E e3) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(3, e, e2, e3);
    }

    public static <E> O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 of(E e, E e2, E e3, E e4) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(4, e, e2, e3, e4);
    }

    public static <E> O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 of(E e, E e2, E e3, E e4, E e5) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    public static <E> O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("the total number of elements must fit in an int", eArr.length <= 2147483641);
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(length, objArr);
    }

    public static <E> O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO = new O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO(4);
        o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(next);
        while (it.hasNext()) {
            o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(it.next());
        }
        return o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
    }

    public static <E> O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(eArr.length, (Object[]) eArr.clone());
        }
        return of((Object) eArr[0]);
    }
}
