package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000OooOoO00o00oOOOO00oOO0Ooo00o0o000O0O implements O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f3579O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f3580O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000OooOoO00o00oOOOO00oOO0Ooo00o0o000O0O(Object obj, int i) {
        this.f3579O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
        this.f3580O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    @Override // com.google.common.collect.O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000
    public O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return null;
    }

    @Override // com.google.common.collect.O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000
    public final int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        return this.f3580O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // com.google.common.collect.O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000
    public final Object getKey() {
        return this.f3579O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }
}
