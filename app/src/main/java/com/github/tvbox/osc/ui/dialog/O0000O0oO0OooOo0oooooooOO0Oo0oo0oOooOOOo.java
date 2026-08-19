package com.github.tvbox.osc.ui.dialog;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.player.ku9py.R;
import java.util.ArrayList;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final EditText f3173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final EditText f3174O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO f3175O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final ArrayList f3176O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final CustomRecyclerView f3177O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final LivePlayActivity f3178O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(LivePlayActivity livePlayActivity) {
        super(livePlayActivity);
        this.f3178O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = livePlayActivity;
        setContentView(R.layout.dialog_url_edit);
        setCanceledOnTouchOutside(true);
        ((TextView) findViewById(R.id.title)).setText("测试频道推送");
        ImageView imageView = (ImageView) findViewById(R.id.ivQRCode);
        TextView textView = (TextView) findViewById(R.id.tvAddress);
        EditText editText = (EditText) findViewById(R.id.input_liveName);
        this.f3173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = editText;
        editText.setHint("频道名称");
        EditText editText2 = (EditText) findViewById(R.id.input_live);
        this.f3174O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = editText2;
        editText2.setHint("输入频道地址");
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) findViewById(R.id.mLiveUrlGridView);
        this.f3177O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = customRecyclerView;
        ImageView imageView2 = (ImageView) findViewById(R.id.urlClearButton);
        imageView2.requestFocus();
        TextView textView2 = (TextView) findViewById(R.id.okButton);
        ArrayList arrayList = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1335O00000OOoOOO00O00o0ooooooooO000ooooO0000;
        this.f3176O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList;
        customRecyclerView.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO();
        o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.f1215O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = -1;
        o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.f1220O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new ArrayList();
        o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.f1216O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = livePlayActivity;
        o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.f1217O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this;
        o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.f1219O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = arrayList;
        o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.setHasStableIds(true);
        this.f3175O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;
        customRecyclerView.setAdapter(o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO);
        final int i = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = this.f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3174O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            addressItem.setLiveUrl(strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3175O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3176O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (z || !arrayList2.contains(addressItem)) {
                                boolean z2 = o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                                LivePlayActivity livePlayActivity2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3178O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                                if (z2) {
                                    AddressItem addressItem2 = o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1221O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                    int iIndexOf = arrayList2.indexOf(addressItem2);
                                    if (iIndexOf != -1) {
                                        for (AddressItem addressItem3 : arrayList2) {
                                            if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                                break;
                                            }
                                        }
                                        arrayList2.set(iIndexOf, addressItem);
                                        o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                        livePlayActivity2.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(4);
                                        o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                                    } else {
                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "修改失败，该频道项不存在");
                                    }
                                } else {
                                    arrayList2.add(addressItem);
                                    o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    livePlayActivity2.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(4);
                                    o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3177O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.scrollToPosition(arrayList2.indexOf(addressItem));
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                                }
                            } else {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            }
                        }
                        break;
                    case 1:
                        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2 = this.f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f3173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f3174O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f3175O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo3 = this.f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo3.getClass();
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo3.f3178O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(5, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo3.dismiss();
                        break;
                }
            }
        });
        final int i2 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = this.f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3174O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            addressItem.setLiveUrl(strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3175O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3176O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (z || !arrayList2.contains(addressItem)) {
                                boolean z2 = o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                                LivePlayActivity livePlayActivity2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3178O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                                if (z2) {
                                    AddressItem addressItem2 = o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1221O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                    int iIndexOf = arrayList2.indexOf(addressItem2);
                                    if (iIndexOf != -1) {
                                        for (AddressItem addressItem3 : arrayList2) {
                                            if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                                break;
                                            }
                                        }
                                        arrayList2.set(iIndexOf, addressItem);
                                        o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                        livePlayActivity2.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(4);
                                        o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                                    } else {
                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "修改失败，该频道项不存在");
                                    }
                                } else {
                                    arrayList2.add(addressItem);
                                    o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    livePlayActivity2.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(4);
                                    o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3177O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.scrollToPosition(arrayList2.indexOf(addressItem));
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                                }
                            } else {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            }
                        }
                        break;
                    case 1:
                        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2 = this.f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f3173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f3174O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f3175O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo3 = this.f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo3.getClass();
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo3.f3178O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(5, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo3.dismiss();
                        break;
                }
            }
        });
        textView.setText("扫码输入(点击二维码查看说明)\n" + LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
        imageView.setImageBitmap(LivePlayActivity.f2946O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO);
        final int i3 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = this.f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                        String strTrim2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3174O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        AddressItem addressItem = new AddressItem();
                        if (TextUtils.isEmpty(strTrim2)) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                        } else {
                            if (strTrim.isEmpty()) {
                                strTrim = strTrim2;
                            }
                            addressItem.setLiveUrl(strTrim2);
                            addressItem.setLiveUrlName(strTrim);
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3175O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            boolean z = o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            ArrayList<AddressItem> arrayList2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3176O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            if (z || !arrayList2.contains(addressItem)) {
                                boolean z2 = o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                                LivePlayActivity livePlayActivity2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3178O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                                if (z2) {
                                    AddressItem addressItem2 = o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1221O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                    int iIndexOf = arrayList2.indexOf(addressItem2);
                                    if (iIndexOf != -1) {
                                        for (AddressItem addressItem3 : arrayList2) {
                                            if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                                break;
                                            }
                                        }
                                        arrayList2.set(iIndexOf, addressItem);
                                        o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                        livePlayActivity2.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(4);
                                        o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                                    } else {
                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "修改失败，该频道项不存在");
                                    }
                                } else {
                                    arrayList2.add(addressItem);
                                    o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    livePlayActivity2.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(4);
                                    o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3177O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.scrollToPosition(arrayList2.indexOf(addressItem));
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                                }
                            } else {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                            }
                        }
                        break;
                    case 1:
                        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2 = this.f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f3173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f3174O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f3175O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                        break;
                    default:
                        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo3 = this.f3172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo3.getClass();
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo3.f3178O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(5, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo3.dismiss();
                        break;
                }
            }
        });
        if (O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this)) {
            return;
        }
        O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this);
    }

    @O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(threadMode = ThreadMode.MAIN)
    public void refresh(O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        int i = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f973O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        String str = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f974O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i == 1) {
            this.f3173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(str);
        }
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f973O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 2) {
            this.f3174O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(str);
        }
    }
}
