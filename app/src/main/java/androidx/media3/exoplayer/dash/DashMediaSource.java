package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.StreamKey;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement;
import androidx.media3.exoplayer.dash.manifest.UtcTimingElement;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.offline.FilteringManifestParser;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.DefaultCompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.MediaSourceFactory;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import androidx.media3.exoplayer.upstream.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.exoplayer.util.SntpClient;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DashMediaSource extends BaseMediaSource {
    public static final long DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS = 30000;
    public static final String DEFAULT_MEDIA_ID = "DashMediaSource";
    private static final long DEFAULT_NOTIFY_MANIFEST_INTERVAL_US = 5000000;
    public static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final String TAG = "DashMediaSource";
    private final BaseUrlExclusionList baseUrlExclusionList;
    private final DashChunkSource.Factory chunkSourceFactory;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private DataSource dataSource;
    private final DrmSessionManager drmSessionManager;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private final long fallbackTargetLiveOffsetMs;
    private int firstPeriodId;
    private Handler handler;
    private Uri initialManifestUri;
    private MediaItem.LiveConfiguration liveConfiguration;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private Loader loader;
    private DashManifest manifest;
    private final ManifestCallback manifestCallback;
    private final DataSource.Factory manifestDataSourceFactory;
    private final MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
    private IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final LoaderErrorThrower manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final ParsingLoadable.Parser<? extends DashManifest> manifestParser;
    private Uri manifestUri;
    private final Object manifestUriLock;

    @GuardedBy("this")
    private MediaItem mediaItem;

    @Nullable
    private TransferListener mediaTransferListener;
    private final long minLiveStartPositionUs;
    private final SparseArray<DashMediaPeriod> periodsById;
    private final PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
    private final Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;

    public static final class DashTimeline extends Timeline {
        private final long elapsedRealtimeEpochOffsetMs;
        private final int firstPeriodId;

        @Nullable
        private final MediaItem.LiveConfiguration liveConfiguration;
        private final DashManifest manifest;
        private final MediaItem mediaItem;
        private final long offsetInFirstPeriodUs;
        private final long presentationStartTimeMs;
        private final long windowDefaultStartPositionUs;
        private final long windowDurationUs;
        private final long windowStartTimeMs;

        public DashTimeline(long j, long j2, long j3, int i, long j4, long j5, long j6, DashManifest dashManifest, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
            Assertions.checkState(dashManifest.dynamic == (liveConfiguration != null));
            this.presentationStartTimeMs = j;
            this.windowStartTimeMs = j2;
            this.elapsedRealtimeEpochOffsetMs = j3;
            this.firstPeriodId = i;
            this.offsetInFirstPeriodUs = j4;
            this.windowDurationUs = j5;
            this.windowDefaultStartPositionUs = j6;
            this.manifest = dashManifest;
            this.mediaItem = mediaItem;
            this.liveConfiguration = liveConfiguration;
        }

        private long getAdjustedWindowDefaultStartPositionUs(long j) {
            DashSegmentIndex index;
            long j2 = this.windowDefaultStartPositionUs;
            if (!isMovingLiveWindow(this.manifest)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.windowDurationUs) {
                    return C.TIME_UNSET;
                }
            }
            long j3 = this.offsetInFirstPeriodUs + j2;
            long periodDurationUs = this.manifest.getPeriodDurationUs(0);
            int i = 0;
            while (i < this.manifest.getPeriodCount() - 1 && j3 >= periodDurationUs) {
                j3 -= periodDurationUs;
                i++;
                periodDurationUs = this.manifest.getPeriodDurationUs(i);
            }
            Period period = this.manifest.getPeriod(i);
            int adaptationSetIndex = period.getAdaptationSetIndex(2);
            return (adaptationSetIndex == -1 || (index = period.adaptationSets.get(adaptationSetIndex).representations.get(0).getIndex()) == null || index.getSegmentCount(periodDurationUs) == 0) ? j2 : (index.getTimeUs(index.getSegmentNum(j3, periodDurationUs)) + j2) - j3;
        }

        private static boolean isMovingLiveWindow(DashManifest dashManifest) {
            return dashManifest.dynamic && dashManifest.minUpdatePeriodMs != C.TIME_UNSET && dashManifest.durationMs == C.TIME_UNSET;
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.firstPeriodId) >= 0 && iIntValue < getPeriodCount()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            Assertions.checkIndex(i, 0, getPeriodCount());
            return period.set(z ? this.manifest.getPeriod(i).id : null, z ? Integer.valueOf(this.firstPeriodId + i) : null, 0, this.manifest.getPeriodDurationUs(i), Util.msToUs(this.manifest.getPeriod(i).startMs - this.manifest.getPeriod(0).startMs) - this.offsetInFirstPeriodUs);
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.manifest.getPeriodCount();
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i) {
            Assertions.checkIndex(i, 0, getPeriodCount());
            return Integer.valueOf(this.firstPeriodId + i);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            Assertions.checkIndex(i, 0, 1);
            long adjustedWindowDefaultStartPositionUs = getAdjustedWindowDefaultStartPositionUs(j);
            Object obj = Timeline.Window.SINGLE_WINDOW_UID;
            MediaItem mediaItem = this.mediaItem;
            DashManifest dashManifest = this.manifest;
            return window.set(obj, mediaItem, dashManifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, true, isMovingLiveWindow(dashManifest), this.liveConfiguration, adjustedWindowDefaultStartPositionUs, this.windowDurationUs, 0, getPeriodCount() - 1, this.offsetInFirstPeriodUs);
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    public final class DefaultPlayerEmsgCallback implements PlayerEmsgHandler.PlayerEmsgCallback {
        private DefaultPlayerEmsgCallback() {
        }

        @Override // androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestPublishTimeExpired(long j) {
            DashMediaSource.this.onDashManifestPublishTimeExpired(j);
        }

        @Override // androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestRefreshRequested() {
            DashMediaSource.this.onDashManifestRefreshRequested();
        }
    }

    public static final class Factory implements MediaSourceFactory {
        private final DashChunkSource.Factory chunkSourceFactory;

        @Nullable
        private CmcdConfiguration.Factory cmcdConfigurationFactory;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private long fallbackTargetLiveOffsetMs;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;

        @Nullable
        private final DataSource.Factory manifestDataSourceFactory;

        @Nullable
        private ParsingLoadable.Parser<? extends DashManifest> manifestParser;
        private long minLiveStartPositionUs;

        public Factory(DataSource.Factory factory) {
            this(new DefaultDashChunkSource.Factory(factory), factory);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{0};
        }

        @CanIgnoreReturnValue
        public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
            this.compositeSequenceableLoaderFactory = (CompositeSequenceableLoaderFactory) Assertions.checkNotNull(compositeSequenceableLoaderFactory, "DashMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setFallbackTargetLiveOffsetMs(long j) {
            this.fallbackTargetLiveOffsetMs = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setManifestParser(@Nullable ParsingLoadable.Parser<? extends DashManifest> parser) {
            this.manifestParser = parser;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setMinLiveStartPositionUs(long j) {
            this.minLiveStartPositionUs = j;
            return this;
        }

        public Factory(DashChunkSource.Factory factory, @Nullable DataSource.Factory factory2) {
            this.chunkSourceFactory = (DashChunkSource.Factory) Assertions.checkNotNull(factory);
            this.manifestDataSourceFactory = factory2;
            this.drmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.fallbackTargetLiveOffsetMs = DashMediaSource.DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS;
            this.minLiveStartPositionUs = 5000000L;
            this.compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
            experimentalParseSubtitlesDuringExtraction(true);
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest) {
            return createMediaSource(dashManifest, new MediaItem.Builder().setUri(Uri.EMPTY).setMediaId("DashMediaSource").setMimeType(MimeTypes.APPLICATION_MPD).build());
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @CanIgnoreReturnValue
        @Deprecated
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            this.chunkSourceFactory.experimentalParseSubtitlesDuringExtraction(z);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
            this.chunkSourceFactory.experimentalSetCodecsToParseWithinGopSampleDependencies(i);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = (CmcdConfiguration.Factory) Assertions.checkNotNull(factory);
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

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.chunkSourceFactory.setSubtitleParserFactory((SubtitleParser.Factory) Assertions.checkNotNull(factory));
            return this;
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest, MediaItem mediaItem) {
            Assertions.checkArgument(!dashManifest.dynamic);
            MediaItem.Builder mimeType = mediaItem.buildUpon().setMimeType(MimeTypes.APPLICATION_MPD);
            if (mediaItem.localConfiguration == null) {
                mimeType.setUri(Uri.EMPTY);
            }
            MediaItem mediaItemBuild = mimeType.build();
            CmcdConfiguration.Factory factory = this.cmcdConfigurationFactory;
            return new DashMediaSource(mediaItemBuild, dashManifest, null, null, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, factory == null ? null : factory.createCmcdConfiguration(mediaItemBuild), this.drmSessionManagerProvider.get(mediaItemBuild), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, this.minLiveStartPositionUs);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public DashMediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.localConfiguration);
            ParsingLoadable.Parser dashManifestParser = this.manifestParser;
            if (dashManifestParser == null) {
                dashManifestParser = new DashManifestParser();
            }
            List<StreamKey> list = mediaItem.localConfiguration.streamKeys;
            ParsingLoadable.Parser filteringManifestParser = !list.isEmpty() ? new FilteringManifestParser(dashManifestParser, list) : dashManifestParser;
            CmcdConfiguration.Factory factory = this.cmcdConfigurationFactory;
            return new DashMediaSource(mediaItem, null, this.manifestDataSourceFactory, filteringManifestParser, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, factory == null ? null : factory.createCmcdConfiguration(mediaItem), this.drmSessionManagerProvider.get(mediaItem), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, this.minLiveStartPositionUs);
        }
    }

    public static final class Iso8601Parser implements ParsingLoadable.Parser<Long> {
        private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).readLine();
            try {
                Matcher matcher = TIMESTAMP_WITH_TIMEZONE_PATTERN.matcher(line);
                if (!matcher.matches()) {
                    throw ParserException.createForMalformedManifest("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j2 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j;
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw ParserException.createForMalformedManifest(null, e);
            }
        }
    }

    public final class ManifestCallback implements Loader.Callback<ParsingLoadable<DashManifest>> {
        private ManifestCallback() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, boolean z) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j, j2);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2) {
            DashMediaSource.this.onManifestLoadCompleted(parsingLoadable, j, j2);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.onManifestLoadError(parsingLoadable, j, j2, iOException, i);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadStarted(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, int i) {
            DashMediaSource.this.onManifestLoadStarted(parsingLoadable, j, j2, i);
        }
    }

    public final class UtcTimestampCallback implements Loader.Callback<ParsingLoadable<Long>> {
        private UtcTimestampCallback() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public final /* synthetic */ void onLoadStarted(Loader.Loadable loadable, long j, long j2, int i) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, loadable, j, j2, i);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<Long> parsingLoadable, long j, long j2, boolean z) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j, j2);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j, long j2) {
            DashMediaSource.this.onUtcTimestampLoadCompleted(parsingLoadable, j, j2);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<Long> parsingLoadable, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.onUtcTimestampLoadError(parsingLoadable, j, j2, iOException);
        }
    }

    public static final class XsDateTimeParser implements ParsingLoadable.Parser<Long> {
        private XsDateTimeParser() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) {
            return Long.valueOf(Util.parseXsDateTime(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.exoplayer.dash");
    }

    private static long getAvailableEndTimeInManifestUs(Period period, long j, long j2) {
        long jMsToUs = Util.msToUs(period.startMs);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(period);
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i);
            List<Representation> list = adaptationSet.representations;
            int i2 = adaptationSet.type;
            boolean z = (i2 == 1 || i2 == 2) ? false : true;
            if ((!zHasVideoOrAudioAdaptationSets || !z) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null) {
                    return jMsToUs + j;
                }
                long availableSegmentCount = index.getAvailableSegmentCount(j, j2);
                if (availableSegmentCount == 0) {
                    return jMsToUs;
                }
                long firstAvailableSegmentNum = (index.getFirstAvailableSegmentNum(j, j2) + availableSegmentCount) - 1;
                jMin = Math.min(jMin, index.getDurationUs(firstAvailableSegmentNum, j) + index.getTimeUs(firstAvailableSegmentNum) + jMsToUs);
            }
        }
        return jMin;
    }

    private static long getAvailableStartTimeInManifestUs(Period period, long j, long j2) {
        long jMsToUs = Util.msToUs(period.startMs);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(period);
        long jMax = jMsToUs;
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i);
            List<Representation> list = adaptationSet.representations;
            int i2 = adaptationSet.type;
            boolean z = (i2 == 1 || i2 == 2) ? false : true;
            if ((!zHasVideoOrAudioAdaptationSets || !z) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null) {
                    return jMsToUs;
                }
                if (index.getAvailableSegmentCount(j, j2) == 0) {
                    return jMsToUs;
                }
                jMax = Math.max(jMax, index.getTimeUs(index.getFirstAvailableSegmentNum(j, j2)) + jMsToUs);
            }
        }
        return jMax;
    }

    private static long getIntervalUntilNextManifestRefreshMs(DashManifest dashManifest, long j) {
        DashSegmentIndex index;
        int periodCount = dashManifest.getPeriodCount() - 1;
        Period period = dashManifest.getPeriod(periodCount);
        long jMsToUs = Util.msToUs(period.startMs);
        long periodDurationUs = dashManifest.getPeriodDurationUs(periodCount);
        long jMsToUs2 = Util.msToUs(j);
        long jMsToUs3 = Util.msToUs(dashManifest.availabilityStartTimeMs);
        long jMsToUs4 = Util.msToUs(dashManifest.minUpdatePeriodMs);
        if (jMsToUs4 == C.TIME_UNSET || jMsToUs4 >= 5000000) {
            jMsToUs4 = 5000000;
        }
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            List<Representation> list = period.adaptationSets.get(i).representations;
            if (!list.isEmpty() && (index = list.get(0).getIndex()) != null) {
                long nextSegmentAvailableTimeUs = (index.getNextSegmentAvailableTimeUs(periodDurationUs, jMsToUs2) + (jMsToUs3 + jMsToUs)) - jMsToUs2;
                if (nextSegmentAvailableTimeUs > 0 && (nextSegmentAvailableTimeUs < jMsToUs4 - SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US || (nextSegmentAvailableTimeUs > jMsToUs4 && nextSegmentAvailableTimeUs < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jMsToUs4))) {
                    jMsToUs4 = nextSegmentAvailableTimeUs;
                }
            }
        }
        return org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(jMsToUs4, 1000L, RoundingMode.CEILING);
    }

    private long getManifestLoadRetryDelayMillis() {
        return Math.min((this.staleManifestReloadAttempt - 1) * 1000, 5000);
    }

    private static boolean hasVideoOrAudioAdaptationSets(Period period) {
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            int i2 = period.adaptationSets.get(i).type;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean isIndexExplicit(Period period) {
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            DashSegmentIndex index = period.adaptationSets.get(i).representations.get(0).getIndex();
            if (index == null || index.isExplicit()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        processManifest(false);
    }

    private void loadNtpTimeOffset() {
        SntpClient.initialize(this.loader, new SntpClient.InitializationCallback() { // from class: androidx.media3.exoplayer.dash.DashMediaSource.1
            @Override // androidx.media3.exoplayer.util.SntpClient.InitializationCallback
            public void onInitializationFailed(IOException iOException) {
                DashMediaSource.this.onUtcTimestampResolutionError(iOException);
            }

            @Override // androidx.media3.exoplayer.util.SntpClient.InitializationCallback
            public void onInitialized() {
                DashMediaSource.this.onUtcTimestampResolved(SntpClient.getElapsedRealtimeOffsetMs());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolutionError(IOException iOException) {
        Log.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.elapsedRealtimeOffsetMs = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        processManifest(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolved(long j) {
        this.elapsedRealtimeOffsetMs = j;
        processManifest(true);
    }

    private void processManifest(boolean z) {
        long j;
        long j2;
        for (int i = 0; i < this.periodsById.size(); i++) {
            int iKeyAt = this.periodsById.keyAt(i);
            if (iKeyAt >= this.firstPeriodId) {
                this.periodsById.valueAt(i).updateManifest(this.manifest, iKeyAt - this.firstPeriodId);
            }
        }
        Period period = this.manifest.getPeriod(0);
        int periodCount = this.manifest.getPeriodCount() - 1;
        Period period2 = this.manifest.getPeriod(periodCount);
        long periodDurationUs = this.manifest.getPeriodDurationUs(periodCount);
        long jMsToUs = Util.msToUs(Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs));
        long availableStartTimeInManifestUs = getAvailableStartTimeInManifestUs(period, this.manifest.getPeriodDurationUs(0), jMsToUs);
        long availableEndTimeInManifestUs = getAvailableEndTimeInManifestUs(period2, periodDurationUs, jMsToUs);
        boolean z2 = this.manifest.dynamic && !isIndexExplicit(period2);
        if (z2) {
            long j3 = this.manifest.timeShiftBufferDepthMs;
            if (j3 != C.TIME_UNSET) {
                availableStartTimeInManifestUs = Math.max(availableStartTimeInManifestUs, availableEndTimeInManifestUs - Util.msToUs(j3));
            }
        }
        long j4 = availableEndTimeInManifestUs - availableStartTimeInManifestUs;
        DashManifest dashManifest = this.manifest;
        if (dashManifest.dynamic) {
            Assertions.checkState(dashManifest.availabilityStartTimeMs != C.TIME_UNSET);
            long jMsToUs2 = (jMsToUs - Util.msToUs(this.manifest.availabilityStartTimeMs)) - availableStartTimeInManifestUs;
            updateLiveConfiguration(jMsToUs2, j4);
            long jUsToMs = Util.usToMs(availableStartTimeInManifestUs) + this.manifest.availabilityStartTimeMs;
            long jMsToUs3 = jMsToUs2 - Util.msToUs(this.liveConfiguration.targetOffsetMs);
            long jMin = Math.min(this.minLiveStartPositionUs, j4 / 2);
            j2 = jMsToUs3 < jMin ? jMin : jMsToUs3;
            j = jUsToMs;
        } else {
            j = C.TIME_UNSET;
            j2 = 0;
        }
        long jMsToUs4 = availableStartTimeInManifestUs - Util.msToUs(period.startMs);
        DashManifest dashManifest2 = this.manifest;
        refreshSourceInfo(new DashTimeline(dashManifest2.availabilityStartTimeMs, j, this.elapsedRealtimeOffsetMs, this.firstPeriodId, jMsToUs4, j4, j2, dashManifest2, getMediaItem(), this.manifest.dynamic ? this.liveConfiguration : null));
        if (this.sideloadedManifest) {
            return;
        }
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        if (z2) {
            this.handler.postDelayed(this.simulateManifestRefreshRunnable, getIntervalUntilNextManifestRefreshMs(this.manifest, Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs)));
        }
        if (this.manifestLoadPending) {
            startLoadingManifest();
            return;
        }
        if (z) {
            DashManifest dashManifest3 = this.manifest;
            if (dashManifest3.dynamic) {
                long j5 = dashManifest3.minUpdatePeriodMs;
                if (j5 != C.TIME_UNSET) {
                    if (j5 == 0) {
                        j5 = 5000;
                    }
                    scheduleManifestRefresh(Math.max(0L, (this.manifestLoadStartTimestampMs + j5) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void resolveUtcTimingElement(UtcTimingElement utcTimingElement) {
        String str = utcTimingElement.schemeIdUri;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            resolveUtcTimingElementDirect(utcTimingElement);
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new Iso8601Parser());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new XsDateTimeParser());
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            loadNtpTimeOffset();
        } else {
            onUtcTimestampResolutionError(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void resolveUtcTimingElementDirect(UtcTimingElement utcTimingElement) {
        try {
            onUtcTimestampResolved(Util.parseXsDateTime(utcTimingElement.value) - this.manifestLoadEndTimestampMs);
        } catch (ParserException e) {
            onUtcTimestampResolutionError(e);
        }
    }

    private void resolveUtcTimingElementHttp(UtcTimingElement utcTimingElement, ParsingLoadable.Parser<Long> parser) {
        startLoading(new ParsingLoadable(this.dataSource, Uri.parse(utcTimingElement.value), 5, parser), new UtcTimestampCallback(), 1);
    }

    private void scheduleManifestRefresh(long j) {
        this.handler.postDelayed(this.refreshManifestRunnable, j);
    }

    private <T> void startLoading(ParsingLoadable<T> parsingLoadable, Loader.Callback<ParsingLoadable<T>> callback, int i) {
        this.loader.startLoading(parsingLoadable, callback, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoadingManifest() {
        Uri uri;
        this.handler.removeCallbacks(this.refreshManifestRunnable);
        if (this.loader.hasFatalError()) {
            return;
        }
        if (this.loader.isLoading()) {
            this.manifestLoadPending = true;
            return;
        }
        synchronized (this.manifestUriLock) {
            uri = this.manifestUri;
        }
        this.manifestLoadPending = false;
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(uri).setFlags(1).build();
        if (this.cmcdConfiguration != null) {
            CmcdData.Factory objectType = new CmcdData.Factory(this.cmcdConfiguration, "d").setObjectType("m");
            DashManifest dashManifest = this.manifest;
            if (dashManifest != null) {
                objectType.setIsLive(dashManifest.dynamic);
            }
            dataSpecBuild = objectType.createCmcdData().addToDataSpec(dataSpecBuild);
        }
        startLoading(new ParsingLoadable(this.dataSource, dataSpecBuild, 4, this.manifestParser), this.manifestCallback, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(4));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    private void updateLiveConfiguration(long j, long j2) {
        long j3;
        long jMin;
        long jUsToMs;
        long j4;
        long jConstrainValue;
        long j5;
        ServiceDescriptionElement serviceDescriptionElement;
        long j6;
        long jConstrainValue2;
        float f;
        float f2;
        ServiceDescriptionElement serviceDescriptionElement2;
        ServiceDescriptionElement serviceDescriptionElement3;
        ServiceDescriptionElement serviceDescriptionElement4;
        DashManifest dashManifest;
        ServiceDescriptionElement serviceDescriptionElement5;
        long j7;
        MediaItem.LiveConfiguration liveConfiguration = getMediaItem().liveConfiguration;
        long jUsToMs2 = Util.usToMs(j);
        long j8 = liveConfiguration.maxOffsetMs;
        if (j8 == C.TIME_UNSET) {
            ServiceDescriptionElement serviceDescriptionElement6 = this.manifest.serviceDescription;
            if (serviceDescriptionElement6 != null) {
                long j9 = serviceDescriptionElement6.maxOffsetMs;
                if (j9 != C.TIME_UNSET) {
                    jMin = Math.min(jUsToMs2, j9);
                }
                jUsToMs = Util.usToMs(j - j2);
                if (jUsToMs < 0 && j3 > 0) {
                    jUsToMs = 0;
                }
                j4 = this.manifest.minBufferTimeMs;
                if (j4 != C.TIME_UNSET) {
                    jUsToMs = Math.min(jUsToMs + j4, jUsToMs2);
                }
                jConstrainValue = jUsToMs;
                j5 = liveConfiguration.minOffsetMs;
                if (j5 != C.TIME_UNSET) {
                    jConstrainValue = Util.constrainValue(j5, jConstrainValue, jUsToMs2);
                } else {
                    serviceDescriptionElement = this.manifest.serviceDescription;
                    if (serviceDescriptionElement != null) {
                        j6 = serviceDescriptionElement.minOffsetMs;
                        if (j6 != C.TIME_UNSET) {
                            jConstrainValue = Util.constrainValue(j6, jConstrainValue, jUsToMs2);
                        }
                    }
                }
                if (jConstrainValue > j3) {
                    j3 = jConstrainValue;
                }
                jConstrainValue2 = this.liveConfiguration.targetOffsetMs;
                if (jConstrainValue2 == C.TIME_UNSET) {
                    dashManifest = this.manifest;
                    serviceDescriptionElement5 = dashManifest.serviceDescription;
                    if (serviceDescriptionElement5 != null) {
                        j7 = serviceDescriptionElement5.targetOffsetMs;
                        if (j7 != C.TIME_UNSET) {
                            jConstrainValue2 = j7;
                        } else {
                            jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                            if (jConstrainValue2 == C.TIME_UNSET) {
                                jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                            }
                        }
                    } else {
                        jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                        if (jConstrainValue2 == C.TIME_UNSET) {
                            jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                        }
                    }
                }
                if (jConstrainValue2 < jConstrainValue) {
                    jConstrainValue2 = jConstrainValue;
                }
                if (jConstrainValue2 > j3) {
                    jConstrainValue2 = Util.constrainValue(Util.usToMs(j - Math.min(this.minLiveStartPositionUs, j2 / 2)), jConstrainValue, j3);
                }
                f = liveConfiguration.minPlaybackSpeed;
                if (f == -3.4028235E38f) {
                    serviceDescriptionElement4 = this.manifest.serviceDescription;
                    if (serviceDescriptionElement4 != null) {
                        f = serviceDescriptionElement4.minPlaybackSpeed;
                    } else {
                        f = -3.4028235E38f;
                    }
                }
                f2 = liveConfiguration.maxPlaybackSpeed;
                if (f2 == -3.4028235E38f) {
                    serviceDescriptionElement3 = this.manifest.serviceDescription;
                    if (serviceDescriptionElement3 != null) {
                        f2 = serviceDescriptionElement3.maxPlaybackSpeed;
                    } else {
                        f2 = -3.4028235E38f;
                    }
                }
                if (f == -3.4028235E38f && f2 == -3.4028235E38f && ((serviceDescriptionElement2 = this.manifest.serviceDescription) == null || serviceDescriptionElement2.targetOffsetMs == C.TIME_UNSET)) {
                    f = 1.0f;
                    f2 = 1.0f;
                }
                this.liveConfiguration = new MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(jConstrainValue2).setMinOffsetMs(jConstrainValue).setMaxOffsetMs(j3).setMinPlaybackSpeed(f).setMaxPlaybackSpeed(f2).build();
            }
            j3 = jUsToMs2;
            jUsToMs = Util.usToMs(j - j2);
            if (jUsToMs < 0) {
                jUsToMs = 0;
            }
            j4 = this.manifest.minBufferTimeMs;
            if (j4 != C.TIME_UNSET) {
                jUsToMs = Math.min(jUsToMs + j4, jUsToMs2);
            }
            jConstrainValue = jUsToMs;
            j5 = liveConfiguration.minOffsetMs;
            if (j5 != C.TIME_UNSET) {
                jConstrainValue = Util.constrainValue(j5, jConstrainValue, jUsToMs2);
            } else {
                serviceDescriptionElement = this.manifest.serviceDescription;
                if (serviceDescriptionElement != null) {
                    j6 = serviceDescriptionElement.minOffsetMs;
                    if (j6 != C.TIME_UNSET) {
                        jConstrainValue = Util.constrainValue(j6, jConstrainValue, jUsToMs2);
                    }
                }
            }
            if (jConstrainValue > j3) {
                j3 = jConstrainValue;
            }
            jConstrainValue2 = this.liveConfiguration.targetOffsetMs;
            if (jConstrainValue2 == C.TIME_UNSET) {
                dashManifest = this.manifest;
                serviceDescriptionElement5 = dashManifest.serviceDescription;
                if (serviceDescriptionElement5 != null) {
                    j7 = serviceDescriptionElement5.targetOffsetMs;
                    if (j7 != C.TIME_UNSET) {
                        jConstrainValue2 = j7;
                    } else {
                        jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                        if (jConstrainValue2 == C.TIME_UNSET) {
                            jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                        }
                    }
                } else {
                    jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                    if (jConstrainValue2 == C.TIME_UNSET) {
                        jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                    }
                }
            }
            if (jConstrainValue2 < jConstrainValue) {
                jConstrainValue2 = jConstrainValue;
            }
            if (jConstrainValue2 > j3) {
                jConstrainValue2 = Util.constrainValue(Util.usToMs(j - Math.min(this.minLiveStartPositionUs, j2 / 2)), jConstrainValue, j3);
            }
            f = liveConfiguration.minPlaybackSpeed;
            if (f == -3.4028235E38f) {
                serviceDescriptionElement4 = this.manifest.serviceDescription;
                if (serviceDescriptionElement4 != null) {
                    f = serviceDescriptionElement4.minPlaybackSpeed;
                } else {
                    f = -3.4028235E38f;
                }
            }
            f2 = liveConfiguration.maxPlaybackSpeed;
            if (f2 == -3.4028235E38f) {
                serviceDescriptionElement3 = this.manifest.serviceDescription;
                if (serviceDescriptionElement3 != null) {
                    f2 = serviceDescriptionElement3.maxPlaybackSpeed;
                } else {
                    f2 = -3.4028235E38f;
                }
            }
            if (f == -3.4028235E38f) {
                f = 1.0f;
                f2 = 1.0f;
            }
            this.liveConfiguration = new MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(jConstrainValue2).setMinOffsetMs(jConstrainValue).setMaxOffsetMs(j3).setMinPlaybackSpeed(f).setMaxPlaybackSpeed(f2).build();
        }
        jMin = Math.min(jUsToMs2, j8);
        j3 = jMin;
        jUsToMs = Util.usToMs(j - j2);
        if (jUsToMs < 0) {
            jUsToMs = 0;
        }
        j4 = this.manifest.minBufferTimeMs;
        if (j4 != C.TIME_UNSET) {
            jUsToMs = Math.min(jUsToMs + j4, jUsToMs2);
        }
        jConstrainValue = jUsToMs;
        j5 = liveConfiguration.minOffsetMs;
        if (j5 != C.TIME_UNSET) {
            jConstrainValue = Util.constrainValue(j5, jConstrainValue, jUsToMs2);
        } else {
            serviceDescriptionElement = this.manifest.serviceDescription;
            if (serviceDescriptionElement != null) {
                j6 = serviceDescriptionElement.minOffsetMs;
                if (j6 != C.TIME_UNSET) {
                    jConstrainValue = Util.constrainValue(j6, jConstrainValue, jUsToMs2);
                }
            }
        }
        if (jConstrainValue > j3) {
            j3 = jConstrainValue;
        }
        jConstrainValue2 = this.liveConfiguration.targetOffsetMs;
        if (jConstrainValue2 == C.TIME_UNSET) {
            dashManifest = this.manifest;
            serviceDescriptionElement5 = dashManifest.serviceDescription;
            if (serviceDescriptionElement5 != null) {
                j7 = serviceDescriptionElement5.targetOffsetMs;
                if (j7 != C.TIME_UNSET) {
                    jConstrainValue2 = j7;
                } else {
                    jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                    if (jConstrainValue2 == C.TIME_UNSET) {
                        jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                    }
                }
            } else {
                jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                if (jConstrainValue2 == C.TIME_UNSET) {
                    jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                }
            }
        }
        if (jConstrainValue2 < jConstrainValue) {
            jConstrainValue2 = jConstrainValue;
        }
        if (jConstrainValue2 > j3) {
            jConstrainValue2 = Util.constrainValue(Util.usToMs(j - Math.min(this.minLiveStartPositionUs, j2 / 2)), jConstrainValue, j3);
        }
        f = liveConfiguration.minPlaybackSpeed;
        if (f == -3.4028235E38f) {
            serviceDescriptionElement4 = this.manifest.serviceDescription;
            if (serviceDescriptionElement4 != null) {
                f = serviceDescriptionElement4.minPlaybackSpeed;
            } else {
                f = -3.4028235E38f;
            }
        }
        f2 = liveConfiguration.maxPlaybackSpeed;
        if (f2 == -3.4028235E38f) {
            serviceDescriptionElement3 = this.manifest.serviceDescription;
            if (serviceDescriptionElement3 != null) {
                f2 = serviceDescriptionElement3.maxPlaybackSpeed;
            } else {
                f2 = -3.4028235E38f;
            }
        }
        if (f == -3.4028235E38f) {
            f = 1.0f;
            f2 = 1.0f;
        }
        this.liveConfiguration = new MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(jConstrainValue2).setMinOffsetMs(jConstrainValue).setMaxOffsetMs(j3).setMinPlaybackSpeed(f).setMaxPlaybackSpeed(f2).build();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        MediaItem mediaItem2 = getMediaItem();
        MediaItem.LocalConfiguration localConfiguration = (MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem2.localConfiguration);
        MediaItem.LocalConfiguration localConfiguration2 = mediaItem.localConfiguration;
        return localConfiguration2 != null && localConfiguration2.uri.equals(localConfiguration.uri) && localConfiguration2.streamKeys.equals(localConfiguration.streamKeys) && Objects.equals(localConfiguration2.drmConfiguration, localConfiguration.drmConfiguration) && mediaItem2.liveConfiguration.equals(mediaItem.liveConfiguration);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        int iIntValue = ((Integer) mediaPeriodId.periodUid).intValue() - this.firstPeriodId;
        MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(mediaPeriodId);
        DashMediaPeriod dashMediaPeriod = new DashMediaPeriod(iIntValue + this.firstPeriodId, this.manifest, this.baseUrlExclusionList, iIntValue, this.chunkSourceFactory, this.mediaTransferListener, this.cmcdConfiguration, this.drmSessionManager, createDrmEventDispatcher(mediaPeriodId), this.loadErrorHandlingPolicy, eventDispatcherCreateEventDispatcher, this.elapsedRealtimeOffsetMs, this.manifestLoadErrorThrower, allocator, this.compositeSequenceableLoaderFactory, this.playerEmsgCallback, getPlayerId());
        this.periodsById.put(dashMediaPeriod.id, dashMediaPeriod);
        return dashMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
        this.manifestLoadErrorThrower.maybeThrowError();
    }

    public void onDashManifestPublishTimeExpired(long j) {
        long j2 = this.expiredManifestPublishTimeUs;
        if (j2 == C.TIME_UNSET || j2 < j) {
            this.expiredManifestPublishTimeUs = j;
        }
    }

    public void onDashManifestRefreshRequested() {
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        startLoadingManifest();
    }

    public void onLoadCanceled(ParsingLoadable<?> parsingLoadable, long j, long j2) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCanceled(loadEventInfo, parsingLoadable.type);
    }

    public void onManifestLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCompleted(loadEventInfo, parsingLoadable.type);
        DashManifest result = parsingLoadable.getResult();
        DashManifest dashManifest = this.manifest;
        int periodCount = dashManifest == null ? 0 : dashManifest.getPeriodCount();
        long j3 = result.getPeriod(0).startMs;
        int i = 0;
        while (i < periodCount && this.manifest.getPeriod(i).startMs < j3) {
            i++;
        }
        if (result.dynamic) {
            if (periodCount - i > result.getPeriodCount()) {
                Log.w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j4 = this.expiredManifestPublishTimeUs;
                if (j4 == C.TIME_UNSET || result.publishTimeMs * 1000 > j4) {
                    this.staleManifestReloadAttempt = 0;
                } else {
                    Log.w("DashMediaSource", "Loaded stale dynamic manifest: " + result.publishTimeMs + ", " + this.expiredManifestPublishTimeUs);
                }
            }
            int i2 = this.staleManifestReloadAttempt;
            this.staleManifestReloadAttempt = i2 + 1;
            if (i2 < this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type)) {
                scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
                return;
            } else {
                this.manifestFatalError = new DashManifestStaleException();
                return;
            }
        }
        this.manifest = result;
        this.manifestLoadPending = result.dynamic & this.manifestLoadPending;
        this.manifestLoadStartTimestampMs = j - j2;
        this.manifestLoadEndTimestampMs = j;
        this.firstPeriodId += i;
        synchronized (this.manifestUriLock) {
            try {
                if (parsingLoadable.dataSpec.uri.equals(this.manifestUri) || (this.cmcdConfiguration != null && CmcdData.removeFromUri(parsingLoadable.dataSpec.uri).equals(this.manifestUri))) {
                    Uri uriRemoveFromUri = this.manifest.location;
                    if (uriRemoveFromUri == null) {
                        uriRemoveFromUri = CmcdData.removeFromUri(parsingLoadable.getUri());
                    }
                    this.manifestUri = uriRemoveFromUri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        DashManifest dashManifest2 = this.manifest;
        if (!dashManifest2.dynamic || this.elapsedRealtimeOffsetMs != C.TIME_UNSET) {
            processManifest(true);
            return;
        }
        UtcTimingElement utcTimingElement = dashManifest2.utcTiming;
        if (utcTimingElement != null) {
            resolveUtcTimingElement(utcTimingElement);
        } else {
            loadNtpTimeOffset();
        }
    }

    public Loader.LoadErrorAction onManifestLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, IOException iOException, int i) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(parsingLoadable.type), iOException, i));
        Loader.LoadErrorAction loadErrorActionCreateRetryAction = retryDelayMsFor == C.TIME_UNSET ? Loader.DONT_RETRY_FATAL : Loader.createRetryAction(false, retryDelayMsFor);
        boolean zIsRetry = loadErrorActionCreateRetryAction.isRetry();
        this.manifestEventDispatcher.loadError(loadEventInfo, parsingLoadable.type, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        }
        return loadErrorActionCreateRetryAction;
    }

    public void onManifestLoadStarted(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, int i) {
        this.manifestEventDispatcher.loadStarted(i == 0 ? new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, j) : new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded()), parsingLoadable.type, i);
    }

    public void onUtcTimestampLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j, long j2) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCompleted(loadEventInfo, parsingLoadable.type);
        onUtcTimestampResolved(parsingLoadable.getResult().longValue() - j);
    }

    public Loader.LoadErrorAction onUtcTimestampLoadError(ParsingLoadable<Long> parsingLoadable, long j, long j2, IOException iOException) {
        this.manifestEventDispatcher.loadError(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded()), parsingLoadable.type, iOException, true);
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        onUtcTimestampResolutionError(iOException);
        return Loader.DONT_RETRY;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.drmSessionManager.setPlayer(Looper.myLooper(), getPlayerId());
        this.drmSessionManager.prepare();
        if (this.sideloadedManifest) {
            processManifest(false);
            return;
        }
        this.dataSource = this.manifestDataSourceFactory.createDataSource();
        this.loader = new Loader("DashMediaSource");
        this.handler = Util.createHandlerForCurrentLooper();
        startLoadingManifest();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) mediaPeriod;
        dashMediaPeriod.release();
        this.periodsById.remove(dashMediaPeriod.id);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.manifestLoadPending = false;
        this.dataSource = null;
        Loader loader = this.loader;
        if (loader != null) {
            loader.release();
            this.loader = null;
        }
        this.manifestLoadStartTimestampMs = 0L;
        this.manifestLoadEndTimestampMs = 0L;
        this.manifestUri = this.initialManifestUri;
        this.manifestFatalError = null;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
        this.elapsedRealtimeOffsetMs = C.TIME_UNSET;
        this.staleManifestReloadAttempt = 0;
        this.expiredManifestPublishTimeUs = C.TIME_UNSET;
        this.periodsById.clear();
        this.baseUrlExclusionList.reset();
        this.drmSessionManager.release();
    }

    public void replaceManifestUri(Uri uri) {
        synchronized (this.manifestUriLock) {
            this.manifestUri = uri;
            this.initialManifestUri = uri;
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    public final class ManifestLoadErrorThrower implements LoaderErrorThrower {
        public ManifestLoadErrorThrower() {
        }

        private void maybeThrowManifestError() throws IOException {
            if (DashMediaSource.this.manifestFatalError != null) {
                throw DashMediaSource.this.manifestFatalError;
            }
        }

        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError() throws IOException {
            DashMediaSource.this.loader.maybeThrowError();
            maybeThrowManifestError();
        }

        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError(int i) throws IOException {
            DashMediaSource.this.loader.maybeThrowError(i);
            maybeThrowManifestError();
        }
    }

    private DashMediaSource(MediaItem mediaItem, @Nullable DashManifest dashManifest, @Nullable DataSource.Factory factory, @Nullable ParsingLoadable.Parser<? extends DashManifest> parser, DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, @Nullable CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j, long j2) {
        this.mediaItem = mediaItem;
        this.liveConfiguration = mediaItem.liveConfiguration;
        this.manifestUri = ((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)).uri;
        this.initialManifestUri = mediaItem.localConfiguration.uri;
        this.manifest = dashManifest;
        this.manifestDataSourceFactory = factory;
        this.manifestParser = parser;
        this.chunkSourceFactory = factory2;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.fallbackTargetLiveOffsetMs = j;
        this.minLiveStartPositionUs = j2;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.baseUrlExclusionList = new BaseUrlExclusionList();
        boolean z = dashManifest != null;
        this.sideloadedManifest = z;
        this.manifestEventDispatcher = createEventDispatcher(null);
        this.manifestUriLock = new Object();
        this.periodsById = new SparseArray<>();
        this.playerEmsgCallback = new DefaultPlayerEmsgCallback();
        this.expiredManifestPublishTimeUs = C.TIME_UNSET;
        this.elapsedRealtimeOffsetMs = C.TIME_UNSET;
        if (z) {
            Assertions.checkState(true ^ dashManifest.dynamic);
            this.manifestCallback = null;
            this.refreshManifestRunnable = null;
            this.simulateManifestRefreshRunnable = null;
            this.manifestLoadErrorThrower = new LoaderErrorThrower.Placeholder();
            return;
        }
        this.manifestCallback = new ManifestCallback();
        this.manifestLoadErrorThrower = new ManifestLoadErrorThrower();
        final int i = 0;
        this.refreshManifestRunnable = new Runnable(this) { // from class: androidx.media3.exoplayer.dash.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ DashMediaSource f2531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f2531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f2531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.startLoadingManifest();
                        break;
                    default:
                        this.f2531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$new$0();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.simulateManifestRefreshRunnable = new Runnable(this) { // from class: androidx.media3.exoplayer.dash.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo

            /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
            public final /* synthetic */ DashMediaSource f2531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

            {
                this.f2531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f2531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.startLoadingManifest();
                        break;
                    default:
                        this.f2531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$new$0();
                        break;
                }
            }
        };
    }
}
