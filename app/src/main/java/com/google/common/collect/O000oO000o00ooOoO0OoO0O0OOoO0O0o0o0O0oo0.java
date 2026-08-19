package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oO000o00ooOoO0OoO0O0OOoO0O0o0o0O0oo0 extends O000oO0Oo0oooo0oO00Ooo0o0O0o0000oOO0oOo0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f3619O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000oO000o00ooOoO0OoO0O0OOoO0O0o0o0O0oo0(Map.Entry entry) {
        this.f3619O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = entry;
    }

    @Override // com.google.common.collect.O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0
    public final int getCount() {
        return ((Collection) this.f3619O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getValue()).size();
    }

    @Override // com.google.common.collect.O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0
    public final Object getElement() {
        return this.f3619O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getKey();
    }
}
