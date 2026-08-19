package com.google.common.collect;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo implements Comparator {
    static final int LEFT_IS_GREATER = 1;
    static final int RIGHT_IS_GREATER = -1;

    public static O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo allEqual() {
        return O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.INSTANCE;
    }

    public static O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo arbitrary() {
        return O000oOOo0OOoOooOOoo0oo0O0Oo0ooOO0o00oOO0.f3645O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public static <T> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo explicit(List<T> list) {
        return new O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0(list);
    }

    public static <T> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo from(Comparator<T> comparator) {
        return comparator instanceof O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo ? (O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo) comparator : new O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo(comparator);
    }

    public static <C extends Comparable> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo natural() {
        return O000oO0ooOooo00OOoOOoOOoOoO00Ooo00Oo0Oo0.INSTANCE;
    }

    public static O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo usingToString() {
        return O00O00o0OOOOo0O0oo00000oOO0OOOOoooo0O00o.INSTANCE;
    }

    @Deprecated
    public int binarySearch(List<Object> list, Object obj) {
        return Collections.binarySearch(list, obj, this);
    }

    public <U> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo compound(Comparator<? super U> comparator) {
        comparator.getClass();
        return new O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo(this, comparator);
    }

    public <E> List<E> greatestOf(Iterable<E> iterable, int i) {
        return reverse().leastOf(iterable, i);
    }

    public <E> O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O immutableSortedCopy(Iterable<E> iterable) {
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E> List<E> leastOf(Iterable<E> iterable, int i) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= ((long) i) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i) {
                    array = Arrays.copyOf(array, i);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i);
    }

    public <S> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo lexicographical() {
        return new O000OoO000OoOoo0oOOO0o0000ooo0oo00000ooO(this);
    }

    public <E> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    public <E> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    public <S> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo nullsFirst() {
        return new O000oOO00oOoOOO0OoOOOO00OO0O0OOooo00Oo00(this);
    }

    public <S> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo nullsLast() {
        return new O000oOO0o0oO0OO0O0o00oOOoo00oooO0o0OOO0O(this);
    }

    public <T2> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo onKeys() {
        return onResultOf(O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo.KEY);
    }

    public <F> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo onResultOf(com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        return new O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, this);
    }

    public <S> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo reverse() {
        return new O000ooOoOOoO0O00OO0oO0O0oO0O0o0O00O00Oo0(this);
    }

    public <E> List<E> sortedCopy(Iterable<E> iterable) {
        Collection collection;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Iterator<E> it = iterable.iterator();
            ArrayList arrayList = new ArrayList();
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList, it);
            collection = arrayList;
        }
        Object[] array = collection.toArray();
        Arrays.sort(array, this);
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return new ArrayList(listAsList);
    }

    public static <T> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo explicit(T t, T... tArr) {
        return explicit(new O000OoOOooO0O0OoOOo0000o00OoO0oo0oOoOO0o(t, tArr));
    }

    public <E> List<E> greatestOf(Iterator<E> it, int i) {
        return reverse().leastOf(it, i);
    }

    public static <T> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo(iterable);
    }

    @Deprecated
    public static <T> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo from(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo) {
        o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.getClass();
        return o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo;
    }

    public <E> E max(Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    public <E> E min(Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    public <E> E max(E e, E e2) {
        return compare(e, e2) >= 0 ? e : e2;
    }

    public <E> E min(E e, E e2) {
        return compare(e, e2) <= 0 ? e : e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> E max(E e, E e2, E e3, E... eArr) {
        E e4 = (E) max(max(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) max(e4, e5);
        }
        return e4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> E min(E e, E e2, E e3, E... eArr) {
        E e4 = (E) min(min(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) min(e4, e5);
        }
        return e4;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:1: B:49:0x00dc->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00de  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0128  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e A[SYNTHETIC] */
    public <E> List<E> leastOf(Iterator<E> it, int i) {
        int iNumberOfLeadingZeros;
        int i2;
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        it.getClass();
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "k");
        if (i == 0 || !it.hasNext()) {
            return Collections.emptyList();
        }
        if (i >= 1073741823) {
            ArrayList arrayList = new ArrayList();
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList, it);
            Collections.sort(arrayList, this);
            if (arrayList.size() > i) {
                arrayList.subList(i, arrayList.size()).clear();
            }
            arrayList.trimToSize();
            return Collections.unmodifiableList(arrayList);
        }
        O00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0 o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0 = new O00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0(this, i);
        while (true) {
            boolean zHasNext = it.hasNext();
            int iMax = 0;
            O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo = o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3678O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            Object[] objArr = o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3679O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            int i8 = o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3677O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (zHasNext) {
                E next = it.next();
                if (i8 != 0) {
                    int i9 = o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    if (i9 == 0) {
                        objArr[0] = next;
                        o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = next;
                        o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 1;
                    } else if (i9 < i8) {
                        o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i9 + 1;
                        objArr[i9] = next;
                        if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(next, o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) > 0) {
                            o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = next;
                        }
                    } else if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(next, o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) < 0) {
                        int i10 = o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        int i11 = i10 + 1;
                        o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i11;
                        objArr[i10] = next;
                        int i12 = i8 * 2;
                        if (i11 == i12) {
                            int i13 = i12 - 1;
                            RoundingMode roundingMode = RoundingMode.CEILING;
                            if (i13 > 0) {
                                switch (O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1597O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[roundingMode.ordinal()]) {
                                    case 1:
                                        O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000((((i12 + (-2)) & i13) == 0) & (i13 > 0));
                                    case 2:
                                    case 3:
                                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i13);
                                        i2 = iNumberOfLeadingZeros * 3;
                                        i3 = i13;
                                        i4 = 0;
                                        i5 = 0;
                                        while (iMax < i3) {
                                            int i14 = ((iMax + i3) + 1) >>> 1;
                                            obj = objArr[i14];
                                            objArr[i14] = objArr[i3];
                                            i6 = iMax;
                                            i7 = i6;
                                            while (i6 < i3) {
                                                if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(objArr[i6], obj) < 0) {
                                                    Object obj2 = objArr[i7];
                                                    objArr[i7] = objArr[i6];
                                                    objArr[i6] = obj2;
                                                    i7++;
                                                }
                                                i6++;
                                            }
                                            objArr[i3] = objArr[i7];
                                            objArr[i7] = obj;
                                            if (i7 > i8) {
                                                i3 = i7 - 1;
                                            } else {
                                                if (i7 < i8) {
                                                    iMax = Math.max(i7, iMax + 1);
                                                    i5 = i7;
                                                }
                                                o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i8;
                                                o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                while (true) {
                                                    i5++;
                                                    if (i5 < i8) {
                                                        if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(objArr[i5], o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) > 0) {
                                                            o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                        }
                                                    }
                                                }
                                            }
                                            i4++;
                                            if (i4 >= i2) {
                                                Arrays.sort(objArr, iMax, i3 + 1, o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo);
                                                o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i8;
                                                o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                while (true) {
                                                    i5++;
                                                    if (i5 < i8) {
                                                        if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(objArr[i5], o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) > 0) {
                                                            o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i8;
                                        o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                        while (true) {
                                            i5++;
                                            if (i5 < i8) {
                                                if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(objArr[i5], o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) > 0) {
                                                    o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                }
                                            }
                                        }
                                        break;
                                    case 4:
                                    case 5:
                                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i12 - 2);
                                        i2 = iNumberOfLeadingZeros * 3;
                                        i3 = i13;
                                        i4 = 0;
                                        i5 = 0;
                                        while (iMax < i3) {
                                            int i15 = ((iMax + i3) + 1) >>> 1;
                                            obj = objArr[i15];
                                            objArr[i15] = objArr[i3];
                                            i6 = iMax;
                                            i7 = i6;
                                            while (i6 < i3) {
                                                if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(objArr[i6], obj) < 0) {
                                                    Object obj3 = objArr[i7];
                                                    objArr[i7] = objArr[i6];
                                                    objArr[i6] = obj3;
                                                    i7++;
                                                }
                                                i6++;
                                            }
                                            objArr[i3] = objArr[i7];
                                            objArr[i7] = obj;
                                            if (i7 > i8) {
                                                i3 = i7 - 1;
                                            } else {
                                                if (i7 < i8) {
                                                    iMax = Math.max(i7, iMax + 1);
                                                    i5 = i7;
                                                }
                                                o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i8;
                                                o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                while (true) {
                                                    i5++;
                                                    if (i5 < i8) {
                                                        if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(objArr[i5], o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) > 0) {
                                                            o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                        }
                                                    }
                                                }
                                            }
                                            i4++;
                                            if (i4 >= i2) {
                                                Arrays.sort(objArr, iMax, i3 + 1, o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo);
                                                o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i8;
                                                o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                while (true) {
                                                    i5++;
                                                    if (i5 < i8) {
                                                        if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(objArr[i5], o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) > 0) {
                                                            o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i8;
                                        o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                        while (true) {
                                            i5++;
                                            if (i5 < i8) {
                                                if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(objArr[i5], o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) > 0) {
                                                    o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                }
                                            }
                                        }
                                        break;
                                    case 6:
                                    case 7:
                                    case 8:
                                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(i13);
                                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros2) - i13))) >>> 31);
                                        i2 = iNumberOfLeadingZeros * 3;
                                        i3 = i13;
                                        i4 = 0;
                                        i5 = 0;
                                        while (iMax < i3) {
                                            int i16 = ((iMax + i3) + 1) >>> 1;
                                            obj = objArr[i16];
                                            objArr[i16] = objArr[i3];
                                            i6 = iMax;
                                            i7 = i6;
                                            while (i6 < i3) {
                                                if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(objArr[i6], obj) < 0) {
                                                    Object obj4 = objArr[i7];
                                                    objArr[i7] = objArr[i6];
                                                    objArr[i6] = obj4;
                                                    i7++;
                                                }
                                                i6++;
                                            }
                                            objArr[i3] = objArr[i7];
                                            objArr[i7] = obj;
                                            if (i7 > i8) {
                                                i3 = i7 - 1;
                                            } else {
                                                if (i7 < i8) {
                                                    iMax = Math.max(i7, iMax + 1);
                                                    i5 = i7;
                                                }
                                                o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i8;
                                                o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                while (true) {
                                                    i5++;
                                                    if (i5 < i8) {
                                                        if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(objArr[i5], o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) > 0) {
                                                            o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                        }
                                                    }
                                                }
                                            }
                                            i4++;
                                            if (i4 >= i2) {
                                                Arrays.sort(objArr, iMax, i3 + 1, o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo);
                                                o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i8;
                                                o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                while (true) {
                                                    i5++;
                                                    if (i5 < i8) {
                                                        if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(objArr[i5], o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) > 0) {
                                                            o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i8;
                                        o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                        while (true) {
                                            i5++;
                                            if (i5 < i8) {
                                                if (o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(objArr[i5], o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) > 0) {
                                                    o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i5];
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                            } else {
                                throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i13, "x (", ") must be > 0"));
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                Arrays.sort(objArr, 0, o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo);
                if (o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo > i8) {
                    Arrays.fill(objArr, i8, objArr.length, (Object) null);
                    o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i8;
                    o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3681O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr[i8 - 1];
                }
                return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, o00O0000oOOoOOOOoO00oOo0o0oOo0OoOOOO0OO0.f3680O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)));
            }
        }
    }
}
