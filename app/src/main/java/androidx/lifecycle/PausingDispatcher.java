package androidx.lifecycle;

import kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import kotlinx.coroutines.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
import kotlinx.coroutines.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class PausingDispatcher extends O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public void dispatch(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context, Runnable block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(context, "context");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public boolean isDispatchNeeded(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(context, "context");
        kotlinx.coroutines.scheduling.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f4080O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4136O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1688O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
