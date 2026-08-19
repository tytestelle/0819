package androidx.media3.exoplayer.dash;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.chunk.BaseMediaChunkIterator;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.chunk.ChunkHolder;
import androidx.media3.exoplayer.source.chunk.ContainerMediaChunk;
import androidx.media3.exoplayer.source.chunk.InitializationChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.source.chunk.SingleSampleMediaChunk;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultDashChunkSource implements DashChunkSource {
    private final int[] adaptationSetIndices;
    private final BaseUrlExclusionList baseUrlExclusionList;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private final DataSource dataSource;
    private final long elapsedRealtimeOffsetMs;

    @Nullable
    private IOException fatalError;
    private long lastChunkRequestRealtimeMs = C.TIME_UNSET;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int maxSegmentsPerLoad;
    private boolean missingLastSegment;
    private int periodIndex;

    @Nullable
    private final PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
    protected final RepresentationHolder[] representationHolders;
    private ExoTrackSelection trackSelection;
    private final int trackType;

    public static final class Factory implements DashChunkSource.Factory {
        private final ChunkExtractor.Factory chunkExtractorFactory;
        private final DataSource.Factory dataSourceFactory;
        private final int maxSegmentsPerLoad;

        public Factory(DataSource.Factory factory) {
            this(factory, 1);
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        public DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i, int[] iArr, ExoTrackSelection exoTrackSelection, int i2, long j, boolean z, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, @Nullable TransferListener transferListener, PlayerId playerId, @Nullable CmcdConfiguration cmcdConfiguration) {
            DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
            if (transferListener != null) {
                dataSourceCreateDataSource.addTransferListener(transferListener);
            }
            return new DefaultDashChunkSource(this.chunkExtractorFactory, loaderErrorThrower, dashManifest, baseUrlExclusionList, i, iArr, exoTrackSelection, i2, dataSourceCreateDataSource, j, this.maxSegmentsPerLoad, z, list, playerTrackEmsgHandler, playerId, cmcdConfiguration);
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        public Format getOutputTextFormat(Format format) {
            return this.chunkExtractorFactory.getOutputTextFormat(format);
        }

        public Factory(DataSource.Factory factory, int i) {
            this(new BundledChunkExtractor.Factory(), factory, i);
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        @CanIgnoreReturnValue
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            this.chunkExtractorFactory.experimentalParseSubtitlesDuringExtraction(z);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        @CanIgnoreReturnValue
        public Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
            this.chunkExtractorFactory.experimentalSetCodecsToParseWithinGopSampleDependencies(i);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        @CanIgnoreReturnValue
        public Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.chunkExtractorFactory.setSubtitleParserFactory(factory);
            return this;
        }

        public Factory(ChunkExtractor.Factory factory, DataSource.Factory factory2, int i) {
            this.chunkExtractorFactory = factory;
            this.dataSourceFactory = factory2;
            this.maxSegmentsPerLoad = i;
        }
    }

    public static final class RepresentationHolder {

        @Nullable
        final ChunkExtractor chunkExtractor;
        private final long periodDurationUs;
        public final Representation representation;

        @Nullable
        public final DashSegmentIndex segmentIndex;
        private final long segmentNumShift;
        public final BaseUrl selectedBaseUrl;

        public RepresentationHolder(long j, Representation representation, BaseUrl baseUrl, @Nullable ChunkExtractor chunkExtractor, long j2, @Nullable DashSegmentIndex dashSegmentIndex) {
            this.periodDurationUs = j;
            this.representation = representation;
            this.selectedBaseUrl = baseUrl;
            this.segmentNumShift = j2;
            this.chunkExtractor = chunkExtractor;
            this.segmentIndex = dashSegmentIndex;
        }

        @CheckResult
        public RepresentationHolder copyWithNewRepresentation(long j, Representation representation) throws BehindLiveWindowException {
            long segmentNum;
            DashSegmentIndex index = this.representation.getIndex();
            DashSegmentIndex index2 = representation.getIndex();
            if (index == null) {
                return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index);
            }
            if (!index.isExplicit()) {
                return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            long segmentCount = index.getSegmentCount(j);
            if (segmentCount == 0) {
                return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            Assertions.checkStateNotNull(index2);
            long firstSegmentNum = index.getFirstSegmentNum();
            long timeUs = index.getTimeUs(firstSegmentNum);
            long j2 = segmentCount + firstSegmentNum;
            long j3 = j2 - 1;
            long durationUs = index.getDurationUs(j3, j) + index.getTimeUs(j3);
            long firstSegmentNum2 = index2.getFirstSegmentNum();
            long timeUs2 = index2.getTimeUs(firstSegmentNum2);
            long j4 = this.segmentNumShift;
            if (durationUs == timeUs2) {
                segmentNum = (j2 - firstSegmentNum2) + j4;
            } else {
                if (durationUs < timeUs2) {
                    throw new BehindLiveWindowException();
                }
                segmentNum = timeUs2 < timeUs ? j4 - (index2.getSegmentNum(timeUs, j) - firstSegmentNum) : (index.getSegmentNum(timeUs2, j) - firstSegmentNum2) + j4;
            }
            return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, segmentNum, index2);
        }

        @CheckResult
        public RepresentationHolder copyWithNewSegmentIndex(DashSegmentIndex dashSegmentIndex) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, dashSegmentIndex);
        }

        @CheckResult
        public RepresentationHolder copyWithNewSelectedBaseUrl(BaseUrl baseUrl) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, baseUrl, this.chunkExtractor, this.segmentNumShift, this.segmentIndex);
        }

        public long getFirstAvailableSegmentNum(long j) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getFirstAvailableSegmentNum(this.periodDurationUs, j) + this.segmentNumShift;
        }

        public long getFirstSegmentNum() {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getFirstSegmentNum() + this.segmentNumShift;
        }

        public long getLastAvailableSegmentNum(long j) {
            return (((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getAvailableSegmentCount(this.periodDurationUs, j) + getFirstAvailableSegmentNum(j)) - 1;
        }

        public long getSegmentCount() {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getSegmentCount(this.periodDurationUs);
        }

        public long getSegmentEndTimeUs(long j) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getDurationUs(j - this.segmentNumShift, this.periodDurationUs) + getSegmentStartTimeUs(j);
        }

        public long getSegmentNum(long j) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getSegmentNum(j, this.periodDurationUs) + this.segmentNumShift;
        }

        public long getSegmentStartTimeUs(long j) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getTimeUs(j - this.segmentNumShift);
        }

        public RangedUri getSegmentUrl(long j) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getSegmentUrl(j - this.segmentNumShift);
        }

        public boolean isSegmentAvailableAtFullNetworkSpeed(long j, long j2) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).isExplicit() || j2 == C.TIME_UNSET || getSegmentEndTimeUs(j) <= j2;
        }
    }

    public static final class RepresentationSegmentIterator extends BaseMediaChunkIterator {
        private final long nowPeriodTimeUs;
        private final RepresentationHolder representationHolder;

        public RepresentationSegmentIterator(RepresentationHolder representationHolder, long j, long j2, long j3) {
            super(j, j2);
            this.representationHolder = representationHolder;
            this.nowPeriodTimeUs = j3;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentEndTimeUs(getCurrentIndex());
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentStartTimeUs(getCurrentIndex());
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            long currentIndex = getCurrentIndex();
            RangedUri segmentUrl = this.representationHolder.getSegmentUrl(currentIndex);
            int i = this.representationHolder.isSegmentAvailableAtFullNetworkSpeed(currentIndex, this.nowPeriodTimeUs) ? 0 : 8;
            RepresentationHolder representationHolder = this.representationHolder;
            return DashUtil.buildDataSpec(representationHolder.representation, representationHolder.selectedBaseUrl.url, segmentUrl, i, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of());
        }
    }

    public DefaultDashChunkSource(ChunkExtractor.Factory factory, LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i, int[] iArr, ExoTrackSelection exoTrackSelection, int i2, DataSource dataSource, long j, int i3, boolean z, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, PlayerId playerId, @Nullable CmcdConfiguration cmcdConfiguration) {
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = dashManifest;
        this.baseUrlExclusionList = baseUrlExclusionList;
        this.adaptationSetIndices = iArr;
        this.trackSelection = exoTrackSelection;
        this.trackType = i2;
        this.dataSource = dataSource;
        this.periodIndex = i;
        this.elapsedRealtimeOffsetMs = j;
        this.maxSegmentsPerLoad = i3;
        this.playerTrackEmsgHandler = playerTrackEmsgHandler;
        this.cmcdConfiguration = cmcdConfiguration;
        long periodDurationUs = dashManifest.getPeriodDurationUs(i);
        ArrayList<Representation> representations = getRepresentations();
        this.representationHolders = new RepresentationHolder[exoTrackSelection.length()];
        int i4 = 0;
        while (i4 < this.representationHolders.length) {
            Representation representation = representations.get(exoTrackSelection.getIndexInTrackGroup(i4));
            BaseUrl baseUrlSelectBaseUrl = baseUrlExclusionList.selectBaseUrl(representation.baseUrls);
            int i5 = i4;
            this.representationHolders[i5] = new RepresentationHolder(periodDurationUs, representation, baseUrlSelectBaseUrl == null ? (BaseUrl) representation.baseUrls.get(0) : baseUrlSelectBaseUrl, factory.createProgressiveMediaExtractor(i2, representation.format, z, list, playerTrackEmsgHandler, playerId), 0L, representation.getIndex());
            i4 = i5 + 1;
        }
    }

    private LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(ExoTrackSelection exoTrackSelection, List<BaseUrl> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (exoTrackSelection.isTrackExcluded(i2, jElapsedRealtime)) {
                i++;
            }
        }
        int priorityCount = BaseUrlExclusionList.getPriorityCount(list);
        return new LoadErrorHandlingPolicy.FallbackOptions(priorityCount, priorityCount - this.baseUrlExclusionList.getPriorityCountAfterExclusion(list), length, i);
    }

    private long getAvailableLiveDurationUs(long j, long j2) {
        if (!this.manifest.dynamic || this.representationHolders[0].getSegmentCount() == 0) {
            return C.TIME_UNSET;
        }
        return Math.max(0L, Math.min(getNowPeriodTimeUs(j), this.representationHolders[0].getSegmentEndTimeUs(this.representationHolders[0].getLastAvailableSegmentNum(j))) - j2);
    }

    @Nullable
    private Pair<String, String> getNextObjectAndRangeRequest(long j, RangedUri rangedUri, RepresentationHolder representationHolder) {
        long j2 = j + 1;
        if (j2 >= representationHolder.getSegmentCount()) {
            return null;
        }
        RangedUri segmentUrl = representationHolder.getSegmentUrl(j2);
        String relativePath = UriUtil.getRelativePath(rangedUri.resolveUri(representationHolder.selectedBaseUrl.url), segmentUrl.resolveUri(representationHolder.selectedBaseUrl.url));
        String strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(new StringBuilder(), segmentUrl.start, "-");
        if (segmentUrl.length != -1) {
            StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(segmentUrl.start + segmentUrl.length);
            strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
        }
        return new Pair<>(relativePath, strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
    }

    private long getNowPeriodTimeUs(long j) {
        DashManifest dashManifest = this.manifest;
        long j2 = dashManifest.availabilityStartTimeMs;
        return j2 == C.TIME_UNSET ? C.TIME_UNSET : j - Util.msToUs(j2 + dashManifest.getPeriod(this.periodIndex).startMs);
    }

    @RequiresNonNull({"manifest", "adaptationSetIndices"})
    private ArrayList<Representation> getRepresentations() {
        List<AdaptationSet> list = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i : this.adaptationSetIndices) {
            arrayList.addAll(list.get(i).representations);
        }
        return arrayList;
    }

    private long getSegmentNum(RepresentationHolder representationHolder, @Nullable MediaChunk mediaChunk, long j, long j2, long j3) {
        return mediaChunk != null ? mediaChunk.getNextChunkIndex() : Util.constrainValue(representationHolder.getSegmentNum(j), j2, j3);
    }

    private RepresentationHolder updateSelectedBaseUrl(int i) {
        RepresentationHolder representationHolder = this.representationHolders[i];
        BaseUrl baseUrlSelectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder.representation.baseUrls);
        if (baseUrlSelectBaseUrl == null || baseUrlSelectBaseUrl.equals(representationHolder.selectedBaseUrl)) {
            return representationHolder;
        }
        RepresentationHolder representationHolderCopyWithNewSelectedBaseUrl = representationHolder.copyWithNewSelectedBaseUrl(baseUrlSelectBaseUrl);
        this.representationHolders[i] = representationHolderCopyWithNewSelectedBaseUrl;
        return representationHolderCopyWithNewSelectedBaseUrl;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            if (representationHolder.segmentIndex != null) {
                long segmentCount = representationHolder.getSegmentCount();
                if (segmentCount != 0) {
                    long segmentNum = representationHolder.getSegmentNum(j);
                    long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(segmentNum);
                    return seekParameters.resolveSeekPositionUs(j, segmentStartTimeUs, (segmentStartTimeUs >= j || (segmentCount != -1 && segmentNum >= (representationHolder.getFirstSegmentNum() + segmentCount) - 1)) ? segmentStartTimeUs : representationHolder.getSegmentStartTimeUs(segmentNum + 1));
                }
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void getNextChunk(LoadingInfo loadingInfo, long j, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        int i;
        int i2;
        MediaChunkIterator[] mediaChunkIteratorArr;
        long j2;
        long j3;
        if (this.fatalError != null) {
            return;
        }
        long j4 = loadingInfo.playbackPositionUs;
        long j5 = j - j4;
        long jMsToUs = Util.msToUs(this.manifest.getPeriod(this.periodIndex).startMs) + Util.msToUs(this.manifest.availabilityStartTimeMs) + j;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler == null || !playerTrackEmsgHandler.maybeRefreshManifestBeforeLoadingNextChunk(jMsToUs)) {
            long jMsToUs2 = Util.msToUs(Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs));
            long nowPeriodTimeUs = getNowPeriodTimeUs(jMsToUs2);
            MediaChunk mediaChunk = list.isEmpty() ? null : (MediaChunk) O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(list, 1);
            int length = this.trackSelection.length();
            MediaChunkIterator[] mediaChunkIteratorArr2 = new MediaChunkIterator[length];
            int i3 = 0;
            while (i3 < length) {
                RepresentationHolder representationHolder = this.representationHolders[i3];
                if (representationHolder.segmentIndex == null) {
                    mediaChunkIteratorArr2[i3] = MediaChunkIterator.EMPTY;
                    i = i3;
                    i2 = length;
                    mediaChunkIteratorArr = mediaChunkIteratorArr2;
                    j2 = j5;
                    j3 = jMsToUs2;
                } else {
                    long firstAvailableSegmentNum = representationHolder.getFirstAvailableSegmentNum(jMsToUs2);
                    long lastAvailableSegmentNum = representationHolder.getLastAvailableSegmentNum(jMsToUs2);
                    i = i3;
                    i2 = length;
                    mediaChunkIteratorArr = mediaChunkIteratorArr2;
                    j2 = j5;
                    j3 = jMsToUs2;
                    long segmentNum = getSegmentNum(representationHolder, mediaChunk, j, firstAvailableSegmentNum, lastAvailableSegmentNum);
                    if (segmentNum < firstAvailableSegmentNum) {
                        mediaChunkIteratorArr[i] = MediaChunkIterator.EMPTY;
                    } else {
                        mediaChunkIteratorArr[i] = new RepresentationSegmentIterator(updateSelectedBaseUrl(i), segmentNum, lastAvailableSegmentNum, nowPeriodTimeUs);
                    }
                }
                i3 = i + 1;
                jMsToUs2 = j3;
                length = i2;
                mediaChunkIteratorArr2 = mediaChunkIteratorArr;
                j5 = j2;
            }
            long j6 = j5;
            long j7 = jMsToUs2;
            this.trackSelection.updateSelectedTrack(j4, j6, getAvailableLiveDurationUs(j7, j4), list, mediaChunkIteratorArr2);
            int selectedIndex = this.trackSelection.getSelectedIndex();
            CmcdData.Factory isBufferEmpty = this.cmcdConfiguration == null ? null : new CmcdData.Factory(this.cmcdConfiguration, "d").setTrackSelection(this.trackSelection).setBufferedDurationUs(Math.max(0L, j6)).setPlaybackRate(loadingInfo.playbackSpeed).setIsLive(this.manifest.dynamic).setDidRebuffer(loadingInfo.rebufferedSince(this.lastChunkRequestRealtimeMs)).setIsBufferEmpty(list.isEmpty());
            this.lastChunkRequestRealtimeMs = SystemClock.elapsedRealtime();
            RepresentationHolder representationHolderUpdateSelectedBaseUrl = updateSelectedBaseUrl(selectedIndex);
            ChunkExtractor chunkExtractor = representationHolderUpdateSelectedBaseUrl.chunkExtractor;
            if (chunkExtractor != null) {
                Representation representation = representationHolderUpdateSelectedBaseUrl.representation;
                RangedUri initializationUri = chunkExtractor.getSampleFormats() == null ? representation.getInitializationUri() : null;
                RangedUri indexUri = representationHolderUpdateSelectedBaseUrl.segmentIndex == null ? representation.getIndexUri() : null;
                if (initializationUri != null || indexUri != null) {
                    chunkHolder.chunk = newInitializationChunk(representationHolderUpdateSelectedBaseUrl, this.dataSource, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), initializationUri, indexUri, isBufferEmpty);
                    return;
                }
            }
            long j8 = representationHolderUpdateSelectedBaseUrl.periodDurationUs;
            DashManifest dashManifest = this.manifest;
            boolean z = dashManifest.dynamic && this.periodIndex == dashManifest.getPeriodCount() - 1;
            long j9 = C.TIME_UNSET;
            boolean z2 = (z && j8 == C.TIME_UNSET) ? false : true;
            if (representationHolderUpdateSelectedBaseUrl.getSegmentCount() == 0) {
                chunkHolder.endOfStream = z2;
                return;
            }
            long firstAvailableSegmentNum2 = representationHolderUpdateSelectedBaseUrl.getFirstAvailableSegmentNum(j7);
            long lastAvailableSegmentNum2 = representationHolderUpdateSelectedBaseUrl.getLastAvailableSegmentNum(j7);
            if (z) {
                long segmentEndTimeUs = representationHolderUpdateSelectedBaseUrl.getSegmentEndTimeUs(lastAvailableSegmentNum2);
                z2 &= (segmentEndTimeUs - representationHolderUpdateSelectedBaseUrl.getSegmentStartTimeUs(lastAvailableSegmentNum2)) + segmentEndTimeUs >= j8;
            }
            boolean z3 = z2;
            long segmentNum2 = getSegmentNum(representationHolderUpdateSelectedBaseUrl, mediaChunk, j, firstAvailableSegmentNum2, lastAvailableSegmentNum2);
            if (segmentNum2 < firstAvailableSegmentNum2) {
                this.fatalError = new BehindLiveWindowException();
                return;
            }
            if (segmentNum2 > lastAvailableSegmentNum2 || (this.missingLastSegment && segmentNum2 >= lastAvailableSegmentNum2)) {
                chunkHolder.endOfStream = z3;
                return;
            }
            if (z3 && representationHolderUpdateSelectedBaseUrl.getSegmentStartTimeUs(segmentNum2) >= j8) {
                chunkHolder.endOfStream = true;
                return;
            }
            int iMin = (int) Math.min(this.maxSegmentsPerLoad, (lastAvailableSegmentNum2 - segmentNum2) + 1);
            if (j8 != C.TIME_UNSET) {
                while (iMin > 1 && representationHolderUpdateSelectedBaseUrl.getSegmentStartTimeUs((((long) iMin) + segmentNum2) - 1) >= j8) {
                    iMin--;
                }
            }
            int i4 = iMin;
            if (list.isEmpty()) {
                j9 = j;
            }
            chunkHolder.chunk = newMediaChunk(representationHolderUpdateSelectedBaseUrl, this.dataSource, this.trackType, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), segmentNum2, i4, j9, nowPeriodTimeUs, isBufferEmpty);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public int getPreferredQueueSize(long j, List<? extends MediaChunk> list) {
        return (this.fatalError != null || this.trackSelection.length() < 2) ? list.size() : this.trackSelection.evaluateQueueSize(j, list);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @RequiresNonNull({"#1.chunkExtractor"})
    public Chunk newInitializationChunk(RepresentationHolder representationHolder, DataSource dataSource, Format format, int i, @Nullable Object obj, @Nullable RangedUri rangedUri, @Nullable RangedUri rangedUri2, @Nullable CmcdData.Factory factory) {
        Representation representation = representationHolder.representation;
        if (rangedUri != null) {
            RangedUri rangedUriAttemptMerge = rangedUri.attemptMerge(rangedUri2, representationHolder.selectedBaseUrl.url);
            if (rangedUriAttemptMerge != null) {
                rangedUri = rangedUriAttemptMerge;
            }
        } else {
            rangedUri = (RangedUri) Assertions.checkNotNull(rangedUri2);
        }
        DataSpec dataSpecBuildDataSpec = DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, rangedUri, 0, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of());
        if (factory != null) {
            dataSpecBuildDataSpec = factory.setObjectType(CmcdData.OBJECT_TYPE_INIT_SEGMENT).createCmcdData().addToDataSpec(dataSpecBuildDataSpec);
        }
        return new InitializationChunk(dataSource, dataSpecBuildDataSpec, format, i, obj, representationHolder.chunkExtractor);
    }

    public Chunk newMediaChunk(RepresentationHolder representationHolder, DataSource dataSource, int i, Format format, int i2, @Nullable Object obj, long j, int i3, long j2, long j3, @Nullable CmcdData.Factory factory) {
        DataSpec dataSpecAddToDataSpec;
        Representation representation = representationHolder.representation;
        long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(j);
        RangedUri segmentUrl = representationHolder.getSegmentUrl(j);
        if (representationHolder.chunkExtractor == null) {
            long segmentEndTimeUs = representationHolder.getSegmentEndTimeUs(j);
            DataSpec dataSpecBuildDataSpec = DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, representationHolder.isSegmentAvailableAtFullNetworkSpeed(j, j3) ? 0 : 8, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of());
            if (factory != null) {
                factory.setChunkDurationUs(segmentEndTimeUs - segmentStartTimeUs);
                Pair<String, String> nextObjectAndRangeRequest = getNextObjectAndRangeRequest(j, segmentUrl, representationHolder);
                if (nextObjectAndRangeRequest != null) {
                    factory.setNextObjectRequest((String) nextObjectAndRangeRequest.first).setNextRangeRequest((String) nextObjectAndRangeRequest.second);
                }
                dataSpecAddToDataSpec = factory.createCmcdData().addToDataSpec(dataSpecBuildDataSpec);
            } else {
                dataSpecAddToDataSpec = dataSpecBuildDataSpec;
            }
            return new SingleSampleMediaChunk(dataSource, dataSpecAddToDataSpec, format, i2, obj, segmentStartTimeUs, segmentEndTimeUs, j, i, format);
        }
        int i4 = 1;
        int i5 = 1;
        while (i4 < i3) {
            RangedUri rangedUriAttemptMerge = segmentUrl.attemptMerge(representationHolder.getSegmentUrl(((long) i4) + j), representationHolder.selectedBaseUrl.url);
            if (rangedUriAttemptMerge == null) {
                break;
            }
            i5++;
            i4++;
            segmentUrl = rangedUriAttemptMerge;
        }
        long j4 = (((long) i5) + j) - 1;
        long segmentEndTimeUs2 = representationHolder.getSegmentEndTimeUs(j4);
        long j5 = representationHolder.periodDurationUs;
        long j6 = C.TIME_UNSET;
        if (j5 != C.TIME_UNSET && j5 <= segmentEndTimeUs2) {
            j6 = j5;
        }
        DataSpec dataSpecBuildDataSpec2 = DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, representationHolder.isSegmentAvailableAtFullNetworkSpeed(j4, j3) ? 0 : 8, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of());
        if (factory != null) {
            factory.setChunkDurationUs(segmentEndTimeUs2 - segmentStartTimeUs);
            Pair<String, String> nextObjectAndRangeRequest2 = getNextObjectAndRangeRequest(j, segmentUrl, representationHolder);
            if (nextObjectAndRangeRequest2 != null) {
                factory.setNextObjectRequest((String) nextObjectAndRangeRequest2.first).setNextRangeRequest((String) nextObjectAndRangeRequest2.second);
            }
            dataSpecBuildDataSpec2 = factory.createCmcdData().addToDataSpec(dataSpecBuildDataSpec2);
        }
        DataSpec dataSpec = dataSpecBuildDataSpec2;
        long j7 = -representation.presentationTimeOffsetUs;
        if (MimeTypes.isImage(format.sampleMimeType)) {
            j7 += segmentStartTimeUs;
        }
        return new ContainerMediaChunk(dataSource, dataSpec, format, i2, obj, segmentStartTimeUs, segmentEndTimeUs2, j2, j6, j, i5, j7, representationHolder.chunkExtractor);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
        ChunkIndex chunkIndex;
        if (chunk instanceof InitializationChunk) {
            int iIndexOf = this.trackSelection.indexOf(((InitializationChunk) chunk).trackFormat);
            RepresentationHolder representationHolder = this.representationHolders[iIndexOf];
            if (representationHolder.segmentIndex == null && (chunkIndex = ((ChunkExtractor) Assertions.checkStateNotNull(representationHolder.chunkExtractor)).getChunkIndex()) != null) {
                this.representationHolders[iIndexOf] = representationHolder.copyWithNewSegmentIndex(new DashWrappingSegmentIndex(chunkIndex, representationHolder.representation.presentationTimeOffsetUs));
            }
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null) {
            playerTrackEmsgHandler.onChunkLoadCompleted(chunk);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean z, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (!z) {
            return false;
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null && playerTrackEmsgHandler.onChunkLoadError(chunk)) {
            return true;
        }
        if (!this.manifest.dynamic && (chunk instanceof MediaChunk)) {
            IOException iOException = loadErrorInfo.exception;
            if ((iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode == 404) {
                RepresentationHolder representationHolder = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
                long segmentCount = representationHolder.getSegmentCount();
                if (segmentCount != -1 && segmentCount != 0) {
                    if (((MediaChunk) chunk).getNextChunkIndex() > (representationHolder.getFirstSegmentNum() + segmentCount) - 1) {
                        this.missingLastSegment = true;
                        return true;
                    }
                }
            }
        }
        RepresentationHolder representationHolder2 = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
        BaseUrl baseUrlSelectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder2.representation.baseUrls);
        if (baseUrlSelectBaseUrl != null && !representationHolder2.selectedBaseUrl.equals(baseUrlSelectBaseUrl)) {
            return true;
        }
        LoadErrorHandlingPolicy.FallbackOptions fallbackOptionsCreateFallbackOptions = createFallbackOptions(this.trackSelection, representationHolder2.representation.baseUrls);
        if ((!fallbackOptionsCreateFallbackOptions.isFallbackAvailable(2) && !fallbackOptionsCreateFallbackOptions.isFallbackAvailable(1)) || (fallbackSelectionFor = loadErrorHandlingPolicy.getFallbackSelectionFor(fallbackOptionsCreateFallbackOptions, loadErrorInfo)) == null || !fallbackOptionsCreateFallbackOptions.isFallbackAvailable(fallbackSelectionFor.type)) {
            return false;
        }
        int i = fallbackSelectionFor.type;
        if (i == 2) {
            ExoTrackSelection exoTrackSelection = this.trackSelection;
            return exoTrackSelection.excludeTrack(exoTrackSelection.indexOf(chunk.trackFormat), fallbackSelectionFor.exclusionDurationMs);
        }
        if (i != 1) {
            return false;
        }
        this.baseUrlExclusionList.exclude(representationHolder2.selectedBaseUrl, fallbackSelectionFor.exclusionDurationMs);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void release() {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            ChunkExtractor chunkExtractor = representationHolder.chunkExtractor;
            if (chunkExtractor != null) {
                chunkExtractor.release();
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long j, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j, chunk, list);
    }

    @Override // androidx.media3.exoplayer.dash.DashChunkSource
    public void updateManifest(DashManifest dashManifest, int i) {
        try {
            this.manifest = dashManifest;
            this.periodIndex = i;
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            ArrayList<Representation> representations = getRepresentations();
            for (int i2 = 0; i2 < this.representationHolders.length; i2++) {
                Representation representation = representations.get(this.trackSelection.getIndexInTrackGroup(i2));
                RepresentationHolder[] representationHolderArr = this.representationHolders;
                representationHolderArr[i2] = representationHolderArr[i2].copyWithNewRepresentation(periodDurationUs, representation);
            }
        } catch (BehindLiveWindowException e) {
            this.fatalError = e;
        }
    }

    @Override // androidx.media3.exoplayer.dash.DashChunkSource
    public void updateTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }
}
