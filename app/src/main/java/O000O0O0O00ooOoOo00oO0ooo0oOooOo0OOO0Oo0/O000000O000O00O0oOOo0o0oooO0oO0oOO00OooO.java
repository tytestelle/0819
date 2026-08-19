package O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final byte[] f2121O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new byte[255];

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final byte[] f2122O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new byte[16];

    static {
        int i;
        int i2 = 0;
        for (int i3 = 0; i3 < 255; i3++) {
            f2121O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i3] = -1;
        }
        for (int i4 = 57; i4 >= 48; i4--) {
            f2121O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i4] = (byte) (i4 - 48);
        }
        for (int i5 = 70; i5 >= 65; i5--) {
            f2121O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i5] = (byte) (i5 - 55);
        }
        for (int i6 = 102; i6 >= 97; i6--) {
            f2121O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i6] = (byte) (i6 - 87);
        }
        while (true) {
            if (i2 >= 10) {
                break;
            }
            f2122O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i2] = (byte) (i2 + 48);
            i2++;
        }
        for (i = 10; i <= 15; i++) {
            f2122O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i] = (byte) (i + 55);
        }
    }

    public static byte[] O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(byte[] bArr) {
        byte b;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (length % 2 != 0) {
            return null;
        }
        int i = length / 2;
        byte[] bArr2 = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            byte b2 = bArr[i3];
            byte[] bArr3 = f2121O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            byte b3 = bArr3[b2];
            if (b3 == -1 || (b = bArr3[bArr[i3 + 1]]) == -1) {
                return null;
            }
            bArr2[i2] = (byte) (b | (b3 << 4));
        }
        return bArr2;
    }

    public static byte[] O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length * 2];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            byte[] bArr3 = f2122O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            bArr2[i2] = bArr3[(bArr[i] >> 4) & 15];
            bArr2[i2 + 1] = bArr3[bArr[i] & 15];
        }
        return bArr2;
    }
}
