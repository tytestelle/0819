package com.tencent.smtt.sdk;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class MultiProcessHelper {
    private static Object a(String str, Bundle bundle) {
        u uVarA = u.a();
        if (uVarA != null && uVarA.b()) {
            try {
                return uVarA.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "invokeStaticMiscMethod", new Class[]{String.class, Bundle.class}, str, bundle);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean getMultiProcessAutoRecoveryEnabled() {
        Object objA = a("getMultiProcessAutoRecoveryEnabled", null);
        if (objA instanceof Boolean) {
            return ((Boolean) objA).booleanValue();
        }
        return true;
    }

    public static String getMultiProcessChoseTypeReason() {
        Object objA = a("getMultiProcessChoseTypeReason", null);
        return objA instanceof String ? (String) objA : "";
    }

    public static boolean getMultiProcessNoSandBoxEnabled() {
        Object objA = a("getMultiProcessNoSandBoxIfNotIsolatedEnabled", null);
        if (objA instanceof Boolean) {
            return ((Boolean) objA).booleanValue();
        }
        return true;
    }

    public static int getMultiProcessType() {
        Object objA = a("getMultiProcessType", null);
        if (objA instanceof Integer) {
            return ((Integer) objA).intValue();
        }
        return -1;
    }
}
