package androidx.media3.common;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.media3.common.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2251O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ SimpleBasePlayer.State f2252O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2253O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(SimpleBasePlayer.State state, Object obj, int i) {
        this.f2251O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2252O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = state;
        this.f2253O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public final Object get() {
        switch (this.f2251O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return SimpleBasePlayer.lambda$setVideoTextureView$20(this.f2252O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Size) this.f2253O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            case 1:
                return SimpleBasePlayer.lambda$setPlaylistMetadata$15(this.f2252O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (MediaMetadata) this.f2253O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            case 2:
                return SimpleBasePlayer.lambda$setVideoSurfaceHolder$18(this.f2252O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (SurfaceHolder) this.f2253O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            case 3:
                return SimpleBasePlayer.lambda$setVideoSurfaceView$19(this.f2252O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (SurfaceView) this.f2253O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            case 4:
                return SimpleBasePlayer.lambda$setAudioAttributes$30(this.f2252O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (AudioAttributes) this.f2253O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            case 5:
                return ((SimpleBasePlayer) this.f2253O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$stop$12(this.f2252O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 6:
                return SimpleBasePlayer.lambda$setPlaybackParameters$11(this.f2252O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (PlaybackParameters) this.f2253O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            default:
                return SimpleBasePlayer.lambda$setTrackSelectionParameters$14(this.f2252O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (TrackSelectionParameters) this.f2253O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
    }

    public /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(SimpleBasePlayer simpleBasePlayer, SimpleBasePlayer.State state) {
        this.f2251O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 5;
        this.f2253O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = simpleBasePlayer;
        this.f2252O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = state;
    }
}
