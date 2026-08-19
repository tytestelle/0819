package androidx.collection;

import O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import kotlin.collections.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import kotlin.jvm.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class ArraySet<E> implements Collection<E>, Set<E>, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    private int _size;
    private Object[] array;
    private int[] hashes;

    public final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public E elementAt(int i) {
            return ArraySet.this.valueAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public void removeAt(int i) {
            ArraySet.this.removeAt(i);
        }
    }

    public ArraySet() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iIndexOf;
        int i2 = get_size$collection();
        if (e == null) {
            iIndexOf = ArraySetKt.indexOfNull(this);
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iIndexOf = ArraySetKt.indexOf(this, e, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i3 = ~iIndexOf;
        if (i2 >= getHashes$collection().length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i4);
            if (i2 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (getHashes$collection().length != 0) {
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(0, hashes$collection.length, 6, hashes$collection, getHashes$collection());
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(array$collection, getArray$collection(), 0, 0, array$collection.length, 6);
            }
        }
        if (i3 < i2) {
            int i5 = i3 + 1;
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(i5, i3, i2, getHashes$collection(), getHashes$collection());
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(getArray$collection(), i5, getArray$collection(), i3, i2);
        }
        if (i2 != get_size$collection() || i3 >= getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        getHashes$collection()[i3] = i;
        getArray$collection()[i3] = e;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    public final void addAll(ArraySet<? extends E> array) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(array, "array");
        int i = array.get_size$collection();
        ensureCapacity(get_size$collection() + i);
        if (get_size$collection() != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(array.valueAt(i2));
            }
        } else if (i > 0) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(0, i, 6, array.getHashes$collection(), getHashes$collection());
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(array.getArray$collection(), getArray$collection(), 0, 0, i, 6);
            if (get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void ensureCapacity(int i) {
        int i2 = get_size$collection();
        if (getHashes$collection().length < i) {
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i);
            if (get_size$collection() > 0) {
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(0, get_size$collection(), 6, hashes$collection, getHashes$collection());
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(array$collection, getArray$collection(), 0, 0, get_size$collection(), 6);
            }
        }
        if (get_size$collection() != i2) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int i = get_size$collection();
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Set) obj).contains(valueAt(i2))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final Object[] getArray$collection() {
        return this.array;
    }

    public final int[] getHashes$collection() {
        return this.hashes;
    }

    public int getSize() {
        return this._size;
    }

    public final int get_size$collection() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes$collection = getHashes$collection();
        int i = get_size$collection();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += hashes$collection[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        return obj == null ? ArraySetKt.indexOfNull(this) : ArraySetKt.indexOf(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(ArraySet<? extends E> array) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(array, "array");
        int i = array.get_size$collection();
        int i2 = get_size$collection();
        for (int i3 = 0; i3 < i; i3++) {
            remove(array.valueAt(i3));
        }
        return i2 != get_size$collection();
    }

    public final E removeAt(int i) {
        int i2 = get_size$collection();
        E e = (E) getArray$collection()[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            if (getHashes$collection().length <= 8 || get_size$collection() >= getHashes$collection().length / 3) {
                if (i < i3) {
                    int i4 = i + 1;
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(i, i4, i2, getHashes$collection(), getHashes$collection());
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(getArray$collection(), i, getArray$collection(), i4, i2);
                }
                getArray$collection()[i3] = null;
            } else {
                int i5 = get_size$collection() > 8 ? get_size$collection() + (get_size$collection() >> 1) : 8;
                int[] hashes$collection = getHashes$collection();
                Object[] array$collection = getArray$collection();
                ArraySetKt.allocArrays(this, i5);
                if (i > 0) {
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(0, i, 6, hashes$collection, getHashes$collection());
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(array$collection, getArray$collection(), 0, 0, i, 6);
                }
                if (i < i3) {
                    int i6 = i + 1;
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(i, i6, i2, hashes$collection, getHashes$collection());
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(array$collection, i, getArray$collection(), i6, i2);
                }
            }
            if (i2 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i3);
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        boolean z = false;
        for (int i = get_size$collection() - 1; -1 < i; i--) {
            if (!O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(getArray$collection()[i], elements)) {
                removeAt(i);
                z = true;
            }
        }
        return z;
    }

    public final void setArray$collection(Object[] objArr) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void setHashes$collection(int[] iArr) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void set_size$collection(int i) {
        this._size = i;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.array;
        int i = this._size;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objArr, "<this>");
        int length = objArr.length;
        if (i <= length) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i);
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return objArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + length + ").");
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(get_size$collection() * 14);
        sb.append('{');
        int i = get_size$collection();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E eValueAt = valueAt(i2);
            if (eValueAt != this) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(sb, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    public final E valueAt(int i) {
        return (E) getArray$collection()[i];
    }

    public ArraySet(int i) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i > 0) {
            ArraySetKt.allocArrays(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    public /* synthetic */ ArraySet(int i, int i2, O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(array, "array");
        T[] tArr = (T[]) ArraySetJvmUtil.resizeForToArray(array, this._size);
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this.array, 0, tArr, 0, this._size);
        return tArr;
    }

    public ArraySet(ArraySet<? extends E> arraySet) {
        this(0);
        if (arraySet != null) {
            addAll((ArraySet) arraySet);
        }
    }

    public ArraySet(Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        ensureCapacity(elements.size() + get_size$collection());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public ArraySet(E[] eArr) {
        this(0);
        if (eArr == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (!(i < eArr.length)) {
                return;
            }
            int i2 = i + 1;
            try {
                add(eArr[i]);
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
    }
}
