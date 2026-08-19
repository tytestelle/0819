package kotlinx.coroutines.internal;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f4136O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        String property;
        int i = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4139O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = Arrays.asList(new O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()).iterator();
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(it, "<this>");
            Iterator it2 = kotlin.sequences.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(new kotlin.sequences.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new kotlin.sequences.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(it, 1))).iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ((O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) next).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                    do {
                        Object next2 = it2.next();
                        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = ((O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) next2).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                        if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO < iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2) {
                            next = next2;
                            iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
                        }
                    } while (it2.hasNext());
                }
            }
            O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) next;
            if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            try {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper == null) {
                    throw new IllegalStateException("The main looper is not available");
                }
                f4136O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(mainLooper));
            } catch (Throwable th) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
