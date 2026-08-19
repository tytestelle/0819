package O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements Serializable {
    public final Throwable exception;

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Throwable exception) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(exception, "exception");
        this.exception = exception;
    }

    public boolean equals(Object obj) {
        return (obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) && kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.exception, ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj).exception);
    }

    public int hashCode() {
        return this.exception.hashCode();
    }

    public String toString() {
        return "Failure(" + this.exception + ')';
    }
}
