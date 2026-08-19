package O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.webkit.JavascriptInterface;
import com.tencent.smtt.sdk.CookieManager;
import com.tencent.smtt.sdk.ValueCallback;
import com.tencent.smtt.sdk.WebSettings;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import xyz.doikki.videoplayer.player.AbstractPlayer;
import xyz.doikki.videoplayer.util.PlayerUtils;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 extends AbstractPlayer {

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public static final String f1006O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1340O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, "/webview_jscode.js");

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public static String f1007O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = null;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public static String f1008O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Context f1009O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public String f1011O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public Map f1012O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public boolean f1013O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public float f1014O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public float f1015O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public float f1016O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(Context context) {
        super(context);
        this.f1013O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = true;
        this.f1016O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = 1.0f;
        this.f1009O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = context;
    }

    public static String getJsCode() {
        if (!TextUtils.isEmpty(f1008O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O)) {
            return f1008O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        }
        if (TextUtils.isEmpty(f1007O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO)) {
            f1007O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(f1006O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
        }
        if (TextUtils.isEmpty(f1007O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO)) {
            f1007O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1339O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        }
        return f1007O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
    }

    public static void setJsCode(String str) {
        f1008O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = str;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        AbstractPlayer.PlayerEventListener playerEventListener = this.mPlayerEventListener;
        if (playerEventListener != null) {
            playerEventListener.onCompletion();
        }
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        AbstractPlayer.PlayerEventListener playerEventListener = this.mPlayerEventListener;
        if (playerEventListener != null) {
            playerEventListener.onVideoSizeChanged(0, 0);
            this.mPlayerEventListener.onFps(0);
            this.mPlayerEventListener.onAudioTrack(null);
            this.mPlayerEventListener.onInfo(3, 0);
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public int getBufferedPercentage() {
        return 0;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public long getCurrentPosition() {
        float f = this.f1015O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        if (f > 0.0f) {
            return (long) (f * 1000.0f);
        }
        return 0L;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public long getDuration() {
        float f = this.f1014O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (f > 0.0f) {
            return (long) (f * 1000.0f);
        }
        return 0L;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public float getSpeed() {
        return this.f1016O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public long getTcpSpeed() {
        return PlayerUtils.getNetSpeed(this.f1009O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public String getVideoBitrate() {
        return null;
    }

    @JavascriptInterface
    public int getscale() {
        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f186O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void initPlayer() {
        O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1589O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
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
        this.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1591O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final boolean isAudio() {
        return false;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final boolean isPlaying() {
        return this.f1013O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void pause() {
        ((Activity) this.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getContext()).runOnUiThread(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, 1));
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void prepareAsync() {
        try {
            this.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setPlayer(this);
            this.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.addJavascriptInterface(this, "ku9");
            this.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setJscode(getJsCode());
            this.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getSettings().setMediaPlaybackRequiresUserGesture(false);
            this.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f1011O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f1012O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
            throw null;
        } catch (Exception unused) {
            AbstractPlayer.PlayerEventListener playerEventListener = this.mPlayerEventListener;
            if (playerEventListener != null) {
                playerEventListener.onError();
            }
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void release() {
        reset();
        setJsCode(null);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void reset() {
        this.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void seekTo(long j) {
        Locale locale = Locale.ROOT;
        ((Activity) this.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getContext()).runOnUiThread(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, "javascript: setposition(" + (j / 1000) + ")", 0));
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void setDataSource(String str, Map map) {
        this.f1011O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = str;
        this.f1012O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = map;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final boolean setScaleType(int i) {
        Locale locale = Locale.ROOT;
        ((Activity) this.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getContext()).runOnUiThread(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "javascript: setscale(", ")"), 1));
        return true;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setSpeed(final float f) {
        final String str = String.format(Locale.ROOT, "javascript: setspeed(%f)", Float.valueOf(f));
        ((Activity) this.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getContext()).runOnUiThread(new Runnable() { // from class: O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
            @Override // java.lang.Runnable
            public final void run() {
                final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f996O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                final float f2 = f;
                o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.evaluateJavascript(str, new ValueCallback() { // from class: O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
                    @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1016O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = f2;
                    }
                });
            }
        });
    }

    @JavascriptInterface
    public void setaudio(String str) {
        AbstractPlayer.PlayerEventListener playerEventListener = this.mPlayerEventListener;
        if (playerEventListener != null) {
            playerEventListener.onAudioTrack(str);
        }
    }

    @JavascriptInterface
    public void setduration(float f) {
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        this.f1014O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = f;
    }

    @JavascriptInterface
    public void setposition(float f) {
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        this.f1015O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = f;
    }

    @JavascriptInterface
    public void setvideo(int i, int i2) {
        AbstractPlayer.PlayerEventListener playerEventListener = this.mPlayerEventListener;
        if (playerEventListener != null) {
            playerEventListener.onVideoSizeChanged(i, i2);
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void start() {
        ((Activity) this.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getContext()).runOnUiThread(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, 0));
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void setOptions() {
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void stop() {
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setLooping(boolean z) {
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setSurface(Surface surface) {
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void setVolume(float f, float f2) {
    }
}
