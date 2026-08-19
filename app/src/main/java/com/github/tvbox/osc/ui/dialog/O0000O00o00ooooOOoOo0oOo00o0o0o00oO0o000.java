package com.github.tvbox.osc.ui.dialog;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.util.ArrayList;
import java.util.Arrays;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final EditText f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final EditText f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o f3143O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final ArrayList f3144O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final TextView f3145O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final TextView f3146O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final LivePlayActivity f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final CustomRecyclerView f3148O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final ArrayList f3149O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final ArrayList f3150O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    public O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(LivePlayActivity livePlayActivity) {
        super(livePlayActivity);
        this.f3149O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new ArrayList(Arrays.asList("EPG时间偏移设置", "EPG缓存至外部储存"));
        this.f3150O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new ArrayList(Arrays.asList("关闭缓存", "每天2点", "每天4点", "每天6点", "每天8点", "每天10点", "每天12点", "每天14点", "每天16点", "每天18点", "每天20点", "每天22点"));
        this.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = livePlayActivity;
        setContentView(R.layout.dialog_url_edit);
        setCanceledOnTouchOutside(true);
        ((TextView) findViewById(R.id.title)).setText("EPG订阅");
        ImageView imageView = (ImageView) findViewById(R.id.ivQRCode);
        TextView textView = (TextView) findViewById(R.id.tvAddress);
        this.f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (EditText) findViewById(R.id.input_liveName);
        EditText editText = (EditText) findViewById(R.id.input_live);
        this.f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = editText;
        editText.setHint("地址(点击左侧提示按钮配置headers)");
        ((TextView) findViewById(R.id.typeHint)).setText("其他设置");
        ((TextView) findViewById(R.id.cacheHint)).setText("缓存");
        this.f3145O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (TextView) findViewById(R.id.cacheText);
        this.f3145O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setText((CharSequence) this.f3150O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.get(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o()));
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) findViewById(R.id.mLiveUrlGridView);
        this.f3148O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = customRecyclerView;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        ArrayList arrayList = (ArrayList) Hawk.get("live_epg_list", new ArrayList());
        this.f3144O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList;
        customRecyclerView.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1166O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = -1;
        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1167O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = livePlayActivity;
        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1168O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this;
        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1170O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = arrayList;
        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.setHasStableIds(true);
        this.f3143O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
        customRecyclerView.setAdapter(o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o);
        ((LinearLayout) findViewById(R.id.epgSetGroup)).setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.epgTypeGroup);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.epgCacheGroup);
        ImageView imageView2 = (ImageView) findViewById(R.id.urlTypeButton);
        imageView2.setVisibility(0);
        TextView textView2 = (TextView) findViewById(R.id.jsonButton);
        this.f3146O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = textView2;
        textView2.setVisibility(0);
        textView2.setText("XML");
        TextView textView3 = (TextView) findViewById(R.id.okButton);
        ImageView imageView3 = (ImageView) findViewById(R.id.urlClearButton);
        imageView3.requestFocus();
        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.setOnSelectListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, 13));
        textView2.setOnClickListener(new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(this));
        final int i = 0;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        ArrayList arrayList2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f3149O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                        LivePlayActivity livePlayActivity2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(livePlayActivity2, R.style.CustomDialogStyleDim);
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.setContentView(R.layout.dialog_theme);
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.setCanceledOnTouchOutside(true);
                        CustomRecyclerView customRecyclerView2 = (CustomRecyclerView) o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.findViewById(R.id.theme_GridView);
                        customRecyclerView2.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(livePlayActivity2, arrayList2);
                        customRecyclerView2.setAdapter(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setOnSelectListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, 13));
                        customRecyclerView2.setOnItemListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, 12));
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.show();
                        break;
                    case 1:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        ArrayList arrayList3 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3150O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                        LivePlayActivity livePlayActivity3 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(livePlayActivity3, R.style.CustomDialogStyleDim);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setContentView(R.layout.dialog_theme);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setCanceledOnTouchOutside(true);
                        CustomRecyclerView customRecyclerView3 = (CustomRecyclerView) o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.findViewById(R.id.theme_GridView);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f3107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = customRecyclerView3;
                        customRecyclerView3.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(livePlayActivity3, arrayList3);
                        customRecyclerView3.setAdapter(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setOnSelectListener(new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, 0));
                        customRecyclerView3.setOnItemListener(new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, 1));
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.show();
                        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        customRecyclerView3.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        customRecyclerView3.setSelection(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        break;
                    case 2:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        String string = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3146O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getText().toString();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(addressItem, strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            addressItem.setFormat(string);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3143O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList4 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3144O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (!z && arrayList4.contains(addressItem)) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            } else if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                AddressItem addressItem2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1172O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                int iIndexOf = arrayList4.indexOf(addressItem2);
                                if (iIndexOf != -1) {
                                    for (AddressItem addressItem3 : arrayList4) {
                                        if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                            break;
                                        }
                                    }
                                    if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1172O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isSelected()) {
                                        addressItem.setSelected(true);
                                        if (!TextUtils.isEmpty(addressItem.getRequestUrl())) {
                                            if ("XML".equals(addressItem.getFormat())) {
                                                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(addressItem, 2));
                                            }
                                        }
                                    }
                                    arrayList4.set(iIndexOf, addressItem);
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.notifyItemChanged(iIndexOf);
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                    Hawk.put("live_epg_list", arrayList4);
                                } else {
                                    o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                }
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            } else {
                                o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                            }
                        }
                        break;
                    case 3:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3143O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.getClass();
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(1, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.dismiss();
                        break;
                }
            }
        });
        final int i2 = 1;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        ArrayList arrayList2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f3149O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                        LivePlayActivity livePlayActivity2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(livePlayActivity2, R.style.CustomDialogStyleDim);
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.setContentView(R.layout.dialog_theme);
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.setCanceledOnTouchOutside(true);
                        CustomRecyclerView customRecyclerView2 = (CustomRecyclerView) o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.findViewById(R.id.theme_GridView);
                        customRecyclerView2.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(livePlayActivity2, arrayList2);
                        customRecyclerView2.setAdapter(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setOnSelectListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, 13));
                        customRecyclerView2.setOnItemListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, 12));
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.show();
                        break;
                    case 1:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        ArrayList arrayList3 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3150O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                        LivePlayActivity livePlayActivity3 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(livePlayActivity3, R.style.CustomDialogStyleDim);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setContentView(R.layout.dialog_theme);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setCanceledOnTouchOutside(true);
                        CustomRecyclerView customRecyclerView3 = (CustomRecyclerView) o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.findViewById(R.id.theme_GridView);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f3107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = customRecyclerView3;
                        customRecyclerView3.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(livePlayActivity3, arrayList3);
                        customRecyclerView3.setAdapter(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setOnSelectListener(new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, 0));
                        customRecyclerView3.setOnItemListener(new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, 1));
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.show();
                        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        customRecyclerView3.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        customRecyclerView3.setSelection(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        break;
                    case 2:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        String string = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3146O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getText().toString();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(addressItem, strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            addressItem.setFormat(string);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3143O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList4 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3144O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (!z && arrayList4.contains(addressItem)) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            } else if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                AddressItem addressItem2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1172O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                int iIndexOf = arrayList4.indexOf(addressItem2);
                                if (iIndexOf != -1) {
                                    for (AddressItem addressItem3 : arrayList4) {
                                        if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                            break;
                                        }
                                    }
                                    if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1172O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isSelected()) {
                                        addressItem.setSelected(true);
                                        if (!TextUtils.isEmpty(addressItem.getRequestUrl())) {
                                            if ("XML".equals(addressItem.getFormat())) {
                                                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(addressItem, 2));
                                            }
                                        }
                                    }
                                    arrayList4.set(iIndexOf, addressItem);
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.notifyItemChanged(iIndexOf);
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                    Hawk.put("live_epg_list", arrayList4);
                                } else {
                                    o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                }
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            } else {
                                o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                            }
                        }
                        break;
                    case 3:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3143O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.getClass();
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(1, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.dismiss();
                        break;
                }
            }
        });
        final int i3 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        ArrayList arrayList2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f3149O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                        LivePlayActivity livePlayActivity2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(livePlayActivity2, R.style.CustomDialogStyleDim);
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.setContentView(R.layout.dialog_theme);
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.setCanceledOnTouchOutside(true);
                        CustomRecyclerView customRecyclerView2 = (CustomRecyclerView) o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.findViewById(R.id.theme_GridView);
                        customRecyclerView2.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(livePlayActivity2, arrayList2);
                        customRecyclerView2.setAdapter(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setOnSelectListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, 13));
                        customRecyclerView2.setOnItemListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, 12));
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.show();
                        break;
                    case 1:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        ArrayList arrayList3 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3150O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                        LivePlayActivity livePlayActivity3 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(livePlayActivity3, R.style.CustomDialogStyleDim);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setContentView(R.layout.dialog_theme);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setCanceledOnTouchOutside(true);
                        CustomRecyclerView customRecyclerView3 = (CustomRecyclerView) o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.findViewById(R.id.theme_GridView);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f3107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = customRecyclerView3;
                        customRecyclerView3.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(livePlayActivity3, arrayList3);
                        customRecyclerView3.setAdapter(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setOnSelectListener(new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, 0));
                        customRecyclerView3.setOnItemListener(new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, 1));
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.show();
                        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        customRecyclerView3.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        customRecyclerView3.setSelection(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        break;
                    case 2:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        String string = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3146O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getText().toString();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(addressItem, strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            addressItem.setFormat(string);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3143O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList4 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3144O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (!z && arrayList4.contains(addressItem)) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            } else if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                AddressItem addressItem2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1172O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                int iIndexOf = arrayList4.indexOf(addressItem2);
                                if (iIndexOf != -1) {
                                    for (AddressItem addressItem3 : arrayList4) {
                                        if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                            break;
                                        }
                                    }
                                    if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1172O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isSelected()) {
                                        addressItem.setSelected(true);
                                        if (!TextUtils.isEmpty(addressItem.getRequestUrl())) {
                                            if ("XML".equals(addressItem.getFormat())) {
                                                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(addressItem, 2));
                                            }
                                        }
                                    }
                                    arrayList4.set(iIndexOf, addressItem);
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.notifyItemChanged(iIndexOf);
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                    Hawk.put("live_epg_list", arrayList4);
                                } else {
                                    o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                }
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            } else {
                                o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                            }
                        }
                        break;
                    case 3:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3143O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.getClass();
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(1, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.dismiss();
                        break;
                }
            }
        });
        final int i4 = 3;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        ArrayList arrayList2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f3149O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                        LivePlayActivity livePlayActivity2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(livePlayActivity2, R.style.CustomDialogStyleDim);
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.setContentView(R.layout.dialog_theme);
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.setCanceledOnTouchOutside(true);
                        CustomRecyclerView customRecyclerView2 = (CustomRecyclerView) o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.findViewById(R.id.theme_GridView);
                        customRecyclerView2.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(livePlayActivity2, arrayList2);
                        customRecyclerView2.setAdapter(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setOnSelectListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, 13));
                        customRecyclerView2.setOnItemListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, 12));
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.show();
                        break;
                    case 1:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        ArrayList arrayList3 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3150O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                        LivePlayActivity livePlayActivity3 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(livePlayActivity3, R.style.CustomDialogStyleDim);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setContentView(R.layout.dialog_theme);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setCanceledOnTouchOutside(true);
                        CustomRecyclerView customRecyclerView3 = (CustomRecyclerView) o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.findViewById(R.id.theme_GridView);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f3107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = customRecyclerView3;
                        customRecyclerView3.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(livePlayActivity3, arrayList3);
                        customRecyclerView3.setAdapter(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setOnSelectListener(new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, 0));
                        customRecyclerView3.setOnItemListener(new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, 1));
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.show();
                        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        customRecyclerView3.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        customRecyclerView3.setSelection(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        break;
                    case 2:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        String string = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3146O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getText().toString();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(addressItem, strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            addressItem.setFormat(string);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3143O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList4 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3144O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (!z && arrayList4.contains(addressItem)) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            } else if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                AddressItem addressItem2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1172O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                int iIndexOf = arrayList4.indexOf(addressItem2);
                                if (iIndexOf != -1) {
                                    for (AddressItem addressItem3 : arrayList4) {
                                        if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                            break;
                                        }
                                    }
                                    if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1172O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isSelected()) {
                                        addressItem.setSelected(true);
                                        if (!TextUtils.isEmpty(addressItem.getRequestUrl())) {
                                            if ("XML".equals(addressItem.getFormat())) {
                                                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(addressItem, 2));
                                            }
                                        }
                                    }
                                    arrayList4.set(iIndexOf, addressItem);
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.notifyItemChanged(iIndexOf);
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                    Hawk.put("live_epg_list", arrayList4);
                                } else {
                                    o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                }
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            } else {
                                o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                            }
                        }
                        break;
                    case 3:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3143O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.getClass();
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(1, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.dismiss();
                        break;
                }
            }
        });
        imageView2.setOnClickListener(new O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(this, 0));
        textView.setText("扫码输入(点击二维码查看说明)\n" + LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
        imageView.setImageBitmap(LivePlayActivity.f2946O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO);
        final int i5 = 4;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        ArrayList arrayList2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f3149O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                        LivePlayActivity livePlayActivity2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(livePlayActivity2, R.style.CustomDialogStyleDim);
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.setContentView(R.layout.dialog_theme);
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.setCanceledOnTouchOutside(true);
                        CustomRecyclerView customRecyclerView2 = (CustomRecyclerView) o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.findViewById(R.id.theme_GridView);
                        customRecyclerView2.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(livePlayActivity2, arrayList2);
                        customRecyclerView2.setAdapter(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setOnSelectListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, 13));
                        customRecyclerView2.setOnItemListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, 12));
                        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.show();
                        break;
                    case 1:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        ArrayList arrayList3 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3150O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                        LivePlayActivity livePlayActivity3 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(livePlayActivity3, R.style.CustomDialogStyleDim);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setContentView(R.layout.dialog_theme);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setCanceledOnTouchOutside(true);
                        CustomRecyclerView customRecyclerView3 = (CustomRecyclerView) o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.findViewById(R.id.theme_GridView);
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f3107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = customRecyclerView3;
                        customRecyclerView3.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(livePlayActivity3, arrayList3);
                        customRecyclerView3.setAdapter(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setOnSelectListener(new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, 0));
                        customRecyclerView3.setOnItemListener(new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, 1));
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.show();
                        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        customRecyclerView3.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        customRecyclerView3.setSelection(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        break;
                    case 2:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        String string = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3146O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getText().toString();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(addressItem, strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            addressItem.setFormat(string);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3143O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList4 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.f3144O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (!z && arrayList4.contains(addressItem)) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            } else if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                AddressItem addressItem2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1172O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                int iIndexOf = arrayList4.indexOf(addressItem2);
                                if (iIndexOf != -1) {
                                    for (AddressItem addressItem3 : arrayList4) {
                                        if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                            break;
                                        }
                                    }
                                    if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1172O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isSelected()) {
                                        addressItem.setSelected(true);
                                        if (!TextUtils.isEmpty(addressItem.getRequestUrl())) {
                                            if ("XML".equals(addressItem.getFormat())) {
                                                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(addressItem, 2));
                                            }
                                        }
                                    }
                                    arrayList4.set(iIndexOf, addressItem);
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.notifyItemChanged(iIndexOf);
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                    Hawk.put("live_epg_list", arrayList4);
                                } else {
                                    o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                }
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            } else {
                                o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o002.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                            }
                        }
                        break;
                    case 3:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o003.f3143O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004 = this.f3136O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.getClass();
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(1, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o004.dismiss();
                        break;
                }
            }
        });
        if (O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this)) {
            return;
        }
        O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this);
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(AddressItem addressItem) {
        ArrayList arrayList = this.f3144O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        arrayList.add(addressItem);
        int iIndexOf = arrayList.indexOf(addressItem);
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = this.f3143O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.notifyItemInserted(iIndexOf);
        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.notifyItemChanged(arrayList.indexOf(addressItem));
        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1169O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        Hawk.put("live_epg_list", arrayList);
        this.f3148O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.scrollToPosition(arrayList.indexOf(addressItem));
    }

    @O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(threadMode = ThreadMode.MAIN)
    public void refresh(O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        int i = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f973O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        String str = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f974O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i == 1) {
            this.f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(str);
        }
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f973O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 2) {
            this.f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(str);
        }
    }
}
