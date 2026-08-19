package com.tencent.smtt.sdk;

import O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class k {
    private static int d = 5;
    private static int e = 1;
    private static final String[] f = {"tbs_downloading_com.tencent.mtt", "tbs_downloading_com.tencent.mm", "tbs_downloading_com.tencent.mobileqq", "tbs_downloading_com.tencent.tbs", "tbs_downloading_com.qzone"};
    private boolean C;
    private Context g;
    private String h;
    private String i;
    private String j;
    private File k;
    private long l;
    private boolean o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private HttpURLConnection t;
    private String u;
    private final TbsLogReport.TbsLogInfo v;
    private String w;
    private int x;
    private boolean y;
    private Handler z;
    private boolean c = false;
    private int m = 30000;
    private int n = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
    private boolean A = false;
    private int B = d;
    String[] a = null;
    int b = 0;

    public k(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        this.v = TbsLogReport.getInstance(applicationContext).tbsLogInfo();
        this.u = "tbs_downloading_" + this.g.getPackageName();
        File fileO = m.o(this.g);
        this.k = fileO;
        if (fileO == null) {
            throw new NullPointerException("TbsCorePrivateDir is null!");
        }
        f();
        this.w = null;
        this.x = -1;
    }

    private long a(long j, long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.v.setDownConsumeTime(jCurrentTimeMillis - j);
        this.v.setDownloadSize(j2);
        return jCurrentTimeMillis;
    }

    private void c(boolean z) throws Throwable {
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(this.g);
        Map<String, Object> map = tbsDownloadConfig.mSyncMap;
        Boolean bool = Boolean.FALSE;
        map.put(TbsDownloadConfig.TbsConfigKey.KEY_FULL_PACKAGE, bool);
        tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, bool);
        tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_INTERRUPT_CODE_REASON, -123);
        tbsDownloadConfig.commit();
        this.v.a = 100;
        int i = tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, 0);
        TbsDownloader.a(this.g);
        if (i == 5 || i == 3) {
            Bundle bundleA = a(i);
            if (bundleA == null) {
                TbsLog.i(TbsDownloader.LOGTAG, "downloadSuccess RESPONSECODE_TPATCH bundle is null ");
            } else {
                TbsLog.i(TbsDownloader.LOGTAG, "downloadSuccess RESPONSECODE_TPATCH bundle is " + bundleA);
                m.a().b(this.g, bundleA);
            }
        } else if (i > 10000) {
            b();
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.TRUE);
            tbsDownloadConfig.commit();
        } else {
            m.a().a(this.g, new File(this.k, "x5.tbs").getAbsolutePath(), tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0));
        }
        a(this.g);
    }

    private void f() {
        this.p = 0;
        this.q = 0;
        this.l = -1L;
        this.j = null;
        this.o = false;
        this.r = false;
        this.s = false;
        this.y = false;
    }

    private void g() {
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.closeHttpRequest]");
        HttpURLConnection httpURLConnection = this.t;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                TbsLog.e(TbsDownloader.LOGTAG, "[closeHttpRequest] mHttpRequest.disconnect() Throwable:" + th.toString());
            }
            this.t = null;
        }
        int i = this.v.a;
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.closeHttpRequest] download finish code: " + i);
        if (!this.r && this.y) {
            h();
        } else if (!this.c) {
            TbsDownloader.a = false;
        }
        TbsDownloadConfig.getInstance(this.g).saveDownloadInterruptCode();
        QbSdk.n.onDownloadFinish(i);
    }

    private void h() {
        this.v.setEventTime(System.currentTimeMillis());
        String apnInfo = Apn.getApnInfo(this.g);
        if (apnInfo == null) {
            apnInfo = "";
        }
        int apnType = Apn.getApnType(this.g);
        this.v.setApn(apnInfo);
        this.v.setNetworkType(apnType);
        if (apnType != this.x || !apnInfo.equals(this.w)) {
            this.v.setNetworkChange(0);
        }
        TbsLogReport.TbsLogInfo tbsLogInfo = this.v;
        int i = tbsLogInfo.a;
        if ((i == 0 || i == 107) && tbsLogInfo.getDownFinalFlag() == 0 && (!Apn.isNetworkAvailable(this.g) || !l())) {
            a(101, null, true);
        }
        TbsLogReport.getInstance(this.g).eventReport(TbsLogReport.EventType.TYPE_CDN_DOWNLOAD_STAT, this.v);
        this.v.resetArgs();
    }

    private void i() {
        int apnType = Apn.getApnType(this.g);
        String apnInfo = Apn.getApnInfo(this.g);
        String str = this.w;
        if (str != null || this.x != -1) {
            if (apnType == this.x && apnInfo.equals(str)) {
                return;
            } else {
                this.v.setNetworkChange(0);
            }
        }
        this.w = apnInfo;
        this.x = apnType;
    }

    private boolean j() {
        return new File(this.k, "x5.tbs.temp").exists();
    }

    private long k() {
        File file = new File(this.k, "x5.tbs.temp");
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }

    private boolean l() {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable th;
        InputStream inputStream;
        boolean z = false;
        try {
            inputStream = Runtime.getRuntime().exec("ping www.qq.com").getInputStream();
            try {
                inputStreamReader = new InputStreamReader(inputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    int i = 0;
                    do {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.contains("TTL") || line.contains("ttl")) {
                                z = true;
                                break;
                            }
                            i++;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                            } finally {
                                a(inputStream);
                                a(inputStreamReader);
                                a(bufferedReader);
                            }
                        }
                    } while (i < 5);
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            inputStreamReader = null;
            bufferedReader = null;
            th = th5;
            inputStream = null;
        }
        return z;
    }

    private long m() {
        int i = this.p;
        if (i == 1 || i == 2) {
            return ((long) i) * 20000;
        }
        if (i == 3 || i == 4) {
            return SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
        }
        return 200000L;
    }

    private boolean n() {
        HttpURLConnection httpURLConnection;
        boolean z;
        boolean z2 = Apn.getApnType(this.g) == 3;
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDwonloader.detectWifiNetworkAvailable] isWifi=" + z2);
        if (z2) {
            try {
                httpURLConnection = (HttpURLConnection) new URL("https://pms.mb.qq.com/rsp204").openConnection();
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.getInputStream();
                    int responseCode = httpURLConnection.getResponseCode();
                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDwonloader.detectWifiNetworkAvailable] responseCode=" + responseCode);
                    z = responseCode == 204;
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused) {
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused2) {
                            }
                        }
                        z = false;
                    } catch (Throwable th2) {
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
            }
        } else {
            z = false;
        }
        if (z) {
            this.A = true;
        } else {
            this.A = false;
            this.z.sendMessageDelayed(this.z.obtainMessage(TbsListener.ErrorCode.STARTDOWNLOAD_API_LEVEL_BELOW_FROYO, null), 120000L);
        }
        return z;
    }

    public void b() {
        a();
        d(false);
        d(true);
    }

    public void d() {
        TbsLog.i(TbsDownloader.LOGTAG, "pauseDownload,isPause=" + this.c + "isDownloading=" + TbsDownloader.isDownloading());
        if (this.c || !TbsDownloader.isDownloading()) {
            return;
        }
        a();
        this.c = true;
        this.y = false;
    }

    public void e() {
        TbsLog.i(TbsDownloader.LOGTAG, "resumeDownload,isPause=" + this.c + "isDownloading=" + TbsDownloader.isDownloading());
        if (this.c && TbsDownloader.isDownloading()) {
            this.c = false;
            a(false);
        }
    }

    private boolean d(boolean z) {
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.deleteFile] isApk=" + z);
        File file = z ? new File(this.k, "x5.tbs") : new File(this.k, "x5.tbs.temp");
        if (!file.exists()) {
            return true;
        }
        FileUtil.b(file);
        return true;
    }

    public Bundle a(int i) {
        File fileN = m.a().n(this.g);
        int iG = m.a().g(this.g);
        File file = new File(this.k, "x5.tbs");
        String absolutePath = file.exists() ? file.getAbsolutePath() : null;
        if (absolutePath == null) {
            TbsLog.i(TbsDownloader.LOGTAG, "getTpatchBundle tbsApkFile is " + file.getAbsolutePath());
            return null;
        }
        int i2 = TbsDownloadConfig.getInstance(this.g).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0);
        File fileE = m.a().e(this.g, 5);
        Bundle bundle = new Bundle();
        bundle.putInt("operation", i);
        bundle.putInt("old_core_ver", iG);
        bundle.putInt("new_core_ver", i2);
        bundle.putString("old_apk_location", fileN.getAbsolutePath());
        bundle.putString("new_apk_location", fileE.getAbsolutePath());
        bundle.putString("diff_file_location", absolutePath);
        bundle.putString("core_type_tpatch", "not_stable");
        bundle.putInt("for_self_core", 1);
        return bundle;
    }

    public void b(int i) {
        if (m.a().p(this.g)) {
            m.a().c();
            try {
                File file = new File(this.k, "x5.tbs");
                int iA = com.tencent.smtt.utils.a.a(this.g, file);
                if (-1 == iA || (i > 0 && i == iA)) {
                    FileUtil.b(file);
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean c() {
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.isDownloadForeground] mIsDownloadForeground=" + this.C);
        return this.C;
    }

    private String a(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        return stackTraceString.length() > 1024 ? stackTraceString.substring(0, 1024) : stackTraceString;
    }

    public static void b(Context context) {
        try {
            m.a();
            File fileO = m.o(context);
            new File(fileO, "x5.tbs").delete();
            new File(fileO, "x5.tbs.temp").delete();
        } catch (Exception unused) {
        }
    }

    public void a() {
        this.r = true;
        if (TbsShareManager.isThirdPartyApp(this.g)) {
            TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(this.g).tbsLogInfo();
            tbsLogInfo.setErrorCode(-309);
            tbsLogInfo.setFailDetail(new Exception());
            TbsLogReport.getInstance(this.g).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, tbsLogInfo);
        }
    }

    public boolean b(boolean z) {
        String[] strArr;
        int i;
        if ((!z || n() || (QbSdk.canDownloadWithoutWifi() && Apn.isNetworkAvailable(this.g))) && (strArr = this.a) != null && (i = this.b) >= 0 && i < strArr.length) {
            this.b = i + 1;
            this.j = strArr[i];
            this.p = 0;
            this.q = 0;
            this.l = -1L;
            this.o = false;
            this.r = false;
            this.s = false;
            this.y = false;
            return true;
        }
        return false;
    }

    private void a(int i, String str, boolean z) {
        if (z || this.p > this.B) {
            this.v.setErrorCode(i);
            this.v.setFailDetail(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (r10 != r8) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(boolean foreground, boolean retry) throws Throwable {
        if (this.j == null || this.j.length() == 0) {
            a(-124, "download url is empty", true);
            return false;
        }
        File temp = new File(this.k, "x5.tbs.temp");
        long existing = temp.exists() ? temp.length() : 0L;
        long started = System.currentTimeMillis();
        HttpURLConnection conn = null;
        InputStream in = null;
        FileOutputStream out = null;
        try {
            i();
            a(this.j);
            conn = this.t;
            this.v.setDownloadUrl(this.j);
            if (existing > 0) conn.setRequestProperty("Range", "bytes=" + existing + "-");
            int code = conn.getResponseCode();
            this.v.setHttpCode(code);
            if (code == 301 || code == 302 || code == 303 || code == 307 || code == 308) {
                String location = conn.getHeaderField("Location");
                if (location != null && location.length() > 0) {
                    this.j = new URL(new URL(this.j), location).toString();
                    a(this.j);
                    conn = this.t;
                    if (existing > 0) conn.setRequestProperty("Range", "bytes=" + existing + "-");
                    code = conn.getResponseCode();
                    this.v.setHttpCode(code);
                }
            }
            if (code == 200 && existing > 0) {
                existing = 0L;
                if (temp.exists()) FileUtil.b(temp);
            }
            if (code != 200 && code != 206) {
                a(code, "HTTP " + code + " for " + this.j, true);
                return false;
            }
            long contentLength = conn.getContentLengthLong();
            long total = contentLength < 0 ? -1L : existing + contentLength;
            if (total > 0) this.v.setPkgSize(total);
            long minFree = TbsDownloadConfig.getInstance(this.g).getDownloadMinFreeSpace();
            if (minFree > 0 && this.k.getUsableSpace() < minFree) {
                a(-209, "not enough free space", true);
                return false;
            }
            in = new BufferedInputStream(conn.getInputStream());
            out = new FileOutputStream(temp, existing > 0 && code == 206);
            byte[] buf = new byte[8192];
            long downloaded = existing;
            int read;
            while ((read = in.read(buf)) != -1) {
                if (this.r || this.c) { this.s = true; return false; }
                out.write(buf, 0, read);
                downloaded += read;
                long now = System.currentTimeMillis();
                if (now - started >= 1000L) { this.v.setDownloadSize(downloaded); started = now; }
            }
            out.flush();
            long size = temp.length();
            if (contentLength >= 0 && size < total) {
                a(-206, "download incomplete: " + size + "/" + total, false);
                return false;
            }
            File target = new File(this.k, "x5.tbs");
            if (target.exists()) FileUtil.b(target);
            if (!temp.renameTo(target)) {
                java.nio.file.Files.move(temp.toPath(), target.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            }
            this.l = size;
            this.v.setDownloadSize(size);
            this.y = true;
            this.o = true;
            return true;
        } catch (Throwable th) {
            this.v.setFailDetail(a(th));
            a(-206, a(th), false);
            return false;
        } finally {
            a(in); a(out);
            if (conn != null) try { conn.disconnect(); } catch (Throwable ignored) {}
            this.t = null;
        }
    }

    private void a(long j) {
        this.p++;
        if (j <= 0) {
            try {
                j = m();
            } catch (Exception unused) {
                return;
            }
        }
        Thread.sleep(j);
    }

    public static void a(Context context) {
        try {
            TbsLog.i(TbsDownloader.LOGTAG, "clearDecoupleDirOld #00");
            File fileA = m.a().a(context, context.getDir("tbs_64", 0));
            FileUtil.b(fileA);
            if (fileA != null) {
                TbsLog.i(TbsDownloader.LOGTAG, "clearDecoupleDirOld dir is " + fileA.getAbsolutePath());
            }
            File fileA2 = m.a().a(context, context.getDir("tbs", 0));
            FileUtil.b(fileA2);
            if (fileA2 != null) {
                TbsLog.i(TbsDownloader.LOGTAG, "clearDecoupleDirOld dir is " + fileA2.getAbsolutePath());
            }
        } catch (Throwable th) {
            TbsLog.i(TbsDownloader.LOGTAG, "clearDecoupleDirOld stack is " + Log.getStackTraceString(th));
        }
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private void a(String str) throws ProtocolException {
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = this.t;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                TbsLog.e(TbsDownloader.LOGTAG, "[initHttpRequest] mHttpRequest.disconnect() Throwable:" + th.toString());
            }
        }
        HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
        this.t = httpURLConnection2;
        httpURLConnection2.setRequestProperty("User-Agent", TbsDownloader.b(this.g));
        this.t.setRequestProperty(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_KEY_ACCEPT_ENCODING, "identity");
        this.t.setRequestMethod("GET");
        this.t.setInstanceFollowRedirects(false);
        this.t.setConnectTimeout(this.n);
        this.t.setReadTimeout(this.m);
    }

    public void a(boolean z) {
        a(z, false);
    }

    /* JADX WARN: Code duplicated, block: B:126:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:251:0x0648  */
    /* JADX WARN: Code duplicated, block: B:256:0x065e  */
    /* JADX WARN: Code duplicated, block: B:396:0x094c A[PHI: r13 r14 r18
  0x094c: PHI (r13v16 boolean) = (r13v17 boolean), (r13v24 boolean), (r13v28 boolean) binds: [B:452:0x0abc, B:411:0x09d7, B:395:0x094a] A[DONT_GENERATE, DONT_INLINE]
  0x094c: PHI (r14v2 java.lang.String) = (r14v3 java.lang.String), (r14v6 java.lang.String), (r14v9 java.lang.String) binds: [B:452:0x0abc, B:411:0x09d7, B:395:0x094a] A[DONT_GENERATE, DONT_INLINE]
  0x094c: PHI (r18v8 long) = (r18v9 long), (r18v13 long), (r18v16 long) binds: [B:452:0x0abc, B:411:0x09d7, B:395:0x094a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:403:0x0981 A[Catch: all -> 0x09db, TryCatch #34 {all -> 0x09db, blocks: (B:401:0x097a, B:403:0x0981, B:407:0x0989, B:409:0x0991, B:416:0x09e0, B:420:0x09f0, B:423:0x09f8, B:428:0x0a1e), top: B:520:0x097a }] */
    /* JADX WARN: Code duplicated, block: B:431:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:440:0x0a59 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:456:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:458:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:460:0x0acc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:464:0x0adc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:465:0x0ade  */
    /* JADX WARN: Code duplicated, block: B:466:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:468:0x0ae5  */
    /* JADX WARN: Code duplicated, block: B:471:0x0afa  */
    /* JADX WARN: Code duplicated, block: B:472:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:473:0x0b21 A[PHI: r13
  0x0b21: PHI (r13v11 boolean) = (r13v72 boolean), (r13v73 boolean) binds: [B:457:0x0ac6, B:471:0x0afa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:476:0x0b2a  */
    /* JADX WARN: Code duplicated, block: B:477:0x0b40  */
    /* JADX WARN: Code duplicated, block: B:479:0x0b5b  */
    /* JADX WARN: Code duplicated, block: B:481:0x0b6a  */
    /* JADX WARN: Code duplicated, block: B:483:0x0b6e  */
    /* JADX WARN: Code duplicated, block: B:485:0x0b77  */
    /* JADX WARN: Code duplicated, block: B:488:0x0b81  */
    /* JADX WARN: Code duplicated, block: B:491:0x0b92  */
    /* JADX WARN: Code duplicated, block: B:575:0x0a1b A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x0ab1 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x043a, code lost:
    
        if (r41 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0537, code lost:
    
        if (r41 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0a0b, code lost:
    
        if (r41 == false) goto L426;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12, types: [int] */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.tencent.smtt.sdk.TbsLogReport$TbsLogInfo] */
    /* JADX WARN: Type inference failed for: r40v0, types: [com.tencent.smtt.sdk.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean foreground, boolean force) {
        this.C = foreground;
        this.r = false;
        this.y = false;
        TbsDownloadConfig cfg = TbsDownloadConfig.getInstance(this.g);
        try {
            String list = cfg.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADURL_LIST, null);
            ArrayList<String> urls = new ArrayList<>();
            if (list != null && list.length() > 0) {
                try {
                    JSONArray arr = new JSONArray(list);
                    for (int idx = 0; idx < arr.length(); idx++) {
                        String u = arr.optString(idx, null);
                        if (u != null && u.length() > 0) urls.add(u);
                    }
                } catch (JSONException ignored) {
                    for (String u : list.split("[;,]")) if (u.trim().length() > 0) urls.add(u.trim());
                }
            }
            String primary = cfg.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOADURL, null);
            if (primary != null && primary.length() > 0 && !urls.contains(primary)) urls.add(0, primary);
            this.a = urls.toArray(new String[0]);
            this.b = 0;
            if (this.a.length == 0) { cfg.setDownloadInterruptCode(-124); return; }
            boolean success = false;
            while (!this.r && !this.c && this.b < this.a.length) {
                if (b(foreground, force)) { success = true; break; }
                if (this.b < this.a.length) a(0L);
            }
            if (success && this.y) c(false);
            else if (this.c) cfg.setDownloadInterruptCode(-119);
            else if (!this.r) cfg.setDownloadInterruptCode(-121);
        } catch (Throwable th) {
            cfg.setDownloadInterruptCode(-122);
            cfg.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_INTERRUPT_CODE_REASON, -122);
            cfg.commit();
            this.v.setFailDetail(a(th));
            TbsLog.e(TbsDownloader.LOGTAG, "[TbsApkDownloader.startDownload] " + Log.getStackTraceString(th));
        } finally {
            g();
        }
    }
}