package O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f2052O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(14, false);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f2053O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public volatile boolean f2054O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        this.f2053O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f2052O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
                    if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 == null) {
                        synchronized (this) {
                            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f2052O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o();
                            if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 == null) {
                                this.f2054O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
                                this.f2054O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
                                return;
                            }
                        }
                    }
                    this.f2053O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
                } catch (InterruptedException e) {
                    this.f2053O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2078O00000OOoOOO00O00o0ooooooooO000ooooO0000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e);
                    this.f2054O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
                    return;
                }
            } catch (Throwable th) {
                this.f2054O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
                throw th;
            }
        }
    }
}
