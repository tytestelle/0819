package com.github.tvbox.osc.ui.dialog;

import android.content.Context;
import android.view.View;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.activity.LoginActivity;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3108O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public com.github.tvbox.osc.base.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f3109O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(Context context) {
        super(context);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3108O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                int id = view.getId();
                LivePlayActivity livePlayActivity = (LivePlayActivity) this.f3109O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (id == R.id.ok) {
                    if (livePlayActivity != null) {
                        livePlayActivity.finish();
                    }
                    System.exit(0);
                } else if (id == R.id.showSet) {
                    if (!livePlayActivity.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO()) {
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "竖屏模式不允许此操作");
                    } else {
                        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(1);
                        dismiss();
                    }
                }
                break;
            default:
                if (view.getId() != R.id.cancel) {
                    ((LoginActivity) this.f3109O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                } else {
                    dismiss();
                }
                break;
        }
    }

    public /* synthetic */ O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(Context context, int i) {
        super(context, i);
    }
}
