package com.tencent.smtt.sdk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SystemCoreProtector {
    public void onCookieManagerException(Exception exc) {
        throw new IllegalStateException(exc);
    }
}
