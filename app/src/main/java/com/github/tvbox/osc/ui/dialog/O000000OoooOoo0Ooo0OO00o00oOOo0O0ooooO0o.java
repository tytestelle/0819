package com.github.tvbox.osc.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Window;
import androidx.core.content.ContextCompat;
import com.player.ku9py.R;
import xyz.doikki.videoplayer.util.CutoutUtil;

/* JADX INFO: loaded from: classes.dex */
public class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends Dialog {
    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Context context) {
        super(context, R.style.CustomDialogStyle);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        CutoutUtil.adaptCutoutAboveAndroidP((Dialog) this, true);
        super.onCreate(bundle);
    }

    @Override // android.app.Dialog
    public final void show() {
        getWindow().setFlags(8, 8);
        super.show();
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        int i = systemUiVisibility | 6405;
        if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() == 0) {
            i = systemUiVisibility | 6919;
        }
        getWindow().getDecorView().setSystemUiVisibility(i);
        getWindow().clearFlags(8);
        Window window = getWindow();
        if (window != null) {
            GradientDrawable gradientDrawable = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1352O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            if (gradientDrawable == null) {
                gradientDrawable = (GradientDrawable) ContextCompat.getDrawable(getContext(), R.drawable.shape_dialog_drawable);
            }
            window.setBackgroundDrawable(gradientDrawable.getConstantState().newDrawable().mutate());
        }
    }
}
