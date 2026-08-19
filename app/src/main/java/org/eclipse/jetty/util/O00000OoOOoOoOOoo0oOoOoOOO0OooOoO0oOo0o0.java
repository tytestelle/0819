package org.eclipse.jetty.util;

import java.io.UnsupportedEncodingException;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 implements Cloneable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final String f4479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = System.getProperty("org.eclipse.jetty.util.URI.charset", "UTF-8");

    public static String O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(String str, String str2) {
        if (str == null || str.length() == 0) {
            return (str == null || str2 != null) ? str2 : str;
        }
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(63);
        }
        if (iIndexOf == 0) {
            return str2.concat(str);
        }
        if (iIndexOf < 0) {
            iIndexOf = str.length();
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 2);
        sb.append(str);
        int i = iIndexOf - 1;
        if (sb.charAt(i) == '/') {
            if (str2.startsWith(ServiceReference.DELIMITER)) {
                sb.deleteCharAt(i);
                sb.insert(i, str2);
            } else {
                sb.insert(iIndexOf, str2);
            }
        } else if (str2.startsWith(ServiceReference.DELIMITER)) {
            sb.insert(iIndexOf, str2);
        } else {
            sb.insert(iIndexOf, '/');
            sb.insert(iIndexOf + 1, str2);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0136  */
    /* JADX WARN: Code duplicated, block: B:116:0x0139  */
    /* JADX WARN: Code duplicated, block: B:119:0x013f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072 A[PHI: r8 r10
  0x0072: PHI (r8v5 int) = (r8v2 int), (r8v7 int), (r8v8 int) binds: [B:76:0x00da, B:37:0x0070, B:62:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x0072: PHI (r10v17 int) = (r10v11 int), (r10v21 int), (r10v24 int) binds: [B:76:0x00da, B:37:0x0070, B:62:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    public static String O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(String str) {
        int i;
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        int iLastIndexOf = str.lastIndexOf(47, length);
        while (length > 0) {
            int i2 = length - iLastIndexOf;
            if (i2 == 2) {
                if (str.charAt(iLastIndexOf + 1) == '.') {
                    break;
                }
                int i3 = iLastIndexOf;
                iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
                length = i3;
            } else {
                if (i2 == 3 && str.charAt(iLastIndexOf + 1) == '.' && str.charAt(iLastIndexOf + 2) == '.') {
                    break;
                }
                int i4 = iLastIndexOf;
                iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
                length = i4;
            }
        }
        if (iLastIndexOf >= length) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (length > 0) {
            int i8 = length - iLastIndexOf;
            if (i8 == 2) {
                int i9 = iLastIndexOf + 1;
                if (sb.charAt(i9) == '.') {
                    if (iLastIndexOf >= 0 || sb.length() <= 2 || sb.charAt(1) != '/' || sb.charAt(2) != '/') {
                        if (i6 < 0) {
                            i6 = length;
                        }
                        if (iLastIndexOf < 0 || (iLastIndexOf == 0 && sb.charAt(iLastIndexOf) == '/')) {
                            if (i6 < sb.length() && sb.charAt(i6) == '/') {
                                i6++;
                            }
                            i7 = i9;
                        } else {
                            i7 = length == sb.length() ? i9 : iLastIndexOf;
                            i = iLastIndexOf - 1;
                            while (i >= 0 && sb.charAt(i) != '/') {
                                i--;
                            }
                        }
                    }
                    int i10 = iLastIndexOf;
                    iLastIndexOf = i;
                    length = i10;
                } else if (i5 > 0 && (i5 = i5 - 1) == 0) {
                    i7 = iLastIndexOf >= 0 ? iLastIndexOf : 0;
                    if (i7 > 0 && i6 == sb.length() && sb.charAt(i6 - 1) == '.') {
                        i7++;
                    }
                }
                if (i5 <= 0) {
                    sb.delete(i7, i6);
                    if (i5 > 0) {
                        i6 = length;
                    } else {
                        i6 = -1;
                    }
                    i7 = -1;
                }
                i = iLastIndexOf - 1;
                while (i >= 0) {
                    i--;
                }
                int i11 = iLastIndexOf;
                iLastIndexOf = i;
                length = i11;
            } else if (i8 != 3) {
                if (i5 > 0 && (i5 = i5 - 1) == 0) {
                    i7 = iLastIndexOf >= 0 ? iLastIndexOf : 0;
                    if (i6 == sb.length() && sb.charAt(i6 - 1) == '.') {
                        i7++;
                    }
                }
                if (i5 <= 0 && i7 >= 0 && i6 >= i7) {
                    sb.delete(i7, i6);
                    if (i5 > 0) {
                        i6 = length;
                    } else {
                        i6 = -1;
                    }
                    i7 = -1;
                }
                i = iLastIndexOf - 1;
                while (i >= 0 && sb.charAt(i) != '/') {
                    i--;
                }
                int i12 = iLastIndexOf;
                iLastIndexOf = i;
                length = i12;
            } else if (sb.charAt(iLastIndexOf + 1) == '.' && sb.charAt(iLastIndexOf + 2) == '.') {
                if (i6 < 0) {
                    i6 = length;
                }
                i5++;
                int i13 = iLastIndexOf - 1;
                while (i13 >= 0 && sb.charAt(i13) != '/') {
                    i13--;
                }
                i7 = iLastIndexOf;
                iLastIndexOf = i13;
                length = i7;
            } else {
                if (i5 > 0 && (i5 = i5 - 1) == 0) {
                    i7 = iLastIndexOf >= 0 ? iLastIndexOf : 0;
                    if (i7 > 0 && i6 == sb.length() && sb.charAt(i6 - 1) == '.') {
                        i7++;
                    }
                }
                if (i5 <= 0) {
                    sb.delete(i7, i6);
                    if (i5 > 0) {
                        i6 = length;
                    } else {
                        i6 = -1;
                    }
                    i7 = -1;
                }
                i = iLastIndexOf - 1;
                while (i >= 0) {
                    i--;
                }
                int i14 = iLastIndexOf;
                iLastIndexOf = i;
                length = i14;
            }
        }
        if (i5 > 0) {
            return null;
        }
        if (i6 >= 0) {
            sb.delete(i7, i6);
        }
        return sb.toString();
    }

    public static String O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(String str) {
        String str2;
        String str3;
        String str4;
        int i;
        char[] cArr = null;
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = null;
        int length2 = 0;
        int i2 = 0;
        int length3 = 0;
        while (true) {
            str2 = f4479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (length2 < length) {
                char cCharAt = str.charAt(length2);
                if (cCharAt == '%' && (i = length2 + 2) < length) {
                    if (cArr == null) {
                        cArr = new char[length];
                        bArr = new byte[length];
                        str.getChars(0, length2, cArr, 0);
                    }
                    bArr[i2] = (byte) (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(length2 + 1, 2, str) & 255);
                    i2++;
                    length2 = i;
                } else if (cCharAt == ';') {
                    if (cArr == null) {
                        cArr = new char[length];
                        str.getChars(0, length2, cArr, 0);
                        break;
                    }
                } else if (bArr == null) {
                    length3++;
                } else {
                    if (i2 > 0) {
                        try {
                            str4 = new String(bArr, 0, i2, str2);
                        } catch (UnsupportedEncodingException unused) {
                            str4 = new String(bArr, 0, i2);
                        }
                        str4.getChars(0, str4.length(), cArr, length3);
                        length3 += str4.length();
                        i2 = 0;
                    }
                    cArr[length3] = cCharAt;
                    length3++;
                }
                length2++;
            }
            length2 = length3;
            break;
        }
        if (cArr == null) {
            return str;
        }
        if (i2 > 0) {
            try {
                str3 = new String(bArr, 0, i2, str2);
            } catch (UnsupportedEncodingException unused2) {
                str3 = new String(bArr, 0, i2);
            }
            str3.getChars(0, str3.length(), cArr, length2);
            length2 += str3.length();
        }
        return new String(cArr, 0, length2);
    }

    public static String O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(String str) {
        StringBuilder sb;
        byte[] bytes;
        StringBuilder sb2;
        if (str == null || str.length() == 0) {
            return str;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            sb = null;
            if (i2 >= str.length()) {
                bytes = null;
                sb2 = null;
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == ' ' || cCharAt == '%' || cCharAt == '\'' || cCharAt == '\"' || cCharAt == '#' || cCharAt == ';' || cCharAt == '<' || cCharAt == '>' || cCharAt == '?') {
                sb2 = new StringBuilder(str.length() * 2);
                bytes = null;
                break;
            }
            if (cCharAt > 127) {
                try {
                    bytes = str.getBytes(f4479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    sb2 = new StringBuilder(str.length() * 2);
                    break;
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalStateException(e);
                }
            }
            i2++;
        }
        if (sb2 != null) {
            synchronized (sb2) {
                try {
                    if (bytes != null) {
                        while (i < bytes.length) {
                            byte b = bytes[i];
                            if (b == 32) {
                                sb2.append("%20");
                            } else if (b == 37) {
                                sb2.append("%25");
                            } else if (b == 39) {
                                sb2.append("%27");
                            } else if (b == 34) {
                                sb2.append("%22");
                            } else if (b == 35) {
                                sb2.append("%23");
                            } else if (b == 59) {
                                sb2.append("%3B");
                            } else if (b == 60) {
                                sb2.append("%3C");
                            } else if (b == 62) {
                                sb2.append("%3E");
                            } else if (b == 63) {
                                sb2.append("%3F");
                            } else if (b < 0) {
                                sb2.append('%');
                                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(b, sb2);
                            } else {
                                sb2.append((char) b);
                            }
                            i++;
                        }
                    } else {
                        while (i < str.length()) {
                            char cCharAt2 = str.charAt(i);
                            if (cCharAt2 == ' ') {
                                sb2.append("%20");
                            } else if (cCharAt2 == '%') {
                                sb2.append("%25");
                            } else if (cCharAt2 == '\'') {
                                sb2.append("%27");
                            } else if (cCharAt2 == '\"') {
                                sb2.append("%22");
                            } else if (cCharAt2 == '#') {
                                sb2.append("%23");
                            } else if (cCharAt2 == ';') {
                                sb2.append("%3B");
                            } else if (cCharAt2 == '<') {
                                sb2.append("%3C");
                            } else if (cCharAt2 == '>') {
                                sb2.append("%3E");
                            } else if (cCharAt2 != '?') {
                                sb2.append(cCharAt2);
                            } else {
                                sb2.append("%3F");
                            }
                            i++;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            sb = sb2;
        }
        return sb == null ? str : sb.toString();
    }
}
