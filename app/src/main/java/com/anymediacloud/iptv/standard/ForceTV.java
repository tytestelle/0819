package com.anymediacloud.iptv.standard;

/* JADX INFO: loaded from: classes.dex */
public class ForceTV {
    public native int start(int i, int i2);

    public void start(int i) {
        try {
            start(i, 20971520);
        } catch (Throwable unused) {
        }
    }

    public native int stop();
}
