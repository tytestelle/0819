package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oO0O000OoO00OOoOoOo00O0Oo0o00OoOOOOO extends O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 f3620O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000oO0O000OoO00OOoOoOo00O0Oo0o00OoOOOOO(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) {
        this.f3620O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f3620O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.clear();
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3620O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.containsKey(obj);
    }

    @Override // com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public final int count(Object obj) {
        Object obj2;
        Map mapAsMap = this.f3620O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.asMap();
        mapAsMap.getClass();
        try {
            obj2 = mapAsMap.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0
    public final int distinctElements() {
        return this.f3620O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.asMap().size();
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0
    public final Iterator elementIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public final Set elementSet() {
        return this.f3620O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.keySet();
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0
    public final Iterator entryIterator() {
        return new O000o0Oooo0OoOOo0o00O0oOOo00OOOooooO000o(this.f3620O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.asMap().entrySet().iterator(), 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new O000o0OoOoO00OOooOOo00oOoO0oo0O0o0000ooO(this.f3620O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.entries().iterator());
    }

    @Override // com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public final int remove(Object obj, int i) {
        Object obj2;
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        Map mapAsMap = this.f3620O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.asMap();
        mapAsMap.getClass();
        try {
            obj2 = mapAsMap.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return 0;
        }
        int size = collection.size();
        if (i >= size) {
            collection.clear();
        } else {
            Iterator it = collection.iterator();
            for (int i2 = 0; i2 < i; i2++) {
                it.next();
                it.remove();
            }
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f3620O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.size();
    }
}
