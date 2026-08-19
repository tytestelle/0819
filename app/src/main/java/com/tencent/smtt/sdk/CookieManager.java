package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class CookieManager {
    public static String LOGTAG = "CookieManager";
    private static CookieManager c;
    CopyOnWriteArrayList<b> a;
    a b = a.MODE_NONE;
    private boolean d = false;

    public enum a {
        MODE_NONE,
        MODE_KEYS,
        MODE_ALL
    }

    public class b {
        int a;
        String b;
        String c;
        ValueCallback<Boolean> d;

        public b() {
        }
    }

    private CookieManager() {
    }

    public static boolean checkSysCoreNotExist() {
        SystemCoreProtector systemCoreProtectorE = QbSdk.e();
        if (systemCoreProtectorE == null) {
            return false;
        }
        try {
            android.webkit.CookieManager.getInstance();
            return false;
        } catch (Exception e) {
            systemCoreProtectorE.onCookieManagerException(e);
            return true;
        }
    }

    public static CookieManager getInstance() {
        if (c == null) {
            synchronized (CookieManager.class) {
                try {
                    if (c == null) {
                        c = new CookieManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static int getROMCookieDBVersion(Context context) {
        return context.getSharedPreferences("cookiedb_info", 4).getInt("db_version", -1);
    }

    public static void setROMCookieDBVersion(Context context, int i) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("cookiedb_info", 4).edit();
        editorEdit.putInt("db_version", i);
        editorEdit.commit();
    }

    public synchronized void a() {
        try {
            CopyOnWriteArrayList<b> copyOnWriteArrayList = this.a;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() != 0) {
                u uVarA = u.a();
                if (uVarA == null || !uVarA.b()) {
                    for (b bVar : this.a) {
                        int i = bVar.a;
                        if (i != 1) {
                            if (i == 2) {
                                if (checkSysCoreNotExist()) {
                                    return;
                                } else {
                                    android.webkit.CookieManager.getInstance().setCookie(bVar.b, bVar.c);
                                }
                            }
                        } else if (checkSysCoreNotExist()) {
                            return;
                        } else {
                            com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "setCookie", (Class<?>[]) new Class[]{String.class, String.class, android.webkit.ValueCallback.class}, bVar.b, bVar.c, bVar.d);
                        }
                    }
                } else {
                    for (b bVar2 : this.a) {
                        int i2 = bVar2.a;
                        if (i2 == 1) {
                            setCookie(bVar2.b, bVar2.c, bVar2.d);
                        } else if (i2 == 2) {
                            setCookie(bVar2.b, bVar2.c);
                        }
                    }
                }
                this.a.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean acceptCookie() {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            return uVarA.c().d();
        }
        if (checkSysCoreNotExist()) {
            return false;
        }
        return android.webkit.CookieManager.getInstance().acceptCookie();
    }

    public synchronized boolean acceptThirdPartyCookies(WebView webView) {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            Object objInvokeStaticMethod = uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_acceptThirdPartyCookies", new Class[]{Object.class}, webView.getView());
            if (objInvokeStaticMethod == null) {
                return true;
            }
            return ((Boolean) objInvokeStaticMethod).booleanValue();
        }
        if (checkSysCoreNotExist()) {
            return false;
        }
        Object objA = com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "acceptThirdPartyCookies", (Class<?>[]) new Class[]{android.webkit.WebView.class}, webView.getView());
        if (objA == null) {
            return false;
        }
        return ((Boolean) objA).booleanValue();
    }

    public void flush() {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_flush", new Class[0], new Object[0]);
        } else {
            if (checkSysCoreNotExist()) {
                return;
            }
            com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "flush", (Class<?>[]) new Class[0], new Object[0]);
        }
    }

    public String getCookie(String str) {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            return uVarA.c().a(str);
        }
        if (checkSysCoreNotExist()) {
            return null;
        }
        try {
            return android.webkit.CookieManager.getInstance().getCookie(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public boolean hasCookies() {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            return uVarA.c().h();
        }
        if (checkSysCoreNotExist()) {
            return false;
        }
        return android.webkit.CookieManager.getInstance().hasCookies();
    }

    @Deprecated
    public void removeAllCookie() {
        CopyOnWriteArrayList<b> copyOnWriteArrayList = this.a;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            uVarA.c().e();
        } else {
            if (checkSysCoreNotExist()) {
                return;
            }
            android.webkit.CookieManager.getInstance().removeAllCookie();
        }
    }

    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        CopyOnWriteArrayList<b> copyOnWriteArrayList = this.a;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeAllCookies", new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        } else {
            if (checkSysCoreNotExist()) {
                return;
            }
            com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "removeAllCookies", (Class<?>[]) new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        }
    }

    @Deprecated
    public void removeExpiredCookie() {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeExpiredCookie", new Class[0], new Object[0]);
        } else {
            if (checkSysCoreNotExist()) {
                return;
            }
            android.webkit.CookieManager.getInstance().removeExpiredCookie();
        }
    }

    @Deprecated
    public void removeSessionCookie() {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeSessionCookie", new Class[0], new Object[0]);
        } else {
            if (checkSysCoreNotExist()) {
                return;
            }
            android.webkit.CookieManager.getInstance().removeSessionCookie();
        }
    }

    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeSessionCookies", new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        } else {
            if (checkSysCoreNotExist()) {
                return;
            }
            com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "removeSessionCookies", (Class<?>[]) new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        }
    }

    public synchronized void setAcceptCookie(boolean z) {
        try {
            u uVarA = u.a();
            if (uVarA == null || !uVarA.b()) {
                try {
                    if (checkSysCoreNotExist()) {
                    } else {
                        android.webkit.CookieManager.getInstance().setAcceptCookie(z);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else {
                uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setAcceptCookie", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void setAcceptThirdPartyCookies(WebView webView, boolean z) {
        try {
            u uVarA = u.a();
            if (uVarA != null && uVarA.b()) {
                uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setAcceptThirdPartyCookies", new Class[]{Object.class, Boolean.TYPE}, webView.getView(), Boolean.valueOf(z));
            } else if (checkSysCoreNotExist()) {
            } else {
                com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "setAcceptThirdPartyCookies", (Class<?>[]) new Class[]{android.webkit.WebView.class, Boolean.TYPE}, webView.getView(), Boolean.valueOf(z));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setCookie(String str, String str2) {
        setCookie(str, str2, false);
    }

    public void setCookies(Map<String, String[]> map) {
        u uVarA = u.a();
        if ((uVarA == null || !uVarA.b()) ? false : uVarA.c().a(map)) {
            return;
        }
        for (String str : map.keySet()) {
            for (String str2 : map.get(str)) {
                setCookie(str, str2);
            }
        }
    }

    public synchronized void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        try {
            u uVarA = u.a();
            if (uVarA == null || !uVarA.b()) {
                if (!uVarA.d()) {
                    b bVar = new b();
                    bVar.a = 1;
                    bVar.b = str;
                    bVar.c = str2;
                    bVar.d = valueCallback;
                    if (this.a == null) {
                        this.a = new CopyOnWriteArrayList<>();
                    }
                    this.a.add(bVar);
                }
                if (checkSysCoreNotExist()) {
                } else {
                    com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "setCookie", (Class<?>[]) new Class[]{String.class, String.class, android.webkit.ValueCallback.class}, str, str2, valueCallback);
                }
            } else {
                uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setCookie", new Class[]{String.class, String.class, android.webkit.ValueCallback.class}, str, str2, valueCallback);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setCookie(String str, String str2, boolean z) {
        android.webkit.CookieManager cookieManager;
        try {
            u uVarA = u.a();
            if (uVarA != null && uVarA.b()) {
                uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setCookie", new Class[]{String.class, String.class}, str, str2);
                if (WebView.hasCreatedSysWebViewInstance()) {
                    if (checkSysCoreNotExist()) {
                        return;
                    } else {
                        cookieManager = android.webkit.CookieManager.getInstance();
                    }
                }
            }
            if (!u.a().d()) {
                b bVar = new b();
                bVar.a = 2;
                bVar.b = str;
                bVar.c = str2;
                bVar.d = null;
                if (this.a == null) {
                    this.a = new CopyOnWriteArrayList<>();
                }
                this.a.add(bVar);
            }
            if (checkSysCoreNotExist()) {
                return;
            } else {
                cookieManager = android.webkit.CookieManager.getInstance();
            }
            cookieManager.setCookie(str, str2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
