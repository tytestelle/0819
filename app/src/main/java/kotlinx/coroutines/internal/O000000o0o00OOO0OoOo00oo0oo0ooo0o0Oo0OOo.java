package kotlinx.coroutines.internal;

import kotlinx.coroutines.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import kotlinx.coroutines.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
import kotlinx.coroutines.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o implements Runnable, O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o f4120O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f4121O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f4122O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final Object f4123O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, int i) {
        this.f4120O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
        this.f4121O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
        if ((o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o instanceof O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o ? (O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o : null) == null) {
            int i2 = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.f4077O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        this.f4122O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        this.f4123O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new Object();
    }

    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        synchronized (this.f4123O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            if (this.runningWorkers >= this.f4121O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final void dispatch(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Runnable runnable) {
        this.f4122O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(runnable);
        if (this.runningWorkers < this.f4121O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO && O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
            this.f4120O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.dispatch(this, this);
        }
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final void dispatchYield(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Runnable runnable) {
        this.f4122O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(runnable);
        if (this.runningWorkers < this.f4121O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO && O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
            this.f4120O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.dispatchYield(this, this);
        }
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o limitedParallelism(int i) {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i);
        return i >= this.f4121O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO ? this : super.limitedParallelism(i);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            int i = 0;
            while (true) {
                Runnable runnable = (Runnable) this.f4122O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(kotlin.coroutines.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE, th);
                    }
                    i++;
                    if (i >= 16 && this.f4120O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isDispatchNeeded(this)) {
                        this.f4120O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.dispatch(this, this);
                        return;
                    }
                }
            }
            synchronized (this.f4123O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                this.runningWorkers--;
                if (this.f4122O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() == 0) {
                    return;
                } else {
                    this.runningWorkers++;
                }
            }
        }
    }
}
