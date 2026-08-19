package O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    @Override // O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final Random O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }

    @Override // O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final double nextDouble(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    @Override // O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final int nextInt(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final long nextLong(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final long nextLong(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
