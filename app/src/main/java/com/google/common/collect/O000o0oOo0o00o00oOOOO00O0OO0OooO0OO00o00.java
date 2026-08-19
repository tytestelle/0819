package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000o0oOo0o00o00oOOOO00O0OO0OooO0OO00o00 extends O000ooOoooOoOo0o00o00o0OoOo0OooO00O0ooO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Map f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000o0oOo0o00o00oOOOO00O0OO0OooO0OO00o00(Map map) {
        map.getClass();
        this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = map;
    }

    public Map O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new O000o0OoOoO00OOooOOo00oOoO0oo0O0o0000ooO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().remove(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().size();
    }
}
