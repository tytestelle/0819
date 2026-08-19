package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2136O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2137O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Toolbar toolbar, int i) {
        this.f2136O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2137O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2136O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2137O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.collapseActionView();
                break;
            default:
                this.f2137O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.invalidateMenu();
                break;
        }
    }
}
