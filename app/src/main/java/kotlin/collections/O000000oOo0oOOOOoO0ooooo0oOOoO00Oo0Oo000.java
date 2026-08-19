package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 extends O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements List {
    public static final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o Companion = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();

    @Override // java.util.List
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        Companion.getClass();
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(other, "other");
        if (size() == other.size()) {
            Iterator it = other.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        Companion.getClass();
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Object> iterator() {
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, 0);
    }

    @Override // java.util.List
    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<Object> subList(int i, int i2) {
        return new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, i, i2);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i) {
        return new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, i);
    }
}
