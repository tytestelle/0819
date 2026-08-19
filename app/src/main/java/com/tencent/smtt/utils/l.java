package com.tencent.smtt.utils;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.tencent.smtt.sdk.TbsConfig;
import com.tencent.smtt.sdk.WebView;

/* JADX INFO: loaded from: classes2.dex */
public class l {
    private static String a = null;
    private static String b = "GA";
    private static String c = "GE";
    private static String d = "9422";
    private static String e = "0";
    private static String f = "";
    private static boolean g;
    private static boolean h;
    private static boolean i;

    public static String a(Context context) {
        return a(context, SessionDescription.SUPPORTED_SDP_VERSION);
    }

    private static int b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            return defaultDisplay.getWidth();
        }
        return -1;
    }

    private static int c(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            return defaultDisplay.getHeight();
        }
        return -1;
    }

    private static boolean d(Context context) {
        if (h) {
            return i;
        }
        try {
            boolean z = (Math.min(b(context), c(context)) * 160) / e(context) >= 700;
            i = z;
            h = true;
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static int e(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            return 160;
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    public static String a(Context context, String str) {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String strA = a(context, String.valueOf(WebView.getTbsSDKVersion(context)), str, b, c, d, e, f, g);
        a = strA;
        return strA;
    }

    private static String a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        String str8;
        StringBuilder sb = new StringBuilder();
        String str9 = b(context) + "*" + c(context);
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getApplicationInfo();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
            str8 = applicationInfo.packageName;
            try {
                if (TextUtils.isEmpty(str7)) {
                    str7 = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e = e2;
                e.printStackTrace();
                str7 = "";
            }
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            str8 = "";
        }
        String strA = a(str8);
        String str10 = "PAD";
        if (!"QB".equals(strA) ? !d(context) : !z) {
            str10 = "PHONE";
        }
        sb.append("QV=3");
        a(sb, "PL", "ADR");
        a(sb, "PR", strA);
        a(sb, "PP", str8);
        a(sb, "PPVN", str7);
        if (!TextUtils.isEmpty(str)) {
            a(sb, "TBSVC", str);
        }
        a(sb, "CO", "SYS");
        if (!TextUtils.isEmpty(str2) && !str2.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
            a(sb, "CO", "BK");
        }
        if (!TextUtils.isEmpty(str2)) {
            a(sb, "COVC", str2);
        }
        a(sb, "PB", str4);
        a(sb, "VE", str3);
        a(sb, "DE", str10);
        if (TextUtils.isEmpty(str6)) {
            str6 = SessionDescription.SUPPORTED_SDP_VERSION;
        }
        a(sb, "CHID", str6);
        a(sb, "LCID", str5);
        a(sb, "MO", "unknown");
        a(sb, "RL", str9);
        String str11 = Build.VERSION.RELEASE;
        try {
            str11 = new String(str11.getBytes("UTF-8"), "ISO8859-1");
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str11)) {
            a(sb, "OS", str11);
        }
        a(sb, "API", O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(new StringBuilder(), "", Build.VERSION.SDK_INT));
        return sb.toString();
    }

    private static String a(String str) {
        if (TbsConfig.APP_WX.equals(str)) {
            return "WX";
        }
        if (TbsConfig.APP_QQ.equals(str)) {
            return "QQ";
        }
        if (TbsConfig.APP_QZONE.equals(str)) {
            return "QZ";
        }
        return TbsConfig.APP_QB.equals(str) ? "QB" : "TRD";
    }

    private static void a(StringBuilder sb, String str, String str2) {
        sb.append("&");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
    }
}
