package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2127O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2128O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj, int i) {
        this.f2127O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2128O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2127O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((ComponentActivity.ReportFullyDrawnExecutorApi16Impl) this.f2128O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$execute$0();
                break;
            case 1:
                ((ComponentActivity) this.f2128O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).invalidateMenu();
                break;
            case 2:
                ComponentDialog.onBackPressedDispatcher$lambda$1((ComponentDialog) this.f2128O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                FullyDrawnReporter.reportRunnable$lambda$2((FullyDrawnReporter) this.f2128O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
        }
    }
}
