package com.tencent.smtt.utils;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class j {
    public static Object a(Class<?> cls, String str, Class<?>[] clsArr, Object... objArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            method.setAccessible(true);
            return method.invoke(null, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object a(Object obj, String str) {
        return a(obj, str, (Class<?>[]) null, new Object[0]);
    }

    public static Object a(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        if (obj == null) {
            return null;
        }
        try {
            Method method = obj.getClass().getMethod(str, clsArr);
            method.setAccessible(true);
            if (objArr.length == 0) {
                objArr = null;
            }
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            if (th.getCause() != null && th.getCause().toString().contains("AuthenticationFail")) {
                return new String("AuthenticationFail");
            }
            if (str == null || (!str.equalsIgnoreCase("canLoadX5Core") && !str.equalsIgnoreCase("initTesRuntimeEnvironment"))) {
                TbsLog.i("ReflectionUtils", "invokeInstance -- exceptions:" + Log.getStackTraceString(th));
                return null;
            }
            return null;
        }
    }

    public static Object a(String str, String str2) {
        try {
            return Class.forName(str).getMethod(str2, null).invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method a(Object obj, String str, Class<?>... clsArr) {
        for (Class<?> superclass = obj.getClass(); superclass != Object.class && superclass != null; superclass = superclass.getSuperclass()) {
            try {
                return superclass.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
