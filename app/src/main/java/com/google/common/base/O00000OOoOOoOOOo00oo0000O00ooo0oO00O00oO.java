package com.google.common.base;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Iterator f3354O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
        Iterator it = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f322O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.iterator();
        it.getClass();
        this.f3354O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = it;
    }

    @Override // com.google.common.base.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
        do {
            Iterator it = this.f3354O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (!it.hasNext()) {
                this.f3349O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                return null;
            }
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) it.next();
        } while (!o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.isPresent());
        return o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.get();
    }
}
