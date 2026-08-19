package xyz.doikki.videoplayer.ijk;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

/* JADX INFO: loaded from: classes2.dex */
public class RawDataSourceProvider implements IMediaDataSource {
    private AssetFileDescriptor mDescriptor;
    private byte[] mMediaBytes;

    public RawDataSourceProvider(AssetFileDescriptor assetFileDescriptor) {
        this.mDescriptor = assetFileDescriptor;
    }

    public static RawDataSourceProvider create(Context context, Uri uri) {
        try {
            return new RawDataSourceProvider(context.getContentResolver().openAssetFileDescriptor(uri, "r"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private byte[] readBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public void close() throws IOException {
        AssetFileDescriptor assetFileDescriptor = this.mDescriptor;
        if (assetFileDescriptor != null) {
            assetFileDescriptor.close();
        }
        this.mDescriptor = null;
        this.mMediaBytes = null;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public long getSize() {
        long length = this.mDescriptor.getLength();
        if (this.mMediaBytes == null) {
            this.mMediaBytes = readBytes(this.mDescriptor.createInputStream());
        }
        return length;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) {
        long j2 = 1 + j;
        byte[] bArr2 = this.mMediaBytes;
        if (j2 >= bArr2.length) {
            return -1;
        }
        if (((long) i2) + j >= bArr2.length) {
            int length = (int) (((long) bArr2.length) - j);
            if (length > bArr.length) {
                length = bArr.length;
            }
            i2 = length - 1;
        }
        System.arraycopy(bArr2, (int) j, bArr, i, i2);
        return i2;
    }
}
