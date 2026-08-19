package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO implements O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public transient Collection f3416O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient Set f3417O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public transient O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o f3418O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public transient Collection f3419O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public transient Map f3420O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public Map<Object, Collection<Object>> asMap() {
        Map<Object, Collection<Object>> map = this.f3420O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (map != null) {
            return map;
        }
        Map<Object, Collection<Object>> mapCreateAsMap = createAsMap();
        this.f3420O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = mapCreateAsMap;
        return mapCreateAsMap;
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public boolean containsEntry(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection<Object> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean containsValue(@CheckForNull Object obj) {
        Iterator<Collection<Object>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map createAsMap();

    public abstract Set createKeySet();

    public abstract O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o createKeys();

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00) {
            return asMap().equals(((O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00) obj).asMap());
        }
        return false;
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public Set<Object> keySet() {
        Set<Object> set = this.f3417O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (set != null) {
            return set;
        }
        Set<Object> setCreateKeySet = createKeySet();
        this.f3417O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = setCreateKeySet;
        return setCreateKeySet;
    }

    public O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o keys() {
        O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o = this.f3418O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o != null) {
            return o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o;
        }
        O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0oCreateKeys = createKeys();
        this.f3418O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0oCreateKeys;
        return o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0oCreateKeys;
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    @CanIgnoreReturnValue
    public boolean putAll(O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00) {
        boolean zPut = false;
        for (Map.Entry entry : o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection<Object> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return asMap().toString();
    }

    @CanIgnoreReturnValue
    public boolean putAll(Object obj, Iterable<Object> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return !collection.isEmpty() && get(obj).addAll(collection);
        }
        Iterator<Object> it = iterable.iterator();
        return it.hasNext() && O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(get(obj), it);
    }
}
