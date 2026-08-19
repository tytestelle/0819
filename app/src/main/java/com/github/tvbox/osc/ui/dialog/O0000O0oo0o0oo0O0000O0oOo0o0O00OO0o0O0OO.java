package com.github.tvbox.osc.ui.dialog;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f3189O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final String[] f3190O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = {"{\"url\":\"http://xxx\",\"headers\":{\"User-Agent\":\"Player\"},\"format\":\"normal\",\"b64decode\":\"false\"}", "{\"url\":\"http://xxx\",\"user\":\"test\",\"pass\":\"123\",\"headers\":{\"User-Agent\":\"Player\"},\"format\":\"xtream\",\"b64decode\":\"false\"}", "{\"url\":\"http://xxx\",\"user\":\"test\",\"pass\":\"123\",\"headers\":{\"User-Agent\":\"Player\"},\"format\":\"scheme\",\"b64decode\":\"false\"}"};

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final String[] f3191O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = {"正常格式", "xtream格式", "scheme格式"};

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo f3192O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo) {
        this.f3192O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f3189O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        String[] strArr = this.f3190O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int length = i % strArr.length;
        this.f3192O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f3194O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(strArr[length]);
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "切换到" + this.f3191O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[length]);
        this.f3189O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f3189O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + 1;
    }
}
