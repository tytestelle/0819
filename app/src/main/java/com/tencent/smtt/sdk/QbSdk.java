package com.tencent.smtt.sdk;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.provider.FontsContractCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.sdk.stat.MttLoader;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.TbsLogClient;
import com.tencent.smtt.utils.Timer;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public class QbSdk {
    private static int A = 170;
    private static String B = null;
    private static String C = null;

    @Deprecated
    public static final int CORE_VER_ENABLE_202112 = 45912;
    public static final int CORE_VER_ENABLE_202207 = 46110;
    private static boolean D = false;
    private static boolean E = false;
    public static final int EXTENSION_INIT_FAILURE = -99999;
    private static boolean F = false;
    private static TbsListener G = null;
    private static TbsListener H = null;
    private static boolean I = false;
    private static boolean J = false;
    public static final String KEY_SET_SENDREQUEST_AND_UPLOAD = "SET_SENDREQUEST_AND_UPLOAD";
    public static final String KEY_THIRD_PARTY_TURING = "turing";
    public static final String LOGIN_TYPE_KEY_PARTNER_CALL_POS = "PosID";
    public static final String LOGIN_TYPE_KEY_PARTNER_ID = "ChannelID";
    public static final int QBMODE = 2;
    public static final String SHARE_PREFERENCES_NAME = "tbs_file_open_dialog_config";
    public static final String SVNVERSION = "jnizz";
    public static final int TBSMODE = 1;
    public static final String TID_QQNumber_Prefix = "QQ:";
    public static final int VERSION = 1;
    static boolean a = false;
    static boolean b = false;
    static boolean c = true;
    static String d = null;
    static boolean e = false;
    static long f = 0;
    static long g = 0;
    static boolean i = true;
    static boolean j = true;
    static boolean k = false;
    static boolean l = false;
    static volatile boolean m = false;
    public static boolean mDisableUseHostBackupCore = false;
    private static int p = 0;
    private static String q = "";
    private static Class<?> r = null;
    private static Object s = null;
    public static boolean sIsVersionPrinted = false;
    private static boolean t = false;
    private static String[] u = null;
    private static String v = "NULL";
    private static String w = "UNKNOWN";
    private static boolean x = false;
    private static int y = -1;
    private static int z;
    static Object h = new Object();
    static TbsListener n = new TbsListener() { // from class: com.tencent.smtt.sdk.QbSdk.5
        @Override // com.tencent.smtt.sdk.TbsListener
        public void onDownloadFinish(int i2) {
            TbsDownloader.a = false;
            if (QbSdk.G != null) {
                QbSdk.G.onDownloadFinish(i2);
            }
            if (QbSdk.H != null) {
                QbSdk.H.onDownloadFinish(i2);
            }
        }

        @Override // com.tencent.smtt.sdk.TbsListener
        public void onDownloadProgress(int i2) {
            if (QbSdk.H != null) {
                QbSdk.H.onDownloadProgress(i2);
            }
            if (QbSdk.G != null) {
                QbSdk.G.onDownloadProgress(i2);
            }
        }

        @Override // com.tencent.smtt.sdk.TbsListener
        public void onInstallFinish(int i2) {
            if (i2 == 243 && QbSdk.H != null) {
                QbSdk.H.onInstallFinish(i2);
                return;
            }
            if (i2 != 200) {
            }
            TbsLog.i("QbSdk", "onInstallFinish errCode is " + i2, true);
            QbSdk.setTBSInstallingStatus(false);
            TbsDownloader.a = false;
            if (QbSdk.G != null) {
                QbSdk.G.onInstallFinish(i2);
            }
            if (QbSdk.H != null) {
                QbSdk.H.onInstallFinish(i2);
            }
        }
    };
    private static boolean K = false;
    private static boolean L = false;
    static Map<String, Object> o = null;

    @Deprecated
    public static final String USER_ID_FROM_APP_IMSI = TbsPrivacyAccess.ConfigurablePrivacy.IMSI.a;

    @Deprecated
    public static final String USER_ID_FROM_APP_ANDROID_ID = TbsPrivacyAccess.ConfigurablePrivacy.ANDROID_ID.a;

    @Deprecated
    public static final String USER_ID_FROM_APP_MAC = TbsPrivacyAccess.ConfigurablePrivacy.MAC.a;

    @Deprecated
    public static final String USER_ID_FROM_APP_ANDROID_VERSION = TbsPrivacyAccess.ConfigurablePrivacy.ANDROID_VERSION.a;

    @Deprecated
    public static final String USER_ID_FROM_APP_DEVICE_MODEL = TbsPrivacyAccess.ConfigurablePrivacy.DEVICE_MODEL.a;
    public static final String USER_ID_FROM_APP_QIMEI36 = TbsPrivacyAccess.ConfigurablePrivacy.QIMEI36.a;
    private static int M = -1;
    private static Timer N = null;
    private static PrivateCDNMode O = PrivateCDNMode.NOT_USE;
    private static SystemCoreProtector P = null;

    public interface PreInitCallback {
        void onCoreInitFinished();

        void onViewInitFinished(boolean z);
    }

    public enum PrivateCDNMode {
        OFFICIAL_IMPL,
        SELF_IMPL,
        NOT_USE
    }

    public interface a {
        void a(File[] fileArr);
    }

    public static Bundle a(Context context, Bundle bundle) {
        TbsLogReport tbsLogReport;
        String str;
        if (a(context)) {
            Object objA = com.tencent.smtt.utils.j.a(s, "incrUpdate", (Class<?>[]) new Class[]{Context.class, Bundle.class}, context, bundle);
            if (objA != null) {
                return (Bundle) objA;
            }
            tbsLogReport = TbsLogReport.getInstance(context);
            str = "incrUpdate return null!";
        } else {
            tbsLogReport = TbsLogReport.getInstance(context);
            str = "initForPatch return false!";
        }
        tbsLogReport.setInstallErrorCode(TbsListener.ErrorCode.INCR_UPDATE_ERROR, str);
        return null;
    }

    public static String b() {
        Object objInvokeStaticMethod;
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b() || (objInvokeStaticMethod = uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getGUID", new Class[0], new Object[0])) == null || !(objInvokeStaticMethod instanceof String)) {
            return null;
        }
        return (String) objInvokeStaticMethod;
    }

    public static Timer c() {
        return N;
    }

    public static boolean canDownloadWithoutWifi() {
        return I;
    }

    @Deprecated
    public static void canGetAndroidId(boolean z2) {
        TbsPrivacyAccess.AndroidId.setEnabled(z2);
    }

    @Deprecated
    public static void canGetDeviceId(boolean z2) {
        TbsPrivacyAccess.DeviceId.setEnabled(z2);
    }

    @Deprecated
    public static void canGetSubscriberId(boolean z2) {
        TbsPrivacyAccess.Imsi.setEnabled(z2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
    public static boolean canLoadVideo(Context context) {
        TbsCoreLoadStat tbsCoreLoadStat;
        int i2;
        Object objA = com.tencent.smtt.utils.j.a(s, "canLoadVideo", (Class<?>[]) new Class[]{Integer.TYPE}, 0);
        if (objA != null) {
            if (!((Boolean) objA).booleanValue()) {
                tbsCoreLoadStat = TbsCoreLoadStat.getInstance();
                i2 = 313;
            }
            if (objA == null) {
                return false;
            }
            return ((Boolean) objA).booleanValue();
        }
        tbsCoreLoadStat = TbsCoreLoadStat.getInstance();
        i2 = 314;
        tbsCoreLoadStat.a(context, i2);
        if (objA == null) {
            return false;
        }
        return ((Boolean) objA).booleanValue();
    }

    @Deprecated
    public static boolean canLoadX5(Context context) {
        return a(context, false, false);
    }

    @Deprecated
    public static boolean canLoadX5FirstTimeThirdApp(Context context) {
        return false;
    }

    public static void canOpenFile(Context context, String str, ValueCallback<Boolean> valueCallback) {
        throw new IllegalAccessError("Current SDK not support TbsReaderView.");
    }

    public static boolean canOpenMimeFileType(Context context, String str) {
        throw new IllegalAccessError("Current SDK not support TbsReaderView.");
    }

    public static boolean canOpenWebPlus(Context context) {
        if (z == 0) {
            z = com.tencent.smtt.sdk.a.a();
        }
        TbsLog.i("QbSdk", "canOpenWebPlus - totalRAM: " + z);
        boolean z2 = false;
        if (z < A || context == null) {
            return false;
        }
        BufferedInputStream bufferedInputStream = null;
        FileInputStream fileInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(new File(m.a().n(context), "tbs.conf")));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream2);
                String property = properties.getProperty("android_sdk_max_supported");
                String property2 = properties.getProperty("android_sdk_min_supported");
                int i2 = Integer.parseInt(property);
                int i3 = Integer.parseInt(property2);
                int i4 = Integer.parseInt(Build.VERSION.SDK);
                if (i4 <= i2 && i4 >= i3) {
                    int i5 = Integer.parseInt(properties.getProperty("tbs_core_version"));
                    try {
                        bufferedInputStream2.close();
                    } catch (Exception unused) {
                    }
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(new File(m.o(context), "tbs_extension.conf"));
                        try {
                            Properties properties2 = new Properties();
                            properties2.load(fileInputStream2);
                            int i6 = Integer.parseInt(properties2.getProperty("tbs_local_version"));
                            int i7 = Integer.parseInt(properties2.getProperty(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONCODE_FOR_SWITCH));
                            if (i5 != 88888888 && i6 != 88888888 && i5 <= i6 && i5 == i6 && ((i7 <= 0 || i7 == com.tencent.smtt.utils.b.b(context)) && Boolean.parseBoolean(properties2.getProperty("x5_disabled")) && !TbsDownloadConfig.getInstance(context.getApplicationContext()).mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_SWITCH_BACKUPCORE_ENABLE, false))) {
                                z2 = true;
                            }
                            try {
                                fileInputStream2.close();
                            } catch (Exception unused2) {
                            }
                        } catch (Throwable unused3) {
                            fileInputStream = fileInputStream2;
                            try {
                                TbsLog.i("QbSdk", "canOpenWebPlus - isX5Disabled Exception");
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Exception unused4) {
                                    }
                                }
                                z2 = true;
                            } catch (Throwable th) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Exception unused5) {
                                    }
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable unused6) {
                    }
                    return !z2;
                }
                TbsLog.i("QbSdk", "canOpenWebPlus - sdkVersion: " + i4);
                try {
                    bufferedInputStream2.close();
                } catch (Exception unused7) {
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                try {
                    th.printStackTrace();
                    TbsLog.i("QbSdk", "canOpenWebPlus - canLoadX5 Exception");
                    return false;
                } finally {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused8) {
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean canUseVideoFeatrue(Context context, int i2) {
        Object objA = com.tencent.smtt.utils.j.a(s, "canUseVideoFeatrue", (Class<?>[]) new Class[]{Integer.TYPE}, Integer.valueOf(i2));
        if (objA == null || !(objA instanceof Boolean)) {
            return false;
        }
        return ((Boolean) objA).booleanValue();
    }

    public static void checkTbsValidity(Context context) {
        if (context == null || com.tencent.smtt.utils.n.b(context)) {
            return;
        }
        TbsLog.e("QbSdk", "sys WebView: SysWebViewForcedBy checkTbsValidity");
        TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CORE_CHECK_VALIDITY_FALSE);
        forceSysWebView();
    }

    @Deprecated
    public static void clear(Context context) {
    }

    public static void clearAllWebViewCache(Context context, boolean z2) {
        Throwable th;
        boolean z3;
        TbsLog.i("QbSdk", "clearAllWebViewCache(" + context + ", " + z2 + ")");
        boolean z4 = false;
        try {
            if (new WebView(context).getWebViewClientExtension() != null) {
                try {
                    u uVarA = u.a();
                    if (uVarA != null && uVarA.b()) {
                        uVarA.c().a(context, z2);
                    }
                    z4 = true;
                } catch (Throwable th2) {
                    th = th2;
                    z3 = true;
                    TbsLog.e("QbSdk", "clearAllWebViewCache exception 2 -- " + Log.getStackTraceString(th));
                    z4 = z3;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z3 = false;
        }
        if (z4) {
            TbsLog.i("QbSdk", "is_in_x5_mode --> no need to clear system webview!");
            return;
        }
        try {
            android.webkit.WebView webView = new android.webkit.WebView(context);
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
            webView.clearCache(true);
            if (z2) {
                android.webkit.CookieSyncManager.createInstance(context);
                android.webkit.CookieManager.getInstance().removeAllCookie();
            }
            android.webkit.WebViewDatabase.getInstance(context).clearUsernamePassword();
            android.webkit.WebViewDatabase.getInstance(context).clearHttpAuthUsernamePassword();
            android.webkit.WebViewDatabase.getInstance(context).clearFormData();
            android.webkit.WebStorage.getInstance().deleteAllData();
            android.webkit.WebIconDatabase.getInstance().removeAllIcons();
        } catch (Throwable th4) {
            TbsLog.e("QbSdk", "clearAllWebViewCache exception 1 -- " + Log.getStackTraceString(th4));
        }
    }

    @Deprecated
    public static void closeFileReader(Context context) {
        u uVarA = u.a();
        uVarA.a(context);
        if (uVarA.b()) {
            uVarA.c().p();
        }
    }

    public static String closeNetLogAndSavaToLocal() {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            try {
                Object objInvokeStaticMethod = uVarA.c().b().invokeStaticMethod("com.tencent.smtt.livelog.NetLogManager", "closeNetLogAndSavaToLocal", new Class[0], new Object[0]);
                if (objInvokeStaticMethod != null && (objInvokeStaticMethod instanceof String)) {
                    return (String) objInvokeStaticMethod;
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static void configurePrivacy(Context context, TbsPrivacyAccess.ConfigurablePrivacy configurablePrivacy, String str) {
        TbsPrivacyAccess.configurePrivacy(context, configurablePrivacy, str);
    }

    public static boolean createMiniQBShortCut(Context context, String str, String str2, Drawable drawable) {
        u uVarA;
        if (context != null && !TbsDownloader.getOverSea(context) && !isMiniQBShortCutExist(context, str, str2) && (uVarA = u.a()) != null && uVarA.b()) {
            Bitmap bitmap = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
            DexLoader dexLoaderB = uVarA.c().b();
            TbsLog.e("QbSdk", "qbsdk createMiniQBShortCut");
            Object objInvokeStaticMethod = dexLoaderB.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createMiniQBShortCut", new Class[]{Context.class, String.class, String.class, Bitmap.class}, context, str, str2, bitmap);
            TbsLog.e("QbSdk", "qbsdk after createMiniQBShortCut ret: " + objInvokeStaticMethod);
            if (objInvokeStaticMethod != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean d() {
        return O != PrivateCDNMode.NOT_USE;
    }

    public static boolean deleteMiniQBShortCut(Context context, String str, String str2) {
        u uVarA;
        return (context == null || TbsDownloader.getOverSea(context) || (uVarA = u.a()) == null || !uVarA.b() || uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "deleteMiniQBShortCut", new Class[]{Context.class, String.class, String.class}, context, str, str2) == null) ? false : true;
    }

    @Deprecated
    public static void deleteStableCore(Context context, int i2) {
    }

    public static void disAllowThirdAppDownload() {
        c = false;
    }

    public static void disableAutoCreateX5Webview() {
        j = false;
    }

    @Deprecated
    public static void disableSensitiveApi() {
        TbsPrivacyAccess.disableSensitiveApi();
    }

    public static SystemCoreProtector e() {
        return P;
    }

    public static void enableX5WithoutRestart() {
        throw new UnsupportedOperationException("Current TBS SDK doesn't support");
    }

    public static void fileInfoDetect(Context context, String str, android.webkit.ValueCallback<String> valueCallback) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            return;
        }
        try {
            uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "fileInfoDetect", new Class[]{Context.class, String.class, android.webkit.ValueCallback.class}, context, str, valueCallback);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void forceSysWebView() {
        b = true;
        v = "SysWebViewForcedByOuter: " + Log.getStackTraceString(new Throwable());
        TbsLog.e("QbSdk", "sys WebView: SysWebViewForcedByOuter");
    }

    public static long getApkFileSize(Context context) {
        if (context != null) {
            return TbsDownloadConfig.getInstance(context.getApplicationContext()).mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_TBSAPKFILESIZE, 0L);
        }
        return 0L;
    }

    public static String getCurrentProcessName(Context context) {
        FileInputStream fileInputStream;
        try {
            try {
                fileInputStream = new FileInputStream("/proc/self/cmdline");
                try {
                    byte[] bArr = new byte[256];
                    int i2 = 0;
                    while (true) {
                        int i3 = fileInputStream.read();
                        if (i3 <= 0 || i2 >= 256) {
                            break;
                        }
                        bArr[i2] = (byte) i3;
                        i2++;
                    }
                    if (i2 > 0) {
                        String str = new String(bArr, 0, i2, "UTF-8");
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        return str;
                    }
                    fileInputStream.close();
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return null;
    }

    public static String[] getDexLoaderFileList(Context context, Context context2, String str) {
        Object obj;
        String[] strArr = u;
        if (!(strArr instanceof String[])) {
            Object objA = com.tencent.smtt.utils.j.a(s, "getJarFiles", (Class<?>[]) new Class[]{Context.class, Context.class, String.class}, context, context2, str);
            if (!(objA instanceof String[])) {
                obj = objA;
                obj = new String[]{""};
            }
            obj = objA;
            return (String[]) obj;
        }
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(str);
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(u[i2]);
            strArr2[i2] = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
        }
        return strArr2;
    }

    @Deprecated
    public static boolean getDownloadWithoutWifi() {
        return I;
    }

    public static boolean getIsInitX5Environment() {
        return k;
    }

    public static boolean getIsSysWebViewForcedByOuter() {
        return b;
    }

    public static boolean getJarFilesAndLibraryPath(Context context) {
        String str;
        Object obj = s;
        if (obj == null) {
            str = "getJarFilesAndLibraryPath sExtensionObj is null";
        } else {
            Bundle bundle = (Bundle) com.tencent.smtt.utils.j.a(obj, "canLoadX5CoreAndNotLoadSo", (Class<?>[]) new Class[]{Integer.TYPE}, 44286);
            if (bundle != null) {
                u = bundle.getStringArray("tbs_jarfiles");
                d = bundle.getString("tbs_librarypath");
                return true;
            }
            str = "getJarFilesAndLibraryPath bundle is null and coreverison is " + m.a().a(true, context);
        }
        TbsLog.i("QbSdk", str);
        return false;
    }

    public static String getMiniQBVersion(Context context) {
        u uVarA = u.a();
        uVarA.a(context);
        if (uVarA.b()) {
            return uVarA.c().f();
        }
        return null;
    }

    public static boolean getOnlyDownload() {
        return l;
    }

    public static String getQQBuildNumber() {
        return C;
    }

    public static Map<String, Object> getSettings() {
        return o;
    }

    public static boolean getTBSInstalling() {
        return J;
    }

    public static String getTID() {
        return B;
    }

    public static File getTbsFolderDir(Context context) {
        if (context == null) {
            return null;
        }
        return context.getDir(com.tencent.smtt.utils.b.c() ? "tbs_64" : "tbs", 0);
    }

    @Deprecated
    public static String getTbsResourcesPath(Context context) {
        return "";
    }

    public static int getTbsSdkVersion() {
        return 44286;
    }

    public static int getTbsVersion(Context context) {
        return m.a().g(context);
    }

    public static int getTbsVersionForCrash(Context context) {
        if (a) {
            return 0;
        }
        int iH = m.a().h(context);
        if (iH == 0 && l.a(context).c() == 3) {
            g(context);
        }
        return iH;
    }

    public static int getTmpDirTbsVersion(Context context) {
        if (l.a(context).c() == 2) {
            return m.a().d(context, 0);
        }
        if (l.a(context).b("copy_status") == 1) {
            return m.a().d(context, 1);
        }
        return 0;
    }

    public static String getX5CoreLoadHelp(Context context) {
        String strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (context == null) {
            return "context is null";
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        int iG = m.a().g(context);
        if (iG > 0) {
            int loadErrorCode = TbsCoreLoadStat.getLoadErrorCode();
            if (loadErrorCode == -1 && u.a().b()) {
                strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = "core load success";
            } else {
                StringBuilder sbO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(iG, loadErrorCode, "Core Exist version is ", ", error code: ", ", detail: ");
                sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append(TbsCoreLoadStat.getLoadErrorMessage());
                sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append(", suggestion: ");
                sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append(com.tencent.smtt.utils.f.a().a(loadErrorCode));
                strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.toString();
            }
        } else {
            int nextPostInterval = TbsDownloader.getNextPostInterval(context);
            if (TbsDownloader.a) {
                strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = "core is downloading, please check TbsListener.onDownloadProgress.";
            } else if (Apn.getApnType(context) == 3 || canDownloadWithoutWifi()) {
                strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = nextPostInterval > 0 ? O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(nextPostInterval, "Perhaps server is busy, try to restart your app in ", "s later or (uninstall + reinstall).") : "Core not exist, unknown network problem.";
            } else {
                strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = "Mobile Network will not download as default. If you want, you can set QbSdk.setDownloadWithoutWifi(true) in the beginning of your app.";
            }
        }
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, "If it doesn't help, contact with x5 with your tbslog.txt, site: x5.tencent.com");
    }

    public static void initBuglyAsync(boolean z2) {
        i = z2;
    }

    public static void initForinitAndNotLoadSo(Context context) {
        String str;
        if (r == null) {
            File fileN = m.a().n(context);
            if (fileN == null) {
                str = "QbSdk initForinitAndNotLoadSo optDir == null";
            } else {
                File file = new File(fileN, "tbs_sdk_extension_dex.jar");
                if (file.exists()) {
                    String absolutePath = fileN.getAbsolutePath();
                    u.a().b(context);
                    com.tencent.smtt.utils.n.a(context);
                    r = new DexLoader(file.getParent(), context, new String[]{file.getAbsolutePath()}, absolutePath, getSettings()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
                    return;
                }
                str = "QbSdk initForinitAndNotLoadSo dexFile.exists()=false";
            }
            Log.e("QbSdk", str);
        }
    }

    public static void initTbsSettings(Map<String, Object> map) {
        Map<String, Object> map2 = o;
        if (map2 == null) {
            o = map;
            return;
        }
        try {
            map2.putAll(map);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void initX5Environment(final Context context, final PreInitCallback preInitCallback) {
        com.tencent.smtt.utils.r.a().a("init_tbs_Start");
        TbsLog.initIfNeed(context);
        if (context == null) {
            TbsLog.e("QbSdk", "initX5Environment,context=null");
            return;
        }
        if (d()) {
            TbsLog.i("QbSdk", "using private CDN mode, preInit directly.");
            preInit(context, preInitCallback);
            return;
        }
        b(context);
        H = new TbsListener() { // from class: com.tencent.smtt.sdk.QbSdk.3
            @Override // com.tencent.smtt.sdk.TbsListener
            public void onDownloadFinish(int i2) {
            }

            @Override // com.tencent.smtt.sdk.TbsListener
            public void onDownloadProgress(int i2) {
            }

            @Override // com.tencent.smtt.sdk.TbsListener
            public void onInstallFinish(int i2) {
                QbSdk.preInit(context, preInitCallback);
            }
        };
        if (TbsShareManager.isThirdPartyApp(context)) {
            m.a().b(context, f.a == 0);
        }
        TbsDownloader.needDownload(context, false, false, true, new TbsDownloader.TbsDownloaderCallback() { // from class: com.tencent.smtt.sdk.QbSdk.4
            @Override // com.tencent.smtt.sdk.TbsDownloader.TbsDownloaderCallback
            public void onNeedDownloadFinish(boolean z2, int i2) {
                if (TbsShareManager.isThirdPartyApp(context)) {
                    QbSdk.n.onDownloadFinish(TbsDownloadConfig.getInstance(context).getCurrentDownloadInterruptCode());
                    if (QbSdk.i) {
                        TbsExtensionFunctionManager.getInstance().initTbsBuglyIfNeed(context);
                    }
                }
                if (QbSdk.c() != null) {
                    TbsDownloader.a(context, new Runnable() { // from class: com.tencent.smtt.sdk.QbSdk.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            QbSdk.preInit(context, preInitCallback);
                        }
                    });
                } else {
                    QbSdk.preInit(context, preInitCallback);
                }
            }
        });
        k = true;
    }

    public static boolean installLocalQbApk(Context context, String str, String str2, Bundle bundle) {
        f fVarA = f.a(true);
        fVarA.a(context, false, false);
        if (fVarA.b()) {
            return fVarA.a().a(context, str, str2, bundle);
        }
        return false;
    }

    @Deprecated
    public static void installLocalTbsCore(Context context, int i2, String str) {
        m.a().a(context, str, i2);
    }

    public static boolean intentDispatch(WebView webView, Intent intent, String str, String str2) {
        String str3;
        if (webView == null) {
            return false;
        }
        if (str.startsWith("mttbrowser://miniqb/ch=icon?")) {
            Context context = webView.getContext();
            int iIndexOf = str.indexOf("url=");
            str = iIndexOf > 0 ? str.substring(iIndexOf + 4) : null;
            HashMap map = new HashMap();
            try {
                str3 = context.getApplicationInfo().packageName;
            } catch (Exception e2) {
                e2.printStackTrace();
                str3 = "unknown";
            }
            map.put("ChannelID", str3);
            map.put("PosID", "14004");
            if (MttLoader.loadUrl(context, "miniqb://home".equals(str) ? "qb://navicard/addCard?cardId=168&cardName=168" : str, map, "QbSdk.startMiniQBToLoadUrl", null) != 0) {
                u uVarA = u.a();
                if (uVarA != null && uVarA.b() && uVarA.c().a(context, str, null, str2, null) == 0) {
                    return true;
                }
                webView.loadUrl(str);
            }
        } else {
            webView.loadUrl(str);
        }
        return false;
    }

    @Deprecated
    public static boolean isEnableCanGetSubscriberId() {
        return TbsPrivacyAccess.Imsi.isEnabled();
    }

    @Deprecated
    public static boolean isEnableGetAndroidID() {
        return TbsPrivacyAccess.AndroidId.isEnabled();
    }

    @Deprecated
    public static boolean isEnableGetDeviceID() {
        return TbsPrivacyAccess.DeviceId.isEnabled();
    }

    @Deprecated
    public static boolean isEnableSensitiveApi() {
        return TbsPrivacyAccess.isEnableSensitiveApi();
    }

    public static boolean isEnableX5WithoutRestart() {
        return E;
    }

    public static boolean isMiniQBShortCutExist(Context context, String str, String str2) {
        u uVarA;
        Object objInvokeStaticMethod;
        if (context == null || TbsDownloader.getOverSea(context) || (uVarA = u.a()) == null || !uVarA.b() || (objInvokeStaticMethod = uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "isMiniQBShortCutExist", new Class[]{Context.class, String.class}, context, str)) == null) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        if (objInvokeStaticMethod instanceof Boolean) {
            bool = (Boolean) objInvokeStaticMethod;
        }
        return bool.booleanValue();
    }

    public static boolean isNeedInitX5FirstTime() {
        return x;
    }

    public static boolean isStaticNeedDownload() {
        return L;
    }

    public static boolean isTbsCoreInited() {
        f fVarA = f.a(false);
        return fVarA != null && fVarA.h();
    }

    public static boolean isX5Core() {
        if (getIsSysWebViewForcedByOuter()) {
            return false;
        }
        return u.a().b();
    }

    public static boolean isX5DisabledSync(Context context) {
        if (l.a(context).c() == 2) {
            return false;
        }
        if (!d(context)) {
            return true;
        }
        int iG = m.a().g(context);
        Object obj = s;
        Class cls = Integer.TYPE;
        Object objA = com.tencent.smtt.utils.j.a(obj, "isX5DisabledSync", (Class<?>[]) new Class[]{cls, cls}, Integer.valueOf(iG), 44286);
        if (objA != null) {
            return ((Boolean) objA).booleanValue();
        }
        return true;
    }

    public static void loadTBSSDKExtension(Context context, String str) {
        Constructor<?> constructor;
        boolean z2;
        Object objNewInstance;
        if (s != null) {
            return;
        }
        synchronized (QbSdk.class) {
            try {
                if (s != null) {
                    return;
                }
                if (r == null) {
                    TbsLog.i("QbSdk", "QbSdk loadTBSSDKExtension sExtensionClass is null");
                }
                try {
                    constructor = r.getConstructor(Context.class, Context.class, String.class, String.class, String.class);
                    z2 = true;
                } catch (Throwable unused) {
                    constructor = null;
                    z2 = false;
                }
                try {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    if (z2) {
                        objNewInstance = constructor.newInstance(context, context, null, str, (!TbsConfig.APP_WX.equals(getCurrentProcessName(context)) || WebView.mWebViewCreated) ? null : "notLoadSo");
                    } else {
                        objNewInstance = r.getConstructor(Context.class, Context.class).newInstance(context, context);
                    }
                    s = objNewInstance;
                } catch (Throwable th) {
                    TbsCoreLoadStat.getInstance().a(context, 310, th);
                    TbsLog.e("QbSdk", "throwable" + Log.getStackTraceString(th));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void openNetLog(String str) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            return;
        }
        try {
            uVarA.c().b().invokeStaticMethod("com.tencent.smtt.livelog.NetLogManager", "openNetLog", new Class[]{String.class}, str);
        } catch (Exception unused) {
        }
    }

    public static void pauseDownload() {
        TbsDownloader.pauseDownload();
    }

    public static void preInit(Context context) {
        preInit(context, null);
    }

    public static boolean preinstallStaticTbs(Context context) {
        throw new IllegalStateException("Current SDK is not support static mode.");
    }

    public static void reset(Context context) {
        if (K) {
            TbsLog.w("QbSdk", "[warning] TBS only allow reset 1 times each process.");
        } else {
            K = true;
            g(context);
        }
    }

    @Deprecated
    public static void resetDecoupleCore(Context context) {
    }

    public static void resumeDownload() {
        TbsDownloader.resumeDownload();
    }

    public static void setAppList(Context context, List<String> list) {
        if (list == null) {
            return;
        }
        TbsPrivacyAccess.configureAllPrivacy(context, TextUtils.join(",", list));
    }

    public static void setCoreMinVersion(int i2) {
        TbsLog.i("QbSdk", "setCoreMinVersion: " + i2);
        M = i2;
    }

    public static void setCurrentID(String str) {
        if (str != null && str.startsWith(TID_QQNumber_Prefix)) {
            String strSubstring = str.substring(3);
            B = "0000000000000000".substring(strSubstring.length()) + strSubstring;
        }
    }

    public static void setDisableUnpreinitBySwitch(boolean z2) {
        D = z2;
        TbsLog.i("QbSdk", "setDisableUnpreinitBySwitch -- mDisableUnpreinitBySwitch is " + D);
    }

    public static void setDisableUseHostBackupCoreBySwitch(boolean z2) {
        mDisableUseHostBackupCore = z2;
        TbsLog.i("QbSdk", "setDisableUseHostBackupCoreBySwitch -- mDisableUseHostBackupCore is " + mDisableUseHostBackupCore);
    }

    public static void setDownloadWithoutWifi(boolean z2) {
        I = z2;
    }

    @Deprecated
    public static void setEnableForThirdParty(Context context, Bundle bundle) {
        com.tencent.smtt.utils.s.a(context, bundle);
    }

    public static void setMultiProcessSyncInitTimer(Timer timer) {
        if (N == null) {
            N = timer;
        }
    }

    public static void setNeedInitX5FirstTime(boolean z2) {
        x = z2;
    }

    public static void setNeedStaticWithDownload(boolean z2) {
        throw new IllegalStateException("Current SDK is not support static mode.");
    }

    public static void setNetLogEncryptionKey(String str) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            return;
        }
        try {
            uVarA.c().b().invokeStaticMethod("com.tencent.smtt.livelog.NetLogManager", "setNetLogEncryptionKey", new Class[]{String.class}, str);
        } catch (Exception unused) {
        }
    }

    public static void setNewDnsHostList(String str) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            return;
        }
        try {
            uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "setNewDnsHostList", new Class[]{String.class}, str);
        } catch (Exception unused) {
        }
    }

    public static void setOnlyDownload(boolean z2) {
        l = z2;
    }

    public static void setQQBuildNumber(String str) {
        C = str;
    }

    public static void setSandboxExternalEnable(boolean z2) {
        FileUtil.a(z2);
    }

    public static void setSystemCoreProtector(SystemCoreProtector systemCoreProtector) {
        throw new com.tencent.smtt.utils.a.a();
    }

    public static void setTBSInstallingStatus(boolean z2) {
        J = z2;
    }

    public static void setTbsInstallerCallback(a aVar) {
        m.a().a(aVar);
    }

    public static void setTbsListener(TbsListener tbsListener) {
        G = tbsListener;
    }

    public static void setTbsLogClient(TbsLogClient tbsLogClient) {
        TbsLog.setTbsLogClient(tbsLogClient);
    }

    public static void setUUID(String str) {
        com.tencent.smtt.utils.b.a(str, true);
    }

    @Deprecated
    public static void setUploadCode(Context context, int i2) {
    }

    public static void setUserID(Context context, Bundle bundle) {
        TbsPrivacyAccess.configureAllPrivacy(context, bundle);
    }

    public static int startMiniQBToLoadUrl(Context context, String str, HashMap<String, String> map, android.webkit.ValueCallback<String> valueCallback) {
        TbsCoreLoadStat.getInstance().a(context, 501);
        if (context == null) {
            return -100;
        }
        u uVarA = u.a();
        uVarA.a(context);
        if (!uVarA.b()) {
            TbsCoreLoadStat.getInstance().a(context, 502);
            Log.e("QbSdk", "startMiniQBToLoadUrl  ret = -102");
            return PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED;
        }
        if (context.getApplicationInfo().packageName.equals("com.nd.android.pandahome2") && getTbsVersion(context) < 25487) {
            return -101;
        }
        int iA = uVarA.c().a(context, str, map, null, valueCallback);
        TbsLog.i("QbSdk", "startMiniQBToLoadUrl  ret = " + iA);
        return iA;
    }

    public static boolean startQBForDoc(Context context, String str, int i2, int i3, String str2, Bundle bundle) {
        HashMap map = new HashMap();
        map.put("ChannelID", context.getApplicationContext().getApplicationInfo().processName);
        map.put("PosID", Integer.toString(i2));
        return MttLoader.openDocWithQb(context, str, i3, str2, map, bundle);
    }

    public static boolean startQBForVideo(Context context, String str, int i2) {
        HashMap map = new HashMap();
        map.put("ChannelID", context.getApplicationInfo().processName);
        map.put("PosID", Integer.toString(i2));
        return MttLoader.openVideoWithQb(context, str, map);
    }

    public static boolean startQBToLoadurl(Context context, String str, int i2, WebView webView) {
        Object objInvokeStaticMethod;
        HashMap map = new HashMap();
        map.put("ChannelID", context.getApplicationInfo().processName);
        map.put("PosID", Integer.toString(i2));
        if (webView == null) {
            try {
                String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                if (str2 == TbsConfig.APP_WX || str2 == TbsConfig.APP_QQ) {
                    u uVarA = u.a();
                    if (uVarA != null && uVarA.b() && (objInvokeStaticMethod = uVarA.c().b().invokeStaticMethod("com.tencent.smtt.webkit.WebViewList", "getCurrentMainWebviewJustForQQandWechat", new Class[0], new Object[0])) != null) {
                        webView = (WebView) ((IX5WebViewBase) objInvokeStaticMethod).getView().getParent();
                    }
                }
            } catch (Exception unused) {
            }
        }
        return MttLoader.loadUrl(context, str, map, "QbSdk.startQBToLoadurl", webView) == 0;
    }

    public static boolean startQbOrMiniQBToLoadUrl(Context context, String str, HashMap<String, String> map, ValueCallback<String> valueCallback) {
        if (context == null) {
            return false;
        }
        u uVarA = u.a();
        uVarA.a(context);
        if (map != null && "5".equals(map.get("PosID")) && uVarA.b()) {
        }
        if (MttLoader.loadUrl(context, str, map, "QbSdk.startMiniQBToLoadUrl", null) != 0) {
            return uVarA.b() && (!context.getApplicationInfo().packageName.equals("com.nd.android.pandahome2") || getTbsVersion(context) >= 25487) && uVarA.c().a(context, str, map, null, valueCallback) == 0;
        }
        return true;
    }

    public static void unForceSysWebView() {
        b = false;
        TbsLog.e("QbSdk", "sys WebView: unForceSysWebView called");
    }

    public static void uploadNetLog(String str) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            return;
        }
        try {
            uVarA.c().b().invokeStaticMethod("com.tencent.smtt.livelog.NetLogManager", "uploadNetLog", new Class[]{String.class}, str);
        } catch (Exception unused) {
        }
    }

    public static void usePrivateCDN() {
        throw new com.tencent.smtt.utils.a.a();
    }

    public static boolean useSoftWare() {
        Object obj = s;
        if (obj == null) {
            return false;
        }
        Object objA = com.tencent.smtt.utils.j.a(obj, "useSoftWare", (Class<?>[]) new Class[0], new Object[0]);
        if (objA == null) {
            objA = com.tencent.smtt.utils.j.a(s, "useSoftWare", (Class<?>[]) new Class[]{Integer.TYPE}, Integer.valueOf(com.tencent.smtt.sdk.a.a()));
        }
        if (objA == null) {
            return false;
        }
        return ((Boolean) objA).booleanValue();
    }

    public static Object a(Context context, String str, Bundle bundle) {
        if (!a(context)) {
            return Integer.valueOf(EXTENSION_INIT_FAILURE);
        }
        Object objA = com.tencent.smtt.utils.j.a(s, "miscCall", (Class<?>[]) new Class[]{String.class, Bundle.class}, str, bundle);
        if (objA != null) {
            return objA;
        }
        return null;
    }

    public static boolean b(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null) {
            return false;
        }
        try {
            if (!context.getApplicationInfo().packageName.contains("com.tencent.portfolio")) {
                return true;
            }
            TbsLog.i("QbSdk", "clearPluginConfigFile #1");
            String string = TbsDownloadConfig.getInstance(context).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONNAME, null);
            String str = context.getPackageManager().getPackageInfo("com.tencent.portfolio", 0).versionName;
            TbsLog.i("QbSdk", "clearPluginConfigFile oldAppVersionName is " + string + " newAppVersionName is " + str);
            if (string == null || string.contains(str) || (sharedPreferences = context.getSharedPreferences("plugin_setting", 0)) == null) {
                return true;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.clear();
            editorEdit.commit();
            TbsLog.i("QbSdk", "clearPluginConfigFile done");
            return true;
        } catch (Throwable th) {
            TbsLog.i("QbSdk", "clearPluginConfigFile error is " + th.getMessage());
            return false;
        }
    }

    private static boolean d(Context context) {
        try {
            if (r != null) {
                return true;
            }
            File fileN = m.a().n(context);
            if (fileN == null) {
                TbsLog.e("QbSdk", "QbSdk initForX5DisableConfig (false) optDir == null");
                return false;
            }
            File file = new File(m.a().n(context), "tbs_sdk_extension_dex.jar");
            if (!file.exists()) {
                TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_OLD, new Exception("initForX5DisableConfig failure -- tbs_sdk_extension_dex.jar is not exist!"));
                return false;
            }
            String absolutePath = fileN.getAbsolutePath();
            TbsLog.i("QbSdk", "QbSdk init optDirExtension #3 is " + absolutePath);
            TbsLog.i("QbSdk", "new DexLoader #4 dexFile is " + file.getAbsolutePath());
            u.a().b(context);
            com.tencent.smtt.utils.n.a(context);
            r = new DexLoader(file.getParent(), context, new String[]{file.getAbsolutePath()}, absolutePath, getSettings()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
            if (!isEnableSensitiveApi() && com.tencent.smtt.utils.j.a(r, "isSuiteableGetSensitative", (Class<?>[]) new Class[0], new Object[0]) == null) {
                TbsLog.e("QbSdk", "isSuiteableGetSensitative check failed,can not use x5");
                return false;
            }
            loadTBSSDKExtension(context, file.getParent());
            com.tencent.smtt.utils.j.a(s, "setClientVersion", (Class<?>[]) new Class[]{Integer.TYPE}, 1);
            return true;
        } catch (Throwable th) {
            TbsLog.e("QbSdk", "initForX5DisableConfig sys WebView: " + Log.getStackTraceString(th));
            return false;
        }
    }

    private static void e(Context context) {
        if (F || !Thread.currentThread().getName().equals("tbs_preinit")) {
            return;
        }
        F = true;
        TbsLog.i("QbSdk", "QbSdk - preload_x5_check -- process:" + context.getApplicationInfo().processName + "; thread:" + Thread.currentThread().getName());
        int iG = m.a().g(context);
        if (iG <= 0) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4);
            int i2 = sharedPreferences.getInt("tbs_preload_x5_recorder", 0) + 1;
            if (i2 > 3) {
                TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_CORE_LOAD_CRASH_PROTECT, new Throwable("thread " + Thread.currentThread().getName()));
                f(context);
                g(context);
                TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
                TbsLogReport.TbsLogInfo tbsLogInfo = tbsLogReport.tbsLogInfo();
                tbsLogInfo.setErrorCode(iG);
                tbsLogReport.eventReport(TbsLogReport.EventType.TYPE_CORE_PROTECT_RESET, tbsLogInfo);
            } else {
                sharedPreferences.edit().putInt("tbs_preload_x5_recorder", i2).commit();
            }
        } catch (Throwable th) {
            TbsLog.e("QbSdk", "tbs_preload_x5_counter Inc exception:" + Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Context context) {
        if (Thread.currentThread().getName().equals("tbs_preinit")) {
            context.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4).edit().putInt("tbs_preload_x5_recorder", 0).commit();
        }
    }

    private static void g(Context context) {
        TbsLog.e("QbSdk", "QbSdk reset!", true);
        try {
            TbsDownloader.stopDownload();
            TbsDownloader.c(context);
            FileUtil.a(getTbsFolderDir(context), false, "core_share_decouple");
            TbsLog.i("QbSdk", "delete downloaded apk success", true);
            m.b();
            File file = new File(context.getFilesDir(), TbsExtensionFunctionManager.BUGLY_SWITCH_FILE_NAME);
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable th) {
            TbsLog.e("QbSdk", "QbSdk reset exception:" + Log.getStackTraceString(th));
        }
    }

    public static void preInit(Context context, PreInitCallback preInitCallback) {
        preInit(context, false, preInitCallback);
    }

    @Deprecated
    public static void reset(Context context, boolean z2) {
        if (K) {
            TbsLog.w("QbSdk", "[warning] TBS only allow reset 1 times each process.");
        } else {
            K = true;
            g(context);
        }
    }

    public static void usePrivateCDN(PrivateCDNMode privateCDNMode) {
        throw new com.tencent.smtt.utils.a.a();
    }

    public static String a() {
        return q;
    }

    public static boolean b(Context context, int i2) {
        int i3 = M;
        if (i2 >= i3 || i2 == 0 || i3 == -1 || !TbsShareManager.isThirdPartyApp(context)) {
            return false;
        }
        g(context);
        TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.APP_SET_MIN_CORE_VER, new Throwable("QbSdk.setCoreMinVersion: " + M));
        return true;
    }

    public static synchronized void preInit(final Context context, boolean z2, final PreInitCallback preInitCallback) {
        com.tencent.smtt.utils.r.a().a("preinit_start");
        TbsLog.initIfNeed(context);
        TbsLog.i("QbSdk", "preInit", "processName: " + getCurrentProcessName(context));
        TbsLog.i("QbSdk", "preInit", "stack trace: " + Log.getStackTraceString(new Throwable("PreInit Detect:")));
        if (z2 && t && !E) {
            TbsLog.w("QbSdk", "haven't enableX5WithoutRestart");
            return;
        }
        if (z2) {
            a = false;
            t = false;
            TbsLog.w("QbSdk", "is forcePreInit, local web core status has reset");
        }
        if (!t) {
            TbsLog.i("QbSdk", "preInit", "#1# Start new thread to preInit, thread name: tbs_preinit");
            final Handler handler = new Handler(Looper.getMainLooper()) { // from class: com.tencent.smtt.sdk.QbSdk.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    PreInitCallback preInitCallback2;
                    int i2 = message.what;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3 && (preInitCallback2 = preInitCallback) != null) {
                                preInitCallback2.onCoreInitFinished();
                                return;
                            }
                            return;
                        }
                        com.tencent.smtt.utils.r.a().a("preinit_finish");
                        PreInitCallback preInitCallback3 = preInitCallback;
                        if (preInitCallback3 != null) {
                            preInitCallback3.onViewInitFinished(false);
                            com.tencent.smtt.utils.r.a().a("init_tbs_end");
                        }
                        TbsLog.writeLogToDisk();
                        com.tencent.smtt.utils.r.a().a(context);
                        return;
                    }
                    com.tencent.smtt.utils.r.a().a("preinit_finish");
                    if (QbSdk.j) {
                        com.tencent.smtt.utils.r.a().a("create_webview_start");
                        v vVarC = u.a().c();
                        if (vVarC != null) {
                            vVarC.a(context);
                        }
                        com.tencent.smtt.utils.r.a().a("create_webview_end");
                    }
                    PreInitCallback preInitCallback4 = preInitCallback;
                    if (preInitCallback4 != null) {
                        preInitCallback4.onViewInitFinished(true);
                        com.tencent.smtt.utils.r.a().a("init_tbs_end");
                    }
                    com.tencent.smtt.utils.r.a().a(context);
                    TbsLog.writeLogToDisk();
                }
            };
            Thread thread = new Thread() { // from class: com.tencent.smtt.sdk.QbSdk.2
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    int iA = m.a().a(true, context);
                    TbsDownloader.setAppContext(context);
                    TbsLog.i("QbSdk", "QbSdk preinit ver is " + iA);
                    m.a().b(context, f.a == 0);
                    TbsLog.i("QbSdk", "preInit", "#2-1# prepare initAndLoadSo");
                    u uVarA = u.a();
                    uVarA.a(context);
                    QbSdk.f(context);
                    TbsLog.i("QbSdk", "preInit", "#2-3# X5CoreEngine init finish");
                    boolean zB = uVarA.b();
                    handler.sendEmptyMessage(3);
                    if (zB) {
                        handler.sendEmptyMessage(1);
                    } else {
                        handler.sendEmptyMessage(2);
                    }
                }
            };
            thread.setName("tbs_preinit");
            thread.setPriority(10);
            thread.start();
            t = true;
        }
    }

    public static synchronized void a(Context context, String str) {
        if (b) {
            TbsCoreLoadStat.getInstance().a(context, 402, new Throwable(v));
            return;
        }
        if (a) {
            return;
        }
        a = true;
        w = "forceSysWebViewInner: " + str;
        TbsLog.e("QbSdk", "forceSysWebViewInner", "Reason:" + w);
        TbsLog.e("QbSdk", "forceSysWebViewInner", Log.getStackTraceString(new Throwable("#")));
        TbsCoreLoadStat.getInstance().a(context, 401);
    }

    public static boolean a(Context context) {
        try {
            if (r != null) {
                return true;
            }
            File fileN = m.a().n(context);
            if (fileN == null) {
                TbsLog.e("QbSdk", "QbSdk initExtension (false) optDir == null");
                return false;
            }
            File file = new File(fileN, "tbs_sdk_extension_dex.jar");
            if (!file.exists()) {
                TbsLog.e("QbSdk", "QbSdk initExtension (false) dexFile.exists()=false", true);
                return false;
            }
            TbsLog.i("QbSdk", "new DexLoader #3 dexFile is " + file.getAbsolutePath());
            u.a().b(context);
            com.tencent.smtt.utils.n.a(context);
            r = new DexLoader(file.getParent(), context, new String[]{file.getAbsolutePath()}, fileN.getAbsolutePath(), getSettings()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
            if (isEnableSensitiveApi() || com.tencent.smtt.utils.j.a(r, "isSuiteableGetSensitative", (Class<?>[]) new Class[0], new Object[0]) != null) {
                loadTBSSDKExtension(context, file.getParent());
                return true;
            }
            TbsLog.e("QbSdk", "isSuiteableGetSensitative check failed,can not use x5");
            return false;
        } catch (Throwable th) {
            TbsLog.e("QbSdk", "initExtension sys WebView: " + Log.getStackTraceString(th));
            return false;
        }
    }

    public static boolean a(Context context, int i2) {
        return a(context, i2, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
    }

    public static boolean a(Context context, int i2, int i3) {
        Map<String, Object> map = o;
        if (map != null && map.containsKey(KEY_SET_SENDREQUEST_AND_UPLOAD) && o.get(KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")) {
            TbsLog.i("QbSdk", "[QbSdk.isX5Disabled] -- SET_SENDREQUEST_AND_UPLOAD is false");
            return true;
        }
        if (!isEnableSensitiveApi() && com.tencent.smtt.utils.j.a(r, "isSuiteableGetSensitative", (Class<?>[]) new Class[0], new Object[0]) == null) {
            TbsLog.e("QbSdk", "isSuiteableGetSensitative check failed,can not use x5");
            return false;
        }
        m.a().b(context, f.a == 0);
        if (d(context)) {
            return TbsDownloader.isTbsCoreDisabledBySwitch(context.getApplicationContext(), i2);
        }
        return true;
    }

    @SuppressLint({"NewApi"})
    private static boolean a(Context context, boolean z2) {
        TbsLog.initIfNeed(context);
        if (!sIsVersionPrinted) {
            TbsLog.i("QbSdk", "svn revision: jnizz; SDK_VERSION_CODE: 44286; SDK_VERSION_NAME: 4.3.0.386");
            sIsVersionPrinted = true;
        }
        if (a && !z2) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_SDKINIT_IS_SYS_FORCED);
            TbsLog.e("QbSdk", "init", "Force WebView Inner, " + w);
            return false;
        }
        if (b) {
            TbsCoreLoadStat.getInstance().a(context, 402, new Throwable(v));
            TbsLog.e("QbSdk", "init", "QbSdk init mIsSysWebViewForcedByOuter = true, " + v);
            return false;
        }
        if (!com.tencent.smtt.utils.b.b()) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_CPU_NOT_SUPPORT, new Throwable(com.tencent.smtt.utils.b.c));
            TbsLog.i("QbSdk", "init", "cpu is invalid: " + com.tencent.smtt.utils.b.c);
            return false;
        }
        if (TbsPVConfig.getInstance(context).isEnableProtection()) {
            e(context);
        }
        try {
            File fileN = m.a().n(context);
            if (fileN == null) {
                TbsCoreLoadStat.getInstance().a(context, 312, new Throwable("QbSdk.init (false) TbsCoreShareDir is null"));
                return false;
            }
            int iA = m.a().a(true, context);
            int i2 = p;
            if (i2 != 0 && i2 != iA) {
                r = null;
                s = null;
                TbsCoreLoadStat.getInstance().a(context, 303, new Throwable("sTbsVersion: " + p + "; tbsCoreInstalledVer: " + iA));
                return false;
            }
            p = iA;
            if (TbsDownloader.a(context, iA)) {
                TbsLog.w("QbSdk", "init", "version " + p + " is in blacklist,can not load! return");
                return false;
            }
            if (b(context, p)) {
                TbsLog.w("QbSdk", "version " + p + " is in below min-version that app set by QbSdk.setCoreMinVersion, reset and not load.");
                return false;
            }
            int i3 = y;
            if (i3 == -1) {
                boolean zIsTbsCoreDisabledBySwitch = TbsDownloader.isTbsCoreDisabledBySwitch(context.getApplicationContext(), p);
                y = !zIsTbsCoreDisabledBySwitch ? 1 : 0;
                if (zIsTbsCoreDisabledBySwitch) {
                    TbsLog.w("QbSdk", "init", "version " + p + "is disable by remote switch");
                    TbsCoreLoadStat.getInstance().a(context, 309, new Throwable("version " + p + "is disable by remote switch"));
                    return false;
                }
            } else if (i3 == 0) {
                TbsLog.w("QbSdk", "init", "version " + p + "is disable by remote switch");
                return false;
            }
            if (r != null && s != null) {
                return true;
            }
            File fileN2 = m.a().n(context);
            File file = new File(fileN2, "tbs_sdk_extension_dex.jar");
            if (!file.exists()) {
                try {
                    int iG = m.a().g(context);
                    if (iG > 0) {
                        File file2 = new File(file.getParentFile(), "tbs_jars_fusion_dex.jar");
                        TbsCoreLoadStat.getInstance().a(context, 403, new Throwable("[loadMsg] extension is miss, fusion exist is " + file2.exists() + ", core is " + iG + ", dexPath is " + file.getPath()));
                    } else {
                        TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CORE_NOT_EXIST, new Throwable("core path: " + fileN2));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return false;
            }
            String absolutePath = fileN.getAbsolutePath();
            TbsLog.i("QbSdk", "init", "optDirExtension #1 is " + absolutePath);
            TbsLog.i("QbSdk", "init", "new DexLoader #1 dexFile is " + file.getAbsolutePath());
            u.a().b(context);
            com.tencent.smtt.utils.n.a(context);
            r = new DexLoader(file.getParent(), context, new String[]{file.getAbsolutePath()}, absolutePath, getSettings()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
            if (!isEnableSensitiveApi() && com.tencent.smtt.utils.j.a(r, "isSuiteableGetSensitative", (Class<?>[]) new Class[0], new Object[0]) == null) {
                TbsLog.e("QbSdk", "init", "isSuiteableGetSensitative check failed, can not use x5");
                return false;
            }
            loadTBSSDKExtension(context, file.getParent());
            com.tencent.smtt.utils.j.a(s, "setClientVersion", (Class<?>[]) new Class[]{Integer.TYPE}, 1);
            return true;
        } catch (Throwable th2) {
            TbsLog.e("QbSdk", "QbSdk init Throwable: " + Log.getStackTraceString(th2));
            TbsCoreLoadStat.getInstance().a(context, 306, th2);
            return false;
        }
    }

    public static boolean a(Context context, boolean z2, boolean z3) {
        boolean z4;
        Object objA;
        TbsLog.i("QbSdk", "canLoadX5", "#1# installTbsCoreIfNeeded");
        m.a().b(context, f.a == 0);
        int disabledCoreVersion = TbsPVConfig.getInstance(context).getDisabledCoreVersion();
        int iG = m.a().g(context);
        TbsLog.i("QbSdk", "canLoadX5", "#1-1# disabledCoreVersion is " + disabledCoreVersion + " localCoreVersion is " + iG);
        if (disabledCoreVersion != 0 && disabledCoreVersion == iG) {
            TbsLog.e("QbSdk", "canLoadX5", "#2-1# force use sys by remote switch");
            return false;
        }
        if (!a(context, z2)) {
            TbsLog.e("QbSdk", "canLoadX5", "#2-4# QbSdk.init failure!");
            return false;
        }
        Object obj = s;
        Class cls = Integer.TYPE;
        Object objA2 = com.tencent.smtt.utils.j.a(obj, "canLoadX5Core", (Class<?>[]) new Class[]{cls}, 44286);
        StringBuilder sb = new StringBuilder("#3# invoke sExtensionObj canLoadX5Core and ret is ");
        sb.append(objA2 != null);
        TbsLog.i("QbSdk", "canLoadX5", sb.toString());
        if (objA2 == null) {
            Object objA3 = com.tencent.smtt.utils.j.a(s, "canLoadX5", (Class<?>[]) new Class[]{cls}, Integer.valueOf(com.tencent.smtt.sdk.a.a()));
            if (objA3 == null) {
                TbsCoreLoadStat.getInstance().a(context, 308, new Throwable());
                return false;
            }
            if (((objA3 instanceof String) && ((String) objA3).equalsIgnoreCase("AuthenticationFail")) || !(objA3 instanceof Boolean)) {
                return false;
            }
            p = f.d();
            boolean zA = a(context, f.d());
            z4 = ((Boolean) objA3).booleanValue() && !zA;
            if (!z4) {
                TbsCoreLoadStat.getInstance().a(context, 318, new Throwable("isX5Disable:" + zA + "(Boolean) ret:" + objA3));
            }
            return z4;
        }
        if ((objA2 instanceof String) && ((String) objA2).equalsIgnoreCase("AuthenticationFail")) {
            TbsLog.e("QbSdk", "canLoadX5", "[LoadError] authenticationFail");
            return false;
        }
        if (!(objA2 instanceof Bundle)) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_RET_TYPE_NOT_BUNDLE, new Throwable("" + objA2));
            TbsLog.e("QbSdk", "canLoadX5", "[LoadError] ret not instance of bundle, ret:" + objA2);
            return false;
        }
        Bundle bundle = (Bundle) objA2;
        if (bundle.isEmpty()) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_EMPTY_BUNDLE, new Throwable("" + objA2));
            TbsLog.e("QbSdk", "canLoadX5", "[LoadError] empty bundle" + objA2);
            return false;
        }
        try {
            int i2 = bundle.getInt(FontsContractCompat.Columns.RESULT_CODE, -1);
            z4 = i2 == 0;
            if (!z4) {
                try {
                    objA = com.tencent.smtt.utils.j.a(s, "getErrorCodeForLogReport", (Class<?>[]) new Class[0], new Object[0]);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    objA = null;
                }
                if (objA instanceof Integer) {
                    TbsCoreLoadStat.getInstance().a(context, ((Integer) objA).intValue(), new Throwable("detail: " + objA));
                } else {
                    TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_QBSDK_INIT_RETCODE_ERROR, new Throwable("retcode:" + i2 + "; detail: " + objA));
                }
                return false;
            }
            try {
                q = bundle.getString("tbs_core_version", SessionDescription.SUPPORTED_SDP_VERSION);
            } catch (Exception unused) {
                q = SessionDescription.SUPPORTED_SDP_VERSION;
            }
            try {
                p = Integer.parseInt(q);
            } catch (NumberFormatException e3) {
                e3.printStackTrace();
                TbsLog.e("QbSdk", "core version string to num error: " + q);
                p = 0;
            }
            f.a(p);
            if (p == 0) {
                TbsCoreLoadStat.getInstance().a(context, 307, new Throwable("sTbsVersion is 0, string is " + q));
                TbsLog.e("QbSdk", "canLoadX5", "[LoadError] sTbsVersion is 0, version string is " + q);
                return false;
            }
            try {
                String[] stringArray = bundle.getStringArray("tbs_jarfiles");
                u = stringArray;
                if (stringArray != null) {
                    try {
                        d = bundle.getString("tbs_librarypath");
                        return z4;
                    } catch (Exception e4) {
                        TbsCoreLoadStat.getInstance().a(context, 307, e4);
                        return false;
                    }
                }
                TbsCoreLoadStat.getInstance().a(context, 307, new Throwable("sJarFiles not instanceof String[]: " + u));
                TbsLog.e("QbSdk", "canLoadX5", "sJarFiles not instanceof String[]: " + u);
                return false;
            } catch (Throwable th) {
                TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_GETSTRINGARRAY_JARFILE, th);
                return false;
            }
        } catch (Exception e5) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_QBSDK_INIT_RETCODE_ERROR, e5);
            return false;
        }
    }
}
