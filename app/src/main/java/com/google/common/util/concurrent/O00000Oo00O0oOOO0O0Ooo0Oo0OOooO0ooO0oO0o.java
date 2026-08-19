package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o extends O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f3747O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f3747O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = atomicIntegerFieldUpdater;
    }

    @Override // O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final int O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) {
        return this.f3747O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.decrementAndGet(o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo);
    }
}
