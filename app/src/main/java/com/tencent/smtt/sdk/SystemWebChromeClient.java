package com.tencent.smtt.sdk;

import android.R;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.webkit.PermissionRequest;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.sdk.WebView.WebViewTransport;

/* JADX INFO: loaded from: classes2.dex */
class SystemWebChromeClient extends android.webkit.WebChromeClient {
    protected WebChromeClient a;
    private WebView b;

    public static class a implements ConsoleMessage {
        private ConsoleMessage.MessageLevel a;
        private String b;
        private String c;
        private int d;

        public a(android.webkit.ConsoleMessage consoleMessage) {
            this.a = ConsoleMessage.MessageLevel.valueOf(consoleMessage.messageLevel().name());
            this.b = consoleMessage.message();
            this.c = consoleMessage.sourceId();
            this.d = consoleMessage.lineNumber();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ConsoleMessage
        public int lineNumber() {
            return this.d;
        }

        @Override // com.tencent.smtt.export.external.interfaces.ConsoleMessage
        public String message() {
            return this.b;
        }

        @Override // com.tencent.smtt.export.external.interfaces.ConsoleMessage
        public ConsoleMessage.MessageLevel messageLevel() {
            return this.a;
        }

        @Override // com.tencent.smtt.export.external.interfaces.ConsoleMessage
        public String sourceId() {
            return this.c;
        }

        public a(String str, String str2, int i) {
            this.a = ConsoleMessage.MessageLevel.LOG;
            this.b = str;
            this.c = str2;
            this.d = i;
        }
    }

    public class b implements IX5WebChromeClient.CustomViewCallback {
        android.webkit.WebChromeClient.CustomViewCallback a;

        public b(android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
            this.a = customViewCallback;
        }

        @Override // com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback
        public void onCustomViewHidden() {
            this.a.onCustomViewHidden();
        }
    }

    public class c implements GeolocationPermissionsCallback {
        android.webkit.GeolocationPermissions.Callback a;

        public c(android.webkit.GeolocationPermissions.Callback callback) {
            this.a = callback;
        }

        @Override // com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback
        public void invoke(String str, boolean z, boolean z2) {
            this.a.invoke(str, z, z2);
        }
    }

    public class d implements JsPromptResult {
        android.webkit.JsPromptResult a;

        public d(android.webkit.JsPromptResult jsPromptResult) {
            this.a = jsPromptResult;
        }

        @Override // com.tencent.smtt.export.external.interfaces.JsResult
        public void cancel() {
            this.a.cancel();
        }

        @Override // com.tencent.smtt.export.external.interfaces.JsResult
        public void confirm() {
            this.a.confirm();
        }

        @Override // com.tencent.smtt.export.external.interfaces.JsPromptResult
        public void confirm(String str) {
            this.a.confirm(str);
        }
    }

    public class e implements JsResult {
        android.webkit.JsResult a;

        public e(android.webkit.JsResult jsResult) {
            this.a = jsResult;
        }

        @Override // com.tencent.smtt.export.external.interfaces.JsResult
        public void cancel() {
            this.a.cancel();
        }

        @Override // com.tencent.smtt.export.external.interfaces.JsResult
        public void confirm() {
            this.a.confirm();
        }
    }

    public class f implements WebStorage.QuotaUpdater {
        android.webkit.WebStorage.QuotaUpdater a;

        public f(android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
            this.a = quotaUpdater;
        }

        @Override // com.tencent.smtt.sdk.WebStorage.QuotaUpdater
        public void updateQuota(long j) {
            this.a.updateQuota(j);
        }
    }

    public SystemWebChromeClient(WebView webView, WebChromeClient webChromeClient) {
        this.b = webView;
        this.a = webChromeClient;
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = this.a.getDefaultVideoPoster();
        if (defaultVideoPoster != null) {
            return defaultVideoPoster;
        }
        try {
            return Build.VERSION.SDK_INT >= 24 ? BitmapFactory.decodeResource(this.b.getResources(), R.drawable.ic_media_play) : defaultVideoPoster;
        } catch (Exception unused) {
            return defaultVideoPoster;
        }
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public View getVideoLoadingProgressView() {
        return this.a.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(final android.webkit.ValueCallback<String[]> valueCallback) {
        this.a.getVisitedHistory(new ValueCallback<String[]>() { // from class: com.tencent.smtt.sdk.SystemWebChromeClient.1
            @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String[] strArr) {
                valueCallback.onReceiveValue(strArr);
            }
        });
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(android.webkit.WebView webView) {
        this.b.a(webView);
        this.a.onCloseWindow(this.b);
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        this.a.onConsoleMessage(new a(str, str2, i));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, final Message message) {
        WebView webView2 = this.b;
        webView2.getClass();
        final WebView.WebViewTransport webViewTransport = webView2.new WebViewTransport();
        Message messageObtain = Message.obtain(message.getTarget(), new Runnable() { // from class: com.tencent.smtt.sdk.SystemWebChromeClient.2
            @Override // java.lang.Runnable
            public void run() {
                WebView webView3 = webViewTransport.getWebView();
                if (webView3 != null) {
                    ((android.webkit.WebView.WebViewTransport) message.obj).setWebView(webView3.a());
                }
                message.sendToTarget();
            }
        });
        messageObtain.obj = webViewTransport;
        return this.a.onCreateWindow(this.b, z, z2, messageObtain);
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(5)
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
        this.a.onExceededDatabaseQuota(str, str2, j, j2, j3, new f(quotaUpdater));
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(5)
    public void onGeolocationPermissionsHidePrompt() {
        this.a.onGeolocationPermissionsHidePrompt();
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(5)
    public void onGeolocationPermissionsShowPrompt(String str, android.webkit.GeolocationPermissions.Callback callback) {
        this.a.onGeolocationPermissionsShowPrompt(str, new c(callback));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(android.webkit.WebView webView, String str, String str2, android.webkit.JsResult jsResult) {
        this.b.a(webView);
        return this.a.onJsAlert(this.b, str, str2, new e(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(android.webkit.WebView webView, String str, String str2, android.webkit.JsResult jsResult) {
        this.b.a(webView);
        return this.a.onJsBeforeUnload(this.b, str, str2, new e(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(android.webkit.WebView webView, String str, String str2, android.webkit.JsResult jsResult) {
        this.b.a(webView);
        return this.a.onJsConfirm(this.b, str, str2, new e(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(android.webkit.WebView webView, String str, String str2, String str3, android.webkit.JsPromptResult jsPromptResult) {
        this.b.a(webView);
        return this.a.onJsPrompt(this.b, str, str2, str3, new d(jsPromptResult));
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public boolean onJsTimeout() {
        return this.a.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(final PermissionRequest permissionRequest) {
        this.a.onPermissionRequest(new com.tencent.smtt.export.external.interfaces.PermissionRequest() { // from class: com.tencent.smtt.sdk.SystemWebChromeClient.6
            @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
            public void deny() {
                permissionRequest.deny();
            }

            @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
            public Uri getOrigin() {
                return permissionRequest.getOrigin();
            }

            @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
            public String[] getResources() {
                return permissionRequest.getResources();
            }

            @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
            public void grant(String[] strArr) {
                permissionRequest.grant(strArr);
            }
        });
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(final PermissionRequest permissionRequest) {
        this.a.onPermissionRequestCanceled(new com.tencent.smtt.export.external.interfaces.PermissionRequest() { // from class: com.tencent.smtt.sdk.SystemWebChromeClient.7
            @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
            public void deny() {
                permissionRequest.deny();
            }

            @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
            public Uri getOrigin() {
                return permissionRequest.getOrigin();
            }

            @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
            public String[] getResources() {
                return permissionRequest.getResources();
            }

            @Override // com.tencent.smtt.export.external.interfaces.PermissionRequest
            public void grant(String[] strArr) {
                permissionRequest.grant(strArr);
            }
        });
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(android.webkit.WebView webView, int i) {
        this.b.a(webView);
        this.a.onProgressChanged(this.b, i);
    }

    @TargetApi(7)
    @Deprecated
    public void onReachedMaxAppCacheSize(long j, long j2, android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
        this.a.onReachedMaxAppCacheSize(j, j2, new f(quotaUpdater));
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(android.webkit.WebView webView, Bitmap bitmap) {
        this.b.a(webView);
        this.a.onReceivedIcon(this.b, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(android.webkit.WebView webView, String str) {
        this.b.a(webView);
        this.a.onReceivedTitle(this.b, str);
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public void onReceivedTouchIconUrl(android.webkit.WebView webView, String str, boolean z) {
        this.b.a(webView);
        this.a.onReceivedTouchIconUrl(this.b, str, z);
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(android.webkit.WebView webView) {
        this.b.a(webView);
        this.a.onRequestFocus(this.b);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(android.webkit.WebView webView, final android.webkit.ValueCallback<Uri[]> valueCallback, final android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        ValueCallback<Uri[]> valueCallback2 = new ValueCallback<Uri[]>() { // from class: com.tencent.smtt.sdk.SystemWebChromeClient.4
            @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(Uri[] uriArr) {
                valueCallback.onReceiveValue(uriArr);
            }
        };
        WebChromeClient.FileChooserParams fileChooserParams2 = new WebChromeClient.FileChooserParams() { // from class: com.tencent.smtt.sdk.SystemWebChromeClient.5
            @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
            public Intent createIntent() {
                return fileChooserParams.createIntent();
            }

            @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
            public String[] getAcceptTypes() {
                return fileChooserParams.getAcceptTypes();
            }

            @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
            public String getFilenameHint() {
                return fileChooserParams.getFilenameHint();
            }

            @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
            public int getMode() {
                return fileChooserParams.getMode();
            }

            @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
            public CharSequence getTitle() {
                return fileChooserParams.getTitle();
            }

            @Override // com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
            public boolean isCaptureEnabled() {
                return fileChooserParams.isCaptureEnabled();
            }
        };
        this.b.a(webView);
        return this.a.onShowFileChooser(this.b, valueCallback2, fileChooserParams2);
    }

    public void openFileChooser(android.webkit.ValueCallback<Uri> valueCallback) {
        openFileChooser(valueCallback, null, null);
    }

    public void setupAutoFill(Message message) {
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        return this.a.onConsoleMessage(new a(consoleMessage));
    }

    public void openFileChooser(android.webkit.ValueCallback<Uri> valueCallback, String str) {
        openFileChooser(valueCallback, str, null);
    }

    public void openFileChooser(final android.webkit.ValueCallback<Uri> valueCallback, String str, String str2) {
        this.a.openFileChooser(new ValueCallback<Uri>() { // from class: com.tencent.smtt.sdk.SystemWebChromeClient.3
            @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(Uri uri) {
                valueCallback.onReceiveValue(uri);
            }
        }, str, str2);
    }
}
