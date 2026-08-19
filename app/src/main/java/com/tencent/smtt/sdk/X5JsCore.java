package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsVirtualMachine;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class X5JsCore {
    private static a a;
    private static a b;
    private static a c;
    private final Context d;
    private Object e;
    private WebView f;

    public enum a {
        UNINITIALIZED,
        UNAVAILABLE,
        AVAILABLE
    }

    static {
        a aVar = a.UNINITIALIZED;
        a = aVar;
        b = aVar;
        c = aVar;
    }

    @Deprecated
    public X5JsCore(Context context) {
        Object objA;
        this.e = null;
        this.f = null;
        this.d = context;
        if (canUseX5JsCore(context) && (objA = a("createX5JavaBridge", new Class[]{Context.class}, context)) != null) {
            this.e = objA;
            return;
        }
        Log.e("X5JsCore", "X5JsCore create X5JavaBridge failure, use fallback!");
        WebView webView = new WebView(context);
        this.f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
    }

    public static IX5JsVirtualMachine a(Context context, Looper looper) {
        Object objA;
        if (canUseX5JsCore(context) && (objA = a("createX5JsVirtualMachine", new Class[]{Context.class, Looper.class}, context, looper)) != null) {
            return (IX5JsVirtualMachine) objA;
        }
        Log.e("X5JsCore", "X5JsCore#createVirtualMachine failure!");
        return null;
    }

    public static boolean canUseX5JsCore(Context context) {
        if (a != a.UNINITIALIZED) {
            return a == a.AVAILABLE;
        }
        a = a.UNAVAILABLE;
        Object objA = a("canUseX5JsCore", new Class[]{Context.class}, context);
        if (objA == null || !(objA instanceof Boolean) || !((Boolean) objA).booleanValue()) {
            return false;
        }
        a("setJsValueFactory", new Class[]{Object.class}, JsValue.a());
        a = a.AVAILABLE;
        return true;
    }

    public static boolean canUseX5JsCoreNewAPI(Context context) {
        if (c != a.UNINITIALIZED) {
            return c == a.AVAILABLE;
        }
        c = a.UNAVAILABLE;
        Object objA = a("canUseX5JsCoreNewAPI", new Class[]{Context.class}, context);
        if (objA == null || !(objA instanceof Boolean) || !((Boolean) objA).booleanValue()) {
            return false;
        }
        c = a.AVAILABLE;
        return true;
    }

    public static boolean canX5JsCoreUseNativeBuffer(Context context) {
        Object objA;
        if (b != a.UNINITIALIZED) {
            return b == a.AVAILABLE;
        }
        b = a.UNAVAILABLE;
        if (!canUseX5JsCore(context) || (objA = a("canX5JsCoreUseBuffer", new Class[]{Context.class}, context)) == null || !(objA instanceof Boolean) || !((Boolean) objA).booleanValue()) {
            return false;
        }
        b = a.AVAILABLE;
        return true;
    }

    @Deprecated
    public void addJavascriptInterface(Object obj, String str) {
        Object obj2 = this.e;
        if (obj2 != null) {
            a("addJavascriptInterface", new Class[]{Object.class, String.class, Object.class}, obj, str, obj2);
            return;
        }
        WebView webView = this.f;
        if (webView != null) {
            webView.addJavascriptInterface(obj, str);
            this.f.loadUrl("about:blank");
        }
    }

    @Deprecated
    public void destroy() {
        Object obj = this.e;
        if (obj != null) {
            a("destroyX5JsCore", new Class[]{Object.class}, obj);
            this.e = null;
            return;
        }
        WebView webView = this.f;
        if (webView != null) {
            webView.clearHistory();
            this.f.clearCache(true);
            this.f.loadUrl("about:blank");
            this.f.freeMemory();
            this.f.pauseTimers();
            this.f.destroy();
            this.f = null;
        }
    }

    @Deprecated
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        Object obj = this.e;
        if (obj != null) {
            a("evaluateJavascript", new Class[]{String.class, android.webkit.ValueCallback.class, Object.class}, str, valueCallback, obj);
            return;
        }
        WebView webView = this.f;
        if (webView != null) {
            webView.evaluateJavascript(str, valueCallback);
        }
    }

    @Deprecated
    public ByteBuffer getNativeBuffer(int i) {
        Object objA;
        if (this.e == null || !canX5JsCoreUseNativeBuffer(this.d) || (objA = a("getNativeBuffer", new Class[]{Object.class, Integer.TYPE}, this.e, Integer.valueOf(i))) == null || !(objA instanceof ByteBuffer)) {
            return null;
        }
        return (ByteBuffer) objA;
    }

    @Deprecated
    public int getNativeBufferId() {
        Object objA;
        if (this.e == null || !canX5JsCoreUseNativeBuffer(this.d) || (objA = a("getNativeBufferId", new Class[]{Object.class}, this.e)) == null || !(objA instanceof Integer)) {
            return -1;
        }
        return ((Integer) objA).intValue();
    }

    @Deprecated
    public void pause() {
        Object obj = this.e;
        if (obj != null) {
            a("pause", new Class[]{Object.class}, obj);
        }
    }

    @Deprecated
    public void pauseTimers() {
        Object obj = this.e;
        if (obj != null) {
            a("pauseTimers", new Class[]{Object.class}, obj);
        }
    }

    @Deprecated
    public void removeJavascriptInterface(String str) {
        Object obj = this.e;
        if (obj != null) {
            a("removeJavascriptInterface", new Class[]{String.class, Object.class}, str, obj);
            return;
        }
        WebView webView = this.f;
        if (webView != null) {
            webView.removeJavascriptInterface(str);
        }
    }

    @Deprecated
    public void resume() {
        Object obj = this.e;
        if (obj != null) {
            a("resume", new Class[]{Object.class}, obj);
        }
    }

    @Deprecated
    public void resumeTimers() {
        Object obj = this.e;
        if (obj != null) {
            a("resumeTimers", new Class[]{Object.class}, obj);
        }
    }

    @Deprecated
    public void setNativeBuffer(int i, ByteBuffer byteBuffer) {
        if (this.e == null || !canX5JsCoreUseNativeBuffer(this.d)) {
            return;
        }
        a("setNativeBuffer", new Class[]{Object.class, Integer.TYPE, ByteBuffer.class}, this.e, Integer.valueOf(i), byteBuffer);
    }

    public static Object a() {
        return a("currentContextData", new Class[0], new Object[0]);
    }

    private static Object a(String str, Class<?>[] clsArr, Object... objArr) {
        try {
            u uVarA = u.a();
            if (uVarA != null && uVarA.b()) {
                return uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", str, clsArr, objArr);
            }
            Log.e("X5JsCore", "X5Jscore#" + str + " - x5CoreEngine is null or is not x5core.");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
