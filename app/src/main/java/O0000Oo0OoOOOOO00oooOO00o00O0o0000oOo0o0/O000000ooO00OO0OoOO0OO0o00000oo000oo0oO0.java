package O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.util.Log;
import com.orhanobut.hawk.Hawk;
import com.tencent.smtt.sdk.QbSdk;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 implements QbSdk.PreInitCallback {
    @Override // com.tencent.smtt.sdk.QbSdk.PreInitCallback
    public final void onCoreInitFinished() {
        Log.d("WebViewUtil", "X5内核加载完成");
    }

    @Override // com.tencent.smtt.sdk.QbSdk.PreInitCallback
    public final void onViewInitFinished(boolean z) {
        Log.d("WebViewUtil", "WebView类型: ".concat(z ? "X5" : "系统"));
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        if (((Integer) Hawk.get("浏览内核", 0)).intValue() == 0) {
            QbSdk.forceSysWebView();
        }
    }
}
