package kotlinx.coroutines;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO extends kotlinx.coroutines.internal.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public ThreadLocal f4108O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    @Override // kotlinx.coroutines.internal.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, kotlinx.coroutines.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        ThreadLocal threadLocal = this.f4108O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) threadLocal.get();
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
            kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.component1(), o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.component2());
            threadLocal.set(null);
        }
        Object objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj);
        kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f4138O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getContext();
        Object objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(context, null);
        O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OOO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.f4140O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO ? O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, context, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) : null;
        try {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.resumeWith(objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        } finally {
            if (o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OOO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == null || o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OOO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o()) {
                kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            }
        }
    }

    public final boolean O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o() {
        ThreadLocal threadLocal = this.f4108O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (threadLocal.get() == null) {
            return false;
        }
        threadLocal.set(null);
        return true;
    }
}
