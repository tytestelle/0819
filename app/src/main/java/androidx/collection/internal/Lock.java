package androidx.collection.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class Lock {
    public final <T> T synchronizedImpl(Function0<? extends T> block) {
        T tInvoke;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        synchronized (this) {
            tInvoke = block.invoke();
        }
        return tInvoke;
    }
}
