package com.bumptech.glide.manager;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.common.util.concurrent.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ View f2903O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f2904O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, View view) {
        this.f2904O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        this.f2903O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO().post(new O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(this, 3, this, false));
    }
}
