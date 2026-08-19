package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 extends O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4170O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final void dispatch(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Runnable runnable) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f4170O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, runnable, false, 6);
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final void dispatchYield(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Runnable runnable) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f4170O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, runnable, true, 2);
    }
}
