package com.tencent.smtt.sdk;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.smtt.export.external.TbsCoreSettings;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebSettingsExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.export.external.extension.proxy.X5ProxyWebViewClientExtension;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.sdk.stat.MttLoader;
import com.tencent.smtt.utils.TbsLog;
import java.io.BufferedWriter;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class WebView extends FrameLayout implements View.OnLongClickListener {
    public static int NIGHT_MODE_ALPHA = 153;
    public static final int NIGHT_MODE_COLOR = -16777216;
    public static final int NORMAL_MODE_ALPHA = 255;
    public static final String SCHEME_GEO = "geo:0,0?q=";
    public static final String SCHEME_MAILTO = "mailto:";
    public static final String SCHEME_TEL = "tel:";
    private static Context i = null;
    private static Method l = null;
    public static boolean mSysWebviewCreated = false;
    public static boolean mWebViewCreated = false;
    private static String o = null;
    private static Paint u = null;
    private static boolean v = true;
    volatile int a;
    private final String b;
    private boolean c;
    private IX5WebViewBase d;
    private a e;
    private WebSettings f;
    private Context g;
    private TbsWebViewPerformanceRecorder h;
    private volatile boolean j;
    private boolean k;
    private WebViewClient m;
    public WebViewCallbackClient mWebViewCallbackClient;
    private WebChromeClient n;
    private final int p;
    private final int q;
    private final int r;
    private final String s;
    private final String t;
    private Object w;
    private View.OnLongClickListener x;

    public static class HitTestResult {

        @Deprecated
        public static final int ANCHOR_TYPE = 1;
        public static final int EDIT_TEXT_TYPE = 9;
        public static final int EMAIL_TYPE = 4;
        public static final int GEO_TYPE = 3;

        @Deprecated
        public static final int IMAGE_ANCHOR_TYPE = 6;
        public static final int IMAGE_TYPE = 5;
        public static final int PHONE_TYPE = 2;
        public static final int SRC_ANCHOR_TYPE = 7;
        public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
        public static final int UNKNOWN_TYPE = 0;
        private IX5WebViewBase.HitTestResult a;
        private android.webkit.WebView.HitTestResult b;

        public HitTestResult() {
            this.a = null;
            this.b = null;
        }

        public String getExtra() {
            IX5WebViewBase.HitTestResult hitTestResult = this.a;
            if (hitTestResult != null) {
                return hitTestResult.getExtra();
            }
            android.webkit.WebView.HitTestResult hitTestResult2 = this.b;
            return hitTestResult2 != null ? hitTestResult2.getExtra() : "";
        }

        public int getType() {
            IX5WebViewBase.HitTestResult hitTestResult = this.a;
            if (hitTestResult != null) {
                return hitTestResult.getType();
            }
            android.webkit.WebView.HitTestResult hitTestResult2 = this.b;
            if (hitTestResult2 != null) {
                return hitTestResult2.getType();
            }
            return 0;
        }

        public HitTestResult(android.webkit.WebView.HitTestResult hitTestResult) {
            this.a = null;
            this.b = hitTestResult;
        }

        public HitTestResult(IX5WebViewBase.HitTestResult hitTestResult) {
            this.a = hitTestResult;
            this.b = null;
        }
    }

    @Deprecated
    public interface PictureListener {
        @Deprecated
        void onNewPicture(WebView webView, Picture picture);
    }

    public class WebViewTransport {
        private WebView b;

        public WebViewTransport() {
        }

        public synchronized WebView getWebView() {
            return this.b;
        }

        public synchronized void setWebView(WebView webView) {
            this.b = webView;
        }
    }

    public class a extends android.webkit.WebView {
        public a(WebView webView, Context context) {
            this(context, null);
        }

        public void a() {
            super.computeScroll();
        }

        public boolean b(MotionEvent motionEvent) {
            return super.dispatchTouchEvent(motionEvent);
        }

        public boolean c(MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.view.View
        public void computeScroll() {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                webViewCallbackClient.computeScroll(this);
            } else {
                super.computeScroll();
            }
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            try {
                super.dispatchDraw(canvas);
                if (WebView.v || WebView.u == null) {
                    return;
                }
                canvas.save();
                canvas.drawPaint(WebView.u);
                canvas.restore();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            return webViewCallbackClient != null ? webViewCallbackClient.dispatchTouchEvent(motionEvent, this) : super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView
        public android.webkit.WebSettings getSettings() {
            try {
                return super.getSettings();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // android.view.View
        public void invalidate() {
            super.invalidate();
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                webViewCallbackClient.invalidate();
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            return webViewCallbackClient != null ? webViewCallbackClient.onInterceptTouchEvent(motionEvent, this) : super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.view.View
        @TargetApi(9)
        public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                webViewCallbackClient.onOverScrolled(i, i2, z, z2, this);
            } else {
                super.onOverScrolled(i, i2, z, z2);
            }
        }

        @Override // android.webkit.WebView, android.view.View
        public void onScrollChanged(int i, int i2, int i3, int i4) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                webViewCallbackClient.onScrollChanged(i, i2, i3, i4, this);
            } else {
                super.onScrollChanged(i, i2, i3, i4);
                WebView.this.onScrollChanged(i, i2, i3, i4);
            }
        }

        @Override // android.webkit.WebView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!hasFocus()) {
                requestFocus();
            }
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                return webViewCallbackClient.onTouchEvent(motionEvent, this);
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }

        @Override // android.view.View
        @TargetApi(9)
        public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            return webViewCallbackClient != null ? webViewCallbackClient.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z, this) : super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }

        @Override // android.webkit.WebView, android.view.View
        public void setOverScrollMode(int i) {
            try {
                super.setOverScrollMode(i);
            } catch (Exception unused) {
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(WebView.this.c(context), attributeSet);
            WebView.mSysWebviewCreated = true;
            if (QbSdk.getIsSysWebViewForcedByOuter() && TbsShareManager.isThirdPartyApp(context)) {
                return;
            }
            CookieSyncManager.createInstance(WebView.this.g).startSync();
            try {
                Method declaredMethod = Class.forName("android.webkit.WebViewWorker").getDeclaredMethod("getHandler", null);
                declaredMethod.setAccessible(true);
                ((Handler) declaredMethod.invoke(null, null)).getLooper().getThread().setUncaughtExceptionHandler(new g());
            } catch (Exception unused) {
            }
        }

        public void a(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
        }

        @TargetApi(9)
        public void a(int i, int i2, boolean z, boolean z2) {
            super.onOverScrolled(i, i2, z, z2);
        }

        @TargetApi(9)
        public boolean a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }

        public boolean a(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }
    }

    public WebView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context c(Context context) {
        return Build.VERSION.SDK_INT <= 22 ? context.createConfigurationContext(new Configuration()) : context;
    }

    @Deprecated
    public static void disablePlatformNotifications() {
        if (u.a().b()) {
            return;
        }
        com.tencent.smtt.utils.j.a("android.webkit.WebView", "disablePlatformNotifications");
    }

    @Deprecated
    public static void enablePlatformNotifications() {
        if (u.a().b()) {
            return;
        }
        com.tencent.smtt.utils.j.a("android.webkit.WebView", "enablePlatformNotifications");
    }

    @Deprecated
    public static String findAddress(String str) {
        if (u.a().b()) {
            return null;
        }
        return android.webkit.WebView.findAddress(str);
    }

    private void g() {
        if (!this.j && this.a != 0) {
            j();
        }
        if (this.c) {
            this.d.destroy();
            return;
        }
        this.e.destroy();
        try {
            TbsLog.i("sdkreport", "webview.destroyImplNow mQQMusicCrashFix is " + this.k);
            if (this.k) {
                return;
            }
            Field declaredField = Class.forName("android.webkit.BrowserFrame").getDeclaredField("sConfigCallback");
            declaredField.setAccessible(true);
            ComponentCallbacks componentCallbacks = (ComponentCallbacks) declaredField.get(null);
            if (componentCallbacks != null) {
                declaredField.set(null, null);
                Field declaredField2 = Class.forName("android.view.ViewRoot").getDeclaredField("sConfigCallbacks");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(null);
                if (obj != null) {
                    List list = (List) obj;
                    synchronized (list) {
                        list.remove(componentCallbacks);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static String getCrashExtraCacheInfo(Context context) {
        Map<String, Object> map;
        if (context == null) {
            return "";
        }
        String str = "tbs_core_version:" + QbSdk.getTbsVersionForCrash(context) + ";tbs_sdk_version:44286;";
        StringBuilder sb = new StringBuilder();
        sb.append(f.a(true).f());
        sb.append("\n");
        sb.append(str);
        if (!TbsShareManager.isThirdPartyApp(context) && (map = QbSdk.o) != null && map.containsKey(TbsCoreSettings.TBS_SETTINGS_WEAPP_ID_KEY) && QbSdk.o.containsKey(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY)) {
            String str2 = "weapp_id:" + QbSdk.o.get(TbsCoreSettings.TBS_SETTINGS_WEAPP_ID_KEY) + ";weapp_name:" + QbSdk.o.get(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY) + ";";
            sb.append("\n");
            sb.append(str2);
        }
        return sb.length() > 8192 ? sb.substring(sb.length() - 8192) : sb.toString();
    }

    public static String getCrashExtraMessage(Context context) {
        Map<String, Object> map;
        if (context == null) {
            return "";
        }
        String str = "tbs_core_version:" + QbSdk.getTbsVersionForCrash(context) + ";tbs_sdk_version:44286;";
        StringBuilder sb = new StringBuilder();
        sb.append(f.a(true).e());
        sb.append("\n");
        sb.append(str);
        if (!TbsShareManager.isThirdPartyApp(context) && (map = QbSdk.o) != null && map.containsKey(TbsCoreSettings.TBS_SETTINGS_WEAPP_ID_KEY) && QbSdk.o.containsKey(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY)) {
            String str2 = "weapp_id:" + QbSdk.o.get(TbsCoreSettings.TBS_SETTINGS_WEAPP_ID_KEY) + ";weapp_name:" + QbSdk.o.get(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY) + ";";
            sb.append("\n");
            sb.append(str2);
        }
        return sb.length() > 8192 ? sb.substring(sb.length() - 8192) : sb.toString();
    }

    public static PackageInfo getCurrentWebViewPackage() {
        if (u.a().b() || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            return (PackageInfo) com.tencent.smtt.utils.j.a("android.webkit.WebView", "getCurrentWebViewPackage");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Deprecated
    public static synchronized Object getPluginList() {
        if (u.a().b()) {
            return null;
        }
        return com.tencent.smtt.utils.j.a("android.webkit.WebView", "getPluginList");
    }

    public static int getTbsCoreVersion(Context context) {
        return QbSdk.getTbsVersion(context);
    }

    public static boolean getTbsNeedReboot() {
        c();
        return f.a(true).g();
    }

    public static int getTbsSDKVersion(Context context) {
        return 44286;
    }

    private void h() {
        try {
            if ("com.xunmeng.pinduoduo".equals(this.g.getApplicationInfo().packageName)) {
                new Thread("WebviewDestroy") { // from class: com.tencent.smtt.sdk.WebView.2
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        WebView.this.a(false);
                    }
                }.start();
                if (this.c) {
                    this.d.destroy();
                } else {
                    this.e.destroy();
                }
            } else {
                a(true);
            }
        } catch (Throwable unused) {
            a(true);
        }
    }

    public static boolean hasCreatedSysWebViewInstance() {
        return mSysWebviewCreated;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long i() {
        long j;
        synchronized (QbSdk.h) {
            try {
                if (QbSdk.e) {
                    QbSdk.g = (System.currentTimeMillis() - QbSdk.f) + QbSdk.g;
                    TbsLog.d("sdkreport", "pv report, WebView.getWifiConnectedTime QbSdk.sWifiConnectedTime=" + QbSdk.g);
                }
                j = QbSdk.g / 1000;
                QbSdk.g = 0L;
                QbSdk.f = System.currentTimeMillis();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    private void j() {
        Runnable runnable = new Runnable() { // from class: com.tencent.smtt.sdk.WebView.7
            @Override // java.lang.Runnable
            public void run() {
                boolean zIsX5CoreSandboxMode;
                Bundle sdkQBStatisticsInfo;
                if (WebView.this.j || WebView.this.a == 0) {
                    return;
                }
                synchronized (WebView.this) {
                    if (!WebView.this.j && WebView.this.a != 0) {
                        WebView.this.j = true;
                        String string = "";
                        String string2 = "";
                        String string3 = "";
                        if (WebView.this.c && (sdkQBStatisticsInfo = WebView.this.d.getX5WebViewExtension().getSdkQBStatisticsInfo()) != null) {
                            string = sdkQBStatisticsInfo.getString("guid");
                            string2 = sdkQBStatisticsInfo.getString("qua2");
                            string3 = sdkQBStatisticsInfo.getString("lc");
                        }
                        String str = string3;
                        String str2 = string2;
                        String str3 = string;
                        try {
                            zIsX5CoreSandboxMode = WebView.this.d.getX5WebViewExtension().isX5CoreSandboxMode();
                        } catch (Throwable th) {
                            TbsLog.w("onVisibilityChanged", "exception: " + th);
                            zIsX5CoreSandboxMode = false;
                        }
                        com.tencent.smtt.sdk.stat.b.a(WebView.this.g, str3, str2, str, WebView.this.a, WebView.this.c, WebView.this.i(), zIsX5CoreSandboxMode);
                        WebView.this.a = 0;
                        WebView.this.j = false;
                    }
                }
            }
        };
        Handler tbsLogHandler = TbsLog.getTbsLogHandler();
        if (tbsLogHandler != null) {
            Message messageObtain = Message.obtain(tbsLogHandler, 501);
            messageObtain.obj = runnable;
            messageObtain.sendToTarget();
        } else {
            Thread thread = new Thread(runnable);
            thread.setName("TbsPV");
            thread.start();
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                com.tencent.smtt.utils.j.a(Class.forName("android.webkit.WebView"), "setDataDirectorySuffix", (Class<?>[]) new Class[]{String.class}, str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        HashMap map = new HashMap();
        map.put("data_directory_suffix", str);
        QbSdk.initTbsSettings(map);
    }

    public static synchronized void setSysDayOrNight(boolean z) {
        int i2;
        Paint paint;
        try {
            if (z == v) {
                return;
            }
            v = z;
            if (u == null) {
                Paint paint2 = new Paint();
                u = paint2;
                paint2.setColor(-16777216);
            }
            if (z) {
                i2 = 255;
                if (u.getAlpha() != 255) {
                    paint = u;
                    paint.setAlpha(i2);
                }
            } else {
                int alpha = u.getAlpha();
                i2 = NIGHT_MODE_ALPHA;
                if (alpha != i2) {
                    paint = u;
                    paint.setAlpha(i2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void setWebContentsDebuggingEnabled(boolean z) {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            uVarA.c().a(z);
            return;
        }
        try {
            Method declaredMethod = Class.forName("android.webkit.WebView").getDeclaredMethod("setWebContentsDebuggingEnabled", Boolean.TYPE);
            l = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                l.invoke(null, Boolean.valueOf(z));
            }
        } catch (Exception e) {
            TbsLog.e("QbSdk", "Exception:" + e.getStackTrace());
            e.printStackTrace();
        }
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (this.c) {
            this.d.addJavascriptInterface(obj, str);
        } else {
            this.e.addJavascriptInterface(obj, str);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (!this.c) {
            this.e.addView(view);
            return;
        }
        View view2 = this.d.getView();
        try {
            Method methodA = com.tencent.smtt.utils.j.a(view2, "addView", View.class);
            methodA.setAccessible(true);
            methodA.invoke(view2, view);
        } catch (Throwable unused) {
        }
    }

    public IX5WebViewBase b() {
        return this.d;
    }

    public boolean canGoBack() {
        return !this.c ? this.e.canGoBack() : this.d.canGoBack();
    }

    public boolean canGoBackOrForward(int i2) {
        return !this.c ? this.e.canGoBackOrForward(i2) : this.d.canGoBackOrForward(i2);
    }

    public boolean canGoForward() {
        return !this.c ? this.e.canGoForward() : this.d.canGoForward();
    }

    @Deprecated
    public boolean canZoomIn() {
        if (this.c) {
            return this.d.canZoomIn();
        }
        Object objA = com.tencent.smtt.utils.j.a(this.e, "canZoomIn");
        if (objA == null) {
            return false;
        }
        return ((Boolean) objA).booleanValue();
    }

    @Deprecated
    public boolean canZoomOut() {
        if (this.c) {
            return this.d.canZoomOut();
        }
        Object objA = com.tencent.smtt.utils.j.a(this.e, "canZoomOut");
        if (objA == null) {
            return false;
        }
        return ((Boolean) objA).booleanValue();
    }

    @Deprecated
    public Picture capturePicture() {
        if (this.c) {
            return this.d.capturePicture();
        }
        Object objA = com.tencent.smtt.utils.j.a(this.e, "capturePicture");
        if (objA == null) {
            return null;
        }
        return (Picture) objA;
    }

    public void clearCache(boolean z) {
        if (this.c) {
            this.d.clearCache(z);
        } else {
            this.e.clearCache(z);
        }
    }

    public void clearFormData() {
        if (this.c) {
            this.d.clearFormData();
        } else {
            this.e.clearFormData();
        }
    }

    public void clearHistory() {
        if (this.c) {
            this.d.clearHistory();
        } else {
            this.e.clearHistory();
        }
    }

    @TargetApi(3)
    public void clearMatches() {
        if (this.c) {
            this.d.clearMatches();
        } else {
            this.e.clearMatches();
        }
    }

    public void clearSslPreferences() {
        if (this.c) {
            this.d.clearSslPreferences();
        } else {
            this.e.clearSslPreferences();
        }
    }

    @Deprecated
    public void clearView() {
        if (this.c) {
            this.d.clearView();
        } else {
            com.tencent.smtt.utils.j.a(this.e, "clearView");
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        try {
            if (this.c) {
                Method methodA = com.tencent.smtt.utils.j.a(this.d.getView(), "computeHorizontalScrollExtent", new Class[0]);
                methodA.setAccessible(true);
                return ((Integer) methodA.invoke(this.d.getView(), null)).intValue();
            }
            Method methodA2 = com.tencent.smtt.utils.j.a(this.e, "computeHorizontalScrollExtent", new Class[0]);
            methodA2.setAccessible(true);
            return ((Integer) methodA2.invoke(this.e, null)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        try {
            if (this.c) {
                Method methodA = com.tencent.smtt.utils.j.a(this.d.getView(), "computeHorizontalScrollOffset", new Class[0]);
                methodA.setAccessible(true);
                return ((Integer) methodA.invoke(this.d.getView(), null)).intValue();
            }
            Method methodA2 = com.tencent.smtt.utils.j.a(this.e, "computeHorizontalScrollOffset", new Class[0]);
            methodA2.setAccessible(true);
            return ((Integer) methodA2.invoke(this.e, null)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        try {
            if (this.c) {
                return ((Integer) com.tencent.smtt.utils.j.a(this.d.getView(), "computeHorizontalScrollRange", (Class<?>[]) new Class[0], new Object[0])).intValue();
            }
            Method methodA = com.tencent.smtt.utils.j.a(this.e, "computeHorizontalScrollRange", new Class[0]);
            methodA.setAccessible(true);
            return ((Integer) methodA.invoke(this.e, null)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.c) {
            this.d.computeScroll();
        } else {
            this.e.computeScroll();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        try {
            if (this.c) {
                Method methodA = com.tencent.smtt.utils.j.a(this.d.getView(), "computeVerticalScrollExtent", new Class[0]);
                methodA.setAccessible(true);
                return ((Integer) methodA.invoke(this.d.getView(), null)).intValue();
            }
            Method methodA2 = com.tencent.smtt.utils.j.a(this.e, "computeVerticalScrollExtent", new Class[0]);
            methodA2.setAccessible(true);
            return ((Integer) methodA2.invoke(this.e, null)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        try {
            if (this.c) {
                Method methodA = com.tencent.smtt.utils.j.a(this.d.getView(), "computeVerticalScrollOffset", new Class[0]);
                methodA.setAccessible(true);
                return ((Integer) methodA.invoke(this.d.getView(), null)).intValue();
            }
            Method methodA2 = com.tencent.smtt.utils.j.a(this.e, "computeVerticalScrollOffset", new Class[0]);
            methodA2.setAccessible(true);
            return ((Integer) methodA2.invoke(this.e, null)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        try {
            if (this.c) {
                return ((Integer) com.tencent.smtt.utils.j.a(this.d.getView(), "computeVerticalScrollRange", (Class<?>[]) new Class[0], new Object[0])).intValue();
            }
            Method methodA = com.tencent.smtt.utils.j.a(this.e, "computeVerticalScrollRange", new Class[0]);
            methodA.setAccessible(true);
            return ((Integer) methodA.invoke(this.e, null)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public WebBackForwardList copyBackForwardList() {
        return this.c ? WebBackForwardList.a(this.d.copyBackForwardList()) : WebBackForwardList.a(this.e.copyBackForwardList());
    }

    public Object createPrintDocumentAdapter(String str) {
        if (!this.c) {
            return com.tencent.smtt.utils.j.a(this.e, "createPrintDocumentAdapter", (Class<?>[]) new Class[]{String.class}, str);
        }
        try {
            return this.d.createPrintDocumentAdapter(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void customDiskCachePathEnabled(boolean z, String str) {
        if (!this.c || getX5WebViewExtension() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("enabled", z);
        bundle.putString("path", str);
        getX5WebViewExtension().invokeMiscMethod("customDiskCachePathEnabled", bundle);
    }

    public void destroy() {
        int i2;
        boolean z = false;
        this.k = false;
        try {
            if (this.g.getApplicationInfo().packageName.contains("com.tencent.qqmusic") && ((i2 = Build.VERSION.SDK_INT) == 21 || i2 == 22)) {
                this.k = true;
                z = true;
            }
        } catch (Throwable th) {
            TbsLog.i("webview", "stack is " + Log.getStackTraceString(th));
        }
        TbsLog.i("webview", "destroy forceDestoyOld is " + z);
        if (z) {
            h();
        } else {
            g();
        }
    }

    public void documentHasImages(Message message) {
        if (this.c) {
            this.d.documentHasImages(message);
        } else {
            this.e.documentHasImages(message);
        }
    }

    public void dumpViewHierarchyWithProperties(BufferedWriter bufferedWriter, int i2) {
        if (this.c) {
            this.d.dumpViewHierarchyWithProperties(bufferedWriter, i2);
        } else {
            com.tencent.smtt.utils.j.a(this.e, "dumpViewHierarchyWithProperties", (Class<?>[]) new Class[]{BufferedWriter.class, Integer.TYPE}, bufferedWriter, Integer.valueOf(i2));
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.c) {
            try {
                Method declaredMethod = Class.forName("android.webkit.WebView").getDeclaredMethod("evaluateJavascript", String.class, android.webkit.ValueCallback.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.e, str, valueCallback);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            Method methodA = com.tencent.smtt.utils.j.a(this.d.getView(), "evaluateJavascript", String.class, android.webkit.ValueCallback.class);
            methodA.setAccessible(true);
            methodA.invoke(this.d.getView(), str, valueCallback);
        } catch (Exception e2) {
            e2.printStackTrace();
            loadUrl(str);
        }
    }

    @Deprecated
    public int findAll(String str) {
        if (this.c) {
            return this.d.findAll(str);
        }
        Object objA = com.tencent.smtt.utils.j.a(this.e, "findAll", (Class<?>[]) new Class[]{String.class}, str);
        if (objA == null) {
            return 0;
        }
        return ((Integer) objA).intValue();
    }

    @TargetApi(16)
    public void findAllAsync(String str) {
        if (this.c) {
            this.d.findAllAsync(str);
        } else {
            com.tencent.smtt.utils.j.a(this.e, "findAllAsync", (Class<?>[]) new Class[]{String.class}, str);
        }
    }

    public View findHierarchyView(String str, int i2) {
        return !this.c ? (View) com.tencent.smtt.utils.j.a(this.e, "findHierarchyView", (Class<?>[]) new Class[]{String.class, Integer.TYPE}, str, Integer.valueOf(i2)) : this.d.findHierarchyView(str, i2);
    }

    @TargetApi(3)
    public void findNext(boolean z) {
        if (this.c) {
            this.d.findNext(z);
        } else {
            this.e.findNext(z);
        }
    }

    public void flingScroll(int i2, int i3) {
        if (this.c) {
            this.d.flingScroll(i2, i3);
        } else {
            this.e.flingScroll(i2, i3);
        }
    }

    @Deprecated
    public void freeMemory() {
        if (this.c) {
            this.d.freeMemory();
        } else {
            com.tencent.smtt.utils.j.a(this.e, "freeMemory");
        }
    }

    public SslCertificate getCertificate() {
        return !this.c ? this.e.getCertificate() : this.d.getCertificate();
    }

    public int getContentHeight() {
        return !this.c ? this.e.getContentHeight() : this.d.getContentHeight();
    }

    public int getContentWidth() {
        if (this.c) {
            return this.d.getContentWidth();
        }
        Object objA = com.tencent.smtt.utils.j.a(this.e, "getContentWidth");
        if (objA == null) {
            return 0;
        }
        return ((Integer) objA).intValue();
    }

    public Bitmap getFavicon() {
        return !this.c ? this.e.getFavicon() : this.d.getFavicon();
    }

    public HitTestResult getHitTestResult() {
        return !this.c ? new HitTestResult(this.e.getHitTestResult()) : new HitTestResult(this.d.getHitTestResult());
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        return !this.c ? this.e.getHttpAuthUsernamePassword(str, str2) : this.d.getHttpAuthUsernamePassword(str, str2);
    }

    public boolean getIsX5Core() {
        return this.c;
    }

    @TargetApi(3)
    public String getOriginalUrl() {
        return !this.c ? this.e.getOriginalUrl() : this.d.getOriginalUrl();
    }

    public TbsWebViewPerformanceRecorder getPerformanceRecorder() {
        return this.h;
    }

    public int getProgress() {
        return !this.c ? this.e.getProgress() : this.d.getProgress();
    }

    public boolean getRendererPriorityWaivedWhenNotVisible() {
        Object objA;
        try {
            if (!this.c && Build.VERSION.SDK_INT >= 26 && (objA = com.tencent.smtt.utils.j.a(this.e, "getRendererPriorityWaivedWhenNotVisible")) != null) {
                return ((Boolean) objA).booleanValue();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int getRendererRequestedPriority() {
        Object objA;
        try {
            if (!this.c && Build.VERSION.SDK_INT >= 26 && (objA = com.tencent.smtt.utils.j.a(this.e, "getRendererRequestedPriority")) != null) {
                return ((Integer) objA).intValue();
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Deprecated
    public float getScale() {
        if (this.c) {
            return this.d.getScale();
        }
        Object objA = com.tencent.smtt.utils.j.a(this.e, "getScale");
        if (objA == null) {
            return 0.0f;
        }
        return ((Float) objA).floatValue();
    }

    @Override // android.view.View
    public int getScrollBarDefaultDelayBeforeFade() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarDefaultDelayBeforeFade();
    }

    @Override // android.view.View
    public int getScrollBarFadeDuration() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarFadeDuration();
    }

    @Override // android.view.View
    public int getScrollBarSize() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarSize();
    }

    @Override // android.view.View
    public int getScrollBarStyle() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarStyle();
    }

    public WebSettings getSettings() {
        WebSettings webSettings = this.f;
        if (webSettings != null) {
            return webSettings;
        }
        WebSettings webSettings2 = this.c ? new WebSettings(this.d.getSettings()) : new WebSettings(this.e.getSettings());
        this.f = webSettings2;
        return webSettings2;
    }

    public IX5WebSettingsExtension getSettingsExtension() {
        if (this.c) {
            return this.d.getX5WebViewExtension().getSettingsExtension();
        }
        return null;
    }

    public int getSysNightModeAlpha() {
        return NIGHT_MODE_ALPHA;
    }

    public String getTitle() {
        return !this.c ? this.e.getTitle() : this.d.getTitle();
    }

    public String getUrl() {
        return !this.c ? this.e.getUrl() : this.d.getUrl();
    }

    public View getView() {
        return !this.c ? this.e : this.d.getView();
    }

    public int getVisibleTitleHeight() {
        if (this.c) {
            return this.d.getVisibleTitleHeight();
        }
        Object objA = com.tencent.smtt.utils.j.a(this.e, "getVisibleTitleHeight");
        if (objA == null) {
            return 0;
        }
        return ((Integer) objA).intValue();
    }

    public WebChromeClient getWebChromeClient() {
        return this.n;
    }

    public IX5WebChromeClientExtension getWebChromeClientExtension() {
        if (this.c) {
            return this.d.getX5WebViewExtension().getWebChromeClientExtension();
        }
        return null;
    }

    public int getWebScrollX() {
        return (this.c ? this.d.getView() : this.e).getScrollX();
    }

    public int getWebScrollY() {
        return (this.c ? this.d.getView() : this.e).getScrollY();
    }

    public WebViewClient getWebViewClient() {
        return this.m;
    }

    public IX5WebViewClientExtension getWebViewClientExtension() {
        if (this.c) {
            return this.d.getX5WebViewExtension().getWebViewClientExtension();
        }
        return null;
    }

    public IX5WebViewBase.HitTestResult getX5HitTestResult() {
        if (this.c) {
            return this.d.getHitTestResult();
        }
        return null;
    }

    public IX5WebViewExtension getX5WebViewExtension() {
        if (this.c) {
            return this.d.getX5WebViewExtension();
        }
        return null;
    }

    @Deprecated
    public View getZoomControls() {
        return !this.c ? (View) com.tencent.smtt.utils.j.a(this.e, "getZoomControls") : this.d.getZoomControls();
    }

    public void goBack() {
        if (this.c) {
            this.d.goBack();
        } else {
            this.e.goBack();
        }
    }

    public void goBackOrForward(int i2) {
        if (this.c) {
            this.d.goBackOrForward(i2);
        } else {
            this.e.goBackOrForward(i2);
        }
    }

    public void goForward() {
        if (this.c) {
            this.d.goForward();
        } else {
            this.e.goForward();
        }
    }

    public void invokeZoomPicker() {
        if (this.c) {
            this.d.invokeZoomPicker();
        } else {
            this.e.invokeZoomPicker();
        }
    }

    public boolean isDayMode() {
        return v;
    }

    public boolean isPrivateBrowsingEnabled() {
        if (this.c) {
            return this.d.isPrivateBrowsingEnable();
        }
        Object objA = com.tencent.smtt.utils.j.a(this.e, "isPrivateBrowsingEnabled");
        if (objA == null) {
            return false;
        }
        return ((Boolean) objA).booleanValue();
    }

    public void loadData(String str, String str2, String str3) {
        if (this.c) {
            this.d.loadData(str, str2, str3);
        } else {
            this.e.loadData(str, str2, str3);
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.c) {
            this.d.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            this.e.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    public void loadUrl(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str == null || showDebugView(str)) {
            return;
        }
        if (this.c) {
            this.d.loadUrl(str);
        } else {
            this.e.loadUrl(str);
        }
        this.h.a(System.currentTimeMillis() - jCurrentTimeMillis, str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.j || this.a == 0) {
            return;
        }
        j();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        View.OnLongClickListener onLongClickListener = this.x;
        if (onLongClickListener == null || !onLongClickListener.onLongClick(view)) {
            return a(view);
        }
        return true;
    }

    public void onPause() {
        if (this.c) {
            this.d.onPause();
        } else {
            com.tencent.smtt.utils.j.a(this.e, "onPause");
        }
    }

    public void onResume() {
        if (this.c) {
            this.d.onResume();
        } else {
            com.tencent.smtt.utils.j.a(this.e, "onResume");
        }
    }

    @Override // android.view.View
    @TargetApi(11)
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (!a(this.g) || !isHardwareAccelerated() || i2 <= 0 || i3 <= 0) {
            return;
        }
        getLayerType();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        Context context = this.g;
        if (context == null) {
            super.onVisibilityChanged(view, i2);
            return;
        }
        if (o == null) {
            o = context.getApplicationInfo().packageName;
        }
        String str = o;
        if (str != null && (str.equals(TbsConfig.APP_WX) || o.equals(TbsConfig.APP_QQ))) {
            super.onVisibilityChanged(view, i2);
            return;
        }
        if (i2 != 0 && !this.j && this.a != 0) {
            j();
        }
        super.onVisibilityChanged(view, i2);
    }

    public boolean overlayHorizontalScrollbar() {
        return !this.c ? this.e.overlayHorizontalScrollbar() : this.d.overlayHorizontalScrollbar();
    }

    public boolean overlayVerticalScrollbar() {
        return this.c ? this.d.overlayVerticalScrollbar() : this.e.overlayVerticalScrollbar();
    }

    public boolean pageDown(boolean z) {
        return !this.c ? this.e.pageDown(z) : this.d.pageDown(z, -1);
    }

    public boolean pageUp(boolean z) {
        return !this.c ? this.e.pageUp(z) : this.d.pageUp(z, -1);
    }

    public void pauseTimers() {
        if (this.c) {
            this.d.pauseTimers();
        } else {
            this.e.pauseTimers();
        }
    }

    @TargetApi(5)
    public void postUrl(String str, byte[] bArr) {
        if (this.c) {
            this.d.postUrl(str, bArr);
        } else {
            this.e.postUrl(str, bArr);
        }
    }

    @Deprecated
    public void refreshPlugins(boolean z) {
        if (this.c) {
            this.d.refreshPlugins(z);
        } else {
            com.tencent.smtt.utils.j.a(this.e, "refreshPlugins", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    public void reload() {
        if (this.c) {
            this.d.reload();
        } else {
            this.e.reload();
        }
    }

    @TargetApi(11)
    public void removeJavascriptInterface(String str) {
        if (this.c) {
            this.d.removeJavascriptInterface(str);
        } else {
            com.tencent.smtt.utils.j.a(this.e, "removeJavascriptInterface", (Class<?>[]) new Class[]{String.class}, str);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (!this.c) {
            this.e.removeView(view);
            return;
        }
        View view2 = this.d.getView();
        try {
            Method methodA = com.tencent.smtt.utils.j.a(view2, "removeView", View.class);
            methodA.setAccessible(true);
            methodA.invoke(view2, view);
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public JSONObject reportInitPerformance(long j, int i2, long j2, long j3) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        View view2;
        View view3;
        if (!this.c) {
            a aVar = this.e;
            if (view == this) {
                view2 = view;
                view2 = aVar;
            }
            view2 = view;
            return aVar.requestChildRectangleOnScreen(view2, rect, z);
        }
        View view4 = this.d.getView();
        if (!(view4 instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view4;
        if (view == this) {
            view3 = view;
            view3 = view4;
        }
        view3 = view;
        return viewGroup.requestChildRectangleOnScreen(view3, rect, z);
    }

    public void requestFocusNodeHref(Message message) {
        if (this.c) {
            this.d.requestFocusNodeHref(message);
        } else {
            this.e.requestFocusNodeHref(message);
        }
    }

    public void requestImageRef(Message message) {
        if (this.c) {
            this.d.requestImageRef(message);
        } else {
            this.e.requestImageRef(message);
        }
    }

    @Deprecated
    public boolean restorePicture(Bundle bundle, File file) {
        if (this.c) {
            return this.d.restorePicture(bundle, file);
        }
        Object objA = com.tencent.smtt.utils.j.a(this.e, "restorePicture", (Class<?>[]) new Class[]{Bundle.class, File.class}, bundle, file);
        if (objA == null) {
            return false;
        }
        return ((Boolean) objA).booleanValue();
    }

    public WebBackForwardList restoreState(Bundle bundle) {
        return !this.c ? WebBackForwardList.a(this.e.restoreState(bundle)) : WebBackForwardList.a(this.d.restoreState(bundle));
    }

    public void resumeTimers() {
        if (this.c) {
            this.d.resumeTimers();
        } else {
            this.e.resumeTimers();
        }
    }

    @Deprecated
    public void savePassword(String str, String str2, String str3) {
        if (this.c) {
            this.d.savePassword(str, str2, str3);
        } else {
            com.tencent.smtt.utils.j.a(this.e, "savePassword", (Class<?>[]) new Class[]{String.class, String.class, String.class}, str, str2, str3);
        }
    }

    @Deprecated
    public boolean savePicture(Bundle bundle, File file) {
        if (this.c) {
            return this.d.savePicture(bundle, file);
        }
        Object objA = com.tencent.smtt.utils.j.a(this.e, "savePicture", (Class<?>[]) new Class[]{Bundle.class, File.class}, bundle, file);
        if (objA == null) {
            return false;
        }
        return ((Boolean) objA).booleanValue();
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return !this.c ? WebBackForwardList.a(this.e.saveState(bundle)) : WebBackForwardList.a(this.d.saveState(bundle));
    }

    @TargetApi(11)
    public void saveWebArchive(String str) {
        if (this.c) {
            this.d.saveWebArchive(str);
        } else {
            com.tencent.smtt.utils.j.a(this.e, "saveWebArchive", (Class<?>[]) new Class[]{String.class}, str);
        }
    }

    public void setARModeEnable(boolean z) {
        try {
            if (this.c) {
                getSettingsExtension().setARModeEnable(z);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (this.c) {
            this.d.setBackgroundColor(i2);
        } else {
            this.e.setBackgroundColor(i2);
        }
        super.setBackgroundColor(i2);
    }

    @Deprecated
    public void setCertificate(SslCertificate sslCertificate) {
        if (this.c) {
            this.d.setCertificate(sslCertificate);
        } else {
            this.e.setCertificate(sslCertificate);
        }
    }

    public void setDayOrNight(boolean z) {
        try {
            if (this.c) {
                getSettingsExtension().setDayOrNight(z);
            }
            setSysDayOrNight(z);
            getView().postInvalidate();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setDownloadListener(final DownloadListener downloadListener) {
        boolean z = this.c;
        if (z) {
            this.d.setDownloadListener(new b(this, downloadListener, z));
        } else {
            this.e.setDownloadListener(new android.webkit.DownloadListener() { // from class: com.tencent.smtt.sdk.WebView.4
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    DownloadListener downloadListener2 = downloadListener;
                    if (downloadListener2 != null) {
                        downloadListener2.onDownloadStart(str, str2, str3, str4, j);
                        return;
                    }
                    ApplicationInfo applicationInfo = WebView.this.g == null ? null : WebView.this.g.getApplicationInfo();
                    if (applicationInfo == null || !TbsConfig.APP_WX.equals(applicationInfo.packageName)) {
                        MttLoader.loadUrl(WebView.this.g, str, null, null);
                    }
                }
            });
        }
    }

    @TargetApi(16)
    public void setFindListener(final IX5WebViewBase.FindListener findListener) {
        if (this.c) {
            this.d.setFindListener(findListener);
        } else {
            this.e.setFindListener(new android.webkit.WebView.FindListener() { // from class: com.tencent.smtt.sdk.WebView.3
                @Override // android.webkit.WebView.FindListener
                public void onFindResultReceived(int i2, int i3, boolean z) {
                    findListener.onFindResultReceived(i2, i3, z);
                }
            });
        }
    }

    public void setHorizontalScrollbarOverlay(boolean z) {
        if (this.c) {
            this.d.setHorizontalScrollbarOverlay(z);
        } else {
            this.e.setHorizontalScrollbarOverlay(z);
        }
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        if (this.c) {
            this.d.setHttpAuthUsernamePassword(str, str2, str3, str4);
        } else {
            this.e.setHttpAuthUsernamePassword(str, str2, str3, str4);
        }
    }

    public void setInitialScale(int i2) {
        if (this.c) {
            this.d.setInitialScale(i2);
        } else {
            this.e.setInitialScale(i2);
        }
    }

    @Deprecated
    public void setMapTrackballToArrowKeys(boolean z) {
        if (this.c) {
            this.d.setMapTrackballToArrowKeys(z);
        } else {
            com.tencent.smtt.utils.j.a(this.e, "setMapTrackballToArrowKeys", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    public void setNetworkAvailable(boolean z) {
        if (this.c) {
            this.d.setNetworkAvailable(z);
        } else {
            this.e.setNetworkAvailable(z);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        if (!this.c) {
            this.e.setOnLongClickListener(onLongClickListener);
            return;
        }
        View view = this.d.getView();
        try {
            if (this.w == null) {
                Method methodA = com.tencent.smtt.utils.j.a(view, "getListenerInfo", new Class[0]);
                methodA.setAccessible(true);
                Object objInvoke = methodA.invoke(view, null);
                Field declaredField = objInvoke.getClass().getDeclaredField("mOnLongClickListener");
                declaredField.setAccessible(true);
                this.w = declaredField.get(objInvoke);
            }
            this.x = onLongClickListener;
            getView().setOnLongClickListener(this);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        getView().setOnTouchListener(onTouchListener);
    }

    @Deprecated
    public void setPictureListener(final PictureListener pictureListener) {
        if (this.c) {
            if (pictureListener == null) {
                this.d.setPictureListener(null);
                return;
            } else {
                this.d.setPictureListener(new IX5WebViewBase.PictureListener() { // from class: com.tencent.smtt.sdk.WebView.6
                    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener
                    public void onNewPicture(IX5WebViewBase iX5WebViewBase, Picture picture, boolean z) {
                        WebView.this.a(iX5WebViewBase);
                        pictureListener.onNewPicture(WebView.this, picture);
                    }

                    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener
                    public void onNewPictureIfHaveContent(IX5WebViewBase iX5WebViewBase, Picture picture) {
                    }
                });
                return;
            }
        }
        if (pictureListener == null) {
            this.e.setPictureListener(null);
        } else {
            this.e.setPictureListener(new android.webkit.WebView.PictureListener() { // from class: com.tencent.smtt.sdk.WebView.5
                @Override // android.webkit.WebView.PictureListener
                public void onNewPicture(android.webkit.WebView webView, Picture picture) {
                    WebView.this.a(webView);
                    pictureListener.onNewPicture(WebView.this, picture);
                }
            });
        }
    }

    public void setRendererPriorityPolicy(int i2, boolean z) {
        try {
            if (this.c || Build.VERSION.SDK_INT < 26) {
                return;
            }
            com.tencent.smtt.utils.j.a(this.e, "setRendererPriorityPolicy", (Class<?>[]) new Class[]{Integer.TYPE, Boolean.TYPE}, Integer.valueOf(i2), Boolean.valueOf(z));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public void setScrollBarStyle(int i2) {
        if (this.c) {
            this.d.getView().setScrollBarStyle(i2);
        } else {
            this.e.setScrollBarStyle(i2);
        }
    }

    public void setSysNightModeAlpha(int i2) {
        NIGHT_MODE_ALPHA = i2;
    }

    public void setVerticalScrollbarOverlay(boolean z) {
        if (this.c) {
            this.d.setVerticalScrollbarOverlay(z);
        } else {
            this.e.setVerticalScrollbarOverlay(z);
        }
    }

    public boolean setVideoFullScreen(Context context, boolean z) {
        if (!context.getApplicationInfo().processName.contains("com.tencent.android.qqdownloader") || this.d == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putInt("DefaultVideoScreen", 2);
        } else {
            bundle.putInt("DefaultVideoScreen", 1);
        }
        this.d.getX5WebViewExtension().invokeMiscMethod("setVideoParams", bundle);
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (getView() == null) {
            return;
        }
        getView().setVisibility(i2);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        a aVar;
        android.webkit.WebChromeClient systemWebChromeClient = null;
        if (this.c) {
            this.d.setWebChromeClient(webChromeClient != null ? new h(u.a().a(true).i(), this, webChromeClient) : null);
        } else {
            if (webChromeClient == null) {
                aVar = this.e;
            } else if (a(webChromeClient)) {
                aVar = this.e;
                systemWebChromeClient = new c(this, webChromeClient);
            } else {
                aVar = this.e;
                systemWebChromeClient = new SystemWebChromeClient(this, webChromeClient);
            }
            aVar.setWebChromeClient(systemWebChromeClient);
        }
        this.n = webChromeClient;
    }

    public void setWebChromeClientExtension(IX5WebChromeClientExtension iX5WebChromeClientExtension) {
        if (this.c) {
            this.d.getX5WebViewExtension().setWebChromeClientExtension(iX5WebChromeClientExtension);
        }
    }

    public void setWebViewCallbackClient(WebViewCallbackClient webViewCallbackClient) {
        this.mWebViewCallbackClient = webViewCallbackClient;
        if (!this.c || getX5WebViewExtension() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("flag", true);
        getX5WebViewExtension().invokeMiscMethod("setWebViewCallbackClientFlag", bundle);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        if (this.c) {
            this.d.setWebViewClient(webViewClient != null ? new i(u.a().a(true).j(), this, webViewClient) : null);
        } else {
            this.e.setWebViewClient(webViewClient != null ? new SystemWebViewClient(this, webViewClient) : null);
        }
        this.m = webViewClient;
    }

    public void setWebViewClientExtension(IX5WebViewClientExtension iX5WebViewClientExtension) {
        if (this.c) {
            this.d.getX5WebViewExtension().setWebViewClientExtension(iX5WebViewClientExtension);
        }
    }

    @SuppressLint({"NewApi"})
    public boolean showDebugView(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("https://debugtbs.qq.com")) {
            getView().setVisibility(4);
            com.tencent.smtt.utils.d.a(this.g).a(lowerCase, this, this.g, TbsHandlerThread.getInstance().getLooper());
            return true;
        }
        if (!lowerCase.startsWith("https://debugx5.qq.com") || this.c) {
            return false;
        }
        loadDataWithBaseURL(null, "<!DOCTYPE html><html><body><head><title>无法打开debugx5</title><meta name=\"viewport\" content=\"width=device-width, user-scalable=no\" /></head><br/><br /><h2>debugx5页面仅在使用了X5内核时有效，由于当前没有使用X5内核，无法打开debugx5！</h2><br />尝试<a href=\"https://debugtbs.qq.com?10000\">进入DebugTbs安装或打开X5内核</a></body></html>", "text/html", "utf-8", null);
        return true;
    }

    public boolean showFindDialog(String str, boolean z) {
        return false;
    }

    public void stopLoading() {
        if (this.c) {
            this.d.stopLoading();
        } else {
            this.e.stopLoading();
        }
    }

    public void super_computeScroll() {
        if (!this.c) {
            this.e.a();
            return;
        }
        try {
            com.tencent.smtt.utils.j.a(this.d.getView(), "super_computeScroll");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean super_dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.c) {
            return this.e.b(motionEvent);
        }
        try {
            Object objA = com.tencent.smtt.utils.j.a(this.d.getView(), "super_dispatchTouchEvent", (Class<?>[]) new Class[]{MotionEvent.class}, motionEvent);
            if (objA == null) {
                return false;
            }
            return ((Boolean) objA).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean super_onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.c) {
            return this.e.c(motionEvent);
        }
        try {
            Object objA = com.tencent.smtt.utils.j.a(this.d.getView(), "super_onInterceptTouchEvent", (Class<?>[]) new Class[]{MotionEvent.class}, motionEvent);
            if (objA == null) {
                return false;
            }
            return ((Boolean) objA).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void super_onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        if (!this.c) {
            this.e.a(i2, i3, z, z2);
            return;
        }
        View view = this.d.getView();
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            com.tencent.smtt.utils.j.a(view, "super_onOverScrolled", (Class<?>[]) new Class[]{cls, cls, cls2, cls2}, Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Boolean.valueOf(z2));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void super_onScrollChanged(int i2, int i3, int i4, int i5) {
        if (!this.c) {
            this.e.a(i2, i3, i4, i5);
            return;
        }
        View view = this.d.getView();
        try {
            Class cls = Integer.TYPE;
            com.tencent.smtt.utils.j.a(view, "super_onScrollChanged", (Class<?>[]) new Class[]{cls, cls, cls, cls}, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean super_onTouchEvent(MotionEvent motionEvent) {
        if (!this.c) {
            return this.e.a(motionEvent);
        }
        try {
            Object objA = com.tencent.smtt.utils.j.a(this.d.getView(), "super_onTouchEvent", (Class<?>[]) new Class[]{MotionEvent.class}, motionEvent);
            if (objA == null) {
                return false;
            }
            return ((Boolean) objA).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean super_overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        if (!this.c) {
            return this.e.a(i2, i3, i4, i5, i6, i7, i8, i9, z);
        }
        View view = this.d.getView();
        try {
            Class cls = Integer.TYPE;
            Object objA = com.tencent.smtt.utils.j.a(view, "super_overScrollBy", (Class<?>[]) new Class[]{cls, cls, cls, cls, cls, cls, cls, cls, Boolean.TYPE}, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Boolean.valueOf(z));
            if (objA == null) {
                return false;
            }
            return ((Boolean) objA).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void switchNightMode(boolean z) {
        String str;
        if (z == v) {
            return;
        }
        v = z;
        if (z) {
            TbsLog.e("QB_SDK", "deleteNightMode");
            str = "javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));";
        } else {
            TbsLog.e("QB_SDK", "nightMode");
            str = "javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);";
        }
        loadUrl(str);
    }

    public void switchToNightMode() {
        TbsLog.e("QB_SDK", "switchToNightMode 01");
        if (v) {
            return;
        }
        TbsLog.e("QB_SDK", "switchToNightMode");
        loadUrl("javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);");
    }

    public boolean zoomIn() {
        return !this.c ? this.e.zoomIn() : this.d.zoomIn();
    }

    public boolean zoomOut() {
        return !this.c ? this.e.zoomOut() : this.d.zoomOut();
    }

    public WebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        u uVarA = u.a();
        uVarA.a(context);
        this.h.b(System.currentTimeMillis() - jCurrentTimeMillis);
        this.c = uVarA.b();
    }

    public static void c() {
        try {
            new Thread(new Runnable() { // from class: com.tencent.smtt.sdk.WebView.8
                @Override // java.lang.Runnable
                public void run() {
                    if (WebView.i == null) {
                        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--mAppContext == null");
                        return;
                    }
                    f fVarA = f.a(true);
                    if (f.b) {
                        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--needReboot = true");
                        return;
                    }
                    l lVarA = l.a(WebView.i);
                    int iC = lVarA.c();
                    TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--installStatus = " + iC);
                    if (iC == 2) {
                        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--install setTbsNeedReboot true");
                        fVarA.a(String.valueOf(lVarA.b()));
                        fVarA.b(true);
                        return;
                    }
                    int iB = lVarA.b("copy_status");
                    TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--copyStatus = " + iB);
                    if (iB == 1) {
                        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--copy setTbsNeedReboot true");
                        fVarA.a(String.valueOf(lVarA.c("copy_core_ver")));
                        fVarA.b(true);
                    } else {
                        if (u.a().b()) {
                            return;
                        }
                        if (iC == 3 || iB == 3) {
                            TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--setTbsNeedReboot true");
                            fVarA.a(String.valueOf(f.d()));
                            fVarA.b(true);
                        }
                    }
                }
            }).start();
        } catch (Throwable th) {
            TbsLog.e("webview", "updateRebootStatus excpetion: " + th);
        }
    }

    @TargetApi(8)
    public void loadUrl(String str, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str == null || showDebugView(str)) {
            return;
        }
        if (this.c) {
            this.d.loadUrl(str, map);
        } else {
            this.e.loadUrl(str, map);
        }
        this.h.a(System.currentTimeMillis() - jCurrentTimeMillis, str);
    }

    @TargetApi(11)
    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
        if (this.c) {
            this.d.saveWebArchive(str, z, valueCallback);
        } else {
            com.tencent.smtt.utils.j.a(this.e, "saveWebArchive", (Class<?>[]) new Class[]{String.class, Boolean.TYPE, android.webkit.ValueCallback.class}, str, Boolean.valueOf(z), valueCallback);
        }
    }

    public WebView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, false);
    }

    public android.webkit.WebView a() {
        if (this.c) {
            return null;
        }
        return this.e;
    }

    @TargetApi(11)
    public WebView(Context context, AttributeSet attributeSet, int i2, Map<String, Object> map, boolean z) {
        super(context, attributeSet, i2);
        this.b = "WebView";
        this.c = false;
        this.f = null;
        this.g = null;
        this.h = new TbsWebViewPerformanceRecorder();
        this.a = 0;
        this.j = false;
        this.k = false;
        this.m = null;
        this.n = null;
        this.p = 1;
        this.q = 2;
        this.r = 3;
        this.s = "javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));";
        this.t = "javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);";
        this.w = null;
        this.x = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        mWebViewCreated = true;
        if (QbSdk.getIsSysWebViewForcedByOuter() && TbsShareManager.isThirdPartyApp(context)) {
            this.g = context;
            this.d = null;
            this.c = false;
            QbSdk.a(context, "failed to createTBSWebview!");
            this.e = new a(context, attributeSet);
            CookieSyncManager.createInstance(this.g).startSync();
            try {
                Method declaredMethod = Class.forName("android.webkit.WebViewWorker").getDeclaredMethod("getHandler", null);
                declaredMethod.setAccessible(true);
                ((Handler) declaredMethod.invoke(null, null)).getLooper().getThread().setUncaughtExceptionHandler(new g());
            } catch (Exception unused) {
            }
            CookieManager.getInstance().a();
            this.e.setFocusableInTouchMode(true);
            addView(this.e, new FrameLayout.LayoutParams(-1, -1));
            TbsLog.i("WebView", "SystemWebView Created Success! #3, SysWebViewForcedByOuter.");
            TbsLog.e("WebView", "sys WebView: IsSysWebViewForcedByOuter = true", true);
        } else {
            if (TbsShareManager.isThirdPartyApp(context)) {
                TbsLog.i("webview", "new WebView, thread is " + Thread.currentThread() + "stack: " + Log.getStackTraceString(new Throwable("new WebView Detect")));
            }
            TbsLog.initIfNeed(context);
            if (context == null) {
                throw new IllegalArgumentException("Invalid context argument");
            }
            b(context);
            this.g = context;
            i = context.getApplicationContext();
            if (!this.c || QbSdk.a) {
                this.d = null;
                if (TbsShareManager.isThirdPartyApp(this.g)) {
                    this.e = new a(context, attributeSet);
                } else {
                    this.e = new a(this, context);
                }
                TbsLog.i("WebView", "SystemWebView Created Success! #2");
                CookieManager.getInstance().a();
                this.e.setFocusableInTouchMode(true);
                addView(this.e, new FrameLayout.LayoutParams(-1, -1));
                setDownloadListener(null);
                TbsLog.writeLogToDisk();
                m.a(context);
            } else {
                IX5WebViewBase iX5WebViewBaseA = u.a().a(true).a(context);
                this.d = iX5WebViewBaseA;
                if (iX5WebViewBaseA == null || iX5WebViewBaseA.getView() == null) {
                    TbsLog.e("WebView", "sys WebView: failed to createTBSWebview", true);
                    this.d = null;
                    this.c = false;
                    QbSdk.a(context, "failed to createTBSWebview!");
                    b(context);
                    if (TbsShareManager.isThirdPartyApp(this.g)) {
                        this.e = new a(context, attributeSet);
                    } else {
                        this.e = new a(this, context);
                    }
                    TbsLog.i("WebView", "SystemWebView Created Success! #1");
                    CookieManager.getInstance().a();
                    this.e.setFocusableInTouchMode(true);
                    addView(this.e, new FrameLayout.LayoutParams(-1, -1));
                    try {
                        removeJavascriptInterface("searchBoxJavaBridge_");
                        removeJavascriptInterface("accessibility");
                        removeJavascriptInterface("accessibilityTraversal");
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    TbsLog.writeLogToDisk();
                    m.a(context);
                } else {
                    TbsLog.i("WebView", "X5 WebView Created Success!!");
                    this.d.getView().setFocusableInTouchMode(true);
                    a(attributeSet);
                    addView(this.d.getView(), new FrameLayout.LayoutParams(-1, -1));
                    this.d.setDownloadListener(new b(this, null, this.c));
                    this.d.getX5WebViewExtension().setWebViewClientExtension(new X5ProxyWebViewClientExtension(u.a().a(true).k()) { // from class: com.tencent.smtt.sdk.WebView.1
                        @Override // com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension, com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
                        public void invalidate() {
                        }

                        @Override // com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension, com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
                        public void onScrollChanged(int i3, int i4, int i5, int i6) {
                            super.onScrollChanged(i3, i4, i5, i6);
                            WebView.this.onScrollChanged(i5, i6, i3, i4);
                        }
                    });
                }
            }
            try {
                removeJavascriptInterface("searchBoxJavaBridge_");
                removeJavascriptInterface("accessibility");
                removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            if ((TbsConfig.APP_QQ.equals(this.g.getApplicationInfo().packageName) || TbsConfig.APP_WX.equals(this.g.getApplicationInfo().packageName)) && f.a(true).i()) {
                setLayerType(1, null);
            }
            if (this.d != null) {
                TbsLog.writeLogToDisk();
            }
        }
        this.h.a(System.currentTimeMillis() - jCurrentTimeMillis);
    }

    private void a(AttributeSet attributeSet) {
        View view;
        if (attributeSet != null) {
            try {
                int attributeCount = attributeSet.getAttributeCount();
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    if (attributeSet.getAttributeName(i2).equalsIgnoreCase("scrollbars")) {
                        int[] intArray = getResources().getIntArray(R.attr.scrollbars);
                        int attributeIntValue = attributeSet.getAttributeIntValue(i2, -1);
                        if (attributeIntValue == intArray[1]) {
                            this.d.getView().setVerticalScrollBarEnabled(false);
                            view = this.d.getView();
                        } else if (attributeIntValue == intArray[2]) {
                            this.d.getView().setVerticalScrollBarEnabled(false);
                        } else if (attributeIntValue == intArray[3]) {
                            view = this.d.getView();
                        }
                        view.setHorizontalScrollBarEnabled(false);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Deprecated
    public WebView(Context context, AttributeSet attributeSet, int i2, boolean z) {
        this(context, attributeSet, i2, null, z);
    }

    public void a(android.webkit.WebView webView) {
    }

    @Deprecated
    public WebView(Context context, boolean z) {
        super(context);
        this.b = "WebView";
        this.c = false;
        this.f = null;
        this.g = null;
        this.h = new TbsWebViewPerformanceRecorder();
        this.a = 0;
        this.j = false;
        this.k = false;
        this.m = null;
        this.n = null;
        this.p = 1;
        this.q = 2;
        this.r = 3;
        this.s = "javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));";
        this.t = "javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);";
        this.w = null;
        this.x = null;
    }

    public void a(IX5WebViewBase iX5WebViewBase) {
        this.d = iX5WebViewBase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (!this.j && this.a != 0) {
            j();
        }
        if (!this.c) {
            try {
                Class<?> cls = Class.forName("android.webkit.WebViewClassic");
                Method method = cls.getMethod("fromWebView", android.webkit.WebView.class);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, this.e);
                if (objInvoke != null) {
                    Field declaredField = cls.getDeclaredField("mListBoxDialog");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(objInvoke);
                    if (obj != null) {
                        Dialog dialog = (Dialog) obj;
                        dialog.setOnCancelListener(null);
                        Class<?> cls2 = Class.forName("android.app.Dialog");
                        Field declaredField2 = cls2.getDeclaredField("CANCEL");
                        declaredField2.setAccessible(true);
                        int iIntValue = ((Integer) declaredField2.get(dialog)).intValue();
                        Field declaredField3 = cls2.getDeclaredField("mListenersHandler");
                        declaredField3.setAccessible(true);
                        ((Handler) declaredField3.get(dialog)).removeMessages(iIntValue);
                    }
                }
            } catch (Exception unused) {
            }
            if (z) {
                this.e.destroy();
            }
            try {
                TbsLog.i("sdkreport", "webview.tbsWebviewDestroy mQQMusicCrashFix is " + this.k);
                if (this.k) {
                    return;
                }
                Field declaredField4 = Class.forName("android.webkit.BrowserFrame").getDeclaredField("sConfigCallback");
                declaredField4.setAccessible(true);
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) declaredField4.get(null);
                if (componentCallbacks != null) {
                    declaredField4.set(null, null);
                    Field declaredField5 = Class.forName("android.view.ViewRoot").getDeclaredField("sConfigCallbacks");
                    declaredField5.setAccessible(true);
                    Object obj2 = declaredField5.get(null);
                    if (obj2 != null) {
                        List list = (List) obj2;
                        synchronized (list) {
                            list.remove(componentCallbacks);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        } else if (z) {
            this.d.destroy();
        }
        TbsLog.i("WebView", "X5 GUID = " + QbSdk.b());
    }

    private boolean a(Context context) {
        try {
            return context.getPackageName().indexOf(TbsConfig.APP_QQ) >= 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private boolean a(View view) {
        Object objA;
        Context context = this.g;
        if ((context == null || getTbsCoreVersion(context) <= 36200) && (objA = com.tencent.smtt.utils.j.a(this.w, "onLongClick", (Class<?>[]) new Class[]{View.class}, view)) != null) {
            return ((Boolean) objA).booleanValue();
        }
        return false;
    }

    private boolean a(WebChromeClient webChromeClient) {
        if (webChromeClient == null) {
            return false;
        }
        boolean z = false;
        boolean z2 = false;
        for (Class<?> superclass = webChromeClient.getClass(); superclass != WebChromeClient.class && (!z || !z2); superclass = superclass.getSuperclass()) {
            if (!z) {
                try {
                    superclass.getDeclaredMethod("onShowCustomView", View.class, IX5WebChromeClient.CustomViewCallback.class);
                    z = true;
                } catch (NoSuchMethodException unused) {
                }
            }
            if (!z2) {
                try {
                    superclass.getDeclaredMethod("onHideCustomView", null);
                    z2 = true;
                } catch (NoSuchMethodException unused2) {
                }
            }
        }
        return z && z2;
    }
}
