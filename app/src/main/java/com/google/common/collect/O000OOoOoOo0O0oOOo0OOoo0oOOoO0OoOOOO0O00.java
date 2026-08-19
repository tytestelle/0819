package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 extends O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o implements NavigableMap {

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static final O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo f3552O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural();

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public static final O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 f3553O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00(O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0.emptySet(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural()), O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final transient O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000 f3554O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final transient O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O f3555O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final transient O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 f3556O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    public O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00(O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000 o000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) {
        this(o000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000, o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, null);
    }

    public static O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Map map, Comparator comparator) {
        boolean zEquals = false;
        if (map instanceof SortedMap) {
            Comparator comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == f3552O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                zEquals = true;
            }
        }
        if (zEquals && (map instanceof O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00)) {
            O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 = (O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00) map;
            if (!o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00.isPartialView()) {
                return o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00;
            }
        }
        Collection collectionEntrySet = map.entrySet();
        Map.Entry<?, ?>[] entryArr = O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.EMPTY_ENTRY_ARRAY;
        if (!(collectionEntrySet instanceof Collection)) {
            Iterator it = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList, it);
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) collectionEntrySet.toArray(entryArr);
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(comparator, zEquals, entryArr2, entryArr2.length);
    }

    public static O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(final Comparator comparator, boolean z, Map.Entry[] entryArr, int i) {
        if (i == 0) {
            return emptyMap(comparator);
        }
        if (i == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(comparator, entry.getKey(), entry.getValue());
        }
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        if (z) {
            for (int i2 = 0; i2 < i; i2++) {
                Map.Entry entry2 = entryArr[i2];
                Objects.requireNonNull(entry2);
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, value);
                objArr[i2] = key;
                objArr2[i2] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, i, new Comparator() { // from class: com.google.common.collect.O000OOoO0oOoOO0O00O00ooo0Oo0o0OO0000ooOO
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    Map.Entry entry4 = (Map.Entry) obj2;
                    Objects.requireNonNull(entry3);
                    Objects.requireNonNull(entry4);
                    return comparator.compare(entry3.getKey(), entry4.getKey());
                }
            });
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key2 = entry3.getKey();
            objArr[0] = key2;
            Object value2 = entry3.getValue();
            objArr2[0] = value2;
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objArr[0], value2);
            int i3 = 1;
            while (i3 < i) {
                Map.Entry entry4 = entryArr[i3 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i3];
                Objects.requireNonNull(entry5);
                Object key3 = entry5.getKey();
                Object value3 = entry5.getValue();
                O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key3, value3);
                objArr[i3] = key3;
                objArr2[i3] = value3;
                O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.checkNoConflict(comparator.compare(key2, key3) != 0, "key", entry4, entry5);
                i3++;
                key2 = key3;
            }
        }
        return new O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00(new O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.asImmutableList(objArr), comparator), O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.asImmutableList(objArr2));
    }

    public static O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Map.Entry... entryArr) {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), false, entryArr, entryArr.length);
    }

    public static O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Comparator comparator, Object obj, Object obj2) {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(obj);
        comparator.getClass();
        return new O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00(new O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf, comparator), O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(obj2));
    }

    @DoNotCall("Use naturalOrder")
    @Deprecated
    public static <K, V> O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0 builder() {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static <K, V> O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0 builderWithExpectedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 copyOf(Map<? extends K, ? extends V> map) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(map, f3552O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
    }

    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 copyOfSorted(SortedMap<K, ? extends V> sortedMap) {
        Comparator<? super K> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = f3552O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        }
        if (sortedMap instanceof O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00) {
            O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 = (O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00) sortedMap;
            if (!o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00.isPartialView()) {
                return o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00;
            }
        }
        Collection collectionEntrySet = sortedMap.entrySet();
        Map.Entry<?, ?>[] entryArr = O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.EMPTY_ENTRY_ARRAY;
        if (!(collectionEntrySet instanceof Collection)) {
            Iterator it = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList, it);
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) collectionEntrySet.toArray(entryArr);
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(comparator, true, entryArr2, entryArr2.length);
    }

    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 emptyMap(Comparator<? super K> comparator) {
        return O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().equals(comparator) ? of() : new O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00(O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0.emptySet(comparator), O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
    }

    public static <K extends Comparable<?>, V> O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0 naturalOrder() {
        return new O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural());
    }

    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of() {
        return f3553O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
    }

    @SafeVarargs
    @DoNotCall("ImmutableSortedMap.ofEntries not currently available; use ImmutableSortedMap.copyOf")
    @Deprecated
    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0 orderedBy(Comparator<K> comparator) {
        return new O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <K extends Comparable<?>, V> O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0 reverseOrder() {
        return new O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().reverse());
    }

    @DoNotCall("Use toImmutableSortedMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        throw new UnsupportedOperationException();
    }

    public static <T, K, V> Collector<T, ?, O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Collector collector = O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f3442O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        comparator.getClass();
        function.getClass();
        function2.getClass();
        return Collector.of(new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0(comparator, 1), new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(function, function2, 3), new O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(8), new O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(11), Collector.Characteristics.UNORDERED);
    }

    public final O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        return i == i2 ? emptyMap(comparator()) : new O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00(this.f3554O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getSubSet(i, i2), this.f3555O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.subList(i, i2));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<Object, Object> ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Object ceilingKey(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public Comparator<Object> comparator() {
        return keySet().comparator();
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 createEntrySet() {
        return isEmpty() ? O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of() : new O000OOoOOOooo0o000O00O0O0OOO0OooooOoO0o0(this);
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 createKeySet() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo createValues() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<Object, Object> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().asList().get(0);
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<Object, Object> floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Object floorKey(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(floorEntry(obj));
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, java.util.Map
    @CheckForNull
    public Object get(@CheckForNull Object obj) {
        int iIndexOf = this.f3554O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        return this.f3555O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.get(iIndexOf);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<Object, Object> higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Object higherKey(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(higherEntry(obj));
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public boolean isPartialView() {
        return this.f3554O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.isPartialView() || this.f3555O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.isPartialView();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<Object, Object> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().asList().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<Object, Object> lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Object lowerKey(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final Map.Entry<Object, Object> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final Map.Entry<Object, Object> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.f3555O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.size();
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public Object writeReplace() {
        return new O000OOoOo0oOoOo00O0O0Oo0O0oOo000o0O0o0O0(this);
    }

    public O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00(O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000 o000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, @CheckForNull O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00) {
        this.f3554O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000;
        this.f3555O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
        this.f3556O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00;
    }

    public static <K extends Comparable<? super K>, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v) {
        return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), k, v);
    }

    @DoNotCall("Use toImmutableSortedMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 descendingKeySet() {
        return this.f3554O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.descendingSet();
    }

    @Override // java.util.NavigableMap
    public O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 descendingMap() {
        O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 = this.f3556O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        if (o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 == null) {
            return isEmpty() ? emptyMap(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.from(comparator()).reverse()) : new O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00((O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000) this.f3554O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.descendingSet(), this.f3555O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.reverse(), this);
        }
        return o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00;
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, java.util.Map
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 navigableKeySet() {
        return this.f3554O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, java.util.Map
    public O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo values() {
        return this.f3555O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return copyOf(iterable, f3552O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
    }

    public static <K extends Comparable<? super K>, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k, v), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k2, v2));
    }

    @Override // java.util.NavigableMap
    public O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 headMap(Object obj, boolean z) {
        obj.getClass();
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0, this.f3554O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.headIndex(obj, z));
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, java.util.Map
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 keySet() {
        return this.f3554O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // java.util.NavigableMap
    public O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    public O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 tailMap(Object obj, boolean z) {
        obj.getClass();
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3554O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.tailIndex(obj, z), size());
    }

    public static <K extends Comparable<? super K>, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k, v), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k2, v2), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k3, v3));
    }

    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        Collection collection;
        comparator.getClass();
        Map.Entry<?, ?>[] entryArr = O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.EMPTY_ENTRY_ARRAY;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            ArrayList arrayList = new ArrayList();
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList, it);
            collection = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) collection.toArray(entryArr);
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(comparator, false, entryArr2, entryArr2.length);
    }

    public static <K extends Comparable<? super K>, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k, v), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k2, v2), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k3, v3), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k4, v4));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public static <K extends Comparable<? super K>, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k, v), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k2, v2), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k3, v3), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k4, v4), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k5, v5));
    }

    public static <T, K, V> Collector<T, ?, O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Collector collector = O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f3442O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        comparator.getClass();
        function.getClass();
        function2.getClass();
        binaryOperator.getClass();
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0(comparator, 2)), new O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(12));
    }

    public static <K extends Comparable<? super K>, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k, v), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k2, v2), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k3, v3), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k4, v4), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k5, v5), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k6, v6));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        comparator.getClass();
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(map, comparator);
    }

    public static <K extends Comparable<? super K>, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k, v), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k2, v2), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k3, v3), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k4, v4), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k5, v5), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k6, v6), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k7, v7));
    }

    public static <K extends Comparable<? super K>, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k, v), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k2, v2), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k3, v3), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k4, v4), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k5, v5), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k6, v6), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k7, v7), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k8, v8));
    }

    public static <K extends Comparable<? super K>, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k, v), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k2, v2), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k3, v3), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k4, v4), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k5, v5), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k6, v6), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k7, v7), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k8, v8), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k9, v9));
    }

    public static <K extends Comparable<? super K>, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k, v), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k2, v2), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k3, v3), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k4, v4), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k5, v5), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k6, v6), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k7, v7), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k8, v8), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k9, v9), O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entryOf(k10, v10));
    }

    @DoNotCall("Pass a key of type Comparable")
    @Deprecated
    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        throw new UnsupportedOperationException();
    }
}
