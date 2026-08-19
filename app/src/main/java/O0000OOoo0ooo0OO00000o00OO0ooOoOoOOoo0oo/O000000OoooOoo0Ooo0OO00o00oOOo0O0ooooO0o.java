package O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;

import android.content.Context;
import fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import fi.iki.elonen.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import fi.iki.elonen.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Context f1052O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final String f1053O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final int f1054O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final String f1055O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Context context, String str, int i, String str2) {
        this.f1052O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = context;
        this.f1053O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str;
        this.f1054O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        this.f1055O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = str2;
    }

    @Override // O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str, HashMap map) {
        InputStream inputStreamOpenRawResource = this.f1052O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getResources().openRawResource(this.f1054O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        try {
            return new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, this.f1055O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.concat("; charset=utf-8"), inputStreamOpenRawResource, inputStreamOpenRawResource.available());
        } catch (IOException e) {
            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e.getMessage());
        }
    }

    @Override // O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(fi.iki.elonen.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, String str) {
        return o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3955O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == fi.iki.elonen.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.GET && this.f1053O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equalsIgnoreCase(str);
    }
}
