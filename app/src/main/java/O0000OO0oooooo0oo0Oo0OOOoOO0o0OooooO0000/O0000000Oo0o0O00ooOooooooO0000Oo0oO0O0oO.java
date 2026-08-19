package O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.github.tvbox.osc.ui.activity.CrashActivity;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static String f885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public Context f886O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Throwable th) throws PackageManager.NameNotFoundException {
        File file = new File(f885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        String str = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1321O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        File file2 = new File(f885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + "/errorLog.txt");
        if (!file.exists()) {
            file.mkdirs();
        }
        String str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date(System.currentTimeMillis()));
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
        printWriter.println("日志时间：" + str2);
        PackageInfo packageInfo = this.f886O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getPackageManager().getPackageInfo(this.f886O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getPackageName(), 1);
        printWriter.println("软件版本：" + packageInfo.versionName + "_" + packageInfo.versionCode);
        printWriter.println("系统版本：" + Build.VERSION.RELEASE + "_" + Build.VERSION.SDK_INT);
        StringBuilder sb = new StringBuilder("设备品牌：");
        sb.append(Build.MANUFACTURER);
        printWriter.println(sb.toString());
        printWriter.println("设备型号：" + Build.MODEL);
        printWriter.println("CPU架构：" + Build.CPU_ABI);
        printWriter.println("系统架构：" + System.getProperty("os.arch"));
        printWriter.println("报错内容：");
        th.printStackTrace(printWriter);
        printWriter.close();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Log.e("zsq信息", th.getMessage());
        try {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(th);
            String packageName = this.f886O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getApplicationContext().getPackageName();
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(packageName, CrashActivity.class.getName()));
            intent.addFlags(335577088);
            this.f886O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getApplicationContext().startActivity(intent);
            System.exit(0);
            Process.killProcess(Process.myPid());
        } catch (PackageManager.NameNotFoundException | IOException e) {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(e, new StringBuilder("运行出错！CrashActivity启动失败 "), 1);
        }
    }
}
