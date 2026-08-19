package com.google.common.collect;

import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo {
    public static boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(List list, com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Object obj, O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo, O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0, O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo) {
        AbstractList abstractListO0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 = O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0(list, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.getClass();
        o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0.getClass();
        o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo.getClass();
        if (!(abstractListO0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 instanceof RandomAccess)) {
            abstractListO0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 = new ArrayList(abstractListO0000O0oOoo000OooOOOO00oOoooOO00oOooooo0);
        }
        int size = abstractListO0000O0oOoo000OooOOOO00oOoooOO00oOooooo0.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int iCompare = o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.compare(obj, abstractListO0000O0oOoo000OooOOOO00oOoooOO00oOooooo0.get(i2));
            if (iCompare < 0) {
                size = i2 - 1;
            } else {
                if (iCompare <= 0) {
                    return o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0.resultIndex(o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo, obj, abstractListO0000O0oOoo000OooOOOO00oOoooOO00oOooooo0.subList(i, size + 1), i2 - i) + i;
                }
                i = i2 + 1;
            }
        }
        return o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo.resultIndex(i);
    }

    public static int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        if (i < 3) {
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i2, "at index "));
            }
        }
    }

    public static void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("distance cannot be negative but was: ", j));
        }
    }

    public static void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(boolean z) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(z, "no calls to next() since the last call to remove()");
    }

    public static void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static Object O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static boolean O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o, Object obj) {
        if (obj == o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) {
            return true;
        }
        if (obj instanceof O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) {
            O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o2 = (O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) obj;
            if (o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o.size() == o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o2.size() && o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o.entrySet().size() == o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o2.entrySet().size()) {
                for (O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 : o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o2.entrySet()) {
                    if (o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o.count(o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getElement()) != o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static O000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(Set set, com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof O000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo)) {
                set.getClass();
                return new O000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo(set, o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
            }
            O000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo o000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo = (O000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo) set;
            com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1 = o000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1.getClass();
            return new O000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo(o000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, new com.google.common.base.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(Arrays.asList(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1, o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0), null));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof O000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo)) {
            set2.getClass();
            return new O000ooOoo0oOOOOOOo0oOOoOOOo0oO0O0O0ooO00(set2, o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
        }
        O000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo o000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo2 = (O000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo) set2;
        com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o2 = o000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo2.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o2.getClass();
        return new O000ooOoo0oOOOOOOo0oOOoOOOo0oO0O0O0ooO00((SortedSet) o000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo2.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, new com.google.common.base.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(Arrays.asList(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o2, o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0), null));
    }

    public static O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO O00000OOoOOO00O00o0ooooooooO000ooooO0000(Class cls, String str) {
        try {
            return new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static Object O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(list, 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(Iterable iterable) {
        Object next = null;
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return null;
            }
            if (iterable instanceof List) {
                return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o((List) iterable, 1);
            }
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
        }
        return next;
    }

    public static Object O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(Iterator it, String str) {
        return it.hasNext() ? it.next() : str;
    }

    public static Object O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(List list) {
        Iterator it = list.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(Comparator comparator, Iterable iterable) {
        Comparator<Object> comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural();
            }
        } else {
            if (!(iterable instanceof O000ooo0O0O000o00000Oo0o00OoOOoO00OoooO0)) {
                return false;
            }
            comparator2 = ((O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0) ((O000ooo0O0O000o00000Oo0o00OoOOoO00OoooO0) iterable)).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static int O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static O000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOO O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO1) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, "set1");
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO1, "set2");
        return new O000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOO(o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO1);
    }

    public static Object O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static int O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static ArrayList O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(Object... objArr) {
        int length = objArr.length;
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(length, "arraySize");
        ArrayList arrayList = new ArrayList(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(Iterator it) {
        return it instanceof O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o ? (O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o) it : new O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o(it);
    }

    public static Object O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static int O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(obj);
        int i2 = iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o & i;
        int iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(i2, obj3);
        if (iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 == 0) {
            return -1;
        }
        int i3 = ~i;
        int i4 = iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o & i3;
        int i5 = -1;
        while (true) {
            int i6 = iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 - 1;
            int i7 = iArr[i6];
            if ((i7 & i3) == i4 && com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, objArr[i6]) && (objArr2 == null || com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj2, objArr2[i6]))) {
                int i8 = i7 & i;
                if (i5 == -1) {
                    O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(obj3, i2, i8);
                } else {
                    iArr[i5] = O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(iArr[i5], i8, i);
                }
                return i6;
            }
            int i9 = i7 & i;
            if (i9 == 0) {
                return -1;
            }
            i5 = i6;
            iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = i9;
        }
    }

    public static boolean O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) {
            collection = ((O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) collection).elementSet();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        Iterator it2 = set.iterator();
        collection.getClass();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static int O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo o00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) {
        long j = 0;
        while (o00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo.hasNext()) {
            o00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo.next();
            j++;
        }
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(j);
    }

    public static void O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(List list, com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static int O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(Object obj) {
        return O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(obj == null ? 0 : obj.hashCode());
    }

    public static int O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & ISelectionInterface.HELD_NOTHING : ((int[]) obj)[i];
    }

    public static void O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(int i) {
        int iMax = Math.max(i + 1, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (1.0d * ((double) iHighestOneBit)))) {
            int i2 = iHighestOneBit << 1;
            iHighestOneBit = i2 > 0 ? i2 : 1073741824;
        }
        return Math.max(4, iHighestOneBit);
    }

    public static String O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static String O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0(Map map) {
        int size = map.size();
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, IjkMediaMeta.AV_CH_STEREO_RIGHT));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static AbstractList O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0(List list, com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        return list instanceof RandomAccess ? new O000OoOo0ooOoo0o0OO0oooooOOOO0OOoo0O0OOO(list, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) : new O000Ooo0Oo00oOoo0000oOO00OoOoOO0OOOoO0O0(list, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
    }

    public static NavigableSet O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(NavigableSet navigableSet) {
        return ((navigableSet instanceof O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) || (navigableSet instanceof O000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO)) ? navigableSet : new O000ooo00oo000OOoO0o0O00O0ooOOoO0OO000OO(navigableSet);
    }

    public static void O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.asMap().size());
        for (Map.Entry entry : o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}
