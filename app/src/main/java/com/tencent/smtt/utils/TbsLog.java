package com.tencent.smtt.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;
import com.tencent.smtt.sdk.TbsHandlerThread;
import com.tencent.smtt.sdk.TbsListener;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class TbsLog {
    public static final int MSG_PV_REPORT = 501;
    public static final String X5LOGTAG = "x5logtag";
    private static boolean a = true;
    private static Handler b;
    private static TbsLogClient c;

    public static void d(String str, String str2) {
        d(str, "", str2);
    }

    public static void e(String str, String str2) {
        e(str, "", str2);
    }

    public static String getTbsLogFilePath() {
        File file = TbsLogClient.c;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public static Handler getTbsLogHandler() {
        return b;
    }

    public static void i(String str, String str2) {
        i(str, "", str2);
    }

    public static synchronized void initIfNeed(Context context) {
        try {
            if (c == null) {
                setTbsLogClient(new TbsLogClient(context));
            }
            if (b == null) {
                b = new Handler(TbsHandlerThread.getInstance().getLooper()) { // from class: com.tencent.smtt.utils.TbsLog.1
                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        int i = message.what;
                        if (i == 500) {
                            if (TbsLog.c != null) {
                                TbsLog.c.writeLogToDisk();
                            }
                        } else if (i == 501) {
                            Object obj = message.obj;
                            if (obj instanceof Runnable) {
                                ((Runnable) obj).run();
                            }
                        }
                    }
                };
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void setLogView(TextView textView) {
        TbsLogClient tbsLogClient;
        if (textView == null || (tbsLogClient = c) == null) {
            return;
        }
        tbsLogClient.setLogView(textView);
    }

    public static boolean setTbsLogClient(TbsLogClient tbsLogClient) {
        if (tbsLogClient == null) {
            return false;
        }
        c = tbsLogClient;
        return true;
    }

    @Deprecated
    public static void setWriteLogJIT(boolean z) {
        TbsLogClient tbsLogClient = c;
        if (tbsLogClient == null) {
            return;
        }
        tbsLogClient.setWriteLogJIT(z);
    }

    public static void v(String str, String str2) {
        v(str, "", str2);
    }

    public static void w(String str, String str2) {
        w(str, "", str2);
    }

    public static synchronized void writeLogToDisk() {
        Handler handler;
        if (c != null && (handler = b) != null) {
            handler.obtainMessage(TbsListener.ErrorCode.INFO_CODE_MINIQB).sendToTarget();
        }
    }

    public static void d(String str, String str2, String str3) {
    }

    public static void e(String str, String str2, String str3) {
        TbsLogClient tbsLogClient = c;
        if (tbsLogClient == null) {
            return;
        }
        tbsLogClient.e(str, "TBS:" + str2 + " " + str3);
        c.writeLog("(E)-" + str + "-TBS:" + str2 + " " + str3);
    }

    public static void i(String str, String str2, String str3) {
        TbsLogClient tbsLogClient = c;
        if (tbsLogClient == null) {
            return;
        }
        tbsLogClient.i(str, "TBS:" + str2 + " " + str3);
        c.writeLog("(I)-" + str + "-TBS:" + str2 + " " + str3);
    }

    public static void v(String str, String str2, String str3) {
    }

    public static void w(String str, String str2, String str3) {
        TbsLogClient tbsLogClient = c;
        if (tbsLogClient == null) {
            return;
        }
        tbsLogClient.w(str, "TBS:" + str2 + " " + str3);
        c.writeLog("(W)-" + str + "-TBS:" + str2 + " " + str3);
    }

    public static void d(String str, String str2, boolean z) {
        d(str, str2);
        TbsLogClient tbsLogClient = c;
        if (tbsLogClient != null && a && z) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    public static void e(String str, String str2, boolean z) {
        e(str, str2);
        TbsLogClient tbsLogClient = c;
        if (tbsLogClient != null && a && z) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    public static void i(String str, String str2, boolean z) {
        i(str, str2);
        TbsLogClient tbsLogClient = c;
        if (tbsLogClient != null && a && z) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    public static void v(String str, String str2, boolean z) {
        v(str, str2);
        TbsLogClient tbsLogClient = c;
        if (tbsLogClient != null && a && z) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    public static void w(String str, String str2, boolean z) {
        w(str, str2);
        TbsLogClient tbsLogClient = c;
        if (tbsLogClient != null && a && z) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    public static void i(Throwable th) {
        i("handle_throwable", Log.getStackTraceString(th));
    }
}
