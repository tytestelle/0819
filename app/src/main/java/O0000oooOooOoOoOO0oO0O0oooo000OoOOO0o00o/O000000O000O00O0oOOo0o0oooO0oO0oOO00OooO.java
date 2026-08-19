package O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends PrintWriter {
    @Override // java.io.PrintWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (((PrintWriter) this).lock) {
            try {
                ((PrintWriter) this).out.close();
            } catch (IOException unused) {
                setError();
            }
        }
    }
}
