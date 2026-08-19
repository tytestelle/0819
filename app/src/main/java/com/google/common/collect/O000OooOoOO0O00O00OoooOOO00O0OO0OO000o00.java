package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OooOoOO0O00O00OoooOOO00O0OO0OO000o00 implements Iterator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f3582O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f3583O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = -1;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 f3584O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public AtomicReferenceArray f3585O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 f3586O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public O000o0OoO00OooOOoo0o0O0o0OO0OOO00OOooO00 f3587O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public O000o0OoO00OooOOoo0o0O0o0OO0OOO00OOooO00 f3588O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final /* synthetic */ O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO f3589O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final /* synthetic */ int f3590O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    public O000OooOoOO0O00O00OoooOOO00O0OO0OO000o00(O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO, int i) {
        this.f3590O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = i;
        this.f3589O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO;
        this.f3582O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO.segments.length - 1;
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        this.f3587O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
        if (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() || O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
            return;
        }
        while (true) {
            int i = this.f3582O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (i < 0) {
                return;
            }
            O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00[] o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr = this.f3589O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.segments;
            this.f3582O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i - 1;
            O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 = o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr[i];
            this.f3584O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00;
            if (o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00.count != 0) {
                AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.f3584O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.table;
                this.f3585O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = atomicReferenceArray;
                this.f3583O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = atomicReferenceArray.length() - 1;
                if (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
                    return;
                }
            }
        }
    }

    public final boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00;
        O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO = this.f3589O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        try {
            Object key = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000.getKey();
            Object liveValue = o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO.getLiveValue(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000);
            if (liveValue == null) {
                return false;
            }
            this.f3587O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000o0OoO00OooOOoo0o0O0o0OO0OOO00OOooO00(o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO, key, liveValue);
            return true;
        } finally {
            this.f3584O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.postReadCleanup();
        }
    }

    public final Object O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
    }

    public final O000o0OoO00OooOOoo0o0O0o0OO0OOO00OOooO00 O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        O000o0OoO00OooOOoo0o0O0o0OO0OOO00OOooO00 o000o0OoO00OooOOoo0o0O0o0OO0OOO00OOooO00 = this.f3587O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (o000o0OoO00OooOOoo0o0O0o0OO0OOO00OOooO00 == null) {
            throw new NoSuchElementException();
        }
        this.f3588O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000o0OoO00OooOOoo0o0O0o0OO0OOO00OOooO00;
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        return this.f3588O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    public final boolean O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 = this.f3586O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 == null) {
            return false;
        }
        while (true) {
            this.f3586O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001 = this.f3586O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001 == null) {
                return false;
            }
            if (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001)) {
                return true;
            }
            o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 = this.f3586O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        }
    }

    public final boolean O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        while (true) {
            int i = this.f3583O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f3585O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            this.f3583O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i - 1;
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 = (O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) atomicReferenceArray.get(i);
            this.f3586O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000;
            if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 != null && (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) || O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3587O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f3590O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
            case 1:
                return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().f3612O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            case 2:
                return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().f3613O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            default:
                return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f3588O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null);
        this.f3589O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.remove(this.f3588O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3612O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        this.f3588O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = null;
    }
}
