package com.google.common.primitives;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int[] f3708O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f3709O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        this.f3708O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new int[i];
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        int i2 = this.f3709O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + i;
        int[] iArr = this.f3708O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i2 > iArr.length) {
            int length = iArr.length;
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = length + (length >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                iHighestOneBit = Integer.MAX_VALUE;
            }
            this.f3708O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Arrays.copyOf(iArr, iHighestOneBit);
        }
    }
}
