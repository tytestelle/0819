package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O extends O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    public static LinkedHashSet O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(Set set, Set elements) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(set, "<this>");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(set.size() + Integer.valueOf(elements.size()).intValue()));
        linkedHashSet.addAll(set);
        linkedHashSet.addAll(elements);
        return linkedHashSet;
    }
}
