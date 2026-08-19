package kotlinx.coroutines;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final ThreadLocal f4106O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ThreadLocal();

    public static O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        ThreadLocal threadLocal = f4106O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = (O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo) threadLocal.get();
        if (o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo != null) {
            return o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo;
        }
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Thread.currentThread());
        threadLocal.set(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        return o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }
}
