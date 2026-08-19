package androidx.media3.exoplayer;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o implements ListenerSet.Event, ListenerSet.IterationFinishedEvent, ExoPlayerImplInternal.PlaybackInfoUpdateListener, BackgroundThreadStateHandler.StateChangeListener, SuitableOutputChecker.Callback {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2355O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ ExoPlayerImpl f2356O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(ExoPlayerImpl exoPlayerImpl, int i) {
        this.f2355O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2356O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = exoPlayerImpl;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f2355O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2356O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$setPlaylistMetadata$8((Player.Listener) obj);
                break;
            default:
                this.f2356O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$updateAvailableCommands$28((Player.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener
    public void onPlaybackInfoUpdate(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.f2356O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$new$2(playbackInfoUpdate);
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker.Callback
    public void onSelectedOutputSuitabilityChanged(boolean z) {
        this.f2356O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.onSelectedOutputSuitabilityChanged(z);
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public void onStateChanged(Object obj, Object obj2) {
        this.f2356O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.onAudioSessionIdChanged(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        this.f2356O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$new$0((Player.Listener) obj, flagSet);
    }
}
