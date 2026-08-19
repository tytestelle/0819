package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 extends AbstractCollection {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f3395O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Collection f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f3397O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final Collection f3398O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 f3399O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, Object obj, Collection collection, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        this.f3399O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
        this.f3395O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
        this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = collection;
        this.f3397O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        this.f3398O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null ? null : o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3397O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        } else {
            this.f3399O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.put(this.f3395O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        Collection collection;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3397O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != this.f3398O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty() || (collection = (Collection) this.f3399O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.get(this.f3395O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) == null) {
                return;
            }
            this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = collection;
        }
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3397O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        } else if (this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty()) {
            this.f3399O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.remove(this.f3395O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        boolean zIsEmpty = this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty();
        boolean zAdd = this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.add(obj);
        if (zAdd) {
            O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$208(this.f3399O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
            if (zIsEmpty) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.addAll(collection);
        if (zAddAll) {
            O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$212(this.f3399O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size() - size);
            if (size == 0) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$220(this.f3399O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, size);
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        boolean zRemove = this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(obj);
        if (zRemove) {
            O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$210(this.f3399O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.removeAll(collection);
        if (zRemoveAll) {
            O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$212(this.f3399O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size() - size);
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.retainAll(collection);
        if (zRetainAll) {
            O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$212(this.f3399O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size() - size);
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.toString();
    }
}
