package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo extends AbstractMap {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public transient O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f3385O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo f3386O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final transient Map f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 f3388O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, Map map) {
        this.f3388O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
        this.f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = map;
    }

    public final O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Map.Entry entry) {
        Object key = entry.getKey();
        return new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00(key, this.f3388O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.wrapCollection(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = this.f3388O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (this.f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.clear();
        } else {
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f3385O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
            return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        }
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, 0);
        this.f3385O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
        return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection<Object> collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.f3388O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.wrapCollection(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f3388O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection<? extends Object> collection = (Collection) this.f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.remove(obj);
        if (collection == null) {
            return null;
        }
        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = this.f3388O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        Collection<Object> collectionCreateCollection = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.createCollection();
        collectionCreateCollection.addAll(collection);
        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$220(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, collection.size());
        collection.clear();
        return collectionCreateCollection;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = this.f3386O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo != null) {
            return o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
        }
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo2 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo(this);
        this.f3386O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo2;
        return o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo2;
    }
}
