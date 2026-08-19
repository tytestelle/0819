package com.quickjs;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3786O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f3787O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ long f3788O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, long j, int i) {
        this.f3786O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3787O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        this.f3788O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3786O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f3787O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f3833O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO._releaseRuntime(this.f3788O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f3787O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f3833O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO._releaseContext(this.f3788O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
