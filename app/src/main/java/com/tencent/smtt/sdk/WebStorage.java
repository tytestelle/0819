package com.tencent.smtt.sdk;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class WebStorage {
    private static WebStorage a;

    @Deprecated
    public interface QuotaUpdater {
        void updateQuota(long j);
    }

    private static synchronized WebStorage a() {
        try {
            if (a == null) {
                a = new WebStorage();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static WebStorage getInstance() {
        return a();
    }

    public void deleteAllData() {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebStorage.getInstance().deleteAllData();
        } else {
            uVarA.c().n();
        }
    }

    public void deleteOrigin(String str) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebStorage.getInstance().deleteOrigin(str);
        } else {
            uVarA.c().e(str);
        }
    }

    public void getOrigins(ValueCallback<Map> valueCallback) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebStorage.getInstance().getOrigins(valueCallback);
        } else {
            uVarA.c().a(valueCallback);
        }
    }

    public void getQuotaForOrigin(String str, ValueCallback<Long> valueCallback) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebStorage.getInstance().getQuotaForOrigin(str, valueCallback);
        } else {
            uVarA.c().b(str, valueCallback);
        }
    }

    public void getUsageForOrigin(String str, ValueCallback<Long> valueCallback) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebStorage.getInstance().getUsageForOrigin(str, valueCallback);
        } else {
            uVarA.c().a(str, valueCallback);
        }
    }

    @Deprecated
    public void setQuotaForOrigin(String str, long j) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebStorage.getInstance().setQuotaForOrigin(str, j);
        } else {
            uVarA.c().a(str, j);
        }
    }
}
