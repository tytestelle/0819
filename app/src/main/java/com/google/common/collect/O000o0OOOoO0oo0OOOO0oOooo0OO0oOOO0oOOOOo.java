package com.google.common.collect;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes2.dex */
public class O000o0OOOoO0oo0OOOO0oOooo0OO0oOOO0oOOOOo extends O000OooOoO00oo000o00O0O0oooO0O0OOOOOO0OO implements O000o0OOo00oo0o0ooOOoOooO0oo00o0o0OO000o {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public volatile O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO f3610O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000o0OOOoO0oo0OOOO0oOooo0OO0oOOO0oOOOOo(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.f3610O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO.unsetWeakValueReference();
    }

    @Override // com.google.common.collect.O000o0OOo00oo0o0ooOOoOooO0oo00o0o0OO000o
    public final O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return this.f3610O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // com.google.common.collect.O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000
    public final Object getValue() {
        return this.f3610O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get();
    }
}
