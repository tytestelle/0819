package kotlin.coroutines;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Serializable {
    public static final O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 INSTANCE = new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public <R> R fold(R r, Function2<? super R, ? super O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, ? extends R> operation) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(operation, "operation");
        return r;
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public <E extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO> E get(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O key) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo minusKey(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O key) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        return this;
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo plus(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
