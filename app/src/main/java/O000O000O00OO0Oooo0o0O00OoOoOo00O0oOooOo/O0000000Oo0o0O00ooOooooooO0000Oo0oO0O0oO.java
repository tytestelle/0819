package O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo;

import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends org.eclipse.jetty.util.component.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1945O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f1946O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f1945O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class.getName());
    }

    @Override // org.eclipse.jetty.util.component.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, org.eclipse.jetty.util.component.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public void destroy() {
        if (!isStopped()) {
            throw new IllegalStateException("!STOPPED");
        }
        super.destroy();
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f1946O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 != null) {
            o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1925O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
        }
    }

    @Override // org.eclipse.jetty.util.component.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public void doStart() {
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1945O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("starting {}", this);
        super.doStart();
    }

    @Override // org.eclipse.jetty.util.component.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public void doStop() {
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1945O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("stopping {}", this);
        super.doStop();
    }
}
