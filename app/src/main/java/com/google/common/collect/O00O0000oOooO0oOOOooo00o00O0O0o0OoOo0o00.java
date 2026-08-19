package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O00O0000oOooO0oOOOooo00o00O0O0o0OoOo0o00 extends O000o0oOOoOoooo00oooOoOOOO0o0O0oOoOoOooO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Collection f3683O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO f3684O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O00O0000oOooO0oOOOooo00o00O0O0o0OoOo0o00(O00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO o00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO, Collection collection) {
        this.f3684O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO;
        this.f3683O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = collection;
    }

    @Override // com.google.common.collect.O000o0oOOoOoooo00oooOoOOOO0o0O0oOoOoOooO
    public final Iterator O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return this.f3683O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0)) {
            return null;
        }
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) obj;
        O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O o00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O = (O00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O) this.f3684O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f3687O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound);
        if (o00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O == null || !o00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O.f3685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.equals(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0)) {
            return null;
        }
        return o00O000O0OoOOOo0OO0O0oo0OO00OooOoo000o0O.f3686O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3684O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f3687O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size();
    }
}
