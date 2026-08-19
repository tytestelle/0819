package com.google.zxing.qrcode.decoder;

import androidx.media3.extractor.ts.PsExtractor;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class DecodedBitStreamParser {
    private static final char[] ALPHANUMERIC_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    private static final int GB2312_SUBSET = 1;

    /* JADX INFO: renamed from: com.google.zxing.qrcode.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$decoder$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$qrcode$decoder$Mode = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private DecodedBitStreamParser() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0108  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x010f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:50:0x0116  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:54:0x0125  */
    /* JADX WARN: Code duplicated, block: B:56:0x0128  */
    /* JADX WARN: Code duplicated, block: B:57:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x013b A[LOOP:0: B:63:0x0021->B:60:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0100 A[SYNTHETIC] */
    public static DecoderResult decode(byte[] bArr, Version version, ErrorCorrectionLevel errorCorrectionLevel, Map<DecodeHintType, ?> map) throws FormatException {
        int i;
        ArrayList arrayList;
        String string;
        BitSource bitSource = new BitSource(bArr);
        StringBuilder sb = new StringBuilder(50);
        int i2 = 1;
        ArrayList arrayList2 = new ArrayList(1);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = -1;
        int bits = -1;
        CharacterSetECI characterSetECIByValue = null;
        while (true) {
            try {
                Mode modeForBits = bitSource.available() < 4 ? Mode.TERMINATOR : Mode.forBits(bitSource.readBits(4));
                int[] iArr = AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode;
                switch (iArr[modeForBits.ordinal()]) {
                    case 5:
                        modeForBits = modeForBits;
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z2) {
                                    i = 4;
                                } else if (z3) {
                                    i = 6;
                                } else {
                                    i = 2;
                                }
                            } else if (z2) {
                                i = 3;
                            } else if (z3) {
                                i = 5;
                            } else {
                                i = 1;
                            }
                            String string2 = sb.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr, string2, arrayList, string, i3, bits, i);
                        }
                        i2 = 1;
                        break;
                    case 6:
                        modeForBits = modeForBits;
                        z = true;
                        z2 = true;
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z2) {
                                    i = 4;
                                } else if (z3) {
                                    i = 6;
                                } else {
                                    i = 2;
                                }
                            } else if (z2) {
                                i = 3;
                            } else if (z3) {
                                i = 5;
                            } else {
                                i = 1;
                            }
                            String string3 = sb.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr, string3, arrayList, string, i3, bits, i);
                        }
                        i2 = 1;
                        break;
                    case 7:
                        modeForBits = modeForBits;
                        z = true;
                        z3 = true;
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z2) {
                                    i = 4;
                                } else if (z3) {
                                    i = 6;
                                } else {
                                    i = 2;
                                }
                            } else if (z2) {
                                i = 3;
                            } else if (z3) {
                                i = 5;
                            } else {
                                i = 1;
                            }
                            String string4 = sb.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr, string4, arrayList, string, i3, bits, i);
                        }
                        i2 = 1;
                        break;
                    case 8:
                        modeForBits = modeForBits;
                        if (bitSource.available() < 16) {
                            throw FormatException.getFormatInstance();
                        }
                        int bits2 = bitSource.readBits(8);
                        bits = bitSource.readBits(8);
                        i3 = bits2;
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z2) {
                                    i = 4;
                                } else if (z3) {
                                    i = 6;
                                } else {
                                    i = 2;
                                }
                            } else if (z2) {
                                i = 3;
                            } else if (z3) {
                                i = 5;
                            } else {
                                i = 1;
                            }
                            String string5 = sb.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr, string5, arrayList, string, i3, bits, i);
                        }
                        i2 = 1;
                        break;
                        break;
                    case 9:
                        modeForBits = modeForBits;
                        characterSetECIByValue = CharacterSetECI.getCharacterSetECIByValue(parseECIValue(bitSource));
                        if (characterSetECIByValue == null) {
                            throw FormatException.getFormatInstance();
                        }
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z2) {
                                    i = 4;
                                } else if (z3) {
                                    i = 6;
                                } else {
                                    i = 2;
                                }
                            } else if (z2) {
                                i = 3;
                            } else if (z3) {
                                i = 5;
                            } else {
                                i = 1;
                            }
                            String string6 = sb.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr, string6, arrayList, string, i3, bits, i);
                        }
                        i2 = 1;
                        break;
                        break;
                    case 10:
                        modeForBits = modeForBits;
                        int bits3 = bitSource.readBits(4);
                        int bits4 = bitSource.readBits(modeForBits.getCharacterCountBits(version));
                        if (bits3 == 1) {
                            decodeHanziSegment(bitSource, sb, bits4);
                        }
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z2) {
                                    i = 4;
                                } else if (z3) {
                                    i = 6;
                                } else {
                                    i = 2;
                                }
                            } else if (z2) {
                                i = 3;
                            } else if (z3) {
                                i = 5;
                            } else {
                                i = 1;
                            }
                            String string7 = sb.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr, string7, arrayList, string, i3, bits, i);
                        }
                        i2 = 1;
                        break;
                    default:
                        int bits5 = bitSource.readBits(modeForBits.getCharacterCountBits(version));
                        int i4 = iArr[modeForBits.ordinal()];
                        if (i4 == i2) {
                            decodeNumericSegment(bitSource, sb, bits5);
                        } else if (i4 == 2) {
                            decodeAlphanumericSegment(bitSource, sb, bits5, z);
                        } else if (i4 == 3) {
                            decodeByteSegment(bitSource, sb, bits5, characterSetECIByValue, arrayList2, map);
                        } else {
                            if (i4 != 4) {
                                throw FormatException.getFormatInstance();
                            }
                            decodeKanjiSegment(bitSource, sb, bits5);
                            modeForBits = modeForBits;
                            if (modeForBits == Mode.TERMINATOR) {
                                if (characterSetECIByValue != null) {
                                    if (z2) {
                                        i = 4;
                                    } else if (z3) {
                                        i = 6;
                                    } else {
                                        i = 2;
                                    }
                                } else if (z2) {
                                    i = 3;
                                } else if (z3) {
                                    i = 5;
                                } else {
                                    i = 1;
                                }
                                String string8 = sb.toString();
                                if (arrayList2.isEmpty()) {
                                    arrayList = null;
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (errorCorrectionLevel == null) {
                                    string = null;
                                } else {
                                    string = errorCorrectionLevel.toString();
                                }
                                return new DecoderResult(bArr, string8, arrayList, string, i3, bits, i);
                            }
                            i2 = 1;
                        }
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z2) {
                                    i = 4;
                                } else if (z3) {
                                    i = 6;
                                } else {
                                    i = 2;
                                }
                            } else if (z2) {
                                i = 3;
                            } else if (z3) {
                                i = 5;
                            } else {
                                i = 1;
                            }
                            String string9 = sb.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr, string9, arrayList, string, i3, bits, i);
                        }
                        i2 = 1;
                        break;
                }
            } catch (IllegalArgumentException unused) {
                throw FormatException.getFormatInstance();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    private static void decodeAlphanumericSegment(BitSource bitSource, StringBuilder sb, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (bitSource.available() < 11) {
                throw FormatException.getFormatInstance();
            }
            int bits = bitSource.readBits(11);
            sb.append(toAlphaNumericChar(bits / 45));
            sb.append(toAlphaNumericChar(bits % 45));
            i -= 2;
        }
        if (i == 1) {
            if (bitSource.available() < 6) {
                throw FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(bitSource.readBits(6)));
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        } else {
                            sb.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }

    private static void decodeByteSegment(BitSource bitSource, StringBuilder sb, int i, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
        if (i * 8 > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) bitSource.readBits(8);
        }
        sb.append(new String(bArr, characterSetECI == null ? StringUtils.guessCharset(bArr, map) : characterSetECI.getCharset()));
        collection.add(bArr);
    }

    private static void decodeHanziSegment(BitSource bitSource, StringBuilder sb, int i) throws FormatException {
        if (StringUtils.GB2312_CHARSET == null) {
            throw FormatException.getFormatInstance();
        }
        if (i * 13 > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int bits = bitSource.readBits(13);
            int i3 = (bits % 96) | ((bits / 96) << 8);
            int i4 = i3 + (i3 < 2560 ? 41377 : 42657);
            bArr[i2] = (byte) ((i4 >> 8) & 255);
            bArr[i2 + 1] = (byte) (i4 & 255);
            i2 += 2;
            i--;
        }
        sb.append(new String(bArr, StringUtils.GB2312_CHARSET));
    }

    private static void decodeKanjiSegment(BitSource bitSource, StringBuilder sb, int i) throws FormatException {
        if (StringUtils.SHIFT_JIS_CHARSET == null) {
            throw FormatException.getFormatInstance();
        }
        if (i * 13 > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int bits = bitSource.readBits(13);
            int i3 = (bits % PsExtractor.AUDIO_STREAM) | ((bits / PsExtractor.AUDIO_STREAM) << 8);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        sb.append(new String(bArr, StringUtils.SHIFT_JIS_CHARSET));
    }

    private static void decodeNumericSegment(BitSource bitSource, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (bitSource.available() < 10) {
                throw FormatException.getFormatInstance();
            }
            int bits = bitSource.readBits(10);
            if (bits >= 1000) {
                throw FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(bits / 100));
            sb.append(toAlphaNumericChar((bits / 10) % 10));
            sb.append(toAlphaNumericChar(bits % 10));
            i -= 3;
        }
        if (i == 2) {
            if (bitSource.available() < 7) {
                throw FormatException.getFormatInstance();
            }
            int bits2 = bitSource.readBits(7);
            if (bits2 >= 100) {
                throw FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(bits2 / 10));
            sb.append(toAlphaNumericChar(bits2 % 10));
            return;
        }
        if (i == 1) {
            if (bitSource.available() < 4) {
                throw FormatException.getFormatInstance();
            }
            int bits3 = bitSource.readBits(4);
            if (bits3 >= 10) {
                throw FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(bits3));
        }
    }

    private static int parseECIValue(BitSource bitSource) throws FormatException {
        int bits = bitSource.readBits(8);
        if ((bits & 128) == 0) {
            return bits & 127;
        }
        if ((bits & PsExtractor.AUDIO_STREAM) == 128) {
            return bitSource.readBits(8) | ((bits & 63) << 8);
        }
        if ((bits & 224) == 192) {
            return bitSource.readBits(16) | ((bits & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    private static char toAlphaNumericChar(int i) throws FormatException {
        char[] cArr = ALPHANUMERIC_CHARS;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.getFormatInstance();
    }
}
