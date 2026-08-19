package org.eclipse.jetty.util;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends Writer {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f4445O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f4446O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public OutputStreamWriter f4447O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public byte[] f4444O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new byte[2048];

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        int i2 = this.f4445O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i3 = i2 + i;
        byte[] bArr = this.f4444O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i3 > bArr.length) {
            byte[] bArr2 = new byte[((bArr.length + i) * 4) / 3];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.f4444O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = bArr2;
        }
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(char[] cArr, int i, int i2) throws IOException {
        O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f4446O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
            this.f4446O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i2 * 2);
            this.f4447O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new OutputStreamWriter(this.f4446O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, "ISO-8859-1");
        } else {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.reset();
        }
        this.f4447O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.write(cArr, i, i2);
        this.f4447O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.flush();
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f4446O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getCount());
        System.arraycopy(this.f4446O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(), 0, this.f4444O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f4445O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f4446O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getCount());
        this.f4445O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f4446O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getCount() + this.f4445O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) throws IOException {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(cArr.length);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 0 || c > 127) {
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(cArr, i, cArr.length - i);
                return;
            }
            byte[] bArr = this.f4444O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            int i2 = this.f4445O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            this.f4445O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2 + 1;
            bArr[i2] = (byte) c;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            char c = cArr[i4];
            if (c >= 0 && c <= 127) {
                byte[] bArr = this.f4444O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                int i5 = this.f4445O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                this.f4445O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i5 + 1;
                bArr[i5] = (byte) c;
            } else {
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(cArr, i4, i2 - i3);
                return;
            }
        }
    }

    @Override // java.io.Writer
    public final void write(String str) throws IOException {
        if (str == null) {
            write("null", 0, 4);
            return;
        }
        int length = str.length();
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 0 && cCharAt <= 127) {
                byte[] bArr = this.f4444O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                int i2 = this.f4445O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                this.f4445O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2 + 1;
                bArr[i2] = (byte) cCharAt;
            } else {
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(str.toCharArray(), i, length - i);
                return;
            }
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            char cCharAt = str.charAt(i4);
            if (cCharAt >= 0 && cCharAt <= 127) {
                byte[] bArr = this.f4444O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                int i5 = this.f4445O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                this.f4445O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i5 + 1;
                bArr[i5] = (byte) cCharAt;
            } else {
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(str.toCharArray(), i4, i2 - i3);
                return;
            }
        }
    }
}
