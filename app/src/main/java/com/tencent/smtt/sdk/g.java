package com.tencent.smtt.sdk;

import android.database.sqlite.SQLiteException;

/* JADX INFO: loaded from: classes2.dex */
public class g implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (!(th instanceof SQLiteException)) {
            throw new RuntimeException(th);
        }
    }
}
