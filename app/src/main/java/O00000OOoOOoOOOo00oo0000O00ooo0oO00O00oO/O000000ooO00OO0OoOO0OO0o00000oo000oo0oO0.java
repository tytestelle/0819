package O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

import O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000oooOoo00ooo0O0000000o00O0Oooo0OOO f459O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(1000);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f460O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(10, new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(8));

    public final String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        String str;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f460O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.acquire();
        try {
            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2.f457O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            byte[] bArrDigest = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2.f457O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.digest();
            char[] cArr = O00000OOoOOO00O00o0ooooooooO000ooooO0000.f827O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            synchronized (cArr) {
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b = bArrDigest[i];
                    int i2 = i * 2;
                    char[] cArr2 = O00000OOoOOO00O00o0ooooooooO000ooooO0000.f826O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    cArr[i2] = cArr2[(b & 255) >>> 4];
                    cArr[i2 + 1] = cArr2[b & 15];
                }
                str = new String(cArr);
            }
            this.f460O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.release(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2);
            return str;
        } catch (Throwable th) {
            this.f460O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.release(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2);
            throw th;
        }
    }

    public final String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        synchronized (this.f459O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (String) this.f459O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        }
        if (strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
            strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        }
        synchronized (this.f459O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            this.f459O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        return strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }
}
