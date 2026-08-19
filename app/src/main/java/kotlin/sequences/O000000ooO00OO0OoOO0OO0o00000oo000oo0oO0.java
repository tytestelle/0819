package kotlin.sequences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 extends O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O {
    public static Object O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.hasNext()) {
            return o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.next();
        }
        return null;
    }

    public static O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(Object obj, Function1 nextFunction) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(nextFunction, "nextFunction");
        return obj == null ? O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4009O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(obj), nextFunction);
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, Function1 transform) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(transform, "transform");
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, transform);
        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 predicate = O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, predicate);
    }

    public static List O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        ArrayList arrayList = new ArrayList();
        Iterator it = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? arrayList : org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(arrayList.get(0));
        }
        return O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.INSTANCE;
    }
}
