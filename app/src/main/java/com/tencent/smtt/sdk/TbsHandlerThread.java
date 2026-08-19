package com.tencent.smtt.sdk;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public class TbsHandlerThread extends HandlerThread {
    private static TbsHandlerThread a;

    public TbsHandlerThread(String str) {
        super(str);
    }

    public static synchronized TbsHandlerThread getInstance() {
        try {
            if (a == null) {
                TbsHandlerThread tbsHandlerThread = new TbsHandlerThread("TbsHandlerThread");
                a = tbsHandlerThread;
                tbsHandlerThread.start();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}
