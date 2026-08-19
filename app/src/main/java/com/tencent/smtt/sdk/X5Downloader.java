package com.tencent.smtt.sdk;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import androidx.media3.extractor.AacUtil;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.channels.FileLock;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.fourthline.cling.model.ServiceReference;
import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: classes2.dex */
public abstract class X5Downloader implements ProgressListener {
    private final Context a;
    private final QbSdk.PrivateCDNMode b;
    private String c;
    private String d;
    private File e;
    private File f;
    private long g;
    private String h;
    private int i;
    private DownloadDelegate l;
    private FileLock n;
    private FileOutputStream o;
    private HttpURLConnection t;
    private int v;
    private String w;
    private int j = 4;
    private int k = 10000;
    private volatile boolean m = false;
    private int p = 0;
    private int q = 0;
    private int r = 30000;
    private boolean s = false;
    private long u = -1;
    private boolean x = false;
    private boolean y = false;
    private final StringBuilder z = new StringBuilder();
    private int A = 0;
    private String B = "";

    public interface DownloadDelegate {
        void download(X5Downloader x5Downloader, String str, File file);
    }

    public X5Downloader(Context context) {
        throw new com.tencent.smtt.utils.a.a();
    }

    private long b() {
        File file = this.e;
        if (file == null || !file.exists()) {
            return 0L;
        }
        return this.e.length();
    }

    private void c() {
        int apnType = Apn.getApnType(this.a);
        String apnInfo = Apn.getApnInfo(this.a);
        String str = this.w;
        if (!(str == null && this.v == -1) && apnType == this.v && apnInfo.equals(str)) {
            return;
        }
        this.w = apnInfo;
        this.v = apnType;
    }

    private boolean d() {
        int i;
        String str;
        FileOutputStream fileOutputStreamB = FileUtil.b(this.a, true, "x5dl.lock");
        this.o = fileOutputStreamB;
        if (fileOutputStreamB != null) {
            FileLock fileLockA = FileUtil.a(this.a, fileOutputStreamB);
            this.n = fileLockA;
            if (fileLockA != null) {
                return true;
            }
            i = -2;
            str = "Other Process Downloading";
        } else {
            i = -1;
            str = "lock fos is null";
        }
        b(i, str);
        return false;
    }

    private void e() {
        FileUtil.a(this.n, this.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        SharedPreferences sharedPreferences = TbsDownloadConfig.getInstance(this.a).mPreferences;
        if (sharedPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWLOAD_FLOWCTR, 0) == 1) {
            this.c = "";
            b(-20, "meet flow control.");
            return;
        }
        String string = sharedPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOADURL, "");
        this.c = string;
        if ("".equals(string)) {
            b(-20, "meet flow control.");
        } else {
            TbsLog.i("X5Downloader", "start delegate download progress...");
            this.l.download(this, this.c, this.f);
        }
    }

    private void g() {
        File file = this.e;
        if (file == null || !file.exists()) {
            return;
        }
        FileUtil.b(file);
    }

    private void h() {
        this.y = false;
        this.m = false;
        this.x = false;
        this.p = 0;
        this.q = 0;
        this.r = 30000;
        this.s = false;
        this.t = null;
        this.u = -1L;
    }

    private void i() {
        TbsDownloadConfig.getInstance(this.a).mPreferences.edit().putString(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOADURL, "").apply();
    }

    private void j() {
        h();
        TbsLog.i("X5Downloader", "download and verify x5 finished, prepare to install");
        if (this.f.exists()) {
            m.a().a(this.a, this.f.getAbsolutePath(), this.i);
        }
        TbsLog.i("X5Downloader", "download and install finished.");
        onFinished();
    }

    public final void notifyDownloadFinished() {
        a(QbSdk.PrivateCDNMode.SELF_IMPL);
        if (a(true)) {
            j();
        } else {
            b(this.A, this.B);
        }
    }

    @Override // com.tencent.smtt.sdk.ProgressListener
    public void onProgress(int i) {
    }

    public final X5Downloader setConnectTimesOut(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "can not set ConnectTimesOut <= 0, input is: "));
        }
        this.k = i;
        return this;
    }

    public final X5Downloader setDownloadDelegate(DownloadDelegate downloadDelegate) {
        a(QbSdk.PrivateCDNMode.SELF_IMPL);
        this.l = downloadDelegate;
        return this;
    }

    public final X5Downloader setDownloadUrl(String str) {
        if (str.contains("imtt.qq.com")) {
            throw new IllegalArgumentException("you can't set TBS official domain");
        }
        a(QbSdk.PrivateCDNMode.OFFICIAL_IMPL);
        this.c = str;
        return this;
    }

    public final X5Downloader setMaxRetryTimes(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "can not set MaxRetryTimes <= 0, input is: "));
        }
        this.j = i;
        return this;
    }

    public final void startDownload() {
        if (this.b == QbSdk.PrivateCDNMode.SELF_IMPL && this.l == null) {
            throw new IllegalStateException("is SELF_IMPL mode, but delegate is null. Please set setDownloadDelegate()");
        }
        String str = this.c;
        if (str == null || str.equals("")) {
            b(-18, "url is empty, [OFFICIAL_IMPL] plz setDownloadUrl. [SELF_IMPL] Maybe flow control.");
            return;
        }
        if (this.i == 0) {
            b(-19, "No config version, please check whether TbsVersionController.checkVersion is call. Need more help please contact with x5tbs@tencent.com");
            return;
        }
        if (QbSdk.getTbsVersion(this.a) != this.i && !a(true)) {
            Thread thread = new Thread() { // from class: com.tencent.smtt.sdk.X5Downloader.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    if (X5Downloader.this.b == QbSdk.PrivateCDNMode.SELF_IMPL) {
                        X5Downloader.this.f();
                    } else {
                        TbsLog.i("X5Downloader", "Delegate is null, try to start default download.");
                        X5Downloader.this.a();
                    }
                }
            };
            thread.setName("thread-x5dl");
            thread.start();
        } else {
            j();
            TbsLog.i("X5Downloader", "local version match, no need to download: " + this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:168:0x0368 A[Catch: all -> 0x038c, TryCatch #5 {all -> 0x038c, blocks: (B:166:0x0364, B:168:0x0368, B:171:0x036d, B:173:0x0375, B:183:0x0390, B:187:0x039e), top: B:197:0x0364 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x039b  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    public void a() {
        String str;
        int i;
        long jB;
        Closeable closeable;
        InputStream inputStream;
        InputStream inflaterInputStream;
        FileOutputStream fileOutputStream;
        HttpURLConnection httpURLConnection;
        String str2;
        int r2 = 1;
        this.y = true;
        if (d()) {
            while (true) {
                if (this.p > this.j) {
                    str = "out of max retry, times:" + this.p + "; record: " + this.z.toString();
                    i = -3;
                } else if (this.q > 8) {
                    str = "302 redirect to much, times:" + this.q + "; current location: " + this.d;
                    i = -4;
                } else {
                    if (!FileUtil.b(this.a)) {
                        b(-5, "no disk space left");
                        break;
                    }
                    String str3 = this.d;
                    if (str3 == null) {
                        str3 = this.c;
                    }
                    TbsLog.i("X5Downloader", "url: " + str3);
                    try {
                        a(str3);
                        if (this.s) {
                            jB = 0;
                        } else {
                            jB = b();
                            TbsLog.i("X5Downloader", "[TbsApkDownloader.startDownload] range=" + jB);
                            if (this.u <= 0) {
                                TbsLog.i("X5Downloader", "STEP 1/2 begin downloading...current" + jB);
                                httpURLConnection = this.t;
                                str2 = BytesRange.PREFIX + jB + "-";
                            } else {
                                TbsLog.i("X5Downloader", "#1 STEP 1/2 begin downloading...current/total=" + jB + ServiceReference.DELIMITER + this.u);
                                httpURLConnection = this.t;
                                str2 = BytesRange.PREFIX + jB + "-" + this.u;
                            }
                            httpURLConnection.setRequestProperty("Range", str2);
                        }
                        c();
                        if (this.p >= r2) {
                            this.t.addRequestProperty("Referer", this.c);
                        }
                        int responseCode = this.t.getResponseCode();
                        TbsLog.i("X5Downloader", "responseCode=" + responseCode);
                        int i2 = -6;
                        if (!this.m) {
                            int i3 = 0;
                            if (responseCode != 200 && responseCode != 206) {
                                if (responseCode >= 300 && responseCode <= 307) {
                                    String headerField = this.t.getHeaderField("Location");
                                    if (TextUtils.isEmpty(headerField)) {
                                        b(-10, "http redirect location null, responseCode: " + responseCode);
                                        break;
                                    }
                                    this.d = headerField;
                                    this.q += r2;
                                    r2 = 1;
                                } else {
                                    if (responseCode == 416) {
                                        if (!a(false)) {
                                            g();
                                            b(this.A, this.B);
                                            break;
                                        } else {
                                            this.x = r2;
                                            break;
                                        }
                                    }
                                    if ((responseCode == 403 || responseCode == 406) && this.u == -1) {
                                        b(-16, "apk forbidden. responseCode: " + responseCode);
                                        break;
                                    }
                                    if (responseCode == 202) {
                                        continue;
                                    } else if (responseCode == 503) {
                                        long j = Long.parseLong(this.t.getHeaderField("Retry-After"));
                                        StringBuilder sb = this.z;
                                        sb.append("httpCode:");
                                        sb.append(responseCode);
                                        a(j);
                                    } else if (responseCode == 408 || responseCode == 504 || responseCode == 502) {
                                        StringBuilder sb2 = this.z;
                                        sb2.append("httpCode:");
                                        sb2.append(responseCode);
                                        a(0L);
                                    } else {
                                        if (b() > 0 || this.s || responseCode == 410) {
                                            b(-1, "other http code come up: " + responseCode);
                                            break;
                                        }
                                        this.s = r2;
                                    }
                                    r2 = 1;
                                }
                            }
                            long contentLength = ((long) this.t.getContentLength()) + jB;
                            this.u = contentLength;
                            long j2 = this.g;
                            if (j2 != 0 && contentLength != j2) {
                                b(-7, "connection ok, but file length not match.Expected: " + this.g + "; real: " + this.u);
                                break;
                            }
                            Closeable closeable2 = null;
                            try {
                                inputStream = this.t.getInputStream();
                                if (inputStream == null) {
                                    try {
                                        b(-8, "response input stream null.");
                                        a((Closeable) null);
                                        a((Closeable) null);
                                    } catch (IOException e) {
                                        e = e;
                                        closeable = null;
                                        try {
                                            if (e instanceof SocketTimeoutException) {
                                                this.r = AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
                                                a(0L);
                                                a(closeable2);
                                                a(closeable);
                                            } else {
                                                this.r = AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
                                                a(0L);
                                                a(closeable2);
                                                a(closeable);
                                            }
                                            a(inputStream);
                                            r2 = 1;
                                        } catch (Throwable th) {
                                            th = th;
                                            a(closeable2);
                                            a(closeable);
                                            a(inputStream);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        closeable = null;
                                        a(closeable2);
                                        a(closeable);
                                        a(inputStream);
                                        throw th;
                                    }
                                    a(inputStream);
                                    break;
                                }
                                int i4 = 8192;
                                try {
                                    byte[] bArr = new byte[8192];
                                    File file = this.e;
                                    String contentEncoding = this.t.getContentEncoding();
                                    if (contentEncoding == null || !contentEncoding.contains("gzip")) {
                                        inflaterInputStream = (contentEncoding == null || !contentEncoding.contains("deflate")) ? inputStream : new InflaterInputStream(inputStream, new Inflater(r2));
                                    } else {
                                        inflaterInputStream = new GZIPInputStream(inputStream);
                                    }
                                    try {
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(file, (boolean) r2);
                                        try {
                                            try {
                                                long jCurrentTimeMillis = System.currentTimeMillis();
                                                while (true) {
                                                    if (this.m) {
                                                        try {
                                                            try {
                                                                b(i2, "user cancel download");
                                                                break;
                                                            } catch (IOException e2) {
                                                                e = e2;
                                                                closeable = inflaterInputStream;
                                                                closeable2 = fileOutputStream2;
                                                                if (e instanceof SocketTimeoutException) {
                                                                    this.r = AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
                                                                    a(0L);
                                                                    a(closeable2);
                                                                    a(closeable);
                                                                } else {
                                                                    this.r = AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
                                                                    a(0L);
                                                                    a(closeable2);
                                                                    a(closeable);
                                                                }
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            closeable = inflaterInputStream;
                                                            closeable2 = fileOutputStream2;
                                                            a(closeable2);
                                                            a(closeable);
                                                            a(inputStream);
                                                            throw th;
                                                        }
                                                    } else {
                                                        int i5 = inflaterInputStream.read(bArr, i3, i4);
                                                        if (i5 <= 0) {
                                                            this.z.append("stream is 0, code: -9");
                                                            break;
                                                        }
                                                        fileOutputStream2.write(bArr, i3, i5);
                                                        fileOutputStream2.flush();
                                                        if (!FileUtil.b(this.a)) {
                                                            b(-5, "no disk space left");
                                                            break;
                                                        }
                                                        fileOutputStream = fileOutputStream2;
                                                        try {
                                                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                            jB += (long) i5;
                                                            if (jCurrentTimeMillis2 - jCurrentTimeMillis >= 500) {
                                                                onProgress((int) ((jB / this.u) * 100.0d));
                                                                jCurrentTimeMillis = jCurrentTimeMillis2;
                                                            }
                                                            fileOutputStream2 = fileOutputStream;
                                                            i4 = 8192;
                                                            i2 = -6;
                                                            i3 = 0;
                                                        } catch (IOException e3) {
                                                            e = e3;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            Closeable closeable3 = inflaterInputStream;
                                                            closeable2 = fileOutputStream;
                                                            closeable = closeable3;
                                                            a(closeable2);
                                                            a(closeable);
                                                            a(inputStream);
                                                            throw th;
                                                        }
                                                        Closeable closeable4 = inflaterInputStream;
                                                        closeable2 = fileOutputStream;
                                                        closeable = closeable4;
                                                        if ((e instanceof SocketTimeoutException) || (e instanceof SocketException)) {
                                                            this.r = AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
                                                            a(0L);
                                                            a(closeable2);
                                                            a(closeable);
                                                        } else {
                                                            if (!FileUtil.b(this.a)) {
                                                                b(-5, "no disk space left");
                                                                a(closeable2);
                                                                a(closeable);
                                                                a(inputStream);
                                                                break;
                                                            }
                                                            a(0L);
                                                            a(closeable2);
                                                            a(closeable);
                                                        }
                                                        a(inputStream);
                                                        r2 = 1;
                                                    }
                                                }
                                                a(fileOutputStream2);
                                                a(inflaterInputStream);
                                            } catch (Throwable th5) {
                                                th = th5;
                                                fileOutputStream = fileOutputStream2;
                                            }
                                        } catch (IOException e4) {
                                            e = e4;
                                            fileOutputStream = fileOutputStream2;
                                        }
                                    } catch (IOException e5) {
                                        e = e5;
                                        closeable = inflaterInputStream;
                                        closeable2 = null;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        closeable = inflaterInputStream;
                                        closeable2 = null;
                                        a(closeable2);
                                        a(closeable);
                                        a(inputStream);
                                        throw th;
                                    }
                                } catch (IOException e6) {
                                    e = e6;
                                    closeable = null;
                                } catch (Throwable th7) {
                                    th = th7;
                                    closeable = null;
                                }
                                a(inputStream);
                                r2 = 1;
                            } catch (IOException e7) {
                                e = e7;
                                closeable = null;
                                closeable2 = null;
                                inputStream = null;
                            } catch (Throwable th8) {
                                th = th8;
                                closeable = null;
                                closeable2 = null;
                                inputStream = null;
                            }
                        } else {
                            b(-6, "user cancel download");
                            break;
                        }
                    } catch (Throwable th9) {
                        th9.printStackTrace();
                        this.z.append(th9.getMessage());
                        a(0L);
                    }
                }
                b(i, str);
                break;
            }
            e();
            if (this.x) {
                j();
            }
        }
    }

    private void b(int i, String str) {
        h();
        TbsLog.i("X5Downloader", "innerOnFailed, code: " + i + ", msg: " + str);
        onFailed(i, str);
    }

    private void a(int i, String str) {
        this.A = i;
        this.B = str;
    }

    private void a(long j) {
        int i = this.p + 1;
        this.p = i;
        if (j <= 0) {
            if (i == 1 || i == 2) {
                j = ((long) i) * 5000;
            } else {
                j = (i == 3 || i == 4) ? 25000L : 50000L;
            }
        }
        try {
            Thread.sleep(j);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(QbSdk.PrivateCDNMode privateCDNMode) {
        if (this.b == privateCDNMode) {
            return;
        }
        throw new UnsupportedOperationException("you are expected use " + privateCDNMode.name() + ".Current mode is " + privateCDNMode.name() + ". Plz check QbSdk.usePrivateCDN(PrivateCDNMode)");
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
                TbsLog.e("X5Downloader", "[initHttpRequest] mHttpRequest.disconnect() Throwable:" + th.toString());
            }
        }
        HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
        this.t = httpURLConnection2;
        httpURLConnection2.setRequestProperty("User-Agent", TbsDownloader.b(this.a));
        this.t.setRequestProperty(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_KEY_ACCEPT_ENCODING, "identity");
        this.t.setRequestMethod("GET");
        this.t.setInstanceFollowRedirects(false);
        this.t.setConnectTimeout(this.k);
        this.t.setReadTimeout(this.r);
    }

    private boolean a(boolean z) {
        Exception exc;
        boolean zRenameTo;
        File file = z ? this.f : this.e;
        if (this.e == null || !file.exists()) {
            a(-14, "target file not exist.");
            return false;
        }
        String strA = com.tencent.smtt.utils.a.a(file);
        String str = this.h;
        if (str == null || !str.equals(strA)) {
            a(-11, "md5 not match");
            return false;
        }
        long j = this.g;
        if (j == 0 || j != file.length()) {
            a(-12, "size not match. current: " + file.length());
            return false;
        }
        int i = this.i;
        if (i == 0 || i != com.tencent.smtt.utils.a.a(this.a, file)) {
            a(-15, "core version not match");
            return false;
        }
        if (!"3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a".equals(com.tencent.smtt.utils.b.a(this.a, false, file))) {
            a(-13, "core sig invalid.");
            return false;
        }
        if (!z) {
            try {
                zRenameTo = this.e.renameTo(this.f);
                exc = null;
            } catch (Exception e) {
                exc = e;
                zRenameTo = false;
            }
            if (!zRenameTo) {
                a(-17, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("reason: ", exc));
                return false;
            }
        }
        i();
        return true;
    }
}
