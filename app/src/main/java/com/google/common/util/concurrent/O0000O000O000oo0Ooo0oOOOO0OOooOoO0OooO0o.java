package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o implements O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o f3760O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.class);

    @Override // com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000
    public final void addListener(Runnable runnable, Executor executor) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f3760O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), super.toString(), "[status=SUCCESS, result=[null]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return null;
    }
}
