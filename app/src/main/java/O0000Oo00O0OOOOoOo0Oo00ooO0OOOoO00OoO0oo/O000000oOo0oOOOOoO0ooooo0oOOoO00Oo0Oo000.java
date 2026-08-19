package O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.base.App;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f1318O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f1319O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 1;

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        this.f1318O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (int) TypedValue.applyDimension(1, i, App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getResources().getDisplayMetrics());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.f1319O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i2 = this.f1318O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (childAdapterPosition >= 0 && i == -1) {
            rect.left = childAdapterPosition == 0 ? 0 : i2 / 2;
            rect.right = childAdapterPosition != recyclerView.getAdapter().getItemCount() + (-1) ? i2 / 2 : 0;
            return;
        }
        if (childAdapterPosition < 0 || i <= 0) {
            rect.left = 0;
            rect.right = 0;
            rect.top = 0;
            rect.bottom = 0;
            return;
        }
        int i3 = childAdapterPosition % i;
        rect.left = (i3 * i2) / i;
        rect.right = i2 - (((i3 + 1) * i2) / i);
        if (childAdapterPosition >= i) {
            rect.top = i2;
        }
    }
}
