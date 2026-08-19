package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.bean.ShortcutsMenuItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final ArrayList f1285O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO f1286O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = f1285O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
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
        ShortcutsMenuItem shortcutsMenuItem;
        O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O o0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O = (O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O) viewHolder;
        String str = (String) f1285O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(o0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O.getLayoutPosition());
        boolean zEquals = ShortcutsMenuItem.MENU.equals(str);
        ImageView imageView = o0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O.f1283O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (zEquals) {
            imageView.setImageResource(R.drawable.menu_addmenu_icon);
        } else if (ShortcutsMenuItem.mapItems.containsKey(str) && (shortcutsMenuItem = ShortcutsMenuItem.mapItems.get(str)) != null) {
            imageView.setImageResource(shortcutsMenuItem.getIconResId());
        }
        if (com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo != 4) {
            o0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O.itemView.setBackground(LivePlayActivity.f2949O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO);
        } else if (i == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00) {
            o0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O.itemView.setBackground(LivePlayActivity.f2948O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O);
        } else {
            o0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O.itemView.setBackground(LivePlayActivity.f2949O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O(this, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_shortcuts_menu, viewGroup, false));
    }

    public void setOnItemClickListener(O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO o0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO) {
        this.f1286O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO;
    }
}
