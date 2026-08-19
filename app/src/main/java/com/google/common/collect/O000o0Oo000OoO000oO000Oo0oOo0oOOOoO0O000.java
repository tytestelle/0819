package com.google.common.collect;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class O000o0Oo000OoO000oO000Oo0oOo0oOOOoO0O000 extends WeakReference implements O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 f3611O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000o0Oo000OoO000oO000Oo0oOo0oOOOoO0O000(ReferenceQueue referenceQueue, Object obj, O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        super(obj, referenceQueue);
        this.f3611O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000;
    }

    @Override // com.google.common.collect.O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO
    public final O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ReferenceQueue referenceQueue, O000o0OOo00oo0o0ooOOoOooO0oo00o0o0OO000o o000o0OOo00oo0o0ooOOoOooO0oo00o0o0OO000o) {
        return new O000o0Oo000OoO000oO000Oo0oOo0oOOOoO0O000(referenceQueue, get(), o000o0OOo00oo0o0ooOOoOooO0oo00o0o0OO000o);
    }

    @Override // com.google.common.collect.O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO
    public final O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return this.f3611O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }
}
