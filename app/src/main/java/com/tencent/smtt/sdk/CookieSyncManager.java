package com.tencent.smtt.sdk;

import android.content.Context;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class CookieSyncManager {
    private static android.webkit.CookieSyncManager a;
    private static CookieSyncManager b;
    private static boolean c;

    private CookieSyncManager(Context context) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            return;
        }
        uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_createInstance", new Class[]{Context.class}, context);
        c = true;
    }

    public static synchronized CookieSyncManager createInstance(Context context) {
        try {
            a = android.webkit.CookieSyncManager.createInstance(context);
            if (b == null || !c) {
                b = new CookieSyncManager(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public static synchronized CookieSyncManager getInstance() {
        CookieSyncManager cookieSyncManager;
        cookieSyncManager = b;
        if (cookieSyncManager == null) {
            throw new IllegalStateException("CookieSyncManager::createInstance() needs to be called before CookieSyncManager::getInstance()");
        }
        return cookieSyncManager;
    }

    public void startSync() {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_startSync", new Class[0], new Object[0]);
            return;
        }
        a.startSync();
        try {
            Field declaredField = Class.forName("android.webkit.WebSyncManager").getDeclaredField("mSyncThread");
            declaredField.setAccessible(true);
            ((Thread) declaredField.get(a)).setUncaughtExceptionHandler(new g());
        } catch (Exception unused) {
        }
    }

    public void stopSync() {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            a.stopSync();
        } else {
            uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_stopSync", new Class[0], new Object[0]);
        }
    }

    public void sync() {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            a.sync();
        } else {
            uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_Sync", new Class[0], new Object[0]);
        }
    }
}
