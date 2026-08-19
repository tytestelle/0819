package O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final Handler f94O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Handler(Looper.getMainLooper());

    public static final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Runnable runnable) {
        if (kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            runnable.run();
        } else {
            f94O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.post(runnable);
        }
    }
}
