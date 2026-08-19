package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2678O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ PreCacheHelper.ReleasableExecutorSupplier f2679O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(PreCacheHelper.ReleasableExecutorSupplier releasableExecutorSupplier, int i) {
        this.f2678O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2679O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = releasableExecutorSupplier;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2678O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2679O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onExecutorReleased$0();
                break;
            default:
                this.f2679O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.onExecutorReleased();
                break;
        }
    }
}
