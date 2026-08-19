package O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o;

import java.io.FilterInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends FilterInputStream {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f1995O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, InputStream inputStream) {
        super(inputStream);
        this.f1995O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterInputStream) this).in = org.eclipse.jetty.util.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4465O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }
}
