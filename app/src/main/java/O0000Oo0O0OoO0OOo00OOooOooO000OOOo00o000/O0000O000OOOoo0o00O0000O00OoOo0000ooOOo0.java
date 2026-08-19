package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 extends WebViewClient {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 f1538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00) {
        this.f1538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
    }

    @Override // com.tencent.smtt.sdk.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = this.f1538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (!TextUtils.isEmpty(o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1540O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
            o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.evaluateJavascript(o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1540O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, null);
        }
        Log.e("SimpleWebView", "onPageFinished url：" + str);
        O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1543O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }
        if (o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1541O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO > 0) {
            new Handler().postDelayed(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, 6), o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1541O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }

    @Override // com.tencent.smtt.sdk.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.proceed();
    }

    @Override // com.tencent.smtt.sdk.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, WebViewClient.RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!renderProcessGoneDetail.didCrash()) {
            return false;
        }
        O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f1538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1543O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null) {
            return true;
        }
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        return true;
    }

    @Override // com.tencent.smtt.sdk.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl().toString();
        O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = this.f1538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.getClass();
        String path = webResourceRequest.getUrl().getPath();
        return (webResourceRequest.isForMainFrame() || path == null || !o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1544O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.matcher(path).matches()) ? super.shouldInterceptRequest(webView, webResourceRequest) : new WebResourceResponse("image/png", "utf-8", new ByteArrayInputStream(new byte[0]));
    }

    @Override // com.tencent.smtt.sdk.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }

    @Override // com.tencent.smtt.sdk.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}
