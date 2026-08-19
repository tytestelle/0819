package O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

import O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.DispatchQueue;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.PlayerView;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.forcetech.service.PxpUtil;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.dialog.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;
import com.github.tvbox.osc.ui.dialog.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
import com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo;
import com.google.common.util.concurrent.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
import com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import org.fourthline.cling.model.ServiceReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f29O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, Object obj2, int i) {
        this.f29O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
        this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        String string;
        int iLastIndexOf;
        switch (this.f29O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                FragmentStrictMode.m42handlePolicyViolation$lambda0((FragmentStrictMode.Policy) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Violation) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 1:
                FragmentStrictMode.m43handlePolicyViolation$lambda1((String) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Violation) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 2:
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 this_run = (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this_run, "$this_run");
                String exception = (String) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(exception, "$exception");
                O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, exception);
                return;
            case 3:
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                String str2 = (String) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                String strScheme = PxpUtil.scheme(str2);
                HashSet hashSet = (HashSet) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                boolean zContains = hashSet.contains(strScheme);
                LivePlayActivity livePlayActivity = (LivePlayActivity) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (!zContains) {
                    livePlayActivity.bindService(PxpUtil.intent(livePlayActivity, strScheme), (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, 1);
                }
                while (!hashSet.contains(strScheme)) {
                    SystemClock.sleep(10L);
                }
                Uri uri = Uri.parse(str2);
                int iPort = PxpUtil.port(strScheme);
                String lastPathSegment = uri.getLastPathSegment();
                StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(iPort, "http://127.0.0.1:", "/cmd.xml?cmd=switch_chan&server=");
                sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(uri.getHost());
                sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(":");
                sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(uri.getPort());
                sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append("&id=");
                sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(lastPathSegment);
                String string2 = sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString();
                String str3 = "http://127.0.0.1:" + iPort + ServiceReference.DELIMITER + lastPathSegment;
                new Thread(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(string2, 5)).start();
                livePlayActivity.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(str3);
                return;
            case 4:
                ((O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).mPlayerEventListener.onTrackList((ArrayList) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 5:
                ((O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).mPlayerEventListener.onAudioTrack((String) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 6:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                String str4 = (String) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
                try {
                    int i = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1420O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2957O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    String strSubstring = "";
                    String str5 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
                    if (str5 != null && !str5.isEmpty()) {
                        int iLastIndexOf2 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lastIndexOf(ServiceReference.DELIMITER);
                        if (iLastIndexOf2 != -1 && (iLastIndexOf = (strSubstring = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.substring(iLastIndexOf2 + 1)).lastIndexOf(".")) != -1) {
                            strSubstring = strSubstring.substring(0, iLastIndexOf);
                        }
                    } else if (str4.contains("/ku9/js/") || str4.contains("ku9/py/")) {
                        String str6 = str4.split("/ku9/js/|ku9/py/")[1];
                        int iIndexOf = str6.indexOf(".");
                        strSubstring = iIndexOf != -1 ? str6.substring(0, iIndexOf) : null;
                        if (str4.contains("ku9/py/")) {
                            String str7 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1321O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            str = ".py";
                        } else {
                            String str8 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1321O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            str = ".js";
                        }
                        String str9 = str4.contains("ku9/py/") ? O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1325O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO : O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1324O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        if (!str4.contains("/k-web/")) {
                            File file = new File(str9, strSubstring + str);
                            if (file.exists() && file.isFile()) {
                                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = "file:///" + str9 + ServiceReference.DELIMITER + strSubstring + str;
                            }
                            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "未找到" + strSubstring + str + "脚本文件");
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        int iIndexOf2 = str4.indexOf("/k-web/");
                        sb.append(iIndexOf2 != -1 ? str4.substring(0, iIndexOf2) : null);
                        sb.append(ServiceReference.DELIMITER);
                        sb.append(strSubstring);
                        sb.append(str);
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = sb.toString();
                    }
                    O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.f3201O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.put("JsName", strSubstring);
                    String string3 = "";
                    if (!str4.startsWith("ku9-json://")) {
                        if (str4.contains("/ku9-json/") && o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
                            try {
                                strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(str4, null);
                            } catch (Exception e) {
                                O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "获取网络结果失败: " + e.getMessage());
                            }
                        } else {
                            if (!str4.contains("ku9/py/") && !o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1422O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                                strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(str4);
                            }
                            try {
                                strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1426O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, str4);
                            } catch (Exception e2) {
                                O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "PY脚本文件运行出错: " + e2.getMessage());
                            }
                        }
                        strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        break;
                    } else {
                        strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = str4.replace("ku9-json://", "");
                    }
                    O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.f3201O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.put("JsReturn", strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    if (strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null && !strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isEmpty() && i >= o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1420O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2957O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                        JSONObject jSONObject = new JSONObject(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        if (jSONObject.has("url")) {
                            string = jSONObject.getString("url");
                        } else if (jSONObject.has("m3u8") && !str4.startsWith("ku9-json://") && !str4.contains("/ku9-json/") && !str4.contains("ku9/py/")) {
                            string3 = jSONObject.getString("m3u8");
                            String strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1420O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                            if (strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                                strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = "127.0.0.1";
                            }
                            int iIndexOf3 = str4.indexOf("/ku9/js/");
                            string = ("http://" + strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 + ":" + O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1057O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO + (iIndexOf3 != -1 ? str4.substring(iIndexOf3) : "/ku9/js/" + strSubstring + ".m3u8?" + Uri.parse(str4).getQuery())).replace("/ku9/js/", "/ku9/ts-js/");
                        } else if (!jSONObject.has("webview")) {
                            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "返回内容未找到url或m3u8");
                            return;
                        } else {
                            string = jSONObject.getString("webview");
                            jSONObject.put("player", 101);
                        }
                        if (string.contains("/ku9/js/")) {
                            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "js脚本返回的内容无效");
                            return;
                        }
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1420O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                        LivePlayActivity.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(jSONObject);
                        if (!TextUtils.isEmpty(string3) && string.contains("/ku9/ts-js/")) {
                            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o().f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            synchronized (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1064O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = true;
                                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1063O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = string3;
                                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1065O00000OOoOOO00O00o0ooooooooO000ooooO0000 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                            }
                        }
                        LivePlayActivity.f2953O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO = true;
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1420O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(string);
                        return;
                    }
                    return;
                } catch (JSONException e3) {
                    O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "js脚本获取内容失败 " + e3.getMessage());
                    return;
                }
            case 7:
                ((ViewTransition) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$applyTransition$0((View[]) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 8:
                ((ResourcesCompat.FontCallback) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$callbackSuccessAsync$0((Typeface) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 9:
                DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1((DispatchQueue) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Runnable) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 10:
                ((SimpleBasePlayer) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$updateStateForPendingOperation$62((O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 11:
                AudioManagerCompat.lambda$getAudioManager$0((Context) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (ConditionVariable) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 12:
                ((MediaMetricsListener) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$reportTrackChangeEvent$3((TrackChangeEvent) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 13:
                ((MediaMetricsListener) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$maybeReportNetworkChange$1((NetworkEvent) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 14:
                ((MediaMetricsListener) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$maybeReportPlaybackError$0((PlaybackErrorEvent) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 15:
                ((MediaMetricsListener) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$finishCurrentSession$4((PlaybackMetrics) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 16:
                ((MediaMetricsListener) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$maybeReportPlaybackStateChange$2((PlaybackStateEvent) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 17:
                ((AudioRendererEventListener.EventDispatcher) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$decoderReleased$5((String) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 18:
                ((AudioSink.Listener) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).onAudioTrackReleased((AudioSink.AudioTrackConfig) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 19:
                ((SphericalGLSurfaceView) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$onSurfaceTextureAvailable$1((SurfaceTexture) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 20:
                ((PlayerView) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$onImageAvailable$1((Bitmap) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 21:
                ((ProfileInstallerInitializer) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$delayAfterFirstFrame$0((Context) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 22:
                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                LinearLayout linearLayout = o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3209O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                ArrayList arrayList = (ArrayList) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                linearLayout.setVisibility(arrayList.isEmpty() ? 0 : 8);
                o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3207O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setVisibility(arrayList.isEmpty() ? 8 : 0);
                O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO = o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3211O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                ArrayList arrayList2 = o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f1269O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.notifyDataSetChanged();
                if (arrayList.isEmpty() || o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3207O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getScrollState() != 0 || o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3207O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isComputingLayout()) {
                    return;
                }
                o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3207O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0);
                o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3207O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setmCurrentFocusPosition(0);
                return;
            default:
                ((O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) this.f31O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00((O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) this.f30O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
        }
    }
}
