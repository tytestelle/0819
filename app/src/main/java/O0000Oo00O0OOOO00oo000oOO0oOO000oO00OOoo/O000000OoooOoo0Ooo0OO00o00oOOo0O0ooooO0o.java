package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.tv.CustomView.MarqueeTextView;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ArrayList f1097O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f1098O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f1097O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = arrayList2;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1097O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) viewHolder;
        int layoutPosition = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getLayoutPosition();
        MarqueeTextView marqueeTextView = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1093O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (layoutPosition == 9) {
            marqueeTextView.setBackgroundResource(R.drawable.custom_colors_icon);
        } else {
            int color = Color.parseColor(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) this.f1097O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(layoutPosition)).f964O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            Drawable background = marqueeTextView.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(color);
            }
        }
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1094O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setVisibility(layoutPosition == ((Integer) Hawk.get("背景色系", Integer.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1441O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO))).intValue() ? 0 : 8);
        int i2 = com.github.tvbox.osc.ui.dialog.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        MarqueeTextView marqueeTextView2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1095O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (i2 == 1 && ((com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 == 0 || com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo == 4) && layoutPosition == com.github.tvbox.osc.ui.dialog.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000)) {
            marqueeTextView2.setBackgroundResource(R.drawable.shape_menulist_item_hasfocus);
        } else {
            marqueeTextView2.setBackgroundResource(R.drawable.shape_theme_item_drawable);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_theme_colors, viewGroup, false));
    }

    public void setOnSelectListener(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        this.f1098O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }
}
