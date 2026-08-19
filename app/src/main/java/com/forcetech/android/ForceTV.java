package com.forcetech.android;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

/* JADX INFO: loaded from: classes.dex */
public class ForceTV {
    public native int start(int i, int i2);

    public void start(String str, int i) {
        try {
            System.loadLibrary(str);
            start(i, 20971520);
        } catch (UnsatisfiedLinkError unused) {
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, str + "相关Libs不存在");
        }
    }

    public native int stop();
}
