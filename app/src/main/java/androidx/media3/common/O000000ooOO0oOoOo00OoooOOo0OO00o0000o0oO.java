package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2236O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ SimpleBasePlayer.State f2237O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f2238O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(SimpleBasePlayer.State state, boolean z, int i) {
        this.f2236O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2237O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = state;
        this.f2238O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = z;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public final Object get() {
        switch (this.f2236O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return SimpleBasePlayer.lambda$setPlayWhenReady$1(this.f2237O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2238O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            case 1:
                return SimpleBasePlayer.lambda$setShuffleModeEnabled$9(this.f2237O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2238O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            case 2:
                return SimpleBasePlayer.lambda$setDeviceMuted$28(this.f2237O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2238O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            default:
                return SimpleBasePlayer.lambda$setDeviceMuted$29(this.f2237O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2238O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
    }
}
