package androidx.media3.common;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.UnstableApi;
import com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class ForwardingSimpleBasePlayer extends SimpleBasePlayer {
    private Metadata lastTimedMetadata;
    private LivePositionSuppliers livePositionSuppliers;
    private int pendingDiscontinuityReason;
    private boolean pendingFirstFrameRendered;
    private long pendingPositionDiscontinuityNewPositionMs;
    private int playWhenReadyChangeReason;
    private Player player;
    private final Player.Listener playerListener;

    public static final class LivePositionSuppliers {
        public final SimpleBasePlayer.LivePositionSupplier bufferedPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier contentBufferedPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier contentPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier currentPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier totalBufferedPositionSupplier;

        public LivePositionSuppliers(final Player player) {
            Objects.requireNonNull(player);
            final int i = 0;
            this.currentPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    switch (i) {
                        case 0:
                            return player.getCurrentPosition();
                        case 1:
                            return player.getBufferedPosition();
                        case 2:
                            return player.getContentPosition();
                        case 3:
                            return player.getContentBufferedPosition();
                        default:
                            return player.getTotalBufferedDuration();
                    }
                }
            });
            final int i2 = 1;
            this.bufferedPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    switch (i2) {
                        case 0:
                            return player.getCurrentPosition();
                        case 1:
                            return player.getBufferedPosition();
                        case 2:
                            return player.getContentPosition();
                        case 3:
                            return player.getContentBufferedPosition();
                        default:
                            return player.getTotalBufferedDuration();
                    }
                }
            });
            final int i3 = 2;
            this.contentPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    switch (i3) {
                        case 0:
                            return player.getCurrentPosition();
                        case 1:
                            return player.getBufferedPosition();
                        case 2:
                            return player.getContentPosition();
                        case 3:
                            return player.getContentBufferedPosition();
                        default:
                            return player.getTotalBufferedDuration();
                    }
                }
            });
            final int i4 = 3;
            this.contentBufferedPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    switch (i4) {
                        case 0:
                            return player.getCurrentPosition();
                        case 1:
                            return player.getBufferedPosition();
                        case 2:
                            return player.getContentPosition();
                        case 3:
                            return player.getContentBufferedPosition();
                        default:
                            return player.getTotalBufferedDuration();
                    }
                }
            });
            final int i5 = 4;
            this.totalBufferedPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    switch (i5) {
                        case 0:
                            return player.getCurrentPosition();
                        case 1:
                            return player.getBufferedPosition();
                        case 2:
                            return player.getContentPosition();
                        case 3:
                            return player.getContentBufferedPosition();
                        default:
                            return player.getTotalBufferedDuration();
                    }
                }
            });
        }

        public void disconnect(long j, long j2) {
            this.currentPositionSupplier.disconnect(j);
            this.bufferedPositionSupplier.disconnect(j);
            this.contentPositionSupplier.disconnect(j2);
            this.contentBufferedPositionSupplier.disconnect(j2);
            this.totalBufferedPositionSupplier.disconnect(0L);
        }
    }

    public class PlayerListener implements Player.Listener {
        private PlayerListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, audioAttributes);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onAudioSessionIdChanged(int i) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, commands);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onCues(CueGroup cueGroup) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, cueGroup);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, deviceInfo);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, i, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            ForwardingSimpleBasePlayer.this.invalidateState();
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onIsLoadingChanged(boolean z) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onIsPlayingChanged(boolean z) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onLoadingChanged(boolean z) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, j);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this, mediaItem, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this, mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMetadata(Metadata metadata) {
            ForwardingSimpleBasePlayer.this.lastTimedMetadata = metadata;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i) {
            ForwardingSimpleBasePlayer.this.playWhenReadyChangeReason = i;
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this, playbackParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlaybackStateChanged(int i) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(this, playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this, z, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(this, mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPositionDiscontinuity(int i) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRenderedFirstFrame() {
            ForwardingSimpleBasePlayer.this.pendingFirstFrameRendered = true;
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onRepeatModeChanged(int i) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onSeekBackIncrementChanged(long j) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(this, j);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(this, j);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(this, i, i2);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(this, timeline, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(this, trackSelectionParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onTracksChanged(Tracks tracks) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(this, tracks);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(this, videoSize);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onVolumeChanged(float f) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(this, f);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onCues(List list) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, list);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            ForwardingSimpleBasePlayer.this.pendingDiscontinuityReason = i;
            ForwardingSimpleBasePlayer.this.pendingPositionDiscontinuityNewPositionMs = positionInfo2.positionMs;
            ForwardingSimpleBasePlayer.this.livePositionSuppliers.disconnect(positionInfo.positionMs, positionInfo.contentPositionMs);
            ForwardingSimpleBasePlayer forwardingSimpleBasePlayer = ForwardingSimpleBasePlayer.this;
            forwardingSimpleBasePlayer.livePositionSuppliers = new LivePositionSuppliers(forwardingSimpleBasePlayer.player);
        }
    }

    public ForwardingSimpleBasePlayer(Player player) {
        super(player.getApplicationLooper());
        initializeForwardingState(player);
        PlayerListener playerListener = new PlayerListener();
        this.playerListener = playerListener;
        player.addListener(playerListener);
    }

    @EnsuresNonNull({"player", "lastTimedMetadata", "playWhenReadyChangeReason", "pendingDiscontinuityReason", "livePositionSuppliers"})
    private void initializeForwardingState(Player player) {
        this.player = player;
        this.lastTimedMetadata = new Metadata(C.TIME_UNSET, new Metadata.Entry[0]);
        this.playWhenReadyChangeReason = 1;
        this.pendingDiscontinuityReason = 5;
        this.livePositionSuppliers = new LivePositionSuppliers(player);
    }

    public final Player getPlayer() {
        return this.player;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public SimpleBasePlayer.State getState() {
        SimpleBasePlayer.State.Builder builder = new SimpleBasePlayer.State.Builder();
        LivePositionSuppliers livePositionSuppliers = this.livePositionSuppliers;
        if (this.player.isCommandAvailable(16)) {
            builder.setAdBufferedPositionMs(livePositionSuppliers.bufferedPositionSupplier);
            builder.setAdPositionMs(livePositionSuppliers.currentPositionSupplier);
        }
        if (this.player.isCommandAvailable(21)) {
            builder.setAudioAttributes(this.player.getAudioAttributes());
        }
        builder.setAvailableCommands(this.player.getAvailableCommands());
        if (this.player.isCommandAvailable(16)) {
            builder.setContentBufferedPositionMs(livePositionSuppliers.contentBufferedPositionSupplier);
            builder.setContentPositionMs(livePositionSuppliers.contentPositionSupplier);
            if (this.player.isCommandAvailable(17)) {
                builder.setCurrentAd(this.player.getCurrentAdGroupIndex(), this.player.getCurrentAdIndexInAdGroup());
            }
        }
        if (this.player.isCommandAvailable(28)) {
            builder.setCurrentCues(this.player.getCurrentCues());
        }
        if (this.player.isCommandAvailable(17)) {
            builder.setCurrentMediaItemIndex(this.player.getCurrentMediaItemIndex());
        }
        builder.setDeviceInfo(this.player.getDeviceInfo());
        if (this.player.isCommandAvailable(23)) {
            builder.setDeviceVolume(this.player.getDeviceVolume());
            builder.setIsDeviceMuted(this.player.isDeviceMuted());
        }
        builder.setIsLoading(this.player.isLoading());
        builder.setMaxSeekToPreviousPositionMs(this.player.getMaxSeekToPreviousPosition());
        if (this.pendingFirstFrameRendered) {
            builder.setNewlyRenderedFirstFrame(true);
            this.pendingFirstFrameRendered = false;
        }
        builder.setPlaybackParameters(this.player.getPlaybackParameters());
        builder.setPlaybackState(this.player.getPlaybackState());
        builder.setPlaybackSuppressionReason(this.player.getPlaybackSuppressionReason());
        builder.setPlayerError(this.player.getPlayerError());
        if (this.player.isCommandAvailable(17)) {
            builder.setPlaylist(this.player.getCurrentTimeline(), this.player.isCommandAvailable(30) ? this.player.getCurrentTracks() : Tracks.EMPTY, this.player.isCommandAvailable(18) ? this.player.getMediaMetadata() : null);
        }
        if (this.player.isCommandAvailable(18)) {
            builder.setPlaylistMetadata(this.player.getPlaylistMetadata());
        }
        builder.setPlayWhenReady(this.player.getPlayWhenReady(), this.playWhenReadyChangeReason);
        long j = this.pendingPositionDiscontinuityNewPositionMs;
        if (j != C.TIME_UNSET) {
            builder.setPositionDiscontinuity(this.pendingDiscontinuityReason, j);
            this.pendingPositionDiscontinuityNewPositionMs = C.TIME_UNSET;
        }
        builder.setRepeatMode(this.player.getRepeatMode());
        builder.setSeekBackIncrementMs(this.player.getSeekBackIncrement());
        builder.setSeekForwardIncrementMs(this.player.getSeekForwardIncrement());
        builder.setShuffleModeEnabled(this.player.getShuffleModeEnabled());
        builder.setSurfaceSize(this.player.getSurfaceSize());
        builder.setTimedMetadata(this.lastTimedMetadata);
        if (this.player.isCommandAvailable(16)) {
            builder.setTotalBufferedDurationMs(livePositionSuppliers.totalBufferedPositionSupplier);
        }
        builder.setTrackSelectionParameters(this.player.getTrackSelectionParameters());
        builder.setVideoSize(this.player.getVideoSize());
        if (this.player.isCommandAvailable(22)) {
            builder.setVolume(this.player.getVolume());
        }
        return builder.build();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleAddMediaItems(int i, List<MediaItem> list) {
        if (list.size() == 1) {
            this.player.addMediaItem(i, list.get(0));
        } else {
            this.player.addMediaItems(i, list);
        }
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleClearVideoOutput(@Nullable Object obj) {
        if (obj instanceof SurfaceView) {
            this.player.clearVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.player.clearVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.player.clearVideoSurfaceHolder((SurfaceHolder) obj);
        } else if (obj instanceof Surface) {
            this.player.clearVideoSurface((Surface) obj);
        } else {
            if (obj != null) {
                throw new IllegalStateException();
            }
            this.player.clearVideoSurface();
        }
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleDecreaseDeviceVolume(int i) {
        if (this.player.isCommandAvailable(34)) {
            this.player.decreaseDeviceVolume(i);
        } else {
            this.player.decreaseDeviceVolume();
        }
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleIncreaseDeviceVolume(int i) {
        if (this.player.isCommandAvailable(34)) {
            this.player.increaseDeviceVolume(i);
        } else {
            this.player.increaseDeviceVolume();
        }
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleMoveMediaItems(int i, int i2, int i3) {
        if (i2 == i + 1) {
            this.player.moveMediaItem(i, i3);
        } else {
            this.player.moveMediaItems(i, i2, i3);
        }
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handlePrepare() {
        this.player.prepare();
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleRelease() {
        this.player.release();
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleRemoveMediaItems(int i, int i2) {
        if (i2 == i + 1) {
            this.player.removeMediaItem(i);
        } else {
            this.player.removeMediaItems(i, i2);
        }
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleReplaceMediaItems(int i, int i2, List<MediaItem> list) {
        if (i2 == i + 1 && list.size() == 1) {
            this.player.replaceMediaItem(i, list.get(0));
        } else {
            this.player.replaceMediaItems(i, i2, list);
        }
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSeek(int i, long j, int i2) {
        switch (i2) {
            case 4:
                this.player.seekToDefaultPosition();
                break;
            case 5:
                this.player.seekTo(j);
                break;
            case 6:
                this.player.seekToPreviousMediaItem();
                break;
            case 7:
                this.player.seekToPrevious();
                break;
            case 8:
                this.player.seekToNextMediaItem();
                break;
            case 9:
                this.player.seekToNext();
                break;
            case 10:
                if (i != -1) {
                    this.player.seekTo(i, j);
                }
                break;
            case 11:
                this.player.seekBack();
                break;
            case 12:
                this.player.seekForward();
                break;
            default:
                throw new IllegalStateException();
        }
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetAudioAttributes(AudioAttributes audioAttributes, boolean z) {
        this.player.setAudioAttributes(audioAttributes, z);
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetDeviceMuted(boolean z, int i) {
        if (this.player.isCommandAvailable(34)) {
            this.player.setDeviceMuted(z, i);
        } else {
            this.player.setDeviceMuted(z);
        }
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetDeviceVolume(int i, int i2) {
        if (this.player.isCommandAvailable(33)) {
            this.player.setDeviceVolume(i, i2);
        } else {
            this.player.setDeviceVolume(i);
        }
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetMediaItems(List<MediaItem> list, int i, long j) {
        boolean z = list.size() == 1 && this.player.isCommandAvailable(31);
        if (i == -1) {
            if (z) {
                this.player.setMediaItem(list.get(0));
            } else {
                this.player.setMediaItems(list);
            }
        } else if (z) {
            this.player.setMediaItem(list.get(0), j);
        } else {
            this.player.setMediaItems(list, i, j);
        }
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetPlayWhenReady(boolean z) {
        this.player.setPlayWhenReady(z);
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetPlaybackParameters(PlaybackParameters playbackParameters) {
        this.player.setPlaybackParameters(playbackParameters);
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetPlaylistMetadata(MediaMetadata mediaMetadata) {
        this.player.setPlaylistMetadata(mediaMetadata);
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetRepeatMode(int i) {
        this.player.setRepeatMode(i);
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetShuffleModeEnabled(boolean z) {
        this.player.setShuffleModeEnabled(z);
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        this.player.setTrackSelectionParameters(trackSelectionParameters);
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetVideoOutput(Object obj) {
        if (obj instanceof SurfaceView) {
            this.player.setVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.player.setVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.player.setVideoSurfaceHolder((SurfaceHolder) obj);
        } else {
            if (!(obj instanceof Surface)) {
                throw new IllegalStateException();
            }
            this.player.setVideoSurface((Surface) obj);
        }
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetVolume(float f) {
        this.player.setVolume(f);
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleStop() {
        this.player.stop();
        return com.google.common.util.concurrent.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f3759O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final void setPlayer(Player player) {
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player.getApplicationLooper() != player2.getApplicationLooper()) {
            throw new IllegalArgumentException("Trying to swap players with non-matching loopers.");
        }
        player2.removeListener(this.playerListener);
        player.addListener(this.playerListener);
        initializeForwardingState(player);
        this.pendingPositionDiscontinuityNewPositionMs = player.getCurrentPosition();
        invalidateState();
    }
}
