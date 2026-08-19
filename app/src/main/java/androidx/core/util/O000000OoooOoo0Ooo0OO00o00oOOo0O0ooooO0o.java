package androidx.core.util;

import androidx.core.content.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    public static Predicate O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(predicate, predicate2, 1);
    }

    public static Predicate O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Predicate predicate) {
        return new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(predicate, 1);
    }

    public static Predicate O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(predicate, predicate2, 0);
    }

    public static /* synthetic */ boolean O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) && predicate2.test(obj);
    }

    public static /* synthetic */ boolean O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    public static /* synthetic */ boolean O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) || predicate2.test(obj);
    }

    public static Predicate O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Object obj) {
        return obj == null ? new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(11) : new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj, 0);
    }

    public static /* synthetic */ boolean O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj) {
        return obj == null;
    }

    public static Predicate O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }
}
