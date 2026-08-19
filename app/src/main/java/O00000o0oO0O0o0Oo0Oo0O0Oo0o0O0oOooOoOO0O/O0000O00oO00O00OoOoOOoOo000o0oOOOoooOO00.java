package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 extends MediaDataSource {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f634O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(ByteBuffer byteBuffer) {
        this.f634O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f634O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= this.f634O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.limit()) {
            return -1;
        }
        this.f634O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.position((int) j);
        int iMin = Math.min(i2, this.f634O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remaining());
        this.f634O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
