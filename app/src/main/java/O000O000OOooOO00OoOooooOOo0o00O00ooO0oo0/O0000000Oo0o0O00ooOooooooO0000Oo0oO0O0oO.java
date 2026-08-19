package O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {
    public final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this;
                    String str2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1982O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    int length2 = str2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (!Character.isWhitespace(str2.charAt(i2))) {
                            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                            if (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == this) {
                                break;
                            }
                            str = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(str2, ".", str);
                            break;
                        }
                    }
                    ConcurrentHashMap concurrentHashMap = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) Collections.unmodifiableMap(concurrentHashMap).get(str);
                    if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
                        return o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    }
                    O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(str);
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.f1981O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1981O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.f1980O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1980O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    int i3 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (i3 != o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1979O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i3;
                    }
                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) concurrentHashMap.putIfAbsent(str, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1);
                    return o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 == null ? o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 : o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2;
                }
            }
        }
        return this;
    }
}
