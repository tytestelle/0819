package androidx.core.util;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

/* JADX INFO: loaded from: classes.dex */
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {
    private final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 continuation;

    public AndroidXContinuationConsumer(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        super(false);
        this.continuation = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    @Override // androidx.core.util.Consumer
    public void accept(T t) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(t));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
