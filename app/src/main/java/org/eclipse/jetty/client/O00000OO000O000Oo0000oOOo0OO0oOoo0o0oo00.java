package org.eclipse.jetty.client;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O00000OOoOOO00O00o0ooooooooO000ooooO0000 f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000OOoOOO00O00o0ooooooooO000ooooO0000;
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            o00000OOoOOO00O00o0ooooooooO000ooooO0000.onExpire();
        } finally {
            o00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Exception exc) {
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            o00000OOoOOO00O00o0ooooooooO000ooooO0000.onConnectionFailed(exc);
        } finally {
            o00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.onRequestCommitted();
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        try {
            this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.onResponseComplete();
            synchronized (this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                try {
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    o00000OOoOOO00O00o0ooooooooO000ooooO0000._onResponseCompleteDone = true;
                    boolean z = o00000OOoOOO00O00o0ooooooooO000ooooO0000._onDone | o00000OOoOOO00O00o0ooooooooO000ooooO0000._onRequestCompleteDone;
                    o00000OOoOOO00O00o0ooooooooO000ooooO0000._onDone = z;
                    if (z) {
                        o00000OOoOOO00O00o0ooooooooO000ooooO0000.disassociate();
                    }
                    this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            synchronized (this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                try {
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0001 = this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    o00000OOoOOO00O00o0ooooooooO000ooooO0001._onResponseCompleteDone = true;
                    boolean z2 = o00000OOoOOO00O00o0ooooooooO000ooooO0001._onDone | o00000OOoOOO00O00o0ooooooooO000ooooO0001._onRequestCompleteDone;
                    o00000OOoOOO00O00o0ooooooooO000ooooO0001._onDone = z2;
                    if (z2) {
                        o00000OOoOOO00O00o0ooooooooO000ooooO0001.disassociate();
                    }
                    this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.notifyAll();
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.onResponseHeader(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Throwable th) {
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            o00000OOoOOO00O00o0ooooooooO000ooooO0000.onException(th);
        } finally {
            o00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.onResponseContent(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.onResponseHeaderComplete();
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        try {
            this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.onRequestComplete();
            synchronized (this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                try {
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    o00000OOoOOO00O00o0ooooooooO000ooooO0000._onRequestCompleteDone = true;
                    boolean z = o00000OOoOOO00O00o0ooooooooO000ooooO0000._onDone | o00000OOoOOO00O00o0ooooooooO000ooooO0000._onResponseCompleteDone;
                    o00000OOoOOO00O00o0ooooooooO000ooooO0000._onDone = z;
                    if (z) {
                        o00000OOoOOO00O00o0ooooooooO000ooooO0000.disassociate();
                    }
                    this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            synchronized (this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                try {
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0001 = this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    o00000OOoOOO00O00o0ooooooooO000ooooO0001._onRequestCompleteDone = true;
                    boolean z2 = o00000OOoOOO00O00o0ooooooooO000ooooO0001._onDone | o00000OOoOOO00O00o0ooooooooO000ooooO0001._onResponseCompleteDone;
                    o00000OOoOOO00O00o0ooooooooO000ooooO0001._onDone = z2;
                    if (z2) {
                        o00000OOoOOO00O00o0ooooooooO000ooooO0001.disassociate();
                    }
                    this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.notifyAll();
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, int i, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        this.f4240O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.onResponseStatus(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, i, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
    }
}
