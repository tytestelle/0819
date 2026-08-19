package O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

import O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends InputStream {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final ArrayDeque f808O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O f809O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public IOException f810O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    static {
        char[] cArr = O00000OOoOOO00O00o0ooooooooO000ooooO0000.f826O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f808O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ArrayDeque(0);
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        this.f810O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        this.f809O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        ArrayDeque arrayDeque = f808O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f809O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f809O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f809O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f809O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f809O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.read();
        } catch (IOException e) {
            this.f810O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f809O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f809O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.skip(j);
        } catch (IOException e) {
            this.f810O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f809O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.read(bArr);
        } catch (IOException e) {
            this.f810O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f809O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.read(bArr, i, i2);
        } catch (IOException e) {
            this.f810O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = e;
            throw e;
        }
    }
}
