package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public class O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 extends O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo implements O000OoOOOoOooO0OOOoOo00ooOO0OO0o0OOoOO00 {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public transient O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 f3498O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, int i) {
        super(o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, i);
    }

    public static <K, V> O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo builder() {
        return new O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo();
    }

    public static <K, V> O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo builderWithExpectedKeys(int i) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "expectedKeys");
        return new O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo(i);
    }

    public static <K, V> O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 copyOf(O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00) {
        if (o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00.isEmpty()) {
            return of();
        }
        if (o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 instanceof O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0) {
            O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 = (O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0) o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00;
            if (!o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.isPartialView()) {
                return o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0;
            }
        }
        return fromMapEntries(o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00.asMap().entrySet(), null);
    }

    public static <T, K, V> Collector<T, ?, O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0> flatteningToImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        int i = 3;
        Collector collector = O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f3442O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        function.getClass();
        function2.getClass();
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = new O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00(function, 0);
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O01 = new O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00(function2, 1);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(8, "expectedKeys");
        O000o000o0Oo0OoO00o000O0oOO0oo0O0OO0O0OO o000o000o0Oo0OoO00o000O0oOO0oo0O0OO0O0OO = new O000o000o0Oo0OoO00o000O0oOO0oo0O0OO0O0OO(6);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(2, "expectedValuesPerKey");
        return Collectors.collectingAndThen(Collector.of(new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0(new O000o0ooo000oooooOOo000o00O0OOO0oO0ooOo0(o000o000o0Oo0OoO00o000O0oOO0oo0O0OO0O0OO), i), new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00, o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O01, 4), new O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(9), new Collector.Characteristics[0]), new O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(i));
    }

    public static <K, V> O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 fromMapBuilderEntries(Collection<? extends Map.Entry<K, O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo>> collection, @CheckForNull Comparator<? super V> comparator) {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsImmutableList;
        if (collection.isEmpty()) {
            return of();
        }
        O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O = new O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O(collection.size());
        int size = 0;
        for (Map.Entry<K, O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo> entry : collection) {
            K key = entry.getKey();
            O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO = (O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO) entry.getValue();
            if (comparator == null) {
                o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsImmutableList = o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            } else {
                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.f3494O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = true;
                Arrays.sort(o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 0, o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, comparator);
                o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsImmutableList = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.asImmutableList(o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            }
            o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(key, o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsImmutableList);
            size += o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsImmutableList.size();
        }
        return new O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0(o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(), size);
    }

    public static <K, V> O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @CheckForNull Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O = new O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf = comparator == null ? O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) value) : O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.sortedCopyOf(comparator, value);
            if (!o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf.isEmpty()) {
                o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(key, o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf);
                size = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf.size() + size;
            }
        }
        return new O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0(o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(), size);
    }

    public static <K, V> O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 of() {
        return O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.INSTANCE;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Invalid key count "));
        }
        O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OBuilder = O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.builder();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i4, "Invalid value count "));
            }
            O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builder();
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(object2);
            }
            o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OBuilder.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(object, o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
            i2 += i4;
        }
        try {
            O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OBuilder.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000O0oO0o00O0oOoOOOOOooo0oooO000oOOOoo0.f3519O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
            try {
                ((Field) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f836O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).set(this, o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = O000O0oO0o00O0oOoOOOOOooo0oooO000oOOOoo0.f3520O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.getClass();
                try {
                    ((Field) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.f836O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).set(this, Integer.valueOf(i2));
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
        }
    }

    public static <T, K, V> Collector<T, ?, O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0> toImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Collector collector = O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f3442O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(function, "keyFunction");
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(function2, "valueFunction");
        return Collector.of(new androidx.emoji2.text.flatbuffer.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(7), new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(function, function2, 1), new O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(6), new O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(8), new Collector.Characteristics[0]);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo(this, objectOutputStream);
    }

    @Override // com.google.common.collect.O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public /* bridge */ /* synthetic */ O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    public static <K, V> O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 of(K k, V v) {
        O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder = builder();
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k, v);
        return o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }

    @Override // com.google.common.collect.O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo
    public O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 inverse() {
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 = this.f3498O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 != null) {
            return o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0;
        }
        O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder = builder();
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(entry.getValue(), entry.getKey());
        }
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3498O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this;
        this.f3498O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        return o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    @Override // com.google.common.collect.O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    /* JADX INFO: renamed from: replaceValues */
    public /* bridge */ /* synthetic */ Collection mo740replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // com.google.common.collect.O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    /* JADX INFO: renamed from: replaceValues */
    public /* bridge */ /* synthetic */ List mo740replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // com.google.common.collect.O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O get(Object obj) {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = (O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) this.map.get(obj);
        return o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O == null ? O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of() : o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
    }

    @Override // com.google.common.collect.O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    /* JADX INFO: renamed from: removeAll, reason: merged with bridge method [inline-methods] */
    public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O mo739removeAll(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 of(K k, V v, K k2, V v2) {
        O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder = builder();
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k, v);
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k2, v2);
        return o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }

    public static <K, V> O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo = new O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo();
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(it.next());
        }
        return o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }

    public static <K, V> O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 of(K k, V v, K k2, V v2, K k3, V v3) {
        O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder = builder();
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k, v);
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k2, v2);
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k3, v3);
        return o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }

    public static <K, V> O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder = builder();
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k, v);
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k2, v2);
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k3, v3);
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k4, v4);
        return o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }

    public static <K, V> O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder = builder();
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k, v);
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k2, v2);
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k3, v3);
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k4, v4);
        o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k5, v5);
        return o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOoBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }
}
