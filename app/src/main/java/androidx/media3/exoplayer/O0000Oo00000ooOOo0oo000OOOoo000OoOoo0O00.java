package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2417O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f2418O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2419O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00(int i, Object obj, boolean z) {
        this.f2417O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2419O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
        this.f2418O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2417O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((WakeLockManager) this.f2419O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$setStayAwake$1(this.f2418O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                ((WifiLockManager) this.f2419O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$setStayAwake$1(this.f2418O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
        }
    }
}
