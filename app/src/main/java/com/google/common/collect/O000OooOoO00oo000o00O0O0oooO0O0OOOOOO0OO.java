package com.google.common.collect;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000OooOoO00oo000o00O0O0oooO0O0OOOOOO0OO extends WeakReference implements O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f3581O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000OooOoO00oo000o00O0O0oooO0O0OOOOOO0OO(ReferenceQueue referenceQueue, Object obj, int i) {
        super(obj, referenceQueue);
        this.f3581O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // com.google.common.collect.O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000
    public O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return null;
    }

    @Override // com.google.common.collect.O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000
    public final int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        return this.f3581O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // com.google.common.collect.O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000
    public final Object getKey() {
        return get();
    }
}
