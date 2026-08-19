package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo extends AbstractCollection {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3452O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Map f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo(AbstractMap abstractMap, int i) {
        this.f3452O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f3452O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).clear();
                break;
            case 1:
                ((O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO) this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).clear();
                break;
            default:
                this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f3452O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 1:
                return ((O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO) this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).containsValue(obj);
            case 2:
                return this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f3452O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 1:
                return ((O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO) this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).isEmpty();
            case 2:
                return this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3452O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ((O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).valuesIterator();
            case 1:
                return new O000OooOoOO0O00O00OoooOOO00O0OO0OO000o00((O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO) this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 2);
            default:
                return new O000o0Oooo0OoOOo0o00O0oOOo00OOOooooO000o(this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.entrySet().iterator(), 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f3452O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    Map map = this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    for (Map.Entry entry : map.entrySet()) {
                        if (com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, entry.getValue())) {
                            map.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f3452O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f3452O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f3452O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ((O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).size();
            case 1:
                return ((O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO) this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).size();
            default:
                return this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size();
        }
    }

    public O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo(Map map) {
        this.f3452O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 2;
        this.f3453O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = map;
    }
}
