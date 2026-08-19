package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3723O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3724O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3725O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3726O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3727O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3723O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = atomicReferenceFieldUpdater;
        this.f3724O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = atomicReferenceFieldUpdater2;
        this.f3725O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = atomicReferenceFieldUpdater3;
        this.f3726O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = atomicReferenceFieldUpdater4;
        this.f3727O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = atomicReferenceFieldUpdater5;
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3726O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            if (atomicReferenceFieldUpdater.compareAndSet(o00000OOoOOO00O00o0ooooooooO000ooooO0000, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o00000OOoOOO00O00o0ooooooooO000ooooO0000) == o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        return false;
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final boolean O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3727O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            if (atomicReferenceFieldUpdater.compareAndSet(o00000OOoOOO00O00o0ooooooooO000ooooO0000, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o00000OOoOOO00O00o0ooooooooO000ooooO0000) == obj);
        return false;
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final boolean O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3725O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            if (atomicReferenceFieldUpdater.compareAndSet(o00000OOoOOO00O00o0ooooooooO000ooooO0000, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o00000OOoOOO00O00o0ooooooooO000ooooO0000) == o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
        return false;
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        return (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f3726O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getAndSet(o00000OOoOOO00O00o0ooooooooO000ooooO0000, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f3719O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        return (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) this.f3725O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getAndSet(o00000OOoOOO00O00o0ooooooooO000ooooO0000, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3736O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final void O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01) {
        this.f3724O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.lazySet(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01);
    }

    @Override // O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, Thread thread) {
        this.f3723O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lazySet(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, thread);
    }
}
