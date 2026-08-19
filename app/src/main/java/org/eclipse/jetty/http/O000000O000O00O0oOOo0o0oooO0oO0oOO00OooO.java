package org.eclipse.jetty.http;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 {
    @Override // org.eclipse.jetty.http.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        int i;
        int i2 = this.f4359O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        int i3 = this.f4360O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        byte[] bArr = null;
        if (i2 == i3) {
            return null;
        }
        byte[] bArr2 = this.f4352O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i4 = i3 - i2;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            String str = org.eclipse.jetty.util.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            int i7 = i5 + i2;
            byte bO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = bArr2[i7];
            if (bO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == 37 && (i = i5 + 2) < i4) {
                bO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (byte) (org.eclipse.jetty.util.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i7 + 1, 2, 16, bArr2) & 255);
                i5 = i;
            } else {
                if (bO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == 59) {
                    i4 = i5;
                    break;
                }
                if (bArr == null) {
                    i6++;
                }
                i5++;
            }
            if (bArr == null) {
                bArr = new byte[i4];
                for (int i8 = 0; i8 < i6; i8++) {
                    bArr[i8] = bArr2[i8 + i2];
                }
            }
            bArr[i6] = bO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            i6++;
            i5++;
        }
        String str2 = org.eclipse.jetty.util.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return bArr == null ? org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(str2, bArr2, i2, i4) : org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(str2, bArr, 0, i6);
    }

    @Override // org.eclipse.jetty.http.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final String O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        int i = this.f4356O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        int i2 = this.f4357O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (i == i2) {
            return null;
        }
        return org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(org.eclipse.jetty.util.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f4352O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, i, i2 - i);
    }

    @Override // org.eclipse.jetty.http.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final String O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        int i = this.f4359O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        int i2 = this.f4361O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        if (i == i2) {
            return null;
        }
        return org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(org.eclipse.jetty.util.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f4352O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, i, i2 - i);
    }

    @Override // org.eclipse.jetty.http.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final int O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        int i = this.f4357O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        int i2 = this.f4359O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        if (i == i2) {
            return -1;
        }
        return org.eclipse.jetty.util.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i + 1, (i2 - i) - 1, 10, this.f4352O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @Override // org.eclipse.jetty.http.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final String O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        int i = this.f4361O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        int i2 = this.f4362O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        if (i == i2) {
            return null;
        }
        return org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(org.eclipse.jetty.util.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f4352O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, i + 1, (i2 - i) - 1);
    }

    @Override // org.eclipse.jetty.http.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final String O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        int i = this.f4354O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i2 = this.f4355O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (i == i2) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 == 5) {
            byte[] bArr = this.f4352O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (bArr[i] == 104 && bArr[i + 1] == 116 && bArr[i + 2] == 116 && bArr[i + 3] == 112) {
                return "http";
            }
        }
        if (i3 == 6) {
            byte[] bArr2 = this.f4352O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (bArr2[i] == 104 && bArr2[i + 1] == 116 && bArr2[i + 2] == 116 && bArr2[i + 3] == 112 && bArr2[i + 4] == 115) {
                return "https";
            }
        }
        return org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(org.eclipse.jetty.util.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f4352O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, i, i3 - 1);
    }

    @Override // org.eclipse.jetty.http.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final String toString() {
        if (this.f4353O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            byte[] bArr = this.f4352O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            int i = this.f4354O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            this.f4353O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(org.eclipse.jetty.util.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, bArr, i, this.f4363O000000oooOoo00ooo0O0000000o00O0Oooo0OOO - i);
        }
        return this.f4353O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }
}
