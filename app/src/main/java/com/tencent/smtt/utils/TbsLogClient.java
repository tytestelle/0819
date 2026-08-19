package com.tencent.smtt.utils;

import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.widget.TextView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class TbsLogClient {
    static TbsLogClient a;
    static File c;
    static String d;
    static byte[] e;
    TextView b;
    private SimpleDateFormat f;
    private Context g;
    private StringBuffer h = new StringBuffer();
    private boolean i = false;

    public class a implements Runnable {
        String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = TbsLogClient.this.b;
            if (textView != null) {
                textView.append(this.a + "\n");
            }
        }
    }

    public TbsLogClient(Context context) {
        this.f = null;
        this.g = null;
        try {
            this.g = context.getApplicationContext();
            this.f = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS", Locale.US);
        } catch (Exception unused) {
            this.f = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS");
        }
    }

    private void a() {
        try {
            if (c == null) {
                String strA = FileUtil.a(this.g, 6);
                if (strA == null) {
                    c = null;
                } else {
                    c = new File(strA, "tbslog.txt");
                    d = LogFileUtils.createKey();
                    e = LogFileUtils.createHeaderText(c.getName(), d);
                }
            }
        } catch (NullPointerException e2) {
            e = e2;
            e.printStackTrace();
        } catch (SecurityException e3) {
            e = e3;
            e.printStackTrace();
        }
    }

    public void d(String str, String str2) {
    }

    public void e(String str, String str2) {
    }

    public void i(String str, String str2) {
    }

    public void setLogView(TextView textView) {
        this.b = textView;
    }

    public void setWriteLogJIT(boolean z) {
        this.i = z;
    }

    public void showLog(String str) {
        TextView textView = this.b;
        if (textView != null) {
            textView.post(new a(str));
        }
    }

    public void v(String str, String str2) {
    }

    public void w(String str, String str2) {
    }

    public void writeLog(String str) {
        try {
            StringBuffer stringBuffer = this.h;
            stringBuffer.append(System.currentTimeMillis());
            stringBuffer.append(" pid=");
            stringBuffer.append(Process.myPid());
            stringBuffer.append(" tid=");
            stringBuffer.append(Process.myTid());
            stringBuffer.append(str);
            stringBuffer.append("\n");
            if (Thread.currentThread() != Looper.getMainLooper().getThread() || this.i) {
                writeLogToDisk();
            }
            if (this.h.length() > 524288) {
                StringBuffer stringBuffer2 = this.h;
                stringBuffer2.delete(0, stringBuffer2.length());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void writeLogToDisk() {
        try {
            a();
            File file = c;
            if (file != null) {
                LogFileUtils.writeDataToStorage(file, d, e, this.h.toString(), true);
                StringBuffer stringBuffer = this.h;
                stringBuffer.delete(0, stringBuffer.length());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
