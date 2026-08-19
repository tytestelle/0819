package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO implements com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2404O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2405O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f2406O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO(Object obj, int i, int i2) {
        this.f2404O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f2405O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2406O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
    }

    @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final Object apply(Object obj) {
        switch (this.f2404O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ((StreamVolumeManager) this.f2405O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$increaseVolume$6(this.f2406O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (StreamVolumeManager.StreamVolumeState) obj);
            case 1:
                return ((StreamVolumeManager) this.f2405O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$decreaseVolume$8(this.f2406O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (StreamVolumeManager.StreamVolumeState) obj);
            case 2:
                return ((StreamVolumeManager) this.f2405O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$setStreamType$2(this.f2406O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (StreamVolumeManager.StreamVolumeState) obj);
            default:
                return ((ExoPlayerImpl) this.f2405O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$setAudioSessionId$11(this.f2406O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Integer) obj);
        }
    }
}
