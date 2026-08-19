package androidx.core.util;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

/* JADX INFO: loaded from: classes.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 continuation;

    public ContinuationRunnable(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        super(false);
        this.continuation = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
