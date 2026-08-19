package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final Object[] f4005O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Object[0];

    public static boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(nullPointerException, O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.class.getName());
        throw nullPointerException;
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(nullPointerException, O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.class.getName());
        throw nullPointerException;
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(nullPointerException, O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.class.getName());
        throw nullPointerException;
    }

    public static void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(nullPointerException, O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.class.getName());
            throw nullPointerException;
        }
    }

    public static void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(String str) {
        O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("lateinit property ", str, " has not been initialized"));
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.class.getName());
        throw o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
    }

    public static final Object[] O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Collection collection) {
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(collection, "collection");
        int size = collection.size();
        Object[] objArr = f4005O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }

    public static final Object[] O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }
}
