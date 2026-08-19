package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import kotlin.coroutines.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlinx.coroutines.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
import kotlinx.coroutines.O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0;
import kotlinx.coroutines.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(lifecycle, "<this>");
        while (true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = new O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0(null);
            kotlinx.coroutines.scheduling.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f4080O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o context = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4136O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1688O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(context, "context");
            if (context != O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE) {
                o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) context.fold(o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.INSTANCE);
            }
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(lifecycle, o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0);
            AtomicReference<Object> internalScopeRef = lifecycle.getInternalScopeRef();
            do {
                if (internalScopeRef.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                    lifecycleCoroutineScopeImpl2.register();
                    return lifecycleCoroutineScopeImpl2;
                }
            } while (internalScopeRef.get() == null);
        }
    }
}
