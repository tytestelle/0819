package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo extends O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o implements Map {
    @Override // java.util.Map
    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(@CheckForNull Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(@CheckForNull Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o
    public abstract Map delegate();

    public Set<Map.Entry<Object, Object>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(@CheckForNull Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @CheckForNull
    public Object get(@CheckForNull Object obj) {
        return delegate().get(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<Object> keySet() {
        return delegate().keySet();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public Object put(Object obj, Object obj2) {
        return delegate().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        delegate().putAll(map);
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public Object remove(@CheckForNull Object obj) {
        return delegate().remove(obj);
    }

    public int size() {
        return delegate().size();
    }

    public void standardClear() {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(entrySet().iterator());
    }

    public boolean standardContainsKey(@CheckForNull Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(new O000o0OoOoO00OOooOOo00oOoO0oo0O0o0000ooO(entrySet().iterator()), obj);
    }

    public boolean standardContainsValue(@CheckForNull Object obj) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(new O000o0Oooo0OoOOo0o00O0oOOo00OOOooooO000o(entrySet().iterator(), 0), obj);
    }

    public boolean standardEquals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public int standardHashCode() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<Object, Object> map) {
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @CheckForNull
    public Object standardRemove(@CheckForNull Object obj) {
        Iterator<Map.Entry<Object, Object>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Object> next = it.next();
            if (com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(next.getKey(), obj)) {
                Object value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0(this);
    }

    public Collection<Object> values() {
        return delegate().values();
    }
}
