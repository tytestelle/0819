package O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0;

import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends Thread {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f2040O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f2041O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final CopyOnWriteArrayList f2042O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new CopyOnWriteArrayList();

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f2040O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.class.getName());
        f2041O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f2040O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        for (org.eclipse.jetty.util.component.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 : f2041O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2042O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            try {
                if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isStarted()) {
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.stop();
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Stopped {}", o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                }
                if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof org.eclipse.jetty.util.component.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                    ((org.eclipse.jetty.util.component.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).destroy();
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Destroyed {}", o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                }
            } catch (Exception e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(e);
            }
        }
    }
}
