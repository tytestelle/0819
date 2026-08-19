package org.eclipse.jetty.util;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements ConcurrentMap, Serializable {
    private static final long serialVersionUID = -6878723138353851005L;
    ConcurrentMap<Object, Object> _cmap;
    Map<Object, Object> _map;

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
        this._map = new HashMap();
    }

    public void add(Object obj, Object obj2) {
        Object obj3 = this._map.get(obj);
        Object objAdd = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.add(obj3, obj2);
        if (obj3 != objAdd) {
            this._map.put(obj, objAdd);
        }
    }

    public void addValues(Object obj, List<? extends Object> list) {
        Object obj2 = this._map.get(obj);
        Object objAddCollection = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.addCollection(obj2, list);
        if (obj2 != objAddCollection) {
            this._map.put(obj, objAddCollection);
        }
    }

    @Override // java.util.Map
    public void clear() {
        this._map.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this._map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this._map.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        return this._map.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this._map.equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Object obj2 = this._map.get(obj);
        int size = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(obj2);
        if (size != 0) {
            return size != 1 ? O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getList(obj2, true) : O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(obj2, 0);
        }
        return null;
    }

    public String getString(Object obj) {
        Object obj2 = this._map.get(obj);
        int size = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(obj2);
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            Object obj3 = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(obj2, 0);
            if (obj3 == null) {
                return null;
            }
            return obj3.toString();
        }
        StringBuilder sb = new StringBuilder(128);
        for (int i = 0; i < O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(obj2); i++) {
            Object obj4 = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(obj2, i);
            if (obj4 != null) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(obj4.toString());
            }
        }
        return sb.toString();
    }

    public Object getValue(Object obj, int i) {
        Object obj2 = this._map.get(obj);
        if (i == 0 && O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(obj2) == 0) {
            return null;
        }
        return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(obj2, i);
    }

    public List getValues(Object obj) {
        return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getList(this._map.get(obj), true);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this._map.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this._map.isEmpty();
    }

    @Override // java.util.Map
    public Set<Object> keySet() {
        return this._map.keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this._map.put(obj, O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.add(null, obj2));
    }

    @Override // java.util.Map
    public void putAll(Map<Object, ? extends Object> map) {
        if (!(map instanceof O000000oooOoo00ooo0O0000000o00O0Oooo0OOO)) {
            this._map.putAll(map);
            return;
        }
        for (Map.Entry<Object, Object> entry : ((O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) map).entrySet()) {
            this._map.put(entry.getKey(), O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.clone(entry.getValue()));
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        ConcurrentMap<Object, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.putIfAbsent(obj, obj2);
        }
        throw new UnsupportedOperationException();
    }

    public Object putValues(Object obj, List<? extends Object> list) {
        return this._map.put(obj, list);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this._map.remove(obj);
    }

    public boolean removeValue(Object obj, Object obj2) {
        Object objRemove = this._map.get(obj);
        int size = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(objRemove);
        if (size > 0) {
            objRemove = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.remove(objRemove, obj2);
            if (objRemove == null) {
                this._map.remove(obj);
            } else {
                this._map.put(obj, objRemove);
            }
        }
        return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(objRemove) != size;
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        ConcurrentMap<Object, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.replace(obj, obj2, obj3);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this._map.size();
    }

    public String toString() {
        Object obj = this._cmap;
        if (obj == null) {
            obj = this._map;
        }
        return obj.toString();
    }

    public Map<Object, String[]> toStringArrayMap() {
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, (this._map.size() * 3) / 2);
        for (Map.Entry<Object, Object> entry : this._map.entrySet()) {
            o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.put(entry.getKey(), O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.toStringArray(entry.getValue()));
        }
        return o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return this._map.values();
    }

    public Object putValues(Object obj, String... strArr) {
        Object objAdd = null;
        for (String str : strArr) {
            objAdd = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.add(objAdd, str);
        }
        return this._map.put(obj, objAdd);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        ConcurrentMap<Object, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.remove(obj, obj2);
        }
        throw new UnsupportedOperationException();
    }

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(Map<Object, Object> map) {
        if (map instanceof ConcurrentMap) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(map);
            this._cmap = concurrentHashMap;
            this._map = concurrentHashMap;
            return;
        }
        this._map = new HashMap(map);
    }

    public void addValues(Object obj, String[] strArr) {
        Object obj2 = this._map.get(obj);
        Object objAddCollection = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.addCollection(obj2, Arrays.asList(strArr));
        if (obj2 != objAddCollection) {
            this._map.put(obj, objAddCollection);
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public Object replace(Object obj, Object obj2) {
        ConcurrentMap<Object, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.replace(obj, obj2);
        }
        throw new UnsupportedOperationException();
    }

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        if (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO._cmap != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(o000000oooOoo00ooo0O0000000o00O0Oooo0OOO._cmap);
            this._cmap = concurrentHashMap;
            this._map = concurrentHashMap;
            return;
        }
        this._map = new HashMap(o000000oooOoo00ooo0O0000000o00O0Oooo0OOO._map);
    }

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(int i) {
        this._map = new HashMap(i);
    }

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(boolean z) {
        if (z) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            this._cmap = concurrentHashMap;
            this._map = concurrentHashMap;
            return;
        }
        this._map = new HashMap();
    }
}
