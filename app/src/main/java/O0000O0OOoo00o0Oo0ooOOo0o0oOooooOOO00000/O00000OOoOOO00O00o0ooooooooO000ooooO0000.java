package O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class O00000OOoOOO00O00o0ooooooooO000ooooO0000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final char[] f826O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final char[] f827O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new char[64];

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static volatile Handler f828O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f825O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    public static ArrayList O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        if (f828O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            synchronized (O00000OOoOOO00O00o0ooooooooO000ooooO0000.class) {
                try {
                    if (f828O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                        f828O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f828O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public static int O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(int i, Object obj) {
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(obj == null ? 0 : obj.hashCode(), i);
    }

    public static boolean O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i, int i2) {
        return (i > 0 || i == Integer.MIN_VALUE) && (i2 > 0 || i2 == Integer.MIN_VALUE);
    }

    public static void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Runnable runnable) {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO().post(runnable);
    }
}
