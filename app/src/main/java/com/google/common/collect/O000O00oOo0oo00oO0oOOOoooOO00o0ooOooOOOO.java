package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O00oOo0oo00oO0oOOOoooOO00o0ooOooOOOO extends O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f3506O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000O00oOo0oo00oO0oOOOoooOO00o0ooOooOOOO(Map.Entry entry) {
        this.f3506O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3506O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of(this.f3506O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getValue());
    }
}
