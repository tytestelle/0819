package com.github.tvbox.osc.ui.dialog;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    public static String O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return "未知网络";
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "无线网络";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "移动数据";
                }
            }
        } else {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 1) {
                    return "无线网络";
                }
                if (activeNetworkInfo.getType() == 0) {
                    return "移动数据";
                }
            }
        }
        return "未知网络";
    }
}
