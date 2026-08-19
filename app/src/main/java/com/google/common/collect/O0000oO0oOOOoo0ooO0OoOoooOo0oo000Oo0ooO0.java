package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0 extends O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo implements Serializable {
    private static final long serialVersionUID = 0;
    final O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o rankMap;

    public O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o) {
        this.rankMap = o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Integer num = (Integer) this.rankMap.get(obj);
        if (num == null) {
            throw new O000oOOoO000OOoO0O0O0O0o0o0oo0OO0O000OOo(obj);
        }
        int iIntValue = num.intValue();
        Integer num2 = (Integer) this.rankMap.get(obj2);
        if (num2 != null) {
            return iIntValue - num2.intValue();
        }
        throw new O000oOOoO000OOoO0O0O0O0o0o0oo0OO0O000OOo(obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0) {
            return this.rankMap.equals(((O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0) obj).rankMap);
        }
        return false;
    }

    public int hashCode() {
        return this.rankMap.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.rankMap.keySet() + ")";
    }

    public O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0(List<Object> list) {
        O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O = new O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O(list.size());
        Iterator<Object> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(it.next(), Integer.valueOf(i));
            i++;
        }
        this(o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
    }
}
