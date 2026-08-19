package kotlin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O extends O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    public static O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() {
        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.INSTANCE;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
    }

    public static int O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
        }
        if (size == 1) {
            O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 pair = (O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) arrayList.get(0);
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(pair, "pair");
            Map mapSingletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(mapSingletonMap, "singletonMap(pair.first, pair.second)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) it.next();
            linkedHashMap.put(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.component1(), o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.component2());
        }
        return linkedHashMap;
    }
}
