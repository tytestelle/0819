package com.tencent.smtt.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.tencent.smtt.sdk.TbsDownloader;
import com.tencent.smtt.sdk.TbsExtensionFunctionManager;
import com.tencent.smtt.sdk.TbsPVConfig;
import com.tencent.smtt.sdk.TbsShareManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.jar.JarFile;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static int a(Context context, File file) {
        return a(context, file, 0);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c1 A[Catch: all -> 0x008a, Exception -> 0x00c4, TRY_LEAVE, TryCatch #7 {all -> 0x008a, blocks: (B:16:0x0083, B:20:0x008c, B:26:0x0092, B:27:0x0095, B:42:0x00b7, B:46:0x00bc, B:48:0x00c1, B:49:0x00c4, B:39:0x00b1), top: B:61:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static int b(File file) {
        JarFile jarFile;
        Throwable th;
        BufferedReader bufferedReader;
        Exception e;
        String[] strArrSplit;
        TbsLog.i(TbsDownloader.LOGTAG, "getApkVersionByReadFile" + file + "exists:" + file.exists() + ";canread:" + file.canRead());
        synchronized (a.class) {
            try {
                try {
                    try {
                        jarFile = new JarFile(file);
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(jarFile.getJarEntry("assets/webkit/tbs.conf"))));
                            while (true) {
                                try {
                                    try {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            bufferedReader.close();
                                            break;
                                        }
                                        if (line.contains("tbs_core_version") && (strArrSplit = line.split("=")) != null && strArrSplit.length == 2) {
                                            String strTrim = strArrSplit[1].trim();
                                            TbsLog.i(TbsDownloader.LOGTAG, "getApkVersionByReadFile version is " + strTrim);
                                            int i = Integer.parseInt(strTrim);
                                            try {
                                                bufferedReader.close();
                                                jarFile.close();
                                            } catch (Exception unused) {
                                            }
                                            return i;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                                if (jarFile != null) {
                                                    jarFile.close();
                                                }
                                            } catch (Exception unused2) {
                                                throw th;
                                            }
                                        } else if (jarFile != null) {
                                            jarFile.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    TbsLog.i(e);
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (jarFile != null) {
                                        break;
                                    }
                                    return -1;
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            bufferedReader = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader = null;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                                if (jarFile != null) {
                                    jarFile.close();
                                }
                            } else if (jarFile != null) {
                                jarFile.close();
                            }
                            throw th;
                        }
                    } catch (Exception e4) {
                        jarFile = null;
                        e = e4;
                        bufferedReader = null;
                    } catch (Throwable th4) {
                        jarFile = null;
                        th = th4;
                        bufferedReader = null;
                    }
                    jarFile.close();
                } catch (Exception unused3) {
                }
                return -1;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public static int a(Context context, File file, int i) {
        try {
            return a(context, file, !TbsExtensionFunctionManager.getInstance().canUseFunction(context, TbsExtensionFunctionManager.DISABLE_GET_APK_VERSION_SWITCH_FILE_NAME), i);
        } catch (Exception unused) {
            TbsLog.i("ApkUtil", "getApkVersion Failed");
            return 0;
        }
    }

    public static int a(Context context, File file, boolean z, int i) {
        int iB;
        if (file != null) {
            try {
                if (file.exists()) {
                    boolean zContains = file.getName().contains("tbs.org");
                    boolean zContains2 = file.getName().contains("x5.tbs.decouple");
                    if (zContains || zContains2) {
                        int iA = a(zContains2, file, i);
                        if (iA > 0) {
                            return iA;
                        }
                        if (!TbsShareManager.isThirdPartyApp(context) && !file.getAbsolutePath().contains(context.getApplicationInfo().packageName)) {
                            return 0;
                        }
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    boolean z2 = (i2 == 23 || i2 == 25) && Build.MANUFACTURER.toLowerCase().contains("mi");
                    TbsPVConfig.releaseInstance();
                    int readApk = TbsPVConfig.getInstance(context).getReadApk();
                    if (readApk == 1) {
                        z = false;
                        z2 = false;
                    } else if (readApk == 2) {
                        return 0;
                    }
                    if ((z || z2) && (iB = b(file)) > 0) {
                        return iB;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (file == null || !file.exists()) {
            return 0;
        }
        try {
            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 1);
            if (packageArchiveInfo != null) {
                return packageArchiveInfo.versionCode;
            }
            return 0;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return -1;
        }
    }

    private static int a(boolean z, File file, int i) {
        try {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                return -1;
            }
            File[] fileArrListFiles = parentFile.listFiles();
            Pattern patternCompile = Pattern.compile(a(z, i) + "(.*)");
            for (File file2 : fileArrListFiles) {
                if (patternCompile.matcher(file2.getName()).find() && file2.isFile() && file2.exists()) {
                    return Integer.parseInt(file2.getName().substring(file2.getName().lastIndexOf(".") + 1));
                }
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String a(File file) {
        FileInputStream fileInputStream;
        int i;
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[32];
        FileInputStream fileInputStream2 = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i2);
                        th = th;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        throw th;
                    }
                    byte[] bArrDigest = messageDigest.digest();
                    int i3 = 0;
                    for (i = 0; i < 16; i++) {
                        byte b = bArrDigest[i];
                        int i4 = i3 + 1;
                        cArr2[i3] = cArr[(b >>> 4) & 15];
                        i3 += 2;
                        cArr2[i4] = cArr[b & 15];
                    }
                    String str = new String(cArr2);
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return str;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                }
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final String a(boolean z, int i) {
        boolean zC;
        if (i == 64) {
            zC = true;
        } else {
            zC = i == 32 ? false : b.c();
        }
        if (zC) {
            return z ? "x5.64.decouple.backup" : "x5.64.backup";
        }
        return z ? "x5.decouple.backup" : "x5.backup";
    }
}
