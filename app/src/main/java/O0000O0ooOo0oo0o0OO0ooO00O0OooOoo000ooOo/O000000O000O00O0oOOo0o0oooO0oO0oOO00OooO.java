package O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f863O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public boolean f864O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f865O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public volatile UnsatisfiedLinkError f866O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public final synchronized void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        if (!O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()) {
            throw new O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f866O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
    }

    public final synchronized boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        if (!this.f864O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            return this.f865O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        try {
            Iterator it = f863O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.iterator();
            while (it.hasNext()) {
                System.loadLibrary((String) it.next());
            }
            this.f865O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
        } catch (UnsatisfiedLinkError e) {
            this.f866O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = e;
            this.f865O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;
        }
        this.f864O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = false;
        return this.f865O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }
}
