package kotlinx.coroutines;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 extends RuntimeException {
    private final kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context;

    public O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        this.context = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.context.toString();
    }
}
