package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 extends O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 implements NavigableSet, O000ooo0O0O000o00000Oo0o00OoOOoO00OoooO0 {
    private static final long serialVersionUID = 912559;
    final transient Comparator<Object> comparator;

    @CheckForNull
    @LazyInit
    transient O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 descendingSet;

    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0(Comparator<Object> comparator) {
        this.comparator = comparator;
    }

    @DoNotCall("Use naturalOrder")
    @Deprecated
    public static <E> O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO builder() {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static <E> O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO builderWithExpectedSize(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 construct(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return emptySet(comparator);
        }
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i, eArr);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (Object) eArr[i3];
            if (comparator.compare(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, (Object) eArr[i2 - 1]) != 0) {
                eArr[i2] = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i2);
        }
        return new O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.asImmutableList(eArr, i2), comparator);
    }

    public static <E extends Comparable<? super E>> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 copyOf(E[] eArr) {
        return construct(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), eArr.length, (Comparable[]) eArr.clone());
    }

    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 copyOfSorted(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            comparator = O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural();
        }
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) sortedSet);
        return o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf.isEmpty() ? emptySet(comparator) : new O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf, comparator);
    }

    public static <E> O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000 emptySet(Comparator<? super E> comparator) {
        return O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().equals(comparator) ? O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000.NATURAL_EMPTY_SET : new O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(), comparator);
    }

    public static <E extends Comparable<?>> O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO naturalOrder() {
        return new O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural());
    }

    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 of() {
        return O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000.NATURAL_EMPTY_SET;
    }

    public static <E> O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO orderedBy(Comparator<E> comparator) {
        return new O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO reverseOrder() {
        return new O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO(Collections.reverseOrder());
    }

    @DoNotCall("Use toImmutableSortedSet")
    @Deprecated
    public static <E> Collector<E, ?, O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0> toImmutableSet() {
        throw new UnsupportedOperationException();
    }

    public static <E> Collector<E, ?, O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0> toImmutableSortedSet(Comparator<? super E> comparator) {
        Collector collector = O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f3442O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        comparator.getClass();
        return Collector.of(new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0(comparator, 0), new O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo(3), new O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(5), new O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(7), new Collector.Characteristics[0]);
    }

    @CheckForNull
    public Object ceiling(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(tailSet(obj, true).iterator(), null);
    }

    @Override // java.util.SortedSet
    public Comparator<Object> comparator() {
        return this.comparator;
    }

    public abstract O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 createDescendingSet();

    @Override // java.util.NavigableSet
    public abstract O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo descendingIterator();

    public Object first() {
        return iterator().next();
    }

    @CheckForNull
    public Object floor(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(headSet(obj, true).descendingIterator(), null);
    }

    public abstract O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 headSetImpl(Object obj, boolean z);

    @CheckForNull
    public Object higher(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(tailSet(obj, false).iterator(), null);
    }

    public abstract int indexOf(@CheckForNull Object obj);

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public abstract O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator();

    public Object last() {
        return descendingIterator().next();
    }

    @CheckForNull
    public Object lower(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(headSet(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 subSetImpl(Object obj, boolean z, Object obj2, boolean z2);

    public abstract O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 tailSetImpl(Object obj, boolean z);

    public int unsafeCompare(Object obj, @CheckForNull Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return new O000OOoo0O0o0OoO0o0OOOOooO00o000O0OO0oOO(this.comparator, toArray());
    }

    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 copyOf(Iterable<? extends E> iterable) {
        return copyOf(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), iterable);
    }

    public static <E extends Comparable<? super E>> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 of(E e) {
        return new O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(e), O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural());
    }

    public static int unsafeCompare(Comparator<?> comparator, Object obj, @CheckForNull Object obj2) {
        return comparator.compare(obj, obj2);
    }

    @Override // java.util.NavigableSet
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 descendingSet() {
        O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 o000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 = this.descendingSet;
        if (o000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 != null) {
            return o000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0;
        }
        O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 o000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0CreateDescendingSet = createDescendingSet();
        this.descendingSet = o000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0CreateDescendingSet;
        o000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0CreateDescendingSet.descendingSet = this;
        return o000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0CreateDescendingSet;
    }

    public static <E extends Comparable<? super E>> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 of(E e, E e2) {
        return construct(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), 2, e, e2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), (Collection) collection);
    }

    public static <E extends Comparable<? super E>> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 of(E e, E e2, E e3) {
        return construct(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), 3, e, e2, e3);
    }

    @Override // java.util.NavigableSet
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 headSet(Object obj, boolean z) {
        obj.getClass();
        return headSetImpl(obj, z);
    }

    @Override // java.util.NavigableSet
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.comparator.compare(obj, obj2) <= 0);
        return subSetImpl(obj, z, obj2, z2);
    }

    @Override // java.util.NavigableSet
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 tailSet(Object obj, boolean z) {
        obj.getClass();
        return tailSetImpl(obj, z);
    }

    public static <E extends Comparable<? super E>> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 of(E e, E e2, E e3, E e4) {
        return construct(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), 4, e, e2, e3, e4);
    }

    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 copyOf(Iterator<? extends E> it) {
        return copyOf(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), it);
    }

    public static <E extends Comparable<? super E>> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 of(E e, E e2, E e3, E e4, E e5) {
        return construct(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), 5, e, e2, e3, e4, e5);
    }

    public static <E extends Comparable<? super E>> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        int length = eArr.length + 6;
        Comparable[] comparableArr = new Comparable[length];
        comparableArr[0] = e;
        comparableArr[1] = e2;
        comparableArr[2] = e3;
        comparableArr[3] = e4;
        comparableArr[4] = e5;
        comparableArr[5] = e6;
        System.arraycopy(eArr, 0, comparableArr, 6, eArr.length);
        return construct(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), length, comparableArr);
    }

    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO o000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO = new O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO(comparator);
        it.getClass();
        while (it.hasNext()) {
            o000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(it.next());
        }
        return o000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    }

    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 copyOf(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator, (Iterable) collection);
    }

    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Collection collection;
        comparator.getClass();
        if (O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(comparator, iterable) && (iterable instanceof O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0)) {
            O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 o000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 = (O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0) iterable;
            if (!o000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0.isPartialView()) {
                return o000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0;
            }
        }
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Iterator<? extends E> it = iterable.iterator();
            ArrayList arrayList = new ArrayList();
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList, it);
            collection = arrayList;
        }
        Object[] array = collection.toArray();
        return construct(comparator, array.length, array);
    }

    @DoNotCall("Pass a parameter of type Comparable")
    @Deprecated
    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 of(E e) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 of(E e, E e2) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 of(E e, E e2, E e3) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 of(E e, E e2, E e3, E e4) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 of(E e, E e2, E e3, E e4, E e5) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <E> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <Z> O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 copyOf(Z[] zArr) {
        throw new UnsupportedOperationException();
    }
}
