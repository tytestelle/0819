package com.google.zxing.oned;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class Code93Writer extends OneDimensionalCodeWriter {
    @Deprecated
    public static int appendPattern(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
        return 9;
    }

    private static int computeChecksumIndex(String str, int i) {
        int iIndexOf = 0;
        int i2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i2;
            i2++;
            if (i2 > i) {
                i2 = 1;
            }
        }
        return iIndexOf % 47;
    }

    public static String convertToExtended(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 0) {
                sb.append("bU");
            } else if (cCharAt <= 26) {
                sb.append('a');
                sb.append((char) (cCharAt + '@'));
            } else if (cCharAt <= 31) {
                sb.append('b');
                sb.append((char) (cCharAt + '&'));
            } else if (cCharAt == ' ' || cCharAt == '$' || cCharAt == '%' || cCharAt == '+') {
                sb.append(cCharAt);
            } else if (cCharAt <= ',') {
                sb.append('c');
                sb.append((char) (cCharAt + ' '));
            } else if (cCharAt <= '9') {
                sb.append(cCharAt);
            } else if (cCharAt == ':') {
                sb.append("cZ");
            } else if (cCharAt <= '?') {
                sb.append('b');
                sb.append((char) (cCharAt + 11));
            } else if (cCharAt == '@') {
                sb.append("bV");
            } else if (cCharAt <= 'Z') {
                sb.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb.append('b');
                sb.append((char) (cCharAt - 16));
            } else if (cCharAt == '`') {
                sb.append("bW");
            } else if (cCharAt <= 'z') {
                sb.append('d');
                sb.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + cCharAt + "'");
                }
                sb.append('b');
                sb.append((char) (cCharAt - '+'));
            }
        }
        return sb.toString();
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        String strConvertToExtended = convertToExtended(str);
        int length = strConvertToExtended.length();
        if (length > 80) {
            throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(length, "Requested contents should be less than 80 digits long after converting to extended encoding, but got "));
        }
        boolean[] zArr = new boolean[((strConvertToExtended.length() + 4) * 9) + 1];
        int iAppendPattern = appendPattern(zArr, 0, Code93Reader.ASTERISK_ENCODING);
        for (int i = 0; i < length; i++) {
            iAppendPattern += appendPattern(zArr, iAppendPattern, Code93Reader.CHARACTER_ENCODINGS["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(strConvertToExtended.charAt(i))]);
        }
        int iComputeChecksumIndex = computeChecksumIndex(strConvertToExtended, 20);
        int[] iArr = Code93Reader.CHARACTER_ENCODINGS;
        int iAppendPattern2 = iAppendPattern + appendPattern(zArr, iAppendPattern, iArr[iComputeChecksumIndex]);
        StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(strConvertToExtended);
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iComputeChecksumIndex));
        int iAppendPattern3 = iAppendPattern2 + appendPattern(zArr, iAppendPattern2, iArr[computeChecksumIndex(sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString(), 15)]);
        zArr[iAppendPattern3 + appendPattern(zArr, iAppendPattern3, Code93Reader.ASTERISK_ENCODING)] = true;
        return zArr;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.CODE_93);
    }

    private static int appendPattern(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            int i4 = i + i3;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i4] = z;
        }
        return 9;
    }
}
