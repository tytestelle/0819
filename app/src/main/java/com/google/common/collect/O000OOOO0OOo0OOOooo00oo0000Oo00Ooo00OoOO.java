package com.google.common.collect;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO extends O0000oOooo0Oo0ooO0Oo0OoOOoOOO00oO00O0o0o {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public Object[] f3540O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public int f3541O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    @Override // com.google.common.collect.O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo
    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: merged with bridge method [inline-methods] */
    public O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        obj.getClass();
        if (this.f3540O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
            int iChooseTableSize = O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.chooseTableSize(this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            Object[] objArr = this.f3540O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            if (iChooseTableSize <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(iHashCode);
                while (true) {
                    int i = iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 & length;
                    Object[] objArr2 = this.f3540O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f3541O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 += iHashCode;
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(obj);
                        break;
                    }
                    if (obj2.equals(obj)) {
                        break;
                    }
                    iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = i + 1;
                }
                return this;
            }
        }
        this.f3540O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(obj);
        return this;
    }

    public O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Object... objArr) {
        if (this.f3540O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
            for (Object obj : objArr) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj);
            }
        } else {
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(objArr.length, objArr);
        }
        return this;
    }

    public O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Iterable iterable) {
        iterable.getClass();
        if (this.f3540O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(it.next());
            }
        } else {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(iterable);
        }
        return this;
    }

    @Override // com.google.common.collect.O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo
    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: merged with bridge method [inline-methods] */
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i = this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i == 0) {
            return O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of();
        }
        if (i == 1) {
            Object obj = this.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[0];
            Objects.requireNonNull(obj);
            return O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of(obj);
        }
        if (this.f3540O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null || O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.chooseTableSize(i) != this.f3540O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.length) {
            o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size();
        } else {
            Object[] objArrCopyOf = O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.access$000(this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length) ? Arrays.copyOf(this.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) : this.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            int i2 = this.f3541O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            Object[] objArr = this.f3540O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000ooOOooOoooO00oooO0OO00oo0oOoO0Oo0o0O(objArrCopyOf, i2, objArr, objArr.length - 1, this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
        this.f3494O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = true;
        this.f3540O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        return o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO) {
        if (this.f3540O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
            for (int i = 0; i < o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO; i++) {
                Object obj = o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i];
                Objects.requireNonNull(obj);
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj);
            }
        } else {
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        return this;
    }
}
