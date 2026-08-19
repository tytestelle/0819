package O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends FilterInputStream {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final long f806O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f807O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(InputStream inputStream, long j) {
        super(inputStream);
        this.f806O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = j;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) throws IOException {
        if (i >= 0) {
            this.f807O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO += i;
            return;
        }
        long j = this.f807O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        long j2 = this.f806O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (j2 - j <= 0) {
            return;
        }
        StringBuilder sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(j2, "Failed to read all expected data, expected: ", ", but read: ");
        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(this.f807O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        throw new IOException(sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f806O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO - ((long) this.f807O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i3);
        return i3;
    }
}
