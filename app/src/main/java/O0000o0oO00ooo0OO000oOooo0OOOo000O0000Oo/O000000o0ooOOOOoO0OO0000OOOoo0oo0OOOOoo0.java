package O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo;

import O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import java.text.MessageFormat;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final ResourceBundle f1660O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f1661O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f1661O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ResourceBundle resourceBundle = f1660O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (bArr == null) {
            throw new NullPointerException(resourceBundle.getString("err.io.nullArray"));
        }
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException(MessageFormat.format(resourceBundle.getString("err.io.indexOutOfBounds"), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
        }
        this.f1661O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO += i2;
    }
}
