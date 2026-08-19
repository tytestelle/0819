package com.github.tvbox.osc.ui.tv.CustomView;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class CustomLayoutManager extends LinearLayoutManager {
    public CustomLayoutManager(Context context) {
        super(context);
        setRecycleChildrenOnDetach(true);
        setAutoMeasureEnabled(false);
    }

    private int getSpanCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int getExtraLayoutSpace(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View focusedChild;
        int i2;
        int i3;
        if (super.onFocusSearchFailed(view, i, recycler, state) == null || (focusedChild = getFocusedChild()) == null) {
            return null;
        }
        int position = getPosition(focusedChild);
        int spanCount = getSpanCount();
        int orientation = getOrientation();
        if (orientation == 1) {
            if (i == 17) {
                spanCount = -1;
            } else if (i == 33) {
                spanCount = -spanCount;
            } else if (i == 66) {
                spanCount = 1;
            } else if (i != 130) {
                spanCount = 0;
            }
        } else if (orientation != 0) {
            spanCount = 0;
        } else if (i == 17) {
            spanCount = -spanCount;
        } else if (i == 33) {
            spanCount = -1;
        } else if (i != 66) {
            if (i != 130) {
                spanCount = 0;
            } else {
                spanCount = 1;
            }
        }
        int spanCount2 = getSpanCount();
        // The decompiler produced an OR here for the linear-position bounds check.
        // That makes almost every out-of-range position pass.  The intended check is
        // the same bounded-range test used by the span branch below.
        if (Math.abs(spanCount) != 1 ? ((i2 = position + spanCount) >= 0 && i2 < spanCount2)
                : ((i3 = (position % spanCount2) + spanCount) >= 0 && i3 < spanCount2)) {
            position += spanCount;
        }
        return findViewByPosition(position);
    }

    public CustomLayoutManager(Context context, int i) {
        super(context, 0, false);
        setRecycleChildrenOnDetach(true);
        setAutoMeasureEnabled(false);
    }
}
