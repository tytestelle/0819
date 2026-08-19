package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ByteArrayDataSource extends BaseDataSource {
    private int bytesRemaining;

    @Nullable
    private byte[] data;
    private boolean opened;
    private int readPosition;

    @Nullable
    private Uri uri;
    private final UriResolver uriResolver;

    public interface UriResolver {
        byte[] resolve(Uri uri);
    }

    public ByteArrayDataSource(final byte[] bArr) {
        this(new UriResolver() { // from class: androidx.media3.datasource.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
            @Override // androidx.media3.datasource.ByteArrayDataSource.UriResolver
            public final byte[] resolve(Uri uri) {
                return ByteArrayDataSource.lambda$new$0(bArr, uri);
            }
        });
        Assertions.checkArgument(bArr.length > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$new$0(byte[] bArr, Uri uri) {
        return bArr;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.uri = null;
        this.data = null;
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws DataSourceException {
        transferInitializing(dataSpec);
        Uri uri = dataSpec.uri;
        this.uri = uri;
        byte[] bArrResolve = this.uriResolver.resolve(uri);
        this.data = bArrResolve;
        long j = dataSpec.position;
        if (j > bArrResolve.length) {
            throw new DataSourceException(2008);
        }
        this.readPosition = (int) j;
        int length = bArrResolve.length - ((int) j);
        this.bytesRemaining = length;
        long j2 = dataSpec.length;
        if (j2 != -1) {
            this.bytesRemaining = (int) Math.min(length, j2);
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j3 = dataSpec.length;
        return j3 != -1 ? j3 : this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.bytesRemaining;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(Assertions.checkStateNotNull(this.data), this.readPosition, bArr, i, iMin);
        this.readPosition += iMin;
        this.bytesRemaining -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }

    public ByteArrayDataSource(UriResolver uriResolver) {
        super(false);
        this.uriResolver = (UriResolver) Assertions.checkNotNull(uriResolver);
    }
}
