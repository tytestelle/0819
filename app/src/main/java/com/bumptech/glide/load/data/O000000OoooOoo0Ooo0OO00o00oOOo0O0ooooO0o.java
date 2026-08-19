package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends OutputStream {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final FileOutputStream f2879O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public byte[] f2880O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f2881O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f2882O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(FileOutputStream fileOutputStream, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this.f2879O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = fileOutputStream;
        this.f2881O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this.f2880O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (byte[]) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f2879O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f2880O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (bArr != null) {
                this.f2881O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(bArr);
                this.f2880O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f2882O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        FileOutputStream fileOutputStream = this.f2879O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i > 0) {
            fileOutputStream.write(this.f2880O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 0, i);
            this.f2882O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f2880O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i2 = this.f2882O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        int i3 = i2 + 1;
        this.f2882O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f2879O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.write(bArr, 0, i3);
        this.f2882O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f2882O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            FileOutputStream fileOutputStream = this.f2879O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (i6 == 0 && i4 >= this.f2880O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f2880O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length - i6);
            System.arraycopy(bArr, i5, this.f2880O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2882O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, iMin);
            int i7 = this.f2882O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + iMin;
            this.f2882O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i7;
            i3 += iMin;
            byte[] bArr2 = this.f2880O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.f2882O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0;
            }
        } while (i3 < i2);
    }
}
