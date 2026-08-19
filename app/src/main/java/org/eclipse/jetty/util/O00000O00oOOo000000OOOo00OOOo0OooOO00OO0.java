package org.eclipse.jetty.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 extends StringTokenizer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final char[] f4467O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        char[] cArr = new char[32];
        f4467O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = cArr;
        Arrays.fill(cArr, (char) 65535);
        cArr[8] = 'b';
        cArr[9] = 't';
        cArr[10] = 'n';
        cArr[12] = 'f';
        cArr[13] = 'r';
    }

    public static String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "\"\"";
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\' || cCharAt == '\"' || cCharAt == '\'' || Character.isWhitespace(cCharAt) || ";= ".indexOf(cCharAt) >= 0) {
                StringBuffer stringBuffer = new StringBuffer(str.length() + 8);
                try {
                    stringBuffer.append('\"');
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 >= ' ') {
                            if (cCharAt2 == '\"' || cCharAt2 == '\\') {
                                stringBuffer.append('\\');
                            }
                            stringBuffer.append(cCharAt2);
                        } else {
                            char c = f4467O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[cCharAt2];
                            if (c == 65535) {
                                stringBuffer.append('\\').append('u').append('0').append('0');
                                if (cCharAt2 < 16) {
                                    stringBuffer.append('0');
                                }
                                stringBuffer.append((CharSequence) Integer.toString(cCharAt2, 16));
                            } else {
                                stringBuffer.append('\\').append(c);
                            }
                        }
                    }
                    stringBuffer.append('\"');
                    return stringBuffer.toString();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return str;
    }

    public static String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str) {
        char cCharAt;
        if (str == null) {
            return null;
        }
        if (str.length() < 2 || (cCharAt = str.charAt(0)) != str.charAt(str.length() - 1)) {
            return str;
        }
        if (cCharAt != '\"' && cCharAt != '\'') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() - 2);
        int i = 1;
        boolean z = false;
        while (i < str.length() - 1) {
            char cCharAt2 = str.charAt(i);
            if (z) {
                if (cCharAt2 == '\"') {
                    sb.append('\"');
                } else if (cCharAt2 == '/') {
                    sb.append('/');
                } else if (cCharAt2 == '\\') {
                    sb.append('\\');
                } else if (cCharAt2 == 'b') {
                    sb.append('\b');
                } else if (cCharAt2 == 'f') {
                    sb.append('\f');
                } else if (cCharAt2 == 'n') {
                    sb.append('\n');
                } else if (cCharAt2 == 'r') {
                    sb.append('\r');
                } else if (cCharAt2 == 't') {
                    sb.append('\t');
                } else if (cCharAt2 != 'u') {
                    sb.append(cCharAt2);
                } else {
                    int i2 = i + 3;
                    int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((byte) str.charAt(i)) << 24) + (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((byte) str.charAt(i + 1)) << 16) + (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((byte) str.charAt(i + 2)) << 8);
                    i += 4;
                    sb.append((char) (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((byte) str.charAt(i2)) + iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
                }
                z = false;
            } else if (cCharAt2 == '\\') {
                z = true;
            } else {
                sb.append(cCharAt2);
            }
            i++;
        }
        return sb.toString();
    }
}
