package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo extends O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 implements Runnable {

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final Runnable f3769O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    public O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(Runnable runnable) {
        runnable.getClass();
        this.f3769O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = runnable;
    }

    @Override // com.google.common.util.concurrent.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final String O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        return "task=[" + this.f3769O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3769O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.run();
        } catch (Throwable th) {
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(th);
            throw th;
        }
    }
}
