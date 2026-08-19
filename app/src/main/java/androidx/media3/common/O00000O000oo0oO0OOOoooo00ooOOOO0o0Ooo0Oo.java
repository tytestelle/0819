package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo implements com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ SimpleBasePlayer.State f2246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f2247O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(SimpleBasePlayer.State state, int i, int i2) {
        this.f2245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f2246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = state;
        this.f2247O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public final Object get() {
        switch (this.f2245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return SimpleBasePlayer.lambda$setDeviceVolume$22(this.f2246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2247O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            case 1:
                return SimpleBasePlayer.lambda$setDeviceVolume$23(this.f2246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2247O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            default:
                return SimpleBasePlayer.lambda$setRepeatMode$8(this.f2246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2247O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
    }
}
