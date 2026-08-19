package com.github.tvbox.osc.ui.dialog;

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

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final EditText f3181O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final EditText f3182O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo f3183O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final ArrayList f3184O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final CustomRecyclerView f3185O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final LivePlayActivity f3186O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0(LivePlayActivity livePlayActivity) {
        super(livePlayActivity);
        this.f3186O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = livePlayActivity;
        setContentView(R.layout.dialog_url_edit);
        setCanceledOnTouchOutside(true);
        ((TextView) findViewById(R.id.title)).setText("UserAgent配置");
        ImageView imageView = (ImageView) findViewById(R.id.ivQRCode);
        TextView textView = (TextView) findViewById(R.id.tvAddress);
        this.f3181O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (EditText) findViewById(R.id.input_liveName);
        EditText editText = (EditText) findViewById(R.id.input_live);
        this.f3182O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = editText;
        editText.setHint("请输入User-Agent");
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) findViewById(R.id.mLiveUrlGridView);
        this.f3185O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = customRecyclerView;
        ImageView imageView2 = (ImageView) findViewById(R.id.urlClearButton);
        imageView2.requestFocus();
        TextView textView2 = (TextView) findViewById(R.id.okButton);
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        ArrayList arrayList = new ArrayList();
        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        ArrayList arrayList2 = (ArrayList) Hawk.get("live_ua_list", arrayList);
        this.f3184O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList2;
        customRecyclerView.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo();
        o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1227O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = -1;
        o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1228O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = -1;
        o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1229O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = livePlayActivity;
        o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1230O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this;
        o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1232O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = arrayList2;
        o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.setHasStableIds(true);
        this.f3183O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
        customRecyclerView.setAdapter(o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo);
        o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.setOnSelectListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, 15));
        textView2.setOnClickListener(new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(this, livePlayActivity, 1));
        final int i = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 f3180O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3180O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = this.f3180O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3181O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3182O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3183O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1231O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = false;
                        break;
                    default:
                        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1 = this.f3180O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.getClass();
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.f3186O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(2, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.dismiss();
                        break;
                }
            }
        });
        textView.setText("扫码输入(点击二维码查看说明)\n" + LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
        imageView.setImageBitmap(LivePlayActivity.f2946O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO);
        final int i2 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 f3180O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3180O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = this.f3180O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3181O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3182O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3183O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1231O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = false;
                        break;
                    default:
                        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1 = this.f3180O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.getClass();
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.f3186O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(2, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.dismiss();
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
        ArrayList arrayList = this.f3184O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        arrayList.add(addressItem);
        int iIndexOf = arrayList.indexOf(addressItem);
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = this.f3183O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.notifyItemInserted(iIndexOf);
        o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.notifyItemChanged(arrayList.indexOf(addressItem));
        o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1231O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = false;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        Hawk.put("live_ua_list", arrayList);
        this.f3185O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.scrollToPosition(arrayList.indexOf(addressItem));
    }

    @O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(threadMode = ThreadMode.MAIN)
    public void refresh(O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        int i = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f973O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        String str = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f974O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i == 1) {
            this.f3181O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(str);
        }
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f973O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 2) {
            this.f3182O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(str);
        }
    }
}
