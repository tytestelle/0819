package kotlin.coroutines;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements Serializable {
    public static final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO Companion = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    private static final long serialVersionUID = 0;
    private final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] elements;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] elements) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        this.elements = elements;
    }

    private final Object readResolve() {
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr = this.elements;
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoPlus = O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE;
        for (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo : o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr) {
            o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoPlus = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoPlus.plus(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        }
        return o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoPlus;
    }

    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] getElements() {
        return this.elements;
    }
}
