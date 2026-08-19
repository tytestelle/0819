package com.google.common.collect;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class O000o0O00Oo0O0OoOOooo00oOoo0OOooO0ooo0o0 extends O000o0O0OOO0OO0O0oOOOOo00oOO000O000O0o00 {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000o0O0OOO0OO0O0oOOOOo00oOO000O000O0o00 f3606O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000o0O00Oo0O0OoOOooo00oOoo0OOooO0ooo0o0(ReferenceQueue referenceQueue, Object obj, int i, O000o0O0OOO0OO0O0oOOOOo00oOO000O000O0o00 o000o0O0OOO0OO0O0oOOOOo00oOO000O000O0o00) {
        super(referenceQueue, obj, i);
        this.f3606O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000o0O0OOO0OO0O0oOOOOo00oOO000O000O0o00;
    }

    @Override // com.google.common.collect.O000OooOoO00oo000o00O0O0oooO0O0OOOOOO0OO, com.google.common.collect.O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000
    public final O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return this.f3606O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // com.google.common.collect.O000o0O0OOO0OO0O0oOOOOo00oOO000O000O0o00, com.google.common.collect.O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000
    public final Object getValue() {
        return O000Ooo0o0oOo00O0O000o000oooO000OOOO0O0O.VALUE;
    }
}
