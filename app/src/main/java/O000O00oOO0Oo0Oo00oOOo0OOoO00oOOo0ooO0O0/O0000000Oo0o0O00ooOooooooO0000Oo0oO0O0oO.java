package O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0;

import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {
    private static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo LOG;
    private final ExecutorService _executor;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        LOG = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class.getName());
    }

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ExecutorService executorService) {
        this._executor = executorService;
    }

    @Override // O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public boolean dispatch(Runnable runnable) {
        try {
            this._executor.execute(runnable);
            return true;
        } catch (RejectedExecutionException e) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
            return false;
        }
    }

    public int getIdleThreads() {
        ExecutorService executorService = this._executor;
        if (!(executorService instanceof ThreadPoolExecutor)) {
            return -1;
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        return threadPoolExecutor.getPoolSize() - threadPoolExecutor.getActiveCount();
    }

    public int getThreads() {
        ExecutorService executorService = this._executor;
        if (executorService instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) executorService).getPoolSize();
        }
        return -1;
    }

    @Override // O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public boolean isLowOnThreads() {
        ExecutorService executorService = this._executor;
        if (!(executorService instanceof ThreadPoolExecutor)) {
            return false;
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        return threadPoolExecutor.getPoolSize() == threadPoolExecutor.getMaximumPoolSize() && threadPoolExecutor.getQueue().size() >= threadPoolExecutor.getPoolSize() - threadPoolExecutor.getActiveCount();
    }

    public void join() throws InterruptedException {
        this._executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
    }
}
