package O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final ConcurrentHashMap f2107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ConcurrentHashMap();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] f2108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[4];

    public static ArrayList O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        ArrayList arrayList = new ArrayList(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f2101O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f2101O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clear();
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f2102O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f2103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.clear();
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f2104O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setLength(0);
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f2105O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f2106O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = false;
        synchronized (f2108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            for (int i = 0; i < 4; i++) {
                try {
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr = f2108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr[i] == null) {
                        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr[i] = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public static O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        synchronized (f2108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            for (int i = 0; i < 4; i++) {
                try {
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr = f2108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr[i];
                    if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr[i] = null;
                        return o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        }
    }
}
