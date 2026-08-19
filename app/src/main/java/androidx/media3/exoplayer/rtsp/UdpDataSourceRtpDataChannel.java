package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.datasource.UdpDataSource;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class UdpDataSourceRtpDataChannel implements RtpDataChannel {
    private static final String DEFAULT_UDP_TRANSPORT_FORMAT = "RTP/AVP;unicast;client_port=%d-%d";
    private final UdpDataSource dataSource;

    @Nullable
    private UdpDataSourceRtpDataChannel rtcpChannel;

    public UdpDataSourceRtpDataChannel(long j) {
        this.dataSource = new UdpDataSource(2000, com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(j));
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        this.dataSource.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.dataSource.close();
        UdpDataSourceRtpDataChannel udpDataSourceRtpDataChannel = this.rtcpChannel;
        if (udpDataSourceRtpDataChannel != null) {
            udpDataSourceRtpDataChannel.close();
        }
    }

    @Override // androidx.media3.exoplayer.rtsp.RtpDataChannel
    @Nullable
    public RtspMessageChannel.InterleavedBinaryDataListener getInterleavedBinaryDataListener() {
        return null;
    }

    @Override // androidx.media3.exoplayer.rtsp.RtpDataChannel
    public int getLocalPort() {
        int localPort = this.dataSource.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // androidx.media3.datasource.DataSource
    public final /* synthetic */ Map getResponseHeaders() {
        return androidx.media3.datasource.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
    }

    @Override // androidx.media3.exoplayer.rtsp.RtpDataChannel
    public String getTransport() {
        int localPort = getLocalPort();
        Assertions.checkState(localPort != -1);
        return Util.formatInvariant(DEFAULT_UDP_TRANSPORT_FORMAT, Integer.valueOf(localPort), Integer.valueOf(localPort + 1));
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.dataSource.getUri();
    }

    @Override // androidx.media3.exoplayer.rtsp.RtpDataChannel
    public boolean needsClosingOnLoadCompletion() {
        return true;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        return this.dataSource.open(dataSpec);
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws UdpDataSource.UdpDataSourceException {
        try {
            return this.dataSource.read(bArr, i, i2);
        } catch (UdpDataSource.UdpDataSourceException e) {
            if (e.reason == 2002) {
                return -1;
            }
            throw e;
        }
    }

    public void setRtcpChannel(UdpDataSourceRtpDataChannel udpDataSourceRtpDataChannel) {
        Assertions.checkArgument(this != udpDataSourceRtpDataChannel);
        this.rtcpChannel = udpDataSourceRtpDataChannel;
    }
}
