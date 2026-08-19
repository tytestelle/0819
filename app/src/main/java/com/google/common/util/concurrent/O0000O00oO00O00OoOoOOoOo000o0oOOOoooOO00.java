package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f3761O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(1);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f3762O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(1);

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Thread thread) {
        Runnable runnable = (Runnable) get();
        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
            O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = f3762O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (!z2 && runnable != o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                break;
            }
            if (z2) {
                o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = (O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO || compareAndSet(runnable, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                z = Thread.interrupted() || z;
                LockSupport.park(o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract void afterRanInterruptiblyFailure(Throwable th);

    public abstract void afterRanInterruptiblySuccess(Object obj);

    public final void interruptTask() {
        O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = f3762O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = f3761O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = new O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this, null);
            o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2)) == o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean isDone();

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objRunInterruptibly = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zIsDone = isDone();
            O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = f3761O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (!zIsDone) {
                try {
                    objRunInterruptibly = runInterruptibly();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(threadCurrentThread);
                        }
                        if (zIsDone) {
                            return;
                        }
                        afterRanInterruptiblyFailure(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(threadCurrentThread);
                        }
                        if (!zIsDone) {
                            afterRanInterruptiblySuccess(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            afterRanInterruptiblySuccess(objRunInterruptibly);
        }
    }

    public abstract Object runInterruptibly();

    public abstract String toPendingString();

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f3761O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            str = "running=[DONE]";
        } else if (runnable instanceof O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(str, ", ");
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(toPendingString());
        return sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
    }
}
