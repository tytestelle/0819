package O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1691O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f1692O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final boolean f1693O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public int f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public int f1697O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public int f1698O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public int f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public String f1700O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 f1701O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f1691O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class.getName());
        Boolean.getBoolean("org.eclipse.jetty.io.AbstractBuffer.boundsChecking");
    }

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, boolean z) {
        if (i == 0 && z) {
            throw new IllegalArgumentException("IMMUTABLE && VOLATILE");
        }
        this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = -1;
        this.f1692O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f1693O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(OutputStream outputStream) throws IOException {
        byte[] bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        if (bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
            outputStream.write(bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O());
        } else {
            int iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
            int i = iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O <= 1024 ? iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O : 1024;
            byte[] bArr = new byte[i];
            int i2 = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            while (iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O > 0) {
                int iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i2, 0, iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O > i ? i : iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, bArr);
                outputStream.write(bArr, 0, iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                i2 += iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O -= iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            }
        }
        clear();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public boolean O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        int i;
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == this) {
            return true;
        }
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() != O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()) {
            return false;
        }
        int i2 = this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (i2 != 0 && (i = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) != 0 && i2 != i) {
            return false;
        }
        int i3 = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i4 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        byte[] bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        byte[] bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        if (bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null && bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 != null) {
            int i5 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            while (true) {
                int i6 = i5 - 1;
                if (i5 <= i3) {
                    break;
                }
                byte b = bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo[i6];
                i4--;
                byte b2 = bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2[i4];
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
                byte bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i8);
                i4--;
                byte bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i4);
                if (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
                    if (97 <= bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 && bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 <= 122) {
                        bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (byte) (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 - 32);
                    }
                    if (97 <= bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 && bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 <= 122) {
                        bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = (byte) (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 - 32);
                    }
                    if (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
                        return false;
                    }
                }
                i7 = i8;
            }
        }
        return true;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i, int i2) {
        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = this.f1701O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 == null) {
            int i3 = i2 + i;
            int i4 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() ? 1 : 2;
            O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(2, true ^ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0());
            o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.f1730O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = buffer();
            o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(i3);
            o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(i);
            o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = -1;
            o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.f1692O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i4;
            this.f1701O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
        } else {
            o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(buffer());
            O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002 = this.f1701O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
            o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = -1;
            o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(0);
            this.f1701O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(i2 + i);
            this.f1701O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(i);
        }
        return this.f1701O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public boolean O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        return this.f1692O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO <= 1;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public boolean O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        return this.f1693O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public int O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(InputStream inputStream, int i) throws IOException {
        byte[] bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        int iO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O00000OOoOOO00O00o0ooooooooO000ooooO0000();
        if (iO00000OOoOOO00O00o0ooooooooO000ooooO0000 <= i) {
            i = iO00000OOoOOO00O00o0ooooooooO000ooooO0000;
        }
        if (bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
            int i2 = inputStream.read(bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, i);
            if (i2 > 0) {
                this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo += i2;
            }
            return i2;
        }
        int i3 = i <= 1024 ? i : 1024;
        byte[] bArr = new byte[i3];
        while (i > 0) {
            int i4 = inputStream.read(bArr, 0, i3);
            if (i4 < 0) {
                return -1;
            }
            int i5 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i5, 0, i4, bArr) + i5);
            i -= i4;
        }
        return 0;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00() {
        if (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
            throw new IllegalStateException("READONLY");
        }
        int i = this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        if (i < 0) {
            i = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        }
        if (i > 0) {
            byte[] bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
            int i2 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - i;
            if (i2 > 0) {
                if (bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
                    System.arraycopy(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(), i, O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(), 0, i2);
                } else {
                    O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(0, O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, i2));
                }
            }
            int i3 = this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            if (i3 > 0) {
                this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = i3 - i;
            }
            O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o - i);
            O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - i);
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public int O00000OOoOOO00O00o0ooooooooO000ooooO0000() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() - this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    public final byte[] O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO() {
        int iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
        byte[] bArr = new byte[iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O];
        byte[] bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        if (bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
            System.arraycopy(bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, bArr, 0, iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O);
        } else {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 0, O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(), bArr);
        }
        return bArr;
    }

    public final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o() {
        if (O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0()) {
            return this;
        }
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer = buffer();
        if ((this instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) || (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
            return new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(0, O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(), 0, O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO());
        }
        return new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(0, O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(), 0, O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO());
    }

    public final int O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o() {
        return this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public final boolean O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() {
        return this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo > this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public final boolean O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0() {
        return this.f1692O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO <= 0;
    }

    public final int O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() {
        return this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public final void O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000() {
        this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o - 1;
    }

    public final int O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo() {
        return this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    public final int O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        int i = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        int iO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(i, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(i + iO00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
        return iO00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
    }

    public final int O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(byte[] bArr) {
        int i = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i, 0, bArr.length, bArr);
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(i + iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        return iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public final void O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(byte b) {
        int i = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(i, b);
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(i + 1);
    }

    public final void O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(int i) {
        this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 0;
    }

    public final void O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o() {
        this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = -1;
    }

    public final void O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(int i) {
        this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i;
        this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 0;
    }

    public final int O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(int i) {
        if (O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() < i) {
            i = O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
        }
        O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + i);
        return i;
    }

    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00() {
        int i = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i2 = this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        int i3 = (i - i2) - 1;
        if (i2 < 0) {
            return null;
        }
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i2, i3);
        this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = -1;
        return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    public final String O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o() {
        StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O("[");
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(super.hashCode());
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(",");
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(buffer().hashCode());
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(",m=");
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(",g=");
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(",p=");
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(",c=");
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append("]={");
        int i = this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        if (i >= 0) {
            while (i < this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                org.eclipse.jetty.util.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i), sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O);
                i++;
            }
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append("}{");
        }
        int i2 = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i3 = 0;
        while (i2 < this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            org.eclipse.jetty.util.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i2), sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O);
            int i4 = i3 + 1;
            if (i3 == 50 && this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - i2 > 20) {
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(" ... ");
                i2 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - 20;
            }
            i2++;
            i3 = i4;
        }
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append('}');
        return sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
    }

    public final String O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(String str) {
        try {
            byte[] bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
            return bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null ? new String(bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(), str) : new String(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(), 0, O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(), str);
        } catch (Exception e) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1691O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
            return new String(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(), 0, O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O());
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public void clear() {
        this.f1699O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = -1;
        O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(0);
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(0);
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)) {
            return false;
        }
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj;
        if ((this instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) || (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
            return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
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
            if (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i6) != o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i4)) {
                return false;
            }
            i5 = i6;
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public byte get() {
        int i = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i + 1;
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i);
    }

    public int hashCode() {
        if (this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == 0 || this.f1697O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o || this.f1698O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            int i = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            byte[] bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
            if (bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
                int i2 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                while (true) {
                    int i3 = i2 - 1;
                    if (i2 <= i) {
                        break;
                    }
                    byte b = bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo[i3];
                    if (97 <= b && b <= 122) {
                        b = (byte) (b - 32);
                    }
                    this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 * 31) + b;
                    i2 = i3;
                }
            } else {
                int i4 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= i) {
                        break;
                    }
                    byte bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i5);
                    if (97 <= bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 && bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 <= 122) {
                        bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (byte) (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 - 32);
                    }
                    this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 * 31) + bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    i4 = i5;
                }
            }
            if (this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == 0) {
                this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = -1;
            }
            this.f1697O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            this.f1698O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        }
        return this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    public String toString() {
        if (!O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0()) {
            return new String(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(), 0, O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O());
        }
        if (this.f1700O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
            this.f1700O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new String(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(), 0, O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O());
        }
        return this.f1700O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 buffer() {
        return this;
    }
}
