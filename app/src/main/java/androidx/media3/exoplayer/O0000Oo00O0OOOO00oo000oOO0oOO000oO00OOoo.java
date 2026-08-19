package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2420O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f2421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f2422O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f2423O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo(Object obj, boolean z, boolean z2, int i) {
        this.f2420O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2423O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj;
        this.f2421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z;
        this.f2422O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2420O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((WakeLockManager) this.f2423O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).lambda$setEnabled$0(this.f2421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2422O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((WifiLockManager) this.f2423O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).lambda$setEnabled$0(this.f2421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2422O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
