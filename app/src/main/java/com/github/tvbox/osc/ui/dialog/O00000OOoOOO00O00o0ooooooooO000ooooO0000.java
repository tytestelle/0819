package com.github.tvbox.osc.ui.dialog;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Process;
import android.view.View;
import android.widget.TextView;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OOoOOO00O00o0ooooooooO000ooooO0000 extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements View.OnClickListener, View.OnLongClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        System.exit(0);
        Process.killProcess(Process.myPid());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view.getId() != R.id.Crash_text) {
            return true;
        }
        ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", ((TextView) view).getText().toString()));
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "Crash日志已复制到剪贴板");
        return true;
    }
}
