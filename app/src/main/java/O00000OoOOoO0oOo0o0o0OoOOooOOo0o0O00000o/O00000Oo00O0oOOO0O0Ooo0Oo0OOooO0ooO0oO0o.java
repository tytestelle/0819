package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final ArrayDeque f505O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public Object f506O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        char[] cArr = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.f826O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f505O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayDeque(0);
    }

    public static O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
        ArrayDeque arrayDeque = f505O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        synchronized (arrayDeque) {
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) arrayDeque.poll();
        }
        if (o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o == null) {
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
        }
        o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f506O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
        return o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o)) {
            return false;
        }
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) obj;
        o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.getClass();
        return this.f506O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.equals(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f506O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    public final int hashCode() {
        return this.f506O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.hashCode();
    }
}
