package com.tencent.smtt.sdk;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import dalvik.system.DexClassLoader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
class m {
    private static m c;
    private FileLock e;
    private FileOutputStream f;
    private QbSdk.a o;
    private static final ReentrantLock h = new ReentrantLock();
    private static final Lock i = new ReentrantLock();
    private static FileLock k = null;
    private static final ThreadLocal<Integer> l = new ThreadLocal<Integer>() { // from class: com.tencent.smtt.sdk.m.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer initialValue() {
            return 0;
        }
    };
    private static Handler m = null;
    static boolean a = false;
    static final FileFilter b = new FileFilter() { // from class: com.tencent.smtt.sdk.m.2
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (name == null || name.endsWith(".jar_is_first_load_dex_flag_file")) {
                return false;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (name.endsWith(".dex")) {
                return false;
            }
            if (i2 < 26 || !name.endsWith(".prof")) {
                return i2 < 26 || !name.equals("oat");
            }
            return false;
        }
    };
    private static int n = 0;
    private int d = 0;
    private boolean g = false;
    private boolean j = false;
    private int p = -1;

    private m() {
        if (m == null) {
            m = new Handler(TbsHandlerThread.getInstance().getLooper()) { // from class: com.tencent.smtt.sdk.m.3
                @Override // android.os.Handler
                public void handleMessage(Message message) throws Throwable {
                    QbSdk.setTBSInstallingStatus(true);
                    int i2 = message.what;
                    if (i2 == 1) {
                        TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE");
                        Object[] objArr = (Object[]) message.obj;
                        m.this.b((Context) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue());
                        return;
                    }
                    if (i2 == 2) {
                        TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_COPY_TBS_CORE");
                        Object[] objArr2 = (Object[]) message.obj;
                        m.this.a((Context) objArr2[0], (Context) objArr2[1], ((Integer) objArr2[2]).intValue());
                    } else if (i2 == 3) {
                        TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE_EX");
                        Object[] objArr3 = (Object[]) message.obj;
                        m.this.b((Context) objArr3[0], (Bundle) objArr3[1]);
                    } else {
                        if (i2 != 4) {
                            return;
                        }
                        TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_UNZIP_TBS_CORE");
                        Object[] objArr4 = (Object[]) message.obj;
                        m.this.a((Context) objArr4[0], (File) objArr4[1], ((Integer) objArr4[2]).intValue());
                        QbSdk.setTBSInstallingStatus(false);
                        super.handleMessage(message);
                    }
                }
            };
        }
    }

    private int c(Context context, Bundle bundle) throws Throwable {
        try {
            Bundle bundleA = QbSdk.a(context, bundle);
            TbsLog.i("TbsInstaller", "tpatch finished,ret is" + bundleA);
            int i2 = bundleA.getInt("patch_result");
            if (i2 != 0) {
                String string = bundle.getString("new_apk_location");
                if (!TextUtils.isEmpty(string)) {
                    FileUtil.b(new File(string));
                }
                TbsLogReport.getInstance(context).setInstallErrorCode(i2, "tpatch fail,patch error_code=" + i2);
                return 1;
            }
            String string2 = bundle.getString("new_apk_location");
            int i3 = bundle.getInt("new_core_ver");
            int iA = a(new File(string2));
            TbsLog.i("TbsInstaller", "doTpatch version is " + i3 + " patchVersion is " + iA);
            if (i3 == iA) {
                TbsLog.i("TbsInstaller", "Tpatch success!");
                TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.TPATCH_INSTALL_SUCCESS, "");
                return 0;
            }
            TbsLog.i("TbsInstaller", "version not equals!!!" + i3 + "patchVersion:" + iA);
            TbsLogReport.getInstance(context).setInstallErrorCode(240, "version=" + i3 + ",patchVersion=" + iA);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, "patch exception" + Log.getStackTraceString(e));
            return 1;
        }
    }

    public static File o(Context context) {
        File file = new File(QbSdk.getTbsFolderDir(context), "core_private");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    private int q(Context context) {
        boolean z = l.a(context).d() == 1;
        boolean zA = TbsDownloader.a(context);
        if (z) {
            return zA ? TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_SUCCESS : TbsListener.ErrorCode.INCRUPDATE_INSTALL_SUCCESS;
        }
        if (zA) {
            return TbsListener.ErrorCode.DECOUPLE_INSTLL_SUCCESS;
        }
        return 200;
    }

    private static boolean r(Context context) {
        String str;
        if (context == null) {
            str = "#1#";
        } else {
            try {
                if (new File(QbSdk.getTbsFolderDir(context), "tmp_folder_core_to_read.conf").exists()) {
                    TbsLog.i("TbsInstaller", "getTmpFolderCoreToRead", "#2#");
                    return true;
                }
                TbsLog.i("TbsInstaller", "getTmpFolderCoreToRead", "#3#");
                return false;
            } catch (Exception unused) {
                str = "#4#";
            }
        }
        TbsLog.i("TbsInstaller", "getTmpFolderCoreToRead", str);
        return true;
    }

    private boolean s(Context context) {
        TbsLog.i("TbsInstaller", "Tbsinstaller getTbsCoreRenameFileLock #1 ");
        FileLock fileLockE = FileUtil.e(context);
        k = fileLockE;
        if (fileLockE == null) {
            TbsLog.i("TbsInstaller", "getTbsCoreRenameFileLock## failed!");
            return false;
        }
        TbsLog.i("TbsInstaller", "Tbsinstaller getTbsCoreRenameFileLock true ");
        return true;
    }

    private void t(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip");
        if (!s(context)) {
            TbsLog.i("TbsInstaller", "get rename fileLock#4 ## failed!");
            return;
        }
        try {
            v(context);
            w(context);
            TbsLog.i("TbsInstaller", "after renameTbsCoreShareDir");
            TbsLog.i("TbsInstaller", "is thirdapp and not chmod");
            l.a(context).a(0);
            l.a(context).b(0);
            l.a(context).d(0);
            l.a(context).a("incrupdate_retry_num", 0);
            l.a(context).c(0, 3);
            l.a(context).a("");
            l.a(context).a("tpatch_num", 0);
            l.a(context).c(-1);
            l.set(0);
            n = 0;
        } catch (Throwable th) {
            th.printStackTrace();
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.RENAME_EXCEPTION, "exception when renameing from unzip:" + th.toString());
            TbsLog.e("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip Exception", true);
        }
        e(context);
    }

    private void u(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromTpatch");
        if (!s(context)) {
            TbsLog.i("TbsInstaller", "get rename fileLock#4 ## failed!");
            return;
        }
        try {
            v(context);
            x(context);
            l.a(context).b(0, -1);
            l.a(context).a("tpatch_num", 0);
            l.set(0);
        } catch (Exception e) {
            e.printStackTrace();
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, "exception when renameing from tpatch:" + e.toString());
        }
        e(context);
    }

    private void v(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--deleteOldCore");
        FileUtil.a(n(context), false, true);
    }

    private void w(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--renameShareDir");
        File fileE = e(context, 0);
        File fileN = n(context);
        if (fileE == null || fileN == null) {
            TbsLog.i("TbsInstaller", "renameTbsCoreShareDir return,tmpTbsCoreUnzipDir=" + fileE + "tbsSharePath=" + fileN);
            return;
        }
        boolean zRenameTo = fileE.renameTo(fileN);
        if (zRenameTo && this.o != null) {
            this.o.a(fileN.listFiles(new FileFilter() { // from class: com.tencent.smtt.sdk.m.4
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return file.getName().contains(".so");
                }
            }));
        }
        TbsLog.i("TbsInstaller", "renameTbsCoreShareDir rename success=" + zRenameTo);
        e(context, false);
    }

    private void x(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--renameTbsTpatchCoreDir");
        File fileE = e(context, 5);
        File fileN = n(context);
        if (fileE == null || fileN == null) {
            return;
        }
        if (fileE.renameTo(fileN) && this.o != null) {
            this.o.a(fileN.listFiles(new FileFilter() { // from class: com.tencent.smtt.sdk.m.5
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return file.getName().contains(".so");
                }
            }));
        }
        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #09");
        e(context, false);
    }

    private void y(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--clearNewTbsCore");
        File fileE = e(context, 0);
        if (fileE != null) {
            FileUtil.a(fileE, false);
        }
        l.a(context).c(0, 5);
        l.a(context).c(-1);
        QbSdk.a(context, "TbsInstaller::clearNewTbsCore forceSysWebViewInner!");
    }

    public int a(File file) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            TbsLog.i("TbsInstaller", "TbsInstaller--getTbsVersion  tbsShareDir is " + file);
            File file2 = new File(file, "tbs.conf");
            if (!file2.exists()) {
                return 0;
            }
            Properties properties = new Properties();
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
            try {
                properties.load(bufferedInputStream2);
                bufferedInputStream2.close();
                String property = properties.getProperty("tbs_core_version");
                if (property == null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return 0;
                }
                int i2 = Integer.parseInt(property);
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused2) {
                }
                return i2;
            } catch (Exception unused3) {
                bufferedInputStream = bufferedInputStream2;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (IOException unused6) {
            }
        }
        return 0;
    }

    public int b(Context context) {
        if (!r(context)) {
            return 0;
        }
        if (a(context, "core_unzip_tmp")) {
            return -1;
        }
        if (a(context, "core_share_backup_tmp")) {
            return -2;
        }
        if (a(context, "core_copy_tmp")) {
            return -3;
        }
        return a(context, "tpatch_tmp") ? -4 : 1;
    }

    public int d(Context context, int i2) {
        return a(e(context, i2));
    }

    public File e(Context context, int i2) {
        return a(context, i2, true);
    }

    public int f(Context context) {
        BufferedInputStream bufferedInputStream = null;
        try {
            File file = new File(m(context), "tbs.conf");
            if (!file.exists()) {
                return 0;
            }
            Properties properties = new Properties();
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                properties.load(bufferedInputStream2);
                bufferedInputStream2.close();
                String property = properties.getProperty("tbs_core_version");
                if (property == null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return 0;
                }
                int i2 = Integer.parseInt(property);
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused2) {
                }
                return i2;
            } catch (Exception unused3) {
                bufferedInputStream = bufferedInputStream2;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (IOException unused6) {
            }
        }
        return 0;
    }

    public int g(Context context) {
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                File file = new File(n(context), "tbs.conf");
                if (!file.exists()) {
                    return 0;
                }
                TbsLog.i("TbsInstaller", "getTbsCoreInstalledVerInNolock tbsPropFile is " + file.getAbsolutePath());
                Properties properties = new Properties();
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    properties.load(bufferedInputStream2);
                    bufferedInputStream2.close();
                    String property = properties.getProperty("tbs_core_version");
                    if (property == null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e) {
                            TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock IOException=" + e.toString());
                        }
                        return 0;
                    }
                    int i2 = Integer.parseInt(property);
                    if (n == 0) {
                        n = i2;
                    }
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException e2) {
                        TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock IOException=" + e2.toString());
                    }
                    return i2;
                } catch (Exception e3) {
                    e = e3;
                    bufferedInputStream = bufferedInputStream2;
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e4) {
                            TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock IOException=" + e4.toString());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
        TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock Exception=" + e.toString());
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (IOException e6) {
                TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock IOException=" + e6.toString());
            }
        }
        return 0;
    }

    public int h(Context context) {
        int i2 = n;
        return i2 != 0 ? i2 : g(context);
    }

    public void i(Context context) {
        if (n != 0) {
            return;
        }
        n = g(context);
    }

    public boolean j(Context context) {
        return new File(n(context), "tbs.conf").exists();
    }

    public int k(Context context) {
        if (!p(context)) {
            return -1;
        }
        ReentrantLock reentrantLock = h;
        boolean zTryLock = reentrantLock.tryLock();
        TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock locked=" + zTryLock);
        if (!zTryLock) {
            c();
            return 0;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                File file = new File(n(context), "tbs.conf");
                if (!file.exists()) {
                    try {
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                    } catch (Throwable th) {
                        TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th);
                    }
                    c();
                    return 0;
                }
                Properties properties = new Properties();
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    properties.load(bufferedInputStream2);
                    bufferedInputStream2.close();
                    String property = properties.getProperty("tbs_core_version");
                    if (property == null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e) {
                            TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock IOException=" + e.toString());
                        }
                        try {
                            ReentrantLock reentrantLock2 = h;
                            if (reentrantLock2.isHeldByCurrentThread()) {
                                reentrantLock2.unlock();
                            }
                        } catch (Throwable th2) {
                            TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th2);
                        }
                        c();
                        return 0;
                    }
                    ThreadLocal<Integer> threadLocal = l;
                    threadLocal.set(Integer.valueOf(Integer.parseInt(property)));
                    int iIntValue = threadLocal.get().intValue();
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException e2) {
                        TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock IOException=" + e2.toString());
                    }
                    try {
                        ReentrantLock reentrantLock3 = h;
                        if (reentrantLock3.isHeldByCurrentThread()) {
                            reentrantLock3.unlock();
                        }
                    } catch (Throwable th3) {
                        TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th3);
                    }
                    c();
                    return iIntValue;
                } catch (Exception e3) {
                    e = e3;
                    bufferedInputStream = bufferedInputStream2;
                    TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock Exception=" + e.toString());
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e4) {
                            TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock IOException=" + e4.toString());
                        }
                    }
                    try {
                        ReentrantLock reentrantLock4 = h;
                        if (reentrantLock4.isHeldByCurrentThread()) {
                            reentrantLock4.unlock();
                        }
                    } catch (Throwable th4) {
                        TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th4);
                    }
                    c();
                    return 0;
                } catch (Throwable th5) {
                    th = th5;
                    bufferedInputStream = bufferedInputStream2;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (IOException e6) {
                TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock IOException=" + e6.toString());
            }
        }
        try {
            ReentrantLock reentrantLock5 = h;
            if (reentrantLock5.isHeldByCurrentThread()) {
                reentrantLock5.unlock();
            }
        } catch (Throwable th7) {
            TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th7);
        }
        c();
        throw th;
    }

    public void l(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--cleanStatusAndTmpDir");
        l.a(context).a(0);
        l.a(context).b(0);
        l.a(context).d(0);
        l.a(context).a("incrupdate_retry_num", 0);
        if (TbsDownloader.a(context)) {
            return;
        }
        l.a(context).c(0, -1);
        l.a(context).a("");
        l.a(context).a("copy_retry_num", 0);
        l.a(context).c(-1);
        l.a(context).a(0, -1);
        FileUtil.a(e(context, 0), true);
        FileUtil.a(e(context, 1), true);
    }

    public File m(Context context) {
        File file = new File(QbSdk.getTbsFolderDir(context), "core_share_decouple");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    public File n(Context context) {
        File file = new File(QbSdk.getTbsFolderDir(context), "core_share");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        TbsLog.i("TbsInstaller", "getTbsCoreShareDir,mkdir false");
        return null;
    }

    public synchronized boolean p(Context context) {
        if (this.d > 0) {
            TbsLog.i("TbsInstaller", "getTbsInstallingFileLock success,is cached= true");
            this.d++;
            return true;
        }
        FileOutputStream fileOutputStreamB = FileUtil.b(context, true, "tbslock.txt");
        this.f = fileOutputStreamB;
        if (fileOutputStreamB == null) {
            TbsLog.i("TbsInstaller", "getTbsInstallingFileLock get install fos failed");
            return false;
        }
        FileLock fileLockA = FileUtil.a(context, fileOutputStreamB);
        this.e = fileLockA;
        if (fileLockA == null) {
            TbsLog.i("TbsInstaller", "getTbsInstallingFileLock tbsFileLockFileLock == null");
            return false;
        }
        TbsLog.i("TbsInstaller", "getTbsInstallingFileLock success,is cached= false");
        this.d++;
        return true;
    }

    private void f(Context context, int i2) {
        TbsLog.i("TbsInstaller", "proceedTpatchStatus,result=" + i2);
        if (i2 != 0) {
            return;
        }
        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #03");
        e(context, true);
        l.a(context).b(TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0), 1);
    }

    private boolean g(Context context, int i2) {
        File fileE;
        boolean z;
        TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt start - dirMode: " + i2);
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fileE = e(context, 1);
                } else {
                    if (i2 != 2) {
                        TbsLog.e("TbsInstaller", "doDexoptOrDexoat mode error: " + i2);
                        return false;
                    }
                    fileE = n(context);
                }
            } else {
                if (TbsDownloader.a(context)) {
                    return true;
                }
                fileE = e(context, 0);
            }
            try {
                String property = System.getProperty("java.vm.version");
                z = property != null && property.startsWith(ExifInterface.GPS_MEASUREMENT_2D);
            } catch (Throwable th) {
                TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DEXOAT_EXCEPTION, th);
            }
            boolean z2 = Build.VERSION.SDK_INT == 23;
            boolean z3 = TbsDownloadConfig.getInstance(context).mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_STOP_PRE_OAT, false);
            if (z && z2 && !z3 && d(context, fileE)) {
                TbsLog.i("TbsInstaller", "doTbsDexOpt -- doDexoatForArtVm");
                return true;
            }
            if (!z) {
                TbsLog.i("TbsInstaller", "doTbsDexOpt -- doDexoptForDavlikVM");
                return c(context, fileE);
            }
            TbsLog.i("TbsInstaller", "doTbsDexOpt -- is ART mode, skip!");
            TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt done");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DEXOPT_EXCEPTION, e.toString());
        }
    }

    public int a(boolean z, Context context) {
        if (z || l.get().intValue() <= 0) {
            l.set(Integer.valueOf(g(context)));
        }
        return l.get().intValue();
    }

    public int b(Context context, String str) {
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 0);
        if (packageArchiveInfo != null) {
            return packageArchiveInfo.versionCode;
        }
        return 0;
    }

    @Deprecated
    public Context c(Context context, int i2) {
        return null;
    }

    public void d(Context context) {
        BufferedInputStream bufferedInputStream;
        try {
            File file = new File(n(context), "tbs.conf");
            Properties properties = new Properties();
            BufferedOutputStream bufferedOutputStream = null;
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    properties.load(bufferedInputStream);
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                    try {
                        properties.setProperty("tbs_local_installation", "false");
                        properties.store(bufferedOutputStream2, (String) null);
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException unused) {
                        }
                    } catch (Throwable unused2) {
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (bufferedInputStream == null) {
                            return;
                        }
                    }
                } catch (Throwable unused4) {
                }
            } catch (Throwable unused5) {
                bufferedInputStream = null;
            }
            bufferedInputStream.close();
        } catch (Throwable unused6) {
        }
    }

    public void e(Context context) {
        FileLock fileLock = k;
        if (fileLock != null) {
            FileUtil.a(context, fileLock);
        }
    }

    public static synchronized m a() {
        try {
            if (c == null) {
                synchronized (m.class) {
                    try {
                        if (c == null) {
                            c = new m();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c;
    }

    public static void b() {
        l.set(0);
    }

    private boolean d(Context context, File file) {
        try {
            File file2 = new File(file, "tbs_sdk_extension_dex.jar");
            File file3 = new File(file, "tbs_sdk_extension_dex.dex");
            new DexClassLoader(file2.getAbsolutePath(), file.getAbsolutePath(), null, context.getClassLoader());
            String strA = d.a(context, file3.getAbsolutePath());
            if (TextUtils.isEmpty(strA)) {
                TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DEXOAT_EXCEPTION, "can not find oat command");
                return false;
            }
            for (File file4 : file.listFiles(new FileFilter() { // from class: com.tencent.smtt.sdk.m.7
                @Override // java.io.FileFilter
                public boolean accept(File file5) {
                    return file5.getName().endsWith(".jar");
                }
            })) {
                String strSubstring = file4.getName().substring(0, file4.getName().length() - 4);
                Runtime.getRuntime().exec("/system/bin/dex2oat " + strA.replaceAll("tbs_sdk_extension_dex", strSubstring) + " --dex-location=" + a().n(context) + File.separator + strSubstring + ".jar").waitFor();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DEXOAT_EXCEPTION, e);
            return false;
        }
    }

    private void e(Context context, boolean z) {
        if (context == null) {
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, "setTmpFolderCoreToRead context is null");
            TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner return #01");
            return;
        }
        try {
            File file = new File(QbSdk.getTbsFolderDir(context), "tmp_folder_core_to_read.conf");
            if (!z) {
                TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner tmp file delete #01");
                FileUtil.b(file);
            } else if (file.exists()) {
                TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner tmp file already exist #01");
            } else {
                TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner tmp file create #01");
                file.createNewFile();
            }
        } catch (Exception e) {
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, "setTmpFolderCoreToRead Exception message is " + e.getMessage() + " Exception cause is " + e.getCause());
            TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner exception #01");
        }
    }

    public synchronized void c() {
        int i2 = this.d;
        if (i2 <= 0) {
            TbsLog.i("TbsInstaller", "releaseTbsInstallingFileLock currentTbsFileLockStackCount=" + this.d + "call stack:" + Log.getStackTraceString(new Throwable()));
            return;
        }
        if (i2 > 1) {
            TbsLog.i("TbsInstaller", "releaseTbsInstallingFileLock with skip");
            this.d--;
        } else {
            if (i2 == 1) {
                TbsLog.i("TbsInstaller", "releaseTbsInstallingFileLock without skip");
                FileUtil.a(this.e, this.f);
                this.d = 0;
            }
        }
    }

    private synchronized boolean d(Context context, boolean z) {
        if (context != null) {
            try {
                if (TbsConfig.APP_WX.equals(context.getApplicationContext().getApplicationInfo().packageName)) {
                    TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.INSTALL_FROM_UNZIP, " ");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "canRenameTmpDir =" + z);
        TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "#1#");
        boolean z2 = false;
        try {
            if (!p(context)) {
                return false;
            }
            TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "#2# getInstallFileLock Success!!");
            ReentrantLock reentrantLock = h;
            boolean zTryLock = reentrantLock.tryLock();
            TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "locked=" + zTryLock);
            if (zTryLock) {
                try {
                    int iC = l.a(context).c();
                    TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip installStatus=" + iC);
                    int iA = a(false, context);
                    if (iC == 2) {
                        TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "#4# In Rename Logic");
                        if (iA == 0) {
                            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip tbsCoreInstalledVer = 0", false);
                        } else if (z) {
                            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip tbsCoreInstalledVer != 0", false);
                        }
                        t(context);
                        z2 = true;
                    }
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    h.unlock();
                    throw th2;
                }
            }
            c();
            return z2;
        } catch (Exception e) {
            QbSdk.a(context, "TbsInstaller::enableTbsCoreFromUnzip Exception: " + e);
            e.printStackTrace();
        }
    }

    public File a(Context context, int i2, boolean z) {
        String str;
        String str2;
        File tbsFolderDir = QbSdk.getTbsFolderDir(context);
        switch (i2) {
            case 0:
                str = "core_unzip_tmp";
                break;
            case 1:
                str = "core_copy_tmp";
                break;
            case 2:
                str = "core_unzip_tmp_decouple";
                break;
            case 3:
                str = "core_share_backup";
                break;
            case 4:
                str = "core_share_backup_tmp";
                break;
            case 5:
                str = "tpatch_tmp";
                break;
            case 6:
                str = "tpatch_decouple_tmp";
                break;
            default:
                str = "";
                break;
        }
        TbsLog.i("TbsInstaller", "type=" + i2 + "needMakeDir=" + z + "folder=" + str);
        File file = new File(tbsFolderDir, str);
        if (!file.isDirectory()) {
            if (z) {
                str2 = file.mkdir() ? "getCoreDir,no need mkdir" : "getCoreDir,mkdir false";
            }
            TbsLog.i("TbsInstaller", str2);
            return null;
        }
        return file;
    }

    public void b(Context context, Bundle bundle) throws Throwable {
        TbsLog.i("TbsInstaller", "TbsInstaller installLocalTbsCoreExInThreadthread " + Thread.currentThread().getName() + Log.getStackTraceString(new Throwable()));
        if (c(context)) {
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-539);
            return;
        }
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTesCoreExInThread");
        if (bundle == null || context == null) {
            return;
        }
        if (!FileUtil.b(context)) {
            long jA = com.tencent.smtt.utils.s.a();
            long downloadMinFreeSpace = TbsDownloadConfig.getInstance(context).getDownloadMinFreeSpace();
            TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
            StringBuilder sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(jA, "rom is not enough when patching tbs core! curAvailROM=", ",minReqRom=");
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(downloadMinFreeSpace);
            tbsLogReport.setInstallErrorCode(TbsListener.ErrorCode.ROM_NOT_ENOUGH, sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.toString());
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-540);
            return;
        }
        if (!p(context)) {
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-541);
            return;
        }
        Lock lock = i;
        boolean zTryLock = lock.tryLock();
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTesCoreExInThread locked=" + zTryLock);
        if (!zTryLock) {
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-547);
            c();
            return;
        }
        int i2 = TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, 0);
        int i3 = 2;
        try {
            try {
                try {
                    QbSdk.setTBSInstallingStatus(true);
                    if (i2 != 5 && i2 != 3) {
                        if (g(context) > 0) {
                            try {
                                if (l.a(context).d() != 1) {
                                    if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 0) {
                                        int iC = l.a(context).c("incrupdate_retry_num");
                                        if (iC > 5) {
                                            TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTesCoreExInThread exceed incrupdate num");
                                            String string = bundle.getString("old_apk_location");
                                            String string2 = bundle.getString("new_apk_location");
                                            String string3 = bundle.getString("diff_file_location");
                                            if (!TextUtils.isEmpty(string)) {
                                                FileUtil.b(new File(string));
                                            }
                                            if (!TextUtils.isEmpty(string2)) {
                                                FileUtil.b(new File(string2));
                                            }
                                            if (!TextUtils.isEmpty(string3)) {
                                                FileUtil.b(new File(string3));
                                            }
                                            TbsDownloadConfig.getInstance(context).mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.TRUE);
                                            TbsDownloadConfig.getInstance(context).commit();
                                            TbsLogReport.getInstance(context).setInstallErrorCode(224, "incrUpdate exceed retry max num");
                                            lock.unlock();
                                            c();
                                            if (i2 == 5) {
                                                f(context, 2);
                                            }
                                            QbSdk.setTBSInstallingStatus(false);
                                            return;
                                        }
                                        l.a(context).a("incrupdate_retry_num", iC + 1);
                                        File fileO = o(context);
                                        if (fileO != null && new File(fileO, "x5.tbs").exists()) {
                                            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-550);
                                            Bundle bundleA = QbSdk.a(context, bundle);
                                            if (bundleA == null) {
                                                try {
                                                    TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.INCR_ERROR_DETAIL, "result null : " + bundle.getInt("new_core_ver"));
                                                    i3 = 1;
                                                } catch (Exception e) {
                                                    e = e;
                                                    TbsLog.i("TbsInstaller", "installLocalTbsCoreExInThread exception:" + Log.getStackTraceString(e));
                                                    e.printStackTrace();
                                                    TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-543);
                                                    TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION, e.toString());
                                                    i.unlock();
                                                    c();
                                                    if (i2 == 5) {
                                                        f(context, 1);
                                                    }
                                                    QbSdk.setTBSInstallingStatus(false);
                                                    return;
                                                }
                                            } else {
                                                i3 = bundleA.getInt("patch_result");
                                                if (i3 != 0) {
                                                    TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.INCR_ERROR_DETAIL, "result " + i3 + " : " + bundle.getInt("new_core_ver"));
                                                }
                                            }
                                        }
                                    }
                                    lock.unlock();
                                    c();
                                    if (i2 == 5) {
                                        f(context, i3);
                                    }
                                    QbSdk.setTBSInstallingStatus(false);
                                    return;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            } catch (Throwable th) {
                                th = th;
                                i.unlock();
                                c();
                                if (i2 == 5) {
                                    f(context, i3);
                                }
                                QbSdk.setTBSInstallingStatus(false);
                                throw th;
                            }
                        }
                        QbSdk.setTBSInstallingStatus(false);
                        lock.unlock();
                        c();
                        if (i2 == 5) {
                            f(context, 2);
                        }
                        QbSdk.setTBSInstallingStatus(false);
                        return;
                    }
                    int iC2 = c(context, bundle);
                    TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTesCoreExInThread doTpatch result is " + iC2);
                    if (iC2 == 1) {
                        l.a(context).a("tpatch_num", l.a(context).c("tpatch_num") + 1);
                    }
                    lock.unlock();
                    c();
                    if (i2 == 5) {
                        f(context, iC2);
                    }
                    QbSdk.setTBSInstallingStatus(false);
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
                i3 = 1;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean c(Context context) {
        File file = new File(n(context), "tbs.conf");
        boolean z = false;
        if (!file.exists()) {
            return false;
        }
        Properties properties = new Properties();
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                properties.load(bufferedInputStream2);
                boolean zBooleanValue = Boolean.valueOf(properties.getProperty("tbs_local_installation", "false")).booleanValue();
                if (zBooleanValue) {
                    try {
                        if (System.currentTimeMillis() - file.lastModified() > 259200000) {
                            z = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = zBooleanValue;
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            th.printStackTrace();
                            return z;
                        } finally {
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
                TbsLog.i("TbsInstaller", "TBS_LOCAL_INSTALLATION is:" + zBooleanValue + " expired=" + z);
                boolean z2 = zBooleanValue & (!z);
                try {
                    bufferedInputStream2.close();
                    return z2;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return z2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean c(Context context, File file) {
        try {
            File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.tencent.smtt.sdk.m.6
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    return file2.getName().endsWith(".jar");
                }
            });
            int length = fileArrListFiles.length;
            ClassLoader classLoader = context.getClassLoader();
            for (int i2 = 0; i2 < length; i2++) {
                TbsLog.i("TbsInstaller", "jarFile: " + fileArrListFiles[i2].getAbsolutePath());
                new DexClassLoader(fileArrListFiles[i2].getAbsolutePath(), file.getAbsolutePath(), null, classLoader);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DEXOPT_EXCEPTION, e.toString());
            TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt done");
            return false;
        }
    }

    public File a(Context context, File file) {
        File file2 = new File(file, "core_share_decouple");
        if (file2.isDirectory() || file2.mkdir()) {
            return file2;
        }
        return null;
    }

    private void a(int i2, String str, Context context) {
        BufferedInputStream bufferedInputStream;
        new File(str).delete();
        TbsLog.i("TbsInstaller", "Local tbs apk(" + str + ") is deleted!", true);
        File file = new File(QbSdk.getTbsFolderDir(context), "core_unzip_tmp");
        if (file.canRead()) {
            File file2 = new File(file, "tbs.conf");
            Properties properties = new Properties();
            BufferedOutputStream bufferedOutputStream = null;
            try {
                try {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                    try {
                        properties.load(bufferedInputStream);
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
                        try {
                            properties.setProperty("tbs_local_installation", "true");
                            properties.store(bufferedOutputStream2, (String) null);
                            TbsLog.i("TbsInstaller", "TBS_LOCAL_INSTALLATION is set!", true);
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            bufferedInputStream.close();
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = bufferedOutputStream2;
                            try {
                                th.printStackTrace();
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                if (bufferedInputStream == null) {
                                }
                            } finally {
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = null;
                }
            } catch (IOException e5) {
            }
        }
    }

    private synchronized boolean c(Context context, boolean z) {
        TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch");
        boolean z2 = false;
        try {
            if (!p(context)) {
                return false;
            }
            ReentrantLock reentrantLock = h;
            boolean zTryLock = reentrantLock.tryLock();
            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch Locked =" + zTryLock);
            if (zTryLock) {
                try {
                    int iB = l.a(context).b("tpatch_status");
                    int iA = a(false, context);
                    TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch copyStatus =" + iB);
                    TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch tbsCoreInstalledVer =" + iA);
                    if (iB == 1) {
                        if (iA == 0) {
                            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch tbsCoreInstalledVer = 0", true);
                        } else if (z) {
                            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch tbsCoreInstalledVer != 0", true);
                        }
                        u(context);
                        z2 = true;
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    h.unlock();
                    throw th;
                }
            }
            c();
        } catch (Throwable th2) {
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.COPY_EXCEPTION, th2.toString());
            QbSdk.a(context, "TbsInstaller::enableTbsCoreFromTpatch exception:" + Log.getStackTraceString(th2));
        }
        return z2;
    }

    public static void a(Context context) {
        String str;
        if (r(context)) {
            return;
        }
        if (a(context, "core_unzip_tmp")) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, new Throwable("TMP_TBS_UNZIP_FOLDER_NAME"));
            str = "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_UNZIP_FOLDER_NAME";
        } else if (a(context, "core_share_backup_tmp")) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, new Throwable("TMP_BACKUP_TBSCORE_FOLDER_NAME"));
            str = "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_BACKUP_TBSCORE_FOLDER_NAME";
        } else {
            if (!a(context, "core_copy_tmp")) {
                return;
            }
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, new Throwable("TMP_TBS_COPY_FOLDER_NAME"));
            str = "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_COPY_FOLDER_NAME";
        }
        TbsLog.e("TbsInstaller", str);
    }

    public void a(Context context, int i2) {
        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #01 ");
        e(context, true);
        l.a(context).c(i2, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:110:0x02a0 A[Catch: all -> 0x00cb, Exception -> 0x0244, TryCatch #8 {all -> 0x00cb, blocks: (B:16:0x0099, B:18:0x00b3, B:25:0x00d2, B:27:0x00e9, B:30:0x0112, B:35:0x0122, B:42:0x0132, B:43:0x013b, B:45:0x0141, B:49:0x017f, B:54:0x019f, B:56:0x01a9, B:59:0x01c7, B:60:0x01cf, B:64:0x01dd, B:66:0x0217, B:68:0x0220, B:91:0x027e, B:110:0x02a0, B:111:0x02ae, B:113:0x02b1, B:115:0x02bd, B:117:0x02c9, B:119:0x02d5, B:121:0x02db, B:124:0x02ea, B:127:0x0300, B:129:0x0306, B:131:0x034f, B:130:0x0322, B:133:0x0358, B:136:0x0370, B:139:0x039a, B:141:0x03b2, B:142:0x03ba, B:144:0x03c7, B:148:0x0405, B:143:0x03be, B:95:0x0284, B:153:0x0422, B:158:0x042b, B:157:0x0428, B:103:0x0294, B:107:0x029a, B:159:0x042c, B:165:0x048c, B:167:0x04a3, B:170:0x04b0, B:161:0x0454, B:163:0x046a), top: B:187:0x0099, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02b1 A[Catch: all -> 0x00cb, Exception -> 0x0244, TryCatch #8 {all -> 0x00cb, blocks: (B:16:0x0099, B:18:0x00b3, B:25:0x00d2, B:27:0x00e9, B:30:0x0112, B:35:0x0122, B:42:0x0132, B:43:0x013b, B:45:0x0141, B:49:0x017f, B:54:0x019f, B:56:0x01a9, B:59:0x01c7, B:60:0x01cf, B:64:0x01dd, B:66:0x0217, B:68:0x0220, B:91:0x027e, B:110:0x02a0, B:111:0x02ae, B:113:0x02b1, B:115:0x02bd, B:117:0x02c9, B:119:0x02d5, B:121:0x02db, B:124:0x02ea, B:127:0x0300, B:129:0x0306, B:131:0x034f, B:130:0x0322, B:133:0x0358, B:136:0x0370, B:139:0x039a, B:141:0x03b2, B:142:0x03ba, B:144:0x03c7, B:148:0x0405, B:143:0x03be, B:95:0x0284, B:153:0x0422, B:158:0x042b, B:157:0x0428, B:103:0x0294, B:107:0x029a, B:159:0x042c, B:165:0x048c, B:167:0x04a3, B:170:0x04b0, B:161:0x0454, B:163:0x046a), top: B:187:0x0099, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x02bd A[Catch: all -> 0x00cb, Exception -> 0x0244, TryCatch #8 {all -> 0x00cb, blocks: (B:16:0x0099, B:18:0x00b3, B:25:0x00d2, B:27:0x00e9, B:30:0x0112, B:35:0x0122, B:42:0x0132, B:43:0x013b, B:45:0x0141, B:49:0x017f, B:54:0x019f, B:56:0x01a9, B:59:0x01c7, B:60:0x01cf, B:64:0x01dd, B:66:0x0217, B:68:0x0220, B:91:0x027e, B:110:0x02a0, B:111:0x02ae, B:113:0x02b1, B:115:0x02bd, B:117:0x02c9, B:119:0x02d5, B:121:0x02db, B:124:0x02ea, B:127:0x0300, B:129:0x0306, B:131:0x034f, B:130:0x0322, B:133:0x0358, B:136:0x0370, B:139:0x039a, B:141:0x03b2, B:142:0x03ba, B:144:0x03c7, B:148:0x0405, B:143:0x03be, B:95:0x0284, B:153:0x0422, B:158:0x042b, B:157:0x0428, B:103:0x0294, B:107:0x029a, B:159:0x042c, B:165:0x048c, B:167:0x04a3, B:170:0x04b0, B:161:0x0454, B:163:0x046a), top: B:187:0x0099, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:132:0x0357  */
    /* JADX WARN: Code duplicated, block: B:135:0x036e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x03b2 A[Catch: all -> 0x00cb, Exception -> 0x0244, TryCatch #8 {all -> 0x00cb, blocks: (B:16:0x0099, B:18:0x00b3, B:25:0x00d2, B:27:0x00e9, B:30:0x0112, B:35:0x0122, B:42:0x0132, B:43:0x013b, B:45:0x0141, B:49:0x017f, B:54:0x019f, B:56:0x01a9, B:59:0x01c7, B:60:0x01cf, B:64:0x01dd, B:66:0x0217, B:68:0x0220, B:91:0x027e, B:110:0x02a0, B:111:0x02ae, B:113:0x02b1, B:115:0x02bd, B:117:0x02c9, B:119:0x02d5, B:121:0x02db, B:124:0x02ea, B:127:0x0300, B:129:0x0306, B:131:0x034f, B:130:0x0322, B:133:0x0358, B:136:0x0370, B:139:0x039a, B:141:0x03b2, B:142:0x03ba, B:144:0x03c7, B:148:0x0405, B:143:0x03be, B:95:0x0284, B:153:0x0422, B:158:0x042b, B:157:0x0428, B:103:0x0294, B:107:0x029a, B:159:0x042c, B:165:0x048c, B:167:0x04a3, B:170:0x04b0, B:161:0x0454, B:163:0x046a), top: B:187:0x0099, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x03be A[Catch: all -> 0x00cb, Exception -> 0x0244, TryCatch #8 {all -> 0x00cb, blocks: (B:16:0x0099, B:18:0x00b3, B:25:0x00d2, B:27:0x00e9, B:30:0x0112, B:35:0x0122, B:42:0x0132, B:43:0x013b, B:45:0x0141, B:49:0x017f, B:54:0x019f, B:56:0x01a9, B:59:0x01c7, B:60:0x01cf, B:64:0x01dd, B:66:0x0217, B:68:0x0220, B:91:0x027e, B:110:0x02a0, B:111:0x02ae, B:113:0x02b1, B:115:0x02bd, B:117:0x02c9, B:119:0x02d5, B:121:0x02db, B:124:0x02ea, B:127:0x0300, B:129:0x0306, B:131:0x034f, B:130:0x0322, B:133:0x0358, B:136:0x0370, B:139:0x039a, B:141:0x03b2, B:142:0x03ba, B:144:0x03c7, B:148:0x0405, B:143:0x03be, B:95:0x0284, B:153:0x0422, B:158:0x042b, B:157:0x0428, B:103:0x0294, B:107:0x029a, B:159:0x042c, B:165:0x048c, B:167:0x04a3, B:170:0x04b0, B:161:0x0454, B:163:0x046a), top: B:187:0x0099, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0422 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[Catch: all -> 0x00cb, Exception -> 0x0244, SYNTHETIC, TryCatch #8 {all -> 0x00cb, blocks: (B:16:0x0099, B:18:0x00b3, B:25:0x00d2, B:27:0x00e9, B:30:0x0112, B:35:0x0122, B:42:0x0132, B:43:0x013b, B:45:0x0141, B:49:0x017f, B:54:0x019f, B:56:0x01a9, B:59:0x01c7, B:60:0x01cf, B:64:0x01dd, B:66:0x0217, B:68:0x0220, B:91:0x027e, B:110:0x02a0, B:111:0x02ae, B:113:0x02b1, B:115:0x02bd, B:117:0x02c9, B:119:0x02d5, B:121:0x02db, B:124:0x02ea, B:127:0x0300, B:129:0x0306, B:131:0x034f, B:130:0x0322, B:133:0x0358, B:136:0x0370, B:139:0x039a, B:141:0x03b2, B:142:0x03ba, B:144:0x03c7, B:148:0x0405, B:143:0x03be, B:95:0x0284, B:153:0x0422, B:158:0x042b, B:157:0x0428, B:103:0x0294, B:107:0x029a, B:159:0x042c, B:165:0x048c, B:167:0x04a3, B:170:0x04b0, B:161:0x0454, B:163:0x046a), top: B:187:0x0099, inners: #0 }] */
    @TargetApi(11)
    public void a(Context context, Context context2, int i2) {
        File file;
        Throwable th;
        BufferedInputStream bufferedInputStream;
        String str;
        Properties properties;
        boolean z;
        boolean z2;
        TbsLogReport tbsLogReport;
        String str2;
        int i3;
        File[] fileArrListFiles;
        int i4;
        File file2;
        String str3;
        BufferedInputStream bufferedInputStream2;
        TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-524);
        if (c(context2)) {
            return;
        }
        TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread start!  tbsCoreTargetVer is " + i2);
        if (context2.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4).getInt("tbs_precheck_disable_version", -1) == i2) {
            TbsLog.e("TbsInstaller", "TbsInstaller-copyTbsCoreInThread -- version:" + i2 + " is disabled by preload_x5_check!");
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-525);
            return;
        }
        if (!p(context2)) {
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-526);
            return;
        }
        Lock lock = i;
        boolean zTryLock = lock.tryLock();
        TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread #1 locked is " + zTryLock);
        if (!zTryLock) {
            c();
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-538);
            return;
        }
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            try {
                int iC = l.a(context2).c("copy_core_ver");
                String str4 = "";
                int iB = l.a(context2).b("copy_status");
                if (iC == i2) {
                    QbSdk.n.onInstallFinish(TbsListener.ErrorCode.COPY_INSTALL_SUCCESS);
                    TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-528);
                    reentrantLock.unlock();
                    lock.unlock();
                    c();
                    return;
                }
                int iG = g(context2);
                TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread tbsCoreInstalledVer=" + iG);
                if (iG == i2) {
                    QbSdk.n.onInstallFinish(TbsListener.ErrorCode.COPY_INSTALL_SUCCESS);
                    TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-528);
                    TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread return have same version is " + iG);
                    reentrantLock.unlock();
                    lock.unlock();
                    c();
                    return;
                }
                int iB2 = l.a(context2).b();
                if ((iB2 > 0 && i2 > iB2) || (iC > 0 && i2 > iC)) {
                    l(context2);
                }
                if (iB == 3 && iG > 0 && (i2 > iG || i2 == 88888888)) {
                    l(context2);
                    TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread -- update TBS.....", true);
                    iB = -1;
                }
                if (!FileUtil.b(context2)) {
                    long jA = com.tencent.smtt.utils.s.a();
                    long downloadMinFreeSpace = TbsDownloadConfig.getInstance(context2).getDownloadMinFreeSpace();
                    TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-529);
                    TbsLogReport.getInstance(context2).setInstallErrorCode(TbsListener.ErrorCode.ROM_NOT_ENOUGH, "rom is not enough when copying tbs core! curAvailROM=" + jA + ",minReqRom=" + downloadMinFreeSpace);
                    reentrantLock.unlock();
                    lock.unlock();
                    c();
                    return;
                }
                if (iB > 0) {
                    TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread return have copied is " + f(context2));
                    reentrantLock.unlock();
                    lock.unlock();
                    c();
                    return;
                }
                if (iB == 0) {
                    int iC2 = l.a(context2).c("copy_retry_num");
                    if (iC2 > 2) {
                        TbsLogReport.getInstance(context2).setInstallErrorCode(TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM, "exceed copy retry num!");
                        TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-530);
                        reentrantLock.unlock();
                        lock.unlock();
                        c();
                        return;
                    }
                    l.a(context2).a("copy_retry_num", iC2 + 1);
                }
                File fileN = n(context);
                File fileE = e(context2, 1);
                try {
                    if (fileN == null || fileE == null) {
                        if (fileN == null) {
                            TbsLogReport.getInstance(context2).setInstallErrorCode(TbsListener.ErrorCode.COPY_SRCDIR_ERROR, "src-dir is null when copying tbs core!");
                            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-535);
                        }
                        if (fileE == null) {
                            TbsLogReport.getInstance(context2).setInstallErrorCode(TbsListener.ErrorCode.COPY_TMPDIR_ERROR, "dst-dir is null when copying tbs core!");
                            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-536);
                        }
                    } else {
                        l.a(context2).a(i2, 0);
                        com.tencent.smtt.utils.q qVar = new com.tencent.smtt.utils.q();
                        qVar.a(fileN);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-551);
                        boolean zA = FileUtil.a(fileN, fileE, b);
                        TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread time=" + (System.currentTimeMillis() - jCurrentTimeMillis));
                        if (zA) {
                            qVar.b(fileN);
                            if (!qVar.a()) {
                                TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread copy-verify fail!");
                                FileUtil.a(fileE, true);
                                TbsLogReport.getInstance(context2).setInstallErrorCode(TbsListener.ErrorCode.COPY_SRCDIR_ERROR, "TbsCopy-Verify fail after copying tbs core!");
                                TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-531);
                                reentrantLock.unlock();
                                lock.unlock();
                                c();
                                return;
                            }
                            try {
                                try {
                                    str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                    try {
                                        File file3 = new File(fileE, str);
                                        properties = new Properties();
                                        try {
                                            if (file3.exists()) {
                                                BufferedInputStream bufferedInputStream3 = new BufferedInputStream(new FileInputStream(file3));
                                                try {
                                                    properties.load(bufferedInputStream3);
                                                    bufferedInputStream2 = bufferedInputStream3;
                                                    z = true;
                                                } catch (Exception e) {
                                                    e = e;
                                                    bufferedInputStream = bufferedInputStream3;
                                                    try {
                                                        e.printStackTrace();
                                                        if (bufferedInputStream != null) {
                                                            try {
                                                                bufferedInputStream.close();
                                                            } catch (IOException e2) {
                                                                e2.printStackTrace();
                                                            }
                                                        }
                                                        z = true;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        if (bufferedInputStream != null) {
                                                            throw th;
                                                        }
                                                        try {
                                                            bufferedInputStream.close();
                                                            throw th;
                                                        } catch (IOException e3) {
                                                            e3.printStackTrace();
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    bufferedInputStream = bufferedInputStream3;
                                                    if (bufferedInputStream != null) {
                                                        throw th;
                                                    }
                                                    bufferedInputStream.close();
                                                    throw th;
                                                }
                                            } else {
                                                z = false;
                                                bufferedInputStream2 = null;
                                            }
                                            if (bufferedInputStream2 != null) {
                                                try {
                                                    bufferedInputStream2.close();
                                                } catch (IOException e4) {
                                                    e4.printStackTrace();
                                                }
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            bufferedInputStream = null;
                                            e.printStackTrace();
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            z = true;
                                            if (z) {
                                                fileArrListFiles = fileE.listFiles();
                                                TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-552);
                                                i4 = 0;
                                                while (true) {
                                                    if (i4 < fileArrListFiles.length) {
                                                        file2 = fileArrListFiles[i4];
                                                        if (str.equals(file2.getName())) {
                                                            str3 = str4;
                                                        } else {
                                                            str3 = str4;
                                                        }
                                                        i4++;
                                                        str4 = str3;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                }
                                            } else {
                                                z2 = true;
                                            }
                                            TbsLog.i("TbsInstaller", "copyTbsCoreInThread - md5_check_success:" + z2);
                                            if (!z) {
                                            }
                                            TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread success!");
                                            TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #04");
                                            e(context2, true);
                                            l.a(context2).a(i2, 1);
                                            if (this.j) {
                                                tbsLogReport = TbsLogReport.getInstance(context2);
                                                str2 = "continueInstallWithout core success";
                                                i3 = TbsListener.ErrorCode.COPY_INSTALL_SUCCESS;
                                            } else {
                                                tbsLogReport = TbsLogReport.getInstance(context2);
                                                str2 = "success";
                                                i3 = TbsListener.ErrorCode.COPY_INSTALL_SUCCESS;
                                            }
                                            tbsLogReport.setInstallErrorCode(i3, str2);
                                            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-533);
                                            TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread success -- version:" + i2);
                                            try {
                                                SharedPreferences.Editor editorEdit = context2.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4).edit();
                                                editorEdit.putInt("tbs_preload_x5_counter", 0);
                                                editorEdit.putInt("tbs_preload_x5_recorder", 0);
                                                editorEdit.putInt("tbs_preload_x5_version", i2);
                                                editorEdit.commit();
                                            } catch (Throwable th4) {
                                                TbsLog.e("TbsInstaller", "Init tbs_preload_x5_counter#2 exception:" + Log.getStackTraceString(th4));
                                            }
                                            h.unlock();
                                            i.unlock();
                                            c();
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        properties = null;
                                        bufferedInputStream = null;
                                        e.printStackTrace();
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                        }
                                        z = true;
                                        if (z) {
                                            fileArrListFiles = fileE.listFiles();
                                            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-552);
                                            i4 = 0;
                                            while (true) {
                                                if (i4 < fileArrListFiles.length) {
                                                    file2 = fileArrListFiles[i4];
                                                    if (str.equals(file2.getName())) {
                                                        str3 = str4;
                                                    } else {
                                                        str3 = str4;
                                                    }
                                                    i4++;
                                                    str4 = str3;
                                                } else {
                                                    z2 = true;
                                                }
                                            }
                                        } else {
                                            z2 = true;
                                        }
                                        TbsLog.i("TbsInstaller", "copyTbsCoreInThread - md5_check_success:" + z2);
                                        if (!z) {
                                        }
                                        TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread success!");
                                        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #04");
                                        e(context2, true);
                                        l.a(context2).a(i2, 1);
                                        if (this.j) {
                                            tbsLogReport = TbsLogReport.getInstance(context2);
                                            str2 = "continueInstallWithout core success";
                                            i3 = TbsListener.ErrorCode.COPY_INSTALL_SUCCESS;
                                        } else {
                                            tbsLogReport = TbsLogReport.getInstance(context2);
                                            str2 = "success";
                                            i3 = TbsListener.ErrorCode.COPY_INSTALL_SUCCESS;
                                        }
                                        tbsLogReport.setInstallErrorCode(i3, str2);
                                        TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-533);
                                        TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread success -- version:" + i2);
                                        SharedPreferences.Editor editorEdit2 = context2.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4).edit();
                                        editorEdit2.putInt("tbs_preload_x5_counter", 0);
                                        editorEdit2.putInt("tbs_preload_x5_recorder", 0);
                                        editorEdit2.putInt("tbs_preload_x5_version", i2);
                                        editorEdit2.commit();
                                        h.unlock();
                                        i.unlock();
                                        c();
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bufferedInputStream = null;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                            }
                            if (z) {
                                fileArrListFiles = fileE.listFiles();
                                TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-552);
                                i4 = 0;
                                while (true) {
                                    if (i4 < fileArrListFiles.length) {
                                        file2 = fileArrListFiles[i4];
                                        if (str.equals(file2.getName()) || file2.getName().endsWith(".dex") || "tbs.conf".equals(file2.getName()) || file2.isDirectory() || file2.getName().endsWith(".prof")) {
                                            str3 = str4;
                                        } else {
                                            String strA = com.tencent.smtt.utils.a.a(file2);
                                            str3 = str4;
                                            String property = properties.getProperty(file2.getName(), str3);
                                            if (property.equals(str3) || !strA.equals(property)) {
                                                TbsLog.e("TbsInstaller", "md5_check_failure for (" + file2.getName() + ") targetMd5:" + property + ", realMd5:" + strA);
                                                z2 = false;
                                            } else {
                                                TbsLog.i("TbsInstaller", "md5_check_success for (" + file2.getName() + ")");
                                            }
                                        }
                                        i4++;
                                        str4 = str3;
                                    } else {
                                        z2 = true;
                                    }
                                }
                            } else {
                                z2 = true;
                            }
                            TbsLog.i("TbsInstaller", "copyTbsCoreInThread - md5_check_success:" + z2);
                            if (!z && !z2) {
                                TbsLog.e("TbsInstaller", "copyTbsCoreInThread - md5 incorrect -> delete destTmpDir!");
                                FileUtil.a(fileE, true);
                                TbsLogReport.getInstance(context2).setInstallErrorCode(TbsListener.ErrorCode.COPY_SRCDIR_ERROR, "TbsCopy-Verify md5 fail after copying tbs core!");
                                TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-532);
                                h.unlock();
                                i.unlock();
                                c();
                                return;
                            }
                            TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread success!");
                            TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #04");
                            e(context2, true);
                            l.a(context2).a(i2, 1);
                            if (this.j) {
                                tbsLogReport = TbsLogReport.getInstance(context2);
                                str2 = "continueInstallWithout core success";
                                i3 = TbsListener.ErrorCode.COPY_INSTALL_SUCCESS;
                            } else {
                                tbsLogReport = TbsLogReport.getInstance(context2);
                                str2 = "success";
                                i3 = TbsListener.ErrorCode.COPY_INSTALL_SUCCESS;
                            }
                            tbsLogReport.setInstallErrorCode(i3, str2);
                            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-533);
                            TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread success -- version:" + i2);
                            SharedPreferences.Editor editorEdit3 = context2.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4).edit();
                            editorEdit3.putInt("tbs_preload_x5_counter", 0);
                            editorEdit3.putInt("tbs_preload_x5_recorder", 0);
                            editorEdit3.putInt("tbs_preload_x5_version", i2);
                            editorEdit3.commit();
                        } else {
                            TbsLog.i("TbsInstaller", "TbsInstaller-copyTbsCoreInThread fail!");
                            l.a(context2).a(i2, 2);
                            FileUtil.a(fileE, false);
                            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-534);
                            TbsLogReport.getInstance(context2).setInstallErrorCode(TbsListener.ErrorCode.COPY_FAIL, "copy fail!");
                        }
                    }
                } catch (Exception e8) {
                    e = e8;
                    file = fileE;
                    TbsLogReport.getInstance(context2).setInstallErrorCode(TbsListener.ErrorCode.COPY_EXCEPTION, e.toString());
                    TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-537);
                    try {
                        FileUtil.a(file, false);
                        l.a(context2).a(0, -1);
                    } catch (Exception e9) {
                        TbsLog.e("TbsInstaller", "[TbsInstaller-copyTbsCoreInThread] delete dstTmpDir throws exception:" + e9.getMessage() + "," + e9.getCause());
                    }
                }
                h.unlock();
                i.unlock();
                c();
            } catch (Exception e10) {
                e = e10;
                file = null;
            }
        } catch (Throwable th6) {
            h.unlock();
            i.unlock();
            c();
            throw th6;
        }
    }

    public void a(Context context, Bundle bundle) {
        if (bundle == null || context == null) {
            return;
        }
        Object[] objArr = {context, bundle};
        Message message = new Message();
        message.what = 3;
        message.obj = objArr;
        m.sendMessage(message);
    }

    /* JADX WARN: Code duplicated, block: B:254:0x0456 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @TargetApi(11)
    public void b(Context context, String str, int i2) throws Throwable {
        int i3;
        boolean z;
        m mVar;
        int iB;
        TbsLogReport tbsLogReport;
        int iQ;
        String str2;
        String strD;
        boolean z2;
        TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-501);
        if (c(context)) {
            TbsLog.i("TbsInstaller", "isTbsLocalInstalled --> no installation!", true);
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-502);
            QbSdk.n.onInstallFinish(-502);
            return;
        }
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsApkPath=" + str);
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreTargetVer=" + i2);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + context.getApplicationInfo().processName);
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread currentProcessId=" + Process.myPid());
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread currentThreadName=" + Thread.currentThread().getName());
        if (context.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4).getInt("tbs_precheck_disable_version", -1) == i2) {
            TbsLog.e("TbsInstaller", "TbsInstaller-installTbsCoreInThread -- version:" + i2 + " is disabled by preload_x5_check!");
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-503);
            QbSdk.n.onInstallFinish(-503);
            return;
        }
        if (!FileUtil.b(context)) {
            long jA = com.tencent.smtt.utils.s.a();
            long downloadMinFreeSpace = TbsDownloadConfig.getInstance(context).getDownloadMinFreeSpace();
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-504);
            String str3 = "rom is not enough when installing tbs core! curAvailROM=" + jA + ",minReqRom=" + downloadMinFreeSpace;
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.ROM_NOT_ENOUGH, str3);
            TbsLog.i("TbsInstaller", str3);
            QbSdk.n.onInstallFinish(TbsListener.ErrorCode.ROM_NOT_ENOUGH);
            return;
        }
        if (!p(context)) {
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-505);
            TbsLog.i("TbsInstaller", "getInstalling file lock failed,return!");
            QbSdk.n.onInstallFinish(-505);
            return;
        }
        Lock lock = i;
        boolean zTryLock = lock.tryLock();
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread locked =" + zTryLock);
        if (!zTryLock) {
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-519);
            c();
            return;
        }
        TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-507);
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            int iC = l.a(context).c("copy_core_ver");
            int iB2 = l.a(context).b();
            try {
                TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreCopyVer =" + iC);
                TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreInstallVer =" + iB2);
                TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreTargetVer =" + i2);
                if ((iB2 > 0 && i2 > iB2) || (iC > 0 && i2 > iC)) {
                    l(context);
                }
                int iC2 = l.a(context).c();
                int iG = g(context);
                TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread installStatus1=" + iC2);
                TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreInstalledVer=" + iG);
                if (iC2 >= 0 && iC2 < 2) {
                    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread -- retry.....", true);
                    i3 = iC2;
                    z = true;
                } else if (iC2 != 3 || iG < 0 || (i2 <= iG && i2 != 88888888)) {
                    i3 = iC2;
                    z = false;
                } else {
                    l(context);
                    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread -- update TBS.....", true);
                    z = false;
                    i3 = -1;
                }
                TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-508);
                TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread installStatus2=" + i3);
                if (i3 < 1) {
                    TbsLog.i("TbsInstaller", "STEP 2/2 begin installation.....", true);
                    TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-509);
                    if (z) {
                        int iC3 = l.a(context).c("unzip_retry_num");
                        if (iC3 > 10) {
                            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM, "exceed unzip retry num!");
                            y(context);
                            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-510);
                            try {
                                reentrantLock.unlock();
                                lock.unlock();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            try {
                                c();
                                return;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                return;
                            }
                        }
                        l.a(context).b(iC3 + 1);
                    }
                    if (str == null) {
                        strD = l.a(context).d("install_apk_path");
                        if (strD == null) {
                            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.APK_PATH_ERROR, "apk path is null!");
                            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-511);
                            try {
                                reentrantLock.unlock();
                                lock.unlock();
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                            try {
                                c();
                                return;
                            } catch (Exception e4) {
                                e4.printStackTrace();
                                return;
                            }
                        }
                    } else {
                        strD = str;
                    }
                    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread apkPath =".concat(strD));
                    mVar = this;
                    try {
                        iB = mVar.b(context, strD);
                        if (iB == 0) {
                            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-512);
                            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.APK_VERSION_ERROR, "apk version is 0!");
                            try {
                                reentrantLock.unlock();
                                lock.unlock();
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            try {
                                c();
                                return;
                            } catch (Exception e6) {
                                e6.printStackTrace();
                                return;
                            }
                        }
                        l.a(context).a("install_apk_path", strD);
                        l.a(context).c(iB, 0);
                        TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-548);
                        if (!mVar.b(context, new File(strD))) {
                            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.UNZIP_OTHER_ERROR, "unzipTbsApk failed");
                            try {
                                reentrantLock.unlock();
                                lock.unlock();
                            } catch (Exception e7) {
                                e7.printStackTrace();
                            }
                            try {
                                c();
                                return;
                            } catch (Exception e8) {
                                e8.printStackTrace();
                                return;
                            }
                        }
                        if (z) {
                            int iB3 = l.a(context).b("unlzma_status");
                            if (iB3 > 5) {
                                TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, "exceed unlzma retry num!");
                                TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-553);
                                y(context);
                                k.b(context);
                                Map<String, Object> map = TbsDownloadConfig.getInstance(context).mSyncMap;
                                Boolean bool = Boolean.TRUE;
                                map.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, bool);
                                TbsDownloadConfig.getInstance(context).mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_FULL_PACKAGE, bool);
                                TbsDownloadConfig.getInstance(context).commit();
                                try {
                                    reentrantLock.unlock();
                                    lock.unlock();
                                } catch (Exception e9) {
                                    e9.printStackTrace();
                                }
                                try {
                                    c();
                                    return;
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                    return;
                                }
                            }
                            l.a(context).d(iB3 + 1);
                        }
                        TbsLog.i("TbsInstaller", "unlzma begin");
                        int i4 = TbsDownloadConfig.getInstance().mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, 0);
                        if (g(context) != 0) {
                            Object objA = QbSdk.a(context, "can_unlzma", (Bundle) null);
                            if ((objA == null || !(objA instanceof Boolean)) ? false : ((Boolean) objA).booleanValue()) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("responseCode", i4);
                                bundle.putString("unzip_temp_path", TbsDownloader.a(context) ? m(context).getAbsolutePath() : mVar.e(context, 0).getAbsolutePath());
                                Object objA2 = QbSdk.a(context, "unlzma", bundle);
                                if (objA2 == null) {
                                    TbsLog.i("TbsInstaller", "unlzma return null");
                                    TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.UNLZMA_FAIURE, "unlzma is null");
                                } else {
                                    if (objA2 instanceof Boolean) {
                                        if (((Boolean) objA2).booleanValue()) {
                                            TbsLog.i("TbsInstaller", "unlzma success");
                                            z2 = true;
                                        } else {
                                            TbsLog.i("TbsInstaller", "unlzma return false");
                                            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.UNLZMA_FAIURE, "unlzma return false");
                                        }
                                    } else if (objA2 instanceof Bundle) {
                                        z2 = true;
                                    } else if (objA2 instanceof Throwable) {
                                        TbsLog.i("TbsInstaller", "unlzma failure because Throwable" + Log.getStackTraceString((Throwable) objA2));
                                        TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.UNLZMA_FAIURE, (Throwable) objA2);
                                    }
                                    if (!z2) {
                                        try {
                                            reentrantLock.unlock();
                                            lock.unlock();
                                        } catch (Exception e11) {
                                            e11.printStackTrace();
                                        }
                                        try {
                                            c();
                                            return;
                                        } catch (Exception e12) {
                                            e12.printStackTrace();
                                            return;
                                        }
                                    }
                                }
                                z2 = false;
                                if (!z2) {
                                    reentrantLock.unlock();
                                    lock.unlock();
                                    c();
                                    return;
                                }
                            }
                        }
                        TbsLog.i("TbsInstaller", "unlzma finished");
                        l.a(context).c(iB, 1);
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        try {
                            h.unlock();
                            i.unlock();
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                        try {
                            c();
                            throw th2;
                        } catch (Exception e14) {
                            e14.printStackTrace();
                            throw th2;
                        }
                    }
                } else {
                    mVar = this;
                    iB = 0;
                }
                if (i3 < 2) {
                    if (z) {
                        int iC4 = l.a(context).c("dexopt_retry_num");
                        if (iC4 > 10) {
                            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM, "exceed dexopt retry num!");
                            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-514);
                            y(context);
                            try {
                                reentrantLock.unlock();
                                lock.unlock();
                            } catch (Exception e15) {
                                e15.printStackTrace();
                            }
                            try {
                                c();
                                return;
                            } catch (Exception e16) {
                                e16.printStackTrace();
                                return;
                            }
                        }
                        l.a(context).a(iC4 + 1);
                    }
                    TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-549);
                    if (!mVar.g(context, 0)) {
                        TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-515);
                        try {
                            reentrantLock.unlock();
                            lock.unlock();
                        } catch (Exception e17) {
                            e17.printStackTrace();
                        }
                        try {
                            c();
                            return;
                        } catch (Exception e18) {
                            e18.printStackTrace();
                            return;
                        }
                    }
                    l.a(context).c(iB, 2);
                    TbsLog.i("TbsInstaller", "STEP 2/2 installation completed! you can restart!", true);
                    TbsLog.i("TbsInstaller", "STEP 2/2 installation completed! you can restart! version:" + i2);
                    TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-516);
                    try {
                        SharedPreferences.Editor editorEdit = context.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4).edit();
                        editorEdit.putInt("tbs_preload_x5_counter", 0);
                        editorEdit.putInt("tbs_preload_x5_recorder", 0);
                        editorEdit.putInt("tbs_preload_x5_version", i2);
                        editorEdit.commit();
                        TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-517);
                    } catch (Throwable th3) {
                        TbsLog.e("TbsInstaller", "Init tbs_preload_x5_counter#1 exception:" + Log.getStackTraceString(th3));
                        TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-518);
                    }
                    if (i2 == 88888888) {
                        mVar.a(i2, str, context);
                    }
                    if (mVar.j) {
                        tbsLogReport = TbsLogReport.getInstance(context);
                        iQ = q(context);
                        str2 = "continueInstallWithout core success";
                    } else {
                        if (str != null) {
                            FileUtil.b(new File(str));
                        }
                        tbsLogReport = TbsLogReport.getInstance(context);
                        iQ = q(context);
                        str2 = "success";
                    }
                    tbsLogReport.setInstallErrorCode(iQ, str2);
                } else if (i3 == 2) {
                    if (str != null) {
                        FileUtil.b(new File(str));
                    }
                    QbSdk.n.onInstallFinish(200);
                }
                try {
                    h.unlock();
                    i.unlock();
                } catch (Exception e19) {
                    e19.printStackTrace();
                }
                try {
                    c();
                } catch (Exception e20) {
                    e20.printStackTrace();
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public void a(Context context, File file, int i2) {
        FileOutputStream fileOutputStreamB = FileUtil.b(context, true, "core_unzip.lock");
        FileLock fileLockA = FileUtil.a(context, fileOutputStreamB);
        if (fileLockA == null) {
            TbsLog.i("TbsInstaller", "can not get Core unzip FileLock,skip!!!");
            return;
        }
        TbsLog.i("TbsInstaller", "unzipTbsCoreToThirdAppTmpInThread #1");
        boolean zA = a(context, file, false);
        TbsLog.i("TbsInstaller", "unzipTbsCoreToThirdAppTmpInThread result is " + zA);
        if (zA) {
            a().a(context, i2);
        }
        FileUtil.a(fileLockA, fileOutputStreamB);
    }

    public void b(Context context, boolean z) {
        String str;
        if (QbSdk.b) {
            return;
        }
        TbsLog.i("TbsInstaller", "installTbsCoreIfNeeded", "#1# check local x5core prepared to install");
        if (r(context)) {
            TbsLog.i("TbsInstaller", "installTbsCoreIfNeeded", "#2# try to install tbs core from tmp dir");
            if (a(context, "core_unzip_tmp") && d(context, z)) {
                str = "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromUnzip !!";
            } else {
                str = (a(context, "tpatch_tmp") && c(context, z)) ? "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromTpatch !!" : "TbsInstaller-installTbsCoreIfNeeded, error !!";
            }
            TbsLog.i("TbsInstaller", str);
        }
    }

    public void a(Context context, String str, int i2) {
        TbsLog.i("TbsInstaller", "installTbsCore Path: " + str + ";Ver: " + i2 + "\npn: " + context.getApplicationInfo().processName + "\npid: " + Process.myPid() + "\ntn: " + Thread.currentThread().getName());
        Object[] objArr = {context, str, Integer.valueOf(i2)};
        Message message = new Message();
        message.what = 1;
        message.obj = objArr;
        m.sendMessage(message);
    }

    public boolean b(Context context, int i2) {
        if (TbsDownloader.getOverSea(context)) {
            return false;
        }
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore targetTbsCoreVer=" + i2);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + context.getApplicationInfo().processName);
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentProcessId=" + Process.myPid());
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentThreadName=" + Thread.currentThread().getName());
        Context contextC = c(context, i2);
        if (contextC == null) {
            TbsLog.i("TbsInstaller", "TbsInstaller--installLocalTbsCore copy from null");
            return false;
        }
        Object[] objArr = {contextC, context, Integer.valueOf(i2)};
        Message message = new Message();
        message.what = 2;
        message.obj = objArr;
        m.sendMessage(message);
        return true;
    }

    private boolean b(Context context, File file) {
        return a(context, file, false);
    }

    public void a(Context context, boolean z) {
        int iC;
        int iB;
        String strD;
        int iC2;
        int iB2;
        if (z) {
            this.j = true;
        }
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + context.getApplicationInfo().processName);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessId=" + Process.myPid());
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentThreadName=" + Thread.currentThread().getName());
        if (p(context)) {
            ReentrantLock reentrantLock = h;
            if (reentrantLock.tryLock()) {
                try {
                    iC = l.a(context).c();
                    iB = l.a(context).b();
                    strD = l.a(context).d("install_apk_path");
                    iC2 = l.a(context).c("copy_core_ver");
                    iB2 = l.a(context).b("copy_status");
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    h.unlock();
                    throw th;
                }
            } else {
                strD = null;
                iC = -1;
                iB = 0;
                iC2 = 0;
                iB2 = -1;
            }
            c();
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore installStatus=" + iC);
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreInstallVer=" + iB);
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsApkPath=" + strD);
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreCopyVer=" + iC2);
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore copyStatus=" + iB2);
            int i2 = TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, 0);
            if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 0 && i2 != 5) {
                Bundle bundle = new Bundle();
                bundle.putInt("operation", 10001);
                a(context, bundle);
            }
            if (iC > -1 && iC < 2) {
                a(context, strD, iB);
            }
            if (iB2 == 0) {
                b(context, iC2);
            }
        }
    }

    public final void a(QbSdk.a aVar) {
        this.o = aVar;
    }

    private boolean a(Context context, File file, boolean z) {
        TbsDownloadConfig tbsDownloadConfig;
        int i2;
        TbsLog.i("TbsInstaller", "TbsInstaller-unzipTbs start isDecoupleCore is " + z);
        if (FileUtil.c(file)) {
            try {
                File tbsFolderDir = QbSdk.getTbsFolderDir(context);
                File file2 = z ? new File(tbsFolderDir, "core_share_decouple") : new File(tbsFolderDir, "core_unzip_tmp");
                if (file2.exists() && !TbsDownloader.a(context)) {
                    FileUtil.b(file2);
                }
            } catch (Throwable th) {
                TbsLog.e("TbsInstaller", "TbsInstaller-unzipTbs -- delete unzip folder if exists exception" + Log.getStackTraceString(th));
            }
            File fileE = z ? e(context, 2) : e(context, 0);
            if (fileE != null) {
                try {
                    try {
                        FileUtil.a(fileE);
                        if (z) {
                            FileUtil.a(fileE, true);
                        }
                        boolean zA = FileUtil.a(file, fileE);
                        if (zA) {
                            zA = a(fileE, context);
                        }
                        if (z) {
                            for (String str : fileE.list()) {
                                File file3 = new File(fileE, str);
                                if (file3.getName().endsWith(".dex")) {
                                    file3.delete();
                                }
                            }
                            try {
                                new File(o(context), "x5.tbs").delete();
                            } catch (Exception unused) {
                            }
                        }
                        if (zA) {
                            TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #05");
                            e(context, true);
                        } else {
                            FileUtil.b(fileE);
                            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-522);
                            TbsLog.e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#1! exist:" + fileE.exists());
                        }
                        TbsLog.i("TbsInstaller", "TbsInstaller-unzipTbs done");
                        return zA;
                    } catch (IOException e) {
                        TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-523);
                        TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.UNZIP_IO_ERROR, e);
                        if (fileE.exists()) {
                            try {
                                FileUtil.b(fileE);
                                TbsLog.e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exist:" + fileE.exists());
                            } catch (Throwable th2) {
                                TbsLog.e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exception:" + Log.getStackTraceString(th2));
                            }
                        }
                        TbsLog.i("TbsInstaller", "TbsInstaller-unzipTbs done");
                        return false;
                    } catch (Exception e2) {
                        TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-523);
                        TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.UNZIP_OTHER_ERROR, e2);
                        if (fileE.exists()) {
                            try {
                                FileUtil.b(fileE);
                                TbsLog.e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exist:" + fileE.exists());
                            } catch (Throwable th3) {
                                TbsLog.e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exception:" + Log.getStackTraceString(th3));
                            }
                        }
                        TbsLog.i("TbsInstaller", "TbsInstaller-unzipTbs done");
                        return false;
                    }
                } catch (Throwable th4) {
                    TbsLog.i("TbsInstaller", "TbsInstaller-unzipTbs done");
                    throw th4;
                }
            }
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.UNZIP_DIR_ERROR, "tmp unzip dir is null!");
            tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
            i2 = -521;
        } else {
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.APK_INVALID, "apk is invalid!");
            tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
            i2 = -520;
        }
        tbsDownloadConfig.setInstallInterruptCode(i2);
        return false;
    }

    public static boolean a(Context context, String str) {
        StringBuilder sb;
        File file = new File(QbSdk.getTbsFolderDir(context), str);
        if (!file.exists()) {
            sb = new StringBuilder("#1# ");
        } else {
            if (new File(file, "tbs.conf").exists()) {
                TbsLog.i("TbsInstaller", "isPrepareTbsCore", "#3# " + str);
                return true;
            }
            sb = new StringBuilder("#2# ");
        }
        sb.append(str);
        TbsLog.i("TbsInstaller", "isPrepareTbsCore", sb.toString());
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private boolean a(File file, Context context) throws Throwable {
        Properties properties;
        Exception e;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        boolean z;
        boolean z2;
        TbsLog.i("TbsInstaller", "finalCheckForTbsCoreValidity - " + file + ", " + context);
        BufferedInputStream bufferedInputStream3 = null;
        try {
            try {
                try {
                    File file2 = new File(file, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    properties = new Properties();
                    try {
                        if (file2.exists()) {
                            bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                            try {
                                properties.load(bufferedInputStream);
                                bufferedInputStream3 = bufferedInputStream;
                                z = true;
                            } catch (Exception e2) {
                                e = e2;
                                e.printStackTrace();
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        if (bufferedInputStream3 != null) {
                            try {
                                bufferedInputStream3.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                    } catch (Exception e5) {
                        bufferedInputStream = null;
                        e = e5;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bufferedInputStream3 != null) {
                        try {
                            bufferedInputStream3.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e7) {
                properties = null;
                e = e7;
                bufferedInputStream = null;
            }
            TbsLog.i("TbsInstaller", "finalCheckForTbsCoreValidity - need_check:" + z);
            if (z) {
                File[] fileArrListFiles = file.listFiles();
                int i2 = 0;
                while (true) {
                    if (i2 < fileArrListFiles.length) {
                        File file3 = fileArrListFiles[i2];
                        if (!IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(file3.getName()) && !file3.getName().endsWith(".dex") && !"tbs.conf".equals(file3.getName()) && !file3.isDirectory() && !file3.getName().endsWith(".prof")) {
                            String strA = com.tencent.smtt.utils.a.a(file3);
                            String property = properties.getProperty(file3.getName(), "");
                            if (property.equals("") || !property.equals(strA)) {
                                TbsLog.e("TbsInstaller", "md5_check_failure for (" + file3.getName() + ") targetMd5:" + property + ", realMd5:" + strA);
                                z2 = false;
                            } else {
                                TbsLog.i("TbsInstaller", "md5_check_success for (" + file3.getName() + ")");
                            }
                        }
                        i2++;
                    } else {
                        z2 = true;
                    }
                }
            } else {
                z2 = true;
            }
            TbsLog.i("TbsInstaller", "finalCheckForTbsCoreValidity - md5_check_success:" + z2);
            if (!z || z2) {
                TbsLog.i("TbsInstaller", "finalCheckForTbsCoreValidity success!");
                return true;
            }
            TbsLog.e("TbsInstaller", "finalCheckForTbsCoreValidity - Verify failed after unzipping!");
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream3 = bufferedInputStream2;
            if (bufferedInputStream3 != null) {
                bufferedInputStream3.close();
            }
            throw th;
        }
    }
}
