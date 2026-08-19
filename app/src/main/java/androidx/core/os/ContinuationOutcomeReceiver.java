package androidx.core.os;

import O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    private final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 continuation;

    public ContinuationOutcomeReceiver(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        super(false);
        this.continuation = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(E e) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(e)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(r));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
