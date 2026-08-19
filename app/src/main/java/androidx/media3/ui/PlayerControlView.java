package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final float[] PLAYBACK_SPEEDS;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private static final String TAG = "PlayerControlView";
    private long[] adGroupTimesMs;

    @Nullable
    private final View audioTrackButton;
    private final AudioTrackSelectionAdapter audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;

    @Nullable
    private final Class<?> compositionPlayerClazz;

    @Nullable
    private final Method compositionPlayerIsScrubbingModeEnabledMethod;

    @Nullable
    private final Method compositionPlayerSetScrubbingModeEnabledMethod;
    private final PlayerControlViewLayoutManager controlViewLayoutManager;
    private long currentWindowOffset;

    @Nullable
    private final TextView durationView;

    @Nullable
    private final Class<?> exoplayerClazz;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;

    @Nullable
    private final View fastForwardButton;

    @Nullable
    private final TextView fastForwardButtonTextView;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;

    @Nullable
    private final ImageView fullscreenButton;
    private final String fullscreenEnterContentDescription;
    private final Drawable fullscreenEnterDrawable;
    private final String fullscreenExitContentDescription;
    private final Drawable fullscreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullscreen;

    @Nullable
    private final Method isScrubbingModeEnabledMethod;

    @Nullable
    private final ImageView minimalFullscreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;

    @Nullable
    private final ImageView nextButton;

    @Nullable
    private OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final Drawable pauseButtonDrawable;
    private final Timeline.Period period;
    private final Drawable playButtonDrawable;

    @Nullable
    private final ImageView playPauseButton;
    private final PlaybackSpeedAdapter playbackSpeedAdapter;

    @Nullable
    private final View playbackSpeedButton;
    private boolean[] playedAdGroups;

    @Nullable
    private Player player;

    @Nullable
    private final TextView positionView;

    @Nullable
    private final ImageView previousButton;

    @Nullable
    private ProgressUpdateListener progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;

    @Nullable
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final Resources resources;

    @Nullable
    private final View rewindButton;

    @Nullable
    private final TextView rewindButtonTextView;
    private boolean scrubbing;

    @Nullable
    private final Method setScrubbingModeEnabledMethod;
    private final SettingsAdapter settingsAdapter;

    @Nullable
    private final View settingsButton;
    private final RecyclerView settingsView;
    private final PopupWindow settingsWindow;
    private final int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private boolean showPlayButtonIfSuppressed;
    private int showTimeoutMs;

    @Nullable
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;

    @Nullable
    private final ImageView subtitleButton;
    private final Drawable subtitleOffButtonDrawable;
    private final String subtitleOffContentDescription;
    private final Drawable subtitleOnButtonDrawable;
    private final String subtitleOnContentDescription;
    private final TextTrackSelectionAdapter textTrackSelectionAdapter;

    @Nullable
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private boolean timeBarScrubbingEnabled;
    private final TrackNameProvider trackNameProvider;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;

    @Nullable
    private final ImageView vrButton;
    private final Timeline.Window window;

    public final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        private AudioTrackSelectionAdapter() {
            super();
        }

        private boolean hasSelectionOverride(TrackSelectionParameters trackSelectionParameters) {
            for (int i = 0; i < this.tracks.size(); i++) {
                if (trackSelectionParameters.overrides.containsKey(this.tracks.get(i).trackGroup.getMediaTrackGroup())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view) {
            if (PlayerControlView.this.player == null || !PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            ((Player) Util.castNonNull(PlayerControlView.this.player)).setTrackSelectionParameters(PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
            PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
            PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
            this.tracks = list;
            TrackSelectionParameters trackSelectionParameters = ((Player) Assertions.checkNotNull(PlayerControlView.this.player)).getTrackSelectionParameters();
            if (list.isEmpty()) {
                PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(R.string.exo_track_selection_none));
                return;
            }
            if (!hasSelectionOverride(trackSelectionParameters)) {
                PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                TrackInformation trackInformation = list.get(i);
                if (trackInformation.isSelected()) {
                    PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, trackInformation.trackName);
                    return;
                }
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.textView.setText(R.string.exo_track_selection_auto);
            subSettingViewHolder.checkView.setVisibility(hasSelectionOverride(((Player) Assertions.checkNotNull(PlayerControlView.this.player)).getTrackSelectionParameters()) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, 0));
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
            PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, str);
        }
    }

    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        private ComponentListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, audioAttributes);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onAudioSessionIdChanged(int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, commands);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            if (PlayerControlView.this.nextButton == view) {
                if (player.isCommandAvailable(9)) {
                    player.seekToNext();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.previousButton == view) {
                if (player.isCommandAvailable(7)) {
                    player.seekToPrevious();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.fastForwardButton == view) {
                if (player.getPlaybackState() == 4 || !player.isCommandAvailable(12)) {
                    return;
                }
                player.seekForward();
                return;
            }
            if (PlayerControlView.this.rewindButton == view) {
                if (player.isCommandAvailable(11)) {
                    player.seekBack();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.playPauseButton == view) {
                Util.handlePlayPauseButtonAction(player, PlayerControlView.this.showPlayButtonIfSuppressed);
                return;
            }
            if (PlayerControlView.this.repeatToggleButton == view) {
                if (player.isCommandAvailable(15)) {
                    player.setRepeatMode(RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), PlayerControlView.this.repeatToggleModes));
                    return;
                }
                return;
            }
            if (PlayerControlView.this.shuffleButton == view) {
                if (player.isCommandAvailable(14)) {
                    player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                    return;
                }
                return;
            }
            if (PlayerControlView.this.settingsButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.displaySettingsWindow(playerControlView.settingsAdapter, PlayerControlView.this.settingsButton);
                return;
            }
            if (PlayerControlView.this.playbackSpeedButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView2 = PlayerControlView.this;
                playerControlView2.displaySettingsWindow(playerControlView2.playbackSpeedAdapter, PlayerControlView.this.playbackSpeedButton);
            } else if (PlayerControlView.this.audioTrackButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView3 = PlayerControlView.this;
                playerControlView3.displaySettingsWindow(playerControlView3.audioTrackSelectionAdapter, PlayerControlView.this.audioTrackButton);
            } else if (PlayerControlView.this.subtitleButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView4 = PlayerControlView.this;
                playerControlView4.displaySettingsWindow(playerControlView4.textTrackSelectionAdapter, PlayerControlView.this.subtitleButton);
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onCues(CueGroup cueGroup) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, cueGroup);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, deviceInfo);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, i, z);
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (PlayerControlView.this.needToHideBars) {
                PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 13)) {
                PlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7, 13)) {
                PlayerControlView.this.updateProgress();
            }
            if (events.containsAny(8, 13)) {
                PlayerControlView.this.updateRepeatModeButton();
            }
            if (events.containsAny(9, 13)) {
                PlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 16, 17, 13)) {
                PlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0, 13)) {
                PlayerControlView.this.updateTimeline();
            }
            if (events.containsAny(12, 13)) {
                PlayerControlView.this.updatePlaybackSpeedList();
            }
            if (events.containsAny(2, 13)) {
                PlayerControlView.this.updateTrackLists();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onIsLoadingChanged(boolean z) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onIsPlayingChanged(boolean z) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onLoadingChanged(boolean z) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, j);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this, mediaItem, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this, mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onMetadata(Metadata metadata) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this, metadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this, z, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this, playbackParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlaybackStateChanged(int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(this, playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this, z, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(this, mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPositionDiscontinuity(int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onRenderedFirstFrame() {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(this);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onRepeatModeChanged(int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(this, i);
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j) {
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.isScrubbingModeEnabled(playerControlView.player)) {
                PlayerControlView playerControlView2 = PlayerControlView.this;
                playerControlView2.seekToTimeBarPosition(playerControlView2.player, j);
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j) {
            PlayerControlView.this.scrubbing = true;
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
            PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
            if (PlayerControlView.this.player == null || !PlayerControlView.this.timeBarScrubbingEnabled) {
                return;
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.isExoPlayer(playerControlView.player)) {
                try {
                    ((Method) Assertions.checkNotNull(PlayerControlView.this.setScrubbingModeEnabledMethod)).invoke(PlayerControlView.this.player, Boolean.TRUE);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
            PlayerControlView playerControlView2 = PlayerControlView.this;
            if (playerControlView2.isCompositionPlayer(playerControlView2.player)) {
                try {
                    ((Method) Assertions.checkNotNull(PlayerControlView.this.compositionPlayerSetScrubbingModeEnabledMethod)).invoke(PlayerControlView.this.player, Boolean.TRUE);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                Log.w(PlayerControlView.TAG, "Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=" + ((Player) Assertions.checkNotNull(PlayerControlView.this.player)).getClass());
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j, boolean z) {
            PlayerControlView.this.scrubbing = false;
            if (PlayerControlView.this.player != null) {
                if (!z) {
                    PlayerControlView playerControlView = PlayerControlView.this;
                    playerControlView.seekToTimeBarPosition(playerControlView.player, j);
                }
                PlayerControlView playerControlView2 = PlayerControlView.this;
                if (playerControlView2.isExoPlayer(playerControlView2.player)) {
                    try {
                        ((Method) Assertions.checkNotNull(PlayerControlView.this.setScrubbingModeEnabledMethod)).invoke(PlayerControlView.this.player, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    PlayerControlView playerControlView3 = PlayerControlView.this;
                    if (playerControlView3.isCompositionPlayer(playerControlView3.player)) {
                        try {
                            ((Method) Assertions.checkNotNull(PlayerControlView.this.compositionPlayerSetScrubbingModeEnabledMethod)).invoke(PlayerControlView.this.player, Boolean.FALSE);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
            }
            PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onSeekBackIncrementChanged(long j) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(this, j);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(this, j);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(this, i, i2);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(this, timeline, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(this, trackSelectionParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onTracksChanged(Tracks tracks) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(this, tracks);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(this, videoSize);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onVolumeChanged(float f) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(this, f);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onCues(List list) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, list);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(this, positionInfo, positionInfo2, i);
        }
    }

    @Deprecated
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean z);
    }

    public final class PlaybackSpeedAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {
        private final String[] playbackSpeedTexts;
        private final float[] playbackSpeeds;
        private int selectedIndex;

        public PlaybackSpeedAdapter(String[] strArr, float[] fArr) {
            this.playbackSpeedTexts = strArr;
            this.playbackSpeeds = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
            if (i != this.selectedIndex) {
                PlayerControlView.this.setPlaybackSpeed(this.playbackSpeeds[i]);
            }
            PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.playbackSpeedTexts.length;
        }

        public String getSelectedText() {
            return this.playbackSpeedTexts[this.selectedIndex];
        }

        public void updateSelectedIndex(float f) {
            int i = 0;
            int i2 = 0;
            float f2 = Float.MAX_VALUE;
            while (true) {
                float[] fArr = this.playbackSpeeds;
                if (i >= fArr.length) {
                    this.selectedIndex = i2;
                    return;
                }
                float fAbs = Math.abs(f - fArr[i]);
                if (fAbs < f2) {
                    i2 = i;
                    f2 = fAbs;
                }
                i++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, final int i) {
            String[] strArr = this.playbackSpeedTexts;
            if (i < strArr.length) {
                subSettingViewHolder.textView.setText(strArr[i]);
            }
            if (i == this.selectedIndex) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.checkView.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.checkView.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2752O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$onBindViewHolder$0(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    public final class SettingViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iconView;
        private final TextView mainTextView;
        private final TextView subTextView;

        public SettingViewHolder(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.mainTextView = (TextView) view.findViewById(R.id.exo_main_text);
            this.subTextView = (TextView) view.findViewById(R.id.exo_sub_text);
            this.iconView = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view) {
            PlayerControlView.this.onSettingViewClicked(getBindingAdapterPosition());
        }
    }

    public class SettingsAdapter extends RecyclerView.Adapter<SettingViewHolder> {
        private final Drawable[] iconIds;
        private final String[] mainTexts;
        private final String[] subTexts;

        public SettingsAdapter(String[] strArr, Drawable[] drawableArr) {
            this.mainTexts = strArr;
            this.subTexts = new String[strArr.length];
            this.iconIds = drawableArr;
        }

        private boolean shouldShowSetting(int i) {
            if (PlayerControlView.this.player == null) {
                return false;
            }
            if (i == 0) {
                return PlayerControlView.this.player.isCommandAvailable(13);
            }
            if (i != 1) {
                return true;
            }
            return PlayerControlView.this.player.isCommandAvailable(30) && PlayerControlView.this.player.isCommandAvailable(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mainTexts.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        public boolean hasSettingsToShow() {
            return shouldShowSetting(1) || shouldShowSetting(0);
        }

        public void setSubTextAtPosition(int i, String str) {
            this.subTexts[i] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SettingViewHolder settingViewHolder, int i) {
            if (shouldShowSetting(i)) {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            settingViewHolder.mainTextView.setText(this.mainTexts[i]);
            if (this.subTexts[i] == null) {
                settingViewHolder.subTextView.setVisibility(8);
            } else {
                settingViewHolder.subTextView.setText(this.subTexts[i]);
            }
            if (this.iconIds[i] == null) {
                settingViewHolder.iconView.setVisibility(8);
            } else {
                settingViewHolder.iconView.setImageDrawable(this.iconIds[i]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return PlayerControlView.this.new SettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    public static class SubSettingViewHolder extends RecyclerView.ViewHolder {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.textView = (TextView) view.findViewById(R.id.exo_text);
            this.checkView = view.findViewById(R.id.exo_check);
        }
    }

    public final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        private TextTrackSelectionAdapter() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view) {
            if (PlayerControlView.this.player == null || !PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            PlayerControlView.this.player.setTrackSelectionParameters(PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).setPreferredTextLanguage(null).setPreferredTextRoleFlags(0).build());
            PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).isSelected()) {
                    z = true;
                    break;
                }
            }
            if (PlayerControlView.this.subtitleButton != null) {
                ImageView imageView = PlayerControlView.this.subtitleButton;
                PlayerControlView playerControlView = PlayerControlView.this;
                imageView.setImageDrawable(z ? playerControlView.subtitleOnButtonDrawable : playerControlView.subtitleOffButtonDrawable);
                PlayerControlView.this.subtitleButton.setContentDescription(z ? PlayerControlView.this.subtitleOnContentDescription : PlayerControlView.this.subtitleOffContentDescription);
            }
            this.tracks = list;
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            boolean z;
            subSettingViewHolder.textView.setText(R.string.exo_track_selection_none);
            int i = 0;
            while (true) {
                if (i >= this.tracks.size()) {
                    z = true;
                    break;
                } else {
                    if (this.tracks.get(i).isSelected()) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, 2));
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            super.onBindViewHolder(subSettingViewHolder, i);
            if (i > 0) {
                subSettingViewHolder.checkView.setVisibility(this.tracks.get(i + (-1)).isSelected() ? 0 : 4);
            }
        }
    }

    public static final class TrackInformation {
        public final Tracks.Group trackGroup;
        public final int trackIndex;
        public final String trackName;

        public TrackInformation(Tracks tracks, int i, int i2, String str) {
            this.trackGroup = (Tracks.Group) tracks.getGroups().get(i);
            this.trackIndex = i2;
            this.trackName = str;
        }

        public boolean isSelected() {
            return this.trackGroup.isTrackSelected(this.trackIndex);
        }
    }

    public abstract class TrackSelectionAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {
        protected List<TrackInformation> tracks = new ArrayList();

        public TrackSelectionAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(Player player, TrackGroup trackGroup, TrackInformation trackInformation, View view) {
            if (player.isCommandAvailable(29)) {
                player.setTrackSelectionParameters(player.getTrackSelectionParameters().buildUpon().setOverrideForType(new TrackSelectionOverride(trackGroup, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(Integer.valueOf(trackInformation.trackIndex)))).setTrackTypeDisabled(trackInformation.trackGroup.getType(), false).build());
                onTrackSelection(trackInformation.trackName);
                PlayerControlView.this.settingsWindow.dismiss();
            }
        }

        public void clear() {
            this.tracks = Collections.emptyList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.tracks.isEmpty()) {
                return 0;
            }
            return this.tracks.size() + 1;
        }

        public abstract void init(List<TrackInformation> list);

        public abstract void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder);

        public abstract void onTrackSelection(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            final Player player = PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (i == 0) {
                onBindViewHolderAtZeroPosition(subSettingViewHolder);
                return;
            }
            final TrackInformation trackInformation = this.tracks.get(i - 1);
            final TrackGroup mediaTrackGroup = trackInformation.trackGroup.getMediaTrackGroup();
            boolean z = player.getTrackSelectionParameters().overrides.get(mediaTrackGroup) != null && trackInformation.isSelected();
            subSettingViewHolder.textView.setText(trackInformation.trackName);
            subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.TrackInformation trackInformation2 = trackInformation;
                    this.f2754O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$onBindViewHolder$0(player, mediaTrackGroup, trackInformation2, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    @Deprecated
    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    static {
        MediaLibraryInfo.registerModule("media3.ui");
        PLAYBACK_SPEEDS = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    private static boolean canShowMultiWindowTimeBar(Player player, Timeline.Window window) {
        Timeline currentTimeline;
        int windowCount;
        if (!player.isCommandAvailable(17) || (windowCount = (currentTimeline = player.getCurrentTimeline()).getWindowCount()) <= 1 || windowCount > 100) {
            return false;
        }
        for (int i = 0; i < windowCount; i++) {
            if (currentTimeline.getWindow(i, window).durationUs == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displaySettingsWindow(RecyclerView.Adapter<?> adapter, View view) {
        this.settingsView.setAdapter(adapter);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        this.settingsWindow.dismiss();
        this.needToHideBars = true;
        this.settingsWindow.showAsDropDown(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin);
    }

    private O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O gatherSupportedTrackInfosOfType(Tracks tracks, int i) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O groups = tracks.getGroups();
        int i2 = 0;
        for (int i3 = 0; i3 < groups.size(); i3++) {
            Tracks.Group group = (Tracks.Group) groups.get(i3);
            if (group.getType() == i) {
                for (int i4 = 0; i4 < group.length; i4++) {
                    if (group.isTrackSupported(i4)) {
                        Format trackFormat = group.getTrackFormat(i4);
                        if ((trackFormat.selectionFlags & 2) == 0) {
                            TrackInformation trackInformation = new TrackInformation(tracks, i3, i4, this.trackNameProvider.getTrackName(trackFormat));
                            int i5 = i2 + 1;
                            int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objArrCopyOf.length, i5);
                            if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                            }
                            objArrCopyOf[i2] = trackInformation;
                            i2 = i5;
                        }
                    }
                }
            }
        }
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.asImmutableList(objArrCopyOf, i2);
    }

    private void initTrackSelectionAdapter() {
        this.textTrackSelectionAdapter.clear();
        this.audioTrackSelectionAdapter.clear();
        Player player = this.player;
        if (player != null && player.isCommandAvailable(30) && this.player.isCommandAvailable(29)) {
            Tracks currentTracks = this.player.getCurrentTracks();
            this.audioTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 1));
            if (this.controlViewLayoutManager.getShowButton(this.subtitleButton)) {
                this.textTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 3));
            } else {
                this.textTrackSelectionAdapter.init(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
            }
        }
    }

    private static void initializeFullscreenButton(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean isCompositionPlayer(@Nullable Player player) {
        Class<?> cls;
        return (player == null || (cls = this.compositionPlayerClazz) == null || !cls.isAssignableFrom(player.getClass())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean isExoPlayer(@Nullable Player player) {
        Class<?> cls;
        return (player == null || (cls = this.exoplayerClazz) == null || !cls.isAssignableFrom(player.getClass())) ? false : true;
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean isScrubbingModeEnabled(@Nullable Player player) {
        try {
            if (!isExoPlayer(player) || !((Boolean) Assertions.checkNotNull(((Method) Assertions.checkNotNull(this.isScrubbingModeEnabledMethod)).invoke(player, null))).booleanValue()) {
                if (!isCompositionPlayer(player) || !((Boolean) Assertions.checkNotNull(((Method) Assertions.checkNotNull(this.compositionPlayerIsScrubbingModeEnabledMethod)).invoke(player, null))).booleanValue()) {
                    return false;
                }
            }
            return true;
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFullscreenButtonClicked(View view) {
        updateIsFullscreen(!this.isFullscreen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i9 == i10) && this.settingsWindow.isShowing()) {
            updateSettingsWindowSize();
            this.settingsWindow.update(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSettingViewClicked(int i) {
        if (i == 0) {
            displaySettingsWindow(this.playbackSpeedAdapter, (View) Assertions.checkNotNull(this.settingsButton));
        } else if (i == 1) {
            displaySettingsWindow(this.audioTrackSelectionAdapter, (View) Assertions.checkNotNull(this.settingsButton));
        } else {
            this.settingsWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(Player player, long j) {
        if (this.multiWindowTimeBar) {
            if (player.isCommandAvailable(17) && player.isCommandAvailable(10)) {
                Timeline currentTimeline = player.getCurrentTimeline();
                int windowCount = currentTimeline.getWindowCount();
                int i = 0;
                while (true) {
                    long durationMs = currentTimeline.getWindow(i, this.window).getDurationMs();
                    if (j < durationMs) {
                        break;
                    }
                    if (i == windowCount - 1) {
                        j = durationMs;
                        break;
                    } else {
                        j -= durationMs;
                        i++;
                    }
                }
                player.seekTo(i, j);
            }
        } else if (player.isCommandAvailable(5)) {
            player.seekTo(j);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        Player player = this.player;
        if (player == null || !player.isCommandAvailable(13)) {
            return;
        }
        Player player2 = this.player;
        player2.setPlaybackParameters(player2.getPlaybackParameters().withSpeed(f));
    }

    private void updateButton(boolean z, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
    }

    private void updateFastForwardButton() {
        Player player = this.player;
        int seekForwardIncrement = (int) ((player != null ? player.getSeekForwardIncrement() : C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) / 1000);
        TextView textView = this.fastForwardButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekForwardIncrement));
        }
        View view = this.fastForwardButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
        }
    }

    private void updateFullscreenButtonForState(@Nullable ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.fullscreenExitDrawable);
            imageView.setContentDescription(this.fullscreenExitContentDescription);
        } else {
            imageView.setImageDrawable(this.fullscreenEnterDrawable);
            imageView.setContentDescription(this.fullscreenEnterContentDescription);
        }
    }

    private static void updateFullscreenButtonVisibility(@Nullable View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigation() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                zIsCommandAvailable = (this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window)) ? player.isCommandAvailable(10) : player.isCommandAvailable(5);
                zIsCommandAvailable3 = player.isCommandAvailable(7);
                zIsCommandAvailable4 = player.isCommandAvailable(11);
                zIsCommandAvailable5 = player.isCommandAvailable(12);
                zIsCommandAvailable2 = player.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            if (zIsCommandAvailable4) {
                updateRewindButton();
            }
            if (zIsCommandAvailable5) {
                updateFastForwardButton();
            }
            updateButton(zIsCommandAvailable3, this.previousButton);
            updateButton(zIsCommandAvailable4, this.rewindButton);
            updateButton(zIsCommandAvailable5, this.fastForwardButton);
            updateButton(zIsCommandAvailable2, this.nextButton);
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        if (isVisible() && this.isAttachedToWindow && this.playPauseButton != null) {
            boolean zShouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
            Drawable drawable = zShouldShowPlayButton ? this.playButtonDrawable : this.pauseButtonDrawable;
            int i = zShouldShowPlayButton ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            this.playPauseButton.setImageDrawable(drawable);
            this.playPauseButton.setContentDescription(this.resources.getString(i));
            updateButton(Util.shouldEnablePlayPauseButton(this.player), this.playPauseButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackSpeedList() {
        Player player = this.player;
        if (player == null) {
            return;
        }
        this.playbackSpeedAdapter.updateSelectedIndex(player.getPlaybackParameters().speed);
        this.settingsAdapter.setSubTextAtPosition(0, this.playbackSpeedAdapter.getSelectedText());
        updateSettingsButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long contentPosition;
        long contentBufferedPosition;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player == null || !player.isCommandAvailable(16)) {
                contentPosition = 0;
                contentBufferedPosition = 0;
            } else {
                contentPosition = player.getContentPosition() + this.currentWindowOffset;
                contentBufferedPosition = player.getContentBufferedPosition() + this.currentWindowOffset;
            }
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, contentPosition));
            }
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.timeBar.setBufferedPosition(isScrubbingModeEnabled(player) ? contentPosition : contentBufferedPosition);
            }
            ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null) {
                progressUpdateListener.onProgressUpdate(contentPosition, contentBufferedPosition);
            }
            removeCallbacks(this.updateProgressAction);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.updateProgressAction, 1000L);
                return;
            }
            TimeBar timeBar2 = this.timeBar;
            long jMin = Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f = player.getPlaybackParameters().speed;
            postDelayed(this.updateProgressAction, Util.constrainValue(f > 0.0f ? (long) (jMin / f) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, imageView);
                return;
            }
            Player player = this.player;
            if (player == null || !player.isCommandAvailable(15)) {
                updateButton(false, this.repeatToggleButton);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, this.repeatToggleButton);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
        }
    }

    private void updateRewindButton() {
        Player player = this.player;
        int seekBackIncrement = (int) ((player != null ? player.getSeekBackIncrement() : 5000L) / 1000);
        TextView textView = this.rewindButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekBackIncrement));
        }
        View view = this.rewindButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
        }
    }

    private void updateSettingsButton() {
        updateButton(this.settingsAdapter.hasSettingsToShow(), this.settingsButton);
    }

    private void updateSettingsWindowSize() {
        this.settingsView.measure(0, 0);
        this.settingsWindow.setWidth(Math.min(this.settingsView.getMeasuredWidth(), getWidth() - (this.settingsWindowMargin * 2)));
        this.settingsWindow.setHeight(Math.min(getHeight() - (this.settingsWindowMargin * 2), this.settingsView.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player = this.player;
            if (!this.controlViewLayoutManager.getShowButton(imageView)) {
                updateButton(false, this.shuffleButton);
                return;
            }
            if (player == null || !player.isCommandAvailable(14)) {
                updateButton(false, this.shuffleButton);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
            } else {
                updateButton(true, this.shuffleButton);
                this.shuffleButton.setImageDrawable(player.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(player.getShuffleModeEnabled() ? this.shuffleOnContentDescription : this.shuffleOffContentDescription);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x011a  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc A[SYNTHETIC] */
    public void updateTimeline() {
        long jMsToUs;
        int i;
        Timeline.Window window;
        long positionInWindowUs;
        long[] jArr;
        int length;
        Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window);
        this.currentWindowOffset = 0L;
        Timeline currentTimeline = player.isCommandAvailable(17) ? player.getCurrentTimeline() : Timeline.EMPTY;
        boolean zIsEmpty = currentTimeline.isEmpty();
        long j = C.TIME_UNSET;
        if (zIsEmpty) {
            if (player.isCommandAvailable(16)) {
                long contentDuration = player.getContentDuration();
                if (contentDuration != C.TIME_UNSET) {
                    jMsToUs = Util.msToUs(contentDuration);
                } else {
                    jMsToUs = 0;
                }
            } else {
                jMsToUs = 0;
            }
            i = 0;
        } else {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z2 = this.multiWindowTimeBar;
            int i2 = z2 ? 0 : currentMediaItemIndex;
            int windowCount = z2 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            long j2 = 0;
            i = 0;
            while (i2 <= windowCount) {
                if (i2 == currentMediaItemIndex) {
                    this.currentWindowOffset = Util.usToMs(j2);
                }
                currentTimeline.getWindow(i2, this.window);
                Timeline.Window window2 = this.window;
                if (window2.durationUs == j) {
                    Assertions.checkState(this.multiWindowTimeBar ^ z);
                    break;
                }
                int i3 = window2.firstPeriodIndex;
                while (true) {
                    window = this.window;
                    if (i3 <= window.lastPeriodIndex) {
                        currentTimeline.getPeriod(i3, this.period);
                        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
                        int adGroupCount = this.period.getAdGroupCount();
                        while (removedAdGroupCount < adGroupCount) {
                            long adGroupTimeUs = this.period.getAdGroupTimeUs(removedAdGroupCount);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                long j3 = this.period.durationUs;
                                if (j3 != j) {
                                    adGroupTimeUs = j3;
                                    positionInWindowUs = this.period.getPositionInWindowUs() + adGroupTimeUs;
                                    if (positionInWindowUs >= 0) {
                                        jArr = this.adGroupTimesMs;
                                        if (i == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                            this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                        }
                                        this.adGroupTimesMs[i] = Util.usToMs(positionInWindowUs + j2);
                                        this.playedAdGroups[i] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                        i++;
                                    }
                                }
                            } else {
                                positionInWindowUs = this.period.getPositionInWindowUs() + adGroupTimeUs;
                                if (positionInWindowUs >= 0) {
                                    jArr = this.adGroupTimesMs;
                                    if (i == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                        this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                    }
                                    this.adGroupTimesMs[i] = Util.usToMs(positionInWindowUs + j2);
                                    this.playedAdGroups[i] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                    i++;
                                }
                            }
                            removedAdGroupCount++;
                            j = C.TIME_UNSET;
                        }
                        i3++;
                        j = C.TIME_UNSET;
                    }
                }
                j2 += window.durationUs;
                i2++;
                z = true;
                j = C.TIME_UNSET;
            }
            jMsToUs = j2;
        }
        long jUsToMs = Util.usToMs(jMsToUs);
        TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, jUsToMs));
        }
        TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(jUsToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i4 = i + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i4 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i4);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i4);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i4);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTrackLists() {
        initTrackSelectionAdapter();
        updateButton(this.textTrackSelectionAdapter.getItemCount() > 0, this.subtitleButton);
        updateSettingsButton();
    }

    @Deprecated
    public void addVisibilityListener(VisibilityListener visibilityListener) {
        Assertions.checkNotNull(visibilityListener);
        this.visibilityListeners.add(visibilityListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.player;
        if (player == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.getPlaybackState() == 4 || !player.isCommandAvailable(12)) {
                return true;
            }
            player.seekForward();
            return true;
        }
        if (keyCode == 89 && player.isCommandAvailable(11)) {
            player.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            Util.handlePlayPauseButtonAction(player, this.showPlayButtonIfSuppressed);
            return true;
        }
        if (keyCode == 87) {
            if (!player.isCommandAvailable(9)) {
                return true;
            }
            player.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            if (!player.isCommandAvailable(7)) {
                return true;
            }
            player.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            Util.handlePlayButtonAction(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        Util.handlePauseButtonAction(player);
        return true;
    }

    @Nullable
    public Player getPlayer() {
        return this.player;
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public boolean getShowShuffleButton() {
        return this.controlViewLayoutManager.getShowButton(this.shuffleButton);
    }

    public boolean getShowSubtitleButton() {
        return this.controlViewLayoutManager.getShowButton(this.subtitleButton);
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        return this.controlViewLayoutManager.getShowButton(this.vrButton);
    }

    public void hide() {
        this.controlViewLayoutManager.hide();
    }

    public void hideImmediately() {
        this.controlViewLayoutManager.hideImmediately();
    }

    public boolean isAnimationEnabled() {
        return this.controlViewLayoutManager.isAnimationEnabled();
    }

    public boolean isFullyVisible() {
        return this.controlViewLayoutManager.isFullyVisible();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public void notifyOnVisibilityChange() {
        Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controlViewLayoutManager.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.controlViewLayoutManager.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        this.controlViewLayoutManager.removeHideCallbacks();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.controlViewLayoutManager.onLayout(z, i, i2, i3, i4);
    }

    @Deprecated
    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void requestPlayPauseFocus() {
        ImageView imageView = this.playPauseButton;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.controlViewLayoutManager.setAnimationEnabled(z);
    }

    public void setExtraAdGroupMarkers(@Nullable long[] jArr, @Nullable boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) Assertions.checkNotNull(zArr);
            Assertions.checkArgument(jArr.length == zArr2.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr2;
        }
        updateTimeline();
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.onFullScreenModeChangedListener = onFullScreenModeChangedListener;
        updateFullscreenButtonVisibility(this.fullscreenButton, onFullScreenModeChangedListener != null);
        updateFullscreenButtonVisibility(this.minimalFullscreenButton, onFullScreenModeChangedListener != null);
    }

    public void setPlayer(@Nullable Player player) {
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        Assertions.checkArgument(player == null || player.getApplicationLooper() == Looper.getMainLooper());
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        updateAll();
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        Player player = this.player;
        if (player != null && player.isCommandAvailable(15)) {
            int repeatMode = this.player.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        this.controlViewLayoutManager.setShowButton(this.repeatToggleButton, i != 0);
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.fastForwardButton, z);
        updateNavigation();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setShowNextButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.nextButton, z);
        updateNavigation();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.showPlayButtonIfSuppressed = z;
        updatePlayPauseButton();
    }

    public void setShowPreviousButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.previousButton, z);
        updateNavigation();
    }

    public void setShowRewindButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z);
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.shuffleButton, z);
        updateShuffleButton();
    }

    public void setShowSubtitleButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z);
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    public void setShowVrButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.vrButton, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.timeBarScrubbingEnabled = z;
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageView imageView = this.vrButton;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            updateButton(onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        this.controlViewLayoutManager.show();
    }

    public void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTrackLists();
        updatePlaybackSpeedList();
        updateTimeline();
    }

    public void updateIsFullscreen(boolean z) {
        if (this.isFullscreen == z) {
            return;
        }
        this.isFullscreen = z;
        updateFullscreenButtonForState(this.fullscreenButton, z);
        updateFullscreenButtonForState(this.minimalFullscreenButton, z);
        OnFullScreenModeChangedListener onFullScreenModeChangedListener = this.onFullScreenModeChangedListener;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.onFullScreenModeChanged(z);
        }
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
        return typedArray.getInt(R.styleable.PlayerControlView_repeat_toggle_modes, i);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x046d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0494  */
    /* JADX WARN: Code duplicated, block: B:108:0x050a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0514  */
    /* JADX WARN: Code duplicated, block: B:112:0x064f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0651  */
    /* JADX WARN: Code duplicated, block: B:50:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:62:0x030b  */
    /* JADX WARN: Code duplicated, block: B:63:0x031f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0321  */
    /* JADX WARN: Code duplicated, block: B:65:0x0371  */
    /* JADX WARN: Code duplicated, block: B:68:0x0387  */
    /* JADX WARN: Code duplicated, block: B:71:0x039e  */
    /* JADX WARN: Code duplicated, block: B:74:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:77:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0400 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0402  */
    /* JADX WARN: Code duplicated, block: B:83:0x040a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0412  */
    /* JADX WARN: Code duplicated, block: B:89:0x0429  */
    /* JADX WARN: Code duplicated, block: B:90:0x0438  */
    /* JADX WARN: Code duplicated, block: B:92:0x043b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0443  */
    /* JADX WARN: Code duplicated, block: B:96:0x044b  */
    /* JADX WARN: Code duplicated, block: B:99:0x045c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v117 */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v119 */
    /* JADX WARN: Type inference failed for: r3v120 */
    /* JADX WARN: Type inference failed for: r3v17, types: [androidx.media3.ui.TimeBar] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) throws Throwable {
        PlayerControlView playerControlView;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i15;
        int i16;
        boolean z8;
        int i17;
        int i18;
        String str;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls;
        Method method6;
        Object r3;
        Method method7;
        ImageView imageView;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        int i19;
        TimeBar timeBar;
        View viewFindViewById4;
        PlayerControlView playerControlView2;
        int i20;
        Object r4;
        TimeBar timeBar2;
        Resources resources;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        Typeface font;
        ImageView imageView5;
        TextView textView;
        View view;
        ImageView imageView6;
        TextView textView2;
        View view2;
        ImageView imageView7;
        ImageView imageView8;
        ImageView imageView9;
        PopupWindow popupWindow;
        boolean z9;
        Method method8;
        Method method9;
        super(context, attributeSet, i);
        int i21 = R.layout.exo_player_control_view;
        int i22 = R.drawable.exo_styled_controls_play;
        int i23 = R.drawable.exo_styled_controls_pause;
        int i24 = R.drawable.exo_styled_controls_next;
        int i25 = R.drawable.exo_styled_controls_simple_fastforward;
        int i26 = R.drawable.exo_styled_controls_previous;
        int i27 = R.drawable.exo_styled_controls_simple_rewind;
        int i28 = R.drawable.exo_styled_controls_fullscreen_exit;
        int i29 = R.drawable.exo_styled_controls_fullscreen_enter;
        int i30 = R.drawable.exo_styled_controls_repeat_off;
        int i31 = R.drawable.exo_styled_controls_repeat_one;
        int i32 = R.drawable.exo_styled_controls_repeat_all;
        String str2 = "isScrubbingModeEnabled";
        int i33 = R.drawable.exo_styled_controls_shuffle_on;
        int i34 = R.drawable.exo_styled_controls_shuffle_off;
        int i35 = R.drawable.exo_styled_controls_subtitle_on;
        int i36 = R.drawable.exo_styled_controls_subtitle_off;
        int i37 = R.drawable.exo_styled_controls_vr;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.PlayerControlView, i, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_controller_layout_id, i21);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_play_icon, i22);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_pause_icon, i23);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_next_icon, i24);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_fastforward_icon, i25);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_previous_icon, i26);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_rewind_icon, i27);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_fullscreen_exit_icon, i28);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_fullscreen_enter_icon, i29);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_repeat_off_icon, i30);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_repeat_one_icon, i31);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_repeat_all_icon, i32);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_shuffle_on_icon, i33);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_shuffle_off_icon, i34);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_subtitle_on_icon, i35);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_subtitle_off_icon, i36);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_vr_icon, i37);
                playerControlView = this;
                try {
                    playerControlView.showTimeoutMs = typedArrayObtainStyledAttributes.getInt(R.styleable.PlayerControlView_show_timeout, playerControlView.showTimeoutMs);
                    playerControlView.repeatToggleModes = getRepeatToggleModes(typedArrayObtainStyledAttributes, playerControlView.repeatToggleModes);
                    boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_rewind_button, true);
                    boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_fastforward_button, true);
                    boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_previous_button, true);
                    boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_next_button, true);
                    boolean z14 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_shuffle_button, false);
                    boolean z15 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_subtitle_button, false);
                    boolean z16 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_vr_button, false);
                    playerControlView.timeBarScrubbingEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_time_bar_scrubbing_enabled, false);
                    playerControlView.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R.styleable.PlayerControlView_time_bar_min_update_interval, playerControlView.timeBarMinUpdateIntervalMs));
                    boolean z17 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_animation_enabled, true);
                    typedArrayObtainStyledAttributes.recycle();
                    i3 = resourceId2;
                    i4 = resourceId3;
                    i5 = resourceId4;
                    i6 = resourceId5;
                    i7 = resourceId6;
                    i8 = resourceId7;
                    i9 = resourceId8;
                    i10 = resourceId9;
                    i11 = resourceId10;
                    i14 = resourceId16;
                    i15 = resourceId;
                    z4 = z10;
                    z5 = z11;
                    z6 = z12;
                    z7 = z13;
                    z8 = z14;
                    z = z15;
                    z2 = z16;
                    i12 = resourceId11;
                    z3 = z17;
                    i16 = resourceId13;
                    i2 = resourceId15;
                    i18 = resourceId12;
                    i13 = resourceId14;
                    i17 = resourceId17;
                } catch (Throwable th) {
                    th = th;
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            playerControlView = this;
            i2 = i35;
            i3 = i22;
            i4 = i23;
            i5 = i24;
            i6 = i25;
            i7 = i26;
            i8 = i27;
            i9 = i28;
            i10 = i29;
            i11 = i30;
            i12 = i31;
            i13 = i34;
            i14 = i36;
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
            z5 = true;
            z6 = true;
            z7 = true;
            i15 = i21;
            i16 = i33;
            z8 = false;
            i17 = i37;
            i18 = i32;
        }
        LayoutInflater.from(context).inflate(i15, playerControlView);
        playerControlView.setDescendantFocusability(262144);
        playerControlView.componentListener = new ComponentListener();
        playerControlView.visibilityListeners = new CopyOnWriteArrayList<>();
        playerControlView.period = new Timeline.Period();
        playerControlView.window = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        playerControlView.formatBuilder = sb;
        int i38 = i17;
        playerControlView.formatter = new Formatter(sb, Locale.getDefault());
        playerControlView.adGroupTimesMs = new long[0];
        playerControlView.playedAdGroups = new boolean[0];
        playerControlView.extraAdGroupTimesMs = new long[0];
        playerControlView.extraPlayedAdGroups = new boolean[0];
        playerControlView.updateProgressAction = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(playerControlView, 1);
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                str = "setScrubbingModeEnabled";
                                try {
                                    method = ExoPlayer.class.getMethod(str, Boolean.TYPE);
                                    str2 = str2;
                                    try {
                                        method2 = method;
                                        method3 = ExoPlayer.class.getMethod(str2, null);
                                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                                        method2 = method;
                                        method3 = null;
                                    }
                                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                                    method = null;
                                    method2 = method;
                                    method3 = null;
                                    playerControlView.exoplayerClazz = ExoPlayer.class;
                                    playerControlView.setScrubbingModeEnabledMethod = method2;
                                    playerControlView.isScrubbingModeEnabledMethod = method3;
                                    cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
                                    Class<?>[] clsArr = new Class[1];
                                    clsArr[0] = Boolean.TYPE;
                                    method9 = cls.getMethod(str, clsArr);
                                    method4 = null;
                                    r3 = 0;
                                    method7 = method9;
                                    method6 = cls.getMethod(str2, null);
                                    playerControlView.compositionPlayerClazz = cls;
                                    playerControlView.compositionPlayerSetScrubbingModeEnabledMethod = method7;
                                    playerControlView.compositionPlayerIsScrubbingModeEnabledMethod = method6;
                                    playerControlView.durationView = (TextView) playerControlView.findViewById(R.id.exo_duration);
                                    playerControlView.positionView = (TextView) playerControlView.findViewById(R.id.exo_position);
                                    imageView = (ImageView) playerControlView.findViewById(R.id.exo_subtitle);
                                    playerControlView.subtitleButton = imageView;
                                    if (imageView != null) {
                                        imageView.setOnClickListener(playerControlView.componentListener);
                                    }
                                    ImageView imageView10 = (ImageView) playerControlView.findViewById(R.id.exo_fullscreen);
                                    playerControlView.fullscreenButton = imageView10;
                                    int i39 = 4;
                                    initializeFullscreenButton(imageView10, new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(playerControlView, i39));
                                    ImageView imageView11 = (ImageView) playerControlView.findViewById(R.id.exo_minimal_fullscreen);
                                    playerControlView.minimalFullscreenButton = imageView11;
                                    initializeFullscreenButton(imageView11, new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(playerControlView, i39));
                                    viewFindViewById = playerControlView.findViewById(R.id.exo_settings);
                                    playerControlView.settingsButton = viewFindViewById;
                                    if (viewFindViewById != null) {
                                        viewFindViewById.setOnClickListener(playerControlView.componentListener);
                                    }
                                    viewFindViewById2 = playerControlView.findViewById(R.id.exo_playback_speed);
                                    playerControlView.playbackSpeedButton = viewFindViewById2;
                                    if (viewFindViewById2 != null) {
                                        viewFindViewById2.setOnClickListener(playerControlView.componentListener);
                                    }
                                    viewFindViewById3 = playerControlView.findViewById(R.id.exo_audio_track);
                                    playerControlView.audioTrackButton = viewFindViewById3;
                                    if (viewFindViewById3 != null) {
                                        viewFindViewById3.setOnClickListener(playerControlView.componentListener);
                                    }
                                    i19 = R.id.exo_progress;
                                    timeBar = (TimeBar) playerControlView.findViewById(i19);
                                    viewFindViewById4 = playerControlView.findViewById(R.id.exo_progress_placeholder);
                                    if (timeBar != null) {
                                        playerControlView.timeBar = timeBar;
                                        playerControlView2 = playerControlView;
                                        i20 = i38;
                                        r4 = r3;
                                    } else if (viewFindViewById4 != null) {
                                        i20 = i38;
                                        DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
                                        defaultTimeBar.setId(i19);
                                        defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
                                        ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
                                        int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
                                        viewGroup.removeView(viewFindViewById4);
                                        viewGroup.addView(defaultTimeBar, iIndexOfChild);
                                        playerControlView2 = this;
                                        playerControlView2.timeBar = defaultTimeBar;
                                        r4 = 0;
                                    } else {
                                        playerControlView2 = playerControlView;
                                        i20 = i38;
                                        playerControlView2.timeBar = r3;
                                        r4 = r3;
                                    }
                                    timeBar2 = playerControlView2.timeBar;
                                    if (timeBar2 != null) {
                                        timeBar2.addListener(playerControlView2.componentListener);
                                    }
                                    resources = context.getResources();
                                    playerControlView2.resources = resources;
                                    imageView2 = (ImageView) playerControlView2.findViewById(R.id.exo_play_pause);
                                    playerControlView2.playPauseButton = imageView2;
                                    if (imageView2 != null) {
                                        imageView2.setOnClickListener(playerControlView2.componentListener);
                                    }
                                    imageView3 = (ImageView) playerControlView2.findViewById(R.id.exo_prev);
                                    playerControlView2.previousButton = imageView3;
                                    if (imageView3 != null) {
                                        imageView3.setImageDrawable(Util.getDrawable(context, resources, i7));
                                        imageView3.setOnClickListener(playerControlView2.componentListener);
                                    }
                                    imageView4 = (ImageView) playerControlView2.findViewById(R.id.exo_next);
                                    playerControlView2.nextButton = imageView4;
                                    if (imageView4 != null) {
                                        imageView4.setImageDrawable(Util.getDrawable(context, resources, i5));
                                        imageView4.setOnClickListener(playerControlView2.componentListener);
                                    }
                                    font = ResourcesCompat.getFont(context, R.font.roboto_medium_numbers);
                                    imageView5 = (ImageView) playerControlView2.findViewById(R.id.exo_rew);
                                    textView = (TextView) playerControlView2.findViewById(R.id.exo_rew_with_amount);
                                    if (imageView5 != null) {
                                        imageView5.setImageDrawable(Util.getDrawable(context, resources, i8));
                                        playerControlView2.rewindButton = imageView5;
                                        playerControlView2.rewindButtonTextView = null;
                                    } else if (textView != null) {
                                        textView.setTypeface(font);
                                        playerControlView2.rewindButtonTextView = textView;
                                        playerControlView2.rewindButton = textView;
                                    } else {
                                        playerControlView2.rewindButtonTextView = r4;
                                        playerControlView2.rewindButton = r4;
                                    }
                                    view = playerControlView2.rewindButton;
                                    if (view != null) {
                                        view.setOnClickListener(playerControlView2.componentListener);
                                    }
                                    imageView6 = (ImageView) playerControlView2.findViewById(R.id.exo_ffwd);
                                    textView2 = (TextView) playerControlView2.findViewById(R.id.exo_ffwd_with_amount);
                                    if (imageView6 != null) {
                                        imageView6.setImageDrawable(Util.getDrawable(context, resources, i6));
                                        playerControlView2.fastForwardButton = imageView6;
                                        playerControlView2.fastForwardButtonTextView = null;
                                    } else if (textView2 != null) {
                                        textView2.setTypeface(font);
                                        playerControlView2.fastForwardButtonTextView = textView2;
                                        playerControlView2.fastForwardButton = textView2;
                                    } else {
                                        playerControlView2.fastForwardButtonTextView = null;
                                        playerControlView2.fastForwardButton = null;
                                    }
                                    view2 = playerControlView2.fastForwardButton;
                                    if (view2 != null) {
                                        view2.setOnClickListener(playerControlView2.componentListener);
                                    }
                                    imageView7 = (ImageView) playerControlView2.findViewById(R.id.exo_repeat_toggle);
                                    playerControlView2.repeatToggleButton = imageView7;
                                    if (imageView7 != null) {
                                        imageView7.setOnClickListener(playerControlView2.componentListener);
                                    }
                                    imageView8 = (ImageView) playerControlView2.findViewById(R.id.exo_shuffle);
                                    playerControlView2.shuffleButton = imageView8;
                                    if (imageView8 != null) {
                                        imageView8.setOnClickListener(playerControlView2.componentListener);
                                    }
                                    playerControlView2.buttonAlphaEnabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                                    playerControlView2.buttonAlphaDisabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                                    imageView9 = (ImageView) playerControlView2.findViewById(R.id.exo_vr);
                                    playerControlView2.vrButton = imageView9;
                                    if (imageView9 != null) {
                                        imageView9.setImageDrawable(Util.getDrawable(context, resources, i20));
                                        playerControlView2.updateButton(false, imageView9);
                                    }
                                    PlayerControlViewLayoutManager playerControlViewLayoutManager = new PlayerControlViewLayoutManager(playerControlView2);
                                    playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager;
                                    playerControlViewLayoutManager.setAnimationEnabled(z3);
                                    SettingsAdapter settingsAdapter = playerControlView2.new SettingsAdapter(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{Util.getDrawable(context, resources, R.drawable.exo_styled_controls_speed), Util.getDrawable(context, resources, R.drawable.exo_styled_controls_audiotrack)});
                                    playerControlView2.settingsAdapter = settingsAdapter;
                                    playerControlView2.settingsWindowMargin = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
                                    RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
                                    playerControlView2.settingsView = recyclerView;
                                    recyclerView.setAdapter(settingsAdapter);
                                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                                    popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
                                    playerControlView2.settingsWindow = popupWindow;
                                    if (Build.VERSION.SDK_INT < 23) {
                                        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                                    }
                                    popupWindow.setOnDismissListener(playerControlView2.componentListener);
                                    playerControlView2.needToHideBars = true;
                                    playerControlView2.trackNameProvider = new DefaultTrackNameProvider(getResources());
                                    playerControlView2.subtitleOnButtonDrawable = Util.getDrawable(context, resources, i2);
                                    playerControlView2.subtitleOffButtonDrawable = Util.getDrawable(context, resources, i14);
                                    playerControlView2.subtitleOnContentDescription = resources.getString(R.string.exo_controls_cc_enabled_description);
                                    playerControlView2.subtitleOffContentDescription = resources.getString(R.string.exo_controls_cc_disabled_description);
                                    playerControlView2.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
                                    playerControlView2.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
                                    playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(playerControlView2.resources.getStringArray(R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
                                    playerControlView2.playButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i3);
                                    playerControlView2.pauseButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i4);
                                    playerControlView2.fullscreenExitDrawable = Util.getDrawable(context, playerControlView2.resources, i9);
                                    playerControlView2.fullscreenEnterDrawable = Util.getDrawable(context, playerControlView2.resources, i10);
                                    playerControlView2.repeatOffButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i11);
                                    playerControlView2.repeatOneButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i12);
                                    playerControlView2.repeatAllButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i18);
                                    playerControlView2.shuffleOnButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i16);
                                    playerControlView2.shuffleOffButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i13);
                                    playerControlView2.fullscreenExitContentDescription = playerControlView2.resources.getString(R.string.exo_controls_fullscreen_exit_description);
                                    playerControlView2.fullscreenEnterContentDescription = playerControlView2.resources.getString(R.string.exo_controls_fullscreen_enter_description);
                                    playerControlView2.repeatOffButtonContentDescription = playerControlView2.resources.getString(R.string.exo_controls_repeat_off_description);
                                    playerControlView2.repeatOneButtonContentDescription = playerControlView2.resources.getString(R.string.exo_controls_repeat_one_description);
                                    playerControlView2.repeatAllButtonContentDescription = playerControlView2.resources.getString(R.string.exo_controls_repeat_all_description);
                                    playerControlView2.shuffleOnContentDescription = playerControlView2.resources.getString(R.string.exo_controls_shuffle_on_description);
                                    playerControlView2.shuffleOffContentDescription = playerControlView2.resources.getString(R.string.exo_controls_shuffle_off_description);
                                    playerControlView2.controlViewLayoutManager.setShowButton((ViewGroup) playerControlView2.findViewById(R.id.exo_bottom_bar), true);
                                    playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.fastForwardButton, z5);
                                    playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.rewindButton, z4);
                                    playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.previousButton, z6);
                                    playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.nextButton, z7);
                                    playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.shuffleButton, z8);
                                    playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.subtitleButton, z);
                                    playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.vrButton, z2);
                                    PlayerControlViewLayoutManager playerControlViewLayoutManager2 = playerControlView2.controlViewLayoutManager;
                                    ImageView imageView12 = playerControlView2.repeatToggleButton;
                                    if (playerControlView2.repeatToggleModes != 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    playerControlViewLayoutManager2.setShowButton(imageView12, z9);
                                    playerControlView2.addOnLayoutChangeListener(new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(playerControlView2, 1));
                                }
                            } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                                str = "setScrubbingModeEnabled";
                            }
                            method7 = method9;
                            method6 = cls.getMethod(str2, null);
                        } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                            method5 = method9;
                            method6 = method4;
                            method7 = method5;
                            r3 = method4;
                        }
                        method9 = cls.getMethod(str, clsArr);
                        method4 = null;
                        r3 = 0;
                    } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                        method8 = null;
                        method5 = method8;
                        method4 = method8;
                        method6 = method4;
                        method7 = method5;
                        r3 = method4;
                        playerControlView.compositionPlayerClazz = cls;
                        playerControlView.compositionPlayerSetScrubbingModeEnabledMethod = method7;
                        playerControlView.compositionPlayerIsScrubbingModeEnabledMethod = method6;
                        playerControlView.durationView = (TextView) playerControlView.findViewById(R.id.exo_duration);
                        playerControlView.positionView = (TextView) playerControlView.findViewById(R.id.exo_position);
                        imageView = (ImageView) playerControlView.findViewById(R.id.exo_subtitle);
                        playerControlView.subtitleButton = imageView;
                        if (imageView != null) {
                            imageView.setOnClickListener(playerControlView.componentListener);
                        }
                        ImageView imageView13 = (ImageView) playerControlView.findViewById(R.id.exo_fullscreen);
                        playerControlView.fullscreenButton = imageView13;
                        int i310 = 4;
                        initializeFullscreenButton(imageView13, new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(playerControlView, i310));
                        ImageView imageView14 = (ImageView) playerControlView.findViewById(R.id.exo_minimal_fullscreen);
                        playerControlView.minimalFullscreenButton = imageView14;
                        initializeFullscreenButton(imageView14, new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(playerControlView, i310));
                        viewFindViewById = playerControlView.findViewById(R.id.exo_settings);
                        playerControlView.settingsButton = viewFindViewById;
                        if (viewFindViewById != null) {
                            viewFindViewById.setOnClickListener(playerControlView.componentListener);
                        }
                        viewFindViewById2 = playerControlView.findViewById(R.id.exo_playback_speed);
                        playerControlView.playbackSpeedButton = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            viewFindViewById2.setOnClickListener(playerControlView.componentListener);
                        }
                        viewFindViewById3 = playerControlView.findViewById(R.id.exo_audio_track);
                        playerControlView.audioTrackButton = viewFindViewById3;
                        if (viewFindViewById3 != null) {
                            viewFindViewById3.setOnClickListener(playerControlView.componentListener);
                        }
                        i19 = R.id.exo_progress;
                        timeBar = (TimeBar) playerControlView.findViewById(i19);
                        viewFindViewById4 = playerControlView.findViewById(R.id.exo_progress_placeholder);
                        if (timeBar != null) {
                            playerControlView.timeBar = timeBar;
                            playerControlView2 = playerControlView;
                            i20 = i38;
                            r4 = r3;
                        } else if (viewFindViewById4 != null) {
                            i20 = i38;
                            DefaultTimeBar defaultTimeBar2 = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
                            defaultTimeBar2.setId(i19);
                            defaultTimeBar2.setLayoutParams(viewFindViewById4.getLayoutParams());
                            ViewGroup viewGroup2 = (ViewGroup) viewFindViewById4.getParent();
                            int iIndexOfChild2 = viewGroup2.indexOfChild(viewFindViewById4);
                            viewGroup2.removeView(viewFindViewById4);
                            viewGroup2.addView(defaultTimeBar2, iIndexOfChild2);
                            playerControlView2 = this;
                            playerControlView2.timeBar = defaultTimeBar2;
                            r4 = 0;
                        } else {
                            playerControlView2 = playerControlView;
                            i20 = i38;
                            playerControlView2.timeBar = r3;
                            r4 = r3;
                        }
                        timeBar2 = playerControlView2.timeBar;
                        if (timeBar2 != null) {
                            timeBar2.addListener(playerControlView2.componentListener);
                        }
                        resources = context.getResources();
                        playerControlView2.resources = resources;
                        imageView2 = (ImageView) playerControlView2.findViewById(R.id.exo_play_pause);
                        playerControlView2.playPauseButton = imageView2;
                        if (imageView2 != null) {
                            imageView2.setOnClickListener(playerControlView2.componentListener);
                        }
                        imageView3 = (ImageView) playerControlView2.findViewById(R.id.exo_prev);
                        playerControlView2.previousButton = imageView3;
                        if (imageView3 != null) {
                            imageView3.setImageDrawable(Util.getDrawable(context, resources, i7));
                            imageView3.setOnClickListener(playerControlView2.componentListener);
                        }
                        imageView4 = (ImageView) playerControlView2.findViewById(R.id.exo_next);
                        playerControlView2.nextButton = imageView4;
                        if (imageView4 != null) {
                            imageView4.setImageDrawable(Util.getDrawable(context, resources, i5));
                            imageView4.setOnClickListener(playerControlView2.componentListener);
                        }
                        font = ResourcesCompat.getFont(context, R.font.roboto_medium_numbers);
                        imageView5 = (ImageView) playerControlView2.findViewById(R.id.exo_rew);
                        textView = (TextView) playerControlView2.findViewById(R.id.exo_rew_with_amount);
                        if (imageView5 != null) {
                            imageView5.setImageDrawable(Util.getDrawable(context, resources, i8));
                            playerControlView2.rewindButton = imageView5;
                            playerControlView2.rewindButtonTextView = null;
                        } else if (textView != null) {
                            textView.setTypeface(font);
                            playerControlView2.rewindButtonTextView = textView;
                            playerControlView2.rewindButton = textView;
                        } else {
                            playerControlView2.rewindButtonTextView = r4;
                            playerControlView2.rewindButton = r4;
                        }
                        view = playerControlView2.rewindButton;
                        if (view != null) {
                            view.setOnClickListener(playerControlView2.componentListener);
                        }
                        imageView6 = (ImageView) playerControlView2.findViewById(R.id.exo_ffwd);
                        textView2 = (TextView) playerControlView2.findViewById(R.id.exo_ffwd_with_amount);
                        if (imageView6 != null) {
                            imageView6.setImageDrawable(Util.getDrawable(context, resources, i6));
                            playerControlView2.fastForwardButton = imageView6;
                            playerControlView2.fastForwardButtonTextView = null;
                        } else if (textView2 != null) {
                            textView2.setTypeface(font);
                            playerControlView2.fastForwardButtonTextView = textView2;
                            playerControlView2.fastForwardButton = textView2;
                        } else {
                            playerControlView2.fastForwardButtonTextView = null;
                            playerControlView2.fastForwardButton = null;
                        }
                        view2 = playerControlView2.fastForwardButton;
                        if (view2 != null) {
                            view2.setOnClickListener(playerControlView2.componentListener);
                        }
                        imageView7 = (ImageView) playerControlView2.findViewById(R.id.exo_repeat_toggle);
                        playerControlView2.repeatToggleButton = imageView7;
                        if (imageView7 != null) {
                            imageView7.setOnClickListener(playerControlView2.componentListener);
                        }
                        imageView8 = (ImageView) playerControlView2.findViewById(R.id.exo_shuffle);
                        playerControlView2.shuffleButton = imageView8;
                        if (imageView8 != null) {
                            imageView8.setOnClickListener(playerControlView2.componentListener);
                        }
                        playerControlView2.buttonAlphaEnabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                        playerControlView2.buttonAlphaDisabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                        imageView9 = (ImageView) playerControlView2.findViewById(R.id.exo_vr);
                        playerControlView2.vrButton = imageView9;
                        if (imageView9 != null) {
                            imageView9.setImageDrawable(Util.getDrawable(context, resources, i20));
                            playerControlView2.updateButton(false, imageView9);
                        }
                        PlayerControlViewLayoutManager playerControlViewLayoutManager3 = new PlayerControlViewLayoutManager(playerControlView2);
                        playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager3;
                        playerControlViewLayoutManager3.setAnimationEnabled(z3);
                        SettingsAdapter settingsAdapter2 = playerControlView2.new SettingsAdapter(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{Util.getDrawable(context, resources, R.drawable.exo_styled_controls_speed), Util.getDrawable(context, resources, R.drawable.exo_styled_controls_audiotrack)});
                        playerControlView2.settingsAdapter = settingsAdapter2;
                        playerControlView2.settingsWindowMargin = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
                        RecyclerView recyclerView2 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
                        playerControlView2.settingsView = recyclerView2;
                        recyclerView2.setAdapter(settingsAdapter2);
                        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
                        popupWindow = new PopupWindow((View) recyclerView2, -2, -2, true);
                        playerControlView2.settingsWindow = popupWindow;
                        if (Build.VERSION.SDK_INT < 23) {
                            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                        }
                        popupWindow.setOnDismissListener(playerControlView2.componentListener);
                        playerControlView2.needToHideBars = true;
                        playerControlView2.trackNameProvider = new DefaultTrackNameProvider(getResources());
                        playerControlView2.subtitleOnButtonDrawable = Util.getDrawable(context, resources, i2);
                        playerControlView2.subtitleOffButtonDrawable = Util.getDrawable(context, resources, i14);
                        playerControlView2.subtitleOnContentDescription = resources.getString(R.string.exo_controls_cc_enabled_description);
                        playerControlView2.subtitleOffContentDescription = resources.getString(R.string.exo_controls_cc_disabled_description);
                        playerControlView2.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
                        playerControlView2.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
                        playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(playerControlView2.resources.getStringArray(R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
                        playerControlView2.playButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i3);
                        playerControlView2.pauseButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i4);
                        playerControlView2.fullscreenExitDrawable = Util.getDrawable(context, playerControlView2.resources, i9);
                        playerControlView2.fullscreenEnterDrawable = Util.getDrawable(context, playerControlView2.resources, i10);
                        playerControlView2.repeatOffButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i11);
                        playerControlView2.repeatOneButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i12);
                        playerControlView2.repeatAllButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i18);
                        playerControlView2.shuffleOnButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i16);
                        playerControlView2.shuffleOffButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i13);
                        playerControlView2.fullscreenExitContentDescription = playerControlView2.resources.getString(R.string.exo_controls_fullscreen_exit_description);
                        playerControlView2.fullscreenEnterContentDescription = playerControlView2.resources.getString(R.string.exo_controls_fullscreen_enter_description);
                        playerControlView2.repeatOffButtonContentDescription = playerControlView2.resources.getString(R.string.exo_controls_repeat_off_description);
                        playerControlView2.repeatOneButtonContentDescription = playerControlView2.resources.getString(R.string.exo_controls_repeat_one_description);
                        playerControlView2.repeatAllButtonContentDescription = playerControlView2.resources.getString(R.string.exo_controls_repeat_all_description);
                        playerControlView2.shuffleOnContentDescription = playerControlView2.resources.getString(R.string.exo_controls_shuffle_on_description);
                        playerControlView2.shuffleOffContentDescription = playerControlView2.resources.getString(R.string.exo_controls_shuffle_off_description);
                        playerControlView2.controlViewLayoutManager.setShowButton((ViewGroup) playerControlView2.findViewById(R.id.exo_bottom_bar), true);
                        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.fastForwardButton, z5);
                        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.rewindButton, z4);
                        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.previousButton, z6);
                        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.nextButton, z7);
                        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.shuffleButton, z8);
                        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.subtitleButton, z);
                        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.vrButton, z2);
                        PlayerControlViewLayoutManager playerControlViewLayoutManager4 = playerControlView2.controlViewLayoutManager;
                        ImageView imageView15 = playerControlView2.repeatToggleButton;
                        if (playerControlView2.repeatToggleModes != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        playerControlViewLayoutManager4.setShowButton(imageView15, z9);
                        playerControlView2.addOnLayoutChangeListener(new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(playerControlView2, 1));
                    }
                    clsArr[0] = Boolean.TYPE;
                } catch (ClassNotFoundException unused6) {
                    method8 = null;
                } catch (NoSuchMethodException unused7) {
                    method8 = null;
                }
                Class<?>[] clsArr2 = new Class[1];
            } catch (ClassNotFoundException unused8) {
                method8 = null;
            } catch (NoSuchMethodException unused9) {
                method8 = null;
            }
            cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
        } catch (ClassNotFoundException | NoSuchMethodException unused10) {
            method4 = null;
            method5 = null;
            cls = null;
        }
        playerControlView.exoplayerClazz = ExoPlayer.class;
        playerControlView.setScrubbingModeEnabledMethod = method2;
        playerControlView.isScrubbingModeEnabledMethod = method3;
        playerControlView.compositionPlayerClazz = cls;
        playerControlView.compositionPlayerSetScrubbingModeEnabledMethod = method7;
        playerControlView.compositionPlayerIsScrubbingModeEnabledMethod = method6;
        playerControlView.durationView = (TextView) playerControlView.findViewById(R.id.exo_duration);
        playerControlView.positionView = (TextView) playerControlView.findViewById(R.id.exo_position);
        imageView = (ImageView) playerControlView.findViewById(R.id.exo_subtitle);
        playerControlView.subtitleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(playerControlView.componentListener);
        }
        ImageView imageView16 = (ImageView) playerControlView.findViewById(R.id.exo_fullscreen);
        playerControlView.fullscreenButton = imageView16;
        int i311 = 4;
        initializeFullscreenButton(imageView16, new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(playerControlView, i311));
        ImageView imageView17 = (ImageView) playerControlView.findViewById(R.id.exo_minimal_fullscreen);
        playerControlView.minimalFullscreenButton = imageView17;
        initializeFullscreenButton(imageView17, new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(playerControlView, i311));
        viewFindViewById = playerControlView.findViewById(R.id.exo_settings);
        playerControlView.settingsButton = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(playerControlView.componentListener);
        }
        viewFindViewById2 = playerControlView.findViewById(R.id.exo_playback_speed);
        playerControlView.playbackSpeedButton = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(playerControlView.componentListener);
        }
        viewFindViewById3 = playerControlView.findViewById(R.id.exo_audio_track);
        playerControlView.audioTrackButton = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(playerControlView.componentListener);
        }
        i19 = R.id.exo_progress;
        timeBar = (TimeBar) playerControlView.findViewById(i19);
        viewFindViewById4 = playerControlView.findViewById(R.id.exo_progress_placeholder);
        if (timeBar != null) {
            playerControlView.timeBar = timeBar;
            playerControlView2 = playerControlView;
            i20 = i38;
            r4 = r3;
        } else if (viewFindViewById4 != null) {
            i20 = i38;
            DefaultTimeBar defaultTimeBar3 = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            defaultTimeBar3.setId(i19);
            defaultTimeBar3.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup3 = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild3 = viewGroup3.indexOfChild(viewFindViewById4);
            viewGroup3.removeView(viewFindViewById4);
            viewGroup3.addView(defaultTimeBar3, iIndexOfChild3);
            playerControlView2 = this;
            playerControlView2.timeBar = defaultTimeBar3;
            r4 = 0;
        } else {
            playerControlView2 = playerControlView;
            i20 = i38;
            playerControlView2.timeBar = r3;
            r4 = r3;
        }
        timeBar2 = playerControlView2.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(playerControlView2.componentListener);
        }
        resources = context.getResources();
        playerControlView2.resources = resources;
        imageView2 = (ImageView) playerControlView2.findViewById(R.id.exo_play_pause);
        playerControlView2.playPauseButton = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(playerControlView2.componentListener);
        }
        imageView3 = (ImageView) playerControlView2.findViewById(R.id.exo_prev);
        playerControlView2.previousButton = imageView3;
        if (imageView3 != null) {
            imageView3.setImageDrawable(Util.getDrawable(context, resources, i7));
            imageView3.setOnClickListener(playerControlView2.componentListener);
        }
        imageView4 = (ImageView) playerControlView2.findViewById(R.id.exo_next);
        playerControlView2.nextButton = imageView4;
        if (imageView4 != null) {
            imageView4.setImageDrawable(Util.getDrawable(context, resources, i5));
            imageView4.setOnClickListener(playerControlView2.componentListener);
        }
        font = ResourcesCompat.getFont(context, R.font.roboto_medium_numbers);
        imageView5 = (ImageView) playerControlView2.findViewById(R.id.exo_rew);
        textView = (TextView) playerControlView2.findViewById(R.id.exo_rew_with_amount);
        if (imageView5 != null) {
            imageView5.setImageDrawable(Util.getDrawable(context, resources, i8));
            playerControlView2.rewindButton = imageView5;
            playerControlView2.rewindButtonTextView = null;
        } else if (textView != null) {
            textView.setTypeface(font);
            playerControlView2.rewindButtonTextView = textView;
            playerControlView2.rewindButton = textView;
        } else {
            playerControlView2.rewindButtonTextView = r4;
            playerControlView2.rewindButton = r4;
        }
        view = playerControlView2.rewindButton;
        if (view != null) {
            view.setOnClickListener(playerControlView2.componentListener);
        }
        imageView6 = (ImageView) playerControlView2.findViewById(R.id.exo_ffwd);
        textView2 = (TextView) playerControlView2.findViewById(R.id.exo_ffwd_with_amount);
        if (imageView6 != null) {
            imageView6.setImageDrawable(Util.getDrawable(context, resources, i6));
            playerControlView2.fastForwardButton = imageView6;
            playerControlView2.fastForwardButtonTextView = null;
        } else if (textView2 != null) {
            textView2.setTypeface(font);
            playerControlView2.fastForwardButtonTextView = textView2;
            playerControlView2.fastForwardButton = textView2;
        } else {
            playerControlView2.fastForwardButtonTextView = null;
            playerControlView2.fastForwardButton = null;
        }
        view2 = playerControlView2.fastForwardButton;
        if (view2 != null) {
            view2.setOnClickListener(playerControlView2.componentListener);
        }
        imageView7 = (ImageView) playerControlView2.findViewById(R.id.exo_repeat_toggle);
        playerControlView2.repeatToggleButton = imageView7;
        if (imageView7 != null) {
            imageView7.setOnClickListener(playerControlView2.componentListener);
        }
        imageView8 = (ImageView) playerControlView2.findViewById(R.id.exo_shuffle);
        playerControlView2.shuffleButton = imageView8;
        if (imageView8 != null) {
            imageView8.setOnClickListener(playerControlView2.componentListener);
        }
        playerControlView2.buttonAlphaEnabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        playerControlView2.buttonAlphaDisabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        imageView9 = (ImageView) playerControlView2.findViewById(R.id.exo_vr);
        playerControlView2.vrButton = imageView9;
        if (imageView9 != null) {
            imageView9.setImageDrawable(Util.getDrawable(context, resources, i20));
            playerControlView2.updateButton(false, imageView9);
        }
        PlayerControlViewLayoutManager playerControlViewLayoutManager5 = new PlayerControlViewLayoutManager(playerControlView2);
        playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager5;
        playerControlViewLayoutManager5.setAnimationEnabled(z3);
        SettingsAdapter settingsAdapter3 = playerControlView2.new SettingsAdapter(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{Util.getDrawable(context, resources, R.drawable.exo_styled_controls_speed), Util.getDrawable(context, resources, R.drawable.exo_styled_controls_audiotrack)});
        playerControlView2.settingsAdapter = settingsAdapter3;
        playerControlView2.settingsWindowMargin = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView3 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        playerControlView2.settingsView = recyclerView3;
        recyclerView3.setAdapter(settingsAdapter3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        popupWindow = new PopupWindow((View) recyclerView3, -2, -2, true);
        playerControlView2.settingsWindow = popupWindow;
        if (Build.VERSION.SDK_INT < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(playerControlView2.componentListener);
        playerControlView2.needToHideBars = true;
        playerControlView2.trackNameProvider = new DefaultTrackNameProvider(getResources());
        playerControlView2.subtitleOnButtonDrawable = Util.getDrawable(context, resources, i2);
        playerControlView2.subtitleOffButtonDrawable = Util.getDrawable(context, resources, i14);
        playerControlView2.subtitleOnContentDescription = resources.getString(R.string.exo_controls_cc_enabled_description);
        playerControlView2.subtitleOffContentDescription = resources.getString(R.string.exo_controls_cc_disabled_description);
        playerControlView2.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
        playerControlView2.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
        playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(playerControlView2.resources.getStringArray(R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
        playerControlView2.playButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i3);
        playerControlView2.pauseButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i4);
        playerControlView2.fullscreenExitDrawable = Util.getDrawable(context, playerControlView2.resources, i9);
        playerControlView2.fullscreenEnterDrawable = Util.getDrawable(context, playerControlView2.resources, i10);
        playerControlView2.repeatOffButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i11);
        playerControlView2.repeatOneButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i12);
        playerControlView2.repeatAllButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i18);
        playerControlView2.shuffleOnButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i16);
        playerControlView2.shuffleOffButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i13);
        playerControlView2.fullscreenExitContentDescription = playerControlView2.resources.getString(R.string.exo_controls_fullscreen_exit_description);
        playerControlView2.fullscreenEnterContentDescription = playerControlView2.resources.getString(R.string.exo_controls_fullscreen_enter_description);
        playerControlView2.repeatOffButtonContentDescription = playerControlView2.resources.getString(R.string.exo_controls_repeat_off_description);
        playerControlView2.repeatOneButtonContentDescription = playerControlView2.resources.getString(R.string.exo_controls_repeat_one_description);
        playerControlView2.repeatAllButtonContentDescription = playerControlView2.resources.getString(R.string.exo_controls_repeat_all_description);
        playerControlView2.shuffleOnContentDescription = playerControlView2.resources.getString(R.string.exo_controls_shuffle_on_description);
        playerControlView2.shuffleOffContentDescription = playerControlView2.resources.getString(R.string.exo_controls_shuffle_off_description);
        playerControlView2.controlViewLayoutManager.setShowButton((ViewGroup) playerControlView2.findViewById(R.id.exo_bottom_bar), true);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.fastForwardButton, z5);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.rewindButton, z4);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.previousButton, z6);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.nextButton, z7);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.shuffleButton, z8);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.subtitleButton, z);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.vrButton, z2);
        PlayerControlViewLayoutManager playerControlViewLayoutManager6 = playerControlView2.controlViewLayoutManager;
        ImageView imageView18 = playerControlView2.repeatToggleButton;
        if (playerControlView2.repeatToggleModes != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        playerControlViewLayoutManager6.setShowButton(imageView18, z9);
        playerControlView2.addOnLayoutChangeListener(new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(playerControlView2, 1));
    }
}
