package O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO;

/* JADX INFO: loaded from: classes2.dex */
public class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 extends Exception {
    private Throwable rootCause;

    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() {
    }

    public Throwable getRootCause() {
        return this.rootCause;
    }

    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(String str) {
        super(str);
    }

    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(String str, Throwable th) {
        super(str, th);
        this.rootCause = th;
    }

    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Throwable th) {
        super(th);
        this.rootCause = th;
    }
}
