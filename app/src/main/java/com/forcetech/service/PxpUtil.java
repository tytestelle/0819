package com.forcetech.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.gsoft.mitv.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public class PxpUtil {
    public static int MTV = 9002;
    public static int P2P = 9906;
    public static int P3P = 9907;
    public static int P4P = 9908;
    public static int P5P = 9909;
    public static int P6P = 9910;
    public static int P7P = 9911;
    public static int P8P = 9912;
    public static int P9P = 9913;

    private static Class<?> clz(String str) {
        str.getClass();
        switch (str) {
            case "p2p":
                return P2PService.class;
            case "p3p":
            case "p9p":
                return P3PService.class;
            case "p4p":
            case "p7p":
                return P4PService.class;
            case "p5p":
            case "p8p":
                return P5PService.class;
            case "p6p":
                return P6PService.class;
            default:
                return MainActivity.class;
        }
    }

    public static Intent intent(Context context, String str) {
        Intent intent = new Intent(context, clz(str));
        intent.putExtra("scheme", str);
        return intent;
    }

    public static int port(String str) {
        str.getClass();
        switch (str) {
            case "p2p":
                return P2P;
            case "p3p":
            case "p9p":
                return P3P;
            case "p4p":
            case "p7p":
                return P4P;
            case "p5p":
            case "p8p":
                return P5P;
            case "p6p":
                return P6P;
            default:
                return MTV;
        }
    }

    public static String scheme(String str) {
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null) {
            return "";
        }
        if (scheme.equals("P2p")) {
            scheme = "mitv";
        }
        return scheme.toLowerCase();
    }

    public static String trans(ComponentName componentName) {
        String className = componentName.getClassName();
        return className.substring(className.lastIndexOf(".") + 1).replace("Service", "").replace("MainActivity", "mitv").toLowerCase();
    }
}
