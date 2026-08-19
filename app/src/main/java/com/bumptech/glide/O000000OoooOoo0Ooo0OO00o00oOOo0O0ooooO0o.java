package com.bumptech.glide;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static volatile boolean f2823O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = true;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static Stack f2824O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public static List O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new com.google.common.primitives.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iArr);
    }

    public static int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(long j) {
        int i = (int) j;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Out of range: %s", j, ((long) i) == j);
        return i;
    }

    public static int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, int i2) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), 1073741823);
        }
        throw new IllegalArgumentException(O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), 1073741823));
    }

    public static Object O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static int O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, kotlin.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O key) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        if (kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getKey(), key)) {
            return o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        }
        return null;
    }

    public static Drawable O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f2823O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                return O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return ContextCompat.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f2823O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.getDrawable(context2.getResources(), i, theme);
    }

    public static final Class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "<this>");
        Class clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ((kotlin.jvm.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        if (!clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isPrimitive()) {
            return clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        String name = clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : Double.class;
            case 104431:
                return !name.equals("int") ? clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : Character.class;
            case 3327612:
                return !name.equals("long") ? clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : Long.class;
            case 3625364:
                return !name.equals("void") ? clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : Void.class;
            case 64711720:
                return !name.equals(TypedValues.Custom.S_BOOLEAN) ? clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : Boolean.class;
            case 97526364:
                return !name.equals(TypedValues.Custom.S_FLOAT) ? clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : Float.class;
            case 109413500:
                return !name.equals("short") ? clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : Short.class;
            default:
                return clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
    }

    public static long O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(double d) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("not a normal value", O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static Object O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static int O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static boolean O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
        try {
            return Class.forName("android.os.Looper").getDeclaredMethod("getMainLooper", null).invoke(null, null) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static boolean O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static Drawable O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i);
    }

    public static kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, kotlin.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O key) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        return kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getKey(), key) ? kotlin.coroutines.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE : o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
    }

    public static int O00000OOoOOO00O00o0ooooooooO000ooooO0000(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(Collection collection) {
        if (collection instanceof com.google.common.primitives.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            return ((com.google.common.primitives.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) collection).toIntArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    public static Integer O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(String str) {
        byte b;
        Long lValueOf;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt < 128) {
                    b = com.google.common.primitives.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f3712O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[cCharAt];
                } else {
                    byte[] bArr = com.google.common.primitives.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f3712O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    long j2 = 10;
                    long j3 = Long.MIN_VALUE / j2;
                    while (true) {
                        if (i2 >= str.length()) {
                            if (i == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i3 = i2 + 1;
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 128) {
                            b2 = com.google.common.primitives.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f3712O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[cCharAt2];
                        } else {
                            byte[] bArr2 = com.google.common.primitives.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f3712O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                            b2 = -1;
                        }
                        if (b2 >= 0 && b2 < 10 && j >= j3) {
                            long j4 = j * j2;
                            long j5 = b2;
                            if (j4 >= j5 - Long.MIN_VALUE) {
                                j = j4 - j5;
                                i2 = i3;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public static Throwable O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(Throwable th) {
        if (th == null) {
            throw new IllegalArgumentException("Cannot unwrap null throwable");
        }
        Throwable th2 = th;
        while (th != null) {
            th2 = th;
            th = th.getCause();
        }
        return th2;
    }
}
