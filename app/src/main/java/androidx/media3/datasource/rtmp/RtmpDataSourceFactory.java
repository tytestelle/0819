package androidx.media3.datasource.rtmp;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.TransferListener;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
@Deprecated
public final class RtmpDataSourceFactory implements DataSource.Factory {

    @Nullable
    private final TransferListener listener;

    public RtmpDataSourceFactory() {
        this(null);
    }

    public RtmpDataSourceFactory(@Nullable TransferListener transferListener) {
        this.listener = transferListener;
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    public RtmpDataSource createDataSource() {
        RtmpDataSource rtmpDataSource = new RtmpDataSource();
        TransferListener transferListener = this.listener;
        if (transferListener != null) {
            rtmpDataSource.addTransferListener(transferListener);
        }
        return rtmpDataSource;
    }
}
