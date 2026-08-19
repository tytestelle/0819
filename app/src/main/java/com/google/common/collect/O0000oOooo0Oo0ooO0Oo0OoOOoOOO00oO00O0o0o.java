package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000oOooo0Oo0ooO0Oo0OoOOoOOO00oO00O0o0o extends O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public Object[] f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public boolean f3494O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O0000oOooo0Oo0ooO0Oo0OoOOoOOO00oO00O0o0o(int i) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "initialCapacity");
        this.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Object[i];
        this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0;
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj) {
        obj.getClass();
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(1);
        Object[] objArr = this.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i = this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i + 1;
        objArr[i] = obj;
    }

    public void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(obj);
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(int i, Object[] objArr) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i, objArr);
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(i);
        System.arraycopy(objArr, 0, this.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, i);
        this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO += i;
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(collection.size());
            if (collection instanceof O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) {
                this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = ((O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) collection).copyIntoArray(this.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(it.next());
        }
    }

    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(int i) {
        Object[] objArr = this.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objArr.length, this.f3493O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + i);
        if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o > objArr.length || this.f3494O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            this.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Arrays.copyOf(this.f3492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            this.f3494O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
        }
    }
}
