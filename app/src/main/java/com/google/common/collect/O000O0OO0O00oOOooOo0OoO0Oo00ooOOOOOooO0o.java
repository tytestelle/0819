package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o implements Map, Serializable {
    static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public transient O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 f3509O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 f3510O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public transient O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo f3511O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public transient O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO f3512O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public static <K, V> O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O builder() {
        return new O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O(4);
    }

    public static <K, V> O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O builderWithExpectedSize(int i) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "expectedSize");
        return new O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O(i);
    }

    public static void checkNoConflict(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw conflictException(str, obj, obj2);
        }
    }

    public static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        return new IllegalArgumentException("Multiple entries with same " + str + ": " + obj + " and " + obj2);
    }

    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o) && !(map instanceof SortedMap)) {
            O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o = (O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o) map;
            if (!o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.isPartialView()) {
                return o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> Map.Entry<K, V> entryOf(K k, V v) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k, v);
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o of() {
        return O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o.EMPTY;
    }

    @SafeVarargs
    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <T, K, V> Collector<T, ?, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        int i = 6;
        Collector collector = O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f3442O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        function.getClass();
        function2.getClass();
        return Collector.of(new androidx.emoji2.text.flatbuffer.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i), new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(function, function2, 0), new O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(4), new O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(i), new Collector.Characteristics[0]);
    }

    public O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO asMultimap() {
        if (isEmpty()) {
            return O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO.of();
        }
        O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO = this.f3512O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO != null) {
            return o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO;
        }
        O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO2 = new O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO(new O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0(this, null), size(), null);
        this.f3512O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO2;
        return o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO2;
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    public abstract O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 createEntrySet();

    public abstract O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 createKeySet();

    public abstract O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo createValues();

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract boolean isPartialView();

    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo keyIterator() {
        return new O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o(entrySet().iterator());
    }

    @Override // java.util.Map
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<Object, Object> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0(this);
    }

    public Object writeReplace() {
        return new O000O0O0oOoOo0OO0o0oooO0o0O0ooOOOooOOoo0(this);
    }

    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o of(K k, V v) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k, v);
        return O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o.create(1, new Object[]{k, v});
    }

    @Override // java.util.Map
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 entrySet() {
        O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 = this.f3509O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 != null) {
            return o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0;
        }
        O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0CreateEntrySet = createEntrySet();
        this.f3509O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0CreateEntrySet;
        return o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0CreateEntrySet;
    }

    @Override // java.util.Map
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 keySet() {
        O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 = this.f3510O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 != null) {
            return o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0;
        }
        O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0CreateKeySet = createKeySet();
        this.f3510O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0CreateKeySet;
        return o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0CreateKeySet;
    }

    @Override // java.util.Map
    public O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo values() {
        O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo o0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo = this.f3511O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo != null) {
            return o0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo;
        }
        O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo o0000oo0o00o0oOoOoooo0000Ooo000Oo00oOoooCreateValues = createValues();
        this.f3511O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000oo0o00o0oOoOoooo0000Ooo000Oo00oOoooCreateValues;
        return o0000oo0o00o0oOoOoooo0000Ooo000Oo00oOoooCreateValues;
    }

    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o of(K k, V v, K k2, V v2) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k, v);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k2, v2);
        return O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o.create(2, new Object[]{k, v, k2, v2});
    }

    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        boolean z = iterable instanceof Collection;
        O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O = new O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O(z ? ((Collection) iterable).size() : 4);
        if (z) {
            o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(((Collection) iterable).size());
        }
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(it.next());
        }
        return o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    public static <T, K, V> Collector<T, ?, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Collector collector = O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f3442O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        function.getClass();
        function2.getClass();
        binaryOperator.getClass();
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new androidx.emoji2.text.flatbuffer.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(9)), new O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(10));
    }

    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o of(K k, V v, K k2, V v2, K k3, V v3) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k, v);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k2, v2);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k3, v3);
        return O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o.create(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k, v);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k2, v2);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k3, v3);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k4, v4);
        return O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o.create(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k, v);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k2, v2);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k3, v3);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k4, v4);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k5, v5);
        return O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o.create(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k, v);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k2, v2);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k3, v3);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k4, v4);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k5, v5);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k6, v6);
        return O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o.create(6, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6});
    }

    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k, v);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k2, v2);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k3, v3);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k4, v4);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k5, v5);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k6, v6);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k7, v7);
        return O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o.create(7, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7});
    }

    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k, v);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k2, v2);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k3, v3);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k4, v4);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k5, v5);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k6, v6);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k7, v7);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k8, v8);
        return O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o.create(8, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8});
    }

    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k, v);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k2, v2);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k3, v3);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k4, v4);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k5, v5);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k6, v6);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k7, v7);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k8, v8);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k9, v9);
        return O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o.create(9, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9});
    }

    public static <K, V> O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k, v);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k2, v2);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k3, v3);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k4, v4);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k5, v5);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k6, v6);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k7, v7);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k8, v8);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k9, v9);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(k10, v10);
        return O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o.create(10, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10});
    }
}
