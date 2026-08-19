package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends Player {

    @UnstableApi
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;

    @UnstableApi
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @UnstableApi
    public interface AudioOffloadListener {
        void onOffloadedPlayback(boolean z);

        void onSleepingForOffloadChanged(boolean z);
    }

    public static final class Builder {
        com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo analyticsCollectorFunction;
        AudioAttributes audioAttributes;
        com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O bandwidthMeterSupplier;
        boolean buildCalled;
        Clock clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        boolean deviceVolumeControlEnabled;
        boolean dynamicSchedulingEnabled;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O loadControlSupplier;
        Looper looper;
        long maxSeekToPreviousPositionMs;
        com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;

        @Nullable
        PlaybackLooperProvider playbackLooperProvider;
        String playerName;
        int priority;

        @Nullable
        PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O renderersFactorySupplier;
        ScrubbingModeParameters scrubbingModeParameters;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        SuitableOutputChecker suitableOutputChecker;
        boolean suppressPlaybackOnUnsuitableOutput;
        com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        public Builder(Context context) {
            this(context, new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(context, 1), new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(context, 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$0(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$1(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$10(TrackSelector trackSelector) {
            return trackSelector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$new$11(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$new$12(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$new$13(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$14(Context context) {
            return new DefaultTrackSelector(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$2(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$3(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$4(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$5(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$6(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$7(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$8(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$9(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$setAnalyticsCollector$21(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$20(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$setLoadControl$19(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$setMediaSourceFactory$17(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$setRenderersFactory$16(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$setTrackSelector$18(TrackSelector trackSelector) {
            return trackSelector;
        }

        public ExoPlayer build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new ExoPlayerImpl(this, null);
        }

        public SimpleExoPlayer buildSimpleExoPlayer() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder experimentalSetDynamicSchedulingEnabled(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.dynamicSchedulingEnabled = z;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder experimentalSetForegroundModeTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setAnalyticsCollector(AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(analyticsCollector);
            this.analyticsCollectorFunction = new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(analyticsCollector, 0);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.audioAttributes = (AudioAttributes) Assertions.checkNotNull(audioAttributes);
            this.handleAudioFocus = z;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setBandwidthMeter(BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(bandwidthMeter);
            this.bandwidthMeterSupplier = new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(bandwidthMeter, 0);
            return this;
        }

        @CanIgnoreReturnValue
        @VisibleForTesting
        @UnstableApi
        public Builder setClock(Clock clock) {
            Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setDetachSurfaceTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setDeviceVolumeControlEnabled(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.deviceVolumeControlEnabled = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHandleAudioBecomingNoisy(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = (LivePlaybackSpeedControl) Assertions.checkNotNull(livePlaybackSpeedControl);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setLoadControl(LoadControl loadControl) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(loadControl);
            this.loadControlSupplier = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(loadControl, 0);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(looper);
            this.looper = looper;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setMaxSeekToPreviousPositionMs(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) long j) {
            Assertions.checkArgument(j >= 0);
            Assertions.checkState(!this.buildCalled);
            this.maxSeekToPreviousPositionMs = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(factory);
            this.mediaSourceFactorySupplier = new O00000OOoOOO00O00o0ooooooooO000ooooO0000(factory, 3);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setName(String str) {
            Assertions.checkState(!this.buildCalled);
            this.playerName = str;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setPauseAtEndOfMediaItems(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setPlaybackLooper(Looper looper) {
            Assertions.checkState((this.buildCalled || looper == Looper.getMainLooper()) ? false : true);
            this.playbackLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        @CanIgnoreReturnValue
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @UnstableApi
        public Builder setPlaybackLooperProvider(PlaybackLooperProvider playbackLooperProvider) {
            Assertions.checkState(!this.buildCalled);
            this.playbackLooperProvider = playbackLooperProvider;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setPriority(int i) {
            Assertions.checkState(!this.buildCalled);
            this.priority = i;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
            Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setReleaseTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setRenderersFactory(RenderersFactory renderersFactory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(renderersFactory);
            this.renderersFactorySupplier = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(renderersFactory, 0);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setScrubbingModeParameters(ScrubbingModeParameters scrubbingModeParameters) {
            Assertions.checkState(!this.buildCalled);
            this.scrubbingModeParameters = (ScrubbingModeParameters) Assertions.checkNotNull(scrubbingModeParameters);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSeekBackIncrementMs(@IntRange(from = 1) long j) {
            Assertions.checkArgument(j > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSeekForwardIncrementMs(@IntRange(from = 1) long j) {
            Assertions.checkArgument(j > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.buildCalled);
            this.seekParameters = (SeekParameters) Assertions.checkNotNull(seekParameters);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setSkipSilenceEnabled(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z;
            return this;
        }

        @VisibleForTesting
        @CanIgnoreReturnValue
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @UnstableApi
        public Builder setSuitableOutputChecker(SuitableOutputChecker suitableOutputChecker) {
            Assertions.checkState(!this.buildCalled);
            this.suitableOutputChecker = suitableOutputChecker;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setSuppressPlaybackOnUnsuitableOutput(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.suppressPlaybackOnUnsuitableOutput = z;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setTrackSelector(TrackSelector trackSelector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(trackSelector);
            this.trackSelectorSupplier = new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(trackSelector, 1);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setUseLazyPreparation(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setUsePlatformDiagnostics(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.usePlatformDiagnostics = z;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setVideoChangeFrameRateStrategy(int i) {
            Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setVideoScalingMode(int i) {
            Assertions.checkState(!this.buildCalled);
            this.videoScalingMode = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setWakeMode(int i) {
            Assertions.checkState(!this.buildCalled);
            this.wakeMode = i;
            return this;
        }

        @UnstableApi
        public Builder(Context context, RenderersFactory renderersFactory) {
            this(context, new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(renderersFactory, 2), new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(context, 3));
            Assertions.checkNotNull(renderersFactory);
        }

        @UnstableApi
        public Builder(Context context, MediaSource.Factory factory) {
            this(context, new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(context, 6), new O00000OOoOOO00O00o0ooooooooO000ooooO0000(factory, 2));
            Assertions.checkNotNull(factory);
        }

        @UnstableApi
        public Builder(Context context, RenderersFactory renderersFactory, MediaSource.Factory factory) {
            this(context, new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(renderersFactory, 1), new O00000OOoOOO00O00o0ooooooooO000ooooO0000(factory, 0));
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
        }

        @UnstableApi
        public Builder(Context context, RenderersFactory renderersFactory, MediaSource.Factory factory, TrackSelector trackSelector, LoadControl loadControl, BandwidthMeter bandwidthMeter, AnalyticsCollector analyticsCollector) {
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(renderersFactory, 3);
            O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = new O00000OOoOOO00O00o0ooooooooO000ooooO0000(factory, 1);
            O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(trackSelector, 0);
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(loadControl, 1);
            int i = 1;
            this(context, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o00000OOoOOO00O00o0ooooooooO000ooooO0000, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(bandwidthMeter, i), new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(analyticsCollector, i));
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
            Assertions.checkNotNull(trackSelector);
            Assertions.checkNotNull(bandwidthMeter);
            Assertions.checkNotNull(analyticsCollector);
        }

        private Builder(Context context, com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2) {
            this(context, o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2, new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(context, 4), new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(), new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(context, 5), new O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00(3));
        }

        private Builder(Context context, com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2, com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O3, com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O4, com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O5, com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
            this.context = (Context) Assertions.checkNotNull(context);
            this.renderersFactorySupplier = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
            this.mediaSourceFactorySupplier = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2;
            this.trackSelectorSupplier = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O3;
            this.loadControlSupplier = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O4;
            this.bandwidthMeterSupplier = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O5;
            this.analyticsCollectorFunction = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
            this.maxSeekToPreviousPositionMs = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
            this.scrubbingModeParameters = ScrubbingModeParameters.DEFAULT;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
            this.usePlatformDiagnostics = true;
            this.playerName = "";
            this.priority = -1000;
            this.suitableOutputChecker = new DefaultSuitableOutputChecker();
        }
    }

    @UnstableApi
    public static class PreloadConfiguration {
        public static final PreloadConfiguration DEFAULT = new PreloadConfiguration(C.TIME_UNSET);
        public final long targetPreloadDurationUs;

        public PreloadConfiguration(long j) {
            this.targetPreloadDurationUs = j;
        }
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    @UnstableApi
    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @UnstableApi
    void addMediaSource(int i, MediaSource mediaSource);

    @UnstableApi
    void addMediaSource(MediaSource mediaSource);

    @UnstableApi
    void addMediaSources(int i, List<MediaSource> list);

    @UnstableApi
    void addMediaSources(List<MediaSource> list);

    @UnstableApi
    void clearAuxEffectInfo();

    @UnstableApi
    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    @UnstableApi
    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @UnstableApi
    PlayerMessage createMessage(PlayerMessage.Target target);

    @UnstableApi
    AnalyticsCollector getAnalyticsCollector();

    @Nullable
    @UnstableApi
    DecoderCounters getAudioDecoderCounters();

    @Nullable
    @UnstableApi
    Format getAudioFormat();

    @UnstableApi
    int getAudioSessionId();

    @UnstableApi
    Clock getClock();

    @UnstableApi
    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @UnstableApi
    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    @UnstableApi
    boolean getPauseAtEndOfMediaItems();

    @UnstableApi
    Looper getPlaybackLooper();

    @Override // androidx.media3.common.Player
    @Nullable
    /* bridge */ /* synthetic */ PlaybackException getPlayerError();

    @Override // androidx.media3.common.Player
    @Nullable
    ExoPlaybackException getPlayerError();

    @UnstableApi
    PreloadConfiguration getPreloadConfiguration();

    @UnstableApi
    Renderer getRenderer(int i);

    @UnstableApi
    int getRendererCount();

    @UnstableApi
    int getRendererType(int i);

    @UnstableApi
    ScrubbingModeParameters getScrubbingModeParameters();

    @Nullable
    @UnstableApi
    Renderer getSecondaryRenderer(int i);

    @UnstableApi
    SeekParameters getSeekParameters();

    @UnstableApi
    ShuffleOrder getShuffleOrder();

    @UnstableApi
    boolean getSkipSilenceEnabled();

    @Nullable
    @UnstableApi
    TrackSelector getTrackSelector();

    @UnstableApi
    int getVideoChangeFrameRateStrategy();

    @Nullable
    @UnstableApi
    DecoderCounters getVideoDecoderCounters();

    @Nullable
    @UnstableApi
    Format getVideoFormat();

    @UnstableApi
    int getVideoScalingMode();

    @UnstableApi
    boolean isReleased();

    @UnstableApi
    boolean isScrubbingModeEnabled();

    @UnstableApi
    boolean isSleepingForOffload();

    @UnstableApi
    boolean isTunnelingEnabled();

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource);

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource, boolean z, boolean z2);

    @Override // androidx.media3.common.Player
    void release();

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    @UnstableApi
    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Override // androidx.media3.common.Player
    void replaceMediaItem(int i, MediaItem mediaItem);

    @Override // androidx.media3.common.Player
    void replaceMediaItems(int i, int i2, List<MediaItem> list);

    @UnstableApi
    void setAudioSessionId(int i);

    @UnstableApi
    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    @UnstableApi
    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    @UnstableApi
    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    @UnstableApi
    void setImageOutput(@Nullable ImageOutput imageOutput);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, long j);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, boolean z);

    @UnstableApi
    void setMediaSources(List<MediaSource> list);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, int i, long j);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, boolean z);

    @UnstableApi
    void setPauseAtEndOfMediaItems(boolean z);

    @RequiresApi(23)
    @UnstableApi
    void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    @UnstableApi
    void setPreloadConfiguration(PreloadConfiguration preloadConfiguration);

    @UnstableApi
    void setPriority(int i);

    @UnstableApi
    void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager);

    @UnstableApi
    void setScrubbingModeEnabled(boolean z);

    @UnstableApi
    void setScrubbingModeParameters(ScrubbingModeParameters scrubbingModeParameters);

    @UnstableApi
    void setSeekParameters(@Nullable SeekParameters seekParameters);

    @UnstableApi
    void setShuffleOrder(ShuffleOrder shuffleOrder);

    @UnstableApi
    void setSkipSilenceEnabled(boolean z);

    @UnstableApi
    void setVideoChangeFrameRateStrategy(int i);

    @UnstableApi
    void setVideoEffects(List<Effect> list);

    @UnstableApi
    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @UnstableApi
    void setVideoScalingMode(int i);

    void setWakeMode(int i);
}
