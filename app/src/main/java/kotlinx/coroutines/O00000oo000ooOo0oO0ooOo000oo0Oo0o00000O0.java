package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 extends O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o implements Runnable {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 f4075O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final long f4076O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = new O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
        f4075O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
        o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f4076O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = timeUnit.toNanos(l.longValue());
    }

    @Override // kotlinx.coroutines.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo
    public final Thread O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o
    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(runnable);
    }

    public final synchronized void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo.f4106O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                    if (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()) {
                        return;
                    }
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                    if (jO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f4076O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                            if (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()) {
                                return;
                            }
                            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                            return;
                        }
                        if (jO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 > j2) {
                            jO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                            if (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()) {
                                return;
                            }
                            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                            return;
                        }
                        LockSupport.parkNanos(this, jO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
            if (!O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()) {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o, kotlinx.coroutines.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
