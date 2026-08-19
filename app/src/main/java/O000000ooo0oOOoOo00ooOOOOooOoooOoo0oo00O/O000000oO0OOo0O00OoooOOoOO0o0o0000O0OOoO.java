package O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f128O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, int i) {
        super(i);
        this.f128O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            this.f128O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
            return new String(bArr, 0, i, O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f133O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
