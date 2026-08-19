package androidx.collection.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class LockExtKt {
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <T> T m36synchronized(Lock lock, Function0<? extends T> block) {
        T tInvoke;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(lock, "<this>");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        synchronized (lock) {
            tInvoke = block.invoke();
        }
        return tInvoke;
    }
}
