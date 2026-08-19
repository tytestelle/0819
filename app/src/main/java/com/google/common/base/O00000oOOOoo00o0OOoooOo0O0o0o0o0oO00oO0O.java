package com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f3361O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f3360O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f3352O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final int f3362O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Integer.MAX_VALUE;

    public O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        this.f3361O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    public final List O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(CharSequence charSequence) {
        charSequence.getClass();
        O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f3361O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getClass();
        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.hasNext()) {
            arrayList.add((String) o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
