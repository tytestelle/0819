package androidx.media3.exoplayer.hls.offline;

import android.net.Uri;
import androidx.arch.core.executor.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class HlsDownloader extends SegmentDownloader<HlsPlaylist> {

    public static final class Factory extends SegmentDownloader.BaseFactory<HlsPlaylist> {
        public Factory(CacheDataSource.Factory factory) {
            super(factory, new HlsPlaylistParser());
        }

        @CanIgnoreReturnValue
        public Factory setManifestParser(HlsPlaylistParser hlsPlaylistParser) {
            this.manifestParser = hlsPlaylistParser;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public HlsDownloader create(MediaItem mediaItem) {
            return new HlsDownloader(mediaItem, this.manifestParser, this.cacheDataSourceFactory, this.executor, this.maxMergedSegmentStartTimeDiffMs, this.startPositionUs, this.durationUs);
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

    private void addMediaPlaylistDataSpecs(List<Uri> list, List<DataSpec> list2) {
        for (int i = 0; i < list.size(); i++) {
            list2.add(SegmentDownloader.getCompressibleDataSpec(list.get(i)));
        }
    }

    private void addSegment(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist.Segment segment, HashSet<Uri> hashSet, ArrayList<SegmentDownloader.Segment> arrayList) {
        String str = hlsMediaPlaylist.baseUri;
        long j = hlsMediaPlaylist.startTimeUs + segment.relativeStartTimeUs;
        String str2 = segment.fullSegmentEncryptionKeyUri;
        if (str2 != null) {
            Uri uriResolveToUri = UriUtil.resolveToUri(str, str2);
            if (hashSet.add(uriResolveToUri)) {
                arrayList.add(new SegmentDownloader.Segment(j, SegmentDownloader.getCompressibleDataSpec(uriResolveToUri)));
            }
        }
        arrayList.add(new SegmentDownloader.Segment(j, new DataSpec(UriUtil.resolveToUri(str, segment.url), segment.byteRangeOffset, segment.byteRangeLength)));
    }

    @Deprecated
    public HlsDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(2));
    }

    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, HlsPlaylist hlsPlaylist, boolean z) throws IOException {
        Iterator it;
        HlsDownloader hlsDownloader;
        HlsDownloader hlsDownloader2;
        HlsDownloader hlsDownloader3 = this;
        ArrayList arrayList = new ArrayList();
        if (hlsPlaylist instanceof HlsMultivariantPlaylist) {
            hlsDownloader3.addMediaPlaylistDataSpecs(((HlsMultivariantPlaylist) hlsPlaylist).mediaPlaylistUrls, arrayList);
        } else {
            arrayList.add(SegmentDownloader.getCompressibleDataSpec(Uri.parse(hlsPlaylist.baseUri)));
        }
        ArrayList<SegmentDownloader.Segment> arrayList2 = new ArrayList<>();
        HashSet<Uri> hashSet = new HashSet<>();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            DataSpec dataSpec = (DataSpec) it2.next();
            arrayList2.add(new SegmentDownloader.Segment(0L, dataSpec));
            try {
                HlsMediaPlaylist hlsMediaPlaylist = (HlsMediaPlaylist) hlsDownloader3.getManifest(dataSource, dataSpec, z);
                List<HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.segments;
                long j = z == 0 ? hlsDownloader3.startPositionUs : 0L;
                long j2 = z ? C.TIME_UNSET : hlsDownloader3.durationUs;
                HlsMediaPlaylist.Segment segment = null;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        it = it2;
                        hlsDownloader = hlsDownloader3;
                        break;
                    }
                    HlsMediaPlaylist.Segment segment2 = list.get(i);
                    it = it2;
                    HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
                    long j3 = hlsMediaPlaylist.startTimeUs + segment2.relativeStartTimeUs;
                    if (segment2.durationUs + j3 > j) {
                        if (j2 != C.TIME_UNSET && j3 >= j + j2) {
                            hlsDownloader = this;
                            break;
                        }
                        HlsMediaPlaylist.Segment segment3 = segment2.initializationSegment;
                        if (segment3 == null || segment3 == segment) {
                            hlsDownloader2 = this;
                        } else {
                            hlsDownloader2 = this;
                            hlsDownloader2.addSegment(hlsMediaPlaylist2, segment3, hashSet, arrayList2);
                            segment = segment3;
                        }
                        hlsDownloader2.addSegment(hlsMediaPlaylist2, segment2, hashSet, arrayList2);
                    } else {
                        hlsDownloader2 = this;
                    }
                    i++;
                    hlsDownloader3 = hlsDownloader2;
                    hlsMediaPlaylist = hlsMediaPlaylist2;
                    it2 = it;
                }
            } catch (IOException e) {
                it = it2;
                hlsDownloader = hlsDownloader3;
                if (!z) {
                    throw e;
                }
            }
            hlsDownloader3 = hlsDownloader;
            it2 = it;
        }
        return arrayList2;
    }

    @Deprecated
    public HlsDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, new HlsPlaylistParser(), factory, executor, 20000L, 0L, C.TIME_UNSET);
    }

    private HlsDownloader(MediaItem mediaItem, ParsingLoadable.Parser<HlsPlaylist> parser, CacheDataSource.Factory factory, Executor executor, long j, long j2, long j3) {
        super(mediaItem, parser, factory, executor, j, j2, j3);
    }
}
