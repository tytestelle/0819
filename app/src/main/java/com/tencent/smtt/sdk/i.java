package com.tencent.smtt.sdk;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import com.tencent.smtt.export.external.interfaces.ClientCertRequest;
import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceError;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.export.external.proxy.X5ProxyWebViewClient;

/* JADX INFO: loaded from: classes2.dex */
class i extends X5ProxyWebViewClient {
    private static String c;
    private WebViewClient a;
    private WebView b;

    public i(IX5WebViewClient iX5WebViewClient, WebView webView, WebViewClient webViewClient) {
        super(iX5WebViewClient);
        this.b = webView;
        this.a = webViewClient;
        webViewClient.mX5Client = this;
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient
    public void countPVContentCacheCallBack(String str) {
        this.b.a++;
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void doUpdateVisitedHistory(IX5WebViewBase iX5WebViewBase, String str, boolean z) {
        this.b.a(iX5WebViewBase);
        this.a.doUpdateVisitedHistory(this.b, str, z);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onDetectedBlankScreen(IX5WebViewBase iX5WebViewBase, String str, int i) {
        this.b.a(iX5WebViewBase);
        this.a.onDetectedBlankScreen(str, i);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onFormResubmission(IX5WebViewBase iX5WebViewBase, Message message, Message message2) {
        this.b.a(iX5WebViewBase);
        this.a.onFormResubmission(this.b, message, message2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onLoadResource(IX5WebViewBase iX5WebViewBase, String str) {
        this.b.a(iX5WebViewBase);
        this.a.onLoadResource(this.b, str);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageCommitVisible(IX5WebViewBase iX5WebViewBase, String str) {
        this.b.a(iX5WebViewBase);
        this.a.onPageCommitVisible(this.b, str);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageFinished(IX5WebViewBase iX5WebViewBase, int i, int i2, String str) {
        com.tencent.smtt.utils.p pVarA;
        TbsPrivacyAccess.rmPrivacyItemIfNeeded(iX5WebViewBase.getView().getContext().getApplicationContext());
        if (c == null && (pVarA = com.tencent.smtt.utils.p.a()) != null) {
            pVarA.a(false);
            c = Boolean.toString(false);
        }
        this.b.a(iX5WebViewBase);
        this.b.a++;
        this.a.onPageFinished(this.b, str);
        try {
            super.onPageFinished(iX5WebViewBase, i, i2, str);
        } catch (Exception unused) {
        }
        WebView.c();
        if (!TbsShareManager.mHasQueried && this.b.getContext() != null && TbsShareManager.isThirdPartyApp(this.b.getContext()) && !QbSdk.d()) {
            TbsShareManager.mHasQueried = true;
            new Thread(new Runnable() { // from class: com.tencent.smtt.sdk.i.1
                @Override // java.lang.Runnable
                public void run() {
                    TbsDownloader.needDownload(i.this.b.getContext(), false);
                }
            }).start();
        }
        if (this.b.getContext() == null || TbsLogReport.getInstance(this.b.getContext()).getShouldUploadEventReport()) {
            return;
        }
        TbsLogReport.getInstance(this.b.getContext()).setShouldUploadEventReport(true);
        TbsLogReport.getInstance(this.b.getContext()).dailyReport();
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageStarted(IX5WebViewBase iX5WebViewBase, int i, int i2, String str, Bitmap bitmap) {
        this.b.a(iX5WebViewBase);
        this.a.onPageStarted(this.b, str, bitmap);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedClientCertRequest(IX5WebViewBase iX5WebViewBase, ClientCertRequest clientCertRequest) {
        this.b.a(iX5WebViewBase);
        this.a.onReceivedClientCertRequest(this.b, clientCertRequest);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedError(IX5WebViewBase iX5WebViewBase, int i, String str, String str2) {
        if (i < -15) {
            if (i != -17) {
                return;
            } else {
                i = -1;
            }
        }
        this.b.a(iX5WebViewBase);
        this.a.onReceivedError(this.b, i, str, str2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedHttpAuthRequest(IX5WebViewBase iX5WebViewBase, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.b.a(iX5WebViewBase);
        this.a.onReceivedHttpAuthRequest(this.b, httpAuthHandler, str, str2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedHttpError(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.b.a(iX5WebViewBase);
        this.a.onReceivedHttpError(this.b, webResourceRequest, webResourceResponse);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedLoginRequest(IX5WebViewBase iX5WebViewBase, String str, String str2, String str3) {
        this.b.a(iX5WebViewBase);
        this.a.onReceivedLoginRequest(this.b, str, str2, str3);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedSslError(IX5WebViewBase iX5WebViewBase, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.b.a(iX5WebViewBase);
        this.a.onReceivedSslError(this.b, sslErrorHandler, sslError);
    }

    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean onRenderProcessGone(IX5WebViewBase iX5WebViewBase, final boolean z, final int i) {
        return this.a.onRenderProcessGone(this.b, new WebViewClient.RenderProcessGoneDetail() { // from class: com.tencent.smtt.sdk.i.2
            @Override // com.tencent.smtt.sdk.WebViewClient.RenderProcessGoneDetail
            public boolean didCrash() {
                return z;
            }

            @Override // com.tencent.smtt.sdk.WebViewClient.RenderProcessGoneDetail
            public int rendererPriorityAtExit() {
                return i;
            }
        });
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onScaleChanged(IX5WebViewBase iX5WebViewBase, float f, float f2) {
        this.b.a(iX5WebViewBase);
        this.a.onScaleChanged(this.b, f, f2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onTooManyRedirects(IX5WebViewBase iX5WebViewBase, Message message, Message message2) {
        this.b.a(iX5WebViewBase);
        this.a.onTooManyRedirects(this.b, message, message2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onUnhandledKeyEvent(IX5WebViewBase iX5WebViewBase, KeyEvent keyEvent) {
        this.b.a(iX5WebViewBase);
        this.a.onUnhandledKeyEvent(this.b, keyEvent);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest) {
        this.b.a(iX5WebViewBase);
        return this.a.shouldInterceptRequest(this.b, webResourceRequest);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideKeyEvent(IX5WebViewBase iX5WebViewBase, KeyEvent keyEvent) {
        this.b.a(iX5WebViewBase);
        return this.a.shouldOverrideKeyEvent(this.b, keyEvent);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideUrlLoading(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest) {
        String string = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? null : webResourceRequest.getUrl().toString();
        if (string == null || this.b.showDebugView(string)) {
            return true;
        }
        this.b.a(iX5WebViewBase);
        boolean zShouldOverrideUrlLoading = this.a.shouldOverrideUrlLoading(this.b, webResourceRequest);
        if (!zShouldOverrideUrlLoading) {
            if (string.startsWith("wtai://wp/mc;")) {
                this.b.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(WebView.SCHEME_TEL + string.substring(13))));
                return true;
            }
            if (string.startsWith(WebView.SCHEME_TEL)) {
                a(string);
                return true;
            }
        }
        return zShouldOverrideUrlLoading;
    }

    public void a(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(this.b.b(), 0, 0, str, bitmap);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageFinished(IX5WebViewBase iX5WebViewBase, String str) {
        onPageFinished(iX5WebViewBase, 0, 0, str);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageStarted(IX5WebViewBase iX5WebViewBase, String str, Bitmap bitmap) {
        onPageStarted(iX5WebViewBase, 0, 0, str, bitmap);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedError(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.b.a(iX5WebViewBase);
        this.a.onReceivedError(this.b, webResourceRequest, webResourceError);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, Bundle bundle) {
        this.b.a(iX5WebViewBase);
        return this.a.shouldInterceptRequest(this.b, webResourceRequest, bundle);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideUrlLoading(IX5WebViewBase iX5WebViewBase, String str) {
        if (str == null || this.b.showDebugView(str)) {
            return true;
        }
        this.b.a(iX5WebViewBase);
        boolean zShouldOverrideUrlLoading = this.a.shouldOverrideUrlLoading(this.b, str);
        if (!zShouldOverrideUrlLoading) {
            if (str.startsWith("wtai://wp/mc;")) {
                this.b.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(WebView.SCHEME_TEL + str.substring(13))));
                return true;
            }
            if (str.startsWith(WebView.SCHEME_TEL)) {
                a(str);
                return true;
            }
        }
        return zShouldOverrideUrlLoading;
    }

    public void a(String str) {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(str));
        intent.addFlags(268435456);
        try {
            if (this.b.getContext() != null) {
                this.b.getContext().startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, String str) {
        this.b.a(iX5WebViewBase);
        return this.a.shouldInterceptRequest(this.b, str);
    }
}
