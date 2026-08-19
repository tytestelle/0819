package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiFinderPatternFinder extends FinderPatternFinder {
    private static final float DIFF_MODSIZE_CUTOFF = 0.5f;
    private static final float DIFF_MODSIZE_CUTOFF_PERCENT = 0.05f;
    private static final float MAX_MODULE_COUNT_PER_EDGE = 180.0f;
    private static final float MIN_MODULE_COUNT_PER_EDGE = 9.0f;
    private static final FinderPatternInfo[] EMPTY_RESULT_ARRAY = new FinderPatternInfo[0];
    private static final FinderPattern[] EMPTY_FP_ARRAY = new FinderPattern[0];
    private static final FinderPattern[][] EMPTY_FP_2D_ARRAY = new FinderPattern[0][];

    public static final class ModuleSizeComparator implements Comparator<FinderPattern>, Serializable {
        private ModuleSizeComparator() {
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            double estimatedModuleSize = finderPattern2.getEstimatedModuleSize() - finderPattern.getEstimatedModuleSize();
            if (estimatedModuleSize < 0.0d) {
                return -1;
            }
            return estimatedModuleSize > 0.0d ? 1 : 0;
        }
    }

    public MultiFinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        super(bitMatrix, resultPointCallback);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    private FinderPattern[][] selectMultipleBestPatterns() throws NotFoundException {
        ArrayList arrayList;
        int i = 3;
        char c = 0;
        ArrayList arrayList2 = new ArrayList();
        for (FinderPattern finderPattern : getPossibleCenters()) {
            if (finderPattern.getCount() >= 2) {
                arrayList2.add(finderPattern);
            }
        }
        int size = arrayList2.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (size == 3) {
            return new FinderPattern[][]{(FinderPattern[]) arrayList2.toArray(EMPTY_FP_ARRAY)};
        }
        Collections.sort(arrayList2, new ModuleSizeComparator());
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        while (i2 < size - 2) {
            FinderPattern finderPattern2 = (FinderPattern) arrayList2.get(i2);
            if (finderPattern2 != null) {
                int i3 = i2 + 1;
                while (i3 < size - 1) {
                    FinderPattern finderPattern3 = (FinderPattern) arrayList2.get(i3);
                    if (finderPattern3 != null) {
                        float estimatedModuleSize = (finderPattern2.getEstimatedModuleSize() - finderPattern3.getEstimatedModuleSize()) / Math.min(finderPattern2.getEstimatedModuleSize(), finderPattern3.getEstimatedModuleSize());
                        float fAbs = Math.abs(finderPattern2.getEstimatedModuleSize() - finderPattern3.getEstimatedModuleSize());
                        float f = DIFF_MODSIZE_CUTOFF_PERCENT;
                        float f2 = 0.5f;
                        if (fAbs > 0.5f && estimatedModuleSize >= DIFF_MODSIZE_CUTOFF_PERCENT) {
                            break;
                        }
                        int i4 = i3 + 1;
                        while (i4 < size) {
                            FinderPattern finderPattern4 = (FinderPattern) arrayList2.get(i4);
                            if (finderPattern4 != null) {
                                float estimatedModuleSize2 = (finderPattern3.getEstimatedModuleSize() - finderPattern4.getEstimatedModuleSize()) / Math.min(finderPattern3.getEstimatedModuleSize(), finderPattern4.getEstimatedModuleSize());
                                if (Math.abs(finderPattern3.getEstimatedModuleSize() - finderPattern4.getEstimatedModuleSize()) > f2 && estimatedModuleSize2 >= f) {
                                    break;
                                }
                                FinderPattern[] finderPatternArr = new FinderPattern[i];
                                finderPatternArr[c] = finderPattern2;
                                finderPatternArr[1] = finderPattern3;
                                finderPatternArr[2] = finderPattern4;
                                ResultPoint.orderBestPatterns(finderPatternArr);
                                FinderPatternInfo finderPatternInfo = new FinderPatternInfo(finderPatternArr);
                                float fDistance = ResultPoint.distance(finderPatternInfo.getTopLeft(), finderPatternInfo.getBottomLeft());
                                float fDistance2 = ResultPoint.distance(finderPatternInfo.getTopRight(), finderPatternInfo.getBottomLeft());
                                float fDistance3 = ResultPoint.distance(finderPatternInfo.getTopLeft(), finderPatternInfo.getTopRight());
                                float estimatedModuleSize3 = (fDistance + fDistance3) / (finderPattern2.getEstimatedModuleSize() * 2.0f);
                                if (estimatedModuleSize3 > MAX_MODULE_COUNT_PER_EDGE || estimatedModuleSize3 < MIN_MODULE_COUNT_PER_EDGE || Math.abs((fDistance - fDistance3) / Math.min(fDistance, fDistance3)) >= 0.1f) {
                                    arrayList = arrayList2;
                                } else {
                                    arrayList = arrayList2;
                                    double d = fDistance;
                                    double d2 = fDistance3;
                                    float fSqrt = (float) Math.sqrt((d2 * d2) + (d * d));
                                    if (Math.abs((fDistance2 - fSqrt) / Math.min(fDistance2, fSqrt)) < 0.1f) {
                                        arrayList3.add(finderPatternArr);
                                    }
                                }
                            } else {
                                arrayList = arrayList2;
                            }
                            i4++;
                            arrayList2 = arrayList;
                            i = 3;
                            c = 0;
                            f = DIFF_MODSIZE_CUTOFF_PERCENT;
                            f2 = 0.5f;
                        }
                    }
                    i3++;
                    arrayList2 = arrayList2;
                    i = 3;
                    c = 0;
                }
            }
            i2++;
            arrayList2 = arrayList2;
            i = 3;
            c = 0;
        }
        if (arrayList3.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (FinderPattern[][]) arrayList3.toArray(EMPTY_FP_2D_ARRAY);
    }

    public FinderPatternInfo[] findMulti(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        BitMatrix image = getImage();
        int height = image.getHeight();
        int width = image.getWidth();
        int i = (height * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        for (int i2 = i - 1; i2 < height; i2 += i) {
            FinderPatternFinder.doClearCounts(iArr);
            int i3 = 0;
            for (int i4 = 0; i4 < width; i4++) {
                if (image.get(i4, i2)) {
                    if ((i3 & 1) == 1) {
                        i3++;
                    }
                    iArr[i3] = iArr[i3] + 1;
                } else if ((i3 & 1) != 0) {
                    iArr[i3] = iArr[i3] + 1;
                } else if (i3 != 4) {
                    i3++;
                    iArr[i3] = iArr[i3] + 1;
                } else if (FinderPatternFinder.foundPatternCross(iArr) && handlePossibleCenter(iArr, i2, i4)) {
                    FinderPatternFinder.doClearCounts(iArr);
                    i3 = 0;
                } else {
                    FinderPatternFinder.doShiftCounts2(iArr);
                    i3 = 3;
                }
            }
            if (FinderPatternFinder.foundPatternCross(iArr)) {
                handlePossibleCenter(iArr, i2, width);
            }
        }
        FinderPattern[][] finderPatternArrSelectMultipleBestPatterns = selectMultipleBestPatterns();
        ArrayList arrayList = new ArrayList();
        for (FinderPattern[] finderPatternArr : finderPatternArrSelectMultipleBestPatterns) {
            ResultPoint.orderBestPatterns(finderPatternArr);
            arrayList.add(new FinderPatternInfo(finderPatternArr));
        }
        return arrayList.isEmpty() ? EMPTY_RESULT_ARRAY : (FinderPatternInfo[]) arrayList.toArray(EMPTY_RESULT_ARRAY);
    }
}
