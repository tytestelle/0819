package O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final double f814O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final /* synthetic */ int f815O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0;

    public static double O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f814O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }
}
