package com.github.tvbox.osc.ui.dialog;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO f3137O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(this);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 f3138O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) {
        this.f3138O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = this.f3138O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        String str = (String) this.f3137O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f3146O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getText().toString());
        if (str == null) {
            str = "XML";
        }
        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f3146O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setText(str);
    }
}
