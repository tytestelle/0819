package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
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
import androidx.media3.common.util.NotificationUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "androidx.media3.ui.notification.dismiss";
    public static final String ACTION_FAST_FORWARD = "androidx.media3.ui.notification.ffwd";
    public static final String ACTION_NEXT = "androidx.media3.ui.notification.next";
    public static final String ACTION_PAUSE = "androidx.media3.ui.notification.pause";
    public static final String ACTION_PLAY = "androidx.media3.ui.notification.play";
    public static final String ACTION_PREVIOUS = "androidx.media3.ui.notification.prev";
    public static final String ACTION_REWIND = "androidx.media3.ui.notification.rewind";
    public static final String ACTION_STOP = "androidx.media3.ui.notification.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 1;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 2;
    private static int instanceIdCounter;
    private int badgeIconType;

    @Nullable
    private NotificationCompat.Builder builder;

    @Nullable
    private List<NotificationCompat.Action> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private int currentNotificationTag;

    @Nullable
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, NotificationCompat.Action> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;

    @Nullable
    private String groupKey;
    private final int instanceId;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;

    @Nullable
    private MediaSession.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;

    @Nullable
    private final NotificationListener notificationListener;
    private final NotificationManagerCompat notificationManager;
    private final Map<String, NotificationCompat.Action> playbackActions;

    @Nullable
    private Player player;
    private final Player.Listener playerListener;
    private int priority;
    private boolean showPlayButtonIfSuppressed;

    @DrawableRes
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useFastForwardAction;
    private boolean useFastForwardActionInCompactView;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useRewindAction;
    private boolean useRewindActionInCompactView;
    private boolean useStopAction;
    private int visibility;

    public final class BitmapCallback {
        private final int notificationTag;

        public void onBitmap(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }

        private BitmapCallback(int i) {
            this.notificationTag = i;
        }
    }

    public interface CustomActionReceiver {
        Map<String, NotificationCompat.Action> createCustomActions(Context context, int i);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    public interface MediaDescriptionAdapter {
        @Nullable
        PendingIntent createCurrentContentIntent(Player player);

        @Nullable
        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        @Nullable
        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        @Nullable
        CharSequence getCurrentSubText(Player player);
    }

    public static final class MediaStyle extends NotificationCompat.Style {
        private final int[] actionsToShowInCompact;

        @Nullable
        private final MediaSession.Token token;

        public MediaStyle(@Nullable MediaSession.Token token, int[] iArr) {
            this.token = token;
            this.actionsToShowInCompact = iArr;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            mediaStyle.setShowActionsInCompactView(this.actionsToShowInCompact);
            MediaSession.Token token = this.token;
            if (token != null) {
                mediaStyle.setMediaSession(token);
            }
            notificationBuilderWithBuilderAccessor.getBuilder().setStyle(mediaStyle);
        }
    }

    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.player;
            if (player != null && PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, PlayerNotificationManager.this.instanceId) == PlayerNotificationManager.this.instanceId) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    Util.handlePlayButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    Util.handlePauseButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    if (player.isCommandAvailable(7)) {
                        player.seekToPrevious();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    if (player.isCommandAvailable(11)) {
                        player.seekBack();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    if (player.isCommandAvailable(12)) {
                        player.seekForward();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    if (player.isCommandAvailable(9)) {
                        player.seekToNext();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    if (player.isCommandAvailable(3)) {
                        player.stop();
                    }
                    if (player.isCommandAvailable(20)) {
                        player.clearMediaItems();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    PlayerNotificationManager.this.stopNotification(true);
                } else {
                    if (action == null || PlayerNotificationManager.this.customActionReceiver == null || !PlayerNotificationManager.this.customActions.containsKey(action)) {
                        return;
                    }
                    PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
                }
            }
        }
    }

    public interface NotificationListener {
        void onNotificationCancelled(int i, boolean z);

        void onNotificationPosted(int i, Notification notification, boolean z);
    }

    public class PlayerListener implements Player.Listener {
        private PlayerListener() {
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
            if (events.containsAny(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                PlayerNotificationManager.this.postStartOrUpdateNotification();
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

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onCues(List list) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, list);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(this, positionInfo, positionInfo2, i);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    public PlayerNotificationManager(Context context, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter, @Nullable NotificationListener notificationListener, @Nullable CustomActionReceiver customActionReceiver, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @Nullable String str2) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.channelId = str;
        this.notificationId = i;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        this.notificationListener = notificationListener;
        this.customActionReceiver = customActionReceiver;
        this.smallIconResourceId = i2;
        this.groupKey = str2;
        int i10 = instanceIdCounter;
        instanceIdCounter = i10 + 1;
        this.instanceId = i10;
        this.mainHandler = Util.createHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: androidx.media3.ui.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f2764O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.handleMessage(message);
            }
        });
        this.notificationManager = NotificationManagerCompat.from(applicationContext);
        this.playerListener = new PlayerListener();
        this.notificationBroadcastReceiver = new NotificationBroadcastReceiver();
        this.intentFilter = new IntentFilter();
        this.usePreviousAction = true;
        this.useNextAction = true;
        this.usePlayPauseActions = true;
        this.showPlayButtonIfSuppressed = true;
        this.useRewindAction = true;
        this.useFastForwardAction = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.defaults = 0;
        this.priority = -1;
        this.badgeIconType = 1;
        this.visibility = 1;
        Map<String, NotificationCompat.Action> mapCreatePlaybackActions = createPlaybackActions(applicationContext, i10, i3, i4, i5, i6, i7, i8, i9);
        this.playbackActions = mapCreatePlaybackActions;
        Iterator<String> it = mapCreatePlaybackActions.keySet().iterator();
        while (it.hasNext()) {
            this.intentFilter.addAction(it.next());
        }
        Map<String, NotificationCompat.Action> mapCreateCustomActions = customActionReceiver != null ? customActionReceiver.createCustomActions(applicationContext, this.instanceId) : Collections.emptyMap();
        this.customActions = mapCreateCustomActions;
        Iterator<String> it2 = mapCreateCustomActions.keySet().iterator();
        while (it2.hasNext()) {
            this.intentFilter.addAction(it2.next());
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }

    private static PendingIntent createBroadcastIntent(String str, Context context, int i) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i);
        return PendingIntent.getBroadcast(context, i, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    private static Map<String, NotificationCompat.Action> createPlaybackActions(Context context, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HashMap map = new HashMap();
        map.put(ACTION_PLAY, new NotificationCompat.Action(i2, context.getString(R.string.exo_controls_play_description), createBroadcastIntent(ACTION_PLAY, context, i)));
        map.put(ACTION_PAUSE, new NotificationCompat.Action(i3, context.getString(R.string.exo_controls_pause_description), createBroadcastIntent(ACTION_PAUSE, context, i)));
        map.put(ACTION_STOP, new NotificationCompat.Action(i4, context.getString(R.string.exo_controls_stop_description), createBroadcastIntent(ACTION_STOP, context, i)));
        map.put(ACTION_REWIND, new NotificationCompat.Action(i5, context.getString(R.string.exo_controls_rewind_description), createBroadcastIntent(ACTION_REWIND, context, i)));
        map.put(ACTION_FAST_FORWARD, new NotificationCompat.Action(i6, context.getString(R.string.exo_controls_fastforward_description), createBroadcastIntent(ACTION_FAST_FORWARD, context, i)));
        map.put(ACTION_PREVIOUS, new NotificationCompat.Action(i7, context.getString(R.string.exo_controls_previous_description), createBroadcastIntent(ACTION_PREVIOUS, context, i)));
        map.put(ACTION_NEXT, new NotificationCompat.Action(i8, context.getString(R.string.exo_controls_next_description), createBroadcastIntent(ACTION_NEXT, context, i)));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Player player = this.player;
            if (player != null) {
                startOrUpdateNotification(player, null);
            }
        } else {
            if (i != 2) {
                return false;
            }
            Player player2 = this.player;
            if (player2 != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(player2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postStartOrUpdateNotification() {
        if (this.mainHandler.hasMessages(1)) {
            return;
        }
        this.mainHandler.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postUpdateNotificationBitmap(Bitmap bitmap, int i) {
        this.mainHandler.obtainMessage(2, i, -1, bitmap).sendToTarget();
    }

    private static void setLargeIcon(NotificationCompat.Builder builder, @Nullable Bitmap bitmap) {
        builder.setLargeIcon(bitmap);
    }

    @SuppressLint({"MissingPermission"})
    private void startOrUpdateNotification(Player player, @Nullable Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        NotificationCompat.Builder builderCreateNotification = createNotification(player, this.builder, ongoing, bitmap);
        this.builder = builderCreateNotification;
        if (builderCreateNotification == null) {
            stopNotification(false);
            return;
        }
        Notification notificationBuild = builderCreateNotification.build();
        this.notificationManager.notify(this.notificationId, notificationBuild);
        if (!this.isNotificationStarted) {
            Util.registerReceiverNotExported(this.context, this.notificationBroadcastReceiver, this.intentFilter);
        }
        NotificationListener notificationListener = this.notificationListener;
        if (notificationListener != null) {
            notificationListener.onNotificationPosted(this.notificationId, notificationBuild, ongoing || !this.isNotificationStarted);
        }
        this.isNotificationStarted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotification(boolean z) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(1);
            this.notificationManager.cancel(this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId, z);
            }
        }
    }

    @Nullable
    public NotificationCompat.Builder createNotification(Player player, @Nullable NotificationCompat.Builder builder, boolean z, @Nullable Bitmap bitmap) {
        if (player.getPlaybackState() == 1 && player.isCommandAvailable(17) && player.getCurrentTimeline().isEmpty()) {
            this.builderActions = null;
            return null;
        }
        List<String> actions = getActions(player);
        ArrayList arrayList = new ArrayList(actions.size());
        for (int i = 0; i < actions.size(); i++) {
            String str = actions.get(i);
            NotificationCompat.Action action = this.playbackActions.containsKey(str) ? this.playbackActions.get(str) : this.customActions.get(str);
            if (action != null) {
                arrayList.add(action);
            }
        }
        if (builder == null || !arrayList.equals(this.builderActions)) {
            builder = new NotificationCompat.Builder(this.context, this.channelId);
            this.builderActions = arrayList;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                builder.addAction((NotificationCompat.Action) arrayList.get(i2));
            }
        }
        builder.setStyle(new MediaStyle(this.mediaSessionToken, getActionIndicesForCompactView(actions, player)));
        builder.setDeleteIntent(this.dismissPendingIntent);
        builder.setBadgeIconType(this.badgeIconType).setOngoing(z).setColor(this.color).setColorized(this.colorized).setSmallIcon(this.smallIconResourceId).setVisibility(this.visibility).setPriority(this.priority).setDefaults(this.defaults);
        if (this.useChronometer && player.isCommandAvailable(16) && player.isPlaying() && !player.isPlayingAd() && !player.isCurrentMediaItemDynamic() && player.getPlaybackParameters().speed == 1.0f) {
            builder.setWhen(System.currentTimeMillis() - player.getContentPosition()).setShowWhen(true).setUsesChronometer(true);
        } else {
            builder.setShowWhen(false).setUsesChronometer(false);
        }
        builder.setContentTitle(this.mediaDescriptionAdapter.getCurrentContentTitle(player));
        builder.setContentText(this.mediaDescriptionAdapter.getCurrentContentText(player));
        builder.setSubText(this.mediaDescriptionAdapter.getCurrentSubText(player));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i3 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i3;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i3));
        }
        setLargeIcon(builder, bitmap);
        builder.setContentIntent(this.mediaDescriptionAdapter.createCurrentContentIntent(player));
        String str2 = this.groupKey;
        if (str2 != null) {
            builder.setGroup(str2);
        }
        builder.setOnlyAlertOnce(true);
        return builder;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    public int[] getActionIndicesForCompactView(List<String> list, Player player) {
        int iIndexOf;
        int iIndexOf2;
        int i;
        int iIndexOf3 = list.indexOf(ACTION_PAUSE);
        int iIndexOf4 = list.indexOf(ACTION_PLAY);
        if (this.usePreviousActionInCompactView) {
            iIndexOf = list.indexOf(ACTION_PREVIOUS);
        } else {
            iIndexOf = this.useRewindActionInCompactView ? list.indexOf(ACTION_REWIND) : -1;
        }
        if (this.useNextActionInCompactView) {
            iIndexOf2 = list.indexOf(ACTION_NEXT);
        } else {
            iIndexOf2 = this.useFastForwardActionInCompactView ? list.indexOf(ACTION_FAST_FORWARD) : -1;
        }
        int[] iArr = new int[3];
        int i2 = 0;
        if (iIndexOf != -1) {
            iArr[0] = iIndexOf;
            i2 = 1;
        }
        boolean zShouldShowPlayButton = Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed);
        if (iIndexOf3 == -1 || zShouldShowPlayButton) {
            if (iIndexOf4 != -1 && zShouldShowPlayButton) {
                i = i2 + 1;
                iArr[i2] = iIndexOf4;
            }
            if (iIndexOf2 != -1) {
                iArr[i2] = iIndexOf2;
                i2++;
            }
            return Arrays.copyOf(iArr, i2);
        }
        i = i2 + 1;
        iArr[i2] = iIndexOf3;
        i2 = i;
        if (iIndexOf2 != -1) {
            iArr[i2] = iIndexOf2;
            i2++;
        }
        return Arrays.copyOf(iArr, i2);
    }

    public List<String> getActions(Player player) {
        boolean zIsCommandAvailable = player.isCommandAvailable(7);
        boolean zIsCommandAvailable2 = player.isCommandAvailable(11);
        boolean zIsCommandAvailable3 = player.isCommandAvailable(12);
        boolean zIsCommandAvailable4 = player.isCommandAvailable(9);
        ArrayList arrayList = new ArrayList();
        if (this.usePreviousAction && zIsCommandAvailable) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (this.useRewindAction && zIsCommandAvailable2) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            if (Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed)) {
                arrayList.add(ACTION_PLAY);
            } else {
                arrayList.add(ACTION_PAUSE);
            }
        }
        if (this.useFastForwardAction && zIsCommandAvailable3) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.useNextAction && zIsCommandAvailable4) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver = this.customActionReceiver;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    public boolean getOngoing(Player player) {
        int playbackState = player.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && player.getPlayWhenReady();
    }

    public final void invalidate() {
        if (this.isNotificationStarted) {
            postStartOrUpdateNotification();
        }
    }

    public final void setBadgeIconType(int i) {
        if (this.badgeIconType == i) {
            return;
        }
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
        this.badgeIconType = i;
        invalidate();
    }

    public final void setColor(int i) {
        if (this.color != i) {
            this.color = i;
            invalidate();
        }
    }

    public final void setColorized(boolean z) {
        if (this.colorized != z) {
            this.colorized = z;
            invalidate();
        }
    }

    public final void setDefaults(int i) {
        if (this.defaults != i) {
            this.defaults = i;
            invalidate();
        }
    }

    public final void setMediaSessionToken(MediaSession.Token token) {
        if (Objects.equals(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        invalidate();
    }

    public final void setPlayer(@Nullable Player player) {
        boolean z = true;
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z = false;
        }
        Assertions.checkArgument(z);
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.playerListener);
            if (player == null) {
                stopNotification(false);
            }
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.playerListener);
            postStartOrUpdateNotification();
        }
    }

    public final void setPriority(int i) {
        if (this.priority == i) {
            return;
        }
        if (i != -2 && i != -1 && i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
        this.priority = i;
        invalidate();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        if (this.showPlayButtonIfSuppressed != z) {
            this.showPlayButtonIfSuppressed = z;
            invalidate();
        }
    }

    public final void setSmallIcon(@DrawableRes int i) {
        if (this.smallIconResourceId != i) {
            this.smallIconResourceId = i;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z) {
        if (this.useChronometer != z) {
            this.useChronometer = z;
            invalidate();
        }
    }

    public final void setUseFastForwardAction(boolean z) {
        if (this.useFastForwardAction != z) {
            this.useFastForwardAction = z;
            invalidate();
        }
    }

    public final void setUseFastForwardActionInCompactView(boolean z) {
        if (this.useFastForwardActionInCompactView != z) {
            this.useFastForwardActionInCompactView = z;
            if (z) {
                this.useNextActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseNextAction(boolean z) {
        if (this.useNextAction != z) {
            this.useNextAction = z;
            invalidate();
        }
    }

    public final void setUseNextActionInCompactView(boolean z) {
        if (this.useNextActionInCompactView != z) {
            this.useNextActionInCompactView = z;
            if (z) {
                this.useFastForwardActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z) {
        if (this.usePlayPauseActions != z) {
            this.usePlayPauseActions = z;
            invalidate();
        }
    }

    public final void setUsePreviousAction(boolean z) {
        if (this.usePreviousAction != z) {
            this.usePreviousAction = z;
            invalidate();
        }
    }

    public final void setUsePreviousActionInCompactView(boolean z) {
        if (this.usePreviousActionInCompactView != z) {
            this.usePreviousActionInCompactView = z;
            if (z) {
                this.useRewindActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseRewindAction(boolean z) {
        if (this.useRewindAction != z) {
            this.useRewindAction = z;
            invalidate();
        }
    }

    public final void setUseRewindActionInCompactView(boolean z) {
        if (this.useRewindActionInCompactView != z) {
            this.useRewindActionInCompactView = z;
            if (z) {
                this.usePreviousActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z) {
        if (this.useStopAction == z) {
            return;
        }
        this.useStopAction = z;
        invalidate();
    }

    public final void setVisibility(int i) {
        if (this.visibility == i) {
            return;
        }
        if (i != -1 && i != 0 && i != 1) {
            throw new IllegalStateException();
        }
        this.visibility = i;
        invalidate();
    }

    public static class Builder {
        protected int channelDescriptionResourceId;
        protected final String channelId;
        protected int channelImportance;
        protected int channelNameResourceId;
        protected final Context context;

        @Nullable
        protected CustomActionReceiver customActionReceiver;
        protected int fastForwardActionIconResourceId;

        @Nullable
        protected String groupKey;
        protected MediaDescriptionAdapter mediaDescriptionAdapter;
        protected int nextActionIconResourceId;
        protected final int notificationId;

        @Nullable
        protected NotificationListener notificationListener;
        protected int pauseActionIconResourceId;
        protected int playActionIconResourceId;
        protected int previousActionIconResourceId;
        protected int rewindActionIconResourceId;
        protected int smallIconResourceId;
        protected int stopActionIconResourceId;

        @Deprecated
        public Builder(Context context, int i, String str, MediaDescriptionAdapter mediaDescriptionAdapter) {
            this(context, i, str);
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        }

        public PlayerNotificationManager build() {
            int i = this.channelNameResourceId;
            if (i != 0) {
                NotificationUtil.createNotificationChannel(this.context, this.channelId, i, this.channelDescriptionResourceId, this.channelImportance);
            }
            return new PlayerNotificationManager(this.context, this.channelId, this.notificationId, this.mediaDescriptionAdapter, this.notificationListener, this.customActionReceiver, this.smallIconResourceId, this.playActionIconResourceId, this.pauseActionIconResourceId, this.stopActionIconResourceId, this.rewindActionIconResourceId, this.fastForwardActionIconResourceId, this.previousActionIconResourceId, this.nextActionIconResourceId, this.groupKey);
        }

        public Builder setChannelDescriptionResourceId(int i) {
            this.channelDescriptionResourceId = i;
            return this;
        }

        public Builder setChannelImportance(int i) {
            this.channelImportance = i;
            return this;
        }

        public Builder setChannelNameResourceId(int i) {
            this.channelNameResourceId = i;
            return this;
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver) {
            this.customActionReceiver = customActionReceiver;
            return this;
        }

        public Builder setFastForwardActionIconResourceId(int i) {
            this.fastForwardActionIconResourceId = i;
            return this;
        }

        public Builder setGroup(String str) {
            this.groupKey = str;
            return this;
        }

        public Builder setMediaDescriptionAdapter(MediaDescriptionAdapter mediaDescriptionAdapter) {
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
            return this;
        }

        public Builder setNextActionIconResourceId(int i) {
            this.nextActionIconResourceId = i;
            return this;
        }

        public Builder setNotificationListener(NotificationListener notificationListener) {
            this.notificationListener = notificationListener;
            return this;
        }

        public Builder setPauseActionIconResourceId(int i) {
            this.pauseActionIconResourceId = i;
            return this;
        }

        public Builder setPlayActionIconResourceId(int i) {
            this.playActionIconResourceId = i;
            return this;
        }

        public Builder setPreviousActionIconResourceId(int i) {
            this.previousActionIconResourceId = i;
            return this;
        }

        public Builder setRewindActionIconResourceId(int i) {
            this.rewindActionIconResourceId = i;
            return this;
        }

        public Builder setSmallIconResourceId(int i) {
            this.smallIconResourceId = i;
            return this;
        }

        public Builder setStopActionIconResourceId(int i) {
            this.stopActionIconResourceId = i;
            return this;
        }

        public Builder(Context context, @IntRange(from = 1) int i, String str) {
            Assertions.checkArgument(i > 0);
            this.context = context;
            this.notificationId = i;
            this.channelId = str;
            this.channelImportance = 2;
            this.mediaDescriptionAdapter = new DefaultMediaDescriptionAdapter(null);
            this.smallIconResourceId = R.drawable.exo_notification_small_icon;
            this.playActionIconResourceId = R.drawable.exo_notification_play;
            this.pauseActionIconResourceId = R.drawable.exo_notification_pause;
            this.stopActionIconResourceId = R.drawable.exo_notification_stop;
            this.rewindActionIconResourceId = R.drawable.exo_notification_rewind;
            this.fastForwardActionIconResourceId = R.drawable.exo_notification_fastforward;
            this.previousActionIconResourceId = R.drawable.exo_notification_previous;
            this.nextActionIconResourceId = R.drawable.exo_notification_next;
        }
    }
}
