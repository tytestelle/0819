package org.eclipse.jetty.util;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.android.cast.dlna.dmr.CastAction;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {
    public static String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, int i2, String str) {
        if (i < 0) {
            return O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i2, "negative size: "));
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(str, Integer.valueOf(i)));
        }
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str, long j, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(str, Long.valueOf(j)));
        }
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(str, obj, obj2));
        }
    }

    public static void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i, int i2) {
        String strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i2, "negative size: "));
                }
                strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
        }
    }

    public static void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, i2, "index"));
        }
    }

    public static void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(int i, int i2, int i3) {
        String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, i3, "start index");
            } else {
                strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (i2 < 0 || i2 > i3) ? O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i2, i3, "end index") : O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
    }

    public static void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(String str, boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(str, obj));
        }
    }

    public static void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static long O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(j, "overflow: checkedAdd(", ", "), j2, ")"));
    }

    public static byte O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(long j) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("out of range: %s", j, (j >> 8) == 0);
        return (byte) j;
    }

    public static String O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    public static long O00000OOoOOO00O00o0ooooooooO000ooooO0000(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1598O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[roundingMode.ordinal()]) {
            case 1:
                O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
            default:
                throw new AssertionError();
        }
        return j3 + ((long) i);
    }

    public static int O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static long O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(long j, long j2) {
        O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(CmcdData.OBJECT_TYPE_AUDIO_ONLY, j);
        O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static Class O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(Type type) {
        Class clsO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(((ParameterizedType) type).getRawType());
        }
        if (!(type instanceof GenericArrayType) || (clsO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(((GenericArrayType) type).getGenericComponentType())) == null) {
            return null;
        }
        return Array.newInstance((Class<?>) clsO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, 0).getClass();
    }

    public static Method O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(Class cls, String str) {
        while (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                String name = method.getName();
                if (method.getParameterTypes().length == 0) {
                    if (name.startsWith("get")) {
                        if (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(name.substring(3)).equals(str)) {
                            return method;
                        }
                    } else if (name.startsWith("is") && O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(name.substring(2)).equals(str)) {
                        return method;
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static Method O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(Class cls, String str) {
        for (Class superclass = cls; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                return superclass.getDeclaredMethod(str, null);
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new IllegalArgumentException("No such method: " + cls.getName() + '.' + str);
    }

    public static String O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(String str) {
        if (str.startsWith("get")) {
            return O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(str.substring(3));
        }
        if (str.startsWith("is")) {
            return O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(str.substring(2));
        }
        if (str.startsWith("set")) {
            return O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(str.substring(3));
        }
        return null;
    }

    public static ArrayList O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(cls2)) {
                    arrayList.add(method);
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    public static Object O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(Object obj, Method method, Object... objArr) throws Exception {
        String strSubstring;
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalArgumentException e) {
            String string = "Could not invoke method by reflection: " + O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(method);
            if (objArr != null && objArr.length > 0) {
                StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, " with parameters: (");
                if (objArr.length != 0) {
                    StringBuilder sb = new StringBuilder();
                    for (Object obj2 : objArr) {
                        sb.append(", ");
                        if (obj2 == null) {
                            sb.append("null");
                        } else {
                            sb.append(obj2.getClass().getName());
                        }
                    }
                    strSubstring = sb.substring(2);
                } else {
                    strSubstring = "";
                }
                sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(strSubstring);
                sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(')');
                string = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
            }
            StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, " on: ");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.append(obj.getClass().getName());
            throw new IllegalArgumentException(sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.toString(), e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof Exception) {
                throw ((Exception) e2.getCause());
            }
            throw e2;
        }
    }

    public static kotlin.sequences.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(Function2 function2) {
        kotlin.sequences.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new kotlin.sequences.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4023O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(function2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    public static List O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }

    public static Class O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(Class cls, String str) throws ClassNotFoundException {
        HashSet hashSet = new HashSet();
        Class<?> cls2 = null;
        ClassNotFoundException classNotFoundException = null;
        for (ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader(); cls2 == null && contextClassLoader != null && hashSet.add(contextClassLoader); contextClassLoader = null) {
            try {
                cls2 = contextClassLoader.loadClass(str);
            } catch (ClassNotFoundException e) {
                if (classNotFoundException == null) {
                    classNotFoundException = e;
                }
            }
        }
        for (ClassLoader classLoader = cls.getClassLoader(); cls2 == null && classLoader != null && hashSet.add(classLoader); classLoader = null) {
            try {
                cls2 = classLoader.loadClass(str);
            } catch (ClassNotFoundException e2) {
                if (classNotFoundException == null) {
                    classNotFoundException = e2;
                }
            }
        }
        ClassLoader classLoader2 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.class.getClassLoader();
        if (cls2 == null && classLoader2 != null && hashSet.add(classLoader2)) {
            try {
                cls2 = Class.forName(str);
            } catch (ClassNotFoundException e3) {
                if (classNotFoundException == null) {
                    classNotFoundException = e3;
                }
            }
        }
        if (cls2 != null) {
            return cls2;
        }
        throw classNotFoundException;
    }

    public static void O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static long O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((j2 == Long.MIN_VALUE) & (j < 0))) {
            return j3;
        }
        long j4 = j * j2;
        return (j == 0 || j4 / j == j2) ? j4 : j3;
    }

    public static Context O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(Context context, String str) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putString("Locale.Helper.Selected.Language", str);
        editorEdit.apply();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = new Locale(str);
            Locale.setDefault(locale);
            Configuration configuration = context.getResources().getConfiguration();
            configuration.setLocale(locale);
            configuration.setLayoutDirection(locale);
            return context.createConfigurationContext(configuration);
        }
        Locale locale2 = new Locale(str);
        Locale.setDefault(locale2);
        Resources resources = context.getResources();
        Configuration configuration2 = resources.getConfiguration();
        configuration2.locale = locale2;
        configuration2.setLayoutDirection(locale2);
        resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
        return context;
    }

    public static void O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(com.android.cast.dlna.dmr.service.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, Function1 function1) {
        Context context = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2798O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Intent intent = new Intent("com.dlna.action.SetAvTransport");
        CastAction castAction = new CastAction(null, null, null, null, 31);
        function1.invoke(castAction);
        intent.putExtra("extra.castAction", castAction);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static void O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    public static String O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(Member member) {
        StringBuilder sb = new StringBuilder();
        String name = member.getDeclaringClass().getName();
        sb.append(name.substring(name.lastIndexOf(46) + 1, name.length()));
        sb.append('.');
        sb.append(member.getName());
        return sb.toString();
    }

    public static O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i, i2 - 1, 1);
        }
        O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1683O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        return O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1683O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }
}
