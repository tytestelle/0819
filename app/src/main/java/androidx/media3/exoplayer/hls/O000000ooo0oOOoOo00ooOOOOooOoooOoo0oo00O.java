package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2581O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2582O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Object obj, int i) {
        this.f2581O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2582O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2581O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((HlsSampleStreamWrapper) this.f2582O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).maybeFinishPrepare();
                break;
            case 1:
                ((HlsSampleStreamWrapper) this.f2582O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).onTracksEnded();
                break;
            default:
                ((HlsSampleStreamWrapper.Callback) this.f2582O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).onPrepared();
                break;
        }
    }
}
