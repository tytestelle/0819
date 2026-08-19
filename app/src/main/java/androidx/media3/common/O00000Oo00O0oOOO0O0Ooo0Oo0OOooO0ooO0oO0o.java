package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o implements com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2264O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ SimpleBasePlayer.State f2265O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(SimpleBasePlayer.State state, int i) {
        this.f2264O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2265O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = state;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public final Object get() {
        switch (this.f2264O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return SimpleBasePlayer.lambda$setVideoSurface$17(this.f2265O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 1:
                return SimpleBasePlayer.lambda$increaseDeviceVolume$25(this.f2265O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 2:
                return SimpleBasePlayer.lambda$decreaseDeviceVolume$26(this.f2265O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 3:
                return SimpleBasePlayer.lambda$release$13(this.f2265O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 4:
                return SimpleBasePlayer.lambda$clearVideoOutput$21(this.f2265O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 5:
                return SimpleBasePlayer.lambda$increaseDeviceVolume$24(this.f2265O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 6:
                return SimpleBasePlayer.lambda$prepare$7(this.f2265O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            default:
                return SimpleBasePlayer.lambda$decreaseDeviceVolume$27(this.f2265O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }
}
