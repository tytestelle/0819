package O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;

import com.facebook.crypto.cipher.NativeGCMCipher;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends OutputStream {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f853O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final NativeGCMCipher f854O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final int f855O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final byte[] f856O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final byte[] f857O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public boolean f858O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = false;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, NativeGCMCipher nativeGCMCipher, int i) {
        this.f853O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f854O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = nativeGCMCipher;
        this.f857O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new byte[i];
        int iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = nativeGCMCipher.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        byte[] bArr = new byte[iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 + 256];
        this.f855O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = bArr.length - iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this.f856O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = bArr;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f853O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            byte[] bArr = this.f857O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            NativeGCMCipher nativeGCMCipher = this.f854O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (!this.f858O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                this.f858O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = true;
                try {
                    nativeGCMCipher.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(bArr, bArr.length);
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.write(bArr);
                    nativeGCMCipher.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                } catch (Throwable th) {
                    nativeGCMCipher.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    throw th;
                }
            }
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.close();
        } catch (Throwable th2) {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f853O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i3 = i + i2;
        if (bArr.length < i3) {
            throw new ArrayIndexOutOfBoundsException(i3);
        }
        int i4 = this.f855O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i5 = i2 / i4;
        int i6 = i2 % i4;
        int i7 = i;
        int i8 = 0;
        while (true) {
            bArr2 = this.f856O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f853O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (i8 >= i5) {
                break;
            }
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.write(bArr2, 0, this.f854O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(bArr, i7, this.f855O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, bArr2, 0));
            i7 += i4;
            i8++;
        }
        if (i6 > 0) {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.write(bArr2, 0, this.f854O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(bArr, i7, i6, bArr2, 0));
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
