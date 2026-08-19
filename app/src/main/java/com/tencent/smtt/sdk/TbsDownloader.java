package com.tencent.smtt.sdk;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.PlaybackException;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.Timer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TimerTask;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TbsDownloader {
    public static final boolean DEBUG_DISABLE_DOWNLOAD = false;
    public static boolean DOWNLOAD_OVERSEA_TBS = false;
    public static final String LOGTAG = "TbsDownload";
    public static final String TBS_METADATA = "com.tencent.mm.BuildInfo.CLIENT_VERSION";
    static boolean a = false;
    private static String b = null;
    private static Context c = null;
    private static Handler d = null;
    private static String e = null;
    private static final Object f = new byte[0];
    private static k g = null;
    private static HandlerThread h = null;
    private static int i = 0;
    private static boolean j = false;
    private static String k = "";
    private static String l = "";
    private static boolean m = false;
    private static boolean n = false;
    private static JSONObject o = null;
    private static JSONObject p = null;
    private static boolean q = false;
    private static int r = 0;
    private static int s = 0;
    private static JSONObject t = null;
    private static long u = -1;

    public interface TbsDownloaderCallback {
        void onNeedDownloadFinish(boolean z, int i);
    }

    private static synchronized void c() {
        try {
            if (h == null) {
                h = TbsHandlerThread.getInstance();
                try {
                    g = new k(c);
                    d = new Handler(h.getLooper()) { // from class: com.tencent.smtt.sdk.TbsDownloader.1
                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            int i2 = message.what;
                            if (i2 == 109) {
                                if (TbsDownloader.g != null) {
                                    TbsDownloader.g.e();
                                    return;
                                }
                                return;
                            }
                            if (i2 == 110) {
                                if (TbsDownloader.c != null) {
                                    TbsDownloadConfig.getInstance(TbsDownloader.c).saveDownloadInterruptCode();
                                    return;
                                }
                                return;
                            }
                            switch (i2) {
                                case 100:
                                    boolean z = message.arg1 == 1;
                                    boolean zB = TbsDownloader.b(true, false, false, message.arg2 == 1);
                                    Object obj = message.obj;
                                    if (obj != null && (obj instanceof TbsDownloaderCallback)) {
                                        TbsLog.i(TbsDownloader.LOGTAG, "needDownload-onNeedDownloadFinish needStartDownload=" + zB);
                                        String str = (TbsDownloader.c == null || TbsDownloader.c.getApplicationContext() == null || TbsDownloader.c.getApplicationContext().getApplicationInfo() == null) ? "" : TbsDownloader.c.getApplicationContext().getApplicationInfo().packageName;
                                        if (!zB || z) {
                                            ((TbsDownloaderCallback) message.obj).onNeedDownloadFinish(zB, TbsDownloadConfig.getInstance(TbsDownloader.c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0));
                                        } else if (TbsConfig.APP_WX.equals(str) || TbsConfig.APP_QQ.equals(str)) {
                                            TbsLog.i(TbsDownloader.LOGTAG, "needDownload-onNeedDownloadFinish in mm or QQ callback needStartDownload = " + zB);
                                            ((TbsDownloaderCallback) message.obj).onNeedDownloadFinish(zB, TbsDownloadConfig.getInstance(TbsDownloader.c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0));
                                        }
                                    }
                                    if (TbsShareManager.isThirdPartyApp(TbsDownloader.c) && zB) {
                                        TbsDownloader.startDownload(TbsDownloader.c);
                                        break;
                                    }
                                    break;
                                case 101:
                                    TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(TbsDownloader.c);
                                    if (Apn.getApnType(TbsDownloader.c) == 3 || QbSdk.canDownloadWithoutWifi()) {
                                        TbsLog.i(TbsDownloader.LOGTAG, "---getting download file lock...");
                                        FileOutputStream fileOutputStreamB = FileUtil.b(TbsDownloader.c, true, "tbs_download_lock_file");
                                        if (fileOutputStreamB == null) {
                                            tbsDownloadConfig.setDownloadInterruptCode(-204);
                                            QbSdk.n.onDownloadFinish(TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED);
                                            QbSdk.n.onInstallFinish(243);
                                            TbsLog.w(TbsDownloader.LOGTAG, "download file-lock file io exception");
                                        } else {
                                            FileLock fileLockA = FileUtil.a(TbsDownloader.c, fileOutputStreamB);
                                            if (fileLockA != null) {
                                                boolean z2 = message.arg1 == 1;
                                                if (TbsDownloader.b(false, z2, false, true)) {
                                                    if (z2 && m.a().b(TbsDownloader.c, TbsDownloadConfig.getInstance(TbsDownloader.c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0))) {
                                                        TbsLog.i(TbsDownloader.LOGTAG, "needStartDownload, but try local install core firstly");
                                                        QbSdk.n.onDownloadFinish(122);
                                                        QbSdk.n.onInstallFinish(243);
                                                        tbsDownloadConfig.setDownloadInterruptCode(-213);
                                                    } else if (tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, false)) {
                                                        TbsDownloadConfig.getInstance(TbsDownloader.c).setDownloadInterruptCode(-215);
                                                        TbsLog.i(TbsDownloader.LOGTAG, "start download in apk downloader...");
                                                        TbsDownloader.g.a(z2, false);
                                                    } else {
                                                        tbsDownloadConfig.setDownloadInterruptCode(-133);
                                                        QbSdk.n.onDownloadFinish(TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR);
                                                    }
                                                    TbsLog.i(TbsDownloader.LOGTAG, "------freeDownloadFileLock...");
                                                    FileUtil.a(fileLockA, fileOutputStreamB);
                                                } else {
                                                    int currentDownloadInterruptCode = TbsDownloadConfig.getInstance(TbsDownloader.c).getCurrentDownloadInterruptCode();
                                                    TbsLog.i(TbsDownloader.LOGTAG, "No need to download, code is " + currentDownloadInterruptCode);
                                                    QbSdk.n.onDownloadFinish(currentDownloadInterruptCode);
                                                }
                                                QbSdk.n.onInstallFinish(243);
                                                TbsLog.i(TbsDownloader.LOGTAG, "------freeDownloadFileLock...");
                                                FileUtil.a(fileLockA, fileOutputStreamB);
                                            } else {
                                                TbsLog.i(TbsDownloader.LOGTAG, "download file-lock locked, core is downloading");
                                                tbsDownloadConfig.setDownloadInterruptCode(-203);
                                                FileUtil.a(fileOutputStreamB);
                                                if (QbSdk.c() == null) {
                                                    QbSdk.n.onDownloadFinish(TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING);
                                                    QbSdk.n.onInstallFinish(243);
                                                } else {
                                                    TbsDownloader.a(TbsDownloader.c, new Runnable() { // from class: com.tencent.smtt.sdk.TbsDownloader.1.1
                                                        @Override // java.lang.Runnable
                                                        public void run() {
                                                            QbSdk.n.onDownloadFinish(TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING);
                                                            QbSdk.n.onInstallFinish(243);
                                                        }
                                                    });
                                                }
                                            }
                                        }
                                    } else {
                                        TbsLog.i(TbsDownloader.LOGTAG, "not wifi,no need send request");
                                        tbsDownloadConfig.setDownloadInterruptCode(-220);
                                        QbSdk.n.onDownloadFinish(111);
                                        QbSdk.n.onInstallFinish(243);
                                    }
                                    break;
                                case 102:
                                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsDownloader.handleMessage] MSG_REPORT_DOWNLOAD_STAT");
                                    int iK = m.a().k(TbsDownloader.c);
                                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsDownloader.handleMessage] localTbsVersion=" + iK);
                                    TbsDownloader.g.b(iK);
                                    TbsLogReport.getInstance(TbsDownloader.c).dailyReport();
                                    break;
                                case 103:
                                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsDownloader.handleMessage] MSG_CONTINUEINSTALL_TBSCORE");
                                    if (message.arg1 == 0) {
                                        m.a().a((Context) message.obj, true);
                                    }
                                    break;
                            }
                        }
                    };
                } catch (Exception e2) {
                    j = true;
                    TbsLog.e(LOGTAG, "TbsApkDownloader init has Exception, " + Log.getStackTraceString(e2));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static boolean d() {
        try {
            return TbsDownloadConfig.getInstance(c).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_LAST_THIRDAPP_SENDREQUEST_COREVERSION, "").equals(e().toString());
        } catch (Exception unused) {
            return false;
        }
    }

    private static JSONArray e() {
        if (!TbsShareManager.isThirdPartyApp(c)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int tbsVersion = QbSdk.getTbsVersion(c);
        if (tbsVersion > 0) {
            jSONArray.put(tbsVersion);
        }
        return jSONArray;
    }

    private static boolean f() {
        int i2;
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(c);
        if (tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_SUCCESS_RETRYTIMES, 0) >= tbsDownloadConfig.getDownloadSuccessMaxRetrytimes()) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] out of success retrytimes", true);
            i2 = -115;
        } else if (tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_FAILED_RETRYTIMES, 0) >= tbsDownloadConfig.getDownloadFailedMaxRetrytimes()) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] out of failed retrytimes", true);
            i2 = -116;
        } else {
            if (FileUtil.b(c)) {
                if (System.currentTimeMillis() - tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOAD_STARTTIME, 0L) <= 86400000) {
                    long j2 = tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOAD_FLOW, 0L);
                    TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] downloadFlow=" + j2);
                    if (j2 >= tbsDownloadConfig.getDownloadMaxflow()) {
                        TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] failed because you exceeded max flow!", true);
                        i2 = -120;
                    }
                }
                return true;
            }
            TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] local rom freespace limit", true);
            i2 = -117;
        }
        tbsDownloadConfig.setDownloadInterruptCode(i2);
        return false;
    }

    private static void g() {
        File fileO = m.o(c);
        if (fileO == null) {
            return;
        }
        File[] fileArrListFiles = fileO.listFiles();
        Pattern patternCompile = Pattern.compile("tbs_switch_disable_(.*)");
        for (File file : fileArrListFiles) {
            if (patternCompile.matcher(file.getName()).find() && file.isFile() && file.exists() && file.canRead()) {
                TbsLog.i(LOGTAG, "clearTbsCoreDisableFlagFiles: " + file.getName() + "; res: " + file.delete());
            }
        }
    }

    public static String getBackupFileName(boolean z) {
        return getBackupFileName(z, 0);
    }

    public static int getCoreShareDecoupleCoreVersion() {
        return m.a().f(c);
    }

    public static int getCoreShareDecoupleCoreVersionByContext(Context context) {
        return m.a().f(context);
    }

    public static int getNextPostInterval(Context context) {
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
        long j2 = tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_LAST_CHECK, 0L);
        return Math.max((int) (((tbsDownloadConfig.getRetryInterval() * 1000) - (System.currentTimeMillis() - j2)) / 1000), 0);
    }

    public static synchronized boolean getOverSea(Context context) {
        try {
            if (!n) {
                n = true;
                TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
                if (tbsDownloadConfig.mPreferences.contains(TbsDownloadConfig.TbsConfigKey.KEY_IS_OVERSEA)) {
                    m = tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_IS_OVERSEA, false);
                    TbsLog.i(LOGTAG, "[TbsDownloader.getOverSea]  first called. sOverSea = " + m);
                }
                TbsLog.i(LOGTAG, "[TbsDownloader.getOverSea]  sOverSea = " + m);
            }
        } catch (Throwable th) {
            throw th;
        }
        return m;
    }

    public static long getRetryIntervalInSeconds() {
        return u;
    }

    public static HandlerThread getsTbsHandlerThread() {
        return h;
    }

    private static void h() {
        File file = new File(m.o(c), "switch_disable_check");
        if (file.exists()) {
            return;
        }
        try {
            TbsLog.i(LOGTAG, "addSwitchDisableCheckFlag status: " + file.createNewFile());
        } catch (IOException e2) {
            TbsLog.i(LOGTAG, "" + e2);
        }
    }

    private static void i() {
        Handler handler = d;
        if (handler != null) {
            handler.obtainMessage(110).sendToTarget();
        }
    }

    public static boolean isDownloadForeground() {
        k kVar = g;
        return kVar != null && kVar.c();
    }

    public static synchronized boolean isDownloading() {
        TbsLog.i(LOGTAG, "[TbsDownloader.isDownloading] is " + a);
        return a;
    }

    public static boolean isTbsCoreDisabledBySwitch(Context context, int i2) {
        return new File(m.o(context), O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i2, "tbs_switch_disable_")).exists();
    }

    public static boolean needDownload(Context context, boolean z) {
        return needDownload(context, z, false, true, null);
    }

    public static boolean needDownloadDecoupleCore() {
        int i2;
        if (TbsShareManager.isThirdPartyApp(c) || a(c)) {
            return false;
        }
        return System.currentTimeMillis() - TbsDownloadConfig.getInstance(c).mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_LAST_DOWNLOAD_DECOUPLE_CORE, 0L) >= TbsDownloadConfig.getInstance(c).getRetryInterval() * 1000 && (i2 = TbsDownloadConfig.getInstance(c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, 0)) > 0 && i2 != m.a().f(c) && TbsDownloadConfig.getInstance(c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0) != i2;
    }

    public static void pauseDownload() {
        TbsLog.i(LOGTAG, "called pauseDownload,downloader=" + g);
        k kVar = g;
        if (kVar != null) {
            kVar.d();
        }
    }

    public static void resumeDownload() {
        TbsLog.i(LOGTAG, "called resumeDownload,downloader=" + g);
        Handler handler = d;
        if (handler != null) {
            handler.removeMessages(109);
            d.sendEmptyMessage(109);
        }
    }

    public static void setAppContext(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        c = context.getApplicationContext();
    }

    public static void setRetryIntervalInSeconds(Context context, long j2) {
        if (context == null) {
            return;
        }
        if (context.getApplicationInfo().packageName.equals("com.tencent.qqlive")) {
            u = j2;
        }
        TbsLog.i(LOGTAG, "mRetryIntervalInSeconds is " + u);
    }

    @Deprecated
    public static boolean startDecoupleCoreIfNeeded() {
        return false;
    }

    public static void startDownload(Context context) {
        startDownload(context, false);
    }

    public static void stopDownload() {
        if (j) {
            return;
        }
        TbsLog.i(LOGTAG, "[TbsDownloader.stopDownload]");
        k kVar = g;
        if (kVar != null) {
            kVar.a();
        }
        Handler handler = d;
        if (handler != null) {
            handler.removeMessages(100);
            d.removeMessages(101);
            d.removeMessages(108);
        }
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    public static String b(Context context) {
        String lowerCase;
        String str;
        String strReplaceAll;
        String strA;
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        Locale locale = Locale.getDefault();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = Build.VERSION.RELEASE;
        try {
            str2 = new String(str2.getBytes("UTF-8"), "ISO8859-1");
        } catch (Exception unused) {
        }
        if (str2 != null && str2.length() > 0) {
            stringBuffer.append(str2);
        } else {
            stringBuffer.append("1.0");
        }
        stringBuffer.append("; ");
        String language = locale.getLanguage();
        if (language != null) {
            stringBuffer.append(language.toLowerCase());
            String country = locale.getCountry();
            if (country != null) {
                stringBuffer.append("-");
                lowerCase = country.toLowerCase();
            }
            if ("REL".equals(Build.VERSION.CODENAME)) {
                strA = com.tencent.smtt.utils.s.a(context);
                try {
                    strA = new String(strA.getBytes("UTF-8"), "ISO8859-1");
                } catch (Exception unused2) {
                }
                if (strA == null) {
                    stringBuffer.append("; ");
                } else if (strA.length() > 0) {
                    stringBuffer.append("; ");
                    stringBuffer.append(strA);
                }
            }
            str = Build.ID;
            if (str == null) {
                str = "";
            }
            strReplaceAll = str.replaceAll("[一-龥]", "");
            if (strReplaceAll == null) {
                if (strReplaceAll.length() > 0) {
                    stringBuffer.append(" Build/");
                }
                String str3 = "Mozilla/5.0 (Linux; U; Android " + ((Object) stringBuffer) + ") AppleWebKit/533.1 (KHTML, like Gecko)Version/4.0 Mobile Safari/533.1";
                b = str3;
                return str3;
            }
            strReplaceAll = " Build/00";
            stringBuffer.append(strReplaceAll);
            String str4 = "Mozilla/5.0 (Linux; U; Android " + ((Object) stringBuffer) + ") AppleWebKit/533.1 (KHTML, like Gecko)Version/4.0 Mobile Safari/533.1";
            b = str4;
            return str4;
        }
        lowerCase = "en";
        stringBuffer.append(lowerCase);
        if ("REL".equals(Build.VERSION.CODENAME)) {
            strA = com.tencent.smtt.utils.s.a(context);
            strA = new String(strA.getBytes("UTF-8"), "ISO8859-1");
            if (strA == null) {
                stringBuffer.append("; ");
            } else if (strA.length() > 0) {
                stringBuffer.append("; ");
                stringBuffer.append(strA);
            }
        }
        str = Build.ID;
        if (str == null) {
            str = "";
        }
        strReplaceAll = str.replaceAll("[一-龥]", "");
        if (strReplaceAll == null) {
            if (strReplaceAll.length() > 0) {
                stringBuffer.append(" Build/");
            }
            String str5 = "Mozilla/5.0 (Linux; U; Android " + ((Object) stringBuffer) + ") AppleWebKit/533.1 (KHTML, like Gecko)Version/4.0 Mobile Safari/533.1";
            b = str5;
            return str5;
        }
        strReplaceAll = " Build/00";
        stringBuffer.append(strReplaceAll);
        String str6 = "Mozilla/5.0 (Linux; U; Android " + ((Object) stringBuffer) + ") AppleWebKit/533.1 (KHTML, like Gecko)Version/4.0 Mobile Safari/533.1";
        b = str6;
        return str6;
    }

    @TargetApi(11)
    public static void c(Context context) {
        TbsDownloadConfig.getInstance(context).clear();
        TbsLogReport.getInstance(context).clear();
        k.b(context);
        context.getSharedPreferences("tbs_extension_config", 4).edit().clear().commit();
        context.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4).edit().clear().commit();
    }

    public static String getBackupFileName(boolean z, int i2) {
        boolean zC;
        if (i2 == 64) {
            zC = true;
        } else {
            zC = i2 == 32 ? false : com.tencent.smtt.utils.b.c();
        }
        if (z) {
            return zC ? "x5.tbs.decouple.64" : "x5.tbs.decouple";
        }
        return zC ? "x5.tbs.org.64" : "x5.tbs.org";
    }

    public static boolean needDownload(Context context, boolean z, boolean z2, TbsDownloaderCallback tbsDownloaderCallback) {
        return needDownload(context, z, z2, true, tbsDownloaderCallback);
    }

    public static synchronized void startDownload(Context context, boolean z) {
        if (TbsShareManager.isThirdPartyApp(context)) {
            int i2 = i + 1;
            i = i2;
            if (i2 > 1) {
                TbsLog.w(LOGTAG, "[Warning] for privacy security, TBS Only allow startDownload 1 times each process");
                QbSdk.n.onDownloadFinish(127);
                return;
            }
        }
        if (QbSdk.d()) {
            TbsLog.w(LOGTAG, "[warning] using private CDN mode, default downloader can not startDownload.");
            QbSdk.n.onDownloadFinish(135);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        c = applicationContext;
        TbsLog.initIfNeed(applicationContext);
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(c);
        tbsDownloadConfig.setDownloadInterruptCode(-200);
        TbsLog.i(LOGTAG, "[TbsDownloader.startDownload] sAppContext=" + c);
        if (m.a) {
            tbsDownloadConfig.setDownloadInterruptCode(-130);
            QbSdk.n.onDownloadFinish(TbsListener.ErrorCode.NEEDDOWNLOAD_STATIC_INSTALLING);
            return;
        }
        m.a().b(context, f.a == 0);
        int iB = m.a().b(context);
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],renameRet=" + iB);
        if (iB < 0) {
            tbsDownloadConfig.setDownloadInterruptCode(-128);
            QbSdk.n.onDownloadFinish(TbsListener.ErrorCode.NEEDDOWNLOAD_TMPCORE_PREPARING);
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],needReNameFile=" + iB);
            return;
        }
        a = true;
        c();
        if (j) {
            tbsDownloadConfig.setDownloadInterruptCode(-202);
            QbSdk.n.onDownloadFinish(121);
            return;
        }
        if (z) {
            stopDownload();
        }
        d.removeMessages(101);
        d.removeMessages(100);
        Message messageObtain = Message.obtain(d, 101, QbSdk.n);
        messageObtain.arg1 = z ? 1 : 0;
        messageObtain.sendToTarget();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0116  */
    private static JSONObject a(boolean z, boolean z2, boolean z3) {
        int i2;
        int iK;
        int i3;
        int i4;
        Object objA;
        TbsLog.i(LOGTAG, "[TbsDownloader.postJsonData]isQuery: " + z + " forDecoupleCore is " + z3);
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(c);
        Object objB = b(c);
        String strE = com.tencent.smtt.utils.b.e(c);
        String strD = com.tencent.smtt.utils.b.d(c);
        String strG = com.tencent.smtt.utils.b.g(c);
        Object id = TimeZone.getDefault().getID();
        Object obj = id != null ? id : "";
        try {
            if (((TelephonyManager) c.getSystemService("phone")) != null) {
                id = "cn";
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (id == null) {
            id = "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (l.a(c).c("tpatch_num") >= 5) {
                jSONObject.put("REQUEST_TPATCH", 0);
            } else if (TbsShareManager.isThirdPartyApp(c)) {
                jSONObject.put("REQUEST_TPATCH", 2);
            } else {
                jSONObject.put("REQUEST_TPATCH", 1);
            }
            jSONObject.put("TIMEZONEID", obj);
            jSONObject.put("COUNTRYISO", id);
            if (com.tencent.smtt.utils.b.c()) {
                i2 = 1;
                jSONObject.put("REQUEST_64", 1);
            } else {
                i2 = 1;
            }
            jSONObject.put("PROTOCOLVERSION", i2);
            if (TbsShareManager.isThirdPartyApp(c)) {
                iK = m.a().k(c);
            } else {
                int iG = z3 ? m.a().g(c) : m.a().k(c);
                if (iG == 0 && m.a().j(c)) {
                    if (TbsConfig.APP_QQ.equals(c.getApplicationInfo().packageName)) {
                        TbsPVConfig.releaseInstance();
                        if (TbsPVConfig.getInstance(c).getLocalCoreVersionMoreTimes() == 1) {
                            iG = m.a().g(c);
                        } else {
                            iG = -1;
                        }
                    } else {
                        iG = -1;
                    }
                }
                TbsLog.i(LOGTAG, "[TbsDownloader.postJsonData] tbsLocalVersion=" + iG + " isDownloadForeground=" + z2);
                if (z2 && !m.a().j(c)) {
                    iG = 0;
                }
                iK = iG;
            }
            if (z) {
                jSONObject.put("FUNCTION", 2);
            } else {
                jSONObject.put("FUNCTION", iK == 0 ? 0 : 1);
            }
            if (TbsShareManager.isThirdPartyApp(c)) {
                JSONArray jSONArrayE = e();
                jSONObject.put("TBSVLARR", jSONArrayE);
                k = jSONArrayE.toString();
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_LAST_THIRDAPP_SENDREQUEST_COREVERSION, jSONArrayE.toString());
                tbsDownloadConfig.commit();
                if (QbSdk.c) {
                    jSONObject.put("THIRDREQ", 1);
                }
            }
            jSONObject.put("APPN", c.getPackageName());
            jSONObject.put("APPVN", a(tbsDownloadConfig.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONNAME, null)));
            jSONObject.put("APPVC", tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONCODE, 0));
            jSONObject.put("APPMETA", a(tbsDownloadConfig.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_APP_METADATA, null)));
            jSONObject.put("TBSSDKV", 44286);
            jSONObject.put("TBSV", iK);
            if (iK == 0) {
                jSONObject.put("ISFORCE", true);
            }
            l = "" + iK;
            jSONObject.put("DOWNLOADDECOUPLECORE", z3 ? 1 : 0);
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, Integer.valueOf(z3 ? 1 : 0));
            tbsDownloadConfig.commit();
            if (iK != 0) {
                jSONObject.put("TBSBACKUPV", 0);
            }
            jSONObject.put("CPU", e);
            jSONObject.put("UA", objB);
            jSONObject.put("IMSI", a(strE));
            jSONObject.put("IMEI", a(strD));
            jSONObject.put("ANDROID_ID", a(strG));
            jSONObject.put("GUID", com.tencent.smtt.utils.b.c(c));
            if (!TbsShareManager.isThirdPartyApp(c)) {
                if (iK != 0) {
                    jSONObject.put("STATUS", !QbSdk.a(c, iK) ? 1 : 0);
                } else {
                    jSONObject.put("STATUS", 0);
                }
                int iF = m.a().f(c);
                jSONObject.put("TBSDV", iK % 10000);
                jSONObject.put("TBSBACKUPV", iF);
            }
            boolean z4 = false;
            boolean z5 = TbsDownloadConfig.getInstance(c).mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_FULL_PACKAGE, false);
            if ((QbSdk.isEnableSensitiveApi() && (objA = QbSdk.a(c, "can_unlzma", (Bundle) null)) != null && (objA instanceof Boolean)) ? ((Boolean) objA).booleanValue() : false) {
                i3 = 1;
                z4 = !z5;
            } else {
                i3 = 1;
            }
            if (z4) {
                jSONObject.put("REQUEST_LZMA", i3);
            }
            if (getOverSea(c)) {
                i4 = 1;
                jSONObject.put("OVERSEA", 1);
            } else {
                i4 = 1;
            }
            if (z2) {
                jSONObject.put("DOWNLOAD_FOREGROUND", i4);
            }
        } catch (Exception unused) {
        }
        TbsLog.i(LOGTAG, "[TbsDownloader.postJsonData] jsonData=" + jSONObject.toString());
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(final boolean z, boolean z2, boolean z3, boolean z4) {
        String str;
        final TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(c);
        Map<String, Object> map = QbSdk.o;
        String str2 = LOGTAG;
        if (map != null && map.containsKey(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD) && QbSdk.o.get(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")) {
            TbsLog.i(LOGTAG, "[TbsDownloader.sendRequest] -- SET_SENDREQUEST_AND_UPLOAD is false");
            tbsDownloadConfig.setDownloadInterruptCode(-131);
            return false;
        }
        TbsLog.i(LOGTAG, "[TbsDownloader.sendRequest]isQuery: " + z + " forDecoupleCore is " + z3);
        if (m.a().c(c)) {
            TbsLog.i(LOGTAG, "[TbsDownloader.sendRequest] -- isTbsLocalInstalled!");
            tbsDownloadConfig.setDownloadInterruptCode(-132);
            return false;
        }
        if (e == null) {
            String strA = com.tencent.smtt.utils.b.a();
            e = strA;
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DEVICE_CPUABI, strA);
            tbsDownloadConfig.commit();
        }
        if (!TextUtils.isEmpty(e) && !com.tencent.smtt.utils.b.a(e)) {
            tbsDownloadConfig.setDownloadInterruptCode(PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT);
            TbsLog.i(LOGTAG, "TbsDownloader sendRequest cpu is invalid:" + e);
            return false;
        }
        tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONNAME, com.tencent.smtt.utils.b.a(c));
        tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONCODE, Integer.valueOf(com.tencent.smtt.utils.b.b(c)));
        tbsDownloadConfig.commit();
        JSONObject jSONObjectA = a(z, z2, z3);
        int iOptInt = jSONObjectA.optInt("TBSV", -1);
        if (iOptInt != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (TbsShareManager.isThirdPartyApp(c)) {
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_COUNT_REQUEST_FAIL_IN_24HOURS, Long.valueOf(jCurrentTimeMillis - tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_REQUEST_FAIL, 0L) < tbsDownloadConfig.getRetryInterval() * 1000 ? tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_COUNT_REQUEST_FAIL_IN_24HOURS, 0L) + 1 : 1L));
            }
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_REQUEST_FAIL, Long.valueOf(jCurrentTimeMillis));
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONNAME, com.tencent.smtt.utils.b.a(c));
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONCODE, Integer.valueOf(com.tencent.smtt.utils.b.b(c)));
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_APP_METADATA, com.tencent.smtt.utils.b.a(c, TBS_METADATA));
            tbsDownloadConfig.commit();
        } else {
            str2 = LOGTAG;
        }
        if (iOptInt != -1 || z3) {
            try {
                String strD = com.tencent.smtt.utils.o.a(c).d();
                str = str2;
                try {
                    TbsLog.i(str, "[TbsDownloader.sendRequest] postUrl=" + strD);
                    if (z) {
                        o = jSONObjectA;
                    } else {
                        p = jSONObjectA;
                    }
                    if (z) {
                        return true;
                    }
                    try {
                        String strA2 = com.tencent.smtt.utils.g.a(strD, jSONObjectA.toString().getBytes("utf-8"), new com.tencent.smtt.utils.g.a() { // from class: com.tencent.smtt.sdk.TbsDownloader.2
                            @Override // com.tencent.smtt.utils.g.a
                            public void a(int i2) {
                                TbsDownloadConfig tbsDownloadConfig2;
                                int i3;
                                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_LAST_CHECK, Long.valueOf(System.currentTimeMillis()));
                                tbsDownloadConfig.commit();
                                TbsLog.i(TbsDownloader.LOGTAG, "[TbsDownloader.sendRequest] httpResponseCode=" + i2);
                                if (TbsShareManager.isThirdPartyApp(TbsDownloader.c) && i2 == 200) {
                                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_LAST_REQUEST_SUCCESS, Long.valueOf(System.currentTimeMillis()));
                                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_REQUEST_FAIL, 0L);
                                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_COUNT_REQUEST_FAIL_IN_24HOURS, 0L);
                                    tbsDownloadConfig.commit();
                                }
                                if (i2 >= 300) {
                                    if (z) {
                                        tbsDownloadConfig2 = tbsDownloadConfig;
                                        i3 = PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED;
                                    } else {
                                        tbsDownloadConfig2 = tbsDownloadConfig;
                                        i3 = -207;
                                    }
                                    tbsDownloadConfig2.setDownloadInterruptCode(i3);
                                }
                            }
                        }, false);
                        if (!TextUtils.isEmpty(strA2) && strA2.contains("HttpError")) {
                            TbsLog.i(str, "Cfg Request error: ".concat(strA2));
                            TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(c).tbsLogInfo();
                            tbsLogInfo.setErrorCode(-129);
                            tbsLogInfo.setFailDetail(strA2);
                            TbsLogReport.getInstance(c).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, tbsLogInfo);
                        }
                        return a(strA2, iOptInt, z, z2, z4);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                str = str2;
            }
            TbsLog.i(str, "sendrequest return false " + Log.getStackTraceString(th));
            th.printStackTrace();
            tbsDownloadConfig.setDownloadInterruptCode(PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        } else {
            tbsDownloadConfig.setDownloadInterruptCode(-113);
        }
        return false;
    }

    public static boolean needDownload(Context context, boolean z, boolean z2, boolean z3, TbsDownloaderCallback tbsDownloaderCallback) {
        int i2;
        TbsShareManager.mHasQueried = true;
        Context applicationContext = context.getApplicationContext();
        c = applicationContext;
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(applicationContext);
        tbsDownloadConfig.setDownloadInterruptCode(-100);
        TbsLog.initIfNeed(context);
        TbsLog.i(LOGTAG, "needDownload,process=" + QbSdk.getCurrentProcessName(context) + "stack=" + Log.getStackTraceString(new Throwable()));
        m.a().b(context, f.a == 0);
        int iB = m.a().b(context);
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],renameRet=" + iB);
        if (iB != 0) {
            TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(context).tbsLogInfo();
            tbsLogInfo.a = 129;
            tbsLogInfo.setFailDetail("code=2" + iB);
        }
        if (iB < 0) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],needReNameFile=" + iB);
            tbsDownloadConfig.setDownloadInterruptCode(-128);
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            return false;
        }
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload] oversea=" + z + ",isDownloadForeground=" + z2);
        if (m.a) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#1 Static Installing, return false");
            tbsDownloadConfig.setDownloadInterruptCode(-130);
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            return false;
        }
        if (!a(c, z)) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#2 Not shouldDoNeedDownload, return false");
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            return false;
        }
        c();
        if (j) {
            tbsDownloadConfig.setDownloadInterruptCode(PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED);
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#3 TbsApkDownloader init Exception, return false");
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            return false;
        }
        boolean zA = a(c, z2, false);
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],needSendRequest=" + zA);
        if (zA) {
            a(z2, tbsDownloaderCallback, z3);
            i2 = -114;
        } else {
            i2 = TbsCommonCode.DOWNLOAD_NO_NEED_REQUEST;
        }
        tbsDownloadConfig.setDownloadInterruptCode(i2);
        d.removeMessages(102);
        Message.obtain(d, 102).sendToTarget();
        boolean zContains = tbsDownloadConfig.mPreferences.contains(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD);
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload] hasNeedDownloadKey=" + zContains);
        boolean z4 = (zContains || TbsShareManager.isThirdPartyApp(context)) ? tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, false) : true;
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#4,needDownload=" + z4 + ",hasNeedDownloadKey=" + zContains);
        if (!z4) {
            int iK = m.a().k(c);
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#7,tbsLocalVersion=" + iK + ",needSendRequest=" + zA);
            if (zA || iK <= 0) {
                d.removeMessages(103);
                if (iK <= 0 && !zA) {
                    Message.obtain(d, 103, 0, 0, c).sendToTarget();
                }
            }
        } else if (f()) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload] NEEDDOWNLOAD_WILL_STARTDOWNLOAD");
        } else {
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#5,set needDownload = false");
            z4 = false;
        }
        if (!zA && tbsDownloaderCallback != null) {
            tbsDownloaderCallback.onNeedDownloadFinish(z4, 0);
        }
        i();
        return z4;
    }

    private static void a(int i2) {
        File file = new File(m.o(c), O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i2, "tbs_switch_disable_"));
        if (file.exists()) {
            return;
        }
        try {
            TbsLog.i(LOGTAG, "setTbsCoreDisabledBySwitch status: " + file.createNewFile());
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static void a(final Context context, final Runnable runnable) {
        Thread thread = new Thread() { // from class: com.tencent.smtt.sdk.TbsDownloader.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws Throwable {
                FileOutputStream fileOutputStreamB;
                final FileChannel channel;
                FileLock fileLockLock = null;
                try {
                    final Timer timerC = QbSdk.c();
                    fileOutputStreamB = FileUtil.b(context, true, "tbs_download_lock_file");
                    if (fileOutputStreamB == null || timerC == null) {
                        channel = null;
                    } else {
                        try {
                            channel = fileOutputStreamB.getChannel();
                            try {
                                try {
                                    new java.util.Timer().schedule(new TimerTask() { // from class: com.tencent.smtt.sdk.TbsDownloader.3.1
                                        @Override // java.util.TimerTask, java.lang.Runnable
                                        public void run() {
                                            FileChannel fileChannel = channel;
                                            if (fileChannel == null || !fileChannel.isOpen()) {
                                                return;
                                            }
                                            try {
                                                channel.close();
                                                timerC.onTimeOut();
                                                TbsLog.i(TbsDownloader.LOGTAG, "wait download process lock timeout");
                                            } catch (IOException e2) {
                                                e2.printStackTrace();
                                            }
                                        }
                                    }, timerC.timeOut);
                                    TbsLog.i(TbsDownloader.LOGTAG, "start waiting other process Download finished");
                                    fileLockLock = channel.lock();
                                    TbsLog.i(TbsDownloader.LOGTAG, "wait lock success");
                                } catch (Throwable th) {
                                    th = th;
                                    FileUtil.a(fileLockLock, fileOutputStreamB);
                                    TbsLog.i(TbsDownloader.LOGTAG, "release wait download lock");
                                    FileUtil.a(channel);
                                    FileUtil.a(fileOutputStreamB);
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                TbsLog.w(TbsDownloader.LOGTAG, "MultiProcessSyncInit exception: " + Log.getStackTraceString(e));
                            }
                        } catch (Exception e3) {
                            e = e3;
                            channel = null;
                        } catch (Throwable th2) {
                            th = th2;
                            channel = null;
                            FileUtil.a(fileLockLock, fileOutputStreamB);
                            TbsLog.i(TbsDownloader.LOGTAG, "release wait download lock");
                            FileUtil.a(channel);
                            FileUtil.a(fileOutputStreamB);
                            throw th;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    fileOutputStreamB = null;
                    channel = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStreamB = null;
                    channel = null;
                }
                FileUtil.a(fileLockLock, fileOutputStreamB);
                TbsLog.i(TbsDownloader.LOGTAG, "release wait download lock");
                FileUtil.a(channel);
                FileUtil.a(fileOutputStreamB);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        thread.setName("tbsSyncWaiter");
        thread.start();
    }

    private static void a(boolean z, TbsDownloaderCallback tbsDownloaderCallback, boolean z2) {
        TbsLog.i(LOGTAG, "[TbsDownloader.queryConfig]");
        d.removeMessages(100);
        Message messageObtain = Message.obtain(d, 100);
        if (tbsDownloaderCallback != null) {
            messageObtain.obj = tbsDownloaderCallback;
        }
        messageObtain.arg1 = z ? 1 : 0;
        messageObtain.arg2 = z2 ? 1 : 0;
        messageObtain.sendToTarget();
    }

    public static boolean a(Context context) {
        return TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, 0) == 1;
    }

    public static boolean a(Context context, int i2) {
        return Build.VERSION.SDK_INT > 28 && context.getApplicationInfo().targetSdkVersion > 28 && i2 > 0 && i2 < 45114;
    }

    private static boolean a(Context context, boolean z) {
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
        String string = tbsDownloadConfig.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_DEVICE_CPUABI, null);
        e = string;
        if (TextUtils.isEmpty(string) || com.tencent.smtt.utils.b.a(e)) {
            return true;
        }
        TbsLog.e(LOGTAG, "can not support x86 devices!!");
        tbsDownloadConfig.setDownloadInterruptCode(PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0209  */
    private static boolean a(Context context, boolean z, boolean z2) {
        StringBuilder sb;
        String string;
        String string2;
        boolean z3;
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
        if (!z) {
            String string3 = tbsDownloadConfig.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONNAME, null);
            int i2 = tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONCODE, 0);
            String string4 = tbsDownloadConfig.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_APP_METADATA, null);
            String strA = com.tencent.smtt.utils.b.a(c);
            int iB = com.tencent.smtt.utils.b.b(c);
            String strA2 = com.tencent.smtt.utils.b.a(c, TBS_METADATA);
            TbsLog.i(LOGTAG, "[TbsDownloader.needSendQueryRequest] appVersionName=" + strA + " oldAppVersionName=" + string3 + " appVersionCode=" + iB + " oldAppVersionCode=" + i2 + " appMetadata=" + strA2 + " oldAppVersionMetadata=" + string4);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_LAST_CHECK, 0L);
            StringBuilder sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(j2, "[TbsDownloader.needSendQueryRequest] timeLastCheck=", " timeNow=");
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(jCurrentTimeMillis);
            TbsLog.i(LOGTAG, sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.toString());
            if (z2) {
                boolean zContains = tbsDownloadConfig.mPreferences.contains(TbsDownloadConfig.TbsConfigKey.KEY_LAST_CHECK);
                TbsLog.i(LOGTAG, "[TbsDownloader.needSendQueryRequest] hasLaskCheckKey=" + zContains);
                if (zContains && j2 == 0) {
                    j2 = jCurrentTimeMillis;
                }
            }
            long j3 = tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_LAST_REQUEST_SUCCESS, 0L);
            long j4 = tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_COUNT_REQUEST_FAIL_IN_24HOURS, 0L);
            long retryInterval = tbsDownloadConfig.getRetryInterval();
            TbsLog.i(LOGTAG, "retryInterval = " + retryInterval + " s");
            TbsPVConfig.releaseInstance();
            int emergentCoreVersion = TbsPVConfig.getInstance(c).getEmergentCoreVersion();
            int i3 = TbsDownloadConfig.getInstance(c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0);
            long j5 = jCurrentTimeMillis - j2;
            long j6 = retryInterval * 1000;
            if (j5 <= j6) {
                if (emergentCoreVersion > m.a().g(c) && emergentCoreVersion > i3) {
                    sb = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(emergentCoreVersion, "emergentCoreVersion is ", " getTbsCoreInstalledVerInNolock is ");
                    sb.append(m.a().g(c));
                    sb.append(" responseCoreVersion is ");
                    sb.append(i3);
                } else if (TbsShareManager.isThirdPartyApp(c) && j3 > 0 && jCurrentTimeMillis - j3 > j6 && j4 < 11) {
                    string = "needSendRequest  true  #3";
                } else if (TbsShareManager.isThirdPartyApp(c) && QbSdk.getTbsVersion(c) == 0 && !d()) {
                    TbsLog.i(LOGTAG, "needSendRequest  true  #4");
                    m.a().d(c);
                    z3 = true;
                    string2 = null;
                } else {
                    if (strA != null && iB != 0 && strA2 != null) {
                        if (!strA.equals(string3) || iB != i2 || !strA2.equals(string4)) {
                            string = "needSendRequest  true  #5";
                        }
                        string2 = null;
                    } else if (TbsShareManager.isThirdPartyApp(c)) {
                        StringBuilder sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(j5, "timeNow - timeLastCheck is ", " sendRequestWithSameHostCoreVersion() is ");
                        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.append(d());
                        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.append(" appVersionName is ");
                        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.append(strA);
                        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.append(" appVersionCode is ");
                        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.append(iB);
                        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.append(" appMetadata is ");
                        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.append(strA2);
                        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.append(" oldAppVersionName is ");
                        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.append(string3);
                        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.append(" oldAppVersionCode is ");
                        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.append(i2);
                        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.append(" oldAppVersionMetadata is ");
                        sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.append(string4);
                        string2 = sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.toString();
                        z3 = false;
                    }
                    z3 = false;
                    string2 = null;
                }
                if (!z3 && TbsShareManager.isThirdPartyApp(c)) {
                    TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(c).tbsLogInfo();
                    tbsLogInfo.setErrorCode(-119);
                    tbsLogInfo.setFailDetail(string2);
                    TbsLogReport.getInstance(c).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, tbsLogInfo);
                }
                return z3;
            }
            string = "needSendRequest  true  #1";
            TbsLog.i(LOGTAG, string);
            z3 = true;
            string2 = null;
            if (!z3) {
                TbsLogReport.TbsLogInfo tbsLogInfo2 = TbsLogReport.getInstance(c).tbsLogInfo();
                tbsLogInfo2.setErrorCode(-119);
                tbsLogInfo2.setFailDetail(string2);
                TbsLogReport.getInstance(c).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, tbsLogInfo2);
            }
            return z3;
        }
        sb = new StringBuilder("needSendRequest true download foreground, stack: ");
        sb.append(Log.getStackTraceString(new Throwable()));
        string = sb.toString();
        TbsLog.i(LOGTAG, string);
        z3 = true;
        string2 = null;
        if (!z3) {
            TbsLogReport.TbsLogInfo tbsLogInfo3 = TbsLogReport.getInstance(c).tbsLogInfo();
            tbsLogInfo3.setErrorCode(-119);
            tbsLogInfo3.setFailDetail(string2);
            TbsLogReport.getInstance(c).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, tbsLogInfo3);
        }
        return z3;
    }

    @TargetApi(11)
    private static boolean a(String str, int i2, boolean z, boolean z2, boolean z3) throws JSONException {
        boolean z4;
        Integer num;
        String str2;
        String str3;
        int tbsVersion;
        TbsLog.i(LOGTAG, "[TbsDownloader.readResponse] response=" + str + ";isNeedInstall=" + z3);
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(c);
        if (TextUtils.isEmpty(str)) {
            tbsDownloadConfig.setDownloadInterruptCode(PlaybackException.ERROR_CODE_SETUP_REQUIRED);
            TbsLog.i(LOGTAG, "[TbsDownloader.readResponse] return #1,response is empty...");
            return false;
        }
        JSONObject jSONObject = new JSONObject(str);
        int i3 = jSONObject.getInt("RET");
        if (i3 != 0) {
            tbsDownloadConfig.setDownloadInterruptCode(PlaybackException.ERROR_CODE_END_OF_PLAYLIST);
            TbsLog.i(LOGTAG, "[TbsDownloader.readResponse] return #2,returnCode=" + i3);
            return false;
        }
        int i4 = jSONObject.getInt("RESPONSECODE");
        String string = jSONObject.getString("DOWNLOADURL");
        String strOptString = jSONObject.optString("URLLIST", "");
        int i5 = jSONObject.getInt("TBSAPKSERVERVERSION");
        if (QbSdk.b(c, i5)) {
            tbsDownloadConfig.setDownloadInterruptCode(-126);
            return false;
        }
        int i6 = jSONObject.getInt("DOWNLOADMAXFLOW") * 2;
        int i7 = jSONObject.getInt("DOWNLOAD_MIN_FREE_SPACE");
        int i8 = jSONObject.getInt("DOWNLOAD_SUCCESS_MAX_RETRYTIMES");
        int i9 = jSONObject.getInt("DOWNLOAD_FAILED_MAX_RETRYTIMES");
        long j2 = jSONObject.getLong("DOWNLOAD_SINGLE_TIMEOUT");
        long j3 = jSONObject.getLong("TBSAPKFILESIZE");
        long jOptLong = jSONObject.optLong("RETRY_INTERVAL", 0L);
        int iOptInt = jSONObject.optInt("FLOWCTR", -1);
        int iOptInt2 = jSONObject.optInt("USEX5", 1);
        h();
        g();
        if (iOptInt2 == 0 && (tbsVersion = QbSdk.getTbsVersion(c)) != 0) {
            a(tbsVersion);
        }
        try {
            if (!TextUtils.isEmpty(string)) {
                string.contains("" + i5);
            }
        } catch (Throwable th) {
            TbsLog.i(LOGTAG, "throwable is " + Log.getStackTraceString(th));
        }
        int iOptInt3 = jSONObject.optInt("USEBBACKUPVER", 0);
        try {
            iOptInt3 = jSONObject.getInt("USEBBACKUPVER");
        } catch (Exception unused) {
        }
        tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_USE_BACKUP_VERSION, Integer.valueOf(iOptInt3));
        String strOptString2 = jSONObject.optString("PKGMD5", null);
        int iOptInt4 = jSONObject.optInt("RESETX5", 0);
        jSONObject.optInt("UPLOADLOG", 0);
        jSONObject.optInt("RESETDECOUPLECORE", 0);
        String strOptString3 = jSONObject.optString("SETTOKEN", "");
        boolean z5 = jSONObject.optInt("RESETTOKEN", 0) != 0;
        boolean z6 = jSONObject.optInt("ENABLE_LOAD_RENAME_FILE_LOCK_WAIT", 1) != 0;
        int iOptInt5 = jSONObject.optInt("RESETTODECOUPLECORE", 0);
        synchronized (f) {
            if (z5) {
                try {
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DESkEY_TOKEN, "");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(strOptString3) && strOptString3.length() == 96) {
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DESkEY_TOKEN, strOptString3 + "&" + com.tencent.smtt.utils.h.c());
            }
        }
        if (iOptInt4 == 1) {
            tbsDownloadConfig.setDownloadInterruptCode(-110);
            QbSdk.reset(c, iOptInt5 == 1);
            str2 = LOGTAG;
            str3 = "[TbsDownloader.readResponse] return #3,needResetTbs=1,isQuery=" + z;
        } else {
            if (!z6) {
                tbsDownloadConfig.setTbsCoreLoadRenameFileLockWaitEnable(z6);
            }
            long retryIntervalInSeconds = TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC;
            if (iOptInt == 1) {
                if (jOptLong > 604800) {
                    jOptLong = 604800;
                }
                if (jOptLong > 0) {
                    retryIntervalInSeconds = jOptLong;
                }
                TbsLog.w(LOGTAG, "Download is Flowed, next download request is " + retryIntervalInSeconds + "s later");
                if (TbsShareManager.isThirdPartyApp(c)) {
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.FALSE);
                    tbsDownloadConfig.commit();
                    tbsDownloadConfig.setDownloadInterruptCode(TbsCommonCode.DOWNLOAD_FLOW_CANCEL);
                    return false;
                }
            }
            if (getRetryIntervalInSeconds() >= 0) {
                retryIntervalInSeconds = getRetryIntervalInSeconds();
            }
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_RETRY_INTERVAL, Long.valueOf(retryIntervalInSeconds));
            int i10 = -124;
            if (TextUtils.isEmpty(string) && TbsShareManager.isThirdPartyApp(c)) {
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.FALSE);
                tbsDownloadConfig.commit();
                tbsDownloadConfig.setDownloadInterruptCode(-124);
                str2 = LOGTAG;
                str3 = "[TbsDownloader.readResponse] blank url,current app is third app...";
            } else {
                TbsLog.i(LOGTAG, "in response responseCode is " + i4);
                if (i4 == 0) {
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, Integer.valueOf(i4));
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.FALSE);
                    tbsDownloadConfig.setDownloadInterruptCode(-111);
                    tbsDownloadConfig.commit();
                    TbsLog.i(LOGTAG, "[TbsDownloader.readResponse] return #5,responseCode=0");
                    return false;
                }
                int i11 = TbsDownloadConfig.getInstance(c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0);
                if (i11 > i5) {
                    g.b();
                    m.a().l(c);
                }
                if (TbsShareManager.isThirdPartyApp(c)) {
                    z4 = false;
                } else {
                    int iD = m.a().d(c, 0);
                    z4 = iD >= i5;
                    TbsLog.i(LOGTAG, "tmpCoreVersion is " + iD + " tbsDownloadVersion is" + i5);
                }
                if (i2 >= i5 || TextUtils.isEmpty(string) || z4) {
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.FALSE);
                    tbsDownloadConfig.commit();
                    if (!TextUtils.isEmpty(string)) {
                        if (i5 <= 0) {
                            i10 = -125;
                        } else {
                            i10 = i2 >= i5 ? -127 : -112;
                        }
                    }
                    tbsDownloadConfig.setDownloadInterruptCode(i10);
                    TbsLog.i(LOGTAG, "version error or downloadUrl empty ,return ahead tbsLocalVersion=" + i2 + " tbsDownloadVersion=" + i5 + " tbsLastDownloadVersion=" + i11 + " downloadUrl=" + string);
                    return false;
                }
                if (string.equals(tbsDownloadConfig.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOADURL, null))) {
                    num = 0;
                } else {
                    g.b();
                    num = 0;
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_FAILED_RETRYTIMES, null);
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_SUCCESS_RETRYTIMES, null);
                }
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, Integer.valueOf(i5));
                TbsLog.i(LOGTAG, "put KEY_TBS_DOWNLOAD_V is " + i5);
                if (i5 > 0) {
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V_TYPE, num);
                }
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOADURL, string);
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADURL_LIST, strOptString);
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, Integer.valueOf(i4));
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_MAXFLOW, Integer.valueOf(i6));
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_MIN_FREE_SPACE, Integer.valueOf(i7));
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_SUCCESS_MAX_RETRYTIMES, Integer.valueOf(i8));
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_FAILED_MAX_RETRYTIMES, Integer.valueOf(i9));
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_SINGLE_TIMEOUT, Long.valueOf(j2));
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_TBSAPKFILESIZE, Long.valueOf(j3));
                tbsDownloadConfig.commit();
                if (strOptString2 != 0) {
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_TBSAPK_MD5, strOptString2);
                }
                if (z2 || !z3 || !m.a().b(c, i5)) {
                    if (!z) {
                        tbsDownloadConfig.setDownloadInterruptCode(-216);
                    }
                    Map<String, Object> map = tbsDownloadConfig.mSyncMap;
                    Boolean bool = Boolean.TRUE;
                    map.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, bool);
                    TbsLog.i(LOGTAG, "[TbsDownloader.readResponse] ##9 set needDownload=true");
                    if (jSONObject.optInt("stop_pre_oat", 0) == 1) {
                        tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_STOP_PRE_OAT, bool);
                    }
                    tbsDownloadConfig.commit();
                    return true;
                }
                tbsDownloadConfig.setDownloadInterruptCode(-213);
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.FALSE);
                str2 = LOGTAG;
                str3 = "[TbsDownloader.readResponse] ##6 set needDownload=false";
            }
        }
        TbsLog.i(str2, str3);
        return false;
    }
}
