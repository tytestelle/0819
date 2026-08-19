package com.github.tvbox.osc.ui.dialog;

import android.os.Handler;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3024O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f3025O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, int i) {
        this.f3024O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3025O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3024O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3025O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                PopupWindow popupWindow = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                if (popupWindow != null && popupWindow.isShowing()) {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.dismiss();
                    break;
                }
                break;
            case 1:
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f3025O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo);
                break;
            case 2:
                this.f3025O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
                break;
            case 3:
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = this.f3025O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3069O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.getVisibility() == 0) {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3069O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.setVisibility(8);
                }
                break;
            case 4:
                if (!O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o()) {
                    this.f3025O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                }
                break;
            default:
                int i = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02 = this.f3025O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i != 1) {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.f3082O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.removeCallbacks(this);
                    int i2 = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
                    if (i2 == 3) {
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                    } else if (i2 == 4) {
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00);
                    }
                } else {
                    long j = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.f3088O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 + 100;
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.f3088O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = j;
                    Handler handler = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.f3082O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
                    if (j > 800) {
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                        handler.removeCallbacks(this);
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.f3088O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = 0L;
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    } else if (!o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.f3089O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0) {
                        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.f3088O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = 0L;
                        handler.removeCallbacks(this);
                    } else {
                        handler.postDelayed(this, 100L);
                    }
                }
                break;
        }
    }
}
