package androidx.media3.exoplayer;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.ListenerSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 implements ListenerSet.Event, MediaPeriodHolder.Factory, BackgroundThreadStateHandler.StateChangeListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2342O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(Object obj, int i) {
        this.f2342O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // androidx.media3.exoplayer.MediaPeriodHolder.Factory
    public MediaPeriodHolder create(MediaPeriodInfo mediaPeriodInfo, long j) {
        return ((ExoPlayerImplInternal) this.f2343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).createMediaPeriodHolder(mediaPeriodInfo, j);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f2342O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((Player.Listener) obj).onMediaMetadataChanged((MediaMetadata) this.f2343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 1:
                ((Player.Listener) obj).onAudioAttributesChanged((AudioAttributes) this.f2343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 2:
                ((Player.Listener) obj).onTrackSelectionParametersChanged((TrackSelectionParameters) this.f2343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 3:
                ((Player.Listener) obj).onCues((CueGroup) this.f2343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 4:
                ((ExoPlayerImpl.ComponentListener) this.f2343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onMetadata$6((Player.Listener) obj);
                break;
            case 5:
                ((Player.Listener) obj).onMetadata((Metadata) this.f2343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 6:
                ((Player.Listener) obj).onCues((List<Cue>) this.f2343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 7:
                ((Player.Listener) obj).onVideoSizeChanged((VideoSize) this.f2343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                ((Player.Listener) obj).onDeviceInfoChanged((DeviceInfo) this.f2343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
        }
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public void onStateChanged(Object obj, Object obj2) {
        ((StreamVolumeManager) this.f2343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).onStreamVolumeStateChanged((StreamVolumeManager.StreamVolumeState) obj, (StreamVolumeManager.StreamVolumeState) obj2);
    }
}
