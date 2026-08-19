package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2675O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ PreCacheHelper.DownloadCallback f2676O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ PreCacheHelper.Task f2677O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(PreCacheHelper.DownloadCallback downloadCallback, PreCacheHelper.Task task, int i) {
        this.f2675O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2676O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = downloadCallback;
        this.f2677O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2675O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2676O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onDownloadProgress$5(this.f2677O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2676O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onDownloadStopped$3(this.f2677O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
