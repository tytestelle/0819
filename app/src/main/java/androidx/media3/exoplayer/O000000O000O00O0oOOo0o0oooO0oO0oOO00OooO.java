package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2316O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2317O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i) {
        this.f2316O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2317O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2316O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AudioBecomingNoisyManager.AudioBecomingNoisyReceiver) this.f2317O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).callListenerIfEnabled();
                break;
            case 1:
                ((DefaultSuitableOutputChecker.ImplApi23) this.f2317O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$disable$2();
                break;
            case 2:
                ((DefaultSuitableOutputChecker.ImplApi35) this.f2317O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$disable$2();
                break;
            case 3:
                ((ExoPlayerImpl) this.f2317O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$new$3();
                break;
            case 4:
                ((StreamVolumeManager.VolumeChangeReceiver) this.f2317O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onReceive$0();
                break;
            default:
                ((MetadataRetriever) this.f2317O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$close$2();
                break;
        }
    }
}
