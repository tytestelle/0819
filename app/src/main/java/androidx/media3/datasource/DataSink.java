package androidx.media3.datasource;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface DataSink {

    public interface Factory {
        DataSink createDataSink();
    }

    void close();

    void open(DataSpec dataSpec);

    void write(byte[] bArr, int i, int i2);
}
