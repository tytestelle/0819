package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ProgressiveMediaSource extends BaseMediaSource implements ProgressiveMediaPeriod.Listener {
    public static final int DEFAULT_LOADING_CHECK_INTERVAL_BYTES = 1048576;
    private final int continueLoadingCheckIntervalBytes;
    private final DataSource.Factory dataSourceFactory;

    @Nullable
    private final O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O downloadExecutorSupplier;
    private final DrmSessionManager drmSessionManager;

    @Nullable
    private Listener listener;
    private final LoadErrorHandlingPolicy loadableLoadErrorHandlingPolicy;

    @GuardedBy("this")
    private MediaItem mediaItem;
    private final ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;

    @Nullable
    private final Format singleTrackFormat;
    private final int singleTrackId;
    private long timelineDurationUs;
    private boolean timelineIsLive;
    private boolean timelineIsPlaceholder;
    private boolean timelineIsSeekable;

    @Nullable
    private TransferListener transferListener;

    public static final class Factory implements MediaSourceFactory {
        private int continueLoadingCheckIntervalBytes;
        private final DataSource.Factory dataSourceFactory;

        @Nullable
        private O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O downloadExecutorSupplier;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;

        @Nullable
        private Format singleTrackFormat;
        private int singleTrackId;

        public Factory(DataSource.Factory factory) {
            this(factory, new DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ProgressiveMediaExtractor lambda$new$0(ExtractorsFactory extractorsFactory, PlayerId playerId) {
            return new BundledExtractorsAdapter(extractorsFactory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ReleasableExecutor lambda$setDownloadExecutor$1(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, Consumer consumer) {
            return ReleasableExecutor.CC.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((Executor) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.get(), consumer);
        }

        @CanIgnoreReturnValue
        public Factory enableLazyLoadingWithSingleTrack(int i, Format format) {
            this.singleTrackId = i;
            this.singleTrackFormat = (Format) Assertions.checkNotNull(format);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, z);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
            return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, factory);
        }

        @CanIgnoreReturnValue
        public Factory setContinueLoadingCheckIntervalBytes(int i) {
            this.continueLoadingCheckIntervalBytes = i;
            return this;
        }

        @CanIgnoreReturnValue
        public <T extends Executor> Factory setDownloadExecutor(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, Consumer<T> consumer) {
            setDownloadExecutor(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, consumer, 0));
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, factory);
        }

        public Factory(DataSource.Factory factory, final ExtractorsFactory extractorsFactory) {
            this(factory, new ProgressiveMediaExtractor.Factory() { // from class: androidx.media3.exoplayer.source.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
                @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
                public final ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
                    return ProgressiveMediaSource.Factory.lambda$new$0(extractorsFactory, playerId);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public ProgressiveMediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.localConfiguration);
            return new ProgressiveMediaSource(mediaItem, this.dataSourceFactory, this.progressiveMediaExtractorFactory, this.drmSessionManagerProvider.get(mediaItem), this.loadErrorHandlingPolicy, this.continueLoadingCheckIntervalBytes, this.singleTrackId, this.singleTrackFormat, this.downloadExecutorSupplier);
        }

        @CanIgnoreReturnValue
        public MediaSource.Factory setDownloadExecutor(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
            this.downloadExecutorSupplier = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = (DrmSessionManagerProvider) Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = (LoadErrorHandlingPolicy) Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(DataSource.Factory factory, ProgressiveMediaExtractor.Factory factory2) {
            this(factory, factory2, new DefaultDrmSessionManagerProvider(), new DefaultLoadErrorHandlingPolicy(), 1048576);
        }

        public Factory(DataSource.Factory factory, ProgressiveMediaExtractor.Factory factory2, DrmSessionManagerProvider drmSessionManagerProvider, LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i) {
            this.dataSourceFactory = factory;
            this.progressiveMediaExtractorFactory = factory2;
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            this.continueLoadingCheckIntervalBytes = i;
        }
    }

    public interface Listener {
        void onSeekMap(MediaSource mediaSource, SeekMap seekMap);
    }

    private MediaItem.LocalConfiguration getLocalConfiguration() {
        return (MediaItem.LocalConfiguration) Assertions.checkNotNull(getMediaItem().localConfiguration);
    }

    private void notifySourceInfoRefreshed() {
        Timeline singlePeriodTimeline = new SinglePeriodTimeline(this.timelineDurationUs, this.timelineIsSeekable, false, this.timelineIsLive, (Object) null, getMediaItem());
        if (this.timelineIsPlaceholder) {
            singlePeriodTimeline = new ForwardingTimeline(singlePeriodTimeline) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaSource.1
                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
                    super.getPeriod(i, period, z);
                    period.isPlaceholder = true;
                    return period;
                }

                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
                    super.getWindow(i, window, j);
                    window.isPlaceholder = true;
                    return window;
                }
            };
        }
        refreshSourceInfo(singlePeriodTimeline);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = getLocalConfiguration();
        MediaItem.LocalConfiguration localConfiguration2 = mediaItem.localConfiguration;
        return localConfiguration2 != null && localConfiguration2.uri.equals(localConfiguration.uri) && localConfiguration2.imageDurationMs == localConfiguration.imageDurationMs && Objects.equals(localConfiguration2.customCacheKey, localConfiguration.customCacheKey);
    }

    public void clearListener() {
        this.listener = null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
        TransferListener transferListener = this.transferListener;
        if (transferListener != null) {
            dataSourceCreateDataSource.addTransferListener(transferListener);
        }
        MediaItem.LocalConfiguration localConfiguration = getLocalConfiguration();
        Uri uri = localConfiguration.uri;
        ProgressiveMediaExtractor progressiveMediaExtractorCreateProgressiveMediaExtractor = this.progressiveMediaExtractorFactory.createProgressiveMediaExtractor(getPlayerId());
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        DrmSessionEventListener.EventDispatcher eventDispatcherCreateDrmEventDispatcher = createDrmEventDispatcher(mediaPeriodId);
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadableLoadErrorHandlingPolicy;
        MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(mediaPeriodId);
        String str = localConfiguration.customCacheKey;
        int i = this.continueLoadingCheckIntervalBytes;
        int i2 = this.singleTrackId;
        Format format = this.singleTrackFormat;
        long jMsToUs = Util.msToUs(localConfiguration.imageDurationMs);
        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = this.downloadExecutorSupplier;
        return new ProgressiveMediaPeriod(uri, dataSourceCreateDataSource, progressiveMediaExtractorCreateProgressiveMediaExtractor, drmSessionManager, eventDispatcherCreateDrmEventDispatcher, loadErrorHandlingPolicy, eventDispatcherCreateEventDispatcher, this, allocator, str, i, i2, format, jMsToUs, o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O != null ? (ReleasableExecutor) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.get() : null);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaPeriod.Listener
    public void onSourceInfoRefreshed(long j, SeekMap seekMap, boolean z) {
        if (j == C.TIME_UNSET) {
            j = this.timelineDurationUs;
        }
        boolean zIsSeekable = seekMap.isSeekable();
        if (!this.timelineIsPlaceholder && this.timelineDurationUs == j && this.timelineIsSeekable == zIsSeekable && this.timelineIsLive == z) {
            return;
        }
        this.timelineDurationUs = j;
        this.timelineIsSeekable = zIsSeekable;
        this.timelineIsLive = z;
        this.timelineIsPlaceholder = false;
        notifySourceInfoRefreshed();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onSeekMap(this, seekMap);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.transferListener = transferListener;
        this.drmSessionManager.setPlayer((Looper) Assertions.checkNotNull(Looper.myLooper()), getPlayerId());
        this.drmSessionManager.prepare();
        notifySourceInfoRefreshed();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((ProgressiveMediaPeriod) mediaPeriod).release();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.drmSessionManager.release();
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    private ProgressiveMediaSource(MediaItem mediaItem, DataSource.Factory factory, ProgressiveMediaExtractor.Factory factory2, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i, int i2, @Nullable Format format, @Nullable O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
        this.mediaItem = mediaItem;
        this.dataSourceFactory = factory;
        this.progressiveMediaExtractorFactory = factory2;
        this.drmSessionManager = drmSessionManager;
        this.loadableLoadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.continueLoadingCheckIntervalBytes = i;
        this.singleTrackFormat = format;
        this.singleTrackId = i2;
        this.timelineIsPlaceholder = true;
        this.timelineDurationUs = C.TIME_UNSET;
        this.downloadExecutorSupplier = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
    }
}
