package O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O;

import kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    private final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo _context;
    private transient kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 intercepted;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        super(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        this._context = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
    }

    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo getContext() {
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = this._context;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        return o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
    }

    public final kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 intercepted() {
        kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000InterceptContinuation = this.intercepted;
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000InterceptContinuation == null) {
            kotlin.coroutines.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (kotlin.coroutines.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) getContext().get(kotlin.coroutines.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null || (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000InterceptContinuation = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.interceptContinuation(this)) == null) {
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000InterceptContinuation = this;
            }
            this.intercepted = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000InterceptContinuation;
        }
        return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000InterceptContinuation;
    }

    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public void releaseIntercepted() {
        kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.intercepted;
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null && o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != this) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = getContext().get(kotlin.coroutines.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
            ((kotlin.coroutines.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO).releaseInterceptedContinuation(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
        this.intercepted = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1666O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null ? o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getContext() : null);
    }
}
