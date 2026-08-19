package com.google.common.collect;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends O000ooOoooOoOo0o00o00o0OoOo0OooO00O0ooO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3379O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Map f3380O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Map map, int i) {
        this.f3379O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3380O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = map;
    }

    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map mapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        mapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
        try {
            obj2 = mapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj2, entry.getValue())) {
            return obj2 != null || O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().containsKey(key);
        }
        return false;
    }

    public final Map O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        switch (this.f3379O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f3380O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            case 1:
                return (O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) this.f3380O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            default:
                return (O000o0oOOoOoooo00oooOoOOOO0o0O0oOoOoOooO) this.f3380O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
    }

    public final boolean O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f3379O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                Set setEntrySet = ((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f3380O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3379O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f3380O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 1:
                return ((O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) this.f3380O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3428O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            default:
                return ((O000o0oOOoOoooo00oooOoOOOO0o0O0oOoOoOooO) this.f3380O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f3379O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$300(((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f3380O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3388O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, entry.getKey());
                return true;
            default:
                return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj);
        }
    }

    @Override // com.google.common.collect.O000ooOoooOoOo0o00o00o0OoOo0OooO00O0ooO0, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this, collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // com.google.common.collect.O000ooOoooOoOo0o00o00o0OoOo0OooO00O0ooO0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(collection.size()));
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().size();
    }
}
