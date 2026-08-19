package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import android.net.Uri;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.tencent.smtt.sdk.CookieManager;
import com.tencent.smtt.sdk.WebView;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 extends WebView {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public String f1540O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public long f1541O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public CookieManager f1542O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f1543O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public Pattern f1544O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        removeJavascriptInterface("ku9");
        this.f1543O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        this.f1541O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0L;
        stopLoading();
        loadUrl("about:blank");
        clearHistory();
        clearCache(true);
        clearFormData();
        this.f1542O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.removeAllCookies(null);
        this.f1542O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.flush();
        getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36");
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str, Map map) {
        Uri uri = Uri.parse(str);
        String fragment = uri.getFragment();
        String query = uri.getQuery();
        if (fragment != null) {
            String str2 = fragment.contains("?") ? "&" : "?";
            str = query != null ? str.substring(0, str.indexOf("#")) + "&time=" + System.currentTimeMillis() + "#" + fragment + str2 : str.substring(0, str.indexOf("#")) + "?time=" + System.currentTimeMillis() + "#" + fragment + str2;
        }
        if (map != null) {
            for (String str3 : map.keySet()) {
                if ("User-Agent".equalsIgnoreCase(str3)) {
                    getSettings().setUserAgentString((String) map.get(str3));
                }
                if (O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_KEY_COOKIE.equalsIgnoreCase(str3)) {
                    try {
                        for (String str4 : ((String) map.get(str3)).split(";")) {
                            this.f1542O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setCookie(str, str4);
                        }
                        this.f1542O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.flush();
                    } catch (Exception e) {
                        Log.e("SimpleWebView", "Failed to set cookie: " + e.getMessage());
                    }
                }
            }
        }
        loadUrl(str, map);
        Log.e("SimpleWebView", "start url：" + str);
        new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 3);
        // JADX 反编译错误：此处原逻辑为异步任务创建后正常结束，不应抛出 NullPointerException。
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 23 || keyEvent.getKeyCode() == 66)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // com.tencent.smtt.sdk.WebView
    public final void onPause() {
        super.onPause();
        resumeTimers();
    }

    @Override // com.tencent.smtt.sdk.WebView
    public final void onResume() {
        super.onResume();
        resumeTimers();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setJscode(String str) {
        this.f1540O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str;
    }

    public void setPlayer(O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        this.f1543O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
    }

    public synchronized void setSnifferListener(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
        addJavascriptInterface(new O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this), "ku9");
    }

    public void setTimeout(long j) {
        if (j >= 0) {
            this.f1541O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = j;
        } else {
            this.f1541O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0L;
        }
    }

    public void setRegex(String str) {
    }
}
