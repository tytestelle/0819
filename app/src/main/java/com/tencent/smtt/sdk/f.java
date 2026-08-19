package com.tencent.smtt.sdk;

import android.content.Context;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.tencent.smtt.utils.TbsLog;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
class f {
    static int a = 0;
    static boolean b = false;
    private static f e = null;
    private static int h = 0;
    private static int j = 3;
    private static String l;
    private s c = null;
    private s d = null;
    private boolean f = false;
    private boolean g = false;
    private String i = "";
    private File k = null;

    private f() {
    }

    public static f a(boolean z) {
        if (e == null && z) {
            synchronized (f.class) {
                try {
                    if (e == null) {
                        e = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    private void b(int i) {
        FileOutputStream fileOutputStream;
        Throwable e2;
        String strValueOf = String.valueOf(i);
        Properties properties = new Properties();
        properties.setProperty(l, strValueOf);
        try {
            fileOutputStream = new FileOutputStream(new File(this.k, "count.prop"));
            try {
                properties.store(fileOutputStream, (String) null);
            } catch (FileNotFoundException e3) {
                e2 = e3;
                e2.printStackTrace();
            } catch (IOException e4) {
                e2 = e4;
                e2.printStackTrace();
            }
        } catch (FileNotFoundException | IOException e5) {
            fileOutputStream = null;
            e2 = e5;
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static int d() {
        return h;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private int j() throws Throwable {
        BufferedInputStream bufferedInputStream;
        Exception e2;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            File file = new File(this.k, "count.prop");
            if (!file.exists()) {
                return 0;
            }
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    int iIntValue = Integer.valueOf(properties.getProperty(l, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)).intValue();
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    return iIntValue;
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream2 = bufferedInputStream;
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e2 = e5;
                e2.printStackTrace();
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return 0;
            }
        } catch (Exception e7) {
            bufferedInputStream = null;
            e2 = e7;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            throw th;
        }
        e2.printStackTrace();
        if (bufferedInputStream != null) {
            bufferedInputStream.close();
        }
        return 0;
    }

    public s c() {
        return this.c;
    }

    public String e() {
        s sVar = this.c;
        return (sVar == null || QbSdk.a) ? "system webview get nothing..." : sVar.a();
    }

    public String f() {
        s sVar = this.c;
        return (sVar == null || QbSdk.a) ? "system webview get nothing..." : sVar.b();
    }

    public boolean g() throws Throwable {
        if (b) {
            if (l == null) {
                return false;
            }
            int iJ = j();
            if (iJ == 0) {
                b(1);
            } else {
                int i = iJ + 1;
                if (i > j) {
                    return false;
                }
                b(i);
            }
        }
        return b;
    }

    public boolean h() {
        return this.g;
    }

    public boolean i() {
        return QbSdk.useSoftWare();
    }

    public s a() {
        if (this.f) {
            return this.c;
        }
        return null;
    }

    public boolean b() {
        return this.f;
    }

    public static void a(int i) {
        h = i;
    }

    public boolean b(boolean z) {
        b = z;
        return z;
    }

    public synchronized void a(Context context, boolean z, boolean z2) {
        try {
            TbsLog.initIfNeed(context);
            a++;
            TbsLog.i("SDKEngine", "init", "#1# context: " + context + ", mInitCount: " + a);
            if (this.f) {
                return;
            }
            m.a().b(context, a == 1);
            m.a().i(context);
            boolean zA = QbSdk.a(context, z, z2);
            TbsLog.i("SDKEngine", "init", "#2# canLoadX5 is " + zA);
            if (zA) {
                TbsLog.i("SDKEngine", "init", "#3# start to load tbs");
                try {
                    File fileN = m.a().n(context);
                    Context applicationContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                    if (fileN == null) {
                        this.f = false;
                        this.i = "false03";
                        TbsCoreLoadStat.getInstance().a(context, 312, new Throwable());
                        QbSdk.a(context, "SDKEngine::useSystemWebView by tbs_core_share_dir null!");
                        return;
                    }
                    String[] dexLoaderFileList = QbSdk.getDexLoaderFileList(context, applicationContext, fileN.getAbsolutePath());
                    for (int i = 0; i < dexLoaderFileList.length; i++) {
                        TbsLog.i("SDKEngine", "dexLoaderFileList[" + i + "]: " + dexLoaderFileList[i]);
                    }
                    String absolutePath = fileN.getAbsolutePath();
                    TbsLog.i("SDKEngine", "init", "#4# optDir is " + absolutePath);
                    s sVar = this.d;
                    if (sVar != null) {
                        this.c = sVar;
                        sVar.a(context, applicationContext, fileN.getAbsolutePath(), absolutePath, dexLoaderFileList, QbSdk.d);
                    } else {
                        this.c = new s(context, applicationContext, fileN.getAbsolutePath(), absolutePath, dexLoaderFileList, QbSdk.d);
                    }
                    this.f = true;
                    this.i = "true01";
                } catch (Throwable th) {
                    TbsLog.e("SDKEngine", "useSystemWebView by exception: " + th);
                    TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_SDKENGINE_INIT_THROWABLE, th);
                    this.f = false;
                    this.i = "false04";
                    QbSdk.a(context, "SDKEngine::useSystemWebView by exception: " + th);
                }
            } else if (!QbSdk.a || !this.f) {
                this.f = false;
                this.i = "false05";
                TbsLog.e("SDKEngine", "init", "[LoadError] check log upon for details");
            }
            this.k = m.o(context);
            this.g = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void a(String str) {
        l = str;
    }
}
