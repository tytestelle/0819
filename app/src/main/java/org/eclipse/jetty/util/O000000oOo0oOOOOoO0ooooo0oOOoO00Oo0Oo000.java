package org.eclipse.jetty.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4463O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final int f4464O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f4465O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4463O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.class.getName());
        f4464O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 65536;
        new O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(1);
        f4465O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        new PrintWriter(new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO());
    }

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4463O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
            }
        }
    }
}
