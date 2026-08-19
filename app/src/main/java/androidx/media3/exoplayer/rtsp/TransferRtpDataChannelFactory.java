package androidx.media3.exoplayer.rtsp;

/* JADX INFO: loaded from: classes.dex */
final class TransferRtpDataChannelFactory implements RtpDataChannel.Factory {
    private static final int INTERLEAVED_CHANNELS_PER_TRACK = 2;
    private final long timeoutMs;

    public TransferRtpDataChannelFactory(long j) {
        this.timeoutMs = j;
    }

    @Override // androidx.media3.exoplayer.rtsp.RtpDataChannel.Factory
    public RtpDataChannel createAndOpenDataChannel(int i) {
        TransferRtpDataChannel transferRtpDataChannel = new TransferRtpDataChannel(this.timeoutMs);
        transferRtpDataChannel.open(RtpUtils.getIncomingRtpDataSpec(i * 2));
        return transferRtpDataChannel;
    }

    @Override // androidx.media3.exoplayer.rtsp.RtpDataChannel.Factory
    public final /* synthetic */ RtpDataChannel.Factory createFallbackDataChannelFactory() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
    }
}
