package androidx.media3.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.PowerManager;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class WearUnsuitableOutputPlaybackSuppressionResolverListener implements Player.Listener {
    public static final long DEFAULT_PLAYBACK_SUPPRESSION_AUTO_RESUME_TIMEOUT_MS = TimeUnit.MINUTES.toMillis(5);
    private static final String EXTRA_BLUETOOTH_SETTINGS_CLOSE_ON_CONNECT = "EXTRA_CLOSE_ON_CONNECT";
    private static final String EXTRA_BLUETOOTH_SETTINGS_CONNECTION_ONLY = "EXTRA_CONNECTION_ONLY";
    private static final String EXTRA_BLUETOOTH_SETTINGS_FILTER_TYPE = "android.bluetooth.devicepicker.extra.FILTER_TYPE";
    private static final String EXTRA_OUTPUT_SWITCHER_PACKAGE_NAME = "com.android.settings.panel.extra.PACKAGE_NAME";
    private static final int FILTER_TYPE_AUDIO = 1;
    private static final String OUTPUT_SWITCHER_INTENT_ACTION_NAME = "com.android.settings.panel.action.MEDIA_OUTPUT";
    private static final String WAKE_LOCK_TAG = "WearUnsuitableOutputPlaybackSuppressionResolverListener:WakeLock";
    private final Context applicationContext;
    private final long autoResumeTimeoutAfterUnsuitableOutputSuppressionMs;
    private final Clock clock;
    private long unsuitableOutputPlaybackSuppressionStartRealtimeMs;

    @Nullable
    private final PowerManager.WakeLock wakeLock;

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context) {
        this(context, DEFAULT_PLAYBACK_SUPPRESSION_AUTO_RESUME_TIMEOUT_MS);
    }

    @Nullable
    private static ComponentName getSystemOrSystemUpdatedAppComponent(Context context, Intent intent) {
        ApplicationInfo applicationInfo;
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                return new ComponentName(activityInfo.packageName, activityInfo.name);
            }
        }
        return null;
    }

    private static void launchSystemMediaOutputSwitcherUi(Context context) {
        Intent intentPutExtra = new Intent(OUTPUT_SWITCHER_INTENT_ACTION_NAME).addFlags(268435456).putExtra(EXTRA_OUTPUT_SWITCHER_PACKAGE_NAME, context.getPackageName());
        ComponentName systemOrSystemUpdatedAppComponent = getSystemOrSystemUpdatedAppComponent(context, intentPutExtra);
        if (systemOrSystemUpdatedAppComponent != null) {
            intentPutExtra.setComponent(systemOrSystemUpdatedAppComponent);
            context.startActivity(intentPutExtra);
            return;
        }
        Intent intentPutExtra2 = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra(EXTRA_BLUETOOTH_SETTINGS_CLOSE_ON_CONNECT, true).putExtra(EXTRA_BLUETOOTH_SETTINGS_CONNECTION_ONLY, true).putExtra(EXTRA_BLUETOOTH_SETTINGS_FILTER_TYPE, 1);
        ComponentName systemOrSystemUpdatedAppComponent2 = getSystemOrSystemUpdatedAppComponent(context, intentPutExtra2);
        if (systemOrSystemUpdatedAppComponent2 != null) {
            intentPutExtra2.setComponent(systemOrSystemUpdatedAppComponent2);
            context.startActivity(intentPutExtra2);
        }
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

    @Override // androidx.media3.common.Player.Listener
    public void onEvents(Player player, Player.Events events) {
        if (Util.isWear(this.applicationContext)) {
            if ((events.contains(6) || events.contains(5)) && player.getPlayWhenReady() && player.getPlaybackSuppressionReason() == 3) {
                player.pause();
                this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = this.clock.elapsedRealtime();
                PowerManager.WakeLock wakeLock = this.wakeLock;
                if (wakeLock != null && !wakeLock.isHeld()) {
                    this.wakeLock.acquire(this.autoResumeTimeoutAfterUnsuitableOutputSuppressionMs);
                }
                if (events.contains(5)) {
                    launchSystemMediaOutputSwitcherUi(this.applicationContext);
                    return;
                }
                return;
            }
            if (!events.contains(6) || player.getPlaybackSuppressionReason() != 0 || this.unsuitableOutputPlaybackSuppressionStartRealtimeMs == C.TIME_UNSET || this.clock.elapsedRealtime() - this.unsuitableOutputPlaybackSuppressionStartRealtimeMs >= this.autoResumeTimeoutAfterUnsuitableOutputSuppressionMs) {
                return;
            }
            this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = C.TIME_UNSET;
            player.play();
            PowerManager.WakeLock wakeLock2 = this.wakeLock;
            if (wakeLock2 != null) {
                wakeLock2.release();
            }
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

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context, @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) long j) {
        this(context, j, Clock.DEFAULT);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onCues(List list) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, list);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(this, positionInfo, positionInfo2, i);
    }

    @VisibleForTesting
    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context, @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) long j, Clock clock) {
        PowerManager.WakeLock wakeLockNewWakeLock;
        Assertions.checkArgument(j >= 0);
        Context applicationContext = context.getApplicationContext();
        this.applicationContext = applicationContext;
        this.autoResumeTimeoutAfterUnsuitableOutputSuppressionMs = j;
        this.clock = clock;
        this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = C.TIME_UNSET;
        PowerManager powerManager = (PowerManager) applicationContext.getSystemService("power");
        if (powerManager != null) {
            wakeLockNewWakeLock = powerManager.newWakeLock(1, WAKE_LOCK_TAG);
            wakeLockNewWakeLock.setReferenceCounted(false);
        } else {
            wakeLockNewWakeLock = null;
        }
        this.wakeLock = wakeLockNewWakeLock;
    }
}
