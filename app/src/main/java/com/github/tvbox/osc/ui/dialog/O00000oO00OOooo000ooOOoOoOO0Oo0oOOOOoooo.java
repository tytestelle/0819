package com.github.tvbox.osc.ui.dialog;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.util.ArrayList;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final EditText f3112O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final EditText f3113O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 f3114O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final CustomRecyclerView f3115O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final LivePlayActivity f3116O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(LivePlayActivity livePlayActivity) {
        super(livePlayActivity);
        this.f3116O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = livePlayActivity;
        setContentView(R.layout.dialog_url_edit);
        setCanceledOnTouchOutside(true);
        ((TextView) findViewById(R.id.title)).setText("分组参数配置");
        ImageView imageView = (ImageView) findViewById(R.id.ivQRCode);
        TextView textView = (TextView) findViewById(R.id.tvAddress);
        EditText editText = (EditText) findViewById(R.id.input_liveName);
        this.f3112O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = editText;
        editText.setHint("分组名称，勿更改");
        EditText editText2 = (EditText) findViewById(R.id.input_live);
        this.f3113O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = editText2;
        editText2.setHint("多个使用#号隔开");
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) findViewById(R.id.mLiveUrlGridView);
        this.f3115O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = customRecyclerView;
        ImageView imageView2 = (ImageView) findViewById(R.id.urlClearButton);
        imageView2.requestFocus();
        TextView textView2 = (TextView) findViewById(R.id.okButton);
        customRecyclerView.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
        o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f1119O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = -1;
        o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f1122O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new ArrayList();
        o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f1120O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
        o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setHasStableIds(true);
        this.f3114O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        customRecyclerView.setAdapter(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
        final int i = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = this.f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3113O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO1 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3114O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        if (o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f1121O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                            O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f1123O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                            if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "修改失败，分组不存在");
                            } else {
                                String str = "GROUP_CONFIG/" + o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f927O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O + "-" + o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f928O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f904O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + "-" + o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                Hawk.put(str, strTrim);
                                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f911O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = strTrim;
                                String[] strArrSplit = strTrim.split("#");
                                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().getClass();
                                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, strArrSplit);
                                o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f1121O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            }
                        }
                        break;
                    case 1:
                        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2 = this.f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.f3112O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.f3113O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.f3114O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1121O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
                        break;
                    default:
                        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3 = this.f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.getClass();
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.f3116O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(4, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.dismiss();
                        break;
                }
            }
        });
        final int i2 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = this.f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3113O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO1 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3114O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        if (o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f1121O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                            O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f1123O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                            if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "修改失败，分组不存在");
                            } else {
                                String str = "GROUP_CONFIG/" + o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f927O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O + "-" + o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f928O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f904O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + "-" + o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                Hawk.put(str, strTrim);
                                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f911O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = strTrim;
                                String[] strArrSplit = strTrim.split("#");
                                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().getClass();
                                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, strArrSplit);
                                o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f1121O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            }
                        }
                        break;
                    case 1:
                        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2 = this.f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.f3112O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.f3113O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.f3114O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1121O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
                        break;
                    default:
                        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3 = this.f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.getClass();
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.f3116O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(4, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.dismiss();
                        break;
                }
            }
        });
        textView.setText("扫码输入(点击二维码查看说明)\n" + LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
        imageView.setImageBitmap(LivePlayActivity.f2946O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO);
        final int i3 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.tvbox.osc.ui.dialog.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = this.f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        String strTrim = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3113O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO1 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3114O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        if (o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f1121O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                            O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f1123O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                            if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "修改失败，分组不存在");
                            } else {
                                String str = "GROUP_CONFIG/" + o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f927O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O + "-" + o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f928O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f904O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + "-" + o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                Hawk.put(str, strTrim);
                                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f911O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = strTrim;
                                String[] strArrSplit = strTrim.split("#");
                                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().getClass();
                                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, strArrSplit);
                                o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f1121O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                            }
                        }
                        break;
                    case 1:
                        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2 = this.f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.f3112O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.f3113O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.f3114O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1121O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
                        break;
                    default:
                        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3 = this.f3111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.getClass();
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.f3116O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(4, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.dismiss();
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
            this.f3112O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(str);
        }
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f973O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 2) {
            this.f3113O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(str);
        }
    }
}
