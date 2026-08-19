package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000OOoOOO00O00o0ooooooooO000ooooO0000 extends O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final boolean f3739O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o f3740O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final Object f3742O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public volatile Object f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public volatile O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f3744O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public volatile O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f3745O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    static {
        boolean z;
        O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f3739O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = z;
        f3740O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(O00000OOoOOO00O00o0ooooooooO000ooooO0000.class);
        Throwable th = null;
        try {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
            e = null;
        } catch (Error | Exception e) {
            e = e;
            try {
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(AtomicReferenceFieldUpdater.newUpdater(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.class, Thread.class, "O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO"), AtomicReferenceFieldUpdater.newUpdater(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.class, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.class, "O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO"), AtomicReferenceFieldUpdater.newUpdater(O00000OOoOOO00O00o0ooooooooO000ooooO0000.class, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.class, "O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o"), AtomicReferenceFieldUpdater.newUpdater(O00000OOoOOO00O00o0ooooooooO000ooooO0000.class, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.class, "O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO"), AtomicReferenceFieldUpdater.newUpdater(O00000OOoOOO00O00o0ooooooooO000ooooO0000.class, Object.class, "O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO"));
            } catch (Error | Exception e2) {
                th = e2;
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            }
        }
        f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        if (th != null) {
            O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = f3740O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            Logger loggerO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            Level level = Level.SEVERE;
            loggerO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.log(level, "UnsafeAtomicHelper is broken!", e);
            o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().log(level, "SafeAtomicHelper is broken!", th);
        }
        f3742O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new Object();
    }

    public static void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, boolean z) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        while (true) {
            o00000OOoOOO00O00o0ooooooooO000ooooO0000.getClass();
            for (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(o00000OOoOOO00O00o0ooooooooO000ooooO0000); o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null; o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f3738O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                Thread thread = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f3737O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (thread != null) {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f3737O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                o00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                z = false;
            }
            o00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOoO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(o00000OOoOOO00O00o0ooooooooO000ooooO0000);
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2;
            while (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOoO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO != null) {
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOoO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f3722O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOoO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f3722O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3;
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOoO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOoO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4;
            }
            while (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3 != null) {
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3.f3722O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                Runnable runnable = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3.f3720O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                Objects.requireNonNull(runnable);
                if (runnable instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) runnable;
                    o00000OOoOOO00O00o0ooooooooO000ooooO0000 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f3728O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (o00000OOoOOO00O00o0ooooooooO000ooooO0000.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                        if (f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000OOoOOO00O00o0ooooooooO000ooooO0000, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f3729O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3.f3721O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    Objects.requireNonNull(executor);
                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(runnable, executor);
                }
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            }
            return;
        }
    }

    public static void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f3740O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Object obj) throws ExecutionException {
        if (obj instanceof O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            RuntimeException runtimeException = ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj).f3716O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            throw new ExecutionException(((O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) obj).f3718O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        if (obj == f3742O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) {
        Throwable thO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 instanceof O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
            Object o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ((O00000OOoOOO00O00o0ooooooooO000ooooO0000) o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000).f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.f3715O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.f3716O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null ? new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(false, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.f3716O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) : O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3714O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                }
            }
            Objects.requireNonNull(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        if ((o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 instanceof O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) && (thO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ((O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) != null) {
            return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(thO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        boolean zIsCancelled = o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.isCancelled();
        if ((!f3739O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) && zIsCancelled) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3714O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            Objects.requireNonNull(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3);
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3;
        }
        try {
            Object objO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000);
            if (!zIsCancelled) {
                return objO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null ? f3742O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 : objO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            }
            return new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000));
        } catch (Error e) {
            e = e;
            return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(e);
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(false, e2);
            }
            return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, e2));
        } catch (ExecutionException e3) {
            if (!zIsCancelled) {
                return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(e3.getCause());
            }
            return new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, e3));
        } catch (Exception e4) {
            e = e4;
            return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(e);
        }
    }

    public static Object O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final Throwable O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        if (!(this instanceof O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo)) {
            return null;
        }
        Object obj = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (obj instanceof O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            return ((O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) obj).f3718O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        return null;
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(StringBuilder sb) {
        try {
            Object objO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this);
            sb.append("SUCCESS, result=[");
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, sb);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3737O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        while (true) {
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = this.f3745O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 == O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3736O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                return;
            }
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02 = null;
            while (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 != null) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo03 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3738O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3737O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01;
                } else if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02 != null) {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.f3738O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo03;
                    if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.f3737O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
                    }
                } else if (!f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo03)) {
                }
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo03;
            }
            return;
        }
    }

    public boolean O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(Object obj) {
        if (obj == null) {
            obj = f3742O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        }
        if (!f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, null, obj)) {
            return false;
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, false);
        return true;
    }

    public boolean O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(Throwable th) {
        th.getClass();
        if (!f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, null, new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(th))) {
            return false;
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, false);
        return true;
    }

    @Override // com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000
    public void addListener(Runnable runnable, Executor executor) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(executor, "Executor was null.");
        if (!isDone() && (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f3744O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) != (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f3719O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) {
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3 = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(runnable, executor);
            do {
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3.f3722O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3)) {
                    return;
                } else {
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f3744O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                }
            } while (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2);
        }
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Object obj = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (!(obj == null) && !(obj instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
            return false;
        }
        if (f3739O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(z, new CancellationException("Future.cancel() was called."));
        } else {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = z ? O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3713O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o : O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3714O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            Objects.requireNonNull(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        boolean z2 = false;
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this;
        while (true) {
            if (f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000OOoOOO00O00o0ooooooooO000ooooO0000, obj, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o00000OOoOOO00O00o0ooooooooO000ooooO0000, z);
                if (!(obj instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
                    return true;
                }
                O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = ((O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) obj).f3729O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (!(o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 instanceof O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo)) {
                    o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.cancel(z);
                    return true;
                }
                o00000OOoOOO00O00o0ooooooooO000ooooO0000 = (O00000OOoOOO00O00o0ooooooooO000ooooO0000) o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
                obj = o00000OOoOOO00O00o0ooooooooO000ooooO0000.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (!(obj == null) && !(obj instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = o00000OOoOOO00O00o0ooooooooO000ooooO0000.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (!(obj instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
                    return z2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4 A[EDGE_INSN: B:56:0x00b4->B:36:0x007d BREAK  A[LOOP:0: B:21:0x0041->B:86:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0110  */
    /* JADX WARN: Code duplicated, block: B:71:0x0127  */
    /* JADX WARN: Code duplicated, block: B:74:0x0133  */
    /* JADX WARN: Code duplicated, block: B:78:0x0153  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00b4 -> B:36:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public Object get(long timeout, TimeUnit unit) throws InterruptedException, java.util.concurrent.TimeoutException {
        if (unit == null) throw new NullPointerException("unit");
        if (Thread.interrupted()) throw new InterruptedException();
        long nanos = unit.toNanos(timeout);
        Object value = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (value != null && !(value instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(value);
        if (nanos <= 0L) throw new java.util.concurrent.TimeoutException("Timed out");
        long deadline = System.nanoTime() + nanos;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 waiter = this.f3745O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 sentinel = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3736O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (waiter != sentinel) {
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 node = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
            f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(node, waiter);
            if (f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, waiter, node)) {
                for (;;) {
                    LockSupport.parkNanos(this, nanos);
                    if (Thread.interrupted()) { O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(node); throw new InterruptedException(); }
                    value = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (value != null && !(value instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(value);
                    nanos = deadline - System.nanoTime();
                    if (nanos <= 0L) { O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(node); throw new java.util.concurrent.TimeoutException("Timed out"); }
                }
            }
        }
        value = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (value != null && !(value instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(value);
        throw new java.util.concurrent.TimeoutException("Timed out");
    }

    public boolean isCancelled() {
        return this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return (!(obj instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) & (obj != null);
    }

    public final String toString() {
        String strO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (obj instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                sb.append(", setFuture=[");
                O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = ((O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) obj).f3729O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                try {
                    if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 == this) {
                        sb.append("this future");
                    } else {
                        sb.append(o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000);
                    }
                } catch (Exception e) {
                    e = e;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                    if (strO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == null || strO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isEmpty()) {
                        strO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
                    }
                } catch (Exception | StackOverflowError e3) {
                    strO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = "Exception thrown from implementation: " + e3.getClass();
                }
                if (strO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null) {
                    sb.append(", info=[");
                    sb.append(strO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if ((obj2 != null) & (!(obj2 instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO))) {
                return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(obj2);
            }
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3745O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3736O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
                do {
                    O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
                    if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                            } else {
                                O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO))));
                        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(obj);
                    }
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3745O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                } while (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01);
            }
            Object obj3 = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            Objects.requireNonNull(obj3);
            return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(obj3);
        }
        throw new InterruptedException();
    }
}