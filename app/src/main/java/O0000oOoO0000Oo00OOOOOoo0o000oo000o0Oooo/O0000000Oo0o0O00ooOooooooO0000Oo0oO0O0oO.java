package O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo;

import java.util.Random;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {
    public abstract Random O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();

    @Override // O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final int nextBits(int i) {
        return ((-i) >> 31) & (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().nextInt() >>> (32 - i));
    }

    @Override // O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final boolean nextBoolean() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().nextBoolean();
    }

    @Override // O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final byte[] nextBytes(byte[] array) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(array, "array");
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().nextBytes(array);
        return array;
    }

    @Override // O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final double nextDouble() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().nextDouble();
    }

    @Override // O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final float nextFloat() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().nextFloat();
    }

    @Override // O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final int nextInt() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().nextInt();
    }

    @Override // O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final long nextLong() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().nextLong();
    }

    @Override // O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final int nextInt(int i) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().nextInt(i);
    }
}
