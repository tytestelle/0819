package com.tencent.smtt.sdk;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.tencent.smtt.utils.Base64;
import com.tencent.smtt.utils.TbsLog;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class TbsLogReport {
    private static TbsLogReport a;
    private Handler b;
    private final Map<EventType, Boolean> c;
    private final Context d;
    private boolean e = false;

    public enum EventType {
        TYPE_DOWNLOAD(0),
        TYPE_INSTALL(1),
        TYPE_LOAD(2),
        TYPE_CDN_DOWNLOAD_STAT(3),
        TYPE_COOKIE_DB_SWITCH(4),
        TYPE_PV_UPLOAD_STAT(5),
        TYPE_CORE_LOAD_PERFORMANCE(6),
        TYPE_CORE_PROTECT_RESET(7);

        int a;

        EventType(int i) {
            this.a = i;
        }
    }

    public static class TbsLogInfo implements Cloneable {
        int a;
        private long b;
        private String c;
        private String d;
        private int e;
        private int f;
        private int g;
        private int h;
        private String i;
        private int j;
        private int k;
        private long l;
        private long m;
        private int n;
        private String o;
        private String p;
        private long q;

        private TbsLogInfo() {
            resetArgs();
        }

        public Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException unused) {
                return this;
            }
        }

        public int getDownFinalFlag() {
            return this.k;
        }

        public void resetArgs() {
            this.b = 0L;
            this.c = null;
            this.d = null;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 2;
            this.i = "unknown";
            this.j = 0;
            this.k = 2;
            this.l = 0L;
            this.m = 0L;
            this.n = 1;
            this.a = 0;
            this.o = null;
            this.p = null;
            this.q = 0L;
        }

        public void setApn(String str) {
            this.i = str;
        }

        public void setCheckErrorDetail(String str) {
            setErrorCode(108);
            this.o = str;
        }

        public void setDownConsumeTime(long j) {
            this.m += j;
        }

        public void setDownFinalFlag(int i) {
            this.k = i;
        }

        public void setDownloadCancel(int i) {
            this.g = i;
        }

        public void setDownloadSize(long j) {
            this.q += j;
        }

        public void setDownloadUrl(String str) {
            if (this.c != null) {
                str = this.c + ";" + str;
            }
            this.c = str;
        }

        public void setErrorCode(int i) {
            if (i != 100 && i != 110 && i != 120 && i != 111 && i < 400) {
                TbsLog.i(TbsDownloader.LOGTAG, "error occured, errorCode:" + i, true);
            }
            if (i == 111) {
                TbsLog.i(TbsDownloader.LOGTAG, "you are not in wifi, downloading stoped", true);
            }
            this.a = i;
        }

        public void setEventTime(long j) {
            this.b = j;
        }

        public void setFailDetail(String str) {
            if (str == null) {
                return;
            }
            if (str.length() > 1024) {
                str = str.substring(0, 1024);
            }
            this.p = str;
        }

        public void setHttpCode(int i) {
            this.e = i;
        }

        public void setNetworkChange(int i) {
            this.n = i;
        }

        public void setNetworkType(int i) {
            this.j = i;
        }

        public void setPatchUpdateFlag(int i) {
            this.f = i;
        }

        public void setPkgSize(long j) {
            this.l = j;
        }

        public void setResolveIp(String str) {
            this.d = str;
        }

        public void setUnpkgFlag(int i) {
            this.h = i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TbsLogInfo{mEventTime=");
            sb.append(this.b);
            sb.append(", mResolveIp='");
            sb.append(this.d);
            sb.append("', mHttpCode=");
            sb.append(this.e);
            sb.append(", mDownloadCancel=");
            sb.append(this.g);
            sb.append(", mNetworkType=");
            sb.append(this.j);
            sb.append(", mDownConsumeTime=");
            sb.append(this.m);
            sb.append(", mErrorCode=");
            sb.append(this.a);
            sb.append(", mCheckErrorDetail='");
            sb.append(this.o);
            sb.append("', mFailDetail='");
            return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(sb, this.p, "'}");
        }

        public void setFailDetail(Throwable th) {
            if (th == null) {
                this.p = "";
                return;
            }
            String stackTraceString = Log.getStackTraceString(th);
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, 1024);
            }
            this.p = stackTraceString;
        }
    }

    private TbsLogReport(Context context) {
        this.b = null;
        this.d = context.getApplicationContext();
        this.c = TbsPVConfig.getInstance(context).getLogReportSwitchMap();
        this.b = new Handler(TbsHandlerThread.getInstance().getLooper()) { // from class: com.tencent.smtt.sdk.TbsLogReport.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i != 600) {
                    if (i == 601) {
                        TbsLogReport.this.b();
                        return;
                    }
                    return;
                }
                Object obj = message.obj;
                if (obj instanceof TbsLogInfo) {
                    try {
                        int i2 = message.arg1;
                        TbsLogReport.this.a(i2, (TbsLogInfo) obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
    }

    private String a(int i) {
        return i + "|";
    }

    private String b(long j) {
        return j + "|";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        SharedPreferences.Editor editorEdit = d().edit();
        editorEdit.remove("tbs_tbslogreport_upload");
        editorEdit.commit();
    }

    private SharedPreferences d() {
        return this.d.getSharedPreferences("tbs_event_stat", 4);
    }

    public static TbsLogReport getInstance(Context context) {
        if (a == null) {
            synchronized (TbsLogReport.class) {
                try {
                    if (a == null) {
                        a = new TbsLogReport(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }

    public void clear() {
        try {
            SharedPreferences.Editor editorEdit = d().edit();
            editorEdit.clear();
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }

    public void dailyReport() {
        this.b.sendEmptyMessage(601);
    }

    public void eventReport(EventType eventType, TbsLogInfo tbsLogInfo) {
        TbsLog.i("TbsLogReport", "[TbsLogReport.eventRepost] " + eventType + ": " + tbsLogInfo);
        Boolean bool = this.c.get(eventType);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        TbsLog.i("TbsLogReport", "[TbsLogReport.eventRepost] needReport!");
        try {
            TbsLogInfo tbsLogInfo2 = (TbsLogInfo) tbsLogInfo.clone();
            Message messageObtainMessage = this.b.obtainMessage();
            messageObtainMessage.what = 600;
            messageObtainMessage.arg1 = eventType.a;
            messageObtainMessage.obj = tbsLogInfo2;
            this.b.sendMessage(messageObtainMessage);
        } catch (Throwable th) {
            TbsLog.w("TbsLogReport", "[TbsLogReport.eventReport] error, message=" + th.getMessage());
        }
    }

    public boolean getShouldUploadEventReport() {
        return this.e;
    }

    public void setInstallErrorCode(int i, String str) {
        setInstallErrorCode(i, str, EventType.TYPE_INSTALL);
    }

    public void setLoadErrorCode(int i, Throwable th) {
        String strSubstring;
        if (th != null) {
            strSubstring = "msg: " + th.getMessage() + "; err: " + th + "; cause: " + Log.getStackTraceString(th.getCause());
            if (strSubstring.length() > 1024) {
                strSubstring = strSubstring.substring(0, 1024);
            }
        } else {
            strSubstring = "NULL";
        }
        a(i, strSubstring);
    }

    public void setShouldUploadEventReport(boolean z) {
        this.e = z;
    }

    public TbsLogInfo tbsLogInfo() {
        return new TbsLogInfo();
    }

    private String a(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Map<String, Object> map = QbSdk.o;
        if (map != null && map.containsKey(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD) && QbSdk.o.get(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")) {
            TbsLog.i("TbsLogReport", "[TbsLogReport.sendLogReportRequest] -- SET_SENDREQUEST_AND_UPLOAD is false");
            return;
        }
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat]");
        JSONArray jSONArrayA = a();
        if (jSONArrayA == null || jSONArrayA.length() == 0) {
            TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] no data");
            return;
        }
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] jsonArray:" + jSONArrayA);
        try {
            TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] response:" + com.tencent.smtt.utils.g.a(com.tencent.smtt.utils.o.a(this.d).c(), jSONArrayA.toString().getBytes("utf-8"), new com.tencent.smtt.utils.g.a() { // from class: com.tencent.smtt.sdk.TbsLogReport.2
                @Override // com.tencent.smtt.utils.g.a
                public void a(int i) {
                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] onHttpResponseCode:" + i);
                    if (i < 300) {
                        TbsLogReport.this.c();
                    }
                }
            }, true) + " testcase: -1");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setInstallErrorCode(int i, String str, EventType eventType) {
        if (i != 200 && i != 220 && i != 221) {
            TbsLog.i(TbsDownloader.LOGTAG, "error occured in installation, errorCode:" + i, true);
        }
        TbsLogInfo tbsLogInfo = tbsLogInfo();
        tbsLogInfo.setFailDetail(str);
        a(i, tbsLogInfo, eventType);
    }

    private String a(String str) {
        if (str == null) {
            str = "";
        }
        return str.concat("|");
    }

    public void setInstallErrorCode(int i, Throwable th) {
        TbsLogInfo tbsLogInfo = tbsLogInfo();
        tbsLogInfo.setFailDetail(th);
        a(i, tbsLogInfo, EventType.TYPE_INSTALL);
    }

    private JSONArray a() {
        String string = d().getString("tbs_tbslogreport_upload", null);
        if (string != null) {
            try {
                string = new String(Base64.a(string, 2));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (string == null) {
            return new JSONArray();
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            if (jSONArray.length() <= 5) {
                return jSONArray;
            }
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            while (true) {
                length--;
                if (length < jSONArray.length() - 5) {
                    return jSONArray2;
                }
                jSONArray2.put(jSONArray.get(length));
            }
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, TbsLogInfo tbsLogInfo) {
        Map<String, Object> map = QbSdk.o;
        if (map != null && map.containsKey(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD) && QbSdk.o.get(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")) {
            TbsLog.i("TbsLogReport", "[TbsLogReport.sendLogReportRequest] -- SET_SENDREQUEST_AND_UPLOAD is false");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a(i));
        sb.append(a(""));
        sb.append(a(com.tencent.smtt.utils.l.a(this.d)));
        sb.append(a(m.a().g(this.d)));
        sb.append(a(""));
        String packageName = this.d.getPackageName();
        sb.append(a(packageName));
        sb.append(TbsConfig.APP_WX.equals(packageName) ? a(com.tencent.smtt.utils.b.a(this.d, TbsDownloader.TBS_METADATA)) : a(com.tencent.smtt.utils.b.b(this.d)));
        sb.append(a(a(tbsLogInfo.b)));
        sb.append(a(tbsLogInfo.c));
        sb.append(a(tbsLogInfo.d));
        sb.append(a(tbsLogInfo.e));
        sb.append(a(tbsLogInfo.f));
        sb.append(a(tbsLogInfo.g));
        sb.append(a(tbsLogInfo.h));
        sb.append(a(tbsLogInfo.i));
        sb.append(a(tbsLogInfo.j));
        sb.append(a(tbsLogInfo.k));
        sb.append(b(tbsLogInfo.q));
        sb.append(b(tbsLogInfo.l));
        sb.append(b(tbsLogInfo.m));
        sb.append(a(tbsLogInfo.n));
        sb.append(a(tbsLogInfo.a));
        sb.append(a(tbsLogInfo.o));
        sb.append(a(tbsLogInfo.p));
        sb.append(a(TbsDownloadConfig.getInstance(this.d).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0)));
        sb.append(a(com.tencent.smtt.utils.b.g(this.d)));
        sb.append(a("44286"));
        sb.append(false);
        SharedPreferences sharedPreferencesD = d();
        JSONArray jSONArrayA = a();
        jSONArrayA.put(sb.toString());
        SharedPreferences.Editor editorEdit = sharedPreferencesD.edit();
        String string = jSONArrayA.toString();
        try {
            string = Base64.encodeToString(string.getBytes(), 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        editorEdit.putString("tbs_tbslogreport_upload", string);
        editorEdit.commit();
        if (this.e) {
            b();
        }
    }

    private void a(int i, TbsLogInfo tbsLogInfo, EventType eventType) {
        tbsLogInfo.setErrorCode(i);
        tbsLogInfo.setEventTime(System.currentTimeMillis());
        QbSdk.n.onInstallFinish(i);
        eventReport(eventType, tbsLogInfo);
    }

    private void a(int i, String str) {
        TbsLogInfo tbsLogInfo = tbsLogInfo();
        tbsLogInfo.setErrorCode(i);
        tbsLogInfo.setEventTime(System.currentTimeMillis());
        tbsLogInfo.setFailDetail(str);
        eventReport(EventType.TYPE_LOAD, tbsLogInfo);
    }
}
