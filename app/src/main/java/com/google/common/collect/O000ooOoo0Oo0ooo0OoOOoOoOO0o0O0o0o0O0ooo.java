package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class O000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Set f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000ooOoo0Oo0ooo0OoOOoOoOO0o0O0o0o0O0ooo(Set set, com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
        this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = set;
        this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(obj));
        return this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(it.next()));
        }
        return this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        boolean z = set instanceof RandomAccess;
        com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.getClass();
            while (it.hasNext()) {
                if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(list, o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(list, o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, collection);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        it.getClass();
        com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.getClass();
        return new O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00(it, o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f3672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f3673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
