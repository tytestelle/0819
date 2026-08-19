package com.github.tvbox.osc.ui.tv.CustomView;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.R$styleable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class CustomRecyclerView extends RecyclerView implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public boolean f3318O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f3319O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f3320O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f3321O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final int f3322O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public CustomRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3318O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = true;
        this.f3319O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
        this.f3320O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CustomRecyclerView);
        this.f3322O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = typedArrayObtainStyledAttributes.getLayoutDimension(0, this.f3322O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        typedArrayObtainStyledAttributes.recycle();
        setItemViewCacheSize(10);
        setItemAnimator(null);
        setHasFixedSize(true);
        setDescendantFocusability(262144);
        setChildrenDrawingOrderEnabled(true);
        setFocusable(true);
        setLayoutManager(new CustomLayoutManager(context));
        setDrawingCacheEnabled(true);
    }

    public static /* synthetic */ void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(CustomRecyclerView customRecyclerView, int i) {
        if (customRecyclerView.getAdapter() == null || i < 0 || i >= customRecyclerView.getItemCount()) {
            return;
        }
        View viewFindViewByPosition = customRecyclerView.getLayoutManager() != null ? customRecyclerView.getLayoutManager().findViewByPosition(i) : null;
        if (viewFindViewByPosition != null) {
            if (!customRecyclerView.hasFocus()) {
                customRecyclerView.onFocusChanged(true, 130, null);
            }
            viewFindViewByPosition.requestFocus();
        }
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        View viewFindViewByPosition;
        CustomLayoutManager customLayoutManager = (CustomLayoutManager) getLayoutManager();
        if (customLayoutManager == null || (viewFindViewByPosition = customLayoutManager.findViewByPosition(i)) == null) {
            return;
        }
        scrollBy(((viewFindViewByPosition.getWidth() / 2) + viewFindViewByPosition.getLeft()) - (getWidth() / 2), 0);
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        View viewFindViewByPosition;
        CustomLayoutManager customLayoutManager = (CustomLayoutManager) getLayoutManager();
        if (customLayoutManager == null || (viewFindViewByPosition = customLayoutManager.findViewByPosition(i)) == null) {
            return;
        }
        scrollBy(0, ((viewFindViewByPosition.getHeight() / 2) + viewFindViewByPosition.getTop()) - (getHeight() / 2));
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i) {
        CustomLayoutManager customLayoutManager = (CustomLayoutManager) getLayoutManager();
        if (customLayoutManager == null || i == -1) {
            return;
        }
        customLayoutManager.scrollToPositionWithOffset(i, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        View viewFindViewByPosition;
        if (hasFocus() || this.f3320O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o < 0 || (viewFindViewByPosition = getLayoutManager().findViewByPosition(this.f3320O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) == null) {
            super.addFocusables(arrayList, i, i2);
        } else if (viewFindViewByPosition.isFocusable()) {
            arrayList.add(viewFindViewByPosition);
        } else {
            super.addFocusables(arrayList, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View viewFocusSearch = super.focusSearch(view, i);
        if (view != null && viewFocusSearch != null && findContainingItemView(viewFocusSearch) == null) {
            if (!this.f3318O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO && (i == 130 || i == 33)) {
                return view;
            }
            if (!this.f3319O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO && (i == 17 || i == 66)) {
                return view;
            }
        }
        return viewFocusSearch;
    }

    public int getItemCount() {
        if (getAdapter() != null) {
            return getAdapter().getItemCount();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onChildAttachedToWindow(View view) {
        if (view.isFocusable() && view.getOnFocusChangeListener() == null) {
            view.setOnFocusChangeListener(this);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (view != null) {
            int childAdapterPosition = getChildAdapterPosition(view);
            boolean z2 = view instanceof RecyclerView;
            if (!z2) {
                view.setSelected(z);
            }
            if (!z || z2 || (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f3321O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) == null) {
                return;
            }
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(childAdapterPosition);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int i3 = this.f3322O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (i3 != 0 && i2 > (iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE))) {
            i2 = iMakeMeasureSpec;
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        hasFocus();
        super.requestChildFocus(view, view2);
        this.f3320O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = getChildViewHolder(view).getAdapterPosition();
    }

    public void setCanFocusOutHorizontal(boolean z) {
        this.f3319O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z;
    }

    public void setCanFocusOutVertical(boolean z) {
        this.f3318O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = z;
    }

    public void setOnItemListener(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        this.f3321O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    public void setSelection(int i) {
        post(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, i, 7));
    }

    public void setmCurrentFocusPosition(int i) {
        this.f3320O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
    }

    public void setFocusLostListener(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
    }

    public void setGainFocusListener(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
    }
}
