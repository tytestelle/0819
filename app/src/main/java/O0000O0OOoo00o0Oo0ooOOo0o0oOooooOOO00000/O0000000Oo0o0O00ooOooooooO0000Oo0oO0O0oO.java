package O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends InputStream {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ByteBuffer f799O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f800O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = -1;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ByteBuffer byteBuffer) {
        this.f799O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f799O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f800O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f799O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f799O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.f800O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f799O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.f799O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j, byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f799O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
