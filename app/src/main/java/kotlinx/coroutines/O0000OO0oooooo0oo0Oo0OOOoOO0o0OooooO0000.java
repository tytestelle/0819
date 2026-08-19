package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 extends CancellationException {
    public final transient O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 job;

    public O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(String str, Throwable th, O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) {
        super(str);
        this.job = o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
        if (th != null) {
            initCause(th);
        }
    }

    public O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 createCopy() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000) {
                O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 = (O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000) obj;
                if (!kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.getMessage(), getMessage()) || !kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.job, this.job) || !kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(message);
        int iHashCode = (this.job.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.job;
    }
}
