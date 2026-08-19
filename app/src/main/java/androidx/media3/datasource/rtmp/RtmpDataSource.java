package androidx.media3.datasource.rtmp;

import O0000o0O0OOoooOOOo0oOoOOO0oOO0O0oO0o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.BaseDataSource;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.antmedia.rtmp_client.RtmpClient;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class RtmpDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ int f2312O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    @Nullable
    private RtmpClient rtmpClient;

    @Nullable
    private Uri uri;

    public static final class Factory implements DataSource.Factory {

        @Nullable
        private TransferListener transferListener;

        @CanIgnoreReturnValue
        public Factory setTransferListener(@Nullable TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public RtmpDataSource createDataSource() {
            RtmpDataSource rtmpDataSource = new RtmpDataSource();
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                rtmpDataSource.addTransferListener(transferListener);
            }
            return rtmpDataSource;
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.datasource.rtmp");
    }

    public RtmpDataSource() {
        super(true);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.uri != null) {
            this.uri = null;
            transferEnded();
        }
        RtmpClient rtmpClient = this.rtmpClient;
        if (rtmpClient != null) {
            rtmpClient.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            this.rtmpClient = null;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
        transferInitializing(dataSpec);
        RtmpClient rtmpClient = new RtmpClient();
        rtmpClient.f3986O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0L;
        this.rtmpClient = rtmpClient;
        rtmpClient.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(dataSpec.uri.toString());
        this.uri = dataSpec.uri;
        transferStarted(dataSpec);
        return -1L;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((RtmpClient) Util.castNonNull(this.rtmpClient)).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bArr, i, i2);
        if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == -1) {
            return -1;
        }
        bytesTransferred(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        return iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }
}
