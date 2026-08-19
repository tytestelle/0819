package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import android.os.Build;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.tencent.smtt.sdk.TbsListener;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final boolean f615O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final boolean f616O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final File f617O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static volatile O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo f618O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f620O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public boolean f621O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = true;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final AtomicBoolean f622O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f619O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;

    static {
        int i = Build.VERSION.SDK_INT;
        f615O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i < 29;
        f616O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = i >= 28;
        f617O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new File("/proc/self/fd");
    }

    public static O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        if (f618O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
            synchronized (O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.class) {
                try {
                    if (f618O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                        f618O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f618O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    public final int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return TbsListener.ErrorCode.INFO_CODE_MINIQB;
                }
            }
        }
        return this.f619O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final boolean O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f616O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (f615O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 && !this.f622O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i < 0 || i2 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        synchronized (this) {
            try {
                int i3 = this.f620O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + 1;
                this.f620O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i3;
                if (i3 >= 50) {
                    this.f620O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0;
                    int length = f617O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.list().length;
                    long jO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                    boolean z4 = ((long) length) < jO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    this.f621O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = z4;
                    if (!z4 && Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    }
                }
                z3 = this.f621O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }
}
