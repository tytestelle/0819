package O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final int f449O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Context f450O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ActivityManager f451O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f452O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final float f453O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    static {
        f449O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Context context) {
        this.f453O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f449O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.f450O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f451O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = activityManager;
        this.f452O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context.getResources().getDisplayMetrics(), 2);
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f453O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0.0f;
    }
}
