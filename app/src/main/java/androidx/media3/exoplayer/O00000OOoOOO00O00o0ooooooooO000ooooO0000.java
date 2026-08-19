package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OOoOOO00O00o0ooooooooO000ooooO0000 implements com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2333O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ MediaSource.Factory f2334O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000OOoOOO00O00o0ooooooooO000ooooO0000(MediaSource.Factory factory, int i) {
        this.f2333O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2334O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = factory;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public final Object get() {
        switch (this.f2333O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ExoPlayer.Builder.lambda$new$7(this.f2334O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 1:
                return ExoPlayer.Builder.lambda$new$9(this.f2334O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 2:
                return ExoPlayer.Builder.lambda$new$5(this.f2334O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            default:
                return ExoPlayer.Builder.lambda$setMediaSourceFactory$17(this.f2334O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }
}
