package O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends IOException {
    public static final int UNKNOWN = -1;
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i) {
        this("Http request failed", i);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    @Deprecated
    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str) {
        this(str, -1);
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str, int i) {
        this(str, i, null);
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str, int i, @Nullable Throwable th) {
        super(str + ", status code: " + i, th);
        this.statusCode = i;
    }
}
