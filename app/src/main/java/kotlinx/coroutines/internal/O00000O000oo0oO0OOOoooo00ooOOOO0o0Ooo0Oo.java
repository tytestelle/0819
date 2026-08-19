package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {
    private volatile AtomicReferenceArray<Object> array;

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return this.array.length();
    }

    public final Object O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, kotlinx.coroutines.scheduling.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        this.array = atomicReferenceArray2;
    }
}
