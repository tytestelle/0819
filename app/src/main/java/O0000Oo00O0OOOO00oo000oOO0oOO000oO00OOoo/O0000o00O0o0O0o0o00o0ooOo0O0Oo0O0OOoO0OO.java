package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.MarqueeTextView;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ArrayList f1291O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo f1292O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final LivePlayActivity f1293O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO(LivePlayActivity livePlayActivity, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f1291O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = arrayList2;
        this.f1293O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = livePlayActivity;
        setHasStableIds(true);
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1291O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
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
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = (O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) viewHolder;
        int layoutPosition = o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.getLayoutPosition();
        TypedArray typedArrayObtainStyledAttributes = this.f1293O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.obtainStyledAttributes(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) this.f1291O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(layoutPosition)).f965O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, new int[]{R.attr.color_theme});
        int color = typedArrayObtainStyledAttributes.getColor(0, -16777216);
        typedArrayObtainStyledAttributes.recycle();
        Drawable background = o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.f1287O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(color);
        }
        o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.f1289O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setVisibility(layoutPosition != ((Integer) Hawk.get("主题切换", Integer.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1440O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0))).intValue() ? 8 : 0);
        int i2 = com.github.tvbox.osc.ui.dialog.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        MarqueeTextView marqueeTextView = o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.f1288O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i2 == 0 && ((com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 == 0 || com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo == 4) && layoutPosition == com.github.tvbox.osc.ui.dialog.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO)) {
            marqueeTextView.setBackgroundResource(R.drawable.shape_menulist_item_hasfocus);
        } else {
            marqueeTextView.setBackgroundResource(R.drawable.shape_theme_item_drawable);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo(this, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_theme_colors, viewGroup, false));
    }

    public void setOnSelectListener(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo o0000o000OO0OoOo0o00oO0OOo0O00o000000OOo) {
        this.f1292O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000o000OO0OoOo0o00oO0OOo0O00o000000OOo;
    }
}
