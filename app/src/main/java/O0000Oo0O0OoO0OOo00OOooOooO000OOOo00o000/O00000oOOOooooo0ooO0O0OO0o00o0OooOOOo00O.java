package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ Runnable f1525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ long f1526O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f1527O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, Runnable runnable, long j) {
        this.f1527O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        this.f1525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = runnable;
        this.f1526O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1525O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.run();
        ((Handler) this.f1527O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).postDelayed(this, this.f1526O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }
}
