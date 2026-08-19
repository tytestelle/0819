package kotlin.coroutines;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function2 {
    public static final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo INSTANCE = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final String invoke(String acc, O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO element) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(acc, "acc");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}
