package androidx.media3.exoplayer.offline;

import androidx.annotation.WorkerThread;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@WorkerThread
@UnstableApi
public interface WritableDownloadIndex extends DownloadIndex {
    void putDownload(Download download);

    void removeDownload(String str);

    void setDownloadingStatesToQueued();

    void setStatesToRemoving();

    void setStopReason(int i);

    void setStopReason(String str, int i);
}
