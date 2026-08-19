package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes2.dex */
public final class Code128Reader extends OneDReader {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    static final int[][] CODE_PATTERNS = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    private static final int CODE_SHIFT = 98;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final float MAX_AVG_VARIANCE = 0.25f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;

    private static int decodeCode(BitArray bitArray, int[] iArr, int i) throws NotFoundException {
        OneDReader.recordPattern(bitArray, i, iArr);
        float f = MAX_AVG_VARIANCE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[][] iArr2 = CODE_PATTERNS;
            if (i3 >= iArr2.length) {
                break;
            }
            float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, iArr2[i3], 0.7f);
            if (fPatternMatchVariance < f) {
                i2 = i3;
                f = fPatternMatchVariance;
            }
            i3++;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int[] findStartPattern(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int[] iArr = new int[6];
        int i = nextSet;
        boolean z = false;
        int i2 = 0;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                if (i2 == 5) {
                    int i3 = -1;
                    float f = MAX_AVG_VARIANCE;
                    for (int i4 = 103; i4 <= 105; i4++) {
                        float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, CODE_PATTERNS[i4], 0.7f);
                        if (fPatternMatchVariance < f) {
                            i3 = i4;
                            f = fPatternMatchVariance;
                        }
                    }
                    if (i3 >= 0 && bitArray.isRange(Math.max(0, i - ((nextSet - i) / 2)), i, false)) {
                        return new int[]{i, nextSet, i3};
                    }
                    i += iArr[0] + iArr[1];
                    int i5 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i5);
                    iArr[i5] = 0;
                    iArr[i2] = 0;
                    i2--;
                } else {
                    i2++;
                }
                iArr[i2] = 1;
                z = !z;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0172  */
    /* JADX WARN: Code duplicated, block: B:104:0x0176  */
    /* JADX WARN: Code duplicated, block: B:106:0x017e A[FALL_THROUGH, PHI: r21 r22
  0x017e: PHI (r21v19 boolean) = (r21v3 boolean), (r21v3 boolean), (r21v3 boolean), (r21v3 boolean), (r21v2 boolean), (r21v2 boolean) binds: [B:111:0x0188, B:119:0x019d, B:123:0x01a9, B:122:0x01a5, B:105:0x017b, B:28:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x017e: PHI (r22v16 int) = (r22v1 int), (r22v3 int), (r22v3 int), (r22v3 int), (r22v1 int), (r22v1 int) binds: [B:111:0x0188, B:119:0x019d, B:123:0x01a9, B:122:0x01a5, B:105:0x017b, B:28:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x0180  */
    /* JADX WARN: Code duplicated, block: B:109:0x0184  */
    /* JADX WARN: Code duplicated, block: B:111:0x0188  */
    /* JADX WARN: Code duplicated, block: B:113:0x018c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0192  */
    /* JADX WARN: Code duplicated, block: B:116:0x0195  */
    /* JADX WARN: Code duplicated, block: B:118:0x019b  */
    /* JADX WARN: Code duplicated, block: B:120:0x019f  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:124:0x01af  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:129:0x01be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[LOOP:1: B:23:0x007e->B:24:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8 A[FALL_THROUGH, PHI: r21 r22
  0x00c8: PHI (r21v14 boolean) = 
  (r21v5 boolean)
  (r21v5 boolean)
  (r21v5 boolean)
  (r21v5 boolean)
  (r21v16 boolean)
  (r21v16 boolean)
  (r21v16 boolean)
  (r21v16 boolean)
 binds: [B:78:0x0135, B:86:0x014a, B:90:0x0156, B:89:0x0152, B:43:0x00c5, B:51:0x00dc, B:55:0x00e8, B:54:0x00e4] A[DONT_GENERATE, DONT_INLINE]
  0x00c8: PHI (r22v10 int) = (r22v1 int), (r22v6 int), (r22v6 int), (r22v6 int), (r22v1 int), (r22v13 int), (r22v13 int), (r22v13 int) binds: [B:78:0x0135, B:86:0x014a, B:90:0x0156, B:89:0x0152, B:43:0x00c5, B:51:0x00dc, B:55:0x00e8, B:54:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[PHI: r21
  0x00f2: PHI (r21v12 boolean) = (r21v5 boolean), (r21v16 boolean) binds: [B:94:0x0163, B:57:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa A[PHI: r21
  0x00fa: PHI (r21v11 boolean) = (r21v5 boolean), (r21v16 boolean) binds: [B:97:0x0168, B:60:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe A[PHI: r21
  0x00fe: PHI (r21v10 boolean) = (r21v5 boolean), (r21v5 boolean), (r21v16 boolean), (r21v16 boolean) binds: [B:96:0x0166, B:97:0x0168, B:59:0x00f6, B:60:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106 A[PHI: r21
  0x0106: PHI (r21v9 boolean) = (r21v5 boolean), (r21v16 boolean) binds: [B:78:0x0135, B:43:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e A[PHI: r21
  0x010e: PHI (r21v8 boolean) = (r21v5 boolean), (r21v16 boolean) binds: [B:78:0x0135, B:43:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0113 A[PHI: r21
  0x0113: PHI (r21v7 boolean) = (r21v5 boolean), (r21v16 boolean) binds: [B:77:0x0133, B:42:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x011e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0125  */
    /* JADX WARN: Code duplicated, block: B:74:0x012d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0131  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:80:0x0139  */
    /* JADX WARN: Code duplicated, block: B:82:0x013f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0142  */
    /* JADX WARN: Code duplicated, block: B:85:0x0148  */
    /* JADX WARN: Code duplicated, block: B:87:0x014c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0152  */
    /* JADX WARN: Code duplicated, block: B:90:0x0156  */
    /* JADX WARN: Code duplicated, block: B:91:0x015c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0161  */
    /* JADX WARN: Code duplicated, block: B:94:0x0163 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x016b  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:48:0x00d4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override
    public com.google.zxing.Result decodeRow(int rowNumber, com.google.zxing.common.BitArray row,
            java.util.Map<com.google.zxing.DecodeHintType, ?> hints)
            throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        boolean convertFNC1 = hints != null && hints.containsKey(com.google.zxing.DecodeHintType.ASSUME_GS1);
        int[] startPatternInfo = findStartPattern(row);
        int startCode = startPatternInfo[2];
        java.util.List<Byte> rawCodes = new java.util.ArrayList<>(20);
        rawCodes.add((byte) startCode);
        int codeSet;
        switch (startCode) {
            case CODE_START_A: codeSet = CODE_CODE_A; break;
            case CODE_START_B: codeSet = CODE_CODE_B; break;
            case CODE_START_C: codeSet = CODE_CODE_C; break;
            default: throw com.google.zxing.FormatException.getFormatInstance();
        }
        boolean done = false;
        boolean isNextShifted = false;
        StringBuilder result = new StringBuilder(20);
        int lastStart = startPatternInfo[0];
        int nextStart = startPatternInfo[1];
        int[] counters = new int[6];
        int lastCode = 0;
        int code = 0;
        int checksumTotal = startCode;
        int multiplier = 0;
        boolean lastCharacterWasPrintable = true;
        boolean upperMode = false;
        boolean shiftUpperMode = false;
        while (!done) {
            boolean unshift = isNextShifted;
            isNextShifted = false;
            lastCode = code;
            code = decodeCode(row, counters, nextStart);
            rawCodes.add((byte) code);
            if (code != CODE_STOP) lastCharacterWasPrintable = true;
            if (code != CODE_STOP) { multiplier++; checksumTotal += multiplier * code; }
            lastStart = nextStart;
            for (int counter : counters) nextStart += counter;
            if (code == CODE_START_A || code == CODE_START_B || code == CODE_START_C) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            switch (codeSet) {
                case CODE_CODE_A:
                    if (code < 64) {
                        result.append((char) (' ' + code + ((shiftUpperMode == upperMode) ? 0 : 128)));
                        shiftUpperMode = false;
                    } else if (code < 96) {
                        result.append((char) ((shiftUpperMode == upperMode) ? code - 64 : code + 64));
                        shiftUpperMode = false;
                    } else {
                        if (code != CODE_STOP) lastCharacterWasPrintable = false;
                        switch (code) {
                            case CODE_FNC_1:
                                if (convertFNC1) result.append(result.length() == 0 ? "]C1" : String.valueOf((char)29));
                                break;
                            case CODE_FNC_2: case CODE_FNC_3: break;
                            case CODE_FNC_4_A:
                                if (!upperMode && shiftUpperMode) { upperMode = true; shiftUpperMode = false; }
                                else if (upperMode && shiftUpperMode) { upperMode = false; shiftUpperMode = false; }
                                else shiftUpperMode = true;
                                break;
                            case CODE_SHIFT: isNextShifted = true; codeSet = CODE_CODE_B; break;
                            case CODE_CODE_B: codeSet = CODE_CODE_B; break;
                            case CODE_CODE_C: codeSet = CODE_CODE_C; break;
                            case CODE_STOP: done = true; break;
                        }
                    }
                    break;
                case CODE_CODE_B:
                    if (code < 96) {
                        result.append((char) (' ' + code + ((shiftUpperMode == upperMode) ? 0 : 128)));
                        shiftUpperMode = false;
                    } else {
                        if (code != CODE_STOP) lastCharacterWasPrintable = false;
                        switch (code) {
                            case CODE_FNC_1:
                                if (convertFNC1) result.append(result.length() == 0 ? "]C1" : String.valueOf((char)29));
                                break;
                            case CODE_FNC_2: case CODE_FNC_3: break;
                            case CODE_FNC_4_B:
                                if (!upperMode && shiftUpperMode) { upperMode = true; shiftUpperMode = false; }
                                else if (upperMode && shiftUpperMode) { upperMode = false; shiftUpperMode = false; }
                                else shiftUpperMode = true;
                                break;
                            case CODE_SHIFT: isNextShifted = true; codeSet = CODE_CODE_A; break;
                            case CODE_CODE_A: codeSet = CODE_CODE_A; break;
                            case CODE_CODE_C: codeSet = CODE_CODE_C; break;
                            case CODE_STOP: done = true; break;
                        }
                    }
                    break;
                case CODE_CODE_C:
                    if (code < 100) {
                        if (code < 10) result.append('0');
                        result.append(code);
                    } else {
                        if (code != CODE_STOP) lastCharacterWasPrintable = false;
                        switch (code) {
                            case CODE_FNC_1:
                                if (convertFNC1) result.append(result.length() == 0 ? "]C1" : String.valueOf((char)29));
                                break;
                            case CODE_CODE_A: codeSet = CODE_CODE_A; break;
                            case CODE_CODE_B: codeSet = CODE_CODE_B; break;
                            case CODE_STOP: done = true; break;
                        }
                    }
                    break;
                default: throw com.google.zxing.FormatException.getFormatInstance();
            }
            if (unshift) codeSet = codeSet == CODE_CODE_A ? CODE_CODE_B : CODE_CODE_A;
        }
        int lastPatternSize = nextStart - lastStart;
        nextStart = row.getNextUnset(nextStart);
        if (!row.isRange(nextStart, Math.min(row.getSize(), nextStart + (nextStart - lastStart) / 2), false)) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        checksumTotal -= multiplier * lastCode;
        if (checksumTotal % 103 != lastCode) throw com.google.zxing.ChecksumException.getChecksumInstance();
        int resultLength = result.length();
        if (resultLength == 0) throw com.google.zxing.NotFoundException.getNotFoundInstance();
        if (lastCharacterWasPrintable) {
            if (codeSet == CODE_CODE_C) result.delete(resultLength - 2, resultLength);
            else result.delete(resultLength - 1, resultLength);
        }
        float left = (startPatternInfo[1] + startPatternInfo[0]) / 2.0f;
        float right = lastStart + lastPatternSize / 2.0f;
        byte[] rawBytes = new byte[rawCodes.size()];
        for (int i = 0; i < rawCodes.size(); i++) rawBytes[i] = rawCodes.get(i);
        return new com.google.zxing.Result(result.toString(), rawBytes,
                new com.google.zxing.ResultPoint[]{new com.google.zxing.ResultPoint(left, rowNumber), new com.google.zxing.ResultPoint(right, rowNumber)},
                com.google.zxing.BarcodeFormat.CODE_128);
    }
}
