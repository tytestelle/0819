package com.google.zxing.oned;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OneDReader implements Reader {
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = r22.getBlackRow(r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.zxing.Result doDecode(com.google.zxing.BinaryBitmap image, java.util.Map<com.google.zxing.DecodeHintType, ?> hints) throws com.google.zxing.NotFoundException {
        int width = image.getWidth();
        int height = image.getHeight();
        com.google.zxing.common.BitArray row = new com.google.zxing.common.BitArray(width);
        boolean tryHarder = hints != null && hints.containsKey(com.google.zxing.DecodeHintType.TRY_HARDER);
        int rowStep = Math.max(1, height >> (tryHarder ? 8 : 5));
        int maxLines = tryHarder ? height : 15;
        int middle = height / 2;
        for (int x = 0; x < maxLines; x++) {
            int rowStepsAboveOrBelow = (x + 1) / 2;
            boolean isAbove = (x & 1) == 0;
            int rowNumber = middle + rowStep * (isAbove ? rowStepsAboveOrBelow : -rowStepsAboveOrBelow);
            if (rowNumber < 0 || rowNumber >= height) break;
            try {
                row = image.getBlackRow(rowNumber, row);
            } catch (com.google.zxing.NotFoundException ignored) {
                continue;
            }
            for (int attempt = 0; attempt < 2; attempt++) {
                if (attempt == 1) {
                    row.reverse();
                    if (hints != null && hints.containsKey(com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK)) {
                        java.util.Map<com.google.zxing.DecodeHintType,Object> newHints = new java.util.EnumMap<>(com.google.zxing.DecodeHintType.class);
                        newHints.putAll(hints);
                        newHints.remove(com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK);
                        hints = newHints;
                    }
                }
                try {
                    com.google.zxing.Result result = decodeRow(rowNumber, row, hints);
                    if (attempt == 1) {
                        result.putMetadata(com.google.zxing.ResultMetadataType.ORIENTATION, 180);
                        com.google.zxing.ResultPoint[] points = result.getResultPoints();
                        if (points != null) {
                            points[0] = new com.google.zxing.ResultPoint(width - points[0].getX() - 1, points[0].getY());
                            points[1] = new com.google.zxing.ResultPoint(width - points[1].getX() - 1, points[1].getY());
                        }
                    }
                    return result;
                } catch (com.google.zxing.ReaderException ignored) {
                }
            }
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    public static float patternMatchVariance(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = iArr2[i4] * f3;
            float f7 = i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    public static void recordPattern(BitArray bitArray, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int size = bitArray.getSize();
        if (i >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z = !bitArray.get(i);
        while (i < size) {
            if (bitArray.get(i) != z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                i2++;
                if (i2 == length) {
                    break;
                }
                iArr[i2] = 1;
                z = !z;
            }
            i++;
        }
        if (i2 != length) {
            if (i2 != length - 1 || i != size) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public static void recordPatternInReverse(BitArray bitArray, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean z = bitArray.get(i);
        while (i > 0 && length >= 0) {
            i--;
            if (bitArray.get(i) != z) {
                length--;
                z = !z;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        recordPattern(bitArray, i + 1, iArr);
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) {
        return decode(binaryBitmap, null);
    }

    public abstract Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map);

    @Override // com.google.zxing.Reader
    public void reset() {
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        try {
            return doDecode(binaryBitmap, map);
        } catch (NotFoundException e) {
            if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER) || !binaryBitmap.isRotateSupported()) {
                throw e;
            }
            BinaryBitmap binaryBitmapRotateCounterClockwise = binaryBitmap.rotateCounterClockwise();
            Result resultDoDecode = doDecode(binaryBitmapRotateCounterClockwise, map);
            Map<ResultMetadataType, Object> resultMetadata = resultDoDecode.getResultMetadata();
            int iIntValue = 270;
            if (resultMetadata != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (resultMetadata.containsKey(resultMetadataType)) {
                    iIntValue = (((Integer) resultMetadata.get(resultMetadataType)).intValue() + 270) % 360;
                }
            }
            resultDoDecode.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(iIntValue));
            ResultPoint[] resultPoints = resultDoDecode.getResultPoints();
            if (resultPoints != null) {
                int height = binaryBitmapRotateCounterClockwise.getHeight();
                for (int i = 0; i < resultPoints.length; i++) {
                    resultPoints[i] = new ResultPoint((height - resultPoints[i].getY()) - 1.0f, resultPoints[i].getX());
                }
            }
            return resultDoDecode;
        }
    }
}
