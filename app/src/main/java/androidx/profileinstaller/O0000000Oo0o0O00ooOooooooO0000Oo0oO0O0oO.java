package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ ProfileInstaller.DiagnosticsCallback f2777O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f2778O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f2779O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i, Object obj, int i2) {
        this.f2776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f2777O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = diagnosticsCallback;
        this.f2778O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        this.f2779O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2777O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.onResultReceived(this.f2778O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2779O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                this.f2777O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.onDiagnosticReceived(this.f2778O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2779O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
        }
    }
}
