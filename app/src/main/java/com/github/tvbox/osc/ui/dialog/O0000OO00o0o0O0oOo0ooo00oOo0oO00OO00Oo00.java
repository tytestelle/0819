package com.github.tvbox.osc.ui.dialog;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0;
import androidx.recyclerview.widget.GridLayoutManager;
import com.github.tvbox.osc.bean.ShortcutsMenuItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final CustomRecyclerView f3199O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 f3200O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(LivePlayActivity livePlayActivity) {
        super(livePlayActivity);
        setContentView(R.layout.dialog_shortcuts_menu);
        setCanceledOnTouchOutside(true);
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) findViewById(R.id.shortcuts_GridView);
        this.f3199O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = customRecyclerView;
        customRecyclerView.setLayoutManager(new GridLayoutManager(livePlayActivity, 5));
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        ArrayList arrayList = new ArrayList();
        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        ArrayList arrayList2 = (ArrayList) Hawk.get("Shortcuts_ENU_list", arrayList);
        for (ShortcutsMenuItem shortcutsMenuItem : ShortcutsMenuItem.menuItems) {
            shortcutsMenuItem.setSelected(arrayList2.contains(shortcutsMenuItem.getFunction()));
        }
        O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = new O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0(livePlayActivity, ShortcutsMenuItem.menuItems);
        this.f3200O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0;
        this.f3199O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setAdapter(o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0);
        o0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.setOnSelectListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, 17));
    }
}
