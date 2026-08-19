package O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 f448O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    @Override // O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO
    public final int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj) {
        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = (O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) obj;
        if (o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o == null) {
            return 1;
        }
        return o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.getSize();
    }

    @Override // O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj, Object obj2) {
        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = (O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) obj2;
        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = this.f448O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 == null || o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o == null) {
            return;
        }
        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f313O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, true);
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(int i) {
        long j;
        if (i >= 40) {
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j = this.f819O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            }
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(j / 2);
        }
    }
}
