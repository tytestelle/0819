package com.tencent.smtt.sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class URLUtil {
    public static String composeSearchUrl(String str, String str2, String str3) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.composeSearchUrl(str, str2, str3) : uVarA.c().a(str, str2, str3);
    }

    public static byte[] decode(byte[] bArr) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.decode(bArr) : uVarA.c().a(bArr);
    }

    public static final String guessFileName(String str, String str2, String str3) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.guessFileName(str, str2, str3) : uVarA.c().b(str, str2, str3);
    }

    public static String guessUrl(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.guessUrl(str) : uVarA.c().m(str);
    }

    public static boolean isAboutUrl(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.isAboutUrl(str) : uVarA.c().q(str);
    }

    public static boolean isAssetUrl(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.isAssetUrl(str) : uVarA.c().n(str);
    }

    public static boolean isContentUrl(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.isContentUrl(str) : uVarA.c().w(str);
    }

    @Deprecated
    public static boolean isCookielessProxyUrl(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.isCookielessProxyUrl(str) : uVarA.c().o(str);
    }

    public static boolean isDataUrl(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.isDataUrl(str) : uVarA.c().r(str);
    }

    public static boolean isFileUrl(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.isFileUrl(str) : uVarA.c().p(str);
    }

    public static boolean isHttpUrl(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.isHttpUrl(str) : uVarA.c().t(str);
    }

    public static boolean isHttpsUrl(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.isHttpsUrl(str) : uVarA.c().u(str);
    }

    public static boolean isJavaScriptUrl(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.isJavaScriptUrl(str) : uVarA.c().s(str);
    }

    public static boolean isNetworkUrl(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.isNetworkUrl(str) : uVarA.c().v(str);
    }

    public static boolean isValidUrl(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.isValidUrl(str) : uVarA.c().x(str);
    }

    public static String stripAnchor(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.URLUtil.stripAnchor(str) : uVarA.c().y(str);
    }
}
