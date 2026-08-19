package O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import fi.iki.elonen.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import fi.iki.elonen.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import java.util.HashMap;
import org.fourthline.cling.model.Namespace;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f1051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    @Override // O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str, HashMap map) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = this.f1051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1060O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        str.getClass();
        if (!str.equals(Namespace.CONTROL)) {
            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.NOT_FOUND, "text/plain", "Error 404, file not found.");
        }
        if (map.get("do") != null && o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != null) {
            String str2 = (String) map.get("do");
            str2.getClass();
            if (str2.equals("newUrl")) {
                O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(new O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(2, ((String) map.get("url")).trim()));
            } else if (str2.equals("newName")) {
                O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(new O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(1, ((String) map.get("name")).trim()));
            }
        }
        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", "ok");
    }

    @Override // O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(fi.iki.elonen.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, String str) {
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3955O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != fi.iki.elonen.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.POST) {
            return false;
        }
        str.getClass();
        return str.equals(Namespace.CONTROL);
    }
}
