package com.bumptech.glide;

import android.os.Handler;
import android.view.View;
import com.tencent.smtt.sdk.TbsListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {
    public static final String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(View view) {
        view.setClickable(false);
        new Handler().postDelayed(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(view, 4), TbsListener.ErrorCode.INFO_CODE_MINIQB);
    }

    public static boolean O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        try {
            String property = System.getProperty("os.name");
            return property != null && property.trim().toLowerCase().startsWith("mac");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static long[] O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("the total number of elements (%s) in the arrays must fit in an int", length, length == ((long) i));
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Function1 function1, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 completion) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(function1, "<this>");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(completion, "completion");
        if (function1 instanceof O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            return ((O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) function1).create(completion);
        }
        kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context = completion.getContext();
        return context == kotlin.coroutines.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE ? new kotlin.coroutines.intrinsics.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(completion, function1) : new kotlin.coroutines.intrinsics.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(completion, context, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Function2 function2, Object obj, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 completion) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(function2, "<this>");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(completion, "completion");
        if (function2 instanceof O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            return ((O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) function2).create(obj, completion);
        }
        kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context = completion.getContext();
        return context == kotlin.coroutines.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE ? new kotlin.coroutines.intrinsics.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(completion, function2, obj) : new kotlin.coroutines.intrinsics.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(completion, context, function2, obj);
    }

    public static boolean O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Intercepted;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, "<this>");
        O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o ? (O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 : null;
        return (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null || (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Intercepted = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.intercepted()) == null) ? o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 : o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Intercepted;
    }

    public static int O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(int i) {
        int i2 = i % 65536;
        return i2 >= 0 ? i2 : i2 + 65536;
    }

    public static void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(java.util.logging.Handler... handlerArr) {
        Logger logger = LogManager.getLogManager().getLogger("");
        for (java.util.logging.Handler handler : logger.getHandlers()) {
            logger.removeHandler(handler);
        }
        for (java.util.logging.Handler handler2 : handlerArr) {
            if (handler2 != null) {
                LogManager.getLogManager().getLogger("").addHandler(handler2);
            }
        }
    }

    public static byte[] O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(Object obj) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objectOutputStream);
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(byteArrayOutputStream);
                        return byteArray;
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream2 = objectOutputStream;
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objectOutputStream2);
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objectOutputStream);
                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(byteArrayOutputStream);
                    return null;
                }
            } catch (IOException e2) {
                e = e2;
                objectOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objectOutputStream2);
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(byteArrayOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            byteArrayOutputStream = null;
            objectOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public static Object O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        ObjectInputStream objectInputStream;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    try {
                        Object object = objectInputStream.readObject();
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objectInputStream);
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(byteArrayInputStream);
                        return object;
                    } catch (Throwable th2) {
                        th = th2;
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objectInputStream);
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(byteArrayInputStream);
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objectInputStream);
                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(byteArrayInputStream);
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                objectInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objectInputStream);
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(byteArrayInputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            objectInputStream = null;
            byteArrayInputStream = null;
        } catch (Throwable th4) {
            byteArrayInputStream = null;
            th = th4;
            objectInputStream = null;
        }
    }
}
