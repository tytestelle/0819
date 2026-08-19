package com.github.tvbox.osc.ui.dialog;

import android.view.View;
import android.widget.TextView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f3096O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final LivePlayActivity f3097O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(int i, LivePlayActivity livePlayActivity, String str) {
        super(livePlayActivity, R.style.CustomDialogStyleDim);
        setContentView(R.layout.dialog_delete);
        setCanceledOnTouchOutside(true);
        TextView textView = (TextView) findViewById(R.id.title);
        ((TextView) findViewById(R.id.mes)).setText(str);
        TextView textView2 = (TextView) findViewById(R.id.ok);
        TextView textView3 = (TextView) findViewById(R.id.cancel);
        textView.setText("删除提示 !");
        textView2.setText("确定");
        textView3.setText("取消");
        this.f3096O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3097O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = livePlayActivity;
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.cancel) {
            dismiss();
        } else {
            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, 12));
        }
    }
}
