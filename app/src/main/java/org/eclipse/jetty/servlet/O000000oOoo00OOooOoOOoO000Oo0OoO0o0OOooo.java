package org.eclipse.jetty.servlet;

import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo extends O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    public final ArrayList O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = new ArrayList();

    /* JADX INFO: renamed from: O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, reason: collision with root package name */
    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO f4404O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

    /* JADX INFO: renamed from: O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0, reason: collision with root package name */
    public O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f4405O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        this.f1949O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this);
        this.f4404O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = null;
    }

    @Override // O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final void O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0() throws Exception {
        O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (this.f4404O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O == null && !isStarted()) {
            this.f4404O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
        }
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = this.f4404O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        this.f4405O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = this;
        while (true) {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f4405O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
                break;
            }
            O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1963O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            if (!(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo instanceof O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
                break;
            } else {
                this.f4405O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = (O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            }
        }
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1963O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
                throw new IllegalStateException("!ScopedHandler");
            }
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
        }
        super.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0();
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = this.f4404O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 == null || !o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.isStarted()) {
            return;
        }
        ArrayList arrayList = this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) != null) {
                throw new ClassCastException();
            }
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3 = this.f4404O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[] o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3.f4410O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr != null && o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr.length > 0) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr[0];
                throw null;
            }
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
            if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr != null && o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr.length > 0) {
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2 = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr[0];
                throw null;
            }
        }
        this.f4404O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
    }

    public final void O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        if (this.f4404O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O == null && !isStarted()) {
            this.f4404O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
        }
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = this.f4404O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr != null) {
            o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[]) o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr.clone();
        }
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr2 = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr;
        try {
            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000((O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[]) org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.addToArray(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr2, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.class));
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
            o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f4433O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f4432O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new String[]{"/*"};
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0[] o00000O00oOOo000000OOOo00OOOo0OooOO00OO0Arr = (O00000O00oOOo000000OOOo00OOOo0OooOO00OO0[]) org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.addToArray(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o00000O00oOOo000000OOOo00OOOo0OooOO00OO0, O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.class);
            O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1946O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 != null) {
                o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1925O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o00000O00oOOo000000OOOo00OOOo0OooOO00OO0Arr, "servletMapping", true);
            }
            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0Arr;
            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0();
        } catch (Exception e) {
            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr2);
            if (!(e instanceof RuntimeException)) {
                throw new RuntimeException(e);
            }
            throw ((RuntimeException) e);
        }
    }

    @Override // O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, org.eclipse.jetty.util.component.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void doStop() {
        super.doStop();
        ArrayList arrayList = this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;
        if (arrayList != null) {
            arrayList.clear();
        }
        O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f4405O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(null);
        }
    }
}
