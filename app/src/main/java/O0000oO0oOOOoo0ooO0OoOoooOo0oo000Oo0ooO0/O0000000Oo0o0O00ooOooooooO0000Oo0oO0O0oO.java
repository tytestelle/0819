package O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0;

import java.lang.reflect.Method;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final Method f1669O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        Method method;
        Method[] throwableMethods = Throwable.class.getMethods();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(throwableMethods, "throwableMethods");
        int length = throwableMethods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = throwableMethods[i];
            if (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(parameterTypes, "it.parameterTypes");
                if (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f1669O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = method;
        int length2 = throwableMethods.length;
        for (int i2 = 0; i2 < length2 && !O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(throwableMethods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
