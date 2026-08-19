package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
class ItemAlignmentFacetHelper {
    private static final Rect sRect = new Rect();

    private ItemAlignmentFacetHelper() {
    }

    public static int getAlignmentPosition(View view, ItemAlignmentFacet.ItemAlignmentDef itemAlignmentDef, int i) {
        View viewFindViewById;
        int opticalTopInset;
        GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
        int i2 = itemAlignmentDef.mViewId;
        if (i2 == 0 || (viewFindViewById = view.findViewById(i2)) == null) {
            viewFindViewById = view;
        }
        int opticalHeight = itemAlignmentDef.mOffset;
        if (i != 0) {
            if (itemAlignmentDef.mOffsetWithPadding) {
                float f = itemAlignmentDef.mOffsetPercent;
                if (f == 0.0f) {
                    opticalHeight += viewFindViewById.getPaddingTop();
                } else if (f == 100.0f) {
                    opticalHeight -= viewFindViewById.getPaddingBottom();
                }
            }
            if (itemAlignmentDef.mOffsetPercent != -1.0f) {
                opticalHeight += (int) (((viewFindViewById == view ? layoutParams.getOpticalHeight(viewFindViewById) : viewFindViewById.getHeight()) * itemAlignmentDef.mOffsetPercent) / 100.0f);
            }
            if (view != viewFindViewById) {
                Rect rect = sRect;
                rect.top = opticalHeight;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
                opticalTopInset = rect.top - layoutParams.getOpticalTopInset();
            } else {
                opticalTopInset = opticalHeight;
            }
            return itemAlignmentDef.isAlignedToTextViewBaseLine() ? opticalTopInset + viewFindViewById.getBaseline() : opticalTopInset;
        }
        if (view.getLayoutDirection() == 1) {
            int opticalWidth = (viewFindViewById == view ? layoutParams.getOpticalWidth(viewFindViewById) : viewFindViewById.getWidth()) - opticalHeight;
            if (itemAlignmentDef.mOffsetWithPadding) {
                float f2 = itemAlignmentDef.mOffsetPercent;
                if (f2 == 0.0f) {
                    opticalWidth -= viewFindViewById.getPaddingRight();
                } else if (f2 == 100.0f) {
                    opticalWidth += viewFindViewById.getPaddingLeft();
                }
            }
            if (itemAlignmentDef.mOffsetPercent != -1.0f) {
                opticalWidth -= (int) (((viewFindViewById == view ? layoutParams.getOpticalWidth(viewFindViewById) : viewFindViewById.getWidth()) * itemAlignmentDef.mOffsetPercent) / 100.0f);
            }
            if (view == viewFindViewById) {
                return opticalWidth;
            }
            Rect rect2 = sRect;
            rect2.right = opticalWidth;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect2);
            return rect2.right + layoutParams.getOpticalRightInset();
        }
        if (itemAlignmentDef.mOffsetWithPadding) {
            float f3 = itemAlignmentDef.mOffsetPercent;
            if (f3 == 0.0f) {
                opticalHeight += viewFindViewById.getPaddingLeft();
            } else if (f3 == 100.0f) {
                opticalHeight -= viewFindViewById.getPaddingRight();
            }
        }
        if (itemAlignmentDef.mOffsetPercent != -1.0f) {
            opticalHeight += (int) (((viewFindViewById == view ? layoutParams.getOpticalWidth(viewFindViewById) : viewFindViewById.getWidth()) * itemAlignmentDef.mOffsetPercent) / 100.0f);
        }
        int i3 = opticalHeight;
        if (view == viewFindViewById) {
            return i3;
        }
        Rect rect3 = sRect;
        rect3.left = i3;
        ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect3);
        return rect3.left - layoutParams.getOpticalLeftInset();
    }
}
