package androidx.media3.exoplayer.source.preload;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.PlaybackLooperProvider;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultPreloadManager extends BasePreloadManager<Integer, PreloadStatus> {
    private final boolean deprecatedConstructorCalled;
    private final Handler preloadHandler;
    private final PlaybackLooperProvider preloadLooperProvider;
    private final PreloadMediaSource.Factory preloadMediaSourceFactory;
    private boolean releaseCalled;
    private final RendererCapabilitiesList rendererCapabilitiesList;
    private final TrackSelector trackSelector;

    public static final class Builder extends BasePreloadManager.BuilderBase<Integer, PreloadStatus> {
        private O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O bandwidthMeterSupplier;
        private boolean buildCalled;
        private boolean buildExoPlayerCalled;
        private final Context context;
        private O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O loadControlSupplier;
        private PlaybackLooperProvider preloadLooperProvider;
        private O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O renderersFactorySupplier;
        private TrackSelector.Factory trackSelectorFactory;

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(final Context context, TargetPreloadStatusControl<Integer, PreloadStatus> targetPreloadStatusControl) {
            final int i = 0;
            super(new RankingDataComparator(), targetPreloadStatusControl, O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.exoplayer.source.preload.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
                @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                public final Object get() {
                    switch (i) {
                        case 0:
                            return DefaultPreloadManager.Builder.lambda$new$0(context);
                        case 1:
                            return DefaultBandwidthMeter.getSingletonInstance(context);
                        default:
                            return DefaultPreloadManager.Builder.lambda$new$2(context);
                    }
                }
            }));
            this.context = context;
            this.preloadLooperProvider = new PlaybackLooperProvider();
            this.trackSelectorFactory = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            final int i2 = 1;
            this.bandwidthMeterSupplier = new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.exoplayer.source.preload.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
                @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                public final Object get() {
                    switch (i2) {
                        case 0:
                            return DefaultPreloadManager.Builder.lambda$new$0(context);
                        case 1:
                            return DefaultBandwidthMeter.getSingletonInstance(context);
                        default:
                            return DefaultPreloadManager.Builder.lambda$new$2(context);
                    }
                }
            };
            final int i3 = 2;
            this.renderersFactorySupplier = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.exoplayer.source.preload.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
                @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                public final Object get() {
                    switch (i3) {
                        case 0:
                            return DefaultPreloadManager.Builder.lambda$new$0(context);
                        case 1:
                            return DefaultBandwidthMeter.getSingletonInstance(context);
                        default:
                            return DefaultPreloadManager.Builder.lambda$new$2(context);
                    }
                }
            });
            this.loadControlSupplier = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new androidx.media3.exoplayer.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$0(Context context) {
            return new DefaultMediaSourceFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$2(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$6(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$setLoadControl$5(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$setMediaSourceFactory$3(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$setRenderersFactory$4(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public ExoPlayer buildExoPlayer() {
            return buildExoPlayer(new ExoPlayer.Builder(this.context));
        }

        @CanIgnoreReturnValue
        public Builder setBandwidthMeter(BandwidthMeter bandwidthMeter) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.bandwidthMeterSupplier = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(bandwidthMeter, 2);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLoadControl(LoadControl loadControl) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.loadControlSupplier = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(loadControl, 0);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.mediaSourceFactorySupplier = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(factory, 3);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPreloadLooper(Looper looper) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled || looper == Looper.getMainLooper()) ? false : true);
            this.preloadLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRenderersFactory(RenderersFactory renderersFactory) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.renderersFactorySupplier = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(renderersFactory, 1);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTrackSelectorFactory(TrackSelector.Factory factory) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.trackSelectorFactory = factory;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager.BuilderBase
        public BasePreloadManager<Integer, PreloadStatus> build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new DefaultPreloadManager(this);
        }

        public ExoPlayer buildExoPlayer(ExoPlayer.Builder builder) {
            this.buildExoPlayerCalled = true;
            return builder.setMediaSourceFactory((MediaSource.Factory) this.mediaSourceFactorySupplier.get()).setBandwidthMeter((BandwidthMeter) this.bandwidthMeterSupplier.get()).setRenderersFactory((RenderersFactory) this.renderersFactorySupplier.get()).setLoadControl((LoadControl) this.loadControlSupplier.get()).setPlaybackLooperProvider(this.preloadLooperProvider).setTrackSelector(this.trackSelectorFactory.createTrackSelector(this.context)).build();
        }
    }

    public static final class PreloadStatus {
        public static final int STAGE_SOURCE_PREPARED = 0;
        public static final int STAGE_SPECIFIED_RANGE_LOADED = 2;
        public static final int STAGE_TRACKS_SELECTED = 1;
        public final long durationMs;
        public final int stage;
        public final long startPositionMs;
        public static final PreloadStatus SOURCE_PREPARED = new PreloadStatus(0, C.TIME_UNSET, 0);
        public static final PreloadStatus TRACKS_SELECTED = new PreloadStatus(1, C.TIME_UNSET, 0);

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Stage {
        }

        private PreloadStatus(int i, long j, long j2) {
            boolean z = true;
            Assertions.checkArgument(j == C.TIME_UNSET || j >= 0);
            if (j2 != C.TIME_UNSET && j2 < 0) {
                z = false;
            }
            Assertions.checkArgument(z);
            this.stage = i;
            this.startPositionMs = j;
            this.durationMs = j2;
        }

        public static PreloadStatus specifiedRangeLoaded(long j) {
            return new PreloadStatus(2, C.TIME_UNSET, j);
        }

        public static PreloadStatus specifiedRangeLoaded(long j, long j2) {
            return new PreloadStatus(2, j, j2);
        }
    }

    public static final class RankingDataComparator implements Comparator<Integer> {
        public int currentPlayingIndex = -1;

        @Override // java.util.Comparator
        public int compare(Integer num, Integer num2) {
            return Integer.compare(Math.abs(num.intValue() - this.currentPlayingIndex), Math.abs(num2.intValue() - this.currentPlayingIndex));
        }
    }

    public final class SourcePreloadControl implements PreloadMediaSource.PreloadControl {
        private SourcePreloadControl() {
        }

        private boolean continueOrCompletePreloading(PreloadMediaSource preloadMediaSource, O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, boolean z) {
            PreloadStatus targetPreloadStatus = DefaultPreloadManager.this.getTargetPreloadStatus(preloadMediaSource);
            if (targetPreloadStatus == null) {
                DefaultPreloadManager.this.onPreloadSkipped(preloadMediaSource);
                return false;
            }
            if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.apply((PreloadStatus) Assertions.checkNotNull(targetPreloadStatus))) {
                return true;
            }
            if (z) {
                DefaultPreloadManager.this.clearSourceInternal(preloadMediaSource);
            }
            DefaultPreloadManager.this.onPreloadCompleted(preloadMediaSource);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onContinueLoadingRequested$2(long j, PreloadStatus preloadStatus) {
            if (preloadStatus.stage == 2) {
                long j2 = preloadStatus.durationMs;
                if (j2 != C.TIME_UNSET && j2 > Util.usToMs(j)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onSourcePrepared$0(PreloadStatus preloadStatus) {
            return preloadStatus.stage > 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onTracksSelected$1(PreloadStatus preloadStatus) {
            return preloadStatus.stage > 1;
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onContinueLoadingRequested(PreloadMediaSource preloadMediaSource, final long j) {
            return continueOrCompletePreloading(preloadMediaSource, new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() { // from class: androidx.media3.exoplayer.source.preload.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
                @Override // com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
                public final boolean apply(Object obj) {
                    return DefaultPreloadManager.SourcePreloadControl.lambda$onContinueLoadingRequested$2(j, (DefaultPreloadManager.PreloadStatus) obj);
                }
            }, false);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onLoadedToTheEndOfSource(PreloadMediaSource preloadMediaSource) {
            DefaultPreloadManager.this.onPreloadCompleted(preloadMediaSource);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onPreloadError(PreloadException preloadException, PreloadMediaSource preloadMediaSource) {
            DefaultPreloadManager.this.onPreloadError(preloadException, preloadMediaSource);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onSourcePrepared(PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(1), true);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onTracksSelected(PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(0), false);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onUsedByPlayer(PreloadMediaSource preloadMediaSource) {
            DefaultPreloadManager.this.onPreloadSkipped(preloadMediaSource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseInternal$1() {
        this.rendererCapabilitiesList.release();
        if (!this.deprecatedConstructorCalled) {
            this.trackSelector.release();
        }
        this.preloadLooperProvider.releaseLooper();
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void clearSourceInternal(MediaSource mediaSource) {
        if (this.releaseCalled) {
            return;
        }
        Assertions.checkArgument(mediaSource instanceof PreloadMediaSource);
        ((PreloadMediaSource) mediaSource).clear();
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public MediaSource createMediaSourceForPreloading(MediaSource mediaSource) {
        return this.preloadMediaSourceFactory.createMediaSource(mediaSource);
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void releaseInternal() {
        this.releaseCalled = true;
        this.preloadHandler.post(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, 0));
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void releaseSourceInternal(MediaSource mediaSource) {
        if (this.releaseCalled) {
            return;
        }
        Assertions.checkArgument(mediaSource instanceof PreloadMediaSource);
        ((PreloadMediaSource) mediaSource).releasePreloadMediaSource();
    }

    public void setCurrentPlayingIndex(int i) {
        ((RankingDataComparator) this.rankingDataComparator).currentPlayingIndex = i;
    }

    private DefaultPreloadManager(Builder builder) {
        super(new RankingDataComparator(), builder.targetPreloadStatusControl, (MediaSource.Factory) builder.mediaSourceFactorySupplier.get());
        DefaultRendererCapabilitiesList defaultRendererCapabilitiesListCreateRendererCapabilitiesList = new DefaultRendererCapabilitiesList.Factory((RenderersFactory) builder.renderersFactorySupplier.get()).createRendererCapabilitiesList();
        this.rendererCapabilitiesList = defaultRendererCapabilitiesListCreateRendererCapabilitiesList;
        PlaybackLooperProvider playbackLooperProvider = builder.preloadLooperProvider;
        this.preloadLooperProvider = playbackLooperProvider;
        TrackSelector trackSelectorCreateTrackSelector = builder.trackSelectorFactory.createTrackSelector(builder.context);
        this.trackSelector = trackSelectorCreateTrackSelector;
        BandwidthMeter bandwidthMeter = (BandwidthMeter) builder.bandwidthMeterSupplier.get();
        trackSelectorCreateTrackSelector.init(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(), bandwidthMeter);
        Looper looperObtainLooper = playbackLooperProvider.obtainLooper();
        this.preloadMediaSourceFactory = new PreloadMediaSource.Factory((MediaSource.Factory) builder.mediaSourceFactorySupplier.get(), new SourcePreloadControl(), trackSelectorCreateTrackSelector, bandwidthMeter, defaultRendererCapabilitiesListCreateRendererCapabilitiesList.getRendererCapabilities(), ((LoadControl) builder.loadControlSupplier.get()).getAllocator(), looperObtainLooper);
        this.preloadHandler = Util.createHandler(looperObtainLooper, null);
        this.deprecatedConstructorCalled = false;
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void preloadSourceInternal(MediaSource mediaSource, @Nullable PreloadStatus preloadStatus) {
        if (this.releaseCalled) {
            return;
        }
        Assertions.checkArgument(mediaSource instanceof PreloadMediaSource);
        PreloadMediaSource preloadMediaSource = (PreloadMediaSource) mediaSource;
        if (preloadStatus != null) {
            preloadMediaSource.preload(Util.msToUs(preloadStatus.startPositionMs));
        } else {
            preloadMediaSource.clear();
            onPreloadSkipped(preloadMediaSource);
        }
    }

    @Deprecated
    public DefaultPreloadManager(TargetPreloadStatusControl<Integer, PreloadStatus> targetPreloadStatusControl, MediaSource.Factory factory, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilitiesList.Factory factory2, Allocator allocator, Looper looper) {
        super(new RankingDataComparator(), targetPreloadStatusControl, factory);
        RendererCapabilitiesList rendererCapabilitiesListCreateRendererCapabilitiesList = factory2.createRendererCapabilitiesList();
        this.rendererCapabilitiesList = rendererCapabilitiesListCreateRendererCapabilitiesList;
        PlaybackLooperProvider playbackLooperProvider = new PlaybackLooperProvider(looper);
        this.preloadLooperProvider = playbackLooperProvider;
        this.trackSelector = trackSelector;
        Looper looperObtainLooper = playbackLooperProvider.obtainLooper();
        this.preloadMediaSourceFactory = new PreloadMediaSource.Factory(factory, new SourcePreloadControl(), trackSelector, bandwidthMeter, rendererCapabilitiesListCreateRendererCapabilitiesList.getRendererCapabilities(), allocator, looperObtainLooper);
        this.preloadHandler = Util.createHandler(looperObtainLooper, null);
        this.deprecatedConstructorCalled = true;
    }
}
