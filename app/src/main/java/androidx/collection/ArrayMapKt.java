package androidx.collection;

import O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayMapKt {
    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> ArrayMap<K, V> arrayMapOf(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0... pairs) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(pairs, "pairs");
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (ArrayMap<K, V>) new ArrayMap(pairs.length);
        for (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 : pairs) {
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.put(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getFirst(), o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getSecond());
        }
        return o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }
}
