package org.eclipse.jetty.client;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f4208O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
        this.f4208O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (this.f4208O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isRunning()) {
            this.f4208O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4220O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(System.currentTimeMillis());
            O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = this.f4208O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4221O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4220O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f2050O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
            }
        }
    }
}
