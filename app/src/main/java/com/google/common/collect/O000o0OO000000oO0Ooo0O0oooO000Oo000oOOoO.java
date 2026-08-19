package com.google.common.collect;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes2.dex */
public class O000o0OO000000oO0Ooo0O0oooO000Oo000oOOoO extends O000OooOoO00oo000o00O0O0oooO0O0OOOOOO0OO {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public volatile Object f3608O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000o0OO000000oO0Ooo0O0oooO000Oo000oOOoO(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.f3608O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
    }

    @Override // com.google.common.collect.O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000
    public final Object getValue() {
        return this.f3608O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }
}
