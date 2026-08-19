package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo implements O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f2914O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
        this.f2914O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
    }

    @Override // com.bumptech.glide.manager.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(boolean z) {
        ArrayList arrayList;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        synchronized (this.f2914O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            arrayList = new ArrayList((HashSet) this.f2914O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2933O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) it.next()).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(z);
        }
    }
}
