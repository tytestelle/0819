package com.tencent.smtt.sdk;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class GeolocationPermissions {
    private static GeolocationPermissions a;

    private static synchronized GeolocationPermissions a() {
        try {
            if (a == null) {
                a = new GeolocationPermissions();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static GeolocationPermissions getInstance() {
        return a();
    }

    public void allow(String str) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.GeolocationPermissions.getInstance().allow(str);
        } else {
            uVarA.c().g(str);
        }
    }

    public void clear(String str) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.GeolocationPermissions.getInstance().clear(str);
        } else {
            uVarA.c().f(str);
        }
    }

    public void clearAll() {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.GeolocationPermissions.getInstance().clearAll();
        } else {
            uVarA.c().o();
        }
    }

    public void getAllowed(String str, ValueCallback<Boolean> valueCallback) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.GeolocationPermissions.getInstance().getAllowed(str, valueCallback);
        } else {
            uVarA.c().c(str, valueCallback);
        }
    }

    public void getOrigins(ValueCallback<Set<String>> valueCallback) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.GeolocationPermissions.getInstance().getOrigins(valueCallback);
        } else {
            uVarA.c().b(valueCallback);
        }
    }
}
