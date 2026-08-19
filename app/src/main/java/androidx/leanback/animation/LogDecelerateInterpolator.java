package androidx.leanback.animation;

import android.animation.TimeInterpolator;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class LogDecelerateInterpolator implements TimeInterpolator {
    int mBase;
    int mDrift;
    final float mLogScale;

    public LogDecelerateInterpolator(int i, int i2) {
        this.mBase = i;
        this.mDrift = i2;
        this.mLogScale = 1.0f / computeLog(1.0f, i, i2);
    }

    public static float computeLog(float f, int i, int i2) {
        return (i2 * f) + ((float) (-Math.pow(i, -f))) + 1.0f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return computeLog(f, this.mBase, this.mDrift) * this.mLogScale;
    }
}
