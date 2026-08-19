package O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo extends O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public static final int f1717O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = Integer.getInteger("org.eclipse.jetty.io.ByteArrayBuffer.MAX_WRITE", 131072).intValue();

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final byte[] f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(byte[] bArr) {
        this(0, bArr.length, 2, bArr);
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.length;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i, int i2, int i3, byte[] bArr) {
        this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 0;
        int i4 = i + i3;
        byte[] bArr2 = this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if (i4 > bArr2.length) {
            i3 = bArr2.length - i;
        }
        System.arraycopy(bArr, 0, bArr2, i, i3);
        return i3;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(OutputStream outputStream) throws IOException {
        int iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
        byte[] bArr = this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        int i = f1717O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        if (i <= 0 || iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O <= i) {
            outputStream.write(bArr, this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O);
        } else {
            int i2 = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            while (iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O > 0) {
                int i3 = iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O > i ? i : iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
                outputStream.write(bArr, i2, i3);
                i2 += i3;
                iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O -= i3;
            }
        }
        if (O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0()) {
            return;
        }
        clear();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final boolean O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        int i;
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == this) {
            return true;
        }
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() == O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()) {
                int i2 = this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                if (i2 != 0 && (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) && (i = ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) != 0 && i2 != i) {
                    return false;
                }
                int i3 = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int i4 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                byte[] bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                byte[] bArr = this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                if (bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
                    int i5 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    while (true) {
                        int i6 = i5 - 1;
                        if (i5 <= i3) {
                            break;
                        }
                        byte b = bArr[i6];
                        i4--;
                        byte b2 = bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo[i4];
                        if (b != b2) {
                            if (97 <= b && b <= 122) {
                                b = (byte) (b - 32);
                            }
                            if (97 <= b2 && b2 <= 122) {
                                b2 = (byte) (b2 - 32);
                            }
                            if (b != b2) {
                                return false;
                            }
                        }
                        i5 = i6;
                    }
                } else {
                    int i7 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    while (true) {
                        int i8 = i7 - 1;
                        if (i7 <= i3) {
                            break;
                        }
                        byte b3 = bArr[i8];
                        i4--;
                        byte bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i4);
                        if (b3 != bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                            if (97 <= b3 && b3 <= 122) {
                                b3 = (byte) (b3 - 32);
                            }
                            if (97 <= bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 && bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 <= 122) {
                                bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (byte) (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 - 32);
                            }
                            if (b3 != bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                                return false;
                            }
                        }
                        i7 = i8;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final byte O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        return this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO[i];
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final byte[] O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        return this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        byte[] bArr2 = this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if ((i4 > bArr2.length && (i3 = bArr2.length - i) == 0) || i3 < 0) {
            return -1;
        }
        System.arraycopy(bArr2, i, bArr, i2, i3);
        return i3;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(int i, byte b) {
        this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO[i] = b;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(InputStream inputStream, int i) throws IOException {
        if (i < 0 || i > O00000OOoOOO00O00o0ooooooooO000ooooO0000()) {
            i = O00000OOoOOO00O00o0ooooooooO000ooooO0000();
        }
        int i2 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (i3 < i) {
            i5 = inputStream.read(this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, i2, i4);
            if (i5 < 0) {
                break;
            }
            if (i5 > 0) {
                i2 += i5;
                i3 += i5;
                i4 -= i5;
                O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(i2);
            }
            if (inputStream.available() <= 0) {
                break;
            }
        }
        if (i5 >= 0 || i3 != 0) {
            return i3;
        }
        return -1;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(int i, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        int i2 = 0;
        this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 0;
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        int iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
        int i3 = i + iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
        byte[] bArr = this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if (i3 > bArr.length) {
            iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = bArr.length - i;
        }
        byte[] bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        if (bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
            System.arraycopy(bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, bArr, i, iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O);
        } else {
            int i4 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            while (i2 < iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) {
                bArr[i] = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i4);
                i2++;
                i++;
                i4++;
            }
        }
        return iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00() {
        if (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
            throw new IllegalStateException("READONLY");
        }
        int i = this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        if (i < 0) {
            i = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        }
        if (i > 0) {
            int i2 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - i;
            if (i2 > 0) {
                byte[] bArr = this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                System.arraycopy(bArr, i, bArr, 0, i2);
            }
            int i3 = this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            if (i3 > 0) {
                this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = i3 - i;
            }
            O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o - i);
            O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - i);
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O00000OOoOOO00O00o0ooooooooO000ooooO0000() {
        return this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.length - this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)) {
            return false;
        }
        if (obj instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj);
        }
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj;
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() != O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()) {
            return false;
        }
        int i2 = this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (i2 != 0 && (obj instanceof O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) && (i = ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj).f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) != 0 && i2 != i) {
            return false;
        }
        int i3 = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i4 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        int i5 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        while (true) {
            int i6 = i5 - 1;
            if (i5 <= i3) {
                return true;
            }
            i4--;
            if (this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO[i6] != o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i4)) {
                return false;
            }
            i5 = i6;
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final byte get() {
        int i = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i + 1;
        return this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO[i];
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final int hashCode() {
        if (this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == 0 || this.f1697O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o || this.f1698O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            int i = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            int i2 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            while (true) {
                int i3 = i2 - 1;
                if (i2 <= i) {
                    break;
                }
                byte b = this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO[i3];
                if (97 <= b && b <= 122) {
                    b = (byte) (b - 32);
                }
                this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 * 31) + b;
                i2 = i3;
            }
            if (this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == 0) {
                this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = -1;
            }
            this.f1697O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            this.f1698O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        }
        return this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(int i, int i2, int i3, byte[] bArr) {
        super(2, false);
        this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = bArr;
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(i2 + i);
        O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(i);
        this.f1692O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i3;
    }

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(byte[] bArr, int i) {
        super(2, false);
        this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = bArr;
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(0);
        O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(0);
        this.f1692O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(int i) {
        this(0, 0, 2, new byte[i]);
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(0);
    }

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(String str) {
        super(2, false);
        byte[] bArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(str);
        this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = bArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(0);
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(bArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.length);
        this.f1692O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        this.f1700O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = str;
    }

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(String str, String str2) throws UnsupportedEncodingException {
        super(2, false);
        byte[] bytes = str.getBytes(str2);
        this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = bytes;
        O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(0);
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(bytes.length);
        this.f1692O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        this.f1700O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = str;
    }
}
