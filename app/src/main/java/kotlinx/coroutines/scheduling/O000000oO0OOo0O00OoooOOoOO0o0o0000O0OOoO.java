package kotlinx.coroutines.scheduling;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f4168O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    static {
        int i = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4176O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i2 = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4177O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        long j = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4178O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f4170O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i, i2, j);
        f4168O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final String toString() {
        return "Dispatchers.Default";
    }
}
