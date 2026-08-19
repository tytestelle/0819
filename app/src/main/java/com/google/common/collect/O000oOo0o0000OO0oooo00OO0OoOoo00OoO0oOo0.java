package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 extends O000oOo0o00oO0OOOoOooO0o0OoOOoOoO000ooOo implements com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 f3647O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll(), O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveAll());
    private static final long serialVersionUID = 0;
    final O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo lowerBound;
    final O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo upperBound;

    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2) {
        o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.getClass();
        this.lowerBound = o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo;
        o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2.getClass();
        this.upperBound = o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2;
        if (o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.compareTo(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2) > 0 || o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo == O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveAll() || o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2 == O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll()) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.describeAsLowerBound(sb2);
            sb2.append("..");
            o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2.describeAsUpperBound(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 all() {
        return f3647O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 atLeast(C c) {
        return create(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowValue(c), O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveAll());
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 atMost(C c) {
        return create(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll(), O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveValue(c));
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 closed(C c, C c2) {
        return create(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowValue(c), O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveValue(c2));
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 closedOpen(C c, C c2) {
        return create(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowValue(c), O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowValue(c2));
    }

    public static int compareOrThrow(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 create(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2) {
        return new O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2);
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 downTo(C c, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) {
        int i = O000oOo00OO0OOo0oOo0ooOO0O0000OOOo00ooOO.f3646O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.ordinal()];
        if (i == 1) {
            return greaterThan(c);
        }
        if (i == 2) {
            return atLeast(c);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 encloseAll(Iterable<C> iterable) {
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        C next = it.next();
        next.getClass();
        Comparable comparable = next;
        while (it.hasNext()) {
            C next2 = it.next();
            next2.getClass();
            next = (Comparable) O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().min(next, next2);
            comparable = (Comparable) O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().max(comparable, next2);
        }
        return closed(next, comparable);
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 greaterThan(C c) {
        return create(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveValue(c), O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveAll());
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 lessThan(C c) {
        return create(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll(), O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowValue(c));
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 open(C c, C c2) {
        return create(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveValue(c), O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowValue(c2));
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 openClosed(C c, C c2) {
        return create(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveValue(c), O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveValue(c2));
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 range(C c, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, C c2, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1) {
        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.getClass();
        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.getClass();
        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O2 = O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.OPEN;
        return create(o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 == o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O2 ? O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveValue(c) : O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowValue(c), o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1 == o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O2 ? O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowValue(c2) : O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveValue(c2));
    }

    public static <C extends Comparable<?>> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo rangeLexOrdering() {
        return O000oOo00OOoOOOO0O0oOoOo0000o0o00o0oO000.INSTANCE;
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 singleton(C c) {
        return closed(c, c);
    }

    public static <C extends Comparable<?>> O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 upTo(C c, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) {
        int i = O000oOo00OO0OOo0oOo0ooOO0O0000OOOo00ooOO.f3646O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.ordinal()];
        if (i == 1) {
            return lessThan(c);
        }
        if (i == 2) {
            return atMost(c);
        }
        throw new AssertionError();
    }

    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 canonical(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.getClass();
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoCanonical = this.lowerBound.canonical(o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoCanonical2 = this.upperBound.canonical(o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);
        return (o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoCanonical == this.lowerBound && o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoCanonical2 == this.upperBound) ? this : create(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoCanonical, o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoCanonical2);
    }

    public boolean contains(Comparable comparable) {
        comparable.getClass();
        return this.lowerBound.isLessThan(comparable) && !this.upperBound.isLessThan(comparable);
    }

    public boolean containsAll(Iterable<Comparable> iterable) {
        if (iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext()) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().equals(comparator) || comparator == null) {
                return contains((Comparable) sortedSet.first()) && contains((Comparable) sortedSet.last());
            }
        }
        Iterator<Comparable> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        return this.lowerBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound) <= 0 && this.upperBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound) >= 0;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0)) {
            return false;
        }
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) obj;
        return this.lowerBound.equals(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound) && this.upperBound.equals(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound);
    }

    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 gap(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        if (this.lowerBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound) >= 0 || o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound.compareTo(this.upperBound) >= 0) {
            boolean z = this.lowerBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound) < 0;
            O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1 = z ? this : o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;
            if (!z) {
                o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = this;
            }
            return create(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.upperBound, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound);
        }
        throw new IllegalArgumentException("Ranges have a nonempty intersection: " + this + ", " + o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
    }

    public boolean hasLowerBound() {
        return this.lowerBound != O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll();
    }

    public boolean hasUpperBound() {
        return this.upperBound != O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveAll();
    }

    public int hashCode() {
        return this.upperBound.hashCode() + (this.lowerBound.hashCode() * 31);
    }

    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 intersection(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        int iCompareTo = this.lowerBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound);
        int iCompareTo2 = this.upperBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;
        }
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = iCompareTo >= 0 ? this.lowerBound : o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound;
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2 = iCompareTo2 <= 0 ? this.upperBound : o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.compareTo(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
        return create(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2);
    }

    public boolean isConnected(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        return this.lowerBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound) <= 0 && o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound.compareTo(this.upperBound) <= 0;
    }

    public boolean isEmpty() {
        return this.lowerBound.equals(this.upperBound);
    }

    public O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo lowerBound() {
        return this.lowerBound;
    }

    public O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 lowerBoundType() {
        return this.lowerBound.typeAsLowerBound();
    }

    public Comparable lowerEndpoint() {
        return this.lowerBound.endpoint();
    }

    public Object readResolve() {
        return equals(f3647O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) ? all() : this;
    }

    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 span(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        int iCompareTo = this.lowerBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound);
        int iCompareTo2 = this.upperBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo < 0 || iCompareTo2 > 0) {
            return create(iCompareTo <= 0 ? this.lowerBound : o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound, iCompareTo2 >= 0 ? this.upperBound : o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound);
        }
        return o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;
    }

    public String toString() {
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = this.lowerBound;
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2 = this.upperBound;
        StringBuilder sb = new StringBuilder(16);
        o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.describeAsLowerBound(sb);
        sb.append("..");
        o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo2.describeAsUpperBound(sb);
        return sb.toString();
    }

    public O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo upperBound() {
        return this.upperBound;
    }

    public O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 upperBoundType() {
        return this.upperBound.typeAsUpperBound();
    }

    public Comparable upperEndpoint() {
        return this.upperBound.endpoint();
    }

    @Override // com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    @Deprecated
    public boolean apply(Comparable comparable) {
        return contains(comparable);
    }
}
