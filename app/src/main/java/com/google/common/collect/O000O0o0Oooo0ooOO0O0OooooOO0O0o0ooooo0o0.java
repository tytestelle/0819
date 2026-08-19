package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class O000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public AbstractMap f3518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0(int i) {
        if (i > 0) {
            this.f3518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new LinkedHashMap(O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i));
        }
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0 o000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0) {
        AbstractMap abstractMap = o000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0.f3518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (abstractMap != null) {
            for (Map.Entry entry : abstractMap.entrySet()) {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(entry.getKey(), ((O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo) entry.getValue()).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
            }
        }
    }

    public int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Iterable iterable) {
        if (iterable instanceof Collection) {
            return Math.max(4, ((Collection) iterable).size());
        }
        return 4;
    }

    public O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builderWithExpectedSize(i);
    }

    public O000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0 O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj, Object obj2) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(obj, obj2);
        AbstractMap abstractMapCreate = this.f3518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (abstractMapCreate == null) {
            abstractMapCreate = O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.create();
            this.f3518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = abstractMapCreate;
        }
        O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo o0000oo0OOOooO0OOO00000oO0o00oo000000OooO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo) abstractMapCreate.get(obj);
        if (o0000oo0OOOooO0OOO00000oO0o00oo000000OooO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            o0000oo0OOOooO0OOO00000oO0o00oo000000OooO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(4);
            AbstractMap abstractMapCreate2 = this.f3518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (abstractMapCreate2 == null) {
                abstractMapCreate2 = O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.create();
                this.f3518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = abstractMapCreate2;
            }
            abstractMapCreate2.put(obj, o0000oo0OOOooO0OOO00000oO0o00oo000000OooO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
        o0000oo0OOOooO0OOO00000oO0o00oo000000OooO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj2);
        return this;
    }

    public void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Map.Entry entry) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(entry.getKey(), entry.getValue());
    }

    public void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj, Iterable iterable) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(iterable));
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            AbstractMap abstractMapCreate = this.f3518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (abstractMapCreate == null) {
                abstractMapCreate = O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.create();
                this.f3518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = abstractMapCreate;
            }
            O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo o0000oo0OOOooO0OOO00000oO0o00oo000000OooO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo) abstractMapCreate.get(obj);
            if (o0000oo0OOOooO0OOO00000oO0o00oo000000OooO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                o0000oo0OOOooO0OOO00000oO0o00oo000000OooO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(iterable));
                AbstractMap abstractMapCreate2 = this.f3518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (abstractMapCreate2 == null) {
                    abstractMapCreate2 = O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.create();
                    this.f3518O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = abstractMapCreate2;
                }
                abstractMapCreate2.put(obj, o0000oo0OOOooO0OOO00000oO0o00oo000000OooO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            }
            while (it.hasNext()) {
                Object next = it.next();
                O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(obj, next);
                o0000oo0OOOooO0OOO00000oO0o00oo000000OooO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(next);
            }
        }
    }
}
