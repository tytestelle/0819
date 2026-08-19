package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000ooOO00oooOoO0oOOo00ooo0O0o00oOOOOoO0 implements Serializable {
    private static final long serialVersionUID = 0;
    final int[] counts;
    final Object[] elements;

    public O000ooOO00oooOoO0oOOo00ooo0O0o00oOOOOoO0(O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) {
        int size = o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o.entrySet().size();
        this.elements = new Object[size];
        this.counts = new int[size];
        int i = 0;
        for (O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 : o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o.entrySet()) {
            this.elements[i] = o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getElement();
            this.counts[i] = o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount();
            i++;
        }
    }

    public Object readResolve() {
        O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = new O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO(this.elements.length);
        int i = 0;
        while (true) {
            Object[] objArr = this.elements;
            if (i >= objArr.length) {
                break;
            }
            Object obj = objArr[i];
            int i2 = this.counts[i];
            if (i2 != 0) {
                obj.getClass();
                o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(obj) + i2, obj);
            }
            i++;
        }
        return o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 0 ? O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0.of() : new O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO);
    }
}
