package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2331O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ RenderersFactory f2332O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(RenderersFactory renderersFactory, int i) {
        this.f2331O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2332O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = renderersFactory;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public final Object get() {
        switch (this.f2331O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ExoPlayer.Builder.lambda$setRenderersFactory$16(this.f2332O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 1:
                return ExoPlayer.Builder.lambda$new$6(this.f2332O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 2:
                return ExoPlayer.Builder.lambda$new$2(this.f2332O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            default:
                return ExoPlayer.Builder.lambda$new$8(this.f2332O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }
}
