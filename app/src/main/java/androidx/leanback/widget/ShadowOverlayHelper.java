package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ShadowOverlayHelper {
    public static final int SHADOW_DYNAMIC = 3;
    public static final int SHADOW_NONE = 1;
    public static final int SHADOW_STATIC = 2;
    float mFocusedZ;
    boolean mNeedsOverlay;
    boolean mNeedsRoundedCorner;
    boolean mNeedsShadow;
    boolean mNeedsWrapper;
    int mRoundedCornerRadius;
    int mShadowType = 1;
    float mUnfocusedZ;

    public static final class Builder {
        private boolean keepForegroundDrawable;
        private boolean needsOverlay;
        private boolean needsRoundedCorner;
        private boolean needsShadow;
        private boolean preferZOrder = true;
        private Options options = Options.DEFAULT;

        public ShadowOverlayHelper build(Context context) {
            ShadowOverlayHelper shadowOverlayHelper = new ShadowOverlayHelper();
            shadowOverlayHelper.mNeedsOverlay = this.needsOverlay;
            boolean z = false;
            shadowOverlayHelper.mNeedsRoundedCorner = this.needsRoundedCorner && ShadowOverlayHelper.supportsRoundedCorner();
            shadowOverlayHelper.mNeedsShadow = this.needsShadow && ShadowOverlayHelper.supportsShadow();
            if (shadowOverlayHelper.mNeedsRoundedCorner) {
                shadowOverlayHelper.setupRoundedCornerRadius(this.options, context);
            }
            if (!shadowOverlayHelper.mNeedsShadow) {
                shadowOverlayHelper.mShadowType = 1;
                if ((!ShadowOverlayHelper.supportsForeground() || this.keepForegroundDrawable) && shadowOverlayHelper.mNeedsOverlay) {
                    z = true;
                }
                shadowOverlayHelper.mNeedsWrapper = z;
            } else if (this.preferZOrder && ShadowOverlayHelper.supportsDynamicShadow()) {
                shadowOverlayHelper.mShadowType = 3;
                shadowOverlayHelper.setupDynamicShadowZ(this.options, context);
                if ((!ShadowOverlayHelper.supportsForeground() || this.keepForegroundDrawable) && shadowOverlayHelper.mNeedsOverlay) {
                    z = true;
                }
                shadowOverlayHelper.mNeedsWrapper = z;
            } else {
                shadowOverlayHelper.mShadowType = 2;
                shadowOverlayHelper.mNeedsWrapper = true;
            }
            return shadowOverlayHelper;
        }

        public Builder keepForegroundDrawable(boolean z) {
            this.keepForegroundDrawable = z;
            return this;
        }

        public Builder needsOverlay(boolean z) {
            this.needsOverlay = z;
            return this;
        }

        public Builder needsRoundedCorner(boolean z) {
            this.needsRoundedCorner = z;
            return this;
        }

        public Builder needsShadow(boolean z) {
            this.needsShadow = z;
            return this;
        }

        public Builder options(Options options) {
            this.options = options;
            return this;
        }

        public Builder preferZOrder(boolean z) {
            this.preferZOrder = z;
            return this;
        }
    }

    public static final class Options {
        public static final Options DEFAULT = new Options();
        private int roundedCornerRadius = 0;
        private float dynamicShadowUnfocusedZ = -1.0f;
        private float dynamicShadowFocusedZ = -1.0f;

        public Options dynamicShadowZ(float f, float f2) {
            this.dynamicShadowUnfocusedZ = f;
            this.dynamicShadowFocusedZ = f2;
            return this;
        }

        public final float getDynamicShadowFocusedZ() {
            return this.dynamicShadowFocusedZ;
        }

        public final float getDynamicShadowUnfocusedZ() {
            return this.dynamicShadowUnfocusedZ;
        }

        public final int getRoundedCornerRadius() {
            return this.roundedCornerRadius;
        }

        public Options roundedCornerRadius(int i) {
            this.roundedCornerRadius = i;
            return this;
        }
    }

    public static Object getNoneWrapperDynamicShadowImpl(View view) {
        return view.getTag(androidx.leanback.R.id.lb_shadow_impl);
    }

    public static void setNoneWrapperOverlayColor(View view, int i) {
        Drawable foreground = ForegroundHelper.getForeground(view);
        if (foreground instanceof ColorDrawable) {
            ((ColorDrawable) foreground).setColor(i);
        } else {
            ForegroundHelper.setForeground(view, new ColorDrawable(i));
        }
    }

    public static void setNoneWrapperShadowFocusLevel(View view, float f) {
        setShadowFocusLevel(getNoneWrapperDynamicShadowImpl(view), 3, f);
    }

    public static boolean supportsDynamicShadow() {
        return ShadowHelper.supportsDynamicShadow();
    }

    public static boolean supportsForeground() {
        return ForegroundHelper.supportsForeground();
    }

    public static boolean supportsRoundedCorner() {
        return RoundedRectHelper.supportsRoundedCorner();
    }

    public static boolean supportsShadow() {
        return StaticShadowHelper.supportsShadow();
    }

    public ShadowOverlayContainer createShadowOverlayContainer(Context context) {
        if (needsWrapper()) {
            return new ShadowOverlayContainer(context, this.mShadowType, this.mNeedsOverlay, this.mUnfocusedZ, this.mFocusedZ, this.mRoundedCornerRadius);
        }
        throw new IllegalArgumentException();
    }

    public int getShadowType() {
        return this.mShadowType;
    }

    public boolean needsOverlay() {
        return this.mNeedsOverlay;
    }

    public boolean needsRoundedCorner() {
        return this.mNeedsRoundedCorner;
    }

    public boolean needsWrapper() {
        return this.mNeedsWrapper;
    }

    public void onViewCreated(View view) {
        if (needsWrapper()) {
            return;
        }
        if (!this.mNeedsShadow) {
            if (this.mNeedsRoundedCorner) {
                RoundedRectHelper.setClipToRoundedOutline(view, true, this.mRoundedCornerRadius);
            }
        } else if (this.mShadowType == 3) {
            view.setTag(androidx.leanback.R.id.lb_shadow_impl, ShadowHelper.addDynamicShadow(view, this.mUnfocusedZ, this.mFocusedZ, this.mRoundedCornerRadius));
        } else if (this.mNeedsRoundedCorner) {
            RoundedRectHelper.setClipToRoundedOutline(view, true, this.mRoundedCornerRadius);
        }
    }

    public void prepareParentForShadow(ViewGroup viewGroup) {
        if (this.mShadowType == 2) {
            StaticShadowHelper.prepareParent(viewGroup);
        }
    }

    public void setOverlayColor(View view, int i) {
        if (needsWrapper()) {
            ((ShadowOverlayContainer) view).setOverlayColor(i);
        } else {
            setNoneWrapperOverlayColor(view, i);
        }
    }

    public void setShadowFocusLevel(View view, float f) {
        if (needsWrapper()) {
            ((ShadowOverlayContainer) view).setShadowFocusLevel(f);
        } else {
            setShadowFocusLevel(getNoneWrapperDynamicShadowImpl(view), 3, f);
        }
    }

    public void setupDynamicShadowZ(Options options, Context context) {
        if (options.getDynamicShadowUnfocusedZ() >= 0.0f) {
            this.mFocusedZ = options.getDynamicShadowFocusedZ();
            this.mUnfocusedZ = options.getDynamicShadowUnfocusedZ();
        } else {
            Resources resources = context.getResources();
            this.mFocusedZ = resources.getDimension(androidx.leanback.R.dimen.lb_material_shadow_focused_z);
            this.mUnfocusedZ = resources.getDimension(androidx.leanback.R.dimen.lb_material_shadow_normal_z);
        }
    }

    public void setupRoundedCornerRadius(Options options, Context context) {
        if (options.getRoundedCornerRadius() == 0) {
            this.mRoundedCornerRadius = context.getResources().getDimensionPixelSize(androidx.leanback.R.dimen.lb_rounded_rect_corner_radius);
        } else {
            this.mRoundedCornerRadius = options.getRoundedCornerRadius();
        }
    }

    public static void setShadowFocusLevel(Object obj, int i, float f) {
        if (obj != null) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (i == 2) {
                StaticShadowHelper.setShadowFocusLevel(obj, f);
            } else {
                if (i != 3) {
                    return;
                }
                ShadowHelper.setShadowFocusLevel(obj, f);
            }
        }
    }
}
