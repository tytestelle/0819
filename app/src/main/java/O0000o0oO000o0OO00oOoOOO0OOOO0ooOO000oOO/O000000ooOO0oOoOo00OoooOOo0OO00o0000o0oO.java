package O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO extends OutputStream {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final ResourceBundle f1657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ResourceBundle.getBundle("javax.servlet.LocalStrings");

    public void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) throws IOException {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((65280 & cCharAt) != 0) {
                throw new CharConversionException(MessageFormat.format(f1657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getString("err.not_iso8859_1"), Character.valueOf(cCharAt)));
            }
            write(cCharAt);
        }
    }
}
