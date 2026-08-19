package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class O000O0O0oOoOo0OO0o0oooO0o0O0ooOOOooOOoo0 implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object keys;
    private final Object values;

    public O000O0O0oOoOo0OO0o0oooO0o0O0ooOOOooOOoo0(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o) {
        Object[] objArr = new Object[o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.size()];
        Object[] objArr2 = new Object[o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.size()];
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.keys = objArr;
        this.values = objArr2;
    }

    public final Object legacyReadResolve() {
        Object[] objArr = (Object[]) this.keys;
        Object[] objArr2 = (Object[]) this.values;
        O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OMakeBuilder = makeBuilder(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OMakeBuilder.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objArr[i], objArr2[i]);
        }
        return o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OMakeBuilder.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    public O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O makeBuilder(int i) {
        return new O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O(i);
    }

    public final Object readResolve() {
        Object obj = this.keys;
        if (!(obj instanceof O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0)) {
            return legacyReadResolve();
        }
        O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 = (O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0) obj;
        O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo o0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo = (O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) this.values;
        O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OMakeBuilder = makeBuilder(o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.size());
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.iterator();
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it2 = o0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo.iterator();
        while (it.hasNext()) {
            o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OMakeBuilder.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(it.next(), it2.next());
        }
        return o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OMakeBuilder.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }
}
