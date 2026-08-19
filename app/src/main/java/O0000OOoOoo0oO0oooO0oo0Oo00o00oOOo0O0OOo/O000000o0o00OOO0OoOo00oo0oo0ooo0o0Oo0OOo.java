package O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;

import O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
import O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.smtt.sdk.CookieManager;
import com.tencent.smtt.sdk.WebSettings;
import java.util.regex.Pattern;
import xyz.doikki.videoplayer.player.AbstractPlayer;
import xyz.doikki.videoplayer.render.IRenderView;
import xyz.doikki.videoplayer.render.RenderViewFactory;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends RenderViewFactory implements IRenderView {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1044O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 f1045O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f1046O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final void attachToPlayer(AbstractPlayer abstractPlayer) {
        if (abstractPlayer instanceof O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
            this.f1046O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) abstractPlayer;
        }
    }

    @Override // xyz.doikki.videoplayer.render.RenderViewFactory
    public final IRenderView createRenderView(Context context) {
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1589O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1591O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = new O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1590O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1541O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0L;
            o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1544O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = Pattern.compile(".*\\.(png|jpe?g|gif|webp|bmp|svg|ico)$", 2);
            try {
                o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1542O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = CookieManager.getInstance();
                o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.setWebViewClient(new O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00));
                o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.setLayerType(2, null);
                o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.setClickable(false);
                o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.setLongClickable(false);
                o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.setFocusable(false);
                o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.setEnabled(false);
                o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.setFocusableInTouchMode(false);
                o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.clearFocus();
                o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.setBackgroundColor(-16777216);
                WebSettings settings = o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.getSettings();
                settings.setDatabaseEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setJavaScriptEnabled(true);
                settings.setUseWideViewPort(true);
                settings.setLoadWithOverviewMode(true);
                settings.setSupportZoom(false);
                settings.setBuiltInZoomControls(false);
                settings.setDisplayZoomControls(false);
                settings.setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36");
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setLoadsImagesAutomatically(false);
                settings.setBlockNetworkImage(true);
                o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1542O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setAcceptCookie(true);
                if (o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.getSettingsExtension() != null) {
                    o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.getSettingsExtension().setPicModel(2);
                }
                settings.setCacheMode(2);
                settings.setAppCacheEnabled(false);
                settings.setMixedContentMode(0);
                settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            } catch (Exception e) {
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(e, new StringBuilder("webview初始化出错 "), 1);
            }
            o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1591O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
        }
        this.f1045O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1591O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        return this;
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final Bitmap doScreenShot() {
        return null;
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final View getView() {
        return this.f1045O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final void release() {
        this.f1046O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final void setScaleType(int i) {
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f1046O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.setScaleType(i);
        }
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final void setVideoRotation(int i) {
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final void setVideoSize(int i, int i2) {
    }
}
