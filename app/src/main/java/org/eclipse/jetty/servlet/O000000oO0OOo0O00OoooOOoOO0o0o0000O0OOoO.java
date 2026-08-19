package org.eclipse.jetty.servlet;

import O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import java.util.HashMap;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4393O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f4394O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient Class f4395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final HashMap f4396O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new HashMap(3);

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public String f4397O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public boolean f4398O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final boolean f4399O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public String f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO f4401O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4393O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.class.getName());
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this.f4394O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        int i = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4391O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            this.f4399O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = false;
        } else {
            this.f4399O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = true;
        }
    }

    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Class cls) {
        this.f4395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = cls;
        this.f4397O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = cls.getName();
        if (this.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
            this.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = cls.getName() + "-" + Integer.toHexString(hashCode());
        }
    }

    @Override // org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public void doStart() throws O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 {
        String str;
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f4393O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        if (this.f4395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null && ((str = this.f4397O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) == null || str.equals(""))) {
            throw new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("No class for Servlet or Filter for " + this.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
        if (this.f4395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            try {
                this.f4395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.class, this.f4397O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                if (((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Holding {}", this.f4395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                }
            } catch (Exception e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
                throw new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(e.getMessage());
            }
        }
    }

    public final String toString() {
        return this.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }
}
