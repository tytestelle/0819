package com.tencent.smtt.utils;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes2.dex */
public class Timer {
    public final int timeOut;

    public Timer(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "time out can not < 0, current is "));
        }
        this.timeOut = i;
    }

    public void onTimeOut() {
    }
}
