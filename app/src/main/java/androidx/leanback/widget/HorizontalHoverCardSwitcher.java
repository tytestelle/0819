package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class HorizontalHoverCardSwitcher extends PresenterSwitcher {
    int mCardLeft;
    int mCardRight;
    private int[] mTmpOffsets = new int[2];
    private Rect mTmpRect = new Rect();

    @Override // androidx.leanback.widget.PresenterSwitcher
    public void insertView(View view) {
        getParentViewGroup().addView(view);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    @Override // androidx.leanback.widget.PresenterSwitcher
    public void onViewSelected(View view) {
        int width = getParentViewGroup().getWidth() - getParentViewGroup().getPaddingRight();
        int paddingLeft = getParentViewGroup().getPaddingLeft();
        view.measure(0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z = view.getLayoutDirection() == 1;
        if (!z) {
            if (view.getMeasuredWidth() + this.mCardLeft > width) {
                marginLayoutParams.leftMargin = width - view.getMeasuredWidth();
            } else if (!z && this.mCardLeft < paddingLeft) {
                marginLayoutParams.leftMargin = paddingLeft;
            } else if (z) {
                marginLayoutParams.leftMargin = this.mCardRight - view.getMeasuredWidth();
            } else {
                marginLayoutParams.leftMargin = this.mCardLeft;
            }
        } else if (!z) {
            if (z) {
                marginLayoutParams.leftMargin = this.mCardRight - view.getMeasuredWidth();
            } else {
                marginLayoutParams.leftMargin = this.mCardLeft;
            }
        } else if (z) {
            marginLayoutParams.leftMargin = this.mCardRight - view.getMeasuredWidth();
        } else {
            marginLayoutParams.leftMargin = this.mCardLeft;
        }
        view.requestLayout();
    }

    public void select(HorizontalGridView horizontalGridView, View view, Object obj) {
        ViewGroup parentViewGroup = getParentViewGroup();
        horizontalGridView.getViewSelectedOffsets(view, this.mTmpOffsets);
        this.mTmpRect.set(0, 0, view.getWidth(), view.getHeight());
        parentViewGroup.offsetDescendantRectToMyCoords(view, this.mTmpRect);
        Rect rect = this.mTmpRect;
        int i = rect.left;
        int i2 = this.mTmpOffsets[0];
        this.mCardLeft = i - i2;
        this.mCardRight = rect.right - i2;
        select(obj);
    }
}
