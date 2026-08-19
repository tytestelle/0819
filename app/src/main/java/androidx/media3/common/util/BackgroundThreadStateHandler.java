package androidx.media3.common.util;

import android.os.Looper;
import com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BackgroundThreadStateHandler<T> {
    private final HandlerWrapper backgroundHandler;
    private T backgroundState;
    private final HandlerWrapper foregroundHandler;
    private T foregroundState;
    private final StateChangeListener<T> onStateChanged;
    private int pendingOperations;

    public interface StateChangeListener<T> {
        void onStateChanged(T t, T t2);
    }

    public BackgroundThreadStateHandler(T t, Looper looper, Looper looper2, Clock clock, StateChangeListener<T> stateChangeListener) {
        this.backgroundHandler = clock.createHandler(looper, null);
        this.foregroundHandler = clock.createHandler(looper2, null);
        this.foregroundState = t;
        this.backgroundState = t;
        this.onStateChanged = stateChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$setStateInBackground$2(Object obj) {
        if (this.pendingOperations == 0) {
            updateStateInForeground(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$updateStateAsync$0(Object obj) {
        int i = this.pendingOperations - 1;
        this.pendingOperations = i;
        if (i == 0) {
            updateStateInForeground(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateStateAsync$1(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        T t = (T) o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.apply(this.backgroundState);
        this.backgroundState = t;
        runInForeground(new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, t, 1));
    }

    private void runInForeground(Runnable runnable) {
        if (this.foregroundHandler.getLooper().getThread().isAlive()) {
            this.foregroundHandler.post(runnable);
        }
    }

    private void updateStateInForeground(T t) {
        T t2 = this.foregroundState;
        this.foregroundState = t;
        if (t2.equals(t)) {
            return;
        }
        this.onStateChanged.onStateChanged(t2, t);
    }

    public T get() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.foregroundHandler.getLooper()) {
            return this.foregroundState;
        }
        Assertions.checkState(looperMyLooper == this.backgroundHandler.getLooper());
        return this.backgroundState;
    }

    public void runInBackground(Runnable runnable) {
        if (this.backgroundHandler.getLooper().getThread().isAlive()) {
            this.backgroundHandler.post(runnable);
        }
    }

    public void setStateInBackground(T t) {
        this.backgroundState = t;
        runInForeground(new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, t, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateStateAsync(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2) {
        Assertions.checkState(Looper.myLooper() == this.foregroundHandler.getLooper());
        this.pendingOperations++;
        runInBackground(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2, 1));
        updateStateInForeground(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.apply(this.foregroundState));
    }
}
