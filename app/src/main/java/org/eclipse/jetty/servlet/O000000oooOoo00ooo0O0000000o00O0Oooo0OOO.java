package org.eclipse.jetty.servlet;

import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Stack f4422O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Stack();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo f4423O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        this.f4423O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final void destroy() {
        synchronized (this) {
            while (this.f4422O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size() > 0) {
                try {
                    ((O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f4422O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.pop()).destroy();
                } catch (Exception e) {
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4424O00000OOoOOO00O00o0ooooooooO000ooooO0000).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
                }
            }
        }
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final void init(O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        synchronized (this) {
            if (this.f4422O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size() == 0) {
                try {
                    O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f4423O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.init(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                    this.f4422O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.push(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
                } catch (O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 e) {
                    throw e;
                } catch (Exception e2) {
                    throw new O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(e2);
                }
            }
        }
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final void service(O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        synchronized (this) {
            if (this.f4422O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size() > 0) {
                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = (O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f4422O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.pop();
            } else {
                try {
                    try {
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f4423O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.init(this.f4423O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4428O000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                    } catch (O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw new O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(e2);
                }
            }
        }
        try {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.service(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
            synchronized (this) {
                this.f4422O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.push(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f4422O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.push(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
                throw th;
            }
        }
    }
}
