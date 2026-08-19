package kotlin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Collection, O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object[] f3994O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object[] objArr) {
        this.f3994O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = objArr;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.f3994O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objArr, "<this>");
        return O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(objArr, obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f3994O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3994O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3994O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f3994O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objArrCopyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(array, "array");
        return kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, array);
    }
}
