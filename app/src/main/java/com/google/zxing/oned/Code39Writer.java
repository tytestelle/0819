package com.google.zxing.oned;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class Code39Writer extends OneDimensionalCodeWriter {
    private static void toIntArray(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    private static String tryToConvertToExtendedMode(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 0) {
                sb.append("%U");
            } else if (cCharAt == ' ') {
                sb.append(cCharAt);
            } else if (cCharAt == '@') {
                sb.append("%V");
            } else if (cCharAt == '`') {
                sb.append("%W");
            } else if (cCharAt == '-' || cCharAt == '.') {
                sb.append(cCharAt);
            } else if (cCharAt <= 26) {
                sb.append('$');
                sb.append((char) (cCharAt + '@'));
            } else if (cCharAt < ' ') {
                sb.append('%');
                sb.append((char) (cCharAt + '&'));
            } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                sb.append('/');
                sb.append((char) (cCharAt + ' '));
            } else if (cCharAt <= '9') {
                sb.append(cCharAt);
            } else if (cCharAt <= '?') {
                sb.append('%');
                sb.append((char) (cCharAt + 11));
            } else if (cCharAt <= 'Z') {
                sb.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb.append('%');
                sb.append((char) (cCharAt - 16));
            } else if (cCharAt <= 'z') {
                sb.append('+');
                sb.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i) + "'");
                }
                sb.append('%');
                sb.append((char) (cCharAt - '+'));
            }
        }
        return sb.toString();
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(length, "Requested contents should be less than 80 digits long, but got "));
        }
        for (int i = 0; i < length; i++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                str = tryToConvertToExtendedMode(str);
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(length, "Requested contents should be less than 80 digits long, but got ", " (extended full ASCII mode)"));
            }
        }
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[(length * 13) + 25];
        toIntArray(148, iArr);
        int iAppendPattern = OneDimensionalCodeWriter.appendPattern(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iAppendPattern2 = OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, iArr2, false) + iAppendPattern;
        for (int i2 = 0; i2 < length; i2++) {
            toIntArray(Code39Reader.CHARACTER_ENCODINGS["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i2))], iArr);
            int iAppendPattern3 = OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, iArr, true) + iAppendPattern2;
            iAppendPattern2 = OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern3, iArr2, false) + iAppendPattern3;
        }
        toIntArray(148, iArr);
        OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, iArr, true);
        return zArr;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.CODE_39);
    }
}
