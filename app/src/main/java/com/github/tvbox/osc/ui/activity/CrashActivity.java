package com.github.tvbox.osc.ui.activity;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import com.github.tvbox.osc.base.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import com.github.tvbox.osc.ui.dialog.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public class CrashActivity extends O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public long f2940O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;

    @Override // com.github.tvbox.osc.base.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final int O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        return R.layout.activity_crash;
    }

    @Override // com.github.tvbox.osc.base.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void init() {
        if (!isTaskRoot()) {
            finish();
            return;
        }
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = new O00000OOoOOO00O00o0ooooooooO000ooooO0000(this);
        o00000OOoOOO00O00o0ooooooooO000ooooO0000.setContentView(R.layout.dialog_crash);
        o00000OOoOOO00O00o0ooooooooO000ooooO0000.setCanceledOnTouchOutside(false);
        TextView textView = (TextView) o00000OOoOOO00O00o0ooooooooO000ooooO0000.findViewById(R.id.Crash_title);
        TextView textView2 = (TextView) o00000OOoOOO00O00o0ooooooooO000ooooO0000.findViewById(R.id.Crash_text);
        TextView textView3 = (TextView) o00000OOoOOO00O00o0ooooooooO000ooooO0000.findViewById(R.id.CrashHint);
        TextView textView4 = (TextView) o00000OOoOOO00O00o0ooooooooO000ooooO0000.findViewById(R.id.exit);
        textView.setText("Crash日志");
        textView3.setText("——请截图或长按复制内容并反馈——");
        String str = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1321O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        textView2.setText(O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + "/errorLog.txt"));
        textView4.setText("退出程序");
        textView4.setOnClickListener(o00000OOoOOO00O00o0ooooooooO000ooooO0000);
        textView2.setOnLongClickListener(o00000OOoOOO00O00o0ooooooooO000ooooO0000);
        o00000OOoOOO00O00o0ooooooooO000ooooO0000.show();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (System.currentTimeMillis() - this.f2940O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o < ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
            super.onBackPressed();
            System.exit(0);
        } else {
            this.f2940O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = System.currentTimeMillis();
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "再按一次返回键退出程序");
        }
    }

    @Override // com.github.tvbox.osc.base.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(true, getWindow().getDecorView());
    }
}
