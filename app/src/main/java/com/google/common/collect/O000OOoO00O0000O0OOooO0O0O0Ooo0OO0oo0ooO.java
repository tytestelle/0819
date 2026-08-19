package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public class O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO extends O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo implements O000ooOoOooO000o00oo0Oo0oOO0oOoOo00Ooo0o {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final transient O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 f3545O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public transient O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO f3546O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public transient O000OOOoO0Ooo00O0000oooooOO00Oo00O00O00o f3547O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    public O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, int i, @CheckForNull Comparator<Object> comparator) {
        super(o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, i);
        this.f3545O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = comparator == null ? O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of() : O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0.emptySet(comparator);
    }

    public static <K, V> O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO builder() {
        return new O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO();
    }

    public static <K, V> O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO builderWithExpectedKeys(int i) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "expectedKeys");
        return new O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO(i);
    }

    public static <K, V> O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO = new O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO();
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(it.next());
        }
        return o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }

    public static <T, K, V> Collector<T, ?, O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO> flatteningToImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        Collector collector = O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f3442O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        function.getClass();
        function2.getClass();
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = new O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00(function, 2);
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O01 = new O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00(function2, 3);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(8, "expectedKeys");
        new O000o000o0Oo0OoO00o000O0oOO0oo0O0OO0O0OO(6);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(2, "expectedValuesPerKey");
        return Collectors.collectingAndThen(Collector.of(new androidx.emoji2.text.flatbuffer.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(new O000o0ooo0O0oooOO00oooO0OoOOoOOoO0Oo0O00()), new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00, o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O01, 4), new O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(9), new Collector.Characteristics[0]), new O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(5));
    }

    public static <K, V> O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO fromMapBuilderEntries(Collection<? extends Map.Entry<K, O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo>> collection, @CheckForNull Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O = new O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O(collection.size());
        int size = 0;
        for (Map.Entry<K, O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo> entry : collection) {
            K key = entry.getKey();
            O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = ((O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO) entry.getValue()).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            AbstractCollection abstractCollectionCopyOf = comparator == null ? O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.copyOf((Collection) o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) : O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0.copyOf((Comparator) comparator, (Collection) o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0O000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
            if (!abstractCollectionCopyOf.isEmpty()) {
                o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(key, abstractCollectionCopyOf);
                size = abstractCollectionCopyOf.size() + size;
            }
        }
        return new O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO(o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(), size, comparator);
    }

    public static <K, V> O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @CheckForNull Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O = new O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            AbstractCollection abstractCollectionCopyOf = comparator == null ? O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.copyOf((Collection) value) : O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0.copyOf((Comparator) comparator, (Collection) value);
            if (!abstractCollectionCopyOf.isEmpty()) {
                o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(key, abstractCollectionCopyOf);
                size = abstractCollectionCopyOf.size() + size;
            }
        }
        return new O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO(o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(), size, comparator);
    }

    public static <K, V> O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO of() {
        return O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.INSTANCE;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
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
            O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO = comparator == null ? new O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO(4) : new O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(object2);
            }
            O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            if (o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.size() != i4) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + object);
            }
            o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OBuilder.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(object, o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0O000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
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
                    O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = O000OOo000OO0oOO0OO00oO00O0OoOO000OoO00O.f3544O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    Object objOf = comparator == null ? O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of() : O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0.emptySet(comparator);
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3.getClass();
                    try {
                        ((Field) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3.f836O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).set(this, objOf);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    }
                } catch (IllegalAccessException e2) {
                    throw new AssertionError(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        } catch (IllegalArgumentException e4) {
            throw ((InvalidObjectException) new InvalidObjectException(e4.getMessage()).initCause(e4));
        }
    }

    public static <T, K, V> Collector<T, ?, O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO> toImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Collector collector = O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f3442O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(function, "keyFunction");
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(function2, "valueFunction");
        return Collector.of(new androidx.emoji2.text.flatbuffer.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(8), new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(function, function2, 2), new O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(7), new O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(9), new Collector.Characteristics[0]);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo(this, objectOutputStream);
    }

    @Override // com.google.common.collect.O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public /* bridge */ /* synthetic */ O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @CheckForNull
    public Comparator<Object> valueComparator() {
        O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 = this.f3545O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 instanceof O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0) {
            return ((O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0) o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0).comparator();
        }
        return null;
    }

    public static <K, V> O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO of(K k, V v) {
        O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder = builder();
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k, v);
        return o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }

    @Override // com.google.common.collect.O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo
    public O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO inverse() {
        O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO = this.f3546O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        if (o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO != null) {
            return o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO;
        }
        O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder = builder();
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(entry.getValue(), entry.getKey());
        }
        O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3546O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this;
        this.f3546O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        return o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
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
    public /* bridge */ /* synthetic */ Set mo740replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // com.google.common.collect.O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 entries() {
        O000OOOoO0Ooo00O0000oooooOO00Oo00O00O00o o000OOOoO0Ooo00O0000oooooOO00Oo00O00O00o = this.f3547O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        if (o000OOOoO0Ooo00O0000oooooOO00Oo00O00O00o != null) {
            return o000OOOoO0Ooo00O0000oooooOO00Oo00O00O00o;
        }
        O000OOOoO0Ooo00O0000oooooOO00Oo00O00O00o o000OOOoO0Ooo00O0000oooooOO00Oo00O00O00o2 = new O000OOOoO0Ooo00O0000oooooOO00Oo00O00O00o(this);
        this.f3547O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000OOOoO0Ooo00O0000oooooOO00Oo00O00O00o2;
        return o000OOOoO0Ooo00O0000oooooOO00Oo00O00O00o2;
    }

    @Override // com.google.common.collect.O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 get(Object obj) {
        return (O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0) com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo((O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0) this.map.get(obj), this.f3545O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    @Override // com.google.common.collect.O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    /* JADX INFO: renamed from: removeAll */
    public final O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 mo739removeAll(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO of(K k, V v, K k2, V v2) {
        O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder = builder();
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k, v);
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k2, v2);
        return o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }

    public static <K, V> O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO copyOf(O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00) {
        o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00.getClass();
        if (o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00.isEmpty()) {
            return of();
        }
        if (o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 instanceof O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO) {
            O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO = (O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO) o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00;
            if (!o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO.isPartialView()) {
                return o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO;
            }
        }
        return fromMapEntries(o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00.asMap().entrySet(), null);
    }

    public static <K, V> O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO of(K k, V v, K k2, V v2, K k3, V v3) {
        O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder = builder();
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k, v);
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k2, v2);
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k3, v3);
        return o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }

    public static <K, V> O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder = builder();
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k, v);
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k2, v2);
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k3, v3);
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k4, v4);
        return o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }

    public static <K, V> O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder = builder();
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k, v);
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k2, v2);
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k3, v3);
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k4, v4);
        o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(k5, v5);
        return o000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOOBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }
}
