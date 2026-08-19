package O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo extends FilterInputStream {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f821O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        super(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        this.f821O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Integer.MIN_VALUE;
    }

    public final long O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(long j) {
        int i = this.f821O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(long j) {
        int i = this.f821O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f821O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f821O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f821O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(1L) == -1) {
            return -1;
        }
        int i = super.read();
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f821O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(j);
        if (jO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == -1) {
            return 0L;
        }
        long jSkip = super.skip(jO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (int) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i2);
        if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i3);
        return i3;
    }
}
