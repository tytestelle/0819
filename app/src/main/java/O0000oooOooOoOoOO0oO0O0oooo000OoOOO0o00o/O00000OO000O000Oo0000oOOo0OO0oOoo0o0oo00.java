package O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 extends InputStream {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f1889O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final org.eclipse.jetty.http.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f1890O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        this.f1889O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        this.f1890O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1855O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        org.eclipse.jetty.http.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f1890O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4337O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 != null && o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() > 0) {
            return o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
        }
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4327O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (!o00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()) {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 != null) {
                return o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
            }
        } else if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4338O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 > 0 && (o00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) && ((O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o00000OOoOOO00O00o0ooooooooO000ooooO0000).f1735O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.available() > 0) {
            return 1;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f1889O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        long jO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        org.eclipse.jetty.http.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f1890O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4327O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4337O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() <= 0) {
            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4338O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 <= 0 || o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(7)) {
                o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = null;
            } else {
                try {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    while (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() == 0 && !o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(0) && !o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(7) && o00000OOoOOO00O00o0ooooooooO000ooooO0000 != null && o00000OOoOOO00O00o0ooooooooO000ooooO0000.isOpen()) {
                        if (!o00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()) {
                            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() <= 0) {
                                if (!o00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(jO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
                                    o00000OOoOOO00O00o0ooooooooO000ooooO0000.close();
                                    throw new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO("timeout");
                                }
                            }
                        }
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    }
                    if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() <= 0) {
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = null;
                    }
                } catch (IOException e) {
                    o00000OOoOOO00O00o0ooooooooO000ooooO0000.close();
                    throw e;
                }
            }
        }
        int iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = -1;
        if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 != null) {
            int i3 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            int iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
            if (iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O != 0) {
                if (i2 > iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) {
                    i2 = iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
                }
                iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1730O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i3, i, i2, bArr);
                if (iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 > 0) {
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(i3 + iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                }
            }
        } else if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1872O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
            throw new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO("early EOF");
        }
        return iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
    }
}
