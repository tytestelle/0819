package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import kotlinx.coroutines.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 implements Executor {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f4166O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o f4167O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    static {
        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f4182O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i = kotlinx.coroutines.internal.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4139O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (64 >= i) {
            i = 64;
        }
        f4167O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.limitedParallelism(kotlinx.coroutines.internal.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("kotlinx.coroutines.io.parallelism", i, 0, 0, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final void dispatch(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Runnable runnable) {
        f4167O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.dispatch(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, runnable);
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final void dispatchYield(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Runnable runnable) {
        f4167O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.dispatchYield(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(kotlin.coroutines.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE, runnable);
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o limitedParallelism(int i) {
        return O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f4182O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.limitedParallelism(i);
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final String toString() {
        return "Dispatchers.IO";
    }
}
