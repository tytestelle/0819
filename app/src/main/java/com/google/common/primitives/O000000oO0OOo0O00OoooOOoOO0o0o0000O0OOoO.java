package com.google.common.primitives;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final byte[] f3712O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 < 26; i2++) {
            byte b = (byte) (i2 + 10);
            bArr[i2 + 65] = b;
            bArr[i2 + 97] = b;
        }
        f3712O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = bArr;
    }
}
