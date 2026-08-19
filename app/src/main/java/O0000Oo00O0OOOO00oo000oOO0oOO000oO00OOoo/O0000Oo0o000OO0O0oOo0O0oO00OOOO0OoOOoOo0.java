package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.bean.ShortcutsMenuItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 extends RecyclerView.Adapter implements View.OnClickListener, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LivePlayActivity f1256O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ArrayList f1257O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 f1258O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f1259O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public int f1260O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0(LivePlayActivity livePlayActivity, List list) {
        ArrayList arrayList = new ArrayList();
        this.f1257O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = arrayList;
        this.f1259O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = -1;
        this.f1260O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = -1;
        this.f1256O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
        arrayList.clear();
        arrayList.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1257O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
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
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000) viewHolder;
        o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.itemView.setTag(Integer.valueOf(i));
        ArrayList arrayList = this.f1257O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        String function = ((ShortcutsMenuItem) arrayList.get(i)).getFunction();
        int iconResId = ((ShortcutsMenuItem) arrayList.get(i)).getIconResId();
        boolean zIsSelected = ((ShortcutsMenuItem) arrayList.get(i)).isSelected();
        o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.f1253O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(function);
        o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.f1254O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setImageResource(iconResId);
        ImageView imageView = o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.f1255O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        imageView.setImageResource(R.drawable.shape_subscript_drawable);
        imageView.setVisibility(zIsSelected ? 0 : 8);
        if (i == this.f1260O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.itemView.setBackgroundResource(R.drawable.shape_menulist_item_hasfocus);
        } else if (zIsSelected) {
            o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.itemView.setBackgroundResource(R.drawable.shape_menulist_item_isselected);
        } else {
            o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.itemView.setBackgroundResource(R.drawable.shape_menulist_item_drawable);
        }
        o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.itemView.setOnClickListener(this);
        o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.itemView.setOnFocusChangeListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        com.github.tvbox.osc.ui.dialog.O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 = (com.github.tvbox.osc.ui.dialog.O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00) ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) this.f1258O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00.getClass();
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        ArrayList arrayList = new ArrayList();
        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        ArrayList arrayList2 = (ArrayList) Hawk.get("Shortcuts_ENU_list", arrayList);
        ShortcutsMenuItem shortcutsMenuItem = ShortcutsMenuItem.menuItems.get(iIntValue);
        String function = shortcutsMenuItem.getFunction();
        boolean zContains = arrayList2.contains(function);
        if (zContains) {
            arrayList2.remove(function);
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, shortcutsMenuItem.getFunction() + " 已从快捷菜单中移除");
            shortcutsMenuItem.setSelected(false);
        } else {
            arrayList2.add(function);
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, shortcutsMenuItem.getFunction() + " 已添加至快捷菜单");
        }
        shortcutsMenuItem.setSelected(!zContains);
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        Hawk.put("Shortcuts_ENU_list", arrayList2);
        O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
        o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO.getClass();
        ArrayList arrayList3 = O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO.f1285O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO.notifyDataSetChanged();
        O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00.f3200O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i = o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.f1259O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.f1259O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = iIntValue;
        if (i != -1) {
            o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.notifyItemChanged(i);
        }
        int i2 = o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.f1259O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (i2 != -1) {
            o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.notifyItemChanged(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.f1256O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).inflate(R.layout.item_menu_list, viewGroup, false);
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000(viewInflate);
        o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.f1253O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) viewInflate.findViewById(R.id.menuName);
        o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.f1254O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (ImageView) viewInflate.findViewById(R.id.menuIcon);
        o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.f1255O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (ImageView) viewInflate.findViewById(R.id.badgeContainer);
        return o0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (z) {
            int i = this.f1260O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            this.f1260O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = iIntValue;
            if (i != -1) {
                notifyItemChanged(i);
            }
            int i2 = this.f1260O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            if (i2 != -1) {
                notifyItemChanged(i2);
                return;
            }
            return;
        }
        int i3 = this.f1260O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.f1260O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = -1;
        if (i3 != -1) {
            notifyItemChanged(i3);
        }
        int i4 = this.f1260O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (i4 != -1) {
            notifyItemChanged(i4);
        }
    }

    public void setOnSelectListener(O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0) {
        this.f1258O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
    }
}
