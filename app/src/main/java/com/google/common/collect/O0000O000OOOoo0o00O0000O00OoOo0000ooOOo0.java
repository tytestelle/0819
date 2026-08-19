package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 extends AbstractCollection implements O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public transient Set f3423O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient Set f3424O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean add(Object obj) {
        add(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean addAll(Collection<Object> collection) {
        collection.getClass();
        if (!(collection instanceof O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o)) {
            if (collection.isEmpty()) {
                return false;
            }
            return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, collection.iterator());
        }
        O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o = (O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) collection;
        if (o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o instanceof O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) {
            O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = (O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o;
            if (o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.isEmpty()) {
                return false;
            }
            o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.addTo(this);
        } else {
            if (o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o.isEmpty()) {
                return false;
            }
            for (O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 : o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o.entrySet()) {
                add(o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getElement(), o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount());
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object obj) {
        return count(obj) > 0;
    }

    public Set<Object> createElementSet() {
        return new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(this, 0);
    }

    public Set<O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0> createEntrySet() {
        return new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(this, 1);
    }

    public abstract int distinctElements();

    public abstract Iterator elementIterator();

    @Override // com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public Set<Object> elementSet() {
        Set<Object> set = this.f3423O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (set != null) {
            return set;
        }
        Set<Object> setCreateElementSet = createElementSet();
        this.f3423O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = setCreateElementSet;
        return setCreateElementSet;
    }

    public abstract Iterator entryIterator();

    @Override // com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public Set<O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0> entrySet() {
        Set<O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0> set = this.f3424O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (set != null) {
            return set;
        }
        Set<O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0> setCreateEntrySet = createEntrySet();
        this.f3424O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = setCreateEntrySet;
        return setCreateEntrySet;
    }

    @Override // java.util.Collection
    public final boolean equals(@CheckForNull Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this, obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean remove(@CheckForNull Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) {
            collection = ((O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) collection).elementSet();
        }
        return elementSet().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        if (collection instanceof O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) {
            collection = ((O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) collection).elementSet();
        }
        return elementSet().retainAll(collection);
    }

    public int setCount(Object obj, int i) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(0, "count");
        int iCount = count(obj);
        int i2 = 0 - iCount;
        if (i2 > 0) {
            add(obj, i2);
        } else if (i2 < 0) {
            remove(obj, -i2);
        }
        return iCount;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    public int add(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean setCount(Object obj, int i, int i2) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "oldCount");
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(0, "newCount");
        if (count(obj) != i) {
            return false;
        }
        setCount(obj, 0);
        return true;
    }
}
