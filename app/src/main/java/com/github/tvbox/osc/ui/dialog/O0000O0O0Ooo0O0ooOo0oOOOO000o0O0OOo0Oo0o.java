package com.github.tvbox.osc.ui.dialog;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final EditText f3153O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final EditText f3154O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 f3155O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final ArrayList f3156O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final CustomRecyclerView f3157O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final LivePlayActivity f3158O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(LivePlayActivity livePlayActivity) {
        super(livePlayActivity);
        this.f3158O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = livePlayActivity;
        setContentView(R.layout.dialog_url_edit);
        setCanceledOnTouchOutside(true);
        ((TextView) findViewById(R.id.title)).setText("Headers配置");
        ImageView imageView = (ImageView) findViewById(R.id.ivQRCode);
        TextView textView = (TextView) findViewById(R.id.tvAddress);
        this.f3153O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (EditText) findViewById(R.id.input_liveName);
        EditText editText = (EditText) findViewById(R.id.input_live);
        this.f3154O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = editText;
        editText.setHint("json格式:{\"User-Agent\":\"Player\"}");
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) findViewById(R.id.mLiveUrlGridView);
        this.f3157O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = customRecyclerView;
        ImageView imageView2 = (ImageView) findViewById(R.id.urlClearButton);
        imageView2.requestFocus();
        TextView textView2 = (TextView) findViewById(R.id.okButton);
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        ArrayList arrayList = new ArrayList();
        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        ArrayList arrayList2 = (ArrayList) Hawk.get("live_headers_list", arrayList);
        this.f3156O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList2;
        customRecyclerView.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0();
        o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f1178O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = -1;
        o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f1179O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = livePlayActivity;
        o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f1180O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this;
        o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f1182O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = arrayList2;
        o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.setHasStableIds(true);
        this.f3155O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0;
        customRecyclerView.setAdapter(o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0);
        o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.setOnSelectListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, 14));
        final int i = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = this.f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3153O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3154O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            addressItem.setLiveUrl(strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3155O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList3 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3156O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (!z && arrayList3.contains(addressItem)) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            } else if (o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                AddressItem addressItem2 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1184O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                int iIndexOf = arrayList3.indexOf(addressItem2);
                                if (iIndexOf != -1) {
                                    for (AddressItem addressItem3 : arrayList3) {
                                        if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                            break;
                                        }
                                    }
                                    arrayList3.set(iIndexOf, addressItem);
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.notifyItemChanged(iIndexOf);
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                    Hawk.put("live_headers_list", arrayList3);
                                    if (o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1185O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                        Hawk.put("HEADERS地址", addressItem);
                                        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(strTrim2, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3158O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                                    }
                                } else {
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                }
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            } else {
                                o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                            }
                        }
                        break;
                    case 1:
                        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = this.f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3153O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3154O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3155O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3 = this.f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.getClass();
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f3158O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(3, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.dismiss();
                        break;
                }
            }
        });
        final int i2 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = this.f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3153O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3154O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            addressItem.setLiveUrl(strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3155O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList3 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3156O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (!z && arrayList3.contains(addressItem)) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            } else if (o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                AddressItem addressItem2 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1184O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                int iIndexOf = arrayList3.indexOf(addressItem2);
                                if (iIndexOf != -1) {
                                    for (AddressItem addressItem3 : arrayList3) {
                                        if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                            break;
                                        }
                                    }
                                    arrayList3.set(iIndexOf, addressItem);
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.notifyItemChanged(iIndexOf);
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                    Hawk.put("live_headers_list", arrayList3);
                                    if (o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1185O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                        Hawk.put("HEADERS地址", addressItem);
                                        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(strTrim2, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3158O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                                    }
                                } else {
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                }
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            } else {
                                o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                            }
                        }
                        break;
                    case 1:
                        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = this.f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3153O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3154O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3155O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3 = this.f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.getClass();
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f3158O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(3, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.dismiss();
                        break;
                }
            }
        });
        textView.setText("扫码输入(点击二维码查看说明)\n" + LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
        imageView.setImageBitmap(LivePlayActivity.f2946O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO);
        final int i3 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = this.f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3153O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3154O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            addressItem.setLiveUrl(strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3155O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList3 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3156O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (!z && arrayList3.contains(addressItem)) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            } else if (o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                AddressItem addressItem2 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1184O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                int iIndexOf = arrayList3.indexOf(addressItem2);
                                if (iIndexOf != -1) {
                                    for (AddressItem addressItem3 : arrayList3) {
                                        if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                            break;
                                        }
                                    }
                                    arrayList3.set(iIndexOf, addressItem);
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.notifyItemChanged(iIndexOf);
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                    Hawk.put("live_headers_list", arrayList3);
                                    if (o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1.f1185O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                        Hawk.put("HEADERS地址", addressItem);
                                        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(strTrim2, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3158O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                                    }
                                } else {
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                }
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            } else {
                                o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                            }
                        }
                        break;
                    case 1:
                        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = this.f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3153O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3154O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3155O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3 = this.f3152O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.getClass();
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f3158O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(3, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.dismiss();
                        break;
                }
            }
        });
        if (O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this)) {
            return;
        }
        O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this);
    }

    public static void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(String str, LivePlayActivity livePlayActivity) {
        HashMap map;
        if (str == null) {
            map = null;
        } else {
            try {
                HashMap map2 = new HashMap();
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map2.put(next, jSONObject.getString(next));
                }
                map = map2;
            } catch (JSONException e) {
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "headers参数格式错误" + e.getMessage());
                return;
            }
        }
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        Hawk.put("all_headers_hashmap", map);
        livePlayActivity.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O();
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(AddressItem addressItem) {
        ArrayList arrayList = this.f3156O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        arrayList.add(addressItem);
        int iIndexOf = arrayList.indexOf(addressItem);
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = this.f3155O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.notifyItemInserted(iIndexOf);
        o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.notifyItemChanged(arrayList.indexOf(addressItem));
        o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        Hawk.put("live_headers_list", arrayList);
        this.f3157O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.scrollToPosition(arrayList.indexOf(addressItem));
    }

    @O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(threadMode = ThreadMode.MAIN)
    public void refresh(O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        int i = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f973O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        String str = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f974O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i == 1) {
            this.f3153O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(str);
        }
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f973O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 2) {
            this.f3154O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(str);
        }
    }
}
