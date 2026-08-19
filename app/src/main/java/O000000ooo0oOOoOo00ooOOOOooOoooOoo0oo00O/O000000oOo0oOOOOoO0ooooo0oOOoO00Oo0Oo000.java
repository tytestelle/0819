package O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements Closeable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final FileInputStream f129O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public byte[] f130O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f131O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f132O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(FileInputStream fileInputStream) {
        Charset charset = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f133O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(charset)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f129O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = fileInputStream;
        this.f130O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        int i;
        synchronized (this.f129O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            try {
                byte[] bArr = this.f130O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f131O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o >= this.f132O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                    int i2 = this.f129O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.f131O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
                    this.f132O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i2;
                }
                for (int i3 = this.f131O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o; i3 != this.f132O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo; i3++) {
                    byte[] bArr2 = this.f130O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f131O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                        String str = new String(bArr2, i4, i - i4, O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f133O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.name());
                        this.f131O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i3 + 1;
                        return str;
                    }
                }
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, (this.f132O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - this.f131O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) + 80);
                while (true) {
                    byte[] bArr3 = this.f130O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    int i5 = this.f131O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.write(bArr3, i5, this.f132O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - i5);
                    this.f132O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = -1;
                    byte[] bArr4 = this.f130O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    int i6 = this.f129O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.f131O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
                    this.f132O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i6;
                    for (int i7 = 0; i7 != this.f132O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo; i7++) {
                        byte[] bArr5 = this.f130O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        if (bArr5[i7] == 10) {
                            int i8 = this.f131O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            if (i7 != i8) {
                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.write(bArr5, i8, i7 - i8);
                            }
                            this.f131O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i7 + 1;
                            return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f129O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            try {
                if (this.f130O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                    this.f130O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
                    this.f129O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
