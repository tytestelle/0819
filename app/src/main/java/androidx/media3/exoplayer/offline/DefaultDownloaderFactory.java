package androidx.media3.exoplayer.offline;

import android.util.SparseArray;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.dash.offline.DashDownloader;
import androidx.media3.exoplayer.hls.offline.HlsDownloader;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultDownloaderFactory implements DownloaderFactory {
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final Executor executor;
    private final SparseArray<SegmentDownloaderFactory> segmentDownloaderFactories;

    @Deprecated
    public DefaultDownloaderFactory(CacheDataSource.Factory factory) {
        this(factory, new androidx.arch.core.executor.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(2));
    }

    private Downloader createSegmentDownloader(DownloadRequest downloadRequest, int i) {
        SegmentDownloaderFactory segmentDownloaderFactory = getSegmentDownloaderFactory(i, this.cacheDataSourceFactory);
        MediaItem mediaItemBuild = new MediaItem.Builder().setUri(downloadRequest.uri).setStreamKeys(downloadRequest.streamKeys).setCustomCacheKey(downloadRequest.customCacheKey).build();
        DownloadRequest.TimeRange timeRange = downloadRequest.timeRange;
        if (timeRange != null) {
            segmentDownloaderFactory.setStartPositionUs(timeRange.startPositionUs).setDurationUs(downloadRequest.timeRange.durationUs);
        }
        return segmentDownloaderFactory.setExecutor(this.executor).create(mediaItemBuild);
    }

    private static SegmentDownloaderFactory createSegmentDownloaderFactory(Class<? extends SegmentDownloaderFactory> cls, CacheDataSource.Factory factory) {
        try {
            return cls.getConstructor(CacheDataSource.Factory.class).newInstance(factory);
        } catch (Exception e) {
            throw new IllegalStateException("Downloader factory missing", e);
        }
    }

    private SegmentDownloaderFactory getSegmentDownloaderFactory(int i, CacheDataSource.Factory factory) {
        if (Util.contains(this.segmentDownloaderFactories, i)) {
            return this.segmentDownloaderFactories.get(i);
        }
        try {
            return loadSegmentDownloaderFactory(i, factory);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Module missing for content type "), e);
        }
    }

    private SegmentDownloaderFactory loadSegmentDownloaderFactory(int i, CacheDataSource.Factory factory) {
        SegmentDownloaderFactory segmentDownloaderFactoryCreateSegmentDownloaderFactory;
        if (i == 0) {
            segmentDownloaderFactoryCreateSegmentDownloaderFactory = createSegmentDownloaderFactory(DashDownloader.Factory.class.asSubclass(SegmentDownloaderFactory.class), factory);
        } else if (i == 1) {
            segmentDownloaderFactoryCreateSegmentDownloaderFactory = createSegmentDownloaderFactory(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader$Factory").asSubclass(SegmentDownloaderFactory.class), factory);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Unsupported type: "));
            }
            segmentDownloaderFactoryCreateSegmentDownloaderFactory = createSegmentDownloaderFactory(HlsDownloader.Factory.class.asSubclass(SegmentDownloaderFactory.class), factory);
        }
        this.segmentDownloaderFactories.put(i, segmentDownloaderFactoryCreateSegmentDownloaderFactory);
        return segmentDownloaderFactoryCreateSegmentDownloaderFactory;
    }

    @Override // androidx.media3.exoplayer.offline.DownloaderFactory
    public Downloader createDownloader(DownloadRequest downloadRequest) {
        int iInferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(downloadRequest.uri, downloadRequest.mimeType);
        if (iInferContentTypeForUriAndMimeType == 0 || iInferContentTypeForUriAndMimeType == 1 || iInferContentTypeForUriAndMimeType == 2) {
            return createSegmentDownloader(downloadRequest, iInferContentTypeForUriAndMimeType);
        }
        if (iInferContentTypeForUriAndMimeType != 4) {
            throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iInferContentTypeForUriAndMimeType, "Unsupported type: "));
        }
        DownloadRequest.ByteRange byteRange = downloadRequest.byteRange;
        return new ProgressiveDownloader(new MediaItem.Builder().setUri(downloadRequest.uri).setCustomCacheKey(downloadRequest.customCacheKey).build(), this.cacheDataSourceFactory, this.executor, byteRange != null ? byteRange.offset : 0L, byteRange != null ? byteRange.length : -1L);
    }

    public DefaultDownloaderFactory(CacheDataSource.Factory factory, Executor executor) {
        this.cacheDataSourceFactory = (CacheDataSource.Factory) Assertions.checkNotNull(factory);
        this.executor = (Executor) Assertions.checkNotNull(executor);
        this.segmentDownloaderFactories = new SparseArray<>();
    }
}
