package com.github.tvbox.osc.ui.dialog;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3159O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ LivePlayActivity f3160O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f3161O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, LivePlayActivity livePlayActivity, int i) {
        this.f3159O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3161O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.f3160O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = livePlayActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3159O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = (O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0) this.f3161O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f3170O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
                    LivePlayActivity livePlayActivity = this.f3160O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo(livePlayActivity, R.style.CustomDialogStyleDim);
                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.setContentView(R.layout.dialog_backup);
                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.setCanceledOnTouchOutside(true);
                    CustomRecyclerView customRecyclerView = (CustomRecyclerView) o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.findViewById(R.id.mBackupGridView);
                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f3297O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = customRecyclerView;
                    customRecyclerView.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                    TextView textView = (TextView) o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.findViewById(R.id.backup);
                    textView.setText("全部复制到订阅列表");
                    TextView textView2 = (TextView) o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.findViewById(R.id.title);
                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f3296O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = textView2;
                    textView2.setText("点击列表项添加至订阅列表");
                    O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0 o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0 = new O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0();
                    o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0.f1311O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();
                    o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0.f1310O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
                    o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0.f1312O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
                    o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0.setHasStableIds(true);
                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f3295O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0;
                    customRecyclerView.setAdapter(o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0);
                    textView.setOnClickListener(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f3170O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
                }
                ArrayList arrayList = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (arrayList != null) {
                    O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f3170O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0 o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO1 = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f3295O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    ArrayList arrayList2 = o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO1.f1311O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO1.notifyDataSetChanged();
                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f3296O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("共获取" + o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO1.f1311O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size() + "个线路  点击列表项添加至订阅列表");
                }
                o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f3170O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.show();
                break;
            default:
                O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = (O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) this.f3161O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                String strTrim = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3181O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                String strTrim2 = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3182O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                AddressItem addressItem = new AddressItem();
                if (TextUtils.isEmpty(strTrim2)) {
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                } else {
                    if (strTrim.isEmpty()) {
                        strTrim = strTrim2;
                    }
                    addressItem.setLiveUrl(strTrim2);
                    addressItem.setLiveUrlName(strTrim);
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3183O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    boolean z = o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1231O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    ArrayList<AddressItem> arrayList3 = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3184O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    if (!z && arrayList3.contains(addressItem)) {
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                    } else if (o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1231O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                        AddressItem addressItem2 = o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1234O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                        int iIndexOf = arrayList3.indexOf(addressItem2);
                        if (iIndexOf != -1) {
                            for (AddressItem addressItem3 : arrayList3) {
                                if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                    break;
                                }
                            }
                            arrayList3.set(iIndexOf, addressItem);
                            o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.notifyItemChanged(iIndexOf);
                            o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1231O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = false;
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                            Hawk.put("live_ua_list", arrayList3);
                            if (o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1235O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                                O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("{\"User-Agent\": \"", strTrim2, "\"}"), this.f3160O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                            }
                        } else {
                            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                        }
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                    } else {
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                    }
                }
                break;
        }
    }
}
