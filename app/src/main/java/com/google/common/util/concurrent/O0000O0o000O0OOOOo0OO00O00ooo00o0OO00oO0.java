package com.google.common.util.concurrent;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 extends AbstractExecutorService implements O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ExecutorService f3766O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(ExecutorService executorService) {
        executorService.getClass();
        this.f3766O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = executorService;
    }

    public final O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Callable callable) {
        return (O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) super.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f3766O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3766O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f3766O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f3766O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f3766O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f3766O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return (O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + this.f3766O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + "]";
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return (O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return (O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) super.submit(callable);
    }
}
