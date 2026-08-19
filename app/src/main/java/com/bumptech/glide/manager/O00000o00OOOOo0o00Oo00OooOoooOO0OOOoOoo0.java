package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 implements O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Set f2934O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void onDestroy() {
        Iterator it = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f2934O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).iterator();
        while (it.hasNext()) {
            ((O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void onStart() {
        Iterator it = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f2934O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).iterator();
        while (it.hasNext()) {
            ((O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void onStop() {
        Iterator it = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f2934O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).iterator();
        while (it.hasNext()) {
            ((O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) it.next()).onStop();
        }
    }
}
