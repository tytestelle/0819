package kotlinx.coroutines;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo implements kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo f4040O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, boolean z) {
        super(z);
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o((O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.get(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4063O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
        this.f4040O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.plus(this);
    }

    @Override // kotlinx.coroutines.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo
    public final String O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo
    public final void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f4040O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
    }

    @Override // kotlinx.coroutines.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo
    public final void O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(Object obj) {
        if (obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
            Throwable th = ((O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj).f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
    }

    @Override // kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo getContext() {
        return this.f4040O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // kotlinx.coroutines.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O
    public final kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo getCoroutineContext() {
        return this.f4040O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void resumeWith(Object obj) {
        Throwable thM4exceptionOrNullimpl = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m4exceptionOrNullimpl(obj);
        if (thM4exceptionOrNullimpl != null) {
            obj = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(thM4exceptionOrNullimpl, false);
        }
        Object objO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(obj);
        if (objO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 == O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4069O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            return;
        }
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
    }
}
