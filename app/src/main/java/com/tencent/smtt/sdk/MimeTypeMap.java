package com.tencent.smtt.sdk;

/* JADX INFO: loaded from: classes2.dex */
public class MimeTypeMap {
    private static MimeTypeMap a;

    private MimeTypeMap() {
    }

    public static String getFileExtensionFromUrl(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.MimeTypeMap.getFileExtensionFromUrl(str) : uVarA.c().h(str);
    }

    public static synchronized MimeTypeMap getSingleton() {
        try {
            if (a == null) {
                a = new MimeTypeMap();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public String getExtensionFromMimeType(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(str) : uVarA.c().l(str);
    }

    public String getMimeTypeFromExtension(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(str) : uVarA.c().j(str);
    }

    public boolean hasExtension(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.MimeTypeMap.getSingleton().hasExtension(str) : uVarA.c().k(str);
    }

    public boolean hasMimeType(String str) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? android.webkit.MimeTypeMap.getSingleton().hasMimeType(str) : uVarA.c().i(str);
    }
}
