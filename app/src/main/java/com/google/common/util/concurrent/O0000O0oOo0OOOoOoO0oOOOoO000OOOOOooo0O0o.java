package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o extends O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 implements ScheduledExecutorService {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ScheduledExecutorService f3770O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f3770O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = new O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(callable);
        return new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, this.f3770O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.schedule(o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = new O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(runnable);
        return new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo, this.f3770O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.scheduleAtFixedRate(o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = new O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(runnable);
        return new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo, this.f3770O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.scheduleWithFixedDelay(o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = new O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(Executors.callable(runnable, null));
        return new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, this.f3770O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.schedule(o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, j, timeUnit));
    }
}
