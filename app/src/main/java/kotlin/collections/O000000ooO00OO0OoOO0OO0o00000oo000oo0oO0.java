package kotlin.collections;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 extends AbstractList implements List, O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final Object[] f3995O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new Object[0];

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Object[] f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = f3995O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length;
        while (i < length && it.hasNext()) {
            this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i] = it.next();
            i++;
        }
        int i2 = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i3] = it.next();
        }
        this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = collection.size() + this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f3995O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            if (i < 10) {
                i = 10;
            }
            this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr, 0, objArr2, this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, objArr.length);
        Object[] objArr3 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int length2 = objArr3.length;
        int i3 = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr3, length2 - i3, objArr2, 0, i3);
        this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = objArr2;
    }

    public final int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i) {
        Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(elements.size() + this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + 1);
        int length = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (length == 0) {
            Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i] = obj;
        this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o++;
    }

    public final void addLast(Object obj) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + 1);
        this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)] = obj;
        this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        int i = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, i, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        } else if (!isEmpty()) {
            Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(objArr, this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, objArr.length);
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 0, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        }
        this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.Companion;
        int i2 = this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, i2);
        return this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        int length = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (length < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            while (length < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                if (kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj, this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[length])) {
                    i = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            return -1;
        }
        int length2 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length;
        while (length < length2) {
            if (kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj, this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[length])) {
                i = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo; i2++) {
            if (kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj, this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i2])) {
                length = i2 + this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length;
                i = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        int i2 = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i2 < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            length = iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - 1;
            if (i2 <= length) {
                while (!kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj, this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                return length - i;
            }
            return -1;
        }
        if (i2 > iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            for (int i3 = iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - 1; -1 < i3; i3--) {
                if (kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj, this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i3])) {
                    length = i3 + this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length;
                    i = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    return length - i;
                }
            }
            Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objArr, "<this>");
            length = objArr.length - 1;
            int i4 = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (i4 <= length) {
                while (!kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj, this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                return length - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length != 0) {
            int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            int i = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (i < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2) {
                iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i;
                while (i < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2) {
                    Object obj = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo] = obj;
                        iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo++;
                    }
                    i++;
                }
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2);
            } else {
                int length = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i2);
                for (int i3 = 0; i3 < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2; i3++) {
                    Object[] objArr2 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo] = obj3;
                        iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    }
                }
                z = z2;
            }
            if (z) {
                int length2 = iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (length2 < 0) {
                    length2 += this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length;
                }
                this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = length2;
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i);
        this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(this) + this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Object obj = objArr[iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo];
        objArr[iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo] = null;
        this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length != 0) {
            int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            int i = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (i < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2) {
                iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i;
                while (i < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2) {
                    Object obj = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i];
                    if (elements.contains(obj)) {
                        this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo] = obj;
                        iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2);
            } else {
                int length = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i2);
                for (int i3 = 0; i3 < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2; i3++) {
                    Object[] objArr2 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo] = obj3;
                        iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int length2 = iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (length2 < 0) {
                    length2 += this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length;
                }
                this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = length2;
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.Companion;
        int i2 = this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, i2);
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + i);
        Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Object obj2 = objArr[iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo];
        objArr[iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.Companion;
        int i2 = this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i, i2);
        int i3 = this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i3 + 1);
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + i);
        int i4 = this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (i < ((i4 + 1) >> 1)) {
            if (iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == 0) {
                Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objArr, "<this>");
                iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = objArr.length;
            }
            int i5 = iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - 1;
            int i6 = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (i6 == 0) {
                Object[] objArr2 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i6 - 1;
            }
            int i7 = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (i5 >= i7) {
                Object[] objArr3 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                objArr3[length] = objArr3[i7];
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr3, i7, objArr3, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr4, i7 - 1, objArr4, i7, objArr4.length);
                Object[] objArr5 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                objArr5[objArr5.length - 1] = objArr5[0];
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr5, 0, objArr5, 1, i5 + 1);
            }
            this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i5] = obj;
            this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = length;
        } else {
            int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + i4);
            if (iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2) {
                Object[] objArr6 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr6, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + 1, objArr6, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2);
            } else {
                Object[] objArr7 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr7, 1, objArr7, 0, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2);
                Object[] objArr8 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                objArr8[0] = objArr8[objArr8.length - 1];
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr8, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + 1, objArr8, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, objArr8.length - 1);
            }
            this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo] = obj;
        }
        this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.Companion;
        int i2 = this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, i2);
        if (i == O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + i);
        Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Object obj = objArr[iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo];
        if (i < (this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o >> 1)) {
            int i3 = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo >= i3) {
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr, i3 + 1, objArr, i3, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
            } else {
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr, 1, objArr, 0, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                Object[] objArr2 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr2, i4 + 1, objArr2, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            int i5 = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            objArr3[i5] = null;
            this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i5);
        } else {
            int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(this) + this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            if (iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo <= iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2) {
                Object[] objArr4 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr4, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, objArr4, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + 1, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 + 1);
            } else {
                Object[] objArr5 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr5, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, objArr5, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + 1, objArr5.length);
                Object[] objArr6 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                objArr6[objArr6.length - 1] = objArr6[0];
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr6, 0, objArr6, 1, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 + 1);
            }
            this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2] = null;
        }
        this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(array, "array");
        int length = array.length;
        int i = this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (length < i) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i);
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        int i2 = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i2 < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, array, 0, i2, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr, 0, array, this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, objArr.length);
            Object[] objArr2 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr2, objArr2.length - this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, array, 0, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        }
        int length2 = array.length;
        int i3 = this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (length2 > i3) {
            array[i3] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.Companion;
        int i2 = this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i, i2);
        if (elements.isEmpty()) {
            return false;
        }
        int i3 = this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (i == i3) {
            return addAll(elements);
        }
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(elements.size() + i3);
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + i);
        int size = elements.size();
        if (i < ((this.f3998O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + 1) >> 1)) {
            int i4 = this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            int length = i4 - size;
            if (iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 < i4) {
                Object[] objArr = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr, length, objArr, i4, objArr.length);
                if (size >= iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2) {
                    Object[] objArr2 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr2, objArr2.length - size, objArr2, 0, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2);
                } else {
                    Object[] objArr3 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr4, 0, objArr4, size, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr5, length, objArr5, i4, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2);
            } else {
                Object[] objArr6 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                length += objArr6.length;
                int i5 = iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr6, length, objArr6, i4, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2);
                } else {
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr6, length, objArr6, i4, i4 + length2);
                    Object[] objArr7 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr7, 0, objArr7, this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + length2, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2);
                }
            }
            this.f3996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = length;
            int length3 = iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 - size;
            if (length3 < 0) {
                length3 += this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length;
            }
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(length3, elements);
        } else {
            int i6 = iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 + size;
            if (iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 < iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                int i7 = size + iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                Object[] objArr8 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i7 <= objArr8.length) {
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr8, i6, objArr8, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                } else if (i6 >= objArr8.length) {
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr8, i6 - objArr8.length, objArr8, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                } else {
                    int length4 = iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - (i7 - objArr8.length);
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr8, 0, objArr8, length4, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    Object[] objArr9 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr9, i6, objArr9, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2, length4);
                }
            } else {
                Object[] objArr10 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr10, size, objArr10, 0, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                Object[] objArr11 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i6 >= objArr11.length) {
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr11, i6 - objArr11.length, objArr11, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2, objArr11.length);
                } else {
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f3997O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr12, i6, objArr12, iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2, objArr12.length - size);
                }
            }
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2, elements);
        }
        return true;
    }
}
