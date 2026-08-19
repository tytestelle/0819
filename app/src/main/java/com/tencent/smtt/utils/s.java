package com.tencent.smtt.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsConfig;
import com.tencent.smtt.sdk.TbsPrivacyAccess;

/* JADX INFO: loaded from: classes2.dex */
public class s {
    private static String a = "";

    public static long a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
    }

    public static String b(Context context) {
        return "removenone";
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("sai", 0);
            String string = sharedPreferences.getString("bmo", "");
            a = string;
            if (!TextUtils.isEmpty(string)) {
                return a;
            }
            TbsPrivacyAccess.ConfigurablePrivacy configurablePrivacy = TbsPrivacyAccess.ConfigurablePrivacy.MODEL;
            a = TbsPrivacyAccess.getConfigurePrivacy(context, configurablePrivacy, "");
            TbsLog.i("TbsUtils", "getBuildModel from sp is " + a);
            if (!TextUtils.isEmpty(a)) {
                return a;
            }
            if (TextUtils.isEmpty(a) && !TbsConfig.APP_QQ.equals(context.getPackageName())) {
                a = Build.MODEL;
            }
            TbsLog.i("TbsUtils", "getBuildModel is " + a);
            if (!TextUtils.isEmpty(a)) {
                TbsPrivacyAccess.configurePrivacy(context, configurablePrivacy, a);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("bmo", a);
                editorEdit.commit();
            }
            return a;
        } catch (Throwable th) {
            TbsLog.i("TbsUtils", "stack is " + Log.getStackTraceString(th));
        }
    }

    public static void a(Context context, Bundle bundle) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("sai", 0).edit();
            if (bundle.containsKey(QbSdk.KEY_THIRD_PARTY_TURING)) {
                boolean z = bundle.getBoolean(QbSdk.KEY_THIRD_PARTY_TURING);
                editorEdit.putBoolean("itge", z);
                TbsLog.e("TbsUtils", "setEnableForThirdParty key is itge value is " + z);
            }
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }
}
