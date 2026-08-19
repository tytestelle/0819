package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000 extends O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 {
    static final O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000 NATURAL_EMPTY_SET = new O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(), O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural());
    final transient O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O elements;

    public O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, Comparator<Object> comparator) {
        super(comparator);
        this.elements = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O asList() {
        return this.elements;
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    @CheckForNull
    public Object ceiling(Object obj) {
        int iTailIndex = tailIndex(obj, true);
        if (iTailIndex == size()) {
            return null;
        }
        return this.elements.get(iTailIndex);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.elements, obj, unsafeComparator()) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) {
            collection = ((O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) collection).elementSet();
        }
        if (!O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int iUnsafeCompare = unsafeCompare(next2, next);
                if (iUnsafeCompare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iUnsafeCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iUnsafeCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int copyIntoArray(Object[] objArr, int i) {
        return this.elements.copyIntoArray(objArr, i);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 createDescendingSet() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.comparator);
        return isEmpty() ? O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0.emptySet(comparatorReverseOrder) : new O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000(this.elements.reverse(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this.comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 == null || unsafeCompare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.SortedSet
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.elements.get(0);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    @CheckForNull
    public Object floor(Object obj) {
        int iHeadIndex = headIndex(obj, true) - 1;
        if (iHeadIndex == -1) {
            return null;
        }
        return this.elements.get(iHeadIndex);
    }

    public O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000 getSubSet(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        return i < i2 ? new O000ooOOooo00oOo00O0O00oOoOOOoO0o0OoO000(this.elements.subList(i, i2), this.comparator) : O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0.emptySet(this.comparator);
    }

    public int headIndex(Object obj, boolean z) {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = this.elements;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, obj, comparator());
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 headSetImpl(Object obj, boolean z) {
        return getSubSet(0, headIndex(obj, z));
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    @CheckForNull
    public Object higher(Object obj) {
        int iTailIndex = tailIndex(obj, false);
        if (iTailIndex == size()) {
            return null;
        }
        return this.elements.get(iTailIndex);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int iBinarySearch = Collections.binarySearch(this.elements, obj, unsafeComparator());
            if (iBinarySearch >= 0) {
                return iBinarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    @CheckForNull
    public Object[] internalArray() {
        return this.elements.internalArray();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int internalArrayEnd() {
        return this.elements.internalArrayEnd();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int internalArrayStart() {
        return this.elements.internalArrayStart();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return this.elements.isPartialView();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.SortedSet
    public Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.elements.get(size() - 1);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    @CheckForNull
    public Object lower(Object obj) {
        int iHeadIndex = headIndex(obj, false) - 1;
        if (iHeadIndex == -1) {
            return null;
        }
        return this.elements.get(iHeadIndex);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.elements.size();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 subSetImpl(Object obj, boolean z, Object obj2, boolean z2) {
        return tailSetImpl(obj, z).headSetImpl(obj2, z2);
    }

    public int tailIndex(Object obj, boolean z) {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = this.elements;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, obj, comparator());
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 tailSetImpl(Object obj, boolean z) {
        return getSubSet(tailIndex(obj, z), size());
    }

    public Comparator<Object> unsafeComparator() {
        return this.comparator;
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo descendingIterator() {
        return this.elements.reverse().iterator();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return this.elements.iterator();
    }
}
