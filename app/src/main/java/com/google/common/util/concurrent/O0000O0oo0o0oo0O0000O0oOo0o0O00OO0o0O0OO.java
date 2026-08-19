package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO extends O00000OOoOOO00O00o0ooooooooO000ooooO0000 implements RunnableFuture, O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public volatile O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 f3771O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    public O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(Callable callable) {
        this.f3771O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0(this, callable);
    }

    @Override // com.google.common.util.concurrent.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0;
        Object obj = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if ((obj instanceof O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) && ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj).f3715O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO && (o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 = this.f3771O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) != null) {
            o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0.interruptTask();
        }
        this.f3771O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
    }

    @Override // com.google.common.util.concurrent.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final String O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 = this.f3771O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        if (o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 == null) {
            return super.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        }
        return "task=[" + o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 + "]";
    }

    @Override // com.google.common.util.concurrent.O00000OOoOOO00O00o0ooooooooO000ooooO0000, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 = this.f3771O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        if (o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 != null) {
            o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0.run();
        }
        this.f3771O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
    }
}
