package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 extends O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public transient Map f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public transient int f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    public O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(Map<Object, Collection<Object>> map) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(map.isEmpty());
        this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = map;
    }

    public static Iterator access$100(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public static /* synthetic */ int access$208(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) {
        int i = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = i + 1;
        return i;
    }

    public static /* synthetic */ int access$210(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) {
        int i = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = i - 1;
        return i;
    }

    public static /* synthetic */ int access$212(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, int i) {
        int i2 = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 + i;
        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = i2;
        return i2;
    }

    public static /* synthetic */ int access$220(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, int i) {
        int i2 = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 - i;
        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = i2;
        return i2;
    }

    public static void access$300(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, Object obj) {
        Object objRemove;
        Map map = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        map.getClass();
        try {
            objRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 -= size;
        }
    }

    public Map<Object, Collection<Object>> backingMap() {
        return this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public void clear() {
        Iterator it = this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.clear();
        this.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = 0;
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public boolean containsKey(@CheckForNull Object obj) {
        return this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.containsKey(obj);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public Map<Object, Collection<Object>> createAsMap() {
        return new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    public abstract Collection<Object> createCollection();

    public Collection<Object> createCollection(Object obj) {
        return createCollection();
    }

    public Collection<Map.Entry<Object, Object>> createEntries() {
        return this instanceof O000ooOoOooO000o00oo0Oo0oOO0oOoOo00Ooo0o ? new O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(this, 0) : new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(this, 0);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public Set<Object> createKeySet() {
        return new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o createKeys() {
        return new O000oO0O000OoO00OOoOoOo00O0Oo0o00OoOOOOO(this);
    }

    public final Map<Object, Collection<Object>> createMaybeNavigableAsMap() {
        Map map = this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (map instanceof NavigableMap) {
            return new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, (NavigableMap) this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        }
        return map instanceof SortedMap ? new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this, (SortedMap) this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) : new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    public final Set<Object> createMaybeNavigableKeySet() {
        Map map = this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (map instanceof NavigableMap) {
            return new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, (NavigableMap) this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        }
        return map instanceof SortedMap ? new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this, (SortedMap) this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) : new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    public Collection<Object> createUnmodifiableEmptyCollection() {
        return unmodifiableCollectionSubclass(createCollection());
    }

    public Collection<Object> createValues() {
        return new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(this, 1);
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public Collection<Map.Entry<Object, Object>> entries() {
        Collection<Map.Entry<Object, Object>> collection = this.f3416O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<Object, Object>> collectionCreateEntries = createEntries();
        this.f3416O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = collectionCreateEntries;
        return collectionCreateEntries;
    }

    public Iterator<Map.Entry<Object, Object>> entryIterator() {
        return new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, 1);
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public Collection<Object> get(Object obj) {
        Collection<Object> collectionCreateCollection = (Collection) this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.get(obj);
        if (collectionCreateCollection == null) {
            collectionCreateCollection = createCollection(obj);
        }
        return wrapCollection(obj, collectionCreateCollection);
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000++;
            return true;
        }
        Collection<Object> collectionCreateCollection = createCollection(obj);
        if (!collectionCreateCollection.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000++;
        this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.put(obj, collectionCreateCollection);
        return true;
    }

    public Collection<Object> removeAll(@CheckForNull Object obj) {
        Collection<? extends Object> collection = (Collection) this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.remove(obj);
        if (collection == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection<Object> collectionCreateCollection = createCollection();
        collectionCreateCollection.addAll(collection);
        this.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 -= collection.size();
        collection.clear();
        return unmodifiableCollectionSubclass(collectionCreateCollection);
    }

    public Collection<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(obj);
        }
        Collection<? extends Object> collectionCreateCollection = (Collection) this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.get(obj);
        if (collectionCreateCollection == null) {
            collectionCreateCollection = createCollection(obj);
            this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.put(obj, collectionCreateCollection);
        }
        Collection<Object> collectionCreateCollection2 = createCollection();
        collectionCreateCollection2.addAll(collectionCreateCollection);
        this.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 -= collectionCreateCollection.size();
        collectionCreateCollection.clear();
        while (it.hasNext()) {
            if (collectionCreateCollection.add(it.next())) {
                this.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000++;
            }
        }
        return unmodifiableCollectionSubclass(collectionCreateCollection2);
    }

    public final void setMap(Map<Object, Collection<Object>> map) {
        this.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = map;
        this.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = 0;
        for (Collection<Object> collection : map.values()) {
            org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(!collection.isEmpty());
            this.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = collection.size() + this.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        }
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public int size() {
        return this.f3406O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public Iterator<Object> valueIterator() {
        return new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, 0);
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public Collection<Object> values() {
        Collection<Object> collection = this.f3419O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (collection != null) {
            return collection;
        }
        Collection<Object> collectionCreateValues = createValues();
        this.f3419O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = collectionCreateValues;
        return collectionCreateValues;
    }

    public Collection<Object> wrapCollection(Object obj, Collection<Object> collection) {
        return new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this, obj, collection, null);
    }

    public final List<Object> wrapList(Object obj, List<Object> list, @CheckForNull O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        return list instanceof RandomAccess ? new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, obj, list, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) : new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this, obj, list, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
    }
}
