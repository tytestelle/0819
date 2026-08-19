package O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O;

import kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import kotlin.coroutines.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 extends O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        super(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null && o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getContext() != O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo getContext() {
        return O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE;
    }
}
