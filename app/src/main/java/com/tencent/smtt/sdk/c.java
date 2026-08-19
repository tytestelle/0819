package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class c extends SystemWebChromeClient {
    public c(WebView webView, WebChromeClient webChromeClient) {
        super(webView, webChromeClient);
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public void onHideCustomView() {
        this.a.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(14)
    @Deprecated
    public void onShowCustomView(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        this.a.onShowCustomView(view, i, new SystemWebChromeClient.b(customViewCallback));
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        this.a.onShowCustomView(view, new SystemWebChromeClient.b(customViewCallback));
    }
}
