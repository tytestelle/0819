package androidx.media3.exoplayer;

import androidx.media3.exoplayer.trackselection.TrackSelector;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o implements com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2337O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ TrackSelector f2338O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(TrackSelector trackSelector, int i) {
        this.f2337O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2338O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = trackSelector;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public final Object get() {
        switch (this.f2337O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ExoPlayer.Builder.lambda$new$10(this.f2338O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            default:
                return ExoPlayer.Builder.lambda$setTrackSelector$18(this.f2338O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }
}
