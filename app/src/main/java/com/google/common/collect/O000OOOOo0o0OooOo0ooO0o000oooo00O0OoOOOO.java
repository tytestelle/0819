package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO extends O000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0 {
    @Override // com.google.common.collect.O000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0
    public final int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Iterable iterable) {
        if (iterable instanceof Set) {
            return Math.max(4, ((Set) iterable).size());
        }
        return 4;
    }

    @Override // com.google.common.collect.O000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0
    public final O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        return O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.builderWithExpectedSize(i);
    }

    @Override // com.google.common.collect.O000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0
    public final O000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0 O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj, Object obj2) {
        super.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(obj, obj2);
        return this;
    }

    public final O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        AbstractMap abstractMap = this.f3518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return abstractMap == null ? O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO.of() : O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO.fromMapBuilderEntries(abstractMap.entrySet(), null);
    }

    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj, Object obj2) {
        super.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(obj, obj2);
    }
}
