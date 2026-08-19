package com.tencent.smtt.sdk;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import com.tencent.smtt.export.external.interfaces.IconListener;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class WebIconDatabase {
    private static WebIconDatabase a;

    @Deprecated
    public interface a {
        void a(String str, Bitmap bitmap);
    }

    private WebIconDatabase() {
    }

    private static synchronized WebIconDatabase a() {
        try {
            if (a == null) {
                a = new WebIconDatabase();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static WebIconDatabase getInstance() {
        return a();
    }

    public void bulkRequestIconForPageUrl(ContentResolver contentResolver, String str, a aVar) {
    }

    public void close() {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebIconDatabase.getInstance().close();
        } else {
            uVarA.c().m();
        }
    }

    public void open(String str) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebIconDatabase.getInstance().open(str);
        } else {
            uVarA.c().b(str);
        }
    }

    public void releaseIconForPageUrl(String str) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebIconDatabase.getInstance().releaseIconForPageUrl(str);
        } else {
            uVarA.c().d(str);
        }
    }

    public void removeAllIcons() {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebIconDatabase.getInstance().removeAllIcons();
        } else {
            uVarA.c().l();
        }
    }

    public void requestIconForPageUrl(String str, final a aVar) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebIconDatabase.getInstance().requestIconForPageUrl(str, new android.webkit.WebIconDatabase.IconListener() { // from class: com.tencent.smtt.sdk.WebIconDatabase.2
                @Override // android.webkit.WebIconDatabase.IconListener
                public void onReceivedIcon(String str2, Bitmap bitmap) {
                    aVar.a(str2, bitmap);
                }
            });
        } else {
            uVarA.c().a(str, new IconListener() { // from class: com.tencent.smtt.sdk.WebIconDatabase.1
                @Override // com.tencent.smtt.export.external.interfaces.IconListener
                public void onReceivedIcon(String str2, Bitmap bitmap) {
                    aVar.a(str2, bitmap);
                }
            });
        }
    }

    public void retainIconForPageUrl(String str) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            android.webkit.WebIconDatabase.getInstance().retainIconForPageUrl(str);
        } else {
            uVarA.c().c(str);
        }
    }
}
