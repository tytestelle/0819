package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0 extends O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o {
    private static final long serialVersionUID = 0;
    private final O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 range;

    public O000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0, O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        super(o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);
        this.range = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;
    }

    public static boolean access$000(Comparable comparable, Comparable comparable2) {
        return comparable2 != null && O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.compareOrThrow(comparable, comparable2) == 0;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        return this.range.isConnected(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) ? O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.create(this.range.intersection(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0), this.domain) : new O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo(this.domain);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.range.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, collection);
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O createAsList() {
        return this.domain.supportsFastOffset ? new O000oOoo00O0oooO0ooOOoOo000oo0O0O0oOOooO(this) : super.createAsList();
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0) {
            O000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0 o000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0 = (O000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0) obj;
            if (this.domain.equals(o000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0.domain)) {
                return first().equals(o000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0.first()) && last().equals(o000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0.last());
            }
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, java.util.Collection, java.util.Set
    public int hashCode() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public int indexOf(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return -1;
        }
        Objects.requireNonNull(obj);
        return (int) this.domain.distance(first(), (Comparable) obj);
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o intersection(O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o) {
        o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.getClass();
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.domain.equals(o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.domain));
        if (o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.isEmpty()) {
            return o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o;
        }
        Comparable comparable = (Comparable) O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().max(first(), (Comparable) o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.first());
        Comparable comparable2 = (Comparable) O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().min(last(), (Comparable) o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.last());
        return comparable.compareTo(comparable2) <= 0 ? O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.create(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.closed(comparable, comparable2), this.domain) : new O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo(this.domain);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o
    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 range() {
        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.CLOSED;
        return range(o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long jDistance = this.domain.distance(first(), last());
        if (jDistance >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) jDistance) + 1;
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o, com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return new O000oOoooOOoo00OoOO000O0Oo00oO000OoOoO00(this.range, this.domain, null);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo descendingIterator() {
        return new O000oOo0ooO0o000o0Oo000000OOOo0OooOo0o0O(this, last());
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.SortedSet
    public Comparable first() {
        Comparable comparableLeastValueAbove = this.range.lowerBound.leastValueAbove(this.domain);
        Objects.requireNonNull(comparableLeastValueAbove);
        return comparableLeastValueAbove;
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o, com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o headSetImpl(Comparable comparable, boolean z) {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upTo(comparable, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z)));
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return new O000oOo0oo0o0OO00o00ooo0OOo0Oo0O0O0O0o0O(this, first());
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.SortedSet
    public Comparable last() {
        Comparable comparableGreatestValueBelow = this.range.upperBound.greatestValueBelow(this.domain);
        Objects.requireNonNull(comparableGreatestValueBelow);
        return comparableGreatestValueBelow;
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o
    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 range(O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1) {
        return O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(this.range.lowerBound.withLowerBoundType(o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, this.domain), this.range.upperBound.withUpperBoundType(o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1, this.domain));
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o, com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o subSetImpl(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        return (comparable.compareTo(comparable2) != 0 || z || z2) ? O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.range(comparable, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z), comparable2, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z2))) : new O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo(this.domain);
    }

    @Override // com.google.common.collect.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o, com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o tailSetImpl(Comparable comparable, boolean z) {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.downTo(comparable, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z)));
    }
}
