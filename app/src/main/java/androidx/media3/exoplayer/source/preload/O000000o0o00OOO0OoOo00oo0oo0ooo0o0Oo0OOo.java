package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2655O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2656O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj, int i) {
        this.f2655O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2656O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2655O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((DefaultPreloadManager) this.f2656O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$releaseInternal$1();
                break;
            default:
                ((PreCacheHelper) this.f2656O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$stop$1();
                break;
        }
    }
}
