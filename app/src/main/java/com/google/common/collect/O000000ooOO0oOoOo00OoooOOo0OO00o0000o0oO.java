package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO extends O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo implements NavigableMap {

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final /* synthetic */ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 f3390O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, NavigableMap navigableMap) {
        super(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, navigableMap);
        this.f3390O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
    }

    @Override // com.google.common.collect.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final SortedSet O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this.f3390O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo());
    }

    @Override // com.google.common.collect.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    public final O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00 O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = this.f3390O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        Collection<Object> collectionCreateCollection = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.createCollection();
        collectionCreateCollection.addAll((Collection) entry.getValue());
        it.remove();
        return new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00(entry.getKey(), o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.unmodifiableCollectionSubclass(collectionCreateCollection));
    }

    @Override // com.google.common.collect.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: merged with bridge method [inline-methods] */
    public final NavigableMap O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        return (NavigableMap) ((SortedMap) this.f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this.f3390O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().floorKey(obj);
    }

    @Override // com.google.common.collect.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().higherKey(obj);
    }

    @Override // com.google.common.collect.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, com.google.common.collect.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(((O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(((O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) ((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) descendingMap()).entrySet()).iterator());
    }

    @Override // com.google.common.collect.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.common.collect.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this.f3390O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this.f3390O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this.f3390O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().tailMap(obj, z));
    }
}
