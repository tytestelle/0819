package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O extends FilterInputStream {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public volatile byte[] f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f625O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f626O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public int f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f628O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(InputStream inputStream, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        super(inputStream);
        this.f626O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = -1;
        this.f628O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (byte[]) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(65536, byte[].class);
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f626O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (i != -1) {
            int i2 = this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 - i;
            int i3 = this.f625O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f628O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = bArr2;
                    this.f628O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 - this.f626O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i4;
                this.f626O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0;
                this.f624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f626O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = -1;
            this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 0;
            this.f624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i7;
        }
        return i7;
    }

    public final synchronized void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        if (this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
            this.f628O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null || inputStream == null) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            return 0;
        }
        return (this.f624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO - this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
            this.f628O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f625O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Math.max(this.f625O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, i);
        this.f626O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            throw new java.io.IOException("Stream is closed");
        }
        if (this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 >= this.f624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO && O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO && (bArr = this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) == null) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            throw new java.io.IOException("Stream is closed");
        }
        int i = this.f624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i2 = this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f626O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (-1 == i) {
            throw new O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O("Mark has been invalidated, pos: " + this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + " markLimit: " + this.f625O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
        this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (bArr == null) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            throw new IOException("Stream is closed");
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            throw null;
        }
        int i = this.f624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i2 = this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (i - i2 >= j) {
            this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i;
        if (this.f626O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == -1 || j > this.f625O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f626O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = -1;
            }
            return j2 + jSkip;
        }
        if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i4 = this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (i3 - i4 >= j - j2) {
            this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (bArr2 == null) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            int i6 = this.f624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f626O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO && (bArr2 = this.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) == null) {
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        throw null;
                    }
                    int i8 = this.f624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    int i9 = this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f627O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            throw null;
        }
    }
}
