package com.tencent.smtt.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.tencent.smtt.sdk.TbsPrivacyAccess;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class k {
    private static SharedPreferences a;
    private static SharedPreferences.Editor b;

    private static String a() {
        return Build.FINGERPRINT + new Random().nextInt(2147483646);
    }

    private static String b(Context context) {
        try {
            String strA = s.a(context);
            return new UUID(("" + new Random().nextInt(2147483646) + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.DEVICE.length() % 10) + (Build.HARDWARE.length() % 10) + (Build.ID.length() % 10) + (strA.length() % 10) + (Build.PRODUCT.length() % 10) + (c(context).length() % 10)).hashCode(), c(context).hashCode()).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String c(Context context) {
        try {
            String configurePrivacy = TbsPrivacyAccess.getConfigurePrivacy(context, TbsPrivacyAccess.ConfigurablePrivacy.SERIAL, "");
            if (!TextUtils.isEmpty(configurePrivacy) && !configurePrivacy.contains("unknown")) {
                return configurePrivacy;
            }
            return a();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public static String a(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("tsui", 0);
        a = sharedPreferences;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("tsui", "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        StringBuilder sb = new StringBuilder();
        String strA = a();
        String strG = b.g(context);
        String strC = c(context);
        String strReplace = b(context).replace("-", "");
        if (strA != null && strA.length() > 0) {
            sb.append(strA);
            sb.append("|");
        }
        if (strG != null && strG.length() > 0) {
            sb.append(strG);
            sb.append("|");
        }
        if (strC != null && strC.length() > 0) {
            sb.append(strC);
            sb.append("|");
        }
        if (strReplace != null && strReplace.length() > 0) {
            sb.append(strReplace);
        }
        if (sb.length() > 0) {
            String strA2 = a(sb.toString());
            if (!TextUtils.isEmpty(strA2)) {
                a(context, "tsui", strA2);
                return strA2;
            }
        }
        String strReplace2 = UUID.randomUUID().toString().replace("-", "");
        a(context, "tsui", strReplace2);
        return strReplace2;
    }

    private static byte[] b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (Exception unused) {
            return "".getBytes();
        }
    }

    public static String a(String str) {
        try {
            String strA = a(b(str));
            return strA.length() > 0 ? strA : "";
        } catch (Exception e) {
            TbsLog.w("SDKUID", "encrypt sdkuid failed, origin is " + str + "reason: " + e);
            return "";
        }
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append(SessionDescription.SUPPORTED_SDP_VERSION);
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase(Locale.CHINA);
    }

    private static void a(Context context, String str, String str2) {
        if (a == null) {
            a = context.getApplicationContext().getSharedPreferences("tsui", 0);
        }
        SharedPreferences.Editor editorEdit = a.edit();
        b = editorEdit;
        editorEdit.putString(str, str2);
        b.commit();
    }
}
