package com.tencent.smtt.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class o {
    private static o c;
    private Context a;
    private File b = null;
    private String d = "https://log.tbs.qq.com/ajax?c=pu&v=2&k=";
    private String e = "https://log.tbs.qq.com/ajax?c=pu&tk=";
    private String f = "https://log.tbs.qq.com/ajax?c=dl&k=";
    private String g = "https://cfg.imtt.qq.com/tbs?v=2&mk=";
    private String h = "https://log.tbs.qq.com/ajax?c=ul&v=2&k=";

    @TargetApi(11)
    private o(Context context) {
        this.a = null;
        TbsLog.w("TbsCommonConfig", "TbsCommonConfig constructing...");
        this.a = context.getApplicationContext();
        f();
    }

    public static synchronized o a() {
        return c;
    }

    private synchronized void f() {
        BufferedInputStream bufferedInputStream = null;
        try {
            File fileG = g();
            if (fileG == null) {
                TbsLog.e("TbsCommonConfig", "Config file is null, default values will be applied");
                return;
            }
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(fileG));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream2);
                String property = properties.getProperty("pv_post_url", "");
                if (!"".equals(property)) {
                    this.d = property;
                }
                String property2 = properties.getProperty("tbs_download_stat_post_url", "");
                if (!"".equals(property2)) {
                    this.f = property2;
                }
                String property3 = properties.getProperty("tbs_downloader_post_url", "");
                TbsLog.i("TbsCommonConfig", "KEY_TBS_DOWNLOADER_POST_URL is " + property3);
                if (!"".equals(property3)) {
                    this.g = property3;
                }
                String property4 = properties.getProperty("tbs_log_post_url", "");
                if (!"".equals(property4)) {
                    this.h = property4;
                }
                String property5 = properties.getProperty("pv_post_url_tk", "");
                if (!"".equals(property5)) {
                    this.e = property5;
                }
                try {
                    bufferedInputStream2.close();
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                try {
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    TbsLog.e("TbsCommonConfig", "exceptions occurred1:" + stringWriter.toString());
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private File g() {
        File file = null;
        try {
            if (this.b == null) {
                if (!TextUtils.isEmpty(this.a.getApplicationContext().getApplicationInfo().packageName)) {
                    this.b = new File(FileUtil.a(this.a, 8));
                }
                File file2 = this.b;
                if (file2 == null || !file2.isDirectory()) {
                    return null;
                }
            }
            TbsLog.i("TbsCommonConfig", "mTbsConfigDir is " + this.b.getAbsolutePath());
            File file3 = new File(this.b, "tbsnet.conf");
            if (!file3.exists()) {
                TbsLog.e("TbsCommonConfig", "Get file(" + file3.getCanonicalPath() + ") failed!");
                return null;
            }
            try {
                TbsLog.w("TbsCommonConfig", "pathc:" + file3.getCanonicalPath());
                return file3;
            } catch (Throwable th) {
                th = th;
                file = file3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        TbsLog.e("TbsCommonConfig", "exceptions occurred2:" + stringWriter.toString());
        return file;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.g;
    }

    public String e() {
        return this.e;
    }

    public static synchronized o a(Context context) {
        try {
            if (c == null) {
                c = new o(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }
}
