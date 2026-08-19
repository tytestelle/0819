package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
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
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.common.collect.O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O;
import com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultAnalyticsCollector implements AnalyticsCollector {
    private final Clock clock;
    private final SparseArray<AnalyticsListener.EventTime> eventTimes;
    private HandlerWrapper handler;
    private boolean isSeeking;
    private ListenerSet<AnalyticsListener> listeners;
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final Timeline.Period period;
    private Player player;
    private final Timeline.Window window;

    public static final class MediaPeriodQueueTracker {

        @Nullable
        private MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O mediaPeriodQueue = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of();
        private O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o mediaPeriodTimelines = O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of();
        private final Timeline.Period period;
        private MediaSource.MediaPeriodId playingMediaPeriod;
        private MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(Timeline.Period period) {
            this.period = period;
        }

        private void addTimelineForMediaPeriodId(O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1) {
                o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(mediaPeriodId, timeline);
                return;
            }
            Timeline timeline2 = (Timeline) this.mediaPeriodTimelines.get(mediaPeriodId);
            if (timeline2 != null) {
                o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(mediaPeriodId, timeline2);
            }
        }

        @Nullable
        private static MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(Player player, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
            Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (player.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, period).getAdGroupIndexAfterPositionUs(Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs());
            for (int i = 0; i < o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.size(); i++) {
                MediaSource.MediaPeriodId mediaPeriodId2 = (MediaSource.MediaPeriodId) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.get(i);
                if (isMatchingMediaPeriod(mediaPeriodId2, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId2;
                }
            }
            if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.isEmpty() && mediaPeriodId != null) {
                if (isMatchingMediaPeriod(mediaPeriodId, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId;
                }
            }
            return null;
        }

        private static boolean isMatchingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, @Nullable Object obj, boolean z, int i, int i2, int i3) {
            if (mediaPeriodId.periodUid.equals(obj)) {
                return (z && mediaPeriodId.adGroupIndex == i && mediaPeriodId.adIndexInAdGroup == i2) || (!z && mediaPeriodId.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex == i3);
            }
            return false;
        }

        private void updateMediaPeriodTimelines(Timeline timeline) {
            O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OBuilder = O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.builder();
            if (this.mediaPeriodQueue.isEmpty()) {
                addTimelineForMediaPeriodId(o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OBuilder, this.playingMediaPeriod, timeline);
                if (!Objects.equals(this.readingMediaPeriod, this.playingMediaPeriod)) {
                    addTimelineForMediaPeriodId(o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OBuilder, this.readingMediaPeriod, timeline);
                }
                if (!Objects.equals(this.currentPlayerMediaPeriod, this.playingMediaPeriod) && !Objects.equals(this.currentPlayerMediaPeriod, this.readingMediaPeriod)) {
                    addTimelineForMediaPeriodId(o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OBuilder, this.currentPlayerMediaPeriod, timeline);
                }
            } else {
                for (int i = 0; i < this.mediaPeriodQueue.size(); i++) {
                    addTimelineForMediaPeriodId(o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OBuilder, (MediaSource.MediaPeriodId) this.mediaPeriodQueue.get(i), timeline);
                }
                if (!this.mediaPeriodQueue.contains(this.currentPlayerMediaPeriod)) {
                    addTimelineForMediaPeriodId(o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OBuilder, this.currentPlayerMediaPeriod, timeline);
                }
            }
            this.mediaPeriodTimelines = o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00OBuilder.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }

        @Nullable
        public MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
            return this.currentPlayerMediaPeriod;
        }

        @Nullable
        public MediaSource.MediaPeriodId getLoadingMediaPeriod() {
            if (this.mediaPeriodQueue.isEmpty()) {
                return null;
            }
            return (MediaSource.MediaPeriodId) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this.mediaPeriodQueue);
        }

        @Nullable
        public Timeline getMediaPeriodIdTimeline(MediaSource.MediaPeriodId mediaPeriodId) {
            return (Timeline) this.mediaPeriodTimelines.get(mediaPeriodId);
        }

        @Nullable
        public MediaSource.MediaPeriodId getPlayingMediaPeriod() {
            return this.playingMediaPeriod;
        }

        @Nullable
        public MediaSource.MediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public void onPositionDiscontinuity(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
        }

        public void onQueueUpdated(List<MediaSource.MediaPeriodId> list, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Player player) {
            this.mediaPeriodQueue = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.playingMediaPeriod = list.get(0);
                this.readingMediaPeriod = (MediaSource.MediaPeriodId) Assertions.checkNotNull(mediaPeriodId);
            }
            if (this.currentPlayerMediaPeriod == null) {
                this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            }
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        public void onTimelineChanged(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }
    }

    public DefaultAnalyticsCollector(Clock clock) {
        this.clock = (Clock) Assertions.checkNotNull(clock);
        this.listeners = new ListenerSet<>(Util.getCurrentOrMainLooper(), clock, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(15));
        Timeline.Period period = new Timeline.Period();
        this.period = period;
        this.window = new Timeline.Window();
        this.mediaPeriodQueueTracker = new MediaPeriodQueueTracker(period);
        this.eventTimes = new SparseArray<>();
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateMediaPeriodEventTime(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkNotNull(this.player);
        if (mediaPeriodId != null) {
            return this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId) != null ? generateEventTime(mediaPeriodId) : generateEventTime(Timeline.EMPTY, i, mediaPeriodId);
        }
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (i >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, i, null);
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    private AnalyticsListener.EventTime getEventTimeForErrorEvent(@Nullable PlaybackException playbackException) {
        MediaSource.MediaPeriodId mediaPeriodId;
        return (!(playbackException instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? generateCurrentPlayerMediaPeriodEventTime() : generateEventTime(mediaPeriodId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(AnalyticsListener analyticsListener, FlagSet flagSet) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioDecoderInitialized$5(AnalyticsListener.EventTime eventTime, String str, long j, long j2, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j);
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDrmSessionAcquired$64(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
        analyticsListener.onDrmSessionAcquired(eventTime);
        analyticsListener.onDrmSessionAcquired(eventTime, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIsLoadingChanged$35(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadingChanged(eventTime, z);
        analyticsListener.onIsLoadingChanged(eventTime, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onLoadStarted$26(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadStarted(eventTime, loadEventInfo, mediaLoadData);
        analyticsListener.onLoadStarted(eventTime, loadEventInfo, mediaLoadData, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPositionDiscontinuity$46(AnalyticsListener.EventTime eventTime, int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener analyticsListener) {
        analyticsListener.onPositionDiscontinuity(eventTime, i);
        analyticsListener.onPositionDiscontinuity(eventTime, positionInfo, positionInfo2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoDecoderInitialized$17(AnalyticsListener.EventTime eventTime, String str, long j, long j2, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j);
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoSizeChanged$59(AnalyticsListener.EventTime eventTime, VideoSize videoSize, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoSizeChanged(eventTime, videoSize);
        analyticsListener.onVideoSizeChanged(eventTime, videoSize.width, videoSize.height, 0, videoSize.pixelWidthHeightRatio);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlayer$1(Player player, AnalyticsListener analyticsListener, FlagSet flagSet) {
        analyticsListener.onEvents(player, new AnalyticsListener.Events(flagSet, this.eventTimes));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseInternal() {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, AnalyticsListener.EVENT_PLAYER_RELEASED, new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0));
        this.listeners.release();
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void addListener(AnalyticsListener analyticsListener) {
        Assertions.checkNotNull(analyticsListener);
        this.listeners.add(analyticsListener);
    }

    public final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod());
    }

    @RequiresNonNull({"player"})
    public final AnalyticsListener.EventTime generateEventTime(Timeline timeline, int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodId2 = timeline.isEmpty() ? null : mediaPeriodId;
        long jElapsedRealtime = this.clock.elapsedRealtime();
        boolean z = timeline.equals(this.player.getCurrentTimeline()) && i == this.player.getCurrentMediaItemIndex();
        long defaultPositionMs = 0;
        if (mediaPeriodId2 == null || !mediaPeriodId2.isAd()) {
            if (z) {
                defaultPositionMs = this.player.getContentPosition();
            } else if (!timeline.isEmpty()) {
                defaultPositionMs = timeline.getWindow(i, this.window).getDefaultPositionMs();
            }
        } else if (z && this.player.getCurrentAdGroupIndex() == mediaPeriodId2.adGroupIndex && this.player.getCurrentAdIndexInAdGroup() == mediaPeriodId2.adIndexInAdGroup) {
            defaultPositionMs = this.player.getCurrentPosition();
        }
        return new AnalyticsListener.EventTime(jElapsedRealtime, timeline, i, mediaPeriodId2, defaultPositionMs, this.player.getCurrentTimeline(), this.player.getCurrentMediaItemIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void notifySeekStarted() {
        if (this.isSeeking) {
            return;
        }
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.isSeeking = true;
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 20, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(eventTimeGenerateReadingMediaPeriodEventTime, audioAttributes, 6));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioCodecError(Exception exc) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_CODEC_ERROR, new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(eventTimeGenerateReadingMediaPeriodEventTime, exc, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(String str, long j, long j2) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1008, new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(eventTimeGenerateReadingMediaPeriodEventTime, str, j2, j, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderReleased(String str) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1012, new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(eventTimeGenerateReadingMediaPeriodEventTime, str, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1013, new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1007, new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1009, new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(eventTimeGenerateReadingMediaPeriodEventTime, format, decoderReuseEvaluation, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioPositionAdvancing(long j) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1010, new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(eventTimeGenerateReadingMediaPeriodEventTime, j, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioSessionIdChanged(int i) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 21, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(eventTimeGenerateReadingMediaPeriodEventTime, i, 4));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioSinkError(Exception exc) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1014, new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(eventTimeGenerateReadingMediaPeriodEventTime, exc, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED, new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(eventTimeGenerateReadingMediaPeriodEventTime, audioTrackConfig, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED, new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(eventTimeGenerateReadingMediaPeriodEventTime, audioTrackConfig, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioUnderrun(int i, long j, long j2) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1011, new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(eventTimeGenerateReadingMediaPeriodEventTime, i, j, j2, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onAvailableCommandsChanged(Player.Commands commands) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 13, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, commands, 4));
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(int i, long j, long j2) {
        AnalyticsListener.EventTime eventTimeGenerateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateLoadingMediaPeriodEventTime, 1006, new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(eventTimeGenerateLoadingMediaPeriodEventTime, i, j, j2, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onCues(List<Cue> list) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, list, 9));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 29, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, deviceInfo, 10));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onDeviceVolumeChanged(int i, boolean z) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 30, new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, z));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1004, new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(eventTimeGenerateMediaPeriodEventTime, mediaLoadData, 0));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_KEYS_LOADED, new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(eventTimeGenerateMediaPeriodEventTime, 4));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_KEYS_REMOVED, new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(eventTimeGenerateMediaPeriodEventTime, 1));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1025, new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(eventTimeGenerateMediaPeriodEventTime, 2));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i2) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(eventTimeGenerateMediaPeriodEventTime, i2, 3));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1024, new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(eventTimeGenerateMediaPeriodEventTime, exc, 1));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_SESSION_RELEASED, new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(eventTimeGenerateMediaPeriodEventTime, 5));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDroppedFrames(int i, long j) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1018, new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(eventTimeGeneratePlayingMediaPeriodEventTime, i, j));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onEvents(Player player, Player.Events events) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(boolean z) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3, new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, z));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onIsPlayingChanged(boolean z) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 7, new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 2, z));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCanceled(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1002, new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, 0));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCompleted(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1001, new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, 1));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadError(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1003, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, iOException, z));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadStarted(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1000, new O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, i2, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onMaxSeekToPreviousPositionChanged(long j) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 18, new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j, 3));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaItemTransition(@Nullable MediaItem mediaItem, int i) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1, new androidx.media3.common.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaItem, i));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 14, new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaMetadata, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMetadata(Metadata metadata) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 28, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, metadata, 7));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 5, new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, 2, z));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 12, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, playbackParameters, 2));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 4, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, 2));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(int i) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 6, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(eventTimeForErrorEvent, playbackException, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerErrorChanged(@Nullable PlaybackException playbackException) {
        AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(eventTimeForErrorEvent, playbackException, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerStateChanged(boolean z, int i) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, 0, z));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 15, new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaMetadata, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPositionDiscontinuity(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onRendererReadyChanged(final int i, final int i2, final boolean z) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_RENDERER_READY_CHANGED, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.O00000OOoOOO00O00o0ooooooooO000ooooO0000
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRendererReadyChanged(eventTimeGenerateReadingMediaPeriodEventTime, i, i2, z);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRepeatModeChanged(int i) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 8, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, 5));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekBackIncrementChanged(long j) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 16, new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j, 2));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekForwardIncrementChanged(long j) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 17, new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onShuffleModeEnabledChanged(boolean z) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 9, new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3, z));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSkipSilenceEnabledChanged(boolean z) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 23, new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(eventTimeGenerateReadingMediaPeriodEventTime, 1, z));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSurfaceSizeChanged(final int i, final int i2) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 24, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSurfaceSizeChanged(eventTimeGenerateReadingMediaPeriodEventTime, i, i2);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTimelineChanged(Timeline timeline, int i) {
        this.mediaPeriodQueueTracker.onTimelineChanged((Player) Assertions.checkNotNull(this.player));
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 19, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, trackSelectionParameters, 3));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTracksChanged(Tracks tracks) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 2, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, tracks, 8));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_UPSTREAM_DISCARDED, new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(eventTimeGenerateMediaPeriodEventTime, mediaLoadData, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoCodecError(Exception exc) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_CODEC_ERROR, new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(eventTimeGenerateReadingMediaPeriodEventTime, exc, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(String str, long j, long j2) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1016, new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(eventTimeGenerateReadingMediaPeriodEventTime, str, j2, j, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderReleased(String str) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1019, new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(eventTimeGenerateReadingMediaPeriodEventTime, str, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1020, new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1015, new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoFrameProcessingOffset(long j, int i) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1021, new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(eventTimeGeneratePlayingMediaPeriodEventTime, j, i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1017, new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(eventTimeGenerateReadingMediaPeriodEventTime, format, decoderReuseEvaluation, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 25, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(eventTimeGenerateReadingMediaPeriodEventTime, videoSize, 11));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(final float f) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 22, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVolumeChanged(eventTimeGenerateReadingMediaPeriodEventTime, f);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void release() {
        ((HandlerWrapper) Assertions.checkStateNotNull(this.handler)).post(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, 9));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    public final void sendEvent(AnalyticsListener.EventTime eventTime, int i, ListenerSet.Event<AnalyticsListener> event) {
        this.eventTimes.put(i, eventTime);
        this.listeners.sendEvent(i, event);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void setPlayer(Player player, Looper looper) {
        Assertions.checkState(this.player == null || this.mediaPeriodQueueTracker.mediaPeriodQueue.isEmpty());
        this.player = (Player) Assertions.checkNotNull(player);
        this.handler = this.clock.createHandler(looper, null);
        this.listeners = this.listeners.copy(looper, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this, player, 5));
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.listeners.setThrowsWhenUsingWrongThread(z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> list, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onQueueUpdated(list, mediaPeriodId, (Player) Assertions.checkNotNull(this.player));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        if (i == 1) {
            this.isSeeking = false;
        }
        this.mediaPeriodQueueTracker.onPositionDiscontinuity((Player) Assertions.checkNotNull(this.player));
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 11, new O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, positionInfo, positionInfo2, i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onRenderedFirstFrame(Object obj, long j) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 26, new com.quickjs.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(eventTimeGenerateReadingMediaPeriodEventTime, obj, j));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onCues(CueGroup cueGroup) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, cueGroup, 12));
    }

    private AnalyticsListener.EventTime generateEventTime(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkNotNull(this.player);
        Timeline mediaPeriodIdTimeline = mediaPeriodId == null ? null : this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId);
        if (mediaPeriodId != null && mediaPeriodIdTimeline != null) {
            return generateEventTime(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId);
        }
        int currentMediaItemIndex = this.player.getCurrentMediaItemIndex();
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, currentMediaItemIndex, null);
    }
}
