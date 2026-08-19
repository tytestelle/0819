package O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import kotlinx.coroutines.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends kotlin.coroutines.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {
    private volatile Object _preHandler;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        super(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4062O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        this._preHandler = this;
    }

    public void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Throwable th) {
        Method declaredMethod;
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
            return;
        }
        Object obj = this._preHandler;
        if (obj != this) {
            declaredMethod = (Method) obj;
        } else {
            try {
                declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                if (!Modifier.isPublic(declaredMethod.getModifiers()) || !Modifier.isStatic(declaredMethod.getModifiers())) {
                    declaredMethod = null;
                }
            } catch (Throwable unused) {
            }
            this._preHandler = declaredMethod;
        }
        Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
