package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000oO0oOooooOOo0oO00Oo0OoO0Oo00OOOo0oo implements Iterable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3489O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Serializable f3490O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Object f3491O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O0000oO0oOooooOOo0oO00Oo0OoO0Oo00OOOo0oo(Iterable[] iterableArr) {
        this.f3489O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        this.f3491O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = iterableArr;
        this.f3490O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.absent();
    }

    public void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        Iterator it = ((ArrayList) this.f3491O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3489O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O0000oO0oOoo0Oo00o0oo00oo0Oo0ooOOo0o0oO0 o0000oO0oOoo0Oo00o0oo00oo0Oo0ooOOo0o0oO0 = new O0000oO0oOoo0Oo00o0oo00oo0Oo0ooOOo0o0oO0(this, ((Iterable[]) this.f3491O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).length);
                O000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O o000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O = new O000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O();
                o000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O.f3561O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000Oo00OoOOooO000o0oOo00oOo0OOOo0OOOo0o.f3558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                o000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O.f3562O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000oO0oOoo0Oo00o0oo00oo0Oo0ooOOo0o0oO0;
                return o000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O;
            default:
                return ((HashMap) this.f3490O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).keySet().iterator();
        }
    }

    public String toString() {
        switch (this.f3489O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o((Iterable) ((com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) this.f3490O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).or(this));
            default:
                return super.toString();
        }
    }

    public O0000oO0oOooooOOo0oO00Oo0OoO0Oo00OOOo0oo(HashMap map) {
        this.f3489O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 1;
        this.f3490O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();
        this.f3491O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ArrayList();
        String str = (String) map.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] strArrSplit = str2.trim().split("=");
                if (strArrSplit.length == 2) {
                    ((HashMap) this.f3490O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
    }
}
