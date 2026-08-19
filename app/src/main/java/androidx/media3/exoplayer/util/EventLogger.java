package androidx.media3.exoplayer.util;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
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
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class EventLogger implements AnalyticsListener {
    private static final String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final NumberFormat TIME_FORMAT;
    private final Timeline.Period period;
    private final long startTimeMs;
    private final String tag;
    private final Timeline.Window window;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        TIME_FORMAT = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger() {
        this(DEFAULT_TAG);
    }

    private static String getAudioTrackConfigString(AudioSink.AudioTrackConfig audioTrackConfig) {
        return audioTrackConfig.encoding + "," + audioTrackConfig.channelConfig + "," + audioTrackConfig.sampleRate + "," + audioTrackConfig.tunneling + "," + audioTrackConfig.offload + "," + audioTrackConfig.bufferSize;
    }

    private static String getDiscontinuityReasonString(int i) {
        switch (i) {
            case 0:
                return "AUTO_TRANSITION";
            case 1:
                return "SEEK";
            case 2:
                return "SEEK_ADJUSTMENT";
            case 3:
                return HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP;
            case 4:
                return "REMOVE";
            case 5:
                return "INTERNAL";
            case 6:
                return "SILENCE_SKIP";
            default:
                return "?";
        }
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str, @Nullable String str2, @Nullable Throwable th) {
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(str, " [");
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(getEventTimeString(eventTime));
        String string = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
        if (th instanceof PlaybackException) {
            StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, ", errorCode=");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.append(((PlaybackException) th).getErrorCodeName());
            string = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.toString();
        }
        if (str2 != null) {
            string = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(string, ", ", str2);
        }
        String throwableString = Log.getThrowableString(th);
        if (!TextUtils.isEmpty(throwableString)) {
            StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, "\n  ");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002.append(throwableString.replace("\n", "\n  "));
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002.append('\n');
            string = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002.toString();
        }
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(string, "]");
    }

    private String getEventTimeString(AnalyticsListener.EventTime eventTime) {
        String string = "window=" + eventTime.windowIndex;
        if (eventTime.mediaPeriodId != null) {
            StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, ", period=");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid));
            string = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
            if (eventTime.mediaPeriodId.isAd()) {
                StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, ", adGroup=");
                sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.append(eventTime.mediaPeriodId.adGroupIndex);
                StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.toString(), ", ad=");
                sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002.append(eventTime.mediaPeriodId.adIndexInAdGroup);
                string = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002.toString();
            }
        }
        return "eventTime=" + getTimeString(eventTime.realtimeMs - this.startTimeMs) + ", mediaPos=" + getTimeString(eventTime.eventPlaybackPositionMs) + ", " + string;
    }

    private static String getMediaItemTransitionReasonString(int i) {
        if (i == 0) {
            return "REPEAT";
        }
        if (i == 1) {
            return "AUTO";
        }
        if (i != 2) {
            return i != 3 ? "?" : "PLAYLIST_CHANGED";
        }
        return "SEEK";
    }

    private static String getPlayWhenReadyChangeReasonString(int i) {
        if (i == 1) {
            return "USER_REQUEST";
        }
        if (i == 2) {
            return "AUDIO_FOCUS_LOSS";
        }
        if (i == 3) {
            return "AUDIO_BECOMING_NOISY";
        }
        if (i != 4) {
            return i != 5 ? "?" : "END_OF_MEDIA_ITEM";
        }
        return "REMOTE";
    }

    private static String getPlaybackSuppressionReasonString(int i) {
        if (i == 0) {
            return "NONE";
        }
        if (i == 1) {
            return "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        if (i != 3) {
            return i != 4 ? "?" : "SCRUBBING";
        }
        return "UNSUITABLE_AUDIO_OUTPUT";
    }

    private static String getRepeatModeString(int i) {
        if (i == 0) {
            return "OFF";
        }
        if (i != 1) {
            return i != 2 ? "?" : "ALL";
        }
        return "ONE";
    }

    private static String getStateString(int i) {
        if (i == 1) {
            return "IDLE";
        }
        if (i == 2) {
            return "BUFFERING";
        }
        if (i != 3) {
            return i != 4 ? "?" : "ENDED";
        }
        return "READY";
    }

    private static String getTimeString(long j) {
        return j == C.TIME_UNSET ? "?" : TIME_FORMAT.format(j / 1000.0f);
    }

    private static String getTimelineChangeReasonString(int i) {
        if (i != 0) {
            return i != 1 ? "?" : "SOURCE_UPDATE";
        }
        return "PLAYLIST_CHANGED";
    }

    private static String getTrackStatusString(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    private void printInternalError(AnalyticsListener.EventTime eventTime, String str, Exception exc) {
        loge(eventTime, "internalError", str, exc);
    }

    private void printMetadata(Metadata metadata, String str) {
        for (int i = 0; i < metadata.length(); i++) {
            StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(str);
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(metadata.get(i));
            logd(sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString());
        }
    }

    @UnstableApi
    public void logd(String str) {
        Log.d(this.tag, str);
    }

    @UnstableApi
    public void loge(String str) {
        Log.e(this.tag, str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        logd(eventTime, "audioAttributes", audioAttributes.contentType + "," + audioAttributes.flags + "," + audioAttributes.usage + "," + audioAttributes.allowedCapturePolicy);
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
    @UnstableApi
    public void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "audioDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "audioInputFormat", Format.toLogString(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j) {
        logd(eventTime, "audioPositionAdvancing", "since " + getTimeString((SystemClock.elapsedRealtime() + (j - System.currentTimeMillis())) - this.startTimeMs));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "audioSessionId", Integer.toString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, eventTime, exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioTrackInitialized(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        logd(eventTime, "audioTrackInit", getAudioTrackConfigString(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioTrackReleased(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        logd(eventTime, "audioTrackReleased", getAudioTrackConfigString(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        loge(eventTime, "audioTrackUnderrun", i + ", " + j + ", " + j2, null);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAvailableCommandsChanged(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this, eventTime, commands);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this, eventTime, i, j, j2);
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
    @UnstableApi
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "downstreamFormat", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysLoaded");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRemoved");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRestored");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        printInternalError(eventTime, "drmSessionManagerError", exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmSessionReleased");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
        logd(eventTime, "droppedFrames", Integer.toString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onEvents(Player player, AnalyticsListener.Events events) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(this, player, events);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "loading", Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "isPlaying", Boolean.toString(z));
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
    @UnstableApi
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        printInternalError(eventTime, "loadError", iOException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(this, eventTime, loadEventInfo, mediaLoadData);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(this, eventTime, z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(this, eventTime, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onMediaItemTransition(AnalyticsListener.EventTime eventTime, @Nullable MediaItem mediaItem, int i) {
        logd("mediaItem [" + getEventTimeString(eventTime) + ", reason=" + getMediaItemTransitionReasonString(i) + "]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0(this, eventTime, mediaMetadata);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        logd("metadata [" + getEventTimeString(eventTime));
        printMetadata(metadata, "  ");
        logd("]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        logd(eventTime, "playWhenReady", z + ", " + getPlayWhenReadyChangeReasonString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        logd(eventTime, "playbackParameters", playbackParameters.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "state", getStateString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        loge(eventTime, "playerFailed", playbackException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerErrorChanged(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0(this, eventTime, playbackException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO(this, eventTime, z, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaylistMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo(this, eventTime, mediaMetadata);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo(this, eventTime, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        logd(eventTime, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onRendererReadyChanged(AnalyticsListener.EventTime eventTime, int i, int i2, boolean z) {
        StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "rendererIndex=", ", ");
        sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(Util.getTrackTypeString(i2));
        sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(", ");
        sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(z);
        logd(eventTime, "rendererReady", sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "repeatMode", getRepeatModeString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekBackIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo(this, eventTime, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekForwardIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000(this, eventTime, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
        logd(eventTime, "surfaceSize", "w=" + i + ", h=" + i2);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        logd("timeline [" + getEventTimeString(eventTime) + ", periodCount=" + periodCount + ", windowCount=" + windowCount + ", reason=" + getTimelineChangeReasonString(i));
        for (int i2 = 0; i2 < Math.min(periodCount, 3); i2++) {
            eventTime.timeline.getPeriod(i2, this.period);
            logd("  period [" + getTimeString(this.period.getDurationMs()) + "]");
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i3 = 0; i3 < Math.min(windowCount, 3); i3++) {
            eventTime.timeline.getWindow(i3, this.window);
            logd("  window [" + getTimeString(this.window.getDurationMs()) + ", seekable=" + this.window.isSeekable + ", dynamic=" + this.window.isDynamic + "]");
        }
        if (windowCount > 3) {
            logd("  ...");
        }
        logd("]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onTrackSelectionParametersChanged(AnalyticsListener.EventTime eventTime, TrackSelectionParameters trackSelectionParameters) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo(this, eventTime, trackSelectionParameters);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
        Metadata metadata;
        logd("tracks [" + getEventTimeString(eventTime));
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O groups = tracks.getGroups();
        for (int i = 0; i < groups.size(); i++) {
            Tracks.Group group = (Tracks.Group) groups.get(i);
            logd("  group [ id=" + group.getMediaTrackGroup().id);
            for (int i2 = 0; i2 < group.length; i2++) {
                logd("    " + getTrackStatusString(group.isTrackSelected(i2)) + " Track:" + i2 + ", " + Format.toLogString(group.getTrackFormat(i2)) + ", supported=" + Util.getFormatSupportString(group.getTrackSupport(i2)));
            }
            logd("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < groups.size(); i3++) {
            Tracks.Group group2 = (Tracks.Group) groups.get(i3);
            for (int i4 = 0; !z && i4 < group2.length; i4++) {
                if (group2.isTrackSelected(i4) && (metadata = group2.getTrackFormat(i4).metadata) != null && metadata.length() > 0) {
                    logd("  Metadata [");
                    printMetadata(metadata, "    ");
                    logd("  ]");
                    z = true;
                }
            }
        }
        logd("]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "upstreamDiscarded", Format.toLogString(mediaLoadData.trackFormat));
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
    @UnstableApi
    public void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "videoDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo(this, eventTime, j, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "videoInputFormat", Format.toLogString(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO(this, eventTime, i, i2, i3, f);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
        logd(eventTime, "volume", Float.toString(f));
    }

    public EventLogger(String str) {
        this.tag = str;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.startTimeMs = SystemClock.elapsedRealtime();
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str) {
        logd(getEventString(eventTime, str, null, null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, @Nullable Throwable th) {
        loge(getEventString(eventTime, str, null, th));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        logd(eventTime, "audioDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onCues(AnalyticsListener.EventTime eventTime, List list) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this, eventTime, list);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "drmSessionAcquired", O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "state="));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        androidx.media3.exoplayer.analytics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(this, eventTime, loadEventInfo, mediaLoadData, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        logd(eventTime, "positionDiscontinuity", "reason=" + getDiscontinuityReasonString(i) + ", PositionInfo:old [" + positionInfo + "], PositionInfo:new [" + positionInfo2 + "]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        logd(eventTime, "videoDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        StringBuilder sb = new StringBuilder("w=" + videoSize.width + ", h=" + videoSize.height);
        if (videoSize.pixelWidthHeightRatio != 1.0f) {
            sb.append(", par=");
            sb.append(videoSize.pixelWidthHeightRatio);
        }
        logd(eventTime, "videoSize", sb.toString());
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str, String str2) {
        logd(getEventString(eventTime, str, str2, null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, String str2, @Nullable Throwable th) {
        loge(getEventString(eventTime, str, str2, th));
    }

    @UnstableApi
    @Deprecated
    public EventLogger(@Nullable MappingTrackSelector mappingTrackSelector) {
        this(DEFAULT_TAG);
    }

    @UnstableApi
    @Deprecated
    public EventLogger(@Nullable MappingTrackSelector mappingTrackSelector, String str) {
        this(str);
    }
}
