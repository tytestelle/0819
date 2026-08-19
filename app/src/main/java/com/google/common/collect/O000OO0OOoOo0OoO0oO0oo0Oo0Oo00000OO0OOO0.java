package com.google.common.collect;

import androidx.exifinterface.media.ExifInterface;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotCall;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 extends O000OO0Oo00O000oOoOOOOoo0O00O0OoOoo0oO0o implements O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final /* synthetic */ int f3527O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0;
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O f3528O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public transient O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 f3529O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public static O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object... objArr) {
        O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = new O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO(4);
        for (Object obj : objArr) {
            Objects.requireNonNull(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO);
            obj.getClass();
            o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(obj) + 1, obj);
        }
        Objects.requireNonNull(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO);
        return o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 0 ? of() : new O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO);
    }

    public static <E> O000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO builder() {
        return new O000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO(4);
    }

    public static <E> O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 copyFromEntries(Collection<? extends O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0> collection) {
        O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = new O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO(collection.size());
        for (O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 : collection) {
            Object element = o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getElement();
            int count = o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount();
            if (count != 0) {
                element.getClass();
                o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(element) + count, element);
            }
        }
        return o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 0 ? of() : new O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO);
    }

    public static <E> O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 copyOf(Iterator<? extends E> it) {
        O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = new O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO(4);
        while (it.hasNext()) {
            E next = it.next();
            Objects.requireNonNull(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO);
            next.getClass();
            o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(next) + 1, next);
        }
        Objects.requireNonNull(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO);
        return o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 0 ? of() : new O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO);
    }

    public static <E> O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 of() {
        return O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0.EMPTY;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> Collector<E, ?, O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0> toImmutableMultiset() {
        return O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Function.identity(), new O000O0oo0o00ooooo0Oo000O00ooOOOo00oo0Oo0());
    }

    @Override // com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int add(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O asList() {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = this.f3528O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O != null) {
            return o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
        }
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsList = super.asList();
        this.f3528O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsList;
        return o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsList;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return count(obj) > 0;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int copyIntoArray(Object[] objArr, int i) {
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = entrySet().iterator();
        while (it.hasNext()) {
            O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 = (O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0) it.next();
            Arrays.fill(objArr, i, o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount() + i, o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getElement());
            i += o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount();
        }
        return i;
    }

    public abstract /* synthetic */ int count(@CheckForNull @CompatibleWith(ExifInterface.LONGITUDE_EAST) Object obj);

    @Override // com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public abstract O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 elementSet();

    @Override // java.util.Collection
    public boolean equals(@CheckForNull Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this, obj);
    }

    public abstract O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 getEntry(int i);

    @Override // java.util.Collection
    public int hashCode() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(entrySet());
    }

    @Override // com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int remove(@CheckForNull Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int setCount(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public abstract Object writeReplace();

    public static <E> O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 of(E e) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(e);
    }

    public static <T, E> Collector<T, ?, O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0> toImmutableMultiset(Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        return O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(function, toIntFunction);
    }

    @Override // com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 entrySet() {
        O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0Of = this.f3529O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0Of == null) {
            o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0Of = isEmpty() ? O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of() : new O000OO00ooO0OO0OoOoo0ooO0o0o0ooOoooo000O(this, null);
            this.f3529O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0Of;
        }
        return o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0Of;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return new O000OO000O0oooOOO0oO000oOOo00OO0OoOoOooo(entrySet().iterator());
    }

    @Override // com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean setCount(Object obj, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public static <E> O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 of(E e, E e2) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(e, e2);
    }

    public static <E> O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 of(E e, E e2, E e3) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(e, e2, e3);
    }

    public static <E> O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 of(E e, E e2, E e3, E e4) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(e, e2, e3, e4);
    }

    public static <E> O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 of(E e, E e2, E e3, E e4, E e5) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(e, e2, e3, e4, e5);
    }

    public static <E> O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        O000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO = new O000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO(4);
        o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, e);
        o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, e2);
        o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, e3);
        o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, e4);
        o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, e5);
        o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, e6);
        for (E e7 : eArr) {
            o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, e7);
        }
        return o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    }

    public static <E> O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 copyOf(E[] eArr) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(eArr);
    }

    public static <E> O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 copyOf(Iterable<? extends E> iterable) {
        O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO;
        if (iterable instanceof O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0) {
            O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 o000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 = (O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0) iterable;
            if (!o000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0.isPartialView()) {
                return o000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0;
            }
        }
        boolean z = iterable instanceof O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o;
        O000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO = new O000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO(z ? ((O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) iterable).elementSet().size() : 11);
        Objects.requireNonNull(o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.f3525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        if (z) {
            O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o = (O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) iterable;
            if (o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o instanceof O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0) {
                o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = ((O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0) o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o).contents;
            } else {
                o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o instanceof O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo ? ((O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o).backingMap : null;
            }
            if (o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO != null) {
                O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO2 = o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.f3525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Math.max(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO2.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o));
                for (int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(); iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o >= 0; iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
                    org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o), o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o]);
                }
            } else {
                Set setEntrySet = o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o.entrySet();
                O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO3 = o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.f3525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO3.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Math.max(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO3.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, setEntrySet.size()));
                for (O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 : o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o.entrySet()) {
                    o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount(), o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getElement());
                }
            }
        } else {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(it.next());
            }
        }
        return o000OO00O00O0o0oOO000oO0oOo00oooooO0o0OO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    }
}
