package O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.player.ku9py.R;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O extends Fragment {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public WebView f1090O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public String f1091O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public boolean f1092O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_webview, viewGroup, false);
        WebView webView = (WebView) viewInflate.findViewById(R.id.webview);
        this.f1090O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f1090O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setWebViewClient(new WebViewClient());
        this.f1090O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.loadUrl(this.f1091O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        this.f1092O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = true;
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        WebView webView = this.f1090O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (webView != null) {
            webView.destroy();
        }
        this.f1092O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (getActivity() != null) {
            getActivity().setRequestedOrientation(6);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f1091O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals("https://debugtbs.qq.com") || getActivity() == null) {
            return;
        }
        getActivity().setRequestedOrientation(1);
    }
}
