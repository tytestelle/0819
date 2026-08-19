package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O implements com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2351O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ int f2352O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(int i, int i2) {
        this.f2351O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f2352O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final Object apply(Object obj) {
        switch (this.f2351O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ExoPlayerImpl.lambda$setAudioSessionId$10(this.f2352O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Integer) obj);
            case 1:
                return ExoPlayerImpl.ComponentListener.lambda$onAudioSessionIdChanged$2(this.f2352O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Integer) obj);
            case 2:
                return ExoPlayerImpl.ComponentListener.lambda$onAudioSessionIdChanged$3(this.f2352O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Integer) obj);
            case 3:
                return StreamVolumeManager.lambda$setVolume$3(this.f2352O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (StreamVolumeManager.StreamVolumeState) obj);
            default:
                return StreamVolumeManager.lambda$setStreamType$1(this.f2352O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (StreamVolumeManager.StreamVolumeState) obj);
        }
    }
}
