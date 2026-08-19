package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoInfo;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private final MediaCodec codec;

    @Nullable
    private final LoudnessCodecController loudnessCodecController;

    public static class Factory implements MediaCodecAdapter.Factory {
        /* JADX WARN: Code duplicated, block: B:22:0x0045  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter$1] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        @SuppressLint({"WrongConstant"})
        public MediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecCreateCodec = createCodec(configuration);
                try {
                    TraceUtil.beginSection("configureCodec");
                    Surface surface = configuration.surface;
                    mediaCodecCreateCodec.configure(configuration.mediaFormat, surface, configuration.crypto, (surface == null && configuration.codecInfo.detachedSurfaceSupported && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    TraceUtil.endSection();
                    TraceUtil.beginSection("startCodec");
                    mediaCodecCreateCodec.start();
                    TraceUtil.endSection();
                    return new SynchronousMediaCodecAdapter(mediaCodecCreateCodec, configuration.loudnessCodecController);
                } catch (IOException e) {
                    e = e;
                    mediaCodec = mediaCodecCreateCodec;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    mediaCodec = mediaCodecCreateCodec;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (RuntimeException e4) {
                e = e4;
            }
        }

        public MediaCodec createCodec(MediaCodecAdapter.Configuration configuration) throws IOException {
            Assertions.checkNotNull(configuration.codecInfo);
            String str = configuration.codecInfo.name;
            TraceUtil.beginSection("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            TraceUtil.endSection();
            return mediaCodecCreateByCodecName;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFrameRenderedListener$0(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j, long j2) {
        onFrameRenderedListener.onFrameRendered(this, j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        return this.codec.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(35)
    public void detachOutputSurface() {
        this.codec.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.codec.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getInputBuffer(int i) {
        return this.codec.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(26)
    public PersistableBundle getMetrics() {
        return this.codec.getMetrics();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getOutputBuffer(int i) {
        return this.codec.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public MediaFormat getOutputFormat() {
        return this.codec.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.codec.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i, int i2, CryptoInfo cryptoInfo, long j, int i3) {
        this.codec.queueSecureInputBuffer(i, i2, cryptoInfo.getFrameworkCryptoInfo(), j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final /* synthetic */ boolean registerOnBufferAvailableListener(MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, onBufferAvailableListener);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        LoudnessCodecController loudnessCodecController;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                this.codec.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
                loudnessCodecController.removeMediaCodec(this.codec);
            }
            this.codec.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, boolean z) {
        this.codec.releaseOutputBuffer(i, z);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(23)
    public void setOnFrameRenderedListener(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, onFrameRenderedListener, 1), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(23)
    public void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i) {
        this.codec.setVideoScalingMode(i);
    }

    private SynchronousMediaCodecAdapter(MediaCodec mediaCodec, @Nullable LoudnessCodecController loudnessCodecController) {
        this.codec = mediaCodec;
        this.loudnessCodecController = loudnessCodecController;
        if (Build.VERSION.SDK_INT < 35 || loudnessCodecController == null) {
            return;
        }
        loudnessCodecController.addMediaCodec(mediaCodec);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, long j) {
        this.codec.releaseOutputBuffer(i, j);
    }
}
