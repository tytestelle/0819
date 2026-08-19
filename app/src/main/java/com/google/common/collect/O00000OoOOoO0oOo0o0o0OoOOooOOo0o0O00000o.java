package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o extends O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements Set {

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final /* synthetic */ O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o f3403O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, Object obj, Set set) {
        super(o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, obj, set, null);
        this.f3403O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
    }

    @Override // com.google.common.collect.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zO0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000((Set) this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, collection);
        if (zO0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) {
            O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$212(this.f3403O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size() - size);
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        }
        return zO0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
    }
}
