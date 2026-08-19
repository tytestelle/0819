package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O extends O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo implements List, RandomAccess {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O0000oO0oOoo0Oo00o0oo00oo0Oo0ooOOo0o0oO0 f3497O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000oO0oOoo0Oo00o0oo00oo0Oo0ooOOo0o0oO0(0, O000oo00OO0Oo0oOOo0O00000O0oO0o0oOo0o00o.EMPTY);
    private static final long serialVersionUID = -889275714;

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static <E> O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO builder() {
        return new O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO(4);
    }

    public static <E> O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO builderWithExpectedSize(int i) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "expectedSize");
        return new O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO(i);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O copyOf(Collection<? extends E> collection) {
        if (collection instanceof O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) {
            O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsList = ((O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) collection).asList();
            return o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsList.isPartialView() ? asImmutableList(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsList.toArray()) : o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsList;
        }
        Object[] array = collection.toArray();
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(array.length, array);
        return asImmutableList(array);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O of() {
        return O000oo00OO0Oo0oOOo0O00000O0oO0o0oOo0o00o.EMPTY;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O sortedCopyOf(Iterable<? extends E> iterable) {
        Collection collection;
        Comparable[] comparableArr = new Comparable[0];
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Iterator<? extends E> it = iterable.iterator();
            ArrayList arrayList = new ArrayList();
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList, it);
            collection = arrayList;
        }
        Comparable[] comparableArr2 = (Comparable[]) collection.toArray(comparableArr);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(comparableArr2.length, comparableArr2);
        Arrays.sort(comparableArr2);
        return asImmutableList(comparableArr2);
    }

    public static <E> Collector<E, ?, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O> toImmutableList() {
        return O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f3442O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // java.util.List
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i, Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    @InlineMe(replacement = "this")
    @Deprecated
    public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O asList() {
        return this;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O reverse() {
        return size() <= 1 ? this : new O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o(this);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O subListUnchecked(int i, int i2) {
        return new O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o(this, i, i2 - i);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return new O0000ooOoo00O0Oo0OOoOoO0OO00o0oo00oo0Oo0(toArray());
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O asImmutableList(Object[] objArr, int i) {
        return i == 0 ? of() : new O000oo00OO0Oo0oOOo0O00000O0oO0o0oOo0o00o(objArr, i);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O of(E e) {
        Object[] objArr = {e};
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, objArr);
        return asImmutableList(objArr);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O subList(int i, int i2) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? of() : subListUnchecked(i, i2);
    }

    @Override // java.util.List
    public O00O00o00OOOo0o00o0OOoOOooo00Oo0ooo000oo listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public O00O00o00OOOo0o00o0OOoOOooo00Oo0ooo000oo listIterator(int i) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i, size());
        if (isEmpty()) {
            return f3497O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        return new O0000oO0oOoo0Oo00o0oo00oo0Oo0ooOOo0o0oO0(i, this);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O of(E e, E e2) {
        Object[] objArr = {e, e2};
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(2, objArr);
        return asImmutableList(objArr);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO = new O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO(4);
        o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(next);
        while (it.hasNext()) {
            o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(it.next());
        }
        return o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O of(E e, E e2, E e3) {
        Object[] objArr = {e, e2, e3};
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(3, objArr);
        return asImmutableList(objArr);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O of(E e, E e2, E e3, E e4) {
        Object[] objArr = {e, e2, e3, e4};
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(4, objArr);
        return asImmutableList(objArr);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Collection collection;
        comparator.getClass();
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Iterator<? extends E> it = iterable.iterator();
            ArrayList arrayList = new ArrayList();
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList, it);
            collection = arrayList;
        }
        Object[] array = collection.toArray();
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(array.length, array);
        Arrays.sort(array, comparator);
        return asImmutableList(array);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O of(E e, E e2, E e3, E e4, E e5) {
        Object[] objArr = {e, e2, e3, e4, e5};
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(5, objArr);
        return asImmutableList(objArr);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O of(E e, E e2, E e3, E e4, E e5, E e6) {
        Object[] objArr = {e, e2, e3, e4, e5, e6};
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(6, objArr);
        return asImmutableList(objArr);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        Object[] objArr = (Object[]) eArr.clone();
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objArr.length, objArr);
        return asImmutableList(objArr);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O of(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7};
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(7, objArr);
        return asImmutableList(objArr);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O copyOf(Iterable<? extends E> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8};
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(8, objArr);
        return asImmutableList(objArr);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9};
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(9, objArr);
        return asImmutableList(objArr);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9, e10};
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(10, objArr);
        return asImmutableList(objArr);
    }

    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11};
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(11, objArr);
        return asImmutableList(objArr);
    }

    @SafeVarargs
    public static <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("the total number of elements must fit in an int", eArr.length <= 2147483635);
        int length = eArr.length + 12;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(length, objArr);
        return asImmutableList(objArr);
    }
}
