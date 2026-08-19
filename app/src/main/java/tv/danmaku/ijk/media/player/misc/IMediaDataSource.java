package tv.danmaku.ijk.media.player.misc;

/* JADX INFO: loaded from: classes2.dex */
public interface IMediaDataSource {
    void close();

    long getSize();

    int readAt(long j, byte[] bArr, int i, int i2);
}
