package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O extends O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public com.github.tvbox.osc.ui.dialog.O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 f1112O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    @Override // O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return 0;
    }

    @Override // O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO */
    public final void onBindViewHolder(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, int i) {
        String str = (String) this.f1315O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(i);
        boolean zBooleanValue = ((Boolean) Hawk.get("EPG缓存路径", Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1485O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo))).booleanValue();
        if (i == 1 && zBooleanValue) {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1313O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("√ " + str);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1313O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setTextColor(this.f1314O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
        } else {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1313O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(str);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1313O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setTextColor(-1);
        }
        if (this.f1316O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == i) {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1313O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setTextColor(-1);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.itemView.setBackgroundResource(R.drawable.shape_recycleview_item_selected);
        } else {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.itemView.setBackgroundResource(R.drawable.shape_recycleview_item_no_selected);
        }
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.itemView.setOnClickListener(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, i, 0));
    }

    @Override // O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        if (i != 0) {
            boolean zBooleanValue = ((Boolean) Hawk.get("EPG缓存路径", Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1485O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo))).booleanValue();
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0("EPG缓存路径", !zBooleanValue);
            if (zBooleanValue) {
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "重启生效，缓存设置为内部储存");
                return;
            } else {
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "重启生效，缓存设置为外部储存，部分设备可能出现程序出错");
                return;
            }
        }
        if (this.f1112O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
            LivePlayActivity livePlayActivity = this.f1314O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            com.github.tvbox.osc.ui.dialog.O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = new com.github.tvbox.osc.ui.dialog.O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00(livePlayActivity);
            o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.setContentView(R.layout.dialog_theme);
            o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.setCanceledOnTouchOutside(true);
            CustomRecyclerView customRecyclerView = (CustomRecyclerView) o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.findViewById(R.id.theme_GridView);
            o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f3291O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = customRecyclerView;
            customRecyclerView.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
            ArrayList arrayList = com.github.tvbox.osc.ui.dialog.O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f3290O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O = new O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O();
            ArrayList arrayList2 = new ArrayList();
            o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.f1295O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = arrayList2;
            o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.f1296O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = -1;
            o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.f1297O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = livePlayActivity;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f3292O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O;
            customRecyclerView.setAdapter(o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O);
            o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.setOnSelectListener(new com.github.tvbox.osc.ui.dialog.O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00(o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00));
            customRecyclerView.setOnItemListener(new com.github.tvbox.osc.ui.dialog.O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00(o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00));
            this.f1112O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;
        }
        this.f1112O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.show();
        com.github.tvbox.osc.ui.dialog.O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O01 = this.f1112O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O01.getClass();
        int iO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
        CustomRecyclerView customRecyclerView2 = o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O01.f3291O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (customRecyclerView2 != null) {
            customRecyclerView2.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
            customRecyclerView2.setSelection(iO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
        }
    }
}
