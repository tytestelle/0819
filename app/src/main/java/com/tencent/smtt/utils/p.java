package com.tencent.smtt.utils;

import android.content.Context;
import com.tencent.smtt.sdk.QbSdk;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class p {
    private static p e;
    public boolean a;
    private Context b;
    private File c;
    private boolean d;

    public static synchronized p a() {
        return e;
    }

    private File c() {
        try {
            if (this.c == null) {
                File file = new File(QbSdk.getTbsFolderDir(this.b), "core_private");
                this.c = file;
                if (!file.isDirectory()) {
                    return null;
                }
            }
            File file2 = new File(this.c, "debug.conf");
            if (!file2.exists()) {
                file2.createNewFile();
            }
            return file2;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void b() {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        File fileC = c();
        if (fileC == null) {
            return;
        }
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(fileC));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    properties.setProperty("setting_forceUseSystemWebview", Boolean.toString(this.a));
                    properties.setProperty("result_systemWebviewForceUsed", Boolean.toString(this.d));
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileC));
                    try {
                        properties.store(bufferedOutputStream, (String) null);
                        try {
                            bufferedInputStream.close();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        bufferedOutputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                            try {
                                bufferedInputStream.close();
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                            bufferedOutputStream.close();
                        } finally {
                            try {
                                bufferedInputStream.close();
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                            try {
                                bufferedOutputStream.close();
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                }
            } catch (Throwable th4) {
                bufferedInputStream = null;
                th = th4;
                bufferedOutputStream = null;
            }
        } catch (Exception e6) {
        }
    }

    public void a(boolean z) {
        this.d = z;
        b();
    }
}
