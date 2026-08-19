package com.google.common.collect;

import com.google.errorprone.annotations.DoNotCall;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o extends O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 {
    final O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O domain;

    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        super(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural());
        this.domain = o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O;
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public static <E> O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO builder() {
        throw new UnsupportedOperationException();
    }

    public static O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o closed(int i, int i2) {
        return create(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.closed(Integer.valueOf(i), Integer.valueOf(i2)), O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.integers());
    }

    public static O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o closedOpen(int i, int i2) {
        return create(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.closedOpen(Integer.valueOf(i), Integer.valueOf(i2)), O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.integers());
    }

    public static <C extends Comparable> O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o create(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0, O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.getClass();
        o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.getClass();
        try {
            O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Intersection = !o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.hasLowerBound() ? o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.intersection(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.atLeast(o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.minValue())) : o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;
            if (!o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.hasUpperBound()) {
                o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Intersection = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Intersection.intersection(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.atMost(o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.maxValue()));
            }
            if (!o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Intersection.isEmpty()) {
                Comparable comparableLeastValueAbove = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound.leastValueAbove(o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);
                Objects.requireNonNull(comparableLeastValueAbove);
                Comparable comparableGreatestValueBelow = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound.greatestValueBelow(o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);
                Objects.requireNonNull(comparableGreatestValueBelow);
                if (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.compareOrThrow(comparableLeastValueAbove, comparableGreatestValueBelow) <= 0) {
                    return new O000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Intersection, o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);
                }
            }
            return new O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo(o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 createDescendingSet() {
        return new O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo(this);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public abstract O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o headSetImpl(Comparable comparable, boolean z);

    public abstract O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o intersection(O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o);

    public abstract O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 range();

    public abstract O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 range(O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1);

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public abstract O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o subSetImpl(Comparable comparable, boolean z, Comparable comparable2, boolean z2);

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public abstract O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o tailSetImpl(Comparable comparable, boolean z);

    @Override // java.util.AbstractCollection
    public String toString() {
        return range().toString();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    public static O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o closed(long j, long j2) {
        return create(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.closed(Long.valueOf(j), Long.valueOf(j2)), O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.longs());
    }

    public static O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o closedOpen(long j, long j2) {
        return create(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.closedOpen(Long.valueOf(j), Long.valueOf(j2)), O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.longs());
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet, java.util.SortedSet
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o headSet(Comparable comparable) {
        comparable.getClass();
        return headSetImpl(comparable, false);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet, java.util.SortedSet
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o subSet(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(comparator().compare(comparable, comparable2) <= 0);
        return subSetImpl(comparable, true, comparable2, false);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet, java.util.SortedSet
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o tailSet(Comparable comparable) {
        comparable.getClass();
        return tailSetImpl(comparable, true);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o headSet(Comparable comparable, boolean z) {
        comparable.getClass();
        return headSetImpl(comparable, z);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o tailSet(Comparable comparable, boolean z) {
        comparable.getClass();
        return tailSetImpl(comparable, z);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o subSet(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        comparable.getClass();
        comparable2.getClass();
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(comparator().compare(comparable, comparable2) <= 0);
        return subSetImpl(comparable, z, comparable2, z2);
    }
}
