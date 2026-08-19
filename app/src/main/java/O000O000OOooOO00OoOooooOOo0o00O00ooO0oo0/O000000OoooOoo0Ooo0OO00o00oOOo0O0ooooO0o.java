package O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0;

import java.security.AccessController;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static String f1968O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static boolean f1969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static boolean f1972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final ConcurrentHashMap f1970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new ConcurrentHashMap();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final Properties f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Properties();

    static {
        AccessController.doPrivileged(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        if (!O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()) {
            return null;
        }
        if (str == null) {
            return f1971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        }
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) f1970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(str);
        return o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null ? ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) f1971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str) : o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    public static boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        if (f1971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
            return true;
        }
        synchronized (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class) {
            try {
                if (f1972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                    return f1971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null;
                }
                f1972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = true;
                try {
                    Class clsO00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class, f1968O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f1971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null || !o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getClass().equals(clsO00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0)) {
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) clsO00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.newInstance();
                        f1971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2;
                        ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Logging to {} via {}", o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2, clsO00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.getName());
                    }
                } catch (Throwable th) {
                    if (f1969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                        th.printStackTrace();
                    }
                    if (f1971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
                        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(null);
                        f1971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Logging to {} via {}", o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.class.getName());
                    }
                }
                return f1971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
