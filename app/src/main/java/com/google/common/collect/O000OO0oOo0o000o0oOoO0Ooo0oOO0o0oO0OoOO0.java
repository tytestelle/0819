package com.google.common.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ArrayList f3535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayList();

    public final O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        ArrayList arrayList = this.f3535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int size = arrayList.size();
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(size, "initialCapacity");
        Object[] objArrCopyOf = new Object[size];
        Collections.sort(arrayList, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.rangeLexOrdering());
        O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(arrayList.iterator());
        int i = 0;
        while (o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.hasNext()) {
            O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Span = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.next();
            while (o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.hasNext()) {
                O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                if (!o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Span.isConnected(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0)) {
                    break;
                }
                org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Span.intersection(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Span, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
                o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Span = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Span.span((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0oO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.next());
            }
            o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Span.getClass();
            int i2 = i + 1;
            int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objArrCopyOf.length, i2);
            if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            }
            objArrCopyOf[i] = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Span;
            i = i2;
        }
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsImmutableList = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.asImmutableList(objArrCopyOf, i);
        if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsImmutableList.isEmpty()) {
            return O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o.of();
        }
        return (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsImmutableList.size() == 1 && ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsImmutableList)).equals(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all())) ? O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o.all() : new O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAsImmutableList);
    }
}
