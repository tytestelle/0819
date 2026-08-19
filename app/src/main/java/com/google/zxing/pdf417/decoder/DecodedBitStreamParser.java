package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.ECIStringBuilder;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class DecodedBitStreamParser {
    private static final int AL = 28;
    private static final int AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final BigInteger[] EXP900;
    private static final int LL = 27;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_ADDRESSEE = 4;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_CHECKSUM = 6;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_NAME = 0;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_SIZE = 5;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SEGMENT_COUNT = 1;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SENDER = 3;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_TIME_STAMP = 2;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;
    private static final int ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;
    private static final int PL = 25;
    private static final int PS = 29;
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;
    private static final char[] PUNCT_CHARS = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] MIXED_CHARS = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* JADX INFO: renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode = iArr;
            try {
                iArr[Mode.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        EXP900 = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = EXP900;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(bigIntegerValueOf);
            i++;
        }
    }

    private DecodedBitStreamParser() {
    }

    private static int byteCompaction(int i, int[] iArr, int i2, ECIStringBuilder eCIStringBuilder) throws FormatException {
        int i3;
        int i4;
        boolean z = false;
        while (i2 < iArr[0] && !z) {
            while (true) {
                i3 = iArr[0];
                if (i2 >= i3 || iArr[i2] != ECI_CHARSET) {
                    break;
                }
                eCIStringBuilder.appendECI(iArr[i2 + 1]);
                i2 += 2;
            }
            if (i2 >= i3 || iArr[i2] >= 900) {
                z = true;
            } else {
                long j = 0;
                int i5 = 0;
                while (true) {
                    i4 = i2 + 1;
                    j = (j * 900) + ((long) iArr[i2]);
                    i5++;
                    if (i5 >= 5 || i4 >= iArr[0] || iArr[i4] >= 900) {
                        break;
                    }
                    i2 = i4;
                }
                if (i5 != 5 || (i != BYTE_COMPACTION_MODE_LATCH_6 && (i4 >= iArr[0] || iArr[i4] >= 900))) {
                    i4 -= i5;
                    while (i4 < iArr[0] && !z) {
                        int i6 = i4 + 1;
                        int i7 = iArr[i4];
                        if (i7 < 900) {
                            eCIStringBuilder.append((byte) i7);
                            i4 = i6;
                        } else if (i7 == ECI_CHARSET) {
                            i4 += 2;
                            eCIStringBuilder.appendECI(iArr[i6]);
                        } else {
                            z = true;
                        }
                    }
                } else {
                    for (int i8 = 0; i8 < 6; i8++) {
                        eCIStringBuilder.append((byte) (j >> ((5 - i8) * 8)));
                    }
                }
                i2 = i4;
            }
        }
        return i2;
    }

    public static DecoderResult decode(int[] iArr, String str) throws FormatException {
        ECIStringBuilder eCIStringBuilder = new ECIStringBuilder(iArr.length * 2);
        int iTextCompaction = textCompaction(iArr, 1, eCIStringBuilder);
        PDF417ResultMetadata pDF417ResultMetadata = new PDF417ResultMetadata();
        while (iTextCompaction < iArr[0]) {
            int i = iTextCompaction + 1;
            int i2 = iArr[iTextCompaction];
            if (i2 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                switch (i2) {
                    case 900:
                        iTextCompaction = textCompaction(iArr, i, eCIStringBuilder);
                        continue;
                    case 901:
                        break;
                    case 902:
                        iTextCompaction = numericCompaction(iArr, i, eCIStringBuilder);
                        continue;
                    default:
                        switch (i2) {
                            case MACRO_PDF417_TERMINATOR /* 922 */:
                            case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                                throw FormatException.getFormatInstance();
                            case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                                break;
                            case ECI_USER_DEFINED /* 925 */:
                                iTextCompaction += 2;
                                continue;
                            case ECI_GENERAL_PURPOSE /* 926 */:
                                iTextCompaction += 3;
                                continue;
                            case ECI_CHARSET /* 927 */:
                                iTextCompaction += 2;
                                eCIStringBuilder.appendECI(iArr[i]);
                                continue;
                            case 928:
                                iTextCompaction = decodeMacroBlock(iArr, i, pDF417ResultMetadata);
                                continue;
                            default:
                                iTextCompaction = textCompaction(iArr, iTextCompaction, eCIStringBuilder);
                                continue;
                        }
                        break;
                }
                iTextCompaction = byteCompaction(i2, iArr, i, eCIStringBuilder);
            } else {
                iTextCompaction += 2;
                eCIStringBuilder.append((char) iArr[i]);
            }
        }
        if (eCIStringBuilder.isEmpty() && pDF417ResultMetadata.getFileId() == null) {
            throw FormatException.getFormatInstance();
        }
        DecoderResult decoderResult = new DecoderResult(null, eCIStringBuilder.toString(), null, str);
        decoderResult.setOther(pDF417ResultMetadata);
        return decoderResult;
    }

    private static String decodeBase900toBase10(int[] iArr, int i) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigIntegerAdd = bigIntegerAdd.add(EXP900[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    public static int decodeMacroBlock(int[] iArr, int i, PDF417ResultMetadata pDF417ResultMetadata) throws FormatException {
        int i2;
        if (i + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i3 = 0;
        while (i3 < 2) {
            iArr2[i3] = iArr[i];
            i3++;
            i++;
        }
        String strDecodeBase900toBase10 = decodeBase900toBase10(iArr2, 2);
        if (strDecodeBase900toBase10.isEmpty()) {
            pDF417ResultMetadata.setSegmentIndex(0);
        } else {
            try {
                pDF417ResultMetadata.setSegmentIndex(Integer.parseInt(strDecodeBase900toBase10));
            } catch (NumberFormatException unused) {
                throw FormatException.getFormatInstance();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (i < iArr[0] && i < iArr.length && (i2 = iArr[i]) != MACRO_PDF417_TERMINATOR && i2 != BEGIN_MACRO_PDF417_OPTIONAL_FIELD) {
            sb.append(String.format("%03d", Integer.valueOf(i2)));
            i++;
        }
        if (sb.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        pDF417ResultMetadata.setFileId(sb.toString());
        int i4 = iArr[i] == BEGIN_MACRO_PDF417_OPTIONAL_FIELD ? i + 1 : -1;
        while (i < iArr[0]) {
            int i5 = iArr[i];
            if (i5 == MACRO_PDF417_TERMINATOR) {
                i++;
                pDF417ResultMetadata.setLastSegment(true);
            } else {
                if (i5 != BEGIN_MACRO_PDF417_OPTIONAL_FIELD) {
                    throw FormatException.getFormatInstance();
                }
                switch (iArr[i + 1]) {
                    case 0:
                        ECIStringBuilder eCIStringBuilder = new ECIStringBuilder();
                        i = textCompaction(iArr, i + 2, eCIStringBuilder);
                        pDF417ResultMetadata.setFileName(eCIStringBuilder.toString());
                        break;
                    case 1:
                        ECIStringBuilder eCIStringBuilder2 = new ECIStringBuilder();
                        i = numericCompaction(iArr, i + 2, eCIStringBuilder2);
                        try {
                            pDF417ResultMetadata.setSegmentCount(Integer.parseInt(eCIStringBuilder2.toString()));
                        } catch (NumberFormatException unused2) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 2:
                        ECIStringBuilder eCIStringBuilder3 = new ECIStringBuilder();
                        i = numericCompaction(iArr, i + 2, eCIStringBuilder3);
                        try {
                            pDF417ResultMetadata.setTimestamp(Long.parseLong(eCIStringBuilder3.toString()));
                        } catch (NumberFormatException unused3) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 3:
                        ECIStringBuilder eCIStringBuilder4 = new ECIStringBuilder();
                        i = textCompaction(iArr, i + 2, eCIStringBuilder4);
                        pDF417ResultMetadata.setSender(eCIStringBuilder4.toString());
                        break;
                    case 4:
                        ECIStringBuilder eCIStringBuilder5 = new ECIStringBuilder();
                        i = textCompaction(iArr, i + 2, eCIStringBuilder5);
                        pDF417ResultMetadata.setAddressee(eCIStringBuilder5.toString());
                        break;
                    case 5:
                        ECIStringBuilder eCIStringBuilder6 = new ECIStringBuilder();
                        i = numericCompaction(iArr, i + 2, eCIStringBuilder6);
                        try {
                            pDF417ResultMetadata.setFileSize(Long.parseLong(eCIStringBuilder6.toString()));
                        } catch (NumberFormatException unused4) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 6:
                        ECIStringBuilder eCIStringBuilder7 = new ECIStringBuilder();
                        i = numericCompaction(iArr, i + 2, eCIStringBuilder7);
                        try {
                            pDF417ResultMetadata.setChecksum(Integer.parseInt(eCIStringBuilder7.toString()));
                        } catch (NumberFormatException unused5) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
            }
        }
        if (i4 != -1) {
            int i6 = i - i4;
            if (pDF417ResultMetadata.isLastSegment()) {
                i6--;
            }
            if (i6 > 0) {
                pDF417ResultMetadata.setOptionalData(Arrays.copyOfRange(iArr, i4, i6 + i4));
            }
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0020. Please report as an issue. */
    private static Mode decodeTextCompaction(int[] iArr, int[] iArr2, int i, ECIStringBuilder eCIStringBuilder, Mode mode) {
        Mode mode2;
        int i2;
        char c;
        char c2;
        Mode mode3 = mode;
        Mode mode4 = mode3;
        Mode mode5 = mode4;
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            char c3 = ' ';
            switch (AnonymousClass1.$SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[mode4.ordinal()]) {
                case 1:
                    if (i4 >= 26) {
                        if (i4 != 900) {
                            if (i4 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                                switch (i4) {
                                    case 27:
                                        mode3 = Mode.LOWER;
                                        break;
                                    case 28:
                                        mode3 = Mode.MIXED;
                                        break;
                                    case 29:
                                        mode2 = Mode.PUNCT_SHIFT;
                                        c3 = 0;
                                        Mode mode6 = mode2;
                                        mode5 = mode4;
                                        mode4 = mode6;
                                        break;
                                }
                                mode5 = mode5;
                                mode5 = mode4;
                                c2 = c3;
                            } else {
                                eCIStringBuilder.append((char) iArr2[i3]);
                            }
                            c3 = 0;
                            mode5 = mode5;
                            mode5 = mode4;
                            c2 = c3;
                        } else {
                            mode3 = Mode.ALPHA;
                        }
                        mode4 = mode3;
                        c3 = 0;
                        mode5 = mode5;
                        mode5 = mode4;
                        c2 = c3;
                    } else {
                        i2 = i4 + 65;
                        c = (char) i2;
                        Mode mode7 = mode5;
                        mode5 = mode4;
                        c2 = c;
                        mode5 = mode7;
                    }
                    break;
                case 2:
                    if (i4 >= 26) {
                        if (i4 != 900) {
                            if (i4 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                                switch (i4) {
                                    case 27:
                                        mode2 = Mode.ALPHA_SHIFT;
                                        c3 = 0;
                                        Mode mode8 = mode2;
                                        mode5 = mode4;
                                        mode4 = mode8;
                                        break;
                                    case 28:
                                        mode3 = Mode.MIXED;
                                        break;
                                    case 29:
                                        mode2 = Mode.PUNCT_SHIFT;
                                        c3 = 0;
                                        Mode mode9 = mode2;
                                        mode5 = mode4;
                                        mode4 = mode9;
                                        break;
                                }
                                mode5 = mode5;
                                mode5 = mode4;
                                c2 = c3;
                            } else {
                                eCIStringBuilder.append((char) iArr2[i3]);
                            }
                            c3 = 0;
                            mode5 = mode5;
                            mode5 = mode4;
                            c2 = c3;
                        } else {
                            mode3 = Mode.ALPHA;
                        }
                        mode4 = mode3;
                        c3 = 0;
                        mode5 = mode5;
                        mode5 = mode4;
                        c2 = c3;
                    } else {
                        i2 = i4 + 97;
                        c = (char) i2;
                        Mode mode10 = mode5;
                        mode5 = mode4;
                        c2 = c;
                        mode5 = mode10;
                    }
                    break;
                case 3:
                    if (i4 >= 25) {
                        if (i4 == 900) {
                            mode3 = Mode.ALPHA;
                            mode4 = mode3;
                            c3 = 0;
                        } else {
                            if (i4 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                                switch (i4) {
                                    case 25:
                                        mode3 = Mode.PUNCT;
                                        mode4 = mode3;
                                        break;
                                    case 27:
                                        mode3 = Mode.LOWER;
                                        mode4 = mode3;
                                        break;
                                    case 28:
                                        mode3 = Mode.ALPHA;
                                        mode4 = mode3;
                                        break;
                                    case 29:
                                        mode2 = Mode.PUNCT_SHIFT;
                                        c3 = 0;
                                        Mode mode11 = mode2;
                                        mode5 = mode4;
                                        mode4 = mode11;
                                        break;
                                }
                            } else {
                                eCIStringBuilder.append((char) iArr2[i3]);
                            }
                            c3 = 0;
                        }
                        mode5 = mode5;
                        mode5 = mode4;
                        c2 = c3;
                    } else {
                        c = MIXED_CHARS[i4];
                        Mode mode12 = mode5;
                        mode5 = mode4;
                        c2 = c;
                        mode5 = mode12;
                    }
                    break;
                case 4:
                    if (i4 >= 29) {
                        if (i4 == 29 || i4 == 900) {
                            mode3 = Mode.ALPHA;
                            mode4 = mode3;
                        } else if (i4 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            eCIStringBuilder.append((char) iArr2[i3]);
                        }
                        mode5 = mode4;
                        c2 = 0;
                    } else {
                        c = PUNCT_CHARS[i4];
                        Mode mode13 = mode5;
                        mode5 = mode4;
                        c2 = c;
                        mode5 = mode13;
                    }
                    break;
                case 5:
                    if (i4 >= 26) {
                        if (i4 != 26) {
                            mode4 = i4 != 900 ? mode5 : Mode.ALPHA;
                            c3 = 0;
                        } else {
                            mode4 = mode5;
                        }
                        mode5 = mode5;
                        mode5 = mode4;
                        c2 = c3;
                    } else {
                        c2 = (char) (i4 + 65);
                        mode5 = mode5;
                    }
                    break;
                case 6:
                    if (i4 >= 29) {
                        if (i4 == 29 || i4 == 900) {
                            mode4 = Mode.ALPHA;
                            mode5 = mode4;
                        } else if (i4 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            eCIStringBuilder.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                    } else {
                        c2 = PUNCT_CHARS[i4];
                        mode5 = mode5;
                    }
                    break;
                default:
                    mode5 = mode4;
                    c2 = 0;
                    break;
            }
            if (c2 != 0) {
                eCIStringBuilder.append(c2);
            }
            i3++;
            mode4 = mode5;
            mode5 = mode5;
        }
        return mode3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0036  */
    /* JADX WARN: Code duplicated, block: B:34:0x003c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0007 A[SYNTHETIC] */
    private static int numericCompaction(int[] iArr, int i, ECIStringBuilder eCIStringBuilder) {
        int[] iArr2 = new int[15];
        boolean z = false;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = iArr[0];
                if (i < i3 && !z) {
                    int i4 = i + 1;
                    int i5 = iArr[i];
                    if (i4 == i3) {
                        z = true;
                    }
                    if (i5 < 900) {
                        iArr2[i2] = i5;
                        i2++;
                    } else {
                        if (i5 != 900 && i5 != 901 && i5 != ECI_CHARSET && i5 != 928) {
                            switch (i5) {
                            }
                            if (i2 % 15 != 0 || i5 == 902 || z) {
                                if (i2 > 0) {
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (i2 % 15 != 0) {
                        }
                        if (i2 > 0) {
                            break;
                        }
                    }
                    i = i4;
                    if (i2 % 15 != 0) {
                    }
                    if (i2 > 0) {
                        break;
                    }
                }
            }
            eCIStringBuilder.append(decodeBase900toBase10(iArr2, i2));
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x003a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x003d. Please report as an issue. */
    private static int textCompaction(int[] iArr, int i, ECIStringBuilder eCIStringBuilder) throws FormatException {
        int i2 = iArr[0];
        int[] iArr2 = new int[(i2 - i) * 2];
        int[] iArr3 = new int[(i2 - i) * 2];
        Mode mode = Mode.ALPHA;
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                iArr2[i3] = MODE_SHIFT_TO_BYTE_COMPACTION_MODE;
                i += 2;
                iArr3[i3] = iArr[i4];
                i3++;
            } else if (i5 != ECI_CHARSET) {
                if (i5 != 928) {
                    switch (i5) {
                        case 900:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i5) {
                                case MACRO_PDF417_TERMINATOR /* 922 */:
                                case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                                case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                z = true;
            } else {
                Mode modeDecodeTextCompaction = decodeTextCompaction(iArr2, iArr3, i3, eCIStringBuilder, mode);
                i += 2;
                eCIStringBuilder.appendECI(iArr[i4]);
                int i6 = iArr[0];
                if (i > i6) {
                    throw FormatException.getFormatInstance();
                }
                i3 = 0;
                mode = modeDecodeTextCompaction;
                iArr3 = new int[(i6 - i) * 2];
                iArr2 = new int[(i6 - i) * 2];
            }
            i = i4;
        }
        decodeTextCompaction(iArr2, iArr3, i3, eCIStringBuilder, mode);
        return i;
    }
}
