package fi.iki.elonen;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo extends FilterOutputStream {
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() throws IOException {
        ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return;
        }
        ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i2)).getBytes());
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        ((FilterOutputStream) this).out.write("\r\n".getBytes());
    }
}
