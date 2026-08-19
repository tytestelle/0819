package com.github.tvbox.osc.ui.dialog;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3139O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f3140O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, int i) {
        this.f3139O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3140O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3139O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) this.f3140O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("{\"url\":\"http://xxx\",\"headers\":{\"User-Agent\":\"Player\"}}");
                break;
            default:
                ((O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0) this.f3140O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3165O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("{\"url\":\"http://xxx\",\"headers\":{\"User-Agent\":\"Player\"}}");
                break;
        }
    }
}
