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
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final EditText f3193O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final EditText f3194O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final ArrayList f3196O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final CustomRecyclerView f3197O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final LivePlayActivity f3198O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo(LivePlayActivity livePlayActivity) {
        super(livePlayActivity);
        this.f3198O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = livePlayActivity;
        setContentView(R.layout.dialog_url_edit);
        setCanceledOnTouchOutside(true);
        ((TextView) findViewById(R.id.title)).setText("列表订阅");
        ImageView imageView = (ImageView) findViewById(R.id.ivQRCode);
        TextView textView = (TextView) findViewById(R.id.tvAddress);
        this.f3193O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (EditText) findViewById(R.id.input_liveName);
        EditText editText = (EditText) findViewById(R.id.input_live);
        this.f3194O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = editText;
        editText.setHint("地址(点击左侧提示按钮配置headers)");
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) findViewById(R.id.mLiveUrlGridView);
        this.f3197O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = customRecyclerView;
        ImageView imageView2 = (ImageView) findViewById(R.id.urlTypeButton);
        imageView2.setVisibility(0);
        ImageView imageView3 = (ImageView) findViewById(R.id.urlClearButton);
        imageView3.requestFocus();
        TextView textView2 = (TextView) findViewById(R.id.okButton);
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        ArrayList arrayList = (ArrayList) Hawk.get("live_url_list", new ArrayList());
        this.f3196O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList;
        customRecyclerView.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo();
        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f1245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = -1;
        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f1246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = livePlayActivity;
        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f1247O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this;
        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = arrayList;
        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.setHasStableIds(true);
        this.f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
        customRecyclerView.setAdapter(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.setOnSelectListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, 16));
        final int i = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = this.f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3193O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3194O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(addressItem, strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            addressItem.setItemId(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(strTrim + "_" + strTrim2, "MD5"));
                            addressItem.setSelected(false);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3196O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (!z && arrayList2.contains(addressItem)) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            } else if (o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                AddressItem addressItem2 = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1251O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                int iIndexOf = arrayList2.indexOf(addressItem2);
                                if (iIndexOf != -1) {
                                    for (AddressItem addressItem3 : arrayList2) {
                                        if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                            break;
                                        }
                                    }
                                    if (o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1251O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isSelected()) {
                                        addressItem.setSelected(true);
                                        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(addressItem);
                                    }
                                    arrayList2.set(iIndexOf, addressItem);
                                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.notifyItemChanged(iIndexOf);
                                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(arrayList2);
                                } else {
                                    o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                }
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            } else {
                                o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                            }
                        }
                        break;
                    case 1:
                        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2 = this.f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3193O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3194O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo3 = this.f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo3.getClass();
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo3.f3198O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(0, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo3.dismiss();
                        break;
                }
            }
        });
        final int i2 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = this.f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3193O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3194O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(addressItem, strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            addressItem.setItemId(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(strTrim + "_" + strTrim2, "MD5"));
                            addressItem.setSelected(false);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3196O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (!z && arrayList2.contains(addressItem)) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            } else if (o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                AddressItem addressItem2 = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1251O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                int iIndexOf = arrayList2.indexOf(addressItem2);
                                if (iIndexOf != -1) {
                                    for (AddressItem addressItem3 : arrayList2) {
                                        if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                            break;
                                        }
                                    }
                                    if (o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1251O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isSelected()) {
                                        addressItem.setSelected(true);
                                        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(addressItem);
                                    }
                                    arrayList2.set(iIndexOf, addressItem);
                                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.notifyItemChanged(iIndexOf);
                                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(arrayList2);
                                } else {
                                    o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                }
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            } else {
                                o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                            }
                        }
                        break;
                    case 1:
                        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2 = this.f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3193O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3194O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo3 = this.f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo3.getClass();
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo3.f3198O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(0, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo3.dismiss();
                        break;
                }
            }
        });
        imageView2.setOnClickListener(new O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(this));
        textView.setText("扫码输入(点击二维码查看说明)\n" + LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
        imageView.setImageBitmap(LivePlayActivity.f2946O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO);
        final int i3 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = this.f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3193O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3194O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(addressItem, strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            addressItem.setItemId(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(strTrim + "_" + strTrim2, "MD5"));
                            addressItem.setSelected(false);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3196O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (!z && arrayList2.contains(addressItem)) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            } else if (o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                AddressItem addressItem2 = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1251O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                int iIndexOf = arrayList2.indexOf(addressItem2);
                                if (iIndexOf != -1) {
                                    for (AddressItem addressItem3 : arrayList2) {
                                        if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                            break;
                                        }
                                    }
                                    if (o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1251O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isSelected()) {
                                        addressItem.setSelected(true);
                                        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(addressItem);
                                    }
                                    arrayList2.set(iIndexOf, addressItem);
                                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.notifyItemChanged(iIndexOf);
                                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(arrayList2);
                                } else {
                                    o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                }
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            } else {
                                o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                            }
                        }
                        break;
                    case 1:
                        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2 = this.f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3193O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3194O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo3 = this.f3188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo3.getClass();
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo3.f3198O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(0, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo3.dismiss();
                        break;
                }
            }
        });
        if (O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this)) {
            return;
        }
        O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this);
    }

    public static void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(AddressItem addressItem, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.has("url") ? jSONObject.getString("url") : "";
            String string2 = jSONObject.has("user") ? jSONObject.getString("user") : "";
            String string3 = jSONObject.has("pass") ? jSONObject.getString("pass") : "";
            String string4 = jSONObject.has("headers") ? jSONObject.getString("headers") : "";
            String string5 = jSONObject.has(IjkMediaMeta.IJKM_KEY_FORMAT) ? jSONObject.getString(IjkMediaMeta.IJKM_KEY_FORMAT) : "";
            boolean zEquals = "true".equals(jSONObject.has("b64decode") ? jSONObject.getString("b64decode") : "false");
            if ("xtream".equals(string5)) {
                string = string + "/get.php?username=" + string2 + "&password=" + string3 + "&type=m3u_plus&output=ts";
            }
            addressItem.setLiveUrl(str);
            addressItem.setRequestUrl(string);
            addressItem.setUser(string2);
            addressItem.setPass(string3);
            addressItem.setHeaders(string4);
            addressItem.setFormat(string5);
            addressItem.setB64decode(zEquals);
        } catch (JSONException unused) {
            addressItem.setLiveUrl(str);
        }
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(AddressItem addressItem) {
        ArrayList arrayList = this.f3196O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        arrayList.add(addressItem);
        int iIndexOf = arrayList.indexOf(addressItem);
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = this.f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.notifyItemInserted(iIndexOf);
        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.notifyItemChanged(arrayList.indexOf(addressItem));
        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(arrayList);
        this.f3197O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.scrollToPosition(arrayList.indexOf(addressItem));
    }

    @O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(threadMode = ThreadMode.MAIN)
    public void refresh(O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        int i = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f973O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        String str = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f974O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i == 1) {
            this.f3193O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(str);
        }
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f973O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 2) {
            this.f3194O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(str);
        }
    }
}
