package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import androidx.core.app.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class OutcomeReceiverKt {
    @RequiresApi(31)
    public static final <R, E extends Throwable> OutcomeReceiver<R, E> asOutcomeReceiver(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(new ContinuationOutcomeReceiver(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000));
    }
}
