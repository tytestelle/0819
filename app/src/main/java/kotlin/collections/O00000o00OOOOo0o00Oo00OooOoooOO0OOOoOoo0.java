package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 implements Map, Serializable, O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    public static final O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 INSTANCE = new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0();
    private static final long serialVersionUID = 8246714829545688274L;

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    public boolean containsValue(Void value) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(value, "value");
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public Void get(Object obj) {
        return null;
    }

    public Set<Map.Entry> getEntries() {
        return O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.INSTANCE;
    }

    public Set<Object> getKeys() {
        return O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.INSTANCE;
    }

    public int getSize() {
        return 0;
    }

    public Collection getValues() {
        return O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.INSTANCE;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return getValues();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return containsValue((Void) obj);
        }
        return false;
    }

    public Void put(Object obj, Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
