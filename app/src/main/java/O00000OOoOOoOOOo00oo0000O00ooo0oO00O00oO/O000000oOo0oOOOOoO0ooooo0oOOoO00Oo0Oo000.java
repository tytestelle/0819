package O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f454O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f455O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final int f456O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        Context context = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f450O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        ActivityManager activityManager = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f451O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f456O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f452O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f836O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f453O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        int iRound2 = Math.round(f * f2);
        int iRound3 = Math.round(f * 2.0f);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.f455O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = iRound3;
            this.f454O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = iRound2;
        } else {
            float f3 = i2 / (f2 + 2.0f);
            this.f455O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Math.round(2.0f * f3);
            this.f454O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Math.round(f3 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f455O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f454O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i));
            sb.append(", memory class limited? ");
            sb.append(i3 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
