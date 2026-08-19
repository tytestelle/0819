package xyz.doikki.videoplayer.render;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class MeasureHelper {
    private int mCurrentScreenScale;
    private int mVideoHeight;
    private int mVideoRotationDegree;
    private int mVideoWidth;

    /* JADX WARN: Code duplicated, block: B:21:0x003b A[PHI: r10
  0x003b: PHI (r10v10 int) = (r10v4 int), (r10v5 int), (r10v8 int), (r10v9 int), (r10v14 int) binds: [B:36:0x0077, B:32:0x006b, B:29:0x005f, B:24:0x004d, B:20:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    public int[] doMeasure(int i, int i2) {
        int i3;
        int i4 = this.mVideoRotationDegree;
        if (i4 == 90 || i4 == 270) {
            int i5 = i + i2;
            i2 = i5 - i2;
            i = i5 - i2;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i6 = this.mVideoHeight;
        if (i6 == 0 || (i3 = this.mVideoWidth) == 0) {
            return new int[]{size, size2};
        }
        switch (this.mCurrentScreenScale) {
            case 0:
            default:
                if (i3 * size2 >= size * i6) {
                    if (i3 * size2 > size * i6) {
                        i2 = (i6 * size) / i3;
                        i = size;
                    }
                    break;
                } else {
                    i = (i3 * size2) / i6;
                }
                i2 = size2;
            case -1:
                i = size;
                i2 = size2;
                break;
            case 1:
                i2 = (size / 16) * 9;
                if (size2 <= i2) {
                    i = (size2 / 9) * 16;
                    i2 = size2;
                } else {
                    i = size;
                }
                break;
            case 2:
                i2 = (size / 4) * 3;
                if (size2 <= i2) {
                    i = (size2 / 3) * 4;
                    i2 = size2;
                } else {
                    i = size;
                }
                break;
            case 3:
                break;
            case 4:
                i2 = i6;
                i = i3;
                break;
            case 5:
                if (i3 * size2 <= size * i6) {
                    i2 = (i6 * size) / i3;
                    i = size;
                } else {
                    i = (i3 * size2) / i6;
                    i2 = size2;
                }
                break;
            case 6:
                double d = (((double) size) / 2.35d) * 1.0d;
                if (size2 <= d) {
                    i = (int) (((double) size2) * 2.35d);
                    i2 = size2;
                } else {
                    i2 = (int) d;
                    i = size;
                }
                break;
        }
        return new int[]{i, i2};
    }

    public void setScreenScale(int i) {
        this.mCurrentScreenScale = i;
    }

    public void setVideoRotation(int i) {
        this.mVideoRotationDegree = i;
    }

    public void setVideoSize(int i, int i2) {
        this.mVideoWidth = i;
        this.mVideoHeight = i2;
    }
}
