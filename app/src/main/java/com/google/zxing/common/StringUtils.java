package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final Charset EUC_JP;
    public static final String GB2312 = "GB2312";
    public static final Charset GB2312_CHARSET;
    private static final Charset PLATFORM_DEFAULT_ENCODING = Charset.defaultCharset();
    public static final String SHIFT_JIS = "SJIS";
    public static final Charset SHIFT_JIS_CHARSET;

    static {
        Charset charsetForName;
        Charset charsetForName2;
        Charset charsetForName3 = null;
        try {
            charsetForName = Charset.forName(SHIFT_JIS);
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        SHIFT_JIS_CHARSET = charsetForName;
        try {
            charsetForName2 = Charset.forName(GB2312);
        } catch (UnsupportedCharsetException unused2) {
            charsetForName2 = null;
        }
        GB2312_CHARSET = charsetForName2;
        try {
            charsetForName3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        EUC_JP = charsetForName3;
        Charset charset = SHIFT_JIS_CHARSET;
        ASSUME_SHIFT_JIS = (charset != null && charset.equals(PLATFORM_DEFAULT_ENCODING)) || (charsetForName3 != null && charsetForName3.equals(PLATFORM_DEFAULT_ENCODING));
    }

    private StringUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:87:0x00dd  */
    public static Charset guessCharset(byte[] bArr, Map<DecodeHintType, ?> map) {
        int i;
        byte b;
        byte[] bArr2 = bArr;
        if (map != null) {
            DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
            if (map.containsKey(decodeHintType)) {
                return Charset.forName(map.get(decodeHintType).toString());
            }
        }
        boolean z = true;
        int i2 = 0;
        if (bArr2.length > 2 && (((b = bArr2[0]) == -2 && bArr2[1] == -1) || (b == -1 && bArr2[1] == -2))) {
            return StandardCharsets.UTF_16;
        }
        int length = bArr2.length;
        boolean z2 = SHIFT_JIS_CHARSET != null;
        boolean z3 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        boolean z4 = z2;
        int i3 = 0;
        boolean z5 = true;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i4 < length && (z || z4 || z5)) {
            byte b2 = bArr2[i4];
            int i14 = b2 & 255;
            if (z5) {
                if (i5 <= 0) {
                    i = length;
                    if ((b2 & 128) != 0) {
                        if ((b2 & 64) != 0) {
                            int i15 = i5 + 1;
                            if ((b2 & 32) == 0) {
                                i7++;
                            } else {
                                i15 = i5 + 2;
                                if ((b2 & 16) == 0) {
                                    i8++;
                                } else {
                                    i5 += 3;
                                    if ((b2 & 8) == 0) {
                                        i9++;
                                    }
                                }
                            }
                            i5 = i15;
                        }
                    }
                } else if ((b2 & 128) == 0) {
                    i = length;
                } else {
                    i5--;
                    i = length;
                }
                z5 = false;
            } else {
                i = length;
            }
            if (z) {
                if (i14 > 127 && i14 < 160) {
                    z = false;
                } else if (i14 > 159 && (i14 < 192 || i14 == 215 || i14 == 247)) {
                    i11++;
                }
            }
            if (z4) {
                if (i6 > 0) {
                    if (i14 < 64 || i14 == 127 || i14 > 252) {
                        z4 = false;
                    } else {
                        i6--;
                    }
                } else if (i14 == 128 || i14 == 160 || i14 > 239) {
                    z4 = false;
                } else if (i14 <= 160 || i14 >= 224) {
                    if (i14 > 127) {
                        i6++;
                        int i16 = i12 + 1;
                        if (i16 > i2) {
                            i2 = i16;
                            i12 = i2;
                        } else {
                            i12 = i16;
                        }
                    } else {
                        i12 = 0;
                    }
                    i13 = 0;
                } else {
                    i3++;
                    int i17 = i13 + 1;
                    if (i17 > i10) {
                        i10 = i17;
                        i13 = i10;
                    } else {
                        i13 = i17;
                    }
                    i12 = 0;
                }
            }
            i4++;
            bArr2 = bArr;
            length = i;
        }
        int i18 = length;
        if (z5 && i5 > 0) {
            z5 = false;
        }
        if (z4 && i6 > 0) {
            z4 = false;
        }
        if (z5 && (z3 || i7 + i8 + i9 > 0)) {
            return StandardCharsets.UTF_8;
        }
        if (z4 && (ASSUME_SHIFT_JIS || i10 >= 3 || i2 >= 3)) {
            return SHIFT_JIS_CHARSET;
        }
        if (z && z4) {
            return (!(i10 == 2 && i3 == 2) && i11 * 10 < i18) ? StandardCharsets.ISO_8859_1 : SHIFT_JIS_CHARSET;
        }
        if (z) {
            return StandardCharsets.ISO_8859_1;
        }
        if (z4) {
            return SHIFT_JIS_CHARSET;
        }
        return z5 ? StandardCharsets.UTF_8 : PLATFORM_DEFAULT_ENCODING;
    }

    public static String guessEncoding(byte[] bArr, Map<DecodeHintType, ?> map) {
        Charset charsetGuessCharset = guessCharset(bArr, map);
        if (charsetGuessCharset.equals(SHIFT_JIS_CHARSET)) {
            return SHIFT_JIS;
        }
        if (charsetGuessCharset.equals(StandardCharsets.UTF_8)) {
            return "UTF8";
        }
        return charsetGuessCharset.equals(StandardCharsets.ISO_8859_1) ? "ISO8859_1" : charsetGuessCharset.name();
    }
}
