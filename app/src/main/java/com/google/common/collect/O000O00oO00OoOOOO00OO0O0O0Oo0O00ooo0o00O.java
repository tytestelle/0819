package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public Object[] f3503O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO f3505O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O(int i) {
        this.f3503O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Object[i * 2];
    }

    public O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO = this.f3505O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO != null) {
            throw o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o o000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000oCreate = O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o.create(this.f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f3503O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this);
        O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO2 = this.f3505O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO2 == null) {
            return o000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000oCreate;
        }
        throw o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        int i2 = i * 2;
        Object[] objArr = this.f3503O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i2 > objArr.length) {
            this.f3503O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Arrays.copyOf(objArr, O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objArr.length, i2));
        }
    }

    public O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj, Object obj2) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + 1);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(obj, obj2);
        Object[] objArr = this.f3503O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i = this.f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        objArr[i * 2] = obj;
        objArr[(i * 2) + 1] = obj2;
        this.f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i + 1;
        return this;
    }

    public void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Map.Entry entry) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(entry.getKey(), entry.getValue());
    }
}
