package androidx.media3.exoplayer.dash.offline;

import androidx.annotation.Nullable;
import androidx.arch.core.executor.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.dash.BaseUrlExclusionList;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.media3.exoplayer.dash.DashUtil;
import androidx.media3.exoplayer.dash.DashWrappingSegmentIndex;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.offline.DownloadException;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.ChunkIndex;
import com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DashDownloader extends SegmentDownloader<DashManifest> {
    private final BaseUrlExclusionList baseUrlExclusionList;

    public static final class Factory extends SegmentDownloader.BaseFactory<DashManifest> {
        public Factory(CacheDataSource.Factory factory) {
            super(factory, new DashManifestParser());
        }

        @CanIgnoreReturnValue
        public Factory setManifestParser(DashManifestParser dashManifestParser) {
            this.manifestParser = dashManifestParser;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public DashDownloader create(MediaItem mediaItem) {
            return new DashDownloader(mediaItem, this.manifestParser, this.cacheDataSourceFactory, this.executor, this.maxMergedSegmentStartTimeDiffMs, this.startPositionUs, this.durationUs);
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        @CanIgnoreReturnValue
        public Factory setDurationUs(long j) {
            super.setDurationUs(j);
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        @CanIgnoreReturnValue
        public Factory setExecutor(Executor executor) {
            super.setExecutor(executor);
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        @CanIgnoreReturnValue
        public Factory setMaxMergedSegmentStartTimeDiffMs(long j) {
            super.setMaxMergedSegmentStartTimeDiffMs(j);
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        @CanIgnoreReturnValue
        public Factory setStartPositionUs(long j) {
            super.setStartPositionUs(j);
            return this;
        }
    }

    private void addSegmentsForAdaptationSet(DataSource dataSource, AdaptationSet adaptationSet, long j, long j2, boolean z, ArrayList<SegmentDownloader.Segment> arrayList) throws IOException {
        for (int i = 0; i < adaptationSet.representations.size(); i++) {
            Representation representation = adaptationSet.representations.get(i);
            try {
                try {
                    DashSegmentIndex segmentIndex = getSegmentIndex(dataSource, adaptationSet.type, representation, z);
                    if (segmentIndex == null) {
                        throw new DownloadException("Missing segment index");
                    }
                    long segmentCount = segmentIndex.getSegmentCount(j2);
                    if (segmentCount == -1) {
                        throw new DownloadException("Unbounded segment index");
                    }
                    String str = ((BaseUrl) Util.castNonNull(this.baseUrlExclusionList.selectBaseUrl(representation.baseUrls))).url;
                    RangedUri initializationUri = representation.getInitializationUri();
                    if (initializationUri != null) {
                        arrayList.add(createSegment(representation, str, j, initializationUri));
                    }
                    RangedUri indexUri = representation.getIndexUri();
                    if (indexUri != null) {
                        arrayList.add(createSegment(representation, str, j, indexUri));
                    }
                    long j3 = this.startPositionUs - j;
                    long j4 = this.durationUs;
                    long j5 = j4 != C.TIME_UNSET ? j4 + j3 : -9223372036854775807L;
                    long firstSegmentNum = (z || j3 <= 0) ? segmentIndex.getFirstSegmentNum() : segmentIndex.getSegmentNum(j3, j2);
                    long firstSegmentNum2 = (j5 == C.TIME_UNSET || z || j5 >= j + j2) ? (segmentIndex.getFirstSegmentNum() + segmentCount) - 1 : segmentIndex.getSegmentNum(j5, j2);
                    for (long j6 = firstSegmentNum; j6 <= firstSegmentNum2; j6++) {
                        arrayList.add(createSegment(representation, str, segmentIndex.getTimeUs(j6) + j, segmentIndex.getSegmentUrl(j6)));
                    }
                } catch (IOException e) {
                    e = e;
                    if (!z) {
                        throw e;
                    }
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
    }

    private SegmentDownloader.Segment createSegment(Representation representation, String str, long j, RangedUri rangedUri) {
        return new SegmentDownloader.Segment(j, DashUtil.buildDataSpec(representation, str, rangedUri, 0, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of()));
    }

    @Nullable
    private DashSegmentIndex getSegmentIndex(final DataSource dataSource, final int i, final Representation representation, boolean z) {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex chunkIndex = (ChunkIndex) execute(new RunnableFutureTask<ChunkIndex, IOException>() { // from class: androidx.media3.exoplayer.dash.offline.DashDownloader.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.common.util.RunnableFutureTask
            public ChunkIndex doWork() {
                return DashUtil.loadChunkIndex(dataSource, i, representation);
            }
        }, z);
        if (chunkIndex == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(chunkIndex, representation.presentationTimeOffsetUs);
    }

    @Deprecated
    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(2));
    }

    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, DashManifest dashManifest, boolean z) throws IOException {
        ArrayList<SegmentDownloader.Segment> arrayList = new ArrayList<>();
        for (int i = 0; i < dashManifest.getPeriodCount(); i++) {
            Period period = dashManifest.getPeriod(i);
            long jMsToUs = Util.msToUs(period.startMs);
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            if (periodDurationUs == C.TIME_UNSET || jMsToUs + periodDurationUs > this.startPositionUs) {
                long j = this.durationUs;
                if (j != C.TIME_UNSET && jMsToUs >= this.startPositionUs + j) {
                    break;
                }
                int i2 = 0;
                for (List<AdaptationSet> list = period.adaptationSets; i2 < list.size(); list = list) {
                    addSegmentsForAdaptationSet(dataSource, list.get(i2), jMsToUs, periodDurationUs, z, arrayList);
                    i2++;
                }
            }
        }
        return arrayList;
    }

    @Deprecated
    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, new DashManifestParser(), factory, executor, 20000L, 0L, C.TIME_UNSET);
    }

    private DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor, long j, long j2, long j3) {
        super(mediaItem, parser, factory, executor, j, j2, j3);
        this.baseUrlExclusionList = new BaseUrlExclusionList();
    }
}
