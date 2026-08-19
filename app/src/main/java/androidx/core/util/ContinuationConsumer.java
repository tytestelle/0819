package androidx.core.util;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
final class ContinuationConsumer<T> extends AtomicBoolean implements java.util.function.Consumer<T> {
    private final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 continuation;

    public ContinuationConsumer(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        super(false);
        this.continuation = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    @Override // java.util.function.Consumer
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
