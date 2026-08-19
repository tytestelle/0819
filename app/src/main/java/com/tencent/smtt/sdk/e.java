package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.DexLoader;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class e extends ProxyController {
    private void a(Executor executor, Runnable runnable) {
        try {
            Class<?> cls = Class.forName("androidx.webkit.internal.ProxyControllerImpl");
            Method declaredMethod = cls.getDeclaredMethod("getBoundaryInterface", null);
            declaredMethod.setAccessible(true);
            Class.forName("org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface").getMethod("clearProxyOverride", Runnable.class, Executor.class).invoke(declaredMethod.invoke(cls.newInstance(), null), runnable, executor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void b(Executor executor, Runnable runnable) {
        try {
            DexLoader dexLoaderB = u.a().c().b();
            dexLoaderB.invokeMethod(dexLoaderB.newInstance("android.webview.chromium.tencent.TencentSupportProxyController", new Class[0], new Object[0]), "android.webview.chromium.tencent.TencentSupportProxyController", "clearProxyOverride", new Class[]{Runnable.class, Executor.class}, runnable, executor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.tencent.smtt.sdk.ProxyController
    public void clearProxyOverride(Executor executor, Runnable runnable) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            a(executor, runnable);
        } else {
            b(executor, runnable);
        }
    }

    @Override // com.tencent.smtt.sdk.ProxyController
    public void setProxyOverride(ProxyConfig proxyConfig, Executor executor, Runnable runnable) {
        String[][] strArrA = a(proxyConfig.getProxyRules());
        String[] strArr = (String[]) proxyConfig.getBypassRules().toArray(new String[0]);
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            b(strArrA, strArr, runnable, executor);
        } else {
            a(strArrA, strArr, runnable, executor);
        }
    }

    public void a(String[][] strArr, String[] strArr2, Runnable runnable, Executor executor) {
        try {
            DexLoader dexLoaderB = u.a().c().b();
            dexLoaderB.invokeMethod(dexLoaderB.newInstance("android.webview.chromium.tencent.TencentSupportProxyController", new Class[0], new Object[0]), "android.webview.chromium.tencent.TencentSupportProxyController", "setProxyOverride", new Class[]{String[][].class, String[].class, Runnable.class, Executor.class, Boolean.TYPE}, strArr, strArr2, runnable, executor, Boolean.FALSE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void b(String[][] strArr, String[] strArr2, Runnable runnable, Executor executor) {
        try {
            Class<?> cls = Class.forName("androidx.webkit.internal.ProxyControllerImpl");
            Method declaredMethod = cls.getDeclaredMethod("getBoundaryInterface", null);
            declaredMethod.setAccessible(true);
            Class.forName("org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface").getMethod("setProxyOverride", String[][].class, String[].class, Runnable.class, Executor.class).invoke(declaredMethod.invoke(cls.newInstance(), null), strArr, strArr2, runnable, executor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[][] a(List<ProxyConfig.ProxyRule> list) {
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, list.size(), 2);
        for (int i = 0; i < list.size(); i++) {
            strArr[i][0] = list.get(i).getSchemeFilter();
            strArr[i][1] = list.get(i).getUrl();
        }
        return strArr;
    }
}
