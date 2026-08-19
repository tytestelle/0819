package com.tencent.smtt.sdk;

import java.io.File;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class CacheManager {
    @Deprecated
    public static boolean cacheDisabled() {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            return ((Boolean) uVarA.c().c()).booleanValue();
        }
        Object objA = com.tencent.smtt.utils.j.a("android.webkit.CacheManager", "cacheDisabled");
        if (objA == null) {
            return false;
        }
        return ((Boolean) objA).booleanValue();
    }

    public static InputStream getCacheFile(String str, boolean z) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            return null;
        }
        return uVarA.c().a(str, z);
    }

    @Deprecated
    public static File getCacheFileBaseDir() {
        u uVarA = u.a();
        return (File) ((uVarA == null || !uVarA.b()) ? com.tencent.smtt.utils.j.a("android.webkit.CacheManager", "getCacheFileBaseDir") : uVarA.c().g());
    }

    public static Object getCacheFile(String str, Map<String, String> map) {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            return uVarA.c().g();
        }
        try {
            return com.tencent.smtt.utils.j.a(Class.forName("android.webkit.CacheManager"), "getCacheFile", (Class<?>[]) new Class[]{String.class, Map.class}, str, map);
        } catch (Exception unused) {
            return null;
        }
    }
}
