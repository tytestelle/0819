package com.tencent.smtt.sdk;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProxyController {

    public static class a {
        static final ProxyController a = new e();
    }

    public static ProxyController getInstance() {
        return a.a;
    }

    public abstract void clearProxyOverride(Executor executor, Runnable runnable);

    public abstract void setProxyOverride(ProxyConfig proxyConfig, Executor executor, Runnable runnable);
}
