package xyz.doikki.videoplayer.exo;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.TrafficStats;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
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
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.util.SntpClient;
import com.github.tvbox.osc.base.App;
import com.google.common.collect.O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import xyz.doikki.videoplayer.player.AbstractPlayer;
import xyz.doikki.videoplayer.util.PlayerUtils;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class ExoMediaPlayer extends AbstractPlayer implements Player.Listener, AnalyticsListener {
    private static int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    private int errorCode;
    private Map<String, String> headers;
    protected Context mAppContext;
    private boolean mIsPreparing;
    private LoadControl mLoadControl;
    protected ExoPlayer mMediaPlayer;
    protected MediaSource mMediaSource;
    protected ExoMediaSourceHelper mMediaSourceHelper;
    private DefaultRenderersFactory mRenderersFactory;
    private PlaybackParameters mSpeedPlaybackParameters;
    protected TrackSelectionArray mTrackSelections;
    private DefaultTrackSelector mTrackSelector;
    private String path;
    protected ExoTrackNameProvider trackNameProvider;

    public ExoMediaPlayer(Context context) {
        super(context);
        this.errorCode = -100;
        this.mAppContext = context.getApplicationContext();
        this.mMediaSourceHelper = ExoMediaSourceHelper.getInstance(context);
    }

    @OptIn(markerClass = {UnstableApi.class})
    private String audioTrack() {
        Format audioFormat = this.mMediaPlayer.getAudioFormat();
        if (audioFormat == null) {
            return null;
        }
        int i = audioFormat.channelCount;
        if (i == 1) {
            return "单声道";
        }
        if (i == 2) {
            return "立体声";
        }
        if (i == 3) {
            return "2.1 声道";
        }
        if (i == 4) {
            return "4.0 四声道";
        }
        if (i == 5) {
            return "5.0 环绕声";
        }
        if (i == 6) {
            return "5.1环绕声";
        }
        if (i == 7) {
            return "6.1环绕声";
        }
        if (i == 8) {
            return "7.1环绕声";
        }
        return i >= 10 ? "三维菁彩声" : O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "声道");
    }

    private String formatBitrate(long j) {
        if (j >= 1000000) {
            return String.format(Locale.US, "%.2f Mbps", Double.valueOf(j / 1000000.0d));
        }
        if (j >= 1000) {
            return String.format(Locale.US, "%.0f Kbps", Double.valueOf(j / 1000.0d));
        }
        return j + " bps";
    }

    @OptIn(markerClass = {UnstableApi.class})
    private int fps() {
        Format videoFormat = this.mMediaPlayer.getVideoFormat();
        if (videoFormat == null) {
            return 0;
        }
        float f = videoFormat.frameRate;
        if (f != -1.0d) {
            return (int) f;
        }
        return 0;
    }

    private boolean unsupported() {
        return TrafficStats.getUidRxBytes(App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getApplicationInfo().uid) == -1;
    }

    public DefaultTrackSelector buildTrackSelector() {
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(this.mAppContext);
        DefaultTrackSelector.Parameters.Builder builderBuildUponParameters = defaultTrackSelector.buildUponParameters();
        builderBuildUponParameters.setTrackTypeDisabled(2, false);
        builderBuildUponParameters.setTrackTypeDisabled(1, false);
        builderBuildUponParameters.setTrackTypeDisabled(3, false);
        builderBuildUponParameters.setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        builderBuildUponParameters.setPreferredTextLanguages("zh");
        builderBuildUponParameters.setPreferredTextLanguage(Locale.getDefault().getISO3Language());
        builderBuildUponParameters.setTunnelingEnabled(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0());
        builderBuildUponParameters.setForceHighestSupportedBitrate(true);
        defaultTrackSelector.setParameters(builderBuildUponParameters.build());
        return defaultTrackSelector;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public int getBufferedPercentage() {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer == null) {
            return 0;
        }
        return exoPlayer.getBufferedPercentage();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public long getCurrentPosition() {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer == null) {
            return 0L;
        }
        return exoPlayer.getCurrentPosition();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public long getDuration() {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer == null || exoPlayer.isCurrentMediaItemLive()) {
            return 0L;
        }
        return this.mMediaPlayer.getDuration();
    }

    public String getExoVideoBitrate() {
        int i;
        int i2;
        Format videoFormat = this.mMediaPlayer.getVideoFormat();
        if (videoFormat != null && (i2 = videoFormat.bitrate) > 0) {
            return formatBitrate(i2);
        }
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = this.mMediaPlayer.getCurrentTracks().getGroups().iterator();
        while (it.hasNext()) {
            Tracks.Group group = (Tracks.Group) it.next();
            for (int i3 = 0; i3 < group.length; i3++) {
                if (group.isTrackSelected(i3)) {
                    Format trackFormat = group.getTrackFormat(i3);
                    if (group.getType() == 2 && (i = trackFormat.bitrate) > 0) {
                        return formatBitrate(i);
                    }
                }
            }
        }
        return null;
    }

    public ExoPlayer getMediaPlayer() {
        return this.mMediaPlayer;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public float getSpeed() {
        PlaybackParameters playbackParameters = this.mSpeedPlaybackParameters;
        if (playbackParameters != null) {
            return playbackParameters.speed;
        }
        return 1.0f;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public long getTcpSpeed() {
        return PlayerUtils.getNetSpeed(this.mAppContext);
    }

    public DefaultTrackSelector getTrackSelector() {
        return this.mTrackSelector;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public String getVideoBitrate() {
        return getExoVideoBitrate();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    @SuppressLint({"UnsafeOptInUsageError"})
    public void initPlayer() {
        if (this.mRenderersFactory == null) {
            this.mRenderersFactory = new DefaultRenderersFactory(this.mAppContext);
        }
        int i = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.mRenderersFactory.setEnableDecoderFallback(true);
        if (i == 3) {
            this.mRenderersFactory.setExtensionRendererMode(1);
        } else if (i == 4) {
            this.mRenderersFactory.setExtensionRendererMode(2);
        }
        if (this.mTrackSelector == null) {
            this.mTrackSelector = buildTrackSelector();
        }
        if (this.mLoadControl == null) {
            int i2 = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1491O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
            int i3 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f189O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            if (i3 != -1) {
                i2 = i3;
            }
            if (i2 * 2 >= 50000) {
                i2 = DEFAULT_BUFFER_FOR_PLAYBACK_MS;
            }
            this.mLoadControl = new DefaultLoadControl.Builder().setBufferDurationsMs(50000, 50000, i2, i2 * 2).setBackBuffer(30000, true).build();
        }
        SntpClient.setNtpHost("ntp.aliyun.com");
        this.mMediaPlayer = new ExoPlayer.Builder(this.mAppContext).setLoadControl(this.mLoadControl).setRenderersFactory(this.mRenderersFactory).setTrackSelector(this.mTrackSelector).build();
        setOptions();
        this.mMediaPlayer.addListener(this);
        this.mMediaPlayer.addAnalyticsListener(this);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public boolean isAudio() {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        return (exoPlayer != null && exoPlayer.isCommandAvailable(30) && this.mMediaPlayer.getCurrentTracks().isTypeSelected(2)) ? false : true;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public boolean isPlaying() {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer == null) {
            return false;
        }
        int playbackState = exoPlayer.getPlaybackState();
        if (playbackState == 2 || playbackState == 3) {
            return this.mMediaPlayer.getPlayWhenReady();
        }
        return false;
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, audioAttributes);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, eventTime, exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, eventTime, str, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, eventTime, str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, eventTime, decoderCounters);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, eventTime, decoderCounters);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, eventTime, format, decoderReuseEvaluation);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, eventTime, j);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAudioSessionIdChanged(int i) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, eventTime, exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioTrackInitialized(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, eventTime, audioTrackConfig);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioTrackReleased(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this, eventTime, audioTrackConfig);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this, eventTime, i, j, j2);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, commands);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this, eventTime, i, j, j2);
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

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, eventTime, mediaLoadData);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(this, eventTime, exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(this, eventTime, i, j);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onEvents(Player player, Player.Events events) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, player, events);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this, eventTime, z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(this, eventTime, z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(this, eventTime, loadEventInfo, mediaLoadData);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(this, eventTime, loadEventInfo, mediaLoadData);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(this, eventTime, loadEventInfo, mediaLoadData, iOException, z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(this, eventTime, loadEventInfo, mediaLoadData);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(this, eventTime, z);
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

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo(this, eventTime, z, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this, playbackParameters);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(this, eventTime, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(this, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(this, eventTime, playbackException);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, playbackException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO(this, eventTime, z, i);
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

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onRendererReadyChanged(AnalyticsListener.EventTime eventTime, int i, int i2, boolean z) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00(this, eventTime, i, i2, z);
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

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0(this, eventTime, z);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(this, z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo(this, eventTime, z);
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

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO(this, eventTime, tracks);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo(this, eventTime, mediaLoadData);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o(this, eventTime, exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO(this, eventTime, str, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O(this, eventTime, str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO(this, eventTime, decoderCounters);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO(this, eventTime, decoderCounters);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo(this, eventTime, j, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoInputFormatChanged(@NonNull AnalyticsListener.EventTime eventTime, @NonNull Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        AbstractPlayer.PlayerEventListener playerEventListener = this.mPlayerEventListener;
        if (playerEventListener != null) {
            playerEventListener.onVideoSizeChanged(format.width, format.height);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO(this, eventTime, i, i2, i3, f);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onVolumeChanged(float f) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(this, f);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void pause() {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer == null) {
            return;
        }
        exoPlayer.setPlayWhenReady(false);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    @SuppressLint({"UnsafeOptInUsageError"})
    public void prepareAsync() {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer == null || this.mMediaSource == null) {
            return;
        }
        PlaybackParameters playbackParameters = this.mSpeedPlaybackParameters;
        if (playbackParameters != null) {
            exoPlayer.setPlaybackParameters(playbackParameters);
        }
        this.mIsPreparing = true;
        this.mMediaPlayer.setMediaSource(this.mMediaSource);
        this.mMediaPlayer.prepare();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void release() {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer != null) {
            exoPlayer.removeListener(this);
            this.mMediaPlayer.removeAnalyticsListener(this);
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
        }
        this.mIsPreparing = false;
        this.mSpeedPlaybackParameters = null;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void reset() {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer != null) {
            exoPlayer.stop();
            this.mMediaPlayer.clearMediaItems();
            this.mMediaPlayer.setVideoSurface(null);
            this.mIsPreparing = false;
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void seekTo(long j) {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer == null) {
            return;
        }
        exoPlayer.seekTo(j);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            setSurface(null);
        } else {
            setSurface(surfaceHolder.getSurface());
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setLooping(boolean z) {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer != null) {
            exoPlayer.setRepeatMode(z ? 2 : 0);
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setOptions() {
        this.mMediaPlayer.setPlayWhenReady(true);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setSpeed(float f) {
        PlaybackParameters playbackParameters = new PlaybackParameters(f);
        this.mSpeedPlaybackParameters = playbackParameters;
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer != null) {
            exoPlayer.setPlaybackParameters(playbackParameters);
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setSurface(Surface surface) {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer != null) {
            exoPlayer.setVideoSurface(surface);
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setVolume(float f, float f2) {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer != null) {
            exoPlayer.setVolume((f + f2) / 2.0f);
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void start() {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer == null) {
            return;
        }
        exoPlayer.setPlayWhenReady(true);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void stop() {
        ExoPlayer exoPlayer = this.mMediaPlayer;
        if (exoPlayer == null) {
            return;
        }
        exoPlayer.stop();
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, eventTime, audioAttributes);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, eventTime, str, j, j2);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, eventTime, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAvailableCommandsChanged(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this, eventTime, commands);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onCues(AnalyticsListener.EventTime eventTime, CueGroup cueGroup) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this, eventTime, cueGroup);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDeviceInfoChanged(AnalyticsListener.EventTime eventTime, DeviceInfo deviceInfo) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(this, eventTime, deviceInfo);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDeviceVolumeChanged(AnalyticsListener.EventTime eventTime, int i, boolean z) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(this, eventTime, i, z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(this, eventTime, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onEvents(Player player, AnalyticsListener.Events events) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(this, player, events);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onIsLoadingChanged(boolean z) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, z);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onIsPlayingChanged(boolean z) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(this, eventTime, loadEventInfo, mediaLoadData, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onLoadingChanged(boolean z) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(this, eventTime, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0(this, eventTime, mediaItem, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0(this, eventTime, mediaMetadata);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(this, eventTime, metadata);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this, z, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(this, eventTime, playbackParameters);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaybackStateChanged(int i) {
        AbstractPlayer.PlayerEventListener playerEventListener = this.mPlayerEventListener;
        if (playerEventListener == null) {
            return;
        }
        if (this.mIsPreparing) {
            if (i == 3) {
                playerEventListener.onPrepared();
                this.mPlayerEventListener.onInfo(3, 0);
                this.mIsPreparing = false;
                return;
            }
            return;
        }
        if (i == 2) {
            playerEventListener.onInfo(701, getBufferedPercentage());
        } else if (i == 3) {
            playerEventListener.onInfo(702, getBufferedPercentage());
        } else {
            if (i != 4) {
                return;
            }
            playerEventListener.onCompletion();
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00(this, eventTime, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerError(@NonNull PlaybackException playbackException) {
        this.errorCode = playbackException.errorCode;
        Log.e("tag--", "" + playbackException.errorCode);
        String str = this.path;
        if (str == null) {
            AbstractPlayer.PlayerEventListener playerEventListener = this.mPlayerEventListener;
            if (playerEventListener != null) {
                playerEventListener.onError();
                return;
            }
            return;
        }
        this.mMediaSource = this.mMediaSourceHelper.getMediaSource(str, this.headers, false, this.errorCode);
        this.path = null;
        prepareAsync();
        start();
        Log.e("tag--", "重新播放");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerErrorChanged(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0(this, eventTime, playbackException);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this, z, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaylistMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo(this, eventTime, mediaMetadata);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(this, positionInfo, positionInfo2, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00(this, eventTime, obj, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo(this, eventTime, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekBackIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo(this, eventTime, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekForwardIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000(this, eventTime, j);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this, z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo(this, eventTime, i, i2);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO(this, eventTime, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onTrackSelectionParametersChanged(AnalyticsListener.EventTime eventTime, TrackSelectionParameters trackSelectionParameters) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo(this, eventTime, trackSelectionParameters);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTracksChanged(Tracks tracks) {
        if (this.trackNameProvider == null) {
            this.trackNameProvider = new ExoTrackNameProvider(this.mAppContext.getResources());
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO(this, eventTime, str, j, j2);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO(this, eventTime, videoSize);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo(this, eventTime, f);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setDataSource(String str, Map<String, String> map) {
        this.path = str;
        this.headers = map;
        this.mMediaSource = this.mMediaSourceHelper.getMediaSource(str, map);
        this.errorCode = -1;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onCues(AnalyticsListener.EventTime eventTime, List list) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this, eventTime, list);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo(this, eventTime, i);
    }

    public void onVideoSizeChanged(@NonNull VideoSize videoSize) {
        AbstractPlayer.PlayerEventListener playerEventListener = this.mPlayerEventListener;
        if (playerEventListener != null) {
            playerEventListener.onVideoSizeChanged(videoSize.width, videoSize.height);
            int i = videoSize.unappliedRotationDegrees;
            if (i > 0) {
                this.mPlayerEventListener.onInfo(10001, i);
            }
            this.mPlayerEventListener.onFps(fps());
            this.mPlayerEventListener.onAudioTrack(audioTrack());
        }
    }

    public /* synthetic */ void onCues(List list) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, list);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo(this, eventTime, positionInfo, positionInfo2, i);
    }
}
