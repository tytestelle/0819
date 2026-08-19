package O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;

import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.LinearSmoothScroller;
import com.github.tvbox.osc.ui.tv.CustomView.TopLinearLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo extends LinearSmoothScroller {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ TopLinearLayoutManager f1320O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(TopLinearLayoutManager topLinearLayoutManager, Context context) {
        super(context);
        this.f1320O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = topLinearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public final PointF computeScrollVectorForPosition(int i) {
        return this.f1320O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.computeScrollVectorForPosition(i);
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int getVerticalSnapPreference() {
        return -1;
    }
}
