package O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {
    private static volatile Choreographer choreographer;

    static {
        Object objM1constructorimpl;
        try {
            objM1constructorimpl = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Looper.getMainLooper())));
        } catch (Throwable th) {
            objM1constructorimpl = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(th));
        }
        if (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m6isFailureimpl(objM1constructorimpl)) {
            objM1constructorimpl = null;
        }
    }

    public static final Handler O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (objInvoke != null) {
            return (Handler) objInvoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }
}
