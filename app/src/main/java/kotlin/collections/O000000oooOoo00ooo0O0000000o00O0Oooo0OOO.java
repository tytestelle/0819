package kotlin.collections;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO extends O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o {
    public static boolean O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(Object obj, Iterable iterable) {
        int iIndexOf;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                if (kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static Object O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(List list) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(list));
    }
}
