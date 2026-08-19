package com.tencent.smtt.sdk;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
class l {
    private static l a;
    private static Context b;

    private l() {
    }

    public static l a(Context context) {
        if (a == null) {
            synchronized (l.class) {
                try {
                    if (a == null) {
                        a = new l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b = context.getApplicationContext();
        return a;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r2v4 */
    private Properties e() throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        BufferedInputStream bufferedInputStream;
        Properties properties;
        Exception e;
        int r0 = 0;
        try {
            try {
                File fileA = a();
                properties = new Properties();
                if (fileA != null) {
                    try {
                        fileInputStream = new FileInputStream(fileA);
                        try {
                            bufferedInputStream = new BufferedInputStream(fileInputStream);
                            try {
                                try {
                                    properties.load(bufferedInputStream);
                                    r0 = bufferedInputStream;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (bufferedInputStream != 0) {
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    if (fileInputStream != null) {
                                        throw th;
                                    }
                                    try {
                                        fileInputStream.close();
                                        throw th;
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                        throw th;
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                e.printStackTrace();
                                if (bufferedInputStream != 0) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                    }
                                }
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e6) {
                                        e6.printStackTrace();
                                    }
                                }
                                return properties;
                            }
                        } catch (Exception e7) {
                            bufferedInputStream = 0;
                            e = e7;
                        } catch (Throwable th3) {
                            bufferedInputStream = 0;
                            th = th3;
                            if (bufferedInputStream != 0) {
                                bufferedInputStream.close();
                            }
                            if (fileInputStream != null) {
                                throw th;
                            }
                            fileInputStream.close();
                            throw th;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        fileInputStream = null;
                        properties = properties;
                        e = e;
                        bufferedInputStream = fileInputStream;
                        e.printStackTrace();
                        if (bufferedInputStream != 0) {
                            bufferedInputStream.close();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return properties;
                    }
                } else {
                    fileInputStream = null;
                }
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                return properties;
            } catch (Throwable th4) {
                fileInputStream = null;
                th = th4;
                bufferedInputStream = 0;
            }
        } catch (Exception e11) {
            e = e11;
            properties = 0;
            fileInputStream = null;
        }
    }

    public int b() {
        return c("install_core_ver");
    }

    public int c() {
        return b("install_status");
    }

    public int d() {
        return b("incrupdate_status");
    }

    public File a() {
        File file = new File(m.o(b), "tbscoreinstall.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        return file;
    }

    public int b(String str) {
        Properties propertiesE = e();
        if (propertiesE != null && propertiesE.getProperty(str) != null) {
            try {
                return Integer.parseInt(propertiesE.getProperty(str));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public int c(String str) throws Throwable {
        Properties propertiesE = e();
        if (propertiesE != null && propertiesE.getProperty(str) != null) {
            try {
                return Integer.parseInt(propertiesE.getProperty(str));
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public String d(String str) throws Throwable {
        Properties propertiesE = e();
        if (propertiesE == null || propertiesE.getProperty(str) == null) {
            return null;
        }
        return propertiesE.getProperty(str);
    }

    public void a(int i) {
        a("dexopt_retry_num", i);
    }

    public void b(int i) {
        a("unzip_retry_num", i);
    }

    public void c(int i) {
        a("incrupdate_status", i);
    }

    public void d(int i) {
        a("unlzma_status", i);
    }

    public void a(int i, int i2) {
        a("copy_core_ver", i);
        a("copy_status", i2);
    }

    public void b(int i, int i2) {
        a("tpatch_ver", i);
        a("tpatch_status", i2);
    }

    public void c(int i, int i2) {
        a("install_core_ver", i);
        a("install_status", i2);
    }

    public void a(String str) throws Throwable {
        a("install_apk_path", str);
    }

    public void a(String str, int i) {
        a(str, String.valueOf(i));
    }

    public void a(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    Properties propertiesE = e();
                    if (propertiesE != null) {
                        propertiesE.setProperty(str, str2);
                        File fileA = a();
                        if (fileA != null) {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(fileA);
                            try {
                                propertiesE.store(fileOutputStream2, "update " + str + " and status!");
                                fileOutputStream = fileOutputStream2;
                            } catch (Exception e) {
                                e = e;
                                fileOutputStream = fileOutputStream2;
                                e.printStackTrace();
                                if (fileOutputStream == null) {
                                    return;
                                } else {
                                    fileOutputStream.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }
}
