package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO extends CancellationException {
    public final transient O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 coroutine;

    public O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO(String str, O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) {
        super(str);
        this.coroutine = o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
    }

    public O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO = new O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO(message, this.coroutine);
        o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.initCause(this);
        return o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
    }

    public O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO(String str) {
        this(str, null);
    }
}
