package O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;

import com.facebook.crypto.cipher.NativeGCMCipher;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends InputStream {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f849O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final NativeGCMCipher f850O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public byte[] f851O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public boolean f852O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(ByteArrayInputStream byteArrayInputStream, NativeGCMCipher nativeGCMCipher, int i) {
        this.f849O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(byteArrayInputStream, i);
        this.f850O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = nativeGCMCipher;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() throws O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
        NativeGCMCipher nativeGCMCipher = this.f850O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (this.f852O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            return;
        }
        this.f852O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = true;
        try {
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f849O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f861O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f860O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                throw new IOException("Not enough tail data");
            }
            byte[] bArr = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f859O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            nativeGCMCipher.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(bArr, bArr.length);
            nativeGCMCipher.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        } catch (Throwable th) {
            nativeGCMCipher.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f849O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f849O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        } finally {
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.close();
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        // Mark is not supported for this streaming cipher input.
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        return i < 0 ? -1 : (bArr[0] & 255);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (this.f851O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            this.f851O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new byte[256];
        }
        long j2 = 0;
        while (j > 0) {
            int i = read(this.f851O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 0, (int) Math.min(j, 256L));
            if (i < 0) {
                break;
            }
            long j3 = i;
            j2 += j3;
            j -= j3;
        }
        if (j2 == 0) {
            return -1L;
        }
        return j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        if (bArr.length >= i3) {
            int i4 = this.f849O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.read(bArr, i, i2);
            if (i4 == -1) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                return -1;
            }
            return this.f850O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(bArr, i, i4, bArr, i);
        }
        throw new ArrayIndexOutOfBoundsException(i3);
    }
}
