package com.github.tvbox.osc.ui.dialog;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o implements O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f3105O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 f3106O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, int i) {
        this.f3104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3105O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        this.f3106O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
    }

    @Override // O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        switch (this.f3104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f3105O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = this.f3106O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != -1) {
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.notifyItemChanged(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                }
                if (i != -1) {
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.notifyItemChanged(i);
                }
                o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.dismiss();
                break;
            default:
                O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1 = this.f3105O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1.f3107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.post(new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this.f3106O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, i, 11));
                break;
        }
    }
}
