package kotlinx.coroutines;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final List f4064O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        try {
            Iterator it = Arrays.asList(new O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()).iterator();
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(it, "<this>");
            f4064O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = kotlin.sequences.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(new kotlin.sequences.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new kotlin.sequences.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(it, 1)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Throwable th) {
        Throwable runtimeException;
        Iterator it = f4064O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        while (it.hasNext()) {
            try {
                ((O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) it.next()).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(th, new O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo));
            O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        } catch (Throwable th3) {
            O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(th3));
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
