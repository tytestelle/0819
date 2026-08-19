package com.tencent.smtt.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static String a = "";
    public static String b = "";
    public static String c = "";
    public static String d = "";
    public static String e = "";
    public static String f = "";
    private static boolean g;
    private static boolean h;
    private static boolean i;

    public static String a() {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        String strB = "os.arch";
        if (!h) {
            String strB2 = null;
            try {
                inputStreamReader = new InputStreamReader(Runtime.getRuntime().exec("getprop ro.product.cpu.abi").getInputStream());
                try {
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        try {
                            strB = b(bufferedReader.readLine().contains("x86") ? "i686" : System.getProperty("os.arch"));
                            if (strB != null) {
                                c = strB;
                            }
                            try {
                                bufferedReader.close();
                            } catch (IOException unused) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                strB2 = b(System.getProperty(strB));
                                th.printStackTrace();
                                if (strB2 != null) {
                                    c = strB2;
                                }
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                if (inputStreamReader != null) {
                                }
                                h = true;
                                return c;
                            } catch (Throwable th2) {
                                if (strB2 != null) {
                                    c = strB2;
                                }
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                if (inputStreamReader == null) {
                                    throw th2;
                                }
                                try {
                                    inputStreamReader.close();
                                    throw th2;
                                } catch (IOException unused4) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = null;
                    }
                    inputStreamReader.close();
                } catch (IOException unused5) {
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                inputStreamReader = null;
            }
            h = true;
        }
        return c;
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String c(Context context) {
        try {
            return TbsDownloadConfig.getInstance(context).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_GUID, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(Context context) {
        if (!g) {
            try {
                if (TextUtils.isEmpty(a)) {
                    a = k.a(context);
                }
            } catch (Exception e2) {
                TbsLog.i(e2);
            }
            g = true;
        }
        return a;
    }

    public static String e(Context context) {
        return "";
    }

    public static String f(Context context) {
        return "02:00:00:00:00:00";
    }

    public static String g(Context context) {
        return "";
    }

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String b(String str) {
        return str == null ? "" : str;
    }

    public static boolean c() {
        Object objInvoke;
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method declaredMethod2 = cls.getDeclaredMethod("getRuntime", null);
            if (declaredMethod2 == null || (objInvoke = declaredMethod2.invoke(null, null)) == null || (declaredMethod = cls.getDeclaredMethod("is64Bit", null)) == null) {
                return false;
            }
            Object objInvoke2 = declaredMethod.invoke(objInvoke, null);
            if (objInvoke2 instanceof Boolean) {
                return ((Boolean) objInvoke2).booleanValue();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    private static String a(Context context, File file) {
        Signature signature;
        try {
            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 65);
            if (packageArchiveInfo == null) {
                signature = null;
            } else {
                Signature[] signatureArr = packageArchiveInfo.signatures;
                if (signatureArr == null || signatureArr.length <= 0) {
                    TbsLog.w("AppUtil", "[getSignatureFromApk] pkgInfo is not null BUT signatures is null!");
                    signature = null;
                } else {
                    signature = signatureArr[0];
                }
            }
            if (signature != null) {
                return signature.toCharsString();
            }
            return null;
        } catch (Exception unused) {
            TbsLog.i("AppUtil", "getSign " + file + "failed");
            return null;
        }
    }

    public static void b(Context context, String str) {
        try {
            TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_GUID, str);
            tbsDownloadConfig.commit();
        } catch (Exception unused) {
        }
    }

    public static String a(Context context, String str) {
        String strValueOf = null;
        try {
            strValueOf = String.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
            return String.valueOf(Integer.toHexString(Integer.parseInt(strValueOf)));
        } catch (Exception unused) {
            return strValueOf;
        }
    }

    public static boolean b() {
        Matcher matcher;
        try {
            matcher = Pattern.compile("i686|mips|x86_64|x86").matcher(c);
        } catch (Exception unused) {
            matcher = null;
        }
        return matcher == null || !matcher.find();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static String a(Context context, boolean z, File file) throws Throwable {
        if (file == null || !file.exists()) {
            return "";
        }
        if (z) {
            int r2 = 0;
            RandomAccessFile randomAccessFile = null;
            r2 = 0;
            try {
                try {
                    byte[] bArr = new byte[2];
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                    try {
                        randomAccessFile2.read(bArr);
                        String str = new String(bArr);
                        if (!str.equalsIgnoreCase("PK")) {
                            try {
                                randomAccessFile2.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            return "";
                        }
                        randomAccessFile2.close();
                        r2 = str;
                    } catch (Exception e3) {
                        e = e3;
                        randomAccessFile = randomAccessFile2;
                        e.printStackTrace();
                        randomAccessFile.close();
                        r2 = randomAccessFile;
                    } catch (Throwable th) {
                        th = th;
                        r2 = randomAccessFile2;
                        try {
                            r2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        }
        try {
            if (context.getApplicationContext().getPackageName().contains("com.jd.jrapp")) {
                TbsLog.i("AppUtil", "[AppUtil.getSignatureFromApk]  #1");
                String strA = a(file);
                if (strA != null) {
                    TbsLog.i("AppUtil", "[AppUtil.getSignatureFromApk]  #2");
                    return strA;
                }
            }
        } catch (Throwable unused) {
            TbsLog.i("AppUtil", "[AppUtil.getSignatureFromApk]  #3");
        }
        TbsLog.i("AppUtil", "[AppUtil.getSignatureFromApk]  #4");
        String strA2 = a(context, file);
        TbsLog.i("AppUtil", "[AppUtil.getSignatureFromApk]  android api signature=" + strA2);
        if (strA2 != null) {
            return strA2;
        }
        String strA3 = a(file);
        TbsLog.i("AppUtil", "[AppUtil.getSignatureFromApk]  java get signature=" + strA3);
        return strA3;
    }

    private static String a(File file) {
        try {
            JarFile jarFile = new JarFile(file);
            byte[] bArr = new byte[8192];
            String strA = a(a(jarFile, jarFile.getJarEntry("AndroidManifest.xml"), bArr)[0].getEncoded());
            Enumeration<JarEntry> enumerationEntries = jarFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                String name = jarEntryNextElement.getName();
                if (name != null) {
                    Certificate[] certificateArrA = a(jarFile, jarEntryNextElement, bArr);
                    String strA2 = certificateArrA != null ? a(certificateArrA[0].getEncoded()) : null;
                    if (strA2 == null) {
                        if (!name.startsWith("META-INF/")) {
                            return null;
                        }
                    } else if (!strA2.equals(strA)) {
                        return null;
                    }
                }
            }
            return strA;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        for (int i2 = 0; i2 < length; i2++) {
            byte b2 = bArr[i2];
            int i3 = (b2 >> 4) & 15;
            int i4 = i2 * 2;
            cArr[i4] = (char) (i3 >= 10 ? i3 + 87 : i3 + 48);
            int i5 = b2 & 15;
            cArr[i4 + 1] = (char) (i5 >= 10 ? i5 + 87 : i5 + 48);
        }
        return new String(cArr);
    }

    public static void a(String str, boolean z) {
        if (z) {
            str = k.a(str);
        }
        a = str;
    }

    public static boolean a(String str) {
        Matcher matcher;
        try {
            matcher = Pattern.compile("i686|mips|x86_64|x86").matcher(str);
        } catch (Exception unused) {
            matcher = null;
        }
        return matcher == null || !matcher.find();
    }

    private static Certificate[] a(JarFile jarFile, JarEntry jarEntry, byte[] bArr) throws IOException {
        InputStream inputStream = jarFile.getInputStream(jarEntry);
        while (inputStream.read(bArr, 0, bArr.length) != -1) {
        }
        inputStream.close();
        if (jarEntry != null) {
            return jarEntry.getCertificates();
        }
        return null;
    }
}
