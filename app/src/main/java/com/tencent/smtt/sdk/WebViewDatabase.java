package com.tencent.smtt.sdk;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewDatabase {
    private static WebViewDatabase a;
    private Context b;

    public WebViewDatabase(Context context) {
        this.b = context;
    }

    private static synchronized WebViewDatabase a(Context context) {
        try {
            if (a == null) {
                a = new WebViewDatabase(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static WebViewDatabase getInstance(Context context) {
        return a(context);
    }

    public void clearFormData() {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebViewDatabase.getInstance(this.b).clearFormData();
        } else {
            uVarA.c().g(this.b);
        }
    }

    public void clearHttpAuthUsernamePassword() {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebViewDatabase.getInstance(this.b).clearHttpAuthUsernamePassword();
        } else {
            uVarA.c().e(this.b);
        }
    }

    @Deprecated
    public void clearUsernamePassword() {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebViewDatabase.getInstance(this.b).clearUsernamePassword();
        } else {
            uVarA.c().c(this.b);
        }
    }

    public boolean hasFormData() {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.WebViewDatabase.getInstance(this.b).hasFormData() : uVarA.c().f(this.b);
    }

    public boolean hasHttpAuthUsernamePassword() {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.WebViewDatabase.getInstance(this.b).hasHttpAuthUsernamePassword() : uVarA.c().d(this.b);
    }

    @Deprecated
    public boolean hasUsernamePassword() {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.WebViewDatabase.getInstance(this.b).hasUsernamePassword() : uVarA.c().b(this.b);
    }
}
