package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 extends O000o0oOo0o00o00oOOOO00O0OO0OooO0OO00o00 {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 f3389O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, Map map) {
        super(map);
        this.f3389O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
    }

    @Override // com.google.common.collect.O000o0oOo0o00o00oOOOO00O0OO0OooO0OO00o00, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.keySet().hashCode();
    }

    @Override // com.google.common.collect.O000o0oOo0o00o00oOOOO00O0OO0OooO0OO00o00, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.entrySet().iterator());
    }

    @Override // com.google.common.collect.O000o0oOo0o00o00oOOOO00O0OO0OooO0OO00o00, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$220(this.f3389O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, size);
        } else {
            size = 0;
        }
        return size > 0;
    }
}
