package O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends FilterInputStream {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final byte[] f859O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f860O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f861O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public boolean f862O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(ByteArrayInputStream byteArrayInputStream, int i) {
        super(byteArrayInputStream);
        this.f859O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new byte[i];
        this.f860O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, int i2, int i3, byte[] bArr) {
        int i4 = this.f860O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO - i2;
        int iMax = Math.max(0, i - i4) + i3;
        int iMin = Math.min(i4, i);
        if (iMin > 0) {
            byte[] bArr2 = this.f859O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (i2 > 0) {
                System.arraycopy(bArr2, 0, bArr2, iMin, i2);
            }
            System.arraycopy(bArr, iMax, bArr2, 0, iMin);
        }
        this.f861O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = iMin + i2;
        return iMax - i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        while (i == 0) {
            i = read(bArr, 0, 1);
        }
        if (i == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f862O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            return -1;
        }
        if (i2 == 0) {
            return 0;
        }
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        while (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 0) {
            int i3 = this.f861O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (i2 >= i3) {
                int i4 = ((FilterInputStream) this).in.read(bArr, this.f861O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + i, i2 - i3);
                if (i4 == -1) {
                    this.f862O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = true;
                    iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = -1;
                } else {
                    int i5 = this.f861O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    if (i5 > 0) {
                        System.arraycopy(this.f859O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 0, bArr, i, i5);
                    }
                    int i6 = this.f861O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + i4;
                    int i7 = ((FilterInputStream) this).in.read(this.f859O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 0, this.f860O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    if (i7 == -1) {
                        this.f862O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = true;
                        i7 = 0;
                    }
                    iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i6, i7, i, bArr);
                }
            } else {
                int i8 = i3 - i2;
                System.arraycopy(this.f859O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 0, bArr, i, i2);
                byte[] bArr2 = this.f859O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                System.arraycopy(bArr2, i2, bArr2, 0, i8);
                int i9 = ((FilterInputStream) this).in.read(this.f859O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, i8, this.f860O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO - i8);
                if (i9 == -1) {
                    byte[] bArr3 = this.f859O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    System.arraycopy(bArr3, 0, bArr3, i2, i8);
                    System.arraycopy(bArr, i, this.f859O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 0, i2);
                    this.f862O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = true;
                    iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = -1;
                } else {
                    iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i2, i9 + i8, i, bArr);
                }
            }
        }
        return iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }
}
