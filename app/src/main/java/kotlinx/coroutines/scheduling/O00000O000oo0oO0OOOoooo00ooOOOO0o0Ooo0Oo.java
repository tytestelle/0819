package kotlinx.coroutines.scheduling;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final long f4175O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = kotlinx.coroutines.internal.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("kotlinx.coroutines.scheduler.resolution.ns", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1, Long.MAX_VALUE);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final int f4176O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final int f4177O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final long f4178O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f4179O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f4180O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f4181O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    static {
        int i = kotlinx.coroutines.internal.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4139O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i < 2) {
            i = 2;
        }
        f4176O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = kotlinx.coroutines.internal.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("kotlinx.coroutines.scheduler.core.pool.size", i, 1, 0, 8);
        f4177O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = kotlinx.coroutines.internal.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f4178O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = TimeUnit.SECONDS.toNanos(kotlinx.coroutines.internal.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f4179O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4169O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4180O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(0);
        f4181O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(1);
    }
}
