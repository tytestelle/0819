package androidx.media3.exoplayer.scheduler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2613O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ RequirementsWatcher.NetworkCallback f2614O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(RequirementsWatcher.NetworkCallback networkCallback, int i) {
        this.f2613O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2614O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = networkCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2613O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2614O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$postCheckRequirements$0();
                break;
            default:
                this.f2614O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$postRecheckNotMetNetworkRequirements$1();
                break;
        }
    }
}
