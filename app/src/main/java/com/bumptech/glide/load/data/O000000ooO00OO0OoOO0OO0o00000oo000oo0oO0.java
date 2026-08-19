package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 extends FilterInputStream {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final byte[] f2886O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final int f2887O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 31;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final byte f2888O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f2889O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Cannot add invalid orientation: "));
        }
        this.f2888O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f2889O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i3 < 2 || i3 > (i2 = f2887O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) {
            i = super.read();
        } else {
            i = i3 == i2 ? this.f2888O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : f2886O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f2889O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f2889O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (int) (((long) this.f2889O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f2889O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i5 = f2887O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f2888O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f2886O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2889O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f2889O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO += i3;
        }
        return i3;
    }
}
