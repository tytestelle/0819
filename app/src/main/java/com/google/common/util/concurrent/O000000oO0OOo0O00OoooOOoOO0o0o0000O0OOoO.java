package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 f3728O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 f3729O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) {
        this.f3728O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
        this.f3729O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3728O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != this) {
            return;
        }
        if (O00000OOoOOO00O00o0ooooooooO000ooooO0000.f3741O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f3728O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f3729O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO))) {
            O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f3728O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, false);
        }
    }
}
