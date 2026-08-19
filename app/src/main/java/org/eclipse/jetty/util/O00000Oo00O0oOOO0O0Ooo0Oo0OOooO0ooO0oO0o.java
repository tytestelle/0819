package org.eclipse.jetty.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4475O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final Charset f4476O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final char[] f4477O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4475O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.class.getName());
        System.getProperty("line.separator", "\n");
        Charset.forName("UTF-8");
        f4476O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Charset.forName("ISO-8859-1");
        f4477O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new char[]{0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', '\r', 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, ' ', '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~', 127};
    }

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(StringBuilder sb, int i) {
        if (i < 100) {
            sb.append((char) ((i / 10) + 48));
            sb.append((char) ((i % 10) + 48));
        }
    }

    public static String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str) {
        int i;
        char[] cArr;
        char[] charArray;
        char c;
        int length = str.length();
        while (true) {
            i = length - 1;
            cArr = f4477O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (length <= 0) {
                charArray = null;
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127 && cCharAt != (c = cArr[cCharAt])) {
                charArray = str.toCharArray();
                charArray[i] = c;
                break;
            }
            length = i;
        }
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            char c2 = charArray[i2];
            if (c2 <= 127) {
                charArray[i2] = cArr[c2];
            }
            i = i2;
        }
        return charArray == null ? str : new String(charArray);
    }

    public static byte[] O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (Exception e) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4475O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
            return str.getBytes();
        }
    }

    public static String O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(String str, String str2, String str3) {
        int length = 0;
        int iIndexOf = str.indexOf(str2, 0);
        if (iIndexOf == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str3.length() + str.length());
        do {
            sb.append(str.substring(length, iIndexOf));
            sb.append(str3);
            length = str2.length() + iIndexOf;
            iIndexOf = str.indexOf(str2, length);
        } while (iIndexOf != -1);
        if (length < str.length()) {
            sb.append(str.substring(length, str.length()));
        }
        return sb.toString();
    }

    public static String O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str, byte[] bArr, int i, int i2) {
        try {
            return new String(bArr, i, i2, str);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
