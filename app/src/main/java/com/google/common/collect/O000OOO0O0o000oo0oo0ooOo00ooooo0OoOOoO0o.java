package com.google.common.collect;

import com.google.errorprone.annotations.DoNotCall;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o extends O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o implements Serializable {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o f3536O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o f3537O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all()));

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final transient O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o f3539O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) {
        this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
    }

    public static <C extends Comparable> O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o all() {
        return f3537O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    public static <C extends Comparable<?>> O000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0 builder() {
        return new O000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0();
    }

    public static <C extends Comparable<?>> O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o copyOf(Iterable<O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> iterable) {
        O000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0 o000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0 = new O000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0();
        for (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 : iterable) {
            if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isEmpty()) {
                throw new IllegalArgumentException(O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("range must not be empty, but was %s", o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0));
            }
            o000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0.f3535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
        }
        return o000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    public static <C extends Comparable> O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o of() {
        return f3536O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> Collector<O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0, ?, O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o> toImmutableRangeSet() {
        return O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f3444O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public static <C extends Comparable<?>> O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o unionOf(Iterable<O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> iterable) {
        return copyOf(O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0.create(iterable));
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void add(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void addAll(O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0) {
        throw new UnsupportedOperationException();
    }

    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 asSet(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.getClass();
        if (isEmpty()) {
            return O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0.of();
        }
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Canonical = span().canonical(o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);
        if (!o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Canonical.hasLowerBound()) {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Canonical.hasUpperBound()) {
            try {
                o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.maxValue();
            } catch (NoSuchElementException unused) {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new O000OO0o0o0oooo00oooOoOooo0O0o0oOo00000O(this, o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);
    }

    public void clear() {
        remove(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all());
    }

    public boolean contains(Comparable comparable) {
        return rangeContaining(comparable) != null;
    }

    public O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o difference(O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0) {
        O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0Create = O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0.create(this);
        o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0Create.removeAll(o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0);
        return copyOf(o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0Create);
    }

    @Override // com.google.common.collect.O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0
    public boolean encloses(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, new androidx.media3.common.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(19), o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound, O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0.ANY_PRESENT, O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo.NEXT_LOWER);
        return iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != -1 && ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)).encloses(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
    }

    public boolean enclosesAll(O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0) {
        return enclosesAll(o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0.asRanges());
    }

    @Override // com.google.common.collect.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    public O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o intersection(O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0) {
        O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0Create = O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0.create(this);
        o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0Create.removeAll(o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0.complement());
        return copyOf(o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0Create);
    }

    public boolean intersects(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, new androidx.media3.common.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(19), o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound, O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0.ANY_PRESENT, O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo.NEXT_HIGHER);
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO < o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.size() && ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.get(iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)).isConnected(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) && !((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.get(iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)).intersection(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0).isEmpty()) {
            return true;
        }
        if (iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO > 0) {
            int i = iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO - 1;
            if (((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.get(i)).isConnected(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) && !((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.get(i)).intersection(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0
    public boolean isEmpty() {
        return this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isEmpty();
    }

    public boolean isPartialView() {
        return this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isPartialView();
    }

    @CheckForNull
    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 rangeContaining(Comparable comparable) {
        int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, new androidx.media3.common.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(19), O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowValue(comparable), O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0.ANY_PRESENT, O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo.NEXT_LOWER);
        if (iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == -1) {
            return null;
        }
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.contains(comparable)) {
            return o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;
        }
        return null;
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void remove(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void removeAll(O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0) {
        throw new UnsupportedOperationException();
    }

    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 span() {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.isEmpty()) {
            throw new NoSuchElementException();
        }
        return O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.get(0)).lowerBound, ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.get(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.size() - 1)).upperBound);
    }

    public O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o union(O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0) {
        Iterable[] iterableArr = {asRanges(), o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0.asRanges()};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return unionOf(new O0000oO0oOooooOOo0oO00Oo0OoO0Oo00OOOo0oo(iterableArr));
    }

    public Object writeReplace() {
        return new O000OOO00OoOoOOOO000o0O0O00O0oOO0O00o0OO(this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    public static <C extends Comparable> O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o of(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.getClass();
        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isEmpty()) {
            return of();
        }
        return o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.equals(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all()) ? all() : new O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0));
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void addAll(Iterable<O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: asDescendingSetOfRanges, reason: merged with bridge method [inline-methods] */
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 m742asDescendingSetOfRanges() {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.isEmpty() ? O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of() : new O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.reverse(), O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.rangeLexOrdering().reverse());
    }

    @Override // com.google.common.collect.O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 asRanges() {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.isEmpty() ? O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of() : new O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.rangeLexOrdering());
    }

    @Override // com.google.common.collect.O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0
    public O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o complement() {
        O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o = this.f3539O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o != null) {
            return o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o;
        }
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.isEmpty()) {
            O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0oAll = all();
            this.f3539O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0oAll;
            return o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0oAll;
        }
        if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.size() == 1 && ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.get(0)).equals(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all())) {
            O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0oOf = of();
            this.f3539O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0oOf;
            return o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0oOf;
        }
        O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o2 = new O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o(new O000OO0ooOO000oOoOOoooo0OOOO0Oo0o0Oo0oo0(this), this);
        this.f3539O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o2;
        return o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o2;
    }

    public boolean enclosesAll(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!encloses((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) it.next())) {
                return false;
            }
        }
        return true;
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void removeAll(Iterable<O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: subRangeSet, reason: merged with bridge method [inline-methods] */
    public O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o m743subRangeSet(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int size;
        if (!isEmpty()) {
            O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Span = span();
            if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.encloses(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Span)) {
                return this;
            }
            if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isConnected(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Span)) {
                O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf.isEmpty() || o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isEmpty()) {
                    o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of();
                } else if (!o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.encloses(span())) {
                    if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.hasLowerBound()) {
                        androidx.media3.common.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new androidx.media3.common.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(20);
                        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound;
                        O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 = O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0.FIRST_AFTER;
                        O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo = O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo.NEXT_HIGHER;
                        o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.getClass();
                        iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0, o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo);
                    } else {
                        iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0;
                    }
                    if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.hasUpperBound()) {
                        androidx.media3.common.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = new androidx.media3.common.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(21);
                        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2 = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound;
                        O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO1 = O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0.FIRST_PRESENT;
                        O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo2 = O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo.NEXT_HIGHER;
                        o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2.getClass();
                        size = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1, o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2, O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural(), o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO1, o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo2);
                    } else {
                        size = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf.size();
                    }
                    int i = size - iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = i == 0 ? O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of() : new O000OO0Oo0o0ooOO0Oo0oOOOo0oO00oooOOoOOoo(this, i, iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
                }
                return new O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf);
            }
        }
        return of();
    }

    public O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o(O000OO0ooOO000oOoOOoooo0OOOO0Oo0o0Oo0oo0 o000OO0ooOO000oOoOOoooo0OOOO0Oo0o0Oo0oo0, O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o) {
        this.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000OO0ooOO000oOoOOoooo0OOOO0Oo0o0Oo0oo0;
        this.f3539O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o;
    }

    public static <C extends Comparable> O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o copyOf(O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0) {
        o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0.getClass();
        if (o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0.isEmpty()) {
            return of();
        }
        if (o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0.encloses(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all())) {
            return all();
        }
        if (o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 instanceof O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o) {
            O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o = (O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o) o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0;
            if (!o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o.isPartialView()) {
                return o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o;
            }
        }
        return new O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) o000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0.asRanges()));
    }
}
