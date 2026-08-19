package com.bumptech.glide.manager;

import androidx.lifecycle.Lifecycle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f2907O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f2908O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, Lifecycle lifecycle) {
        this.f2908O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        this.f2907O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = lifecycle;
    }

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void onDestroy() {
        ((HashMap) this.f2908O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).remove(this.f2907O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void onStop() {
    }
}
