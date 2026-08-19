package androidx.media3.common;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 {
    static {
        SimpleBasePlayer.PositionSupplier positionSupplier = SimpleBasePlayer.PositionSupplier.ZERO;
    }

    public static SimpleBasePlayer.PositionSupplier O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(long j) {
        return new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(j);
    }

    public static SimpleBasePlayer.PositionSupplier O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(final long j, final float f) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
            @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
            public final long get() {
                return O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(j, jElapsedRealtime, f);
            }
        };
    }

    public static /* synthetic */ long O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(long j, long j2, float f) {
        return j + ((long) ((SystemClock.elapsedRealtime() - j2) * f));
    }

    public static /* synthetic */ long O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(long j) {
        return j;
    }
}
