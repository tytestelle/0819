package O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends ByteArrayOutputStream {
    public byte[] O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public byte[] O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() throws IOException {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        if (bArr.length == ((ByteArrayOutputStream) this).count) {
            return bArr;
        }
        throw new IOException("Size supplied is too small");
    }

    public void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        ((ByteArrayOutputStream) this).count = i;
    }

    public int getCount() {
        return ((ByteArrayOutputStream) this).count;
    }
}
