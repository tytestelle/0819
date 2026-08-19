package com.google.common.util.concurrent;

import com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o extends O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o implements ScheduledFuture, O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, Future {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O00000OOoOOO00O00o0ooooooooO000ooooO0000 f3767O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ScheduledFuture f3768O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, ScheduledFuture scheduledFuture) {
        this.f3767O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000OOoOOO00O00o0ooooooooO000ooooO0000;
        this.f3768O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = scheduledFuture;
    }

    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(boolean z) {
        return this.f3767O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.cancel(z);
    }

    @Override // com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000
    public final void addListener(Runnable runnable, Executor executor) {
        this.f3767O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(z);
        if (zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            this.f3768O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.cancel(z);
        }
        return zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f3768O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.compareTo(delayed);
    }

    @Override // com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o
    public final Object delegate() {
        return this.f3767O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f3767O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f3768O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3767O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3767O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f3767O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(j, timeUnit);
    }
}
