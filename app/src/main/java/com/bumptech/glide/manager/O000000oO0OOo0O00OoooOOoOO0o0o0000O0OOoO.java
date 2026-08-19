package com.bumptech.glide.manager;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Set f2905O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public volatile boolean f2906O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    @Override // com.bumptech.glide.manager.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(FragmentActivity fragmentActivity) {
        if (!this.f2906O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO && this.f2905O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(fragmentActivity)) {
            View decorView = fragmentActivity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, decorView));
        }
    }
}
