package O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o;

import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1996O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public JarURLConnection f1997O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f1996O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.class.getName());
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final InputStream O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        return !this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.endsWith("!/") ? new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, super.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) : new URL(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(2, 4, this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)).openStream();
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public synchronized void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        this.f1997O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
        super.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public synchronized boolean O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        super.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        try {
            if (this.f1997O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            }
        } catch (IOException e) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1996O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
            this.f1997O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
        }
        return this.f1997O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != null;
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public boolean O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        return this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.endsWith("!/") ? O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() : super.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
    }

    public void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        this.f1997O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (JarURLConnection) this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }
}
