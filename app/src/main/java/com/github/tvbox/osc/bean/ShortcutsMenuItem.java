package com.github.tvbox.osc.bean;

import O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
import androidx.media3.common.util.UnstableApi;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.dialog.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;
import com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
import com.player.ku9py.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class ShortcutsMenuItem {
    public static String ABOUT = "APP信息";
    public static String BACKUP = "数据备份";
    public static String CHANNELLIST = "列表订阅";
    public static String DEVICE_CAST = "无线投屏";
    public static String EPGLIST = "EPG订阅";
    public static String EQUIPMENT = "设备信息";
    public static String GROUPCONFIG = "分组配置";
    public static String HEADERS = "Headers";
    public static String INTERFACESETTING = "界面设置";
    public static String JSON_PARSE = "JSON解析";
    public static String MENU = "自定义";
    public static String MENU_PUSH = "频道推送";
    public static String PLAYMES = "媒体信息";
    public static String SEARCH = "频道搜索";
    public static String SET = "设置";
    public static String TRACK = "轨道切换";
    public static String UALIST = "UserAgent";
    public static final Map<String, Runnable> functionMap;
    public static Map<String, ShortcutsMenuItem> mapItems;
    public static List<ShortcutsMenuItem> menuItems;
    private String function;
    private int iconResId;
    private boolean isSelected;

    static {
        HashMap map = new HashMap();
        functionMap = map;
        mapItems = new HashMap();
        map.put(SET, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(0));
        map.put(SEARCH, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(13));
        map.put(CHANNELLIST, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(14));
        map.put(EPGLIST, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(15));
        map.put(UALIST, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(1));
        map.put(HEADERS, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(2));
        map.put(GROUPCONFIG, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(3));
        map.put(TRACK, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(4));
        map.put(PLAYMES, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(5));
        map.put(EQUIPMENT, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(6));
        map.put(ABOUT, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(7));
        map.put(INTERFACESETTING, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(8));
        map.put(BACKUP, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(9));
        map.put(MENU_PUSH, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(10));
        map.put(JSON_PARSE, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(11));
        map.put(DEVICE_CAST, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(12));
        Map<String, ShortcutsMenuItem> map2 = mapItems;
        String str = SET;
        map2.put(str, new ShortcutsMenuItem(R.drawable.menu_set_icon, str));
        Map<String, ShortcutsMenuItem> map3 = mapItems;
        String str2 = PLAYMES;
        map3.put(str2, new ShortcutsMenuItem(R.drawable.menu_playemes_icon, str2));
        Map<String, ShortcutsMenuItem> map4 = mapItems;
        String str3 = CHANNELLIST;
        map4.put(str3, new ShortcutsMenuItem(R.drawable.menu_channel_icon, str3));
        Map<String, ShortcutsMenuItem> map5 = mapItems;
        String str4 = EPGLIST;
        map5.put(str4, new ShortcutsMenuItem(R.drawable.menu_epg_icon, str4));
        Map<String, ShortcutsMenuItem> map6 = mapItems;
        String str5 = HEADERS;
        map6.put(str5, new ShortcutsMenuItem(R.drawable.menu_headers_icon, str5));
        Map<String, ShortcutsMenuItem> map7 = mapItems;
        String str6 = UALIST;
        map7.put(str6, new ShortcutsMenuItem(R.drawable.menu_ua_icon, str6));
        Map<String, ShortcutsMenuItem> map8 = mapItems;
        String str7 = SEARCH;
        map8.put(str7, new ShortcutsMenuItem(R.drawable.menu_search_icon, str7));
        Map<String, ShortcutsMenuItem> map9 = mapItems;
        String str8 = TRACK;
        map9.put(str8, new ShortcutsMenuItem(R.drawable.menu_track_icon, str8));
        Map<String, ShortcutsMenuItem> map10 = mapItems;
        String str9 = EQUIPMENT;
        map10.put(str9, new ShortcutsMenuItem(R.drawable.menu_equipment_icon, str9));
        Map<String, ShortcutsMenuItem> map11 = mapItems;
        String str10 = ABOUT;
        map11.put(str10, new ShortcutsMenuItem(R.drawable.menu_about_icon, str10));
        Map<String, ShortcutsMenuItem> map12 = mapItems;
        String str11 = INTERFACESETTING;
        map12.put(str11, new ShortcutsMenuItem(R.drawable.menu_interface_icon, str11));
        Map<String, ShortcutsMenuItem> map13 = mapItems;
        String str12 = BACKUP;
        map13.put(str12, new ShortcutsMenuItem(R.drawable.menu_backup_icon, str12));
        Map<String, ShortcutsMenuItem> map14 = mapItems;
        String str13 = MENU_PUSH;
        map14.put(str13, new ShortcutsMenuItem(R.drawable.menu_push_icon, str13));
        Map<String, ShortcutsMenuItem> map15 = mapItems;
        String str14 = JSON_PARSE;
        map15.put(str14, new ShortcutsMenuItem(R.drawable.menu_json_icon, str14));
        Map<String, ShortcutsMenuItem> map16 = mapItems;
        String str15 = DEVICE_CAST;
        map16.put(str15, new ShortcutsMenuItem(R.drawable.menu_cast_icon, str15));
        List<String> listAsList = Arrays.asList(SET, PLAYMES, CHANNELLIST, EPGLIST, HEADERS, UALIST, SEARCH, TRACK, EQUIPMENT, ABOUT, INTERFACESETTING, BACKUP, MENU_PUSH, JSON_PARSE, DEVICE_CAST);
        menuItems = new ArrayList();
        for (String str16 : listAsList) {
            if (mapItems.containsKey(str16)) {
                menuItems.add(mapItems.get(str16));
            }
        }
    }

    public ShortcutsMenuItem(int i, String str) {
        this.iconResId = i;
        this.function = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$10() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$11() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$12() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$13() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$14() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$15() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$2() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$3() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$4() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$5() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$6() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$7() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$static$8() {
        O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
        o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.getClass();
        new O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$9() {
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
    }

    public String getFunction() {
        return this.function;
    }

    public int getIconResId() {
        return this.iconResId;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }
}
