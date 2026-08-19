package kotlin.collections;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 extends O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {
    public static int O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(Iterable iterable) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
