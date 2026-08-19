package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, LifecycleObserver {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final HashSet f2899O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new HashSet();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Lifecycle f2900O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public LifecycleLifecycle(Lifecycle lifecycle) {
        this.f2900O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // com.bumptech.glide.manager.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
        this.f2899O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
        Lifecycle lifecycle = this.f2900O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.onDestroy();
        } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.onStart();
        } else {
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.onStop();
        }
    }

    @Override // com.bumptech.glide.manager.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
        this.f2899O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f2899O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).iterator();
        while (it.hasNext()) {
            ((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f2899O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).iterator();
        while (it.hasNext()) {
            ((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f2899O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).iterator();
        while (it.hasNext()) {
            ((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) it.next()).onStop();
        }
    }
}
