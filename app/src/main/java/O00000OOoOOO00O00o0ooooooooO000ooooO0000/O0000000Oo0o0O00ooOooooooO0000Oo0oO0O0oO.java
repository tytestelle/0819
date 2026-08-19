package O00000OOoOOO00O00o0ooooooooO000ooooO0000;

import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
import O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        this.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Runnable runnable) {
        O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1599O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1600O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.post(runnable);
    }

    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
        }
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
        return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o((O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) this.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 2);
    }

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        char[] cArr = O00000OOoOOO00O00o0ooooooooO000ooooO0000.f826O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayDeque(20);
    }
}
