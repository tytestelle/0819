package androidx.media3.exoplayer.offline;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface SegmentDownloaderFactory {
    SegmentDownloader<?> create(MediaItem mediaItem);

    SegmentDownloaderFactory setDurationUs(long j);

    SegmentDownloaderFactory setExecutor(Executor executor);

    SegmentDownloaderFactory setMaxMergedSegmentStartTimeDiffMs(long j);

    SegmentDownloaderFactory setStartPositionUs(long j);
}
