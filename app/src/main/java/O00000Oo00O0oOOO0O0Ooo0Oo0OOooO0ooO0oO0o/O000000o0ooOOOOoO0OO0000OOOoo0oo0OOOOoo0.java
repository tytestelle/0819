package O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements ExecutorService {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final long f467O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static volatile int f468O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ThreadPoolExecutor f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(ThreadPoolExecutor threadPoolExecutor) {
        this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.submit(runnable);
    }

    public final String toString() {
        return this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.f469O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.submit(callable);
    }
}
