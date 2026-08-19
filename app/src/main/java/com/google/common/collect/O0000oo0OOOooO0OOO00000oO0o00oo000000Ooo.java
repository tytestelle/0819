package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo {
    public static int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public abstract O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj);

    public abstract O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
}
